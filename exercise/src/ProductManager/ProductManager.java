package ProductManager;

import java.util.*;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> lists = new ArrayList<>();

    public static void addProduct() {
        Product product = createProduct();
        lists.add(product);
    }

    private static Product createProduct() {
        System.out.println("Enter product id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product price: ");
        Float price = Float.parseFloat(sc.nextLine());

        Product product = new Product(id, name, price);
        return product;
    }

    public static void editProduct() {
        System.out.println("Enter id: ");
        int index = Integer.parseInt(sc.nextLine());
        if (findByIndex(index) == -1) {
            System.out.println("Not found id");
        } else {
            System.out.println("--Enter new product--");
            Product product = createProduct();
            lists.set(findByIndex(index), product);
        }
    }

    private static int findByIndex(int index) {

        if ((index) >= lists.size()) {
            return -1;
        } else {
            return index;
        }
    }

    public static void deleteProduct() {
        System.out.println("Enter id: ");
        int index = Integer.parseInt(sc.nextLine());
        if (findByIndex(index) == -1) {
            System.out.println("Not found id");
        } else {
            lists.remove(findByIndex(index));
        }
    }

    public static void showProduct() {
        for (Product p : lists) {
            System.out.println(p);
        }
    }

    public static void findProduct() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        for (Product p : lists) {
            if (p.getName().equals(name)) {
                System.out.println(p);
                break;
            }
        }

    }

    public static void sortProduct() {
        Collections.sort(lists);
    }


}
