using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for Generation
/// </summary>
public class Generation
{
    public string Pic { get; set; }
    public string First { get; set; }
    public string Second { get; set; }
	public Generation()
	{
		//
		// TODO: Add constructor logic here
		//
	}
    public Generation(string a, string b, string c)
    {
        Pic = a;
        First = b;
        Second = c;
    }
}