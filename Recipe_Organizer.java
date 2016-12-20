/*
*	
*Recipe Organizer and Grocery List Maker
*
*<P> Main of Recipe Organizer
*
*@author Jacob Winkler
*@version 0.1
*/

import java.io.*;
public class Recipe_Organizer
{
	public static void main(String[] args)
	{
		Recipe rec = new Recipe();
		rec.add("a", 2, 0);
		System.out.println(rec);
	}
}