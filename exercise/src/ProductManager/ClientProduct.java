package ProductManager;

import java.util.Scanner;

public class ClientProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Product Manager");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Find Product By Name");
            System.out.println("5. Sort Products");
            System.out.println("6. Show Product");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.editProduct();
                    break;
                case 3:
                    ProductManager.deleteProduct();
                    break;
                case 4:
                    ProductManager.findProduct();
                    break;
                case 5:
                    ProductManager.sortProduct();
                    break;
                case 6:
                    ProductManager.showProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
