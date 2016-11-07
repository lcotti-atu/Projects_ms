using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for Class1
/// </summary>
public class Image
{
    public String Url { get; set; }
    public List<String> buttonNames { get; set; }
    public String imageName { get; set; }
	public Image()
	{
        this.Url = "~/Image/dark.jpg";
	}
    public Image(String ImageUrl)
    {
        this.Url = ImageUrl;
    }
    public Image(String ImageUrl, String imageName)
    {
        this.Url = ImageUrl;
        this.imageName = imageName;
    }
    public Image(String ImageUrl, String imageName, List<String> buttonNames)
    {
        this.Url = ImageUrl;
        this.imageName = imageName;
        this.buttonNames = buttonNames;
    }
}