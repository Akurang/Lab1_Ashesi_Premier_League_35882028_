import java.util.Scanner;

public class PlayerSelection{
    public static void main(String[] args){

        // variables for the player details
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;
        final double POUND = 0.45359237;
        final int METER = 100;
        String category;


        //Using the Scanner class to ask the user to enter values
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the player: ");
        name= input.nextLine();

        System.out.print("Enter the age of the player: ");
        age= input.nextInt();

        System.out.print("Enter the height of the player(metres): ");
        height = input.nextDouble();

        System.out.print("Enter the weight of the player(pounds): ");
        weight= input.nextDouble();

        System.out.print("Enter the jersey number of the player: ");
        jerseyNumber = input.nextInt();


        //  weight to kilograms conversion

        double weightKg = POUND * weight;
        int intWeightKg = (int) weightKg;

        //  height to centimeters

        double heightCm = height * METER;
        int intHeightCm = (int) heightCm;

        // Output for name, age, height, weight and jersey number
        System.out.println("\nPlayer name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height in centimeters: " + intHeightCm + "cm");
        System.out.println("Weight in kilograms: " + intWeightKg + "kg");
        System.out.println("Jersey number: " + jerseyNumber);



        boolean isEligible = age>=18 && age<=35 && intWeightKg<90 ;

	    if(isEligible){
		    System.out.println("Eligibility: Eligible");
        }
        
        else{
            System.out.println("Eligibility: Not Eligiblle");
        }


       
        switch(jerseyNumber){
            case 1:
                System.out.println("Position: Goalkeeper");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Position: defender\n"+"Attacker jersey: No");
                break;
            case 6:
            case 8:
                System.out.println("Position: midfielder\n"+"Attacker jersey: No");
                break;
            case 7:
            case 11:
                System.out.println("Position: Winger\n"+"Attacker jersey: Yes");
                break;
            case 9:
                System.out.println("Position: Striker\n"+ "Attacker jersey: Yes");
                break;
            case 10:
                System.out.println("Position: Playmaker\n"+ "Attacker jersey: Yes");
                break;
            default:
                System.out.println("Position: Player position not known\n"+ "Attacker jersey: No");
            
        }

        if (age<20){
            category ="Rising Star";
            
        }
        else if (age <= 30){
            category= "Prime Player";
            
        }
        else{
            category ="Veteran";
            
        }

        if(category=="Prime Player"){
            if(intWeightKg<80){
                System.out.println("Lineup Decision: Starting line up");
            }
            else{
                System.out.println("Lineup Decision: Bench-warmer");
            }
        }
        else{
            System.out.println("Lineup Decision: Bench-warmer");
        }

         String eligibility = isEligible ? "Play" : "Rest";
         System.out.println("Final Decision: "+eligibility);



        
        

        input.close();



    }


}