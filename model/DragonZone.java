package model;

public class DragonZone {

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------

	public final static double MULT_WATER_D = 0.75;

	public final static int MAX_TEMP = 40;

	public final static int MIN_TEMP = 35;

	public final static double MIN_FOOD = 5;

	//--------------------------------------------------------------------------------------------------

	//Atributes 

	//--------------------------------------------------------------------------------------------------

	private double temperature;		// this would be the temperature of the Dragon zone, it had to be among 35º and 40º.

	private String enoughFood;		// this would notice when de amount of Food is below 5 kgs. We will take yes if the food is below 5 kgs, and no if it doesn´t.

	private double food;			// this would be de amount of food.



	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	private Dragon dragon1;		// there are the
								// bearded dragons
	private Dragon dragon2;		// in the zone

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public DragonZone(double newTemperature, double newFood, Dragon newDragon1, Dragon newDragon2) {


		temperature   = newTemperature;

		food          = newFood;

		dragon1       = newDragon1;

		dragon2       = newDragon2;
	}

// here, I'm calculating how many water the kangaroo needs
	public double calculateWater1(){

		return dragon1.calculateBmi() * MULT_WATER_D;

	}
// here, I'm calculating how many water the kangaroo needs
	public double calculateWater2(){

		return dragon2.calculateBmi() * MULT_WATER_D;

	}
//this method helps us to get the value of the attribute temperature.
	public double getTemperature(){

		return temperature;

	}
//this method helps us to assign an initial value to the attribute temperatureenoughtFood.
	public void setTemperature(double newTemperature){
		temperature = newTemperature;

	}

	public String calculateTemperatureOK(){

		return (temperature <= MAX_TEMP) ? ((temperature >= MIN_TEMP) ? "the temperature is ok" : "you they need to raise up the temperature" ): "they need to raise down the temperature";

	}
//this method helps us to get the value of the attribute food.
	public double getFood(){

		return food;

	}

//this method helps us to assign an initial value to the attribute food.
	public void setFood(double newFood){

		food = newFood;

	}
//this method helps us to get the value of the attribute enoughFood.

	public String calculateIfThereIsEnoughtFood(){

		return (food < MIN_FOOD) ? "you need to put more food" : "there is enought food";

	}
//this method helps us to get the value of the relation dragon1.
	public Dragon getDragon1(){

		return dragon1;

	}
//this method helps us to assign an initial value to the attribute dragon1.
	public void setDragon1(Dragon newDragon1){

		dragon1 = newDragon1;

	}
//this method helps us to get the value of the relation dragon2.
	public Dragon getDragon2(){

		return dragon2;

	}
//this method helps us to assign an initial value to the attribute dragon2.
	public void setDragon2(Dragon newDragon2){

		dragon2 = newDragon2;

	}
// The message in the activity monitor
	public String toString(){

		String msg = "";

		msg = msg + "The temperature in the dragon zone is: " + temperature + ", so, " + calculateTemperatureOK() + ".\n";

		msg = msg + "The amount of food in this zone is: " + food + "kg, so, " + calculateIfThereIsEnoughtFood() + ".\n";

		msg = msg + "\nThe information about the first dragon:\n\n";

		msg = msg + dragon1.toString();

		msg = msg + "|The amount of water that the animal needs is: " + calculateWater1() + "l.\n";

		msg +=      "|______________________________________________________________________________________________________________________________________________________________________________\n" ;

		msg = msg + "\nThe information about the second dragon:\n\n";

		msg = msg + dragon2.toString();

		msg = msg + "|The amount of water that the animal needs is: " + calculateWater2() + "l.\n";	

		msg +=      "|______________________________________________________________________________________________________________________________________________________________________________\n" ;

		return msg;

	}
//To search who have a name that starts and end with vowel
	public String whoVowels(){

		String msg = "";

		msg += dragon1.whoVowel();

		msg += dragon2.whoVowel();

		return msg;

	}



}