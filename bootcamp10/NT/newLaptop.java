package bootcamp10.NT;

public class newLaptop extends laptop{
    public void Forcoding(int storage, int ram){
        if(storage >= 256 && ram > 4){
            System.out.println("Laptop for coding!");
        }else{
            System.out.println("Laptop not for coding!");
        }

    }
}
