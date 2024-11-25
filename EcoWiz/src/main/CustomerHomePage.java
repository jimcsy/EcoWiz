package main;


public class CustomerHomePage extends Products{
    private Transaction buy = new Buy();
    private Transaction redeem = new Redeem();
    private int ecoScore;

    public void userRole(Customer user){
        int choice = 0;
        boolean isSucccessful = true;
        while(isSucccessful){
            delay(1500);
            clearScreen();
            header(user.getUsername(), user.getCustomerId(), 1);
            System.out.print("\n[1] See Products \n[2] Buy Products \n[3] See Eco Points \n[4] Redeem Eco Points \n[5] Logout \n");
            choice = validInput(1, "Choose from the list: ");
            
            while (choice < 1 || choice > 5){
                System.out.print("\nChoose only from the list!");
                break;
            }
        
            switch (choice) {
                case 1:
                    printAvailableProd(user.getUsername(), user.getCustomerId(), user.getEcoPoints());
                    System.out.print("Press [enter]...");
                    scan.nextLine();
                    System.out.print("\nReturning...");
                    break;
                case 2:
                    ecoScore = buy.buyProduct(user.getUsername(), user.getCustomerId(), user.getEcoPoints());
                    if (ecoScore != -1){
                        user.updateEcoScore(ecoScore);
                    }
                    break;
                case 3:
                    clearScreen();
                    header(user.getUsername(), user.getCustomerId(), 1);
                    System.out.println("\nECO POINTS: " + user.getEcoPoints());
                    System.out.println("\nCONVERSION SYSTEM: \n\t100pts = 10% discount \n\t200pts = 20% discount \n\t300pts = 30% discount" + 
                                        " \n\t400pts = 40% discount \n\t500pts = 50% discount");
                    System.out.print("\nPress [enter]...");
                    scan.nextLine();
                    System.out.print("\nReturning...");
                    break;
                case 4:
                    ecoScore = redeem.buyProduct(user.getUsername(), user.getCustomerId(), user.getEcoPoints());
                    if(ecoScore != -1){
                        user.updateEcoScore(ecoScore);
                    }
                    break;

                case 5:
                    System.out.print("\nThank you for visiting us!\nAlways remember your customer id: " + user.getCustomerId());
                    delay(1500);
                    isSucccessful = false;
            }
        }
    }
}
