
//Import Scanner

import java.util.Scanner;

public class App {

    //Print array method 

    public static String[][] printArray(String[][] kids){
        for(int i = 0; i < kids.length; i++){
            for(int j = 0; j < kids[0].length; j++){
                
                //Color Statements

                if(kids[i][2].equals("NICE")){
                    System.out.print(Colors.ANSI_GREEN);
                }
                else if(kids[i][2].equals("NAUGHTY")){
                    kids[i][4] = "COAL";
                    System.out.print(Colors.ANSI_RED);
                }
                else{
                    System.out.print(Colors.ANSI_YELLOW);
                }

                //Spacing Statement

                System.out.print(kids[i][j].toUpperCase() + " ");
            }

            //Spacing Statment

            System.out.println();
        }
        return kids;
    }

    //Updating array

    public static String [][] updateArray(String [][] kids, String [] newKids){
        for(int iRow = 0; iRow < kids.length; iRow++){
            if(kids[iRow][0] == ""){
                for(int newI = 0; newI < kids[0].length; newI++){
                    kids[iRow][newI] = newKids[newI];
                }
                break;
            }
        }
        return kids;
    }


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

        //Make the kids uppercase
        
        for(int i = 0; i < kids.length; i++){
            for(int j = 0; j < kids[0].length; j++){
                kids[i][j].toUpperCase();
            }
        }
        
        //variable for adding more kids

        String newKids[] = {"","","","",""};

        //Print array
        
        printArray(kids);
        

        //Begin listing program

        Scanner in = new Scanner(System.in);

        //Prompt user

        System.out.println(Colors.ANSI_CYAN + "Would you like to input a name? (yes/no)");
        String elfUser;
        elfUser = in.nextLine().toUpperCase();

        //Instructions

        if(elfUser.equals("YES")){
        System.out.println("Alrighty then! The instructions are simple:\ninput a first name, last name, judgement, home address and desired gift seperated by commas." + Colors.ANSI_RESET);
        }

        //If the user wishes to leave

        else if(elfUser.equals("NO")){
            System.out.println(Colors.ANSI_PURPLE + "Well, I Guess this is goodbye...");
            System.exit(0);
        }

        //Child loop

        do{
            if(elfUser.equals("YES")){
                System.out.println(Colors.ANSI_CYAN + "Ok then, list away!" + Colors.ANSI_RESET);
                do{

                    //Begin the Operation

                    in.reset();
                    
                    //Comma delimated intput

                    newKids = in.nextLine().toUpperCase().split(",");
                        
                    //input Correction Statement
                    

                    if(elfUser.equals("NO")){
                        System.exit(0);
                    }
                    else if(newKids.length != 5){
                        System.out.println(Colors.ANSI_RED + "You need 5 outputs!");
                    }
                    else{

                        //Display updates
                        
                        updateArray(kids, newKids);
                        printArray(kids);
                    }

                    //Check if there is space left

                    if(kids[19][0] != ""){
                        System.out.println(Colors.ANSI_RED + "Too much! Too much" + Colors.ANSI_RESET);
                        System.exit(0);
                    }
                    else{

                        //prompt user again
                        
                        System.out.println(Colors.ANSI_BLUE + "Need to add more kids? (yes/no)\nIf yes, just continue following the instructions as before!\nIf you wish to leave just input no!");
                        
                        elfUser = in.nextLine().toUpperCase();
         
                        if(elfUser.equals("NO")){
                            System.out.println(Colors.ANSI_PURPLE + "Well, I guess this is goodbye" + Colors.ANSI_RESET);
                            System.exit(0);
                        }
                    }    
                }
                while(newKids.length < 5);  
            }
            else if (elfUser.equals("NO")){
                System.out.println("Goodbye");
                break;
            }
            else{
                System.out.println(Colors.ANSI_RED + "If you can't follow instructions, then you don't deserve to use this program!" + Colors.ANSI_RESET);
                break;
            }

        }
        while(!elfUser.equals("NO"));
        in.close();
    }
}
