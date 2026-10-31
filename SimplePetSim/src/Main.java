void main() {
    Scanner sc = new Scanner(System.in);
    Pet p1 = new Pet();
    Pet p2 = new Pet();
    Caretaker petSitter = new Caretaker();
    String name;
    String species;
    IO.println("Whats the name of your first pet?");
    name = sc.nextLine();
    IO.println("Whats " + name + "'s Species?");
    species = sc.nextLine();
    p1.setPet(name, species);
    IO.println("Whats the name of your second pet? (Yes you have to have a second pet");
    name = sc.nextLine();
    IO.println("Whats " + name + "'s Species?");
    species = sc.nextLine();
    p2.setPet(name, species);
    boolean sim = true;
    int input;
    while (sim) {
        IO.println("What would you like to do?");
        options();
        try {
            input = sc.nextByte();
        } catch (Exception e) {
            input = 127;
        }
        switch (input) {
            case 127:
                IO.println("ERR, invalid input. Try entering a number between 1 and 6.");
                break;
            case 1:
                IO.println("Would you like to feed " + p1.getName() + "(1), " + p2.getName() + "(2), or both?(3)");
                try {
                    input = sc.nextByte();
                } catch (Exception e) {
                    input = 0;
                }
                switch (input) {
                    case 0:
                        IO.println("ERR, Not a Byte.");
                        break;
                    case 1:
                        p1.feed();
                        break;
                    case 2:
                        p2.feed();
                    case 3:
                        p1.feed();
                        p2.feed();
                        break;
                    default:
                        IO.println("Invalid response! enter 1, 2, or 3.");
                        break;
                }
                break;
            case 2:
                IO.println("Which pet would you like to play with? " + p1.getName() + "?(1) " + p2.getName() + "?(2) or both?(3)");
                try {
                    input = sc.nextByte();
                } catch (Exception e) {
                    input = 0;
                }
                switch (input) {
                    case 0:
                        IO.println("ERR, Not a Byte.");
                        break;
                    case 1:
                        IO.println("How many minutes?");
                        try {
                            input = sc.nextInt();
                        } catch (Exception e) {
                            input = 0;
                        }
                        p1.play(input);
                        break;
                    case 2:
                        IO.println("How many minutes?");
                        try {
                            input = sc.nextInt();
                        } catch (Exception e) {
                            input = 0;
                        }
                        p2.play(input);
                        break;
                    case 3:
                        IO.println("How many minutes?");
                        try {
                            input = sc.nextInt();
                        } catch (Exception e) {
                            input = 0;
                        }
                        p1.play(input);
                        p2.play(input);
                        break;
                    default:
                        IO.println("Invalid response! please use 1, 2, or 3.");
                        break;
                }
                break;
            case 3:
                IO.println("Which pet? " + p1.getName() + "?(1), " + p2.getName() + "?(2) or both?(3)");
                try {
                    input = sc.nextByte();
                } catch (Exception e) {
                    input = 0;
                }
                switch (input) {
                    case 0:
                        IO.println("ERR, Not a Byte.");
                        break;
                    case 1:
                        p1.groom();
                        break;
                    case 2:
                        p2.groom();
                        break;
                    case 3:
                        p1.groom();
                        p2.groom();
                        break;
                    default:
                        IO.println("Enter 1, 2, or 3.");
                        break;
                }//START HERE
                break;
            case 4:
                IO.println("Which pet? " + p1.getName() + "?(1), " + p2.getName() + "?(2) or both?(3)");
                try {
                    input = sc.nextByte();
                } catch (Exception e) {
                    input = 0;
                }
                switch (input) {
                    case 0:
                        IO.println("ERR, Not a Byte");
                        break;
                    case 1:
                        IO.println(petUtil.evaluateWellbeing(p1));
                        break;
                    case 2:
                        IO.println(petUtil.evaluateWellbeing(p2));
                        break;
                    case 3:
                        IO.println(petUtil.evaluateWellbeing(p1));
                        IO.println(petUtil.evaluateWellbeing(p2));
                        break;
                    default:
                        IO.println("Enter 1, 2, or 3.");
                        break;
                }
                break;
            case 5:
                petUtil.advanceTime(p1, p2, petSitter);
                break;
            case 6:
                sim = false;
                IO.println("Simulation ended.");
                IO.println(petUtil.evaluateWellbeing(p1));
                IO.println(petUtil.evaluateWellbeing(p2));
                break;
            default:
                IO.println("Try again! put a number between 1 and 6!");
                break;
        }
        sc.nextLine();
    }
    petUtil.advanceTime(p1, p2, petSitter);
}

private static void options() {
    IO.println("1. Feed Pet");
    IO.println("2. Play with Pet");
    IO.println("3. Have Caretaker Groom Pet");
    IO.println("4. Check Health Analytics");
    IO.println("5. Advance Time");
    IO.println("6. Exit Simulation");
}