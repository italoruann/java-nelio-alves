package app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import models.entities.ImportedProduct;
import models.entities.Product;
import models.entities.UsedProduct;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            scanner.nextLine();
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = scanner.next().charAt(0);
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            
            switch (option) {
                case 'i' -> {
                    System.out.print("Customs fee: ");
                    double customFee = scanner.nextDouble();
                    products.add(new ImportedProduct(name, price, customFee));
                }
                case 'u' -> {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate manufactureDate = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    products.add(new UsedProduct(name, price, manufactureDate));
                }
                default -> products.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        
        scanner.close();
    }
}
