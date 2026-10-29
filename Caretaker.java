public class Caretaker {
    private String name;
    private int energyLevel = 100;
    public void caretakerName(String name){
        this.name = name;
    }
    public void groomPet(Pet target){
        if(energyLevel<15){
            System.out.println("Caretaker too tired to groom!");
        }
        else{
            energyLevel-=15;
        }
        target.adj
    }
}
