public class Customer {
    private Long id;
    private String name;
    int tier;

    public Customer(Long id, String name, int tier){
        this.id = id;
        this.name= name;
        this.tier = tier;
}

    // Getters


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
