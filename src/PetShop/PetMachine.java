package PetShop;

public class PetMachine {
    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public void takeAShower(){
        if(this.pet == null) {
            System.out.println("Place the pet in the machine to start the bath.");
            return;
        }

        pet.setClean(true);
        System.out.println("The pet " + pet.getName() + " is clean.");
    }

    public void addWater(){
        if(water == 10){
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        water += 2;
    }
    

    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("The machine's shampoo capacity is at maximum.");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

}
