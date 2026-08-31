import java.util.*;

class Main{
    static void main(String [] args){

        //PizzaParty();
        //Converter();
        //MovieTimeTracker();
    }
    public static void PizzaParty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Pizzas were ordered?");
        int pizzas = sc.nextInt();
        System.out.println("How many guests are there?");
        int guests = sc.nextInt();
        int slicesG = pizzas/guests;
        int slicesH = pizzas%guests;
        System.out.println("every guest gets "+slicesG+" Slices,\nand the host is left with "+slicesH+" slices.");
    }
    public static void Converter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much (in cents) is there?");
        int value = sc.nextInt();
        int[] coins = new int[4];
        coins[0] = value/25;
        value-=(coins[0]*25);
        coins[1] = value/10;
        value-=(coins[1]*10);
        coins[2] = value/5;
        value-=(coins[2]*5);
        coins[3]=value;
        System.out.println(coins[0]+" Quarters, "+coins[1]+" Dimes, \n"+coins[2]+" Nickels, and "+coins[3]+" Pennies.");
    }
    public static void MovieTimeTracker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is the movie from start to finish? (in minutes)");
        int[] Duration = new int[2];
Duration[0] = sc.nextInt();
System.out.println("What is it's current time? (in minutes)");
Duration[1] = sc.nextInt
    }
}
