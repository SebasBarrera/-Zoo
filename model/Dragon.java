package model;

public class Dragon {

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private String name;		// this would be the name of the baearded dragon.
	
	private double weight;  	// this would be the weight of the baearded dragon.

	private double lengthy;       // this would be the lengthy of the baearded dragon.

	private String sex; 		// this would say if the baearded dragon  is male or female. We will take the value of M for male and the value of F for female.



	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	// it doesn´t have relations

	//--------------------------------------------------------------------------------------------------

	//Methods//

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public Dragon (String newName, double newWeight, double newLengthy, String newSex){
		
		name   = newName;

		weight = newWeight;

		lengthy  = newLengthy;		

		sex    = newSex;

	}
//this method helps us to get the value of the attribute name.
	public String getName(){

		return name;

	}
//this method helps us to assign an initial value to the attribute .
	public void setName(String newName){

		name = newName;

	}
//This method says if the animals name starts and ends with vowel
	public boolean vowel(){

		boolean vowel = false;

		int x = 0, x1 = name.length()-1;

		if ((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U')) {
			
			x = x1;
			
			if ((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U')) {

				vowel = true;
				
			}
		}

		return vowel;

	}
//the String of the animals name that start and ends with vowel
	public String whoVowel(){

		String msg = "";

		if (vowel()) {
			
			msg += name + "\n";

		}

		return msg;

	}
//the String to the toString of the vowel
	public String vowels(){

		String msg = "";

		if (vowel()) {

			msg += "|The name of this dragon starts and ends with vowels\n";
			
		}else {
			
			msg += "|The name of this dragon doesn't start and end with vowels\n";

		}

		return msg;
	}
//this method helps us to get the value of the attribute height.
	public double getWeight(){

		return weight;

	}
//this method helps us to assign an initial value to the attribute weight.
	public void setwWight(double newWeight){

		weight = newWeight;

	}
//this method helps us to get the value of the attribute weight.
	public double getLengthy(){

		return lengthy;

	}
//this method helps us to assign an initial value to the attribute lengthy.
	public void setLengthy(double newLengthy){

		lengthy = newLengthy;

	}
//this method helps us to get the value of the attribute sex.
	public String getSex(){

		return sex;

	}
//this method helps us to assign an initial value to the attribute sex.
	public void setSex(String newSex){

		sex = newSex;

	}
//here, the operation of the ibm is declared
	public double calculateBmi(){

		return (weight / (lengthy * lengthy));

	}
// The message in the activity monitor
	public String toString(){

		String msg = "";

		msg +=      "_______________________________________________________________________________________________________________________________________________________________________________\n" ;

		msg = msg + "|The name of the animal is:                                   " + name + "\n";

		msg = msg + "|The lengthy of te animal is:                                 " + lengthy + "m.\n";

		msg = msg + "|The weight of the animal is:                                 " + weight + "kg.\n";

		msg = msg + "|The sex of the animal is:                                    " + sex + ".\n";

		msg = msg + "|The body mass index of the animal is:                        " + calculateBmi() + "kg/m².\n";

		msg += vowels();


		return msg;


	}

}