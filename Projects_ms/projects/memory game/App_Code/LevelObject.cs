using System;
using System.Collections.Generic;
using System.Linq;

public class LevelObject
{
    public SortedList<String,Image> images { set; get; } 
    public int level; // level of the game
    public SortedList<String, String> buttonImageNames { set; get; }
    public LevelObject()
    {
    }
    public LevelObject(int gameLevel)
	{
        this.level = gameLevel;
        this.images = new SortedList<String, Image>(gameLevel + 1);
        this.buttonImageNames = new SortedList<string,string>();
	}
    public LevelObject IntializeGame()
    {
        int randomNumberLimit = (level + 1) * (level + 1);
        List<int> positions = new List<int>();
        Random r = new Random();
        int rand = r.Next(0, randomNumberLimit);
        int imageName = 0;
        List<String> buttonIDs = new List<string>();
        while (positions.Count < randomNumberLimit)
        {
            while (positions.Contains(rand))
            {
                rand = r.Next(0, randomNumberLimit);
            }
            positions.Add(rand);
            buttonIDs.Add("ImageButton" + rand);
            this.buttonImageNames.Add("ImageButton" + rand, imageName.ToString());
            if (positions.Count % (level + 1) == 0) // how many times must the image be repeated?
            {
                this.images.Add(imageName.ToString(), new Image("~/Image/" + imageName.ToString() + ".jpg", imageName + "", buttonIDs));
                imageName++;
                buttonIDs = new List<string>();
            }
        }
        return this;
    }
}
