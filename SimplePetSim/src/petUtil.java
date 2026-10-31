public class petUtil {
    public static String evaluateWellbeing(Pet target) {
        if (target.getHunger() > 80)
            return("CRITICAL!! Your "+target.getName()+" is starving! D:");
        else if (target.getHappiness() < 20)
            return("WARNING: "+target.getName()+" is very depressed!");
        else
            return("Healthy: Your "+target.getName()+" is healthy!");
    }
    public static boolean canPlayTogether(Pet p1, Pet p2){
        return p1.getHunger() < 75 && p2.getHunger() < 75 && p1.getHappiness() < 75 && p2.getHappiness() < 75;
    }
}
