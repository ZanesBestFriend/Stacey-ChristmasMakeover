//Import Scanner
import java.util.Scanner;

public class App {

    

    
    //Print array method 
    public static String[][] printArray(String[][] array, String [] newKids){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                
                //Color Statement
                if(array[i][2].equals("Nice")){
                    System.out.print(Colors.ANSI_GREEN);
                }
                else if(array[i][2].equals("Naughty")){
                    array[i][4] = "Coal";
                    System.out.print(Colors.ANSI_RED);
                }
                else{
                    System.out.print(Colors.ANSI_YELLOW);
                }
                //Uppercase and Spacing Statement
                System.out.print(array[i][j].toUpperCase() + " ");
                for(int h = 1; h < array.length;){
                    if(h == 2){
                        for( j = 0; j < array[0][0].length(); j++){
                            for( i = 4; i < array[0][0].length(); i++){
                                array [i][j] = newKids [j];
                            }
                        }  
                    } 
                    else{
                        h = 5;
                    }     
                }  
            }
            //Spacing Statment
            System.out.println();
        }
        return array;
    }

    //Second print array method
    // public static int[] printArray(int[] array){
    //     for(int i = 0; i <array.length; i++){
    //         array[i] = array[i].toUpperCase();
    //         System.out.println(array[i]);
    //     }
    //     return array;
    // }

    //public static String [][] updateArray(String [][] kids, String [] newKids){
        // for(int j = 0; j < kids[0][0].length(); j++){
        //     for(int i = 4; i < kids[0][0].length(); i++){
        //         kids [i][j] = newKids [j];
                // if(kids[i][2].equals("Nice")){
                //     System.out.print(Colors.ANSI_GREEN);
                // }
                // else if(kids[i][2].equals("Naughty")){
                //     kids[i][4] = "Coal";
                //     System.out.print(Colors.ANSI_RED);
                // }
                // else{
                //     System.out.print(Colors.ANSI_YELLOW);
                // }
                //Uppercase and Spacing Statement
                // System.out.print(kids[i][j].toUpperCase() + " ");

    //         }
    //     }
    //     return kids; 
    // }



    public static void main(String[] args) throws Exception {
        
        //The array of kids
        String kids [][] = {{"LoGaN","may","Naughty","7730 Whitemarsh Court","deOdeRant"},
        {"Cecilia","bOYer","Nice","8686 Elm St.","PUddle"},
        {"lorElAi","moRsE","Naughty","8529 Birchpond St.","TOMAto"},
        {"rory","black","Naughty","39 Fairfield Ave.","lamp ShaDe"},
        {"Denzel","SancHez","Unknown","961 Hanover Ave.","shOEs"},
        {"maNUEL","Lambert","Nice" ,"698 Arrowhead Rd.","chArgEr"},
        {"Trinity","FISHER","Nice","49 Arlington Avenue","winDow"},
        {"maTthiAs","hayEs","Nice","23 Woodside Ave.","LOTION"},
        {"Sophia","SToUT","Naughty","7640 Andover Dr.","teddY beAr"},
        {"keNNedy","Dunlap","Unknown","63 Cypress Rd.","pAnts"},
        {"", "", "", "", "",},
        {"", "", "", "", "",},
        {"", "", "", "", "",},
        {"", "", "", "", "",},
        {"", "", "", "", "",},
        {"", "", "", "", "",},
        {"", "", "", "", "",},
        {"", "", "", "", "",},
        {"", "", "", "", "",},
        {"", "", "", "", "",}
        };

        String newKids[] = {"","","","",""};

        //Print array
        printArray(kids, newKids);

        //Begin listing program
        
        //Setting up variables
        Scanner in = new Scanner(System.in);
        //Prompt user
        System.out.println(Colors.ANSI_CYAN + "Would you like to input a name?");
        String elfUser;
        elfUser = in.nextLine();
        elfUser = elfUser.toUpperCase(); 
        if(elfUser.equals("YES")){
            System.out.println("Alrighty then! The instructions are simple:\n input a first name, last name, judgement, home address and desired gift.\n If you wish to leave, input 'quit'.");
            do{
                //Begin the Operation
                // System.out.println(Colors.ANSI_YELLOW + "Please input a name. Input 0 to quit." + Colors.ANSI_RESET);

                //If the elf wishes to leave
                in.reset();

                
                //Comma delimated output
                newKids = in.nextLine().toUpperCase().split(",");
                    
                //Output Correction Statement 
                if(newKids.length != 5){
                    System.out.println(Colors.ANSI_RED + "You need 5 outputs!");
                }

                //Display updates
               // updateArray(kids,newKids);
                printArray(kids, newKids);

                    
                if(elfUser.equals("QUIT")){
                    System.exit(1);
                }

                if(kids.equals(newKids)){
                    System.out.println(kids);
                }

            }
            while(elfUser.equals("yes"));{
                System.out.println("Have a nice day!");
            }   
        }
        else if (elfUser.equals("NO")){
            System.out.println("Goodbye");
            System.exit(0);
        }
        else{
            System.out.println("What?");
        }
    }
}
