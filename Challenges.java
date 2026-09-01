import java.util.*;
// Alexander Signore
// 9-1-26
class Main{
    static void main(String [] args){
        pizzaParty();
    }
    public static void pizzaParty(){ //Divides pizzas between guests evenly and gives host remainder
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Pizzas were ordered?");
        int pizzas = (sc.nextInt()*8);
        System.out.println("How many guests are there?");
        int guests = sc.nextInt();
        int slicesG = pizzas/guests;
        int slicesH = pizzas%guests;
        System.out.println("every guest gets "+slicesG+" Slices,\nand the host is left with "+slicesH+" slices.");
    }
    public static void converter(){ //calculates cents into their respective coins
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
    public static void movieTimeTracker(){ //find minutes until next hour of movie
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is the movie from start to finish? (in minutes)");
        int[] Duration = new int[2];
        Duration[0] = sc.nextInt();
        System.out.println("What is it's current time? (in minutes)");
        Duration[1] = sc.nextInt();
        int nextHr = Duration[0]%Duration[1];
        System.out.println("There is "+nextHr+" minutes until the next hour.");
    }
    public static void packageOptimized(){ //find large boxes, small boxes, individual, and sales total
        //large has 12, small has 5, and invidual has 1, they sell for 15, 6, and 2.
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cupcakes are there?");
        int[] boxes = new int[3];
        int cupcakes = sc.nextInt();
        boxes[0] = (cupcakes/12);
        cupcakes -= (boxes[0]*12);
    }
    public static void timer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input seconds to convert.");
        int input = sc.nextInt();
        int[] time = new int[];
        time[0] = (input/3600);
        input -= (time[0]*3600);
        time[1] = (input/60);
        input -= (time[1]*60);
        time[2] = input;
        System.out.println(time[0]+":"+time[1]+":"+time[2]+" is the time.");
    }
}
