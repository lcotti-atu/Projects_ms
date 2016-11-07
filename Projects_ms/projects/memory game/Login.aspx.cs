using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.Script.Serialization;

public partial class Login : System.Web.UI.Page
{
    SavedGame saveGame = new SavedGame();
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {   
        if(TextBox1.Text!="")
        {
            this.Session["userName"] = TextBox1.Text;
            if (Request.Cookies[TextBox1.Text + "SaveGame"] != null)
            {
                saveGame = (SavedGame)new JavaScriptSerializer().Deserialize(Request.Cookies[TextBox1.Text + "SaveGame"].Value, saveGame.GetType());
                this.Session["savedGame"] = saveGame;
                Response.Redirect(saveGame._URL);
            }
            else 
            {
                Response.Redirect("http://localhost:1580/memory%20game/Level2.aspx");
            }
        }        
    }
    
}