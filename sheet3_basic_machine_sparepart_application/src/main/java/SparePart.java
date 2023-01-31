public class SparePart {
    private Long id;
    private String name;
    private double price;

    public SparePart(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double changePrice(double price){
        this.price = price;
        return price;
    }
}
