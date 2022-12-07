public class App {
    
    //Print array method 
    public static String[][] printArray(String[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j].toUpperCase());
            }
            System.out.println();
        }
        return array;
    }

    public static void main(String[] args) throws Exception {
        
        //The array of kids
        String kids [][] = {{"LoGaN", "may", "Naughty", "7730 Whitemarsh Court", "deOdeRant"},
        {"Cecilia", "bOYer", "Nice", "8686 Elm St.", "PUddle"},
        {"lorElAi", "moRsE", "Naughty", "8529 Birchpond St.", "TOMAto"},
        {"rory", "black", "Naughty", "39 Fairfield Ave.", "lamp ShaDe"},
        {"Denzel", "SancHez", "Unknown", "961 Hanover Ave.", "shOEs"},
        {"maNUEL", "Lambert", "Nice", "698 Arrowhead Rd.", "chArgEr"},
        {"Trinity", "FISHER", "Nice", "49 Arlington Avenue", "winDow"},
        {"maTthiAs", "hayEs", "Nice", "23 Woodside Ave.", "LOTION"},
        {"Sophia", "SToUT", "Naughty", "7640 Andover Dr.", "teddY beAr"},
        {"keNNedy", "Dunlap", "Unknown", "63 Cypress Rd.", "teddY beAr"},
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

        //Print array
        printArray(kids);
    }
}
