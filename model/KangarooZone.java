package model;

public class KangarooZone{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	private KangarooEnviroment ke1;

	private KangarooEnviroment ke2;

	private KangarooEnviroment ke3;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public KangarooZone(KangarooEnviroment newKe1, KangarooEnviroment newKe2, KangarooEnviroment newKe3) {

		ke1       = newKe1;

		ke2       = newKe2;

		ke3       = newKe3;

	}

//this method helps us to get the value of the relation ke1.
	public KangarooEnviroment getKe1(){

		return ke1;

	}
//this method helps us to assign an initial value to the attribute ke1.
	public void setKe1(KangarooEnviroment newKe1){

		ke1 = newKe1;
	
	}
//this method helps us to get the value of the relation ke2.
	public KangarooEnviroment getKe2(){

		return ke2;

	}
//this method helps us to assign an initial value to the attribute ke2.
	public void setKe2(KangarooEnviroment newKe2){

		ke2 = newKe2;
		
	}
//this method helps us to get the value of the relation ke3.
	public KangarooEnviroment getKe3(){

		return ke3;

	}
//this method helps us to assign an initial value to the attribute ke3.
	public void setKe3(KangarooEnviroment newKe3){

		ke3 = newKe3;
		
	}
//to calculate the zone area
	public double calculateTotalArea(){

		return ke1.calculateEnviromentArea() + ke2.calculateEnviromentArea() + ke3.calculateEnviromentArea();

	}
// The message in the activity monitor
	public String toString(){

		String  msg = "";

		msg = msg + "The total area in the kangaroos zone is:       " + calculateTotalArea() + "m².\n";

		msg = msg + "\nThis is the first enviroment:\n";

		msg = msg + "The area of this enviroment is: " + ke1.calculateEnviromentArea() + ".\n";

		msg = msg + ke1.toString();

		msg = msg + "\nThis is the second enviroment:\n";

		msg = msg + "The area of this enviroment is: " + ke2.calculateEnviromentArea() + ".";

		msg = msg + ke2.toString();

		msg = msg + "\nThis is the third enviroment:\n";

		msg = msg + "The area of this enviroment is: " + ke3.calculateEnviromentArea() + ".";

		msg = msg + ke3.toString();

		return msg;

	}
//this is the kangaroo that I will change
	public String selectKangaroo(int enviroment1, int kang){

		String msg = "";
	
		if(enviroment1==1) {
			
			   msg += ke1.addKangaroo1(kang);
		
		   } else if(enviroment1==2) {
		
			   msg += ke2.addKangaroo1(kang);
		
		   }else if(enviroment1==3) {
		
			   msg += ke3.addKangaroo1(kang);
		
		   }else {
		
			   msg = "Only numbers between 1 and 3";
		
		   }

		   return msg;

	}
//This methood is to add a new kangaroo to the enviroment
	public String addKangaroo(Kangaroo newKang, int enviroment1){

		String msg = "";
		   
		   if(enviroment1==1) {
			
			   msg += ke1.addKangaroo(newKang);
		
		   } else if(enviroment1==2) {
		
			   msg += ke2.addKangaroo(newKang);
		
		   }else if(enviroment1==3) {
		
			   msg += ke3.addKangaroo(newKang);
		
		   }else {
		
			   msg = "Only numbers between 1 and 3";
		
		   }
		   
		   
		   return msg;

	}
//To get the enviroment
	public KangarooEnviroment getEnviroment(int enviroment1){

		KangarooEnviroment x = null;

		if (enviroment1 == 1 ) {

			x = ke1;
		
		}

		if (enviroment1 == 2 ) {

			x = ke2;
		
		}

		if (enviroment1 == 3 ) {

			x = ke3;
		
		}

		return x;

	}
//to change a kangaroo of enviroment
	public String changeKangaroo(int kang, int enviroment1, int enviroment2){

		String msg = "";

		KangarooEnviroment l = getEnviroment(enviroment1);

		KangarooEnviroment n = getEnviroment(enviroment2);

		Kangaroo x = l.selectKangaroo(kang);

		n.addKangaroo(x);

		l.removeKangaroo(kang);

		return msg;

	}
//to remove a kangaroo from the enviroment
	public String removeKangaroo(int kang, int enviroment1){

		String msg = "";


		   if(enviroment1==1) {
			
			   msg += ke1.removeKangaroo(kang);
		
		   } else if(enviroment1==2) {
		
			   msg += ke2.removeKangaroo(kang);
		
		   }else if(enviroment1==3) {
		
			   msg += ke3.removeKangaroo(kang);
		
		   }else {
		
			   msg = "Only numbers between 1 and 3";
		
		   }
		   
		   
		   return msg;

	}
//to remove a kangaroo from the enviroment
	public String removeKangaroo1(int kang, int enviroment2){

		String msg = "";


		   if(enviroment2==1) {
			
			   msg += ke1.removeKangaroo(kang);
		
		   } else if(enviroment2==2) {
		
			   msg += ke2.removeKangaroo(kang);
		
		   }else if(enviroment2==3) {
		
			   msg += ke3.removeKangaroo(kang);
		
		   }else {
		
			   msg = "Only numbers between 1 and 3";
		
		   }
		   
		   
		   return msg;

	}
//To search who have a name that starts and end with vowel
	public String whoVowels(){

		String msg = "";

		msg += ke1.whoVowel();

		msg += ke2.whoVowel();

		msg += ke3.whoVowel();

		return msg;
		
	}
//To search de vaccination date
	public String vaccination(){

		String msg = "";

		msg += ke1.vaccination();

		msg += ke2.vaccination();

		msg += ke3.vaccination();

		return msg;

	}


}