
//import the scanner class
import java.util.Scanner;
import java.util.Random;

public class App {
    // Method to display balance
    public static void displayBalance(float budget) {
        System.out.println(Colors.ANSI_YELLOW + "You have $" + budget + Colors.ANSI_RESET + "\n");
    }

    // Method to display invetory
    public static void displayInvetory(int almondQty, int dynamiteQty, int glutenQty, int cheeseQty, int applesQty,
            int towelQty, int aleQty) {
        System.out.println(Colors.ANSI_GREEN + "You have " + almondQty + " carton(s) of almond milk " + "\n"
                + dynamiteQty + " stick(s) of dynamite " + "\n" + glutenQty + " pack(s) of gluten" + "\n" + cheeseQty
                + " Wheel(s) of cheese" + "\n" + applesQty + " bag(s) of apples" + "\n" + towelQty + " roll(s) of paper towels"
                + "\n" + aleQty + " Bottle(s) of pale ale" + Colors.ANSI_RESET);
    }

    //Method for random event
    static Random rand = new Random();
    public static boolean moreThanFive(){
        if(rand.nextInt(10) == 3)
        return true;
        else{
            return false;
        }
    }

    public static void main(String[] args) throws Exception {

        // choosing items and prices

        // Items for purchasing:
        // Almond Milk $8.00
        // Dynamite $10.00
        // Gluten $2.00
        // Gouda Cheese $9.00
        // Granny Smith Apples (6) $4.00
        // Paper Towels $4.00
        // Pale Ale $25.00

        // setting the variables

        int almondQty = 0, dynamiteQty = 0, glutenQty = 0, cheeseQty = 0, applesQty = 0, towelQty = 0, aleQty = 0;
        float almondCost = 8, dynamiteCost = 10, glutenCost = 2, cheeseCost = 9, applesCost = 4, towelCost = 4, aleCost = 25;
        int itemChoice;

        // What is in your wallet?

        Scanner in = new Scanner(System.in);
        float budget;
        System.out.println(Colors.ANSI_BLUE + "What is the budget for your extravanganza?" + Colors.ANSI_RESET);
        in.reset();
        budget = in.nextFloat();
        if (budget <= 31) {
            System.out.println(Colors.ANSI_RED + "Sorry, but you will need more money than that pal." + Colors.ANSI_RESET);
        }

        // Begin Shopping

        else {
            System.out.println(Colors.ANSI_BLUE + "Well then... Let's - a - go!" + "\n");
            Thread.sleep(1000);
            System.out.println("Welcome to E-Mart!" + Colors.ANSI_RESET + "\n");

            do {

                // Display Budget, Items and Prices.

                displayBalance(budget);
                System.out.println(Colors.ANSI_CYAN + "Tell me what your heart desires, little one. You have 7 options:"
                        + Colors.ANSI_RESET + "\n" + Colors.ANSI_YELLOW
                        + "1. Almond milk $" + almondCost + "\n"
                        + "2. Dynamite $" + dynamiteCost + "\n"
                        + "3. Gluten $" + glutenCost + "\n"
                        + "4. Gouda Cheese $" + cheeseCost + "\n"
                        + "5. Granny Smith Apples (6) $" + applesCost + "\n"
                        + "6. Paper Towels " + towelCost + "\n"
                        + "7. Pale Ale $" + aleCost + "\n" + Colors.ANSI_RESET
                        + Colors.ANSI_CYAN + "type 0 to put your enterprise to sleep." + Colors.ANSI_RESET);
                
                itemChoice = in.nextInt();
                in.reset();

                // buying items with enough money

                if (itemChoice == 0) {
                    System.out.println(
                            Colors.ANSI_PURPLE + "Well, I geuss this is goodbye for now :(" + Colors.ANSI_RESET + "\n");
                            break;
                } 
                else if (itemChoice == 1) {
                    // Check the budget
                    if (budget >= almondCost) {

                        //Choose how much of the item is desired

                        System.out.println(Colors.ANSI_CYAN + "How much do you desire?" + Colors.ANSI_RESET);
                        itemChoice = in.nextInt();
                        if(itemChoice > 0){
                            System.out.println(Colors.ANSI_GREEN + "Almond milk added to cart!" + Colors.ANSI_RESET + "\n");
                            almondQty += itemChoice;
                            almondCost *= itemChoice;
                            budget -= almondCost;
                        }
                        if(itemChoice > 4){
                            if(moreThanFive() == true){
                               Thread.sleep(1000); 
                               System.out.println(Colors.ANSI_RED + "As you bend over to reach for your item, a mysterious assilant notices you are not wearing a belt..." + Colors.ANSI_RESET);
                               Thread.sleep(1000);
                               System.out.println(Colors.ANSI_RED + "You have been cracked!" + Colors.ANSI_RESET);
                               break;
                            } 
                        }
                        
                    }
                    else{
                        System.out.println(Colors.ANSI_RED + "You do not have enough money for that" + Colors.ANSI_RESET);
                    }
                } 
                else if (itemChoice == 2) {
                    // Check the budget
                    if (budget >= dynamiteCost) {
                       
                        //Choose how much of the item is desired

                        System.out.println(Colors.ANSI_CYAN + "How much do you desire?");
                        itemChoice = in.nextInt();
                        if(itemChoice > 0){
                            System.out.println(Colors.ANSI_GREEN + "dynamite added to cart!" + Colors.ANSI_RESET + "\n");
                            dynamiteQty += itemChoice;
                            dynamiteCost *= itemChoice;
                            budget -= dynamiteCost;
                        }
                        if(itemChoice > 4){
                            if(moreThanFive() == true){
                               Thread.sleep(1000); 
                               System.out.println(Colors.ANSI_RED + "As you bend over to reach for your item, a mysterious assilant notices you are not wearing a belt..." + Colors.ANSI_RESET);
                               Thread.sleep(1000);
                               System.out.println(Colors.ANSI_RED + "You have been cracked!" + Colors.ANSI_RESET);
                               break;
                            } 
                        }
                    }
                    else{
                        System.out.println(Colors.ANSI_RED + "You do not have enough money for that" + Colors.ANSI_RESET);
                    }
                } 
                else if (itemChoice == 3) {
                    // Check the budget
                    if (budget >= glutenCost) {
                         
                        //Choose how much of the item is desired

                        System.out.println(Colors.ANSI_CYAN + "How much do you desire?");
                        itemChoice = in.nextInt();
                        if(itemChoice > 0){
                            System.out.println(Colors.ANSI_GREEN + "Gluten added to cart!" + Colors.ANSI_RESET + "\n");
                            glutenQty += itemChoice;
                            glutenCost *= itemChoice;
                            budget -= glutenCost;
                        }
                        if(itemChoice > 4){
                            if(moreThanFive() == true){
                               Thread.sleep(1000); 
                               System.out.println(Colors.ANSI_RED + "As you bend over to reach for your item, a mysterious assilant notices you are not wearing a belt..." + Colors.ANSI_RESET);
                               Thread.sleep(1000);
                               System.out.println(Colors.ANSI_RED + "You have been cracked!" + Colors.ANSI_RESET);
                               break;
                            } 
                        }
                    }
                    else{
                        System.out.println(Colors.ANSI_RED + "You do not have enough money for that" + Colors.ANSI_RESET);
                    }
                } 
                else if (itemChoice == 4) {
                    // Check the budget
                    if (budget >= cheeseCost) {
                          
                        //Choose how much of the item is desired

                        System.out.println(Colors.ANSI_CYAN + "How much do you desire?");
                        itemChoice = in.nextInt();
                        if(itemChoice > 0){
                            System.out.println(Colors.ANSI_GREEN + "Gouda cheese added to cart!" + Colors.ANSI_RESET + "\n");
                            cheeseQty += itemChoice;
                            cheeseCost *= itemChoice;
                            budget -= cheeseCost;
                        }
                        if(itemChoice > 4){
                            if(moreThanFive() == true){
                               Thread.sleep(1000); 
                               System.out.println(Colors.ANSI_RED + "As you bend over to reach for your item, a mysterious assilant notices you are not wearing a belt..." + Colors.ANSI_RESET);
                               Thread.sleep(1000);
                               System.out.println(Colors.ANSI_RED + "You have been cracked!" + Colors.ANSI_RESET);
                               break;
                            } 
                        }
                    }
                    else{
                        System.out.println(Colors.ANSI_RED + "You do not have enough money for that" + Colors.ANSI_RESET);
                    }
                } 
                else if (itemChoice == 5) {
                    // Check the budget
                    if (budget >= applesCost) {
                          
                        //Choose how much of the item is desired

                        System.out.println(Colors.ANSI_CYAN + "How much do you desire?");
                        itemChoice = in.nextInt();
                        if(itemChoice > 0){
                            System.out.println(Colors.ANSI_GREEN + "Half a dozen granny smith apples added to cart!" + Colors.ANSI_RESET + "\n");
                            applesQty += itemChoice;
                            applesCost *= itemChoice;
                            budget -= applesCost;
                        }
                        if(itemChoice > 4){
                            if(moreThanFive() == true){
                               Thread.sleep(1000); 
                               System.out.println(Colors.ANSI_RED + "As you bend over to reach for your item, a mysterious assilant notices you are not wearing a belt..." + Colors.ANSI_RESET);
                               Thread.sleep(1000);
                               System.out.println(Colors.ANSI_RED + "You have been cracked!" + Colors.ANSI_RESET);
                               break;
                            } 
                        }
                    }
                    else{
                        System.out.println(Colors.ANSI_RED + "You do not have enough money for that" + Colors.ANSI_RESET);
                    }
                } 
                else if (itemChoice == 6) {
                    // Check the budget
                    if (budget >= towelCost) {
                         
                        //Choose how much of the item is desired

                        System.out.println(Colors.ANSI_CYAN + "How much do you desire?");
                        itemChoice = in.nextInt();
                        if(itemChoice > 0){
                            System.out.println(Colors.ANSI_GREEN + "Paper towels added to cart!" + Colors.ANSI_RESET + "\n");
                            towelQty += itemChoice;
                            towelCost *= itemChoice;
                            budget -= towelCost;
                        }
                        if(itemChoice > 4){
                            if(moreThanFive() == true){
                               Thread.sleep(1000); 
                               System.out.println(Colors.ANSI_RED + "As you bend over to reach for your item, a mysterious assilant notices you are not wearing a belt..." + Colors.ANSI_RESET);
                               Thread.sleep(1000);
                               System.out.println(Colors.ANSI_RED + "You have been cracked!" + Colors.ANSI_RESET);
                               break;
                            } 
                        }
                    }
                    else{
                        System.out.println(Colors.ANSI_RED + "You do not have enough money for that" + Colors.ANSI_RESET);
                    }
                } 
                else if (itemChoice == 7) {
                    // Check the budget
                    if (budget >= aleCost) {
                          
                        //Choose how much of the item is desired

                        System.out.println(Colors.ANSI_CYAN + "How much do you desire?");
                        itemChoice = in.nextInt();
                        if(itemChoice > 0){
                            System.out.println(Colors.ANSI_GREEN + "Pale ale added to cart!" + Colors.ANSI_RESET + "\n");
                            aleQty += itemChoice;
                            aleCost *= itemChoice;
                            budget -= aleCost;
                        }
                        if(itemChoice > 4){
                            if(moreThanFive() == true){
                               Thread.sleep(1000); 
                               System.out.println(Colors.ANSI_RED + "As you bend over to reach for your item, a mysterious assilant notices you are not wearing a belt..." + Colors.ANSI_RESET);
                               Thread.sleep(1000);
                               System.out.println(Colors.ANSI_RED + "You have been cracked!" + Colors.ANSI_RESET);
                               break;
                            } 
                        }
                    }
                    else{
                        System.out.println(Colors.ANSI_RED + "You do not have enough money for that" + Colors.ANSI_RESET + "\n");
                    }
                }

                // Display invetory

                displayInvetory(almondQty, dynamiteQty, glutenQty, cheeseQty, applesQty, towelQty, aleQty);

                //Reset item cost

                almondCost = 8;
                dynamiteCost = 10; 
                glutenCost = 2;
                cheeseCost = 9;
                applesCost = 4;
                towelCost = 4;
                aleCost = 25;

                // When the money runs out...

                if (budget <= 30) {
                    System.out.println(Colors.ANSI_YELLOW + "Thank you OwO. We'll take your remaining money as your price of freedom!" + Colors.ANSI_RESET);
                    break;
                }

            } 
            
            // Ending the Extravangza 

            while (budget != 0);{
                System.out.println(Colors.ANSI_CYAN + "I hope you enjoyed you exciting endeavour!" + "\n" + "Here is what you bought..." + Colors.ANSI_RESET);
                displayInvetory(almondQty, dynamiteQty, glutenQty, cheeseQty, applesQty, towelQty, aleQty);
            }
        }
        //Close the scanner
        in.close();
    }
}
