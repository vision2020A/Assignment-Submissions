public class Pet {
    private String name;
    private String species;
    private int hunger;
    private int happiness;
    public void setPet(String name,String species){
        int hunger = 50;
        int happiness = 50;
        this.name = name;
        this.species = species;
    }
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public int getHunger(){
        return hunger;
    }
    public int getHappiness(){
        return happiness;
    }
    private void adjustStats(int hungerChange,int happinessChange){
        hunger = Math.clamp(hunger+hungerChange, 0, 100);
        happiness = Math.clamp(happiness+happinessChange,0,100);
    }
    public void feed(){
        adjustStats(-15,0);
        System.out.println("Your "+species+" "+name+" ate a simple meal");
    }
    public void feed(String treatType, int calorieBoost){
        adjustStats(-calorieBoost,5);
        System.out.println("Your "+species+" "+name+" ate a "+treatType+", and it had "+calorieBoost+" Calories!");
    }
    public void play(int minutes){
        if(minutes>0){
            adjustStats(-minutes,minutes*2);
            System.out.println("Your "+species+" "+name+" played for "+min utes+" minutes, and increased their happiness by "+minutes*2+" plus their hunger by -"+minutes+".");
        }else{
            System.out.println("You cant seriously bend time can you?\nPet isn't happy that you attempted to bend the laws of reality.\nDo you really want to erase the time you spent with your pet?? Messed up. -20 happyness.");
            adjustStats(0,-20);
        }

    }
    public String getStatus(){
        return (name+" - ["+species+"] - Hunger: "+hunger+"/100 | Happiness: "+happiness+"/100");
    }
    public void groom(){
        adjustStats(0,15);
        System.out.println("Your "+species+", "+name+" Was groomed, and gained 15 happiness!");
    }
}
