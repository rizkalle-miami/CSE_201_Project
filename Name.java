import java.util.ArrayList;
import java.util.List;

public class Name{
	private String name;
	private String gender;
	private int intNumberOfNames;
	private List<String> arrayList = new ArrayList<String>();
	
	public Name(String gender) {
		//Constructor for the Name class
		this.gender = gender;
	}
	
	public void addNames(String name) {
		//Add a name to the ArrayList
		arrayList.add(name);
		//Increase the number of names total 
		this.intNumberOfNames++; 
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		//Return the contents of the ArrayList as a String
		return arrayList.toString();
	}
	
}
