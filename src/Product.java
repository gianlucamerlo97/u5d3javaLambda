public class Product {

    // Procedo a dichiarare le proprietà di Product
    private Long id;
    private String name;
    private String category;
    private double price;

    // Costruttore del nostro Product
    public Product(Long id, String name, String category, double price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Qui scrivo i getters
    public Long getId(){return id;}
    public String getName(){return name;}
    public String getCategory(){return category;}
    public double getPrice(){return price;}

    @Override
    public String toString(){
        return "Prodotto: id = " + id + ", nome = " + name + ", categoria = " + category + ", prezzo = " + price;
    }
}
