using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for Cell
/// </summary>
public class Cell
{
    public string ImageUrl { get; set; }
    public string ButtonName { get; set; }
    public Boolean flipped { get; set; }
	public Cell()
	{
        ImageUrl = "~/Image/dark.jpg";
	}
    public Cell(string a, string b)
    {
        ImageUrl = a;
        ButtonName = b; 
    }
}