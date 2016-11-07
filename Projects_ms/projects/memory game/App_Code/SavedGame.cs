using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for SaveGame
/// </summary>
public class SavedGame
{
    public LevelObject _levelObject {get ; set; }
    public List<String> _buttonIdsToUnflip { get; set; }
    public List<String> _permanentlyFlipped { get; set; }
    public String _gameLevel { get; set; }
    public String _timer { get; set; }
    public String _noOfClicks { get; set; }
    public String _score { get; set; }
    public String _userName { get; set; }
    public String _URL { get; set; }
    public String _noOfPictureSets { get; set; } 
	public SavedGame()
	{
		//
		// TODO: Add constructor logic here
		//
	}
    public SavedGame(LevelObject levelObject, List<String> buttonIdsToUnflip, List<String> permanentlyFlipped, String gameLevel, String timer, String noOfClicks, String noOfPictureSets,String score, String userName, String URL)
    {
        this._levelObject = levelObject;
        this._buttonIdsToUnflip = buttonIdsToUnflip;
        this._permanentlyFlipped = permanentlyFlipped;
        this._gameLevel = gameLevel;
        this._timer = timer;
        this._noOfClicks = noOfClicks;
        this._noOfPictureSets = noOfPictureSets;
        this._score = score;
        this._userName = userName;
        this._URL = URL;
    }
}