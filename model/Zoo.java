package model;

public class Zoo {

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private String name;  // this would be the name of the Zoo

	private String nit;	  // this would be de nit of the Zoo

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	private KangarooZone zoneK;

	private DragonZone zoneD;

	

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public Zoo(String newName, String newNit){

		nit   = newNit;

		name  = newName;

		//Date objDate = new Date(int newDay, int newMonth, int newYear)		

		DateK objDateK1 = new DateK(28, 2, 2018);

		DateK objDateK2 = new DateK(8, 9, 2016);

		DateK objDateK4 = new DateK(4, 11, 2018);

		DateK objDateK5 = new DateK(21, 8, 2016);

		DateK objDateK7 = new DateK(10, 6, 2014);

		DateK objDateK8 = new DateK(4, 6, 2017);

		Kangaroo objKang1 = new Kangaroo("Jan", 55.0, 1.92, "Male", "ab", objDateK1);

		Kangaroo objKang2 = new Kangaroo("Oriana", 19.0, 1.57, "Female", "o", objDateK2);

		KangarooEnviroment objKEnv1 = new KangarooEnviroment(objKang1, objKang2, null);

		Kangaroo objKang4 = new Kangaroo("Instridi", 29.0, 1.37, "Female", "b", objDateK4);

		Kangaroo objKang5 = new Kangaroo("Facunda", 21.0, 1.7, "Female", "a", objDateK5);

		KangarooEnviroment objKEnv2 = new KangarooEnviroment(objKang4, objKang5, null);

		Kangaroo objKang7 = new Kangaroo("Duola", 30.0, 1.51, "Female", "a", objDateK7); 

		Kangaroo objKang8 = new Kangaroo("Cory", 69.0, 2.1, "Male", "a", objDateK8);

		KangarooEnviroment objKEnv3 = new KangarooEnviroment(objKang7, objKang8, null);

		zoneK = new KangarooZone(objKEnv1, objKEnv2, objKEnv3);

		Dragon objDrag1 = new Dragon("Poker", 0.45, 0.6, "Male");

		Dragon objDrag2 = new Dragon("Teola", 0.39, 0.52, "Female");

		zoneD = new DragonZone(37.5, 5.6, objDrag1, objDrag2);

	}
//this method helps us to get the value of the attribute name.
	public String getName(){

		return name;

	} 
//this method helps us to assign an initial value to the attribute name.
	public void setName(String newName){

		name = newName;

	}
//this method helps us to get the value of the attribute nit.
	public String getNit(){

		return nit;

	}
//this method helps us to assign an initial value to the attribute nit.
	public void setNit(String newNit){

		nit = newNit;

	}
//this method helps us to get the value of the relation zone1.
	public KangarooZone getZoneK(){

		return zoneK;

	}
//this method helps us to assign an initial value to the relation zone1.
	public void setZoneK(KangarooZone newZoneK){

		zoneK = newZoneK;

	}
//this method helps us to get the value of the relation zone2.
	public DragonZone getZoneD(){

		return zoneD;

	}
//this method helps us to assign an initial value to the relation zone2.
	public void setZoneD(DragonZone newZoneD){

		zoneD = newZoneD;

	}
// The message in the activity monitor
	public String toString(){

		String msg = "";

		msg = msg + "\n\nThis is the monitor of the animals in the Australian Outback of the: " + name + ".\n";

		msg = msg + "In the kangaroos zone there are three enviroments. \n";

		msg = msg + zoneK.toString() + "\n";
		
		msg = msg + "In the dragons zone there are two bearded dragons in one enviroment. \n";

		msg = msg + zoneD.toString();

		return msg;

	}	
//this is the kangaroo that I will change
	public String selectKangaroo(int enviroment1, int kang){

		String msg = "";

		msg += zoneK.selectKangaroo(enviroment1, kang);

		return msg;

	}
//This methood is to add a new kangaroo to the enviroment
	public String addKangaroo(Kangaroo newKang, int enviroment1){

		String msg = "";

		msg += zoneK.addKangaroo(newKang, enviroment1);

		return msg;
	
	}
//to remove a kangaroo from the enviroment
	public String removeKangaroo(int kang, int enviroment1){

		String msg = "";

		msg += zoneK.removeKangaroo(kang, enviroment1);

		return msg;
	
	}
//To search who have a name that starts and end with vowel
	public String whoVowel(){

		String msg = "";

		msg += zoneK.whoVowels() + "\n";

		msg += zoneD.whoVowels();

		return msg;
		
	}
//To search de vaccination date
	public String vaccination(){

		String msg = "";

		msg += zoneK.vaccination();

		return msg;

	}
//to change a kangaroo of enviroment
	public String changeKangaroo(int kang, int enviroment1, int enviroment2){

		String msg = "";

		msg += zoneK.changeKangaroo(kang, enviroment1, enviroment2);

		return msg;
	}

}

