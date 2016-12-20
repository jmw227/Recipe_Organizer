/*
*
*Recipe Object
*<P> Ingredients, quantity, and type of quantity
*<P> Procedure is not saved into an object, but is printed directly to a textfile from the GUI
*@author Jacob Winkler
*@version 0.1
*/
import java.util.ArrayList;

public class Recipe{
	private ArrayList<String> ingredients;		// list of string names of ingredients
	private ArrayList<Double> quantities;		// list of ingredient quantities (doubles)
	private ArrayList<Integer> QTs;				// list of ingredient quantity type indexes within the quant_type array
	private final String[] quant_types = {"c", "g", "l", "lb", "ml", "oz", "pt", "tsp", "tbsp"}; 
	public Recipe()
	{
		ingredients = new ArrayList<String>();
		quantities = new ArrayList<Double>();
		QTs = new ArrayList<Integer>();
	}
	
	public void add(String i, double q, int t)
	{
		ingredients.add(i);
		quantities.add(q);
		QTs.add(t);
	}
	public void update();
	
	public String toString()
	{
		String output ="";
		for(int i=0;i<ingredients.size();i++)
		{
			output = output +quantities.get(i)+" "+quant_types[QTs.get(i)]+" "+ingredients.get(i)+"\n";
		}
		return output;
	}
}