
public class StoreApp {
    public static void main(String[] args) {

        Computer comp = new Computer(100, 16, 500, true,7900);
        Laptop laptop = new Laptop(100, 8,0,true,3500, 50);



        System.out.println(comp.info());
        System.out.println(laptop.info());
    }
}
