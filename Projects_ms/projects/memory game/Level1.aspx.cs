using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.Script.Serialization;

public partial class _Default : System.Web.UI.Page
{
    int _gameLevel = 1;
    LevelObject _levelObject = new LevelObject(1);
    List<String> _buttonIdsToUnflip = new List<String>();
    List<String> _permanentlyFlipped = new List<String>();
    String _userName;
    int _noOfClicks;
    int _score;
    int _noOfPictureSets;
    SavedGame _savedGame;
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            if (this.Session["savedGame"] != null)
            {
                _savedGame = (SavedGame)this.Session["savedGame"];
                loadGameFromSave(_savedGame);
            }
            else
            {
                _levelObject.IntializeGame();
                _userName = (String)this.Session["userName"];
                _savedGame = new SavedGame(_levelObject, _buttonIdsToUnflip, _permanentlyFlipped, _gameLevel + "", lbltimer.Text, _noOfClicks + "", _noOfPictureSets + "", _score + "", _userName, HttpContext.Current.Request.RawUrl);
                this.Session["savedGame"] = _savedGame;
            }
        }
        else
        {
            if (this.Session["savedGame"] != null)
            {
                _savedGame = (SavedGame)this.Session["savedGame"];
                loadGameFromSave(_savedGame);
            }
        }
    }

    protected void loadGameFromSave(SavedGame savedGame) 
    {
        _levelObject = savedGame._levelObject;
        _buttonIdsToUnflip = savedGame._buttonIdsToUnflip;
        _permanentlyFlipped = savedGame._permanentlyFlipped;
        _userName = savedGame._userName;
        _noOfClicks = Convert.ToInt32(savedGame._noOfClicks);
        _noOfPictureSets = Convert.ToInt32(savedGame._noOfPictureSets);
        _score = Convert.ToInt32(savedGame._score);
        if (ScriptManager.GetCurrent(this).AsyncPostBackSourceElementID == "Timer1")
            lbltimer.Text = Convert.ToInt32(savedGame._timer)+1+"";
        else
            lbltimer.Text = savedGame._timer;
        savedGame._timer = lbltimer.Text;
        if (_buttonIdsToUnflip.Count>0)
        {
            foreach (String buttonID in _buttonIdsToUnflip)
            {
                flipButton(buttonID);
            }
        }
        if (_permanentlyFlipped.Count > 0)
        {
            foreach (String buttonID in _permanentlyFlipped)
            {
                flipButton(buttonID);
            }
        }
        //(100*L2 – T – 10*C)*P
        _score = ((100 * (_gameLevel * _gameLevel)) - Convert.ToInt32(savedGame._timer) - 10 * _noOfClicks)*_noOfPictureSets;
        savedGame._score = _score+"";
        lblScore.Text = _score + "";
        _savedGame = savedGame;
    }

    protected void flipButton(String buttonId) 
    {
        String imageNameForButton = _levelObject.buttonImageNames[buttonId];
        ImageButton button = (ImageButton)this.FindControl(buttonId);
        button.ImageUrl = "~/Image/" + imageNameForButton + ".jpg";
    }

    protected void ImageButtonClick(object sender, ImageClickEventArgs e)
    {
        ImageButton clickedButton = (ImageButton)sender;
        _noOfClicks++;
        lblNoOfClicks.Text = _noOfClicks + "";
        if (!_buttonIdsToUnflip.Contains(clickedButton.ID))
        {
            _buttonIdsToUnflip.Add(clickedButton.ID);
            String imageNameForButton = _levelObject.buttonImageNames[clickedButton.ID];
            clickedButton.ImageUrl = "~/Image/" + imageNameForButton + ".jpg";
            if (_buttonIdsToUnflip.Count > 1 && !_levelObject.images[imageNameForButton].buttonNames.Contains(_buttonIdsToUnflip[_buttonIdsToUnflip.Count - 2]))
            {
                ResetHidden.Value = "true";
            }
            else if (_buttonIdsToUnflip.Count > _gameLevel)
            {
                ResetHidden.Value = "false";
                _permanentlyFlipped.AddRange(_buttonIdsToUnflip);
                _noOfPictureSets++;
                _buttonIdsToUnflip.Clear();
            }
            _savedGame = new SavedGame(_levelObject, _buttonIdsToUnflip, _permanentlyFlipped, _gameLevel + "", lbltimer.Text, _noOfClicks + "", _noOfPictureSets + "", _score + "", _userName, HttpContext.Current.Request.RawUrl);
            this.Session["savedGame"] = _savedGame;
        }       
    }

    protected void saveClick(object sender, EventArgs e)
    {
        HttpCookie saveGameCookie = new HttpCookie(_userName + "SaveGame");

        String saveGameJson = "";
        String Url = HttpContext.Current.Request.RawUrl;
        SavedGame savedGame = new SavedGame(_levelObject, _buttonIdsToUnflip, _permanentlyFlipped, _gameLevel + "", lbltimer.Text, _noOfClicks + "", _noOfPictureSets + "", _score + "", _userName, HttpContext.Current.Request.RawUrl);
        saveGameJson = new JavaScriptSerializer().Serialize((Object)savedGame);
        saveGameCookie.Value = saveGameJson;
        Response.SetCookie(saveGameCookie);
    }
    
    protected void ResetHidden_ValueChanged(object sender, EventArgs e)
    {   
        for (int i = 0; i < _buttonIdsToUnflip.Count; i++)
        {
            ImageButton button = (ImageButton)this.FindControl(_buttonIdsToUnflip[i]);
            button.ImageUrl = "~/Image/dark.jpg";
        }
        ResetHidden.Value = "false";
        _buttonIdsToUnflip.Clear();
        _savedGame = new SavedGame(_levelObject, _buttonIdsToUnflip, _permanentlyFlipped, _gameLevel + "", lbltimer.Text, _noOfClicks + "", _noOfPictureSets + "", _score + "", _userName, HttpContext.Current.Request.RawUrl);
        this.Session["savedGame"] = _savedGame;
    }
}
