import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(100L, "Biancaneve e i diversamente alti", "Books", 101.99),
                new Product(200L, "Filosofie di fancazzismo", "Books", 159.99),
                new Product(300L, "L'è Novo?", "Elettronica", 299.99),
                new Product(400L, "Baby qualcosa", "Baby", 9.99),
                new Product(500L, "Shampoo per mocciosi", "Baby", 8.99),
                new Product(600L, "Harry Potter e l'Ordine della Fagiana", "Boys", 10.99),
                new Product(700L, "Il Signore dei Pastelli", "Boys", 20.99)
        );

        // Qui uso uno stream per filtrare i prodotti
        List<Product> filteredBooks = products.stream()
        // Qui seleziono solo prodotti della categoria "Books"
        .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
        // Qui seleziono solo quelli con prezzo maggiore di 100
         .filter(p -> p.getPrice() > 100)
        // Qui raccolgo il risultato in lista
                .toList();

        // Lista dei prodotti Baby
        List<Product> babyProducts = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Baby"))
                        .toList();

        // Prodotti Boys e 10% di sconto
        List<Product> discountedBoysProducts = products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Boys"))
                        .map(product -> new Product(product.getId(), product.getName(), product.getCategory(),
                                product.getPrice() * 0.9)) .toList();

        // Infine stampo i prodotti filtrati
        filteredBooks.forEach(System.out::println);

        System.out.println("Prodotti Baby");

        System.out.println("Prodotti Boys con 10% di sconto");
        discountedBoysProducts.forEach(System.out::println);

    }
}