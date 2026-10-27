public class Pet {
    String name;
    String species;
    int hunger;
    int happyness;
    public void defaults(){
        hunger = 50;
        happyness = 50;
    }
    public void Traits(String name,String species){
        this.name = name;
        this.species = species;
    }
}
