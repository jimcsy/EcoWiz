package main;
import java.util.Scanner;


public class General {
    Scanner scan = new Scanner(System.in);
    
    public String getDbName(String dbName){
        return dbName;
    }

    public int validInput(int indicator, String str) {
        int num = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(str);
            String input = scan.nextLine();

            if (input.trim().isEmpty()) {
                System.out.print("\nInput is empty or whitespace.\n");

                if(indicator !=  1){ //if 2 pwede mag exit
                    System.out.print("Type 'exit' to go back or ");
                }
                continue;
            }
            if (input.equalsIgnoreCase("exit")) { return -1;}
            try {
                num = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.print("\nThat's not valid!\n");
            }//if there is no product
        }
        return num;
    }

    public void designSentence(String sentence, int partLength, int type) {
        //int partLength = 50;
        int startIndex = 0;

        while (startIndex < sentence.length()) {
            int endIndex = Math.min(startIndex + partLength, sentence.length());
            String part = sentence.substring(startIndex, endIndex);
            delay(100); 
            if (endIndex < sentence.length()) {
                System.out.println(part + "-");
            }else {
                if(type == 1){
                    System.out.println("\t\t"+ part);
                }else{
                    System.out.println(part);
                }

            }
            startIndex += partLength;
        }
    }

    public void clearScreen() {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delay(int time){
        try {
            Thread.sleep(time);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void lines(char type, int length){
        for(int x = 0; x <= length; x++){
            System.out.print(type);
        }
    }

    public void header(String username, int ecoScore, int type){
        if(type == 1){
            lines('*', 70);
            System.out.println(String.format("\n%33s %s \n%33s %s", "CUSTOMER NAME:\t", 
            username.toUpperCase(), "CUSTOMER ID:\t",  ecoScore));
            lines('-', 70);
        }
        else{
            lines('=', 70);
            System.out.println("\n                      W E L C O M E  T O  E C O W I Z");
            lines('-', 70);
        }
    }
}
