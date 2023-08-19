package himash.switchPattern;

import himash.util.Book;
import himash.util.Car;

public class Illustration_01 {

    public static void main(String[] args) {

        Car c = new Car(1, "Toyota", "axio",500.00, true);
        Book b = new Book(1, "Adventure", "Sherlock homes","George", 200.00, false);
        System.out.println(evaluate(b));
        System.out.println("======================================================================");
        System.out.println(evaluate_2(b));
        System.out.println("======================================================================");
        System.out.println(newMultiSwitch(1));
        System.out.println("======================================================================");
        System.out.println(newSwitch(1));
    }

    private static String evaluate(Object obj) {
        return switch(obj) {
            case Car c -> "Manufacture is : %s\nmodel is : %s\nprice is : %s\nproduct is : %s".formatted(
                    c.getManufacture(),c.getModel(),c.getCost(),c.isStatus() ? "Available" : "N/A");
            case Book b -> "Category is : %s\nName is : %s\nAuthor is : %s\nCost is : %s\nProduct is : %s".formatted(
                    b.getCategory(),b.getName(),b.getAuthor(),b.getCost(),b.isStatus() ? "Available" : "N/A");
            default -> "Details error found";
        };
    }

    private static String evaluate_2(Object obj) {
        return switch(obj) {
            case Car c && (c.isStatus()) -> "Vehicle item available";
            case Car c && (!c.isStatus()) -> "Vehicle item not available";
            case Book b  && (b.isStatus())-> "Book item available";
            case Book b  && (!b.isStatus())-> "Book item not available";
            default -> "Details error found";
        };
    }

    public static String newSwitch(int number) {
        return switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "other";
        };
    }

    public static String newMultiSwitch(int day) {
        return switch (day) {
            case 1, 2, 3, 4, 5 -> "workday";
            case 6, 7 -> "weekend";
            default -> "invalid";
        };
    }

}
