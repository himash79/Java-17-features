package himash.sealClasses;

public sealed class Market permits Laptop {

    public static void main(String[] args) {

        Laptop l = new Laptop(1,"Dell","XPS Pro",100.00,false);
        System.out.println(l);
    }

}
