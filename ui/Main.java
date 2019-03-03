package ui;

import model.*;

import java.util.*;

public class Main {
	//--------------------------------------------------------------------------------------------------

	//Atributes


	//--------------------------------------------------------------------------------------------------
	
	Scanner scanStr = new Scanner(System.in);

	Scanner scanInt = new Scanner(System.in);

	Scanner scanDou = new Scanner(System.in);		

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	private Zoo outback;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	public static void main(String[] args) {

		String newNit = null;

		String newName = null;		

		Main main = new Main(newName, newNit);

		main.showHeader();

		main.showMenu();		

	}

	public Main(String newName, String newNit){

	outback = new Zoo(newName, newNit);

	}
//the header
	public void showHeader(){

		System.out.println("Introduce the zoo name");//introduzca

		String newName = scanStr.nextLine();//lealo

		System.out.println("Introduce the NIT");//introduzca

		String newNit = scanStr.nextLine();//lealo
	
		System.out.println("*************************************************************************************************************************************************************************************");
		
		System.out.println("*************************************************************************************************************************************************************************************");
	
		System.out.println("**************************************************************  HELLO, THIS IS THE MONITOR OF THE AUSTRALIAN OUTBACK  ***************************************************************"); 

		System.out.println("*************************************************************************************************************************************************************************************");

		System.out.println("*************************************************************************************************************************************************************************************");

		System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________");

	}
//the menu
	public void showMenu(){

		boolean back = false;

		int enviroment1 = 0;

		int enviroment2 = 0;

        int option = 0;

        int kang = 0;

 
        while (!back) {

        	showOptions1();

			try {
 
                System.out.println("Write one of the options");
                
                option = scanInt.nextInt();

                switch (option) {
                
                    case 1:
                
                        System.out.println("You select the option 1");

						System.out.println(outback.toString() + "\n" );
                
                    break;
                
                    case 2:
                
                        System.out.println("You select the option 2");

                        System.out.println("Introduce a new Kangaroo");
		
						System.out.println("name:");
		
						String newName = scanStr.nextLine();

						System.out.println("weight:");

						double newWeight = scanDou.nextDouble();

						scanDou.nextLine();

						System.out.println("height:");

						double newHeight = scanDou.nextDouble();

						scanDou.nextLine();

						System.out.println("sex: \n 1. Male \n 2. Female");

						int selection = scanInt.nextInt();

						scanInt.nextLine();

						String newSex = selection ==1 ? Kangaroo.MALE : Kangaroo.FEMALE;

						System.out.println("blood type: ");

						String newBloodType = scanStr.nextLine();

						System.out.println("now, to introduce the birthdate, first introduce the day:");

						int newDay = scanInt.nextInt();

						scanInt.nextLine();

						System.out.println("now, the month in numbers");

						int newMonth = scanInt.nextInt();

						scanInt.nextLine();

						System.out.println("and the year:");

						int newYear = scanInt.nextInt();

						scanInt.nextLine();

						DateK newBirth = new DateK(newDay, newMonth, newYear);

						Kangaroo newKang = new Kangaroo(newName, newWeight, newHeight, newSex, newBloodType, newBirth);
                 	
                 		System.out.println("In which enviroment do you want to add the new kangaroo?:");

                 		System.out.println("1. First enviroment 1");

                 		System.out.println("2. Second enviroment 2");			

                 		System.out.println("3. Third enviroment 3");			

                        enviroment1 = scanInt.nextInt();

                        System.out.println(outback.addKangaroo(newKang, enviroment1));

                    break;
					
				    case 3:
                
                        System.out.println("You select the option 3");

                        System.out.println("In which enviroment do you want to add the new kangaroo?:");

                 		System.out.println("1. First enviroment 1");

                 		System.out.println("2. Second enviroment 2");			

                 		System.out.println("3. Third enviroment 3");

                        enviroment1 = scanInt.nextInt();

                        scanInt.nextLine();

                        System.out.println("which kangaroo do you want to remove?");

                        System.out.println("1. First kangaroo 1");

                 		System.out.println("2. Second kangaroo 2");			

                 		System.out.println("3. Third kangaroo 3");

                        kang = scanInt.nextInt();

                        scanInt.nextLine();

                        System.out.println(outback.removeKangaroo(kang, enviroment1));

             	   break;
                      
                    case 4 :

                    	System.out.println("You select the option 4");

                    	System.out.println("From which enviroment do you want to change the kangaroo?:");

                 		System.out.println("1. First enviroment 1");

                 		System.out.println("2. Second enviroment 2");			

                 		System.out.println("3. Third enviroment 3");

                        enviroment1 = scanInt.nextInt();

                        scanInt.nextLine();                  

                        System.out.println("Which kangaroo do you want to change?");

                        System.out.println("1. First kangaroo 1");

                 		System.out.println("2. Second kangaroo 2");			

                 		System.out.println("3. Third kangaroo 3");
						
						kang = scanInt.nextInt();

                        scanInt.nextLine();
                                           
                 		System.out.println("To which enviroment do you want to add the kangaroo?:");

                 		System.out.println("1. First enviroment 1");

                 		System.out.println("2. Second enviroment 2");			

                 		System.out.println("3. Third enviroment 3");

                 		enviroment2 = scanInt.nextInt();

                        scanInt.nextLine();

						outback.selectKangaroo(enviroment1, kang);

						outback.changeKangaroo(kang, enviroment1, enviroment2);

                    break;

                    case 5 :

                    	System.out.println("You select the option 5");

						System.out.println("The names of the animals that starts and ends with vowels are:");

                    	System.out.println(outback.whoVowel());

                   	break;

                   	case 6:

                    	System.out.println("You Select the option 6");

                    	System.out.println("The date of vaccination of the animals is:");

                    	System.out.println(outback.vaccination());
                
                    break;
             
                    case 7:

                    	System.out.println("You are getting out of the software");

                    	System.out.print("\033[H\033[2J");  
    					
    					System.out.flush(); 
                
                        back = true;
                
                    break;
                
                    default:
                
                        System.out.println("Only numbers between 1 and 6");
                
                }
            
            } catch (InputMismatchException e) {
            
            	System.out.println("You have to write a number");
            
            	scanInt.next();

              }

        }

	}
//the options of the menu 
	public void showOptions1(){

		Calendar c1 = GregorianCalendar.getInstance();



        System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________");        

        System.out.println("|AUSTRALIAN OUTBACK                                                                                                                                           "+c1.getTime().toLocaleString()+"|");		

        System.out.println("|___________________________________________________________________________________________________________________________________________________________________________________|");

        System.out.println("|                                                                                                                                                                                   |");

        System.out.println("|                                                                                    OPTION MENU                                                                                    |");

        System.out.println("|___________________________________________________________________________________________________________________________________________________________________________________|");

        System.out.println("|                         |                         |                         |                         |                         |                         |                       |");

        System.out.println("|            1            |            2            |            3            |            4            |            5            |            6            |            7          |");

        System.out.println("|     See the monitor     |   Add a new kangaroo    |    Remove a kangaroo    |    Change a kangaroo    | Find the kangaroos that |    Report of the date   |                       |");
        
        System.out.println("|                         |                         |                         |      of enviroment      | have a vowel at the end |      of vaccination     |         GET OUT       |");

        System.out.println("|                         |                         |                         |                         |  and start of the name  |                         |                       |");

        System.out.println("|_________________________|_________________________|_________________________|_________________________|_________________________|_________________________|_______________________|");


	}
	
}