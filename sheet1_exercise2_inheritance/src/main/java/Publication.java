public class Publication {

    private String title;
    private String language;
    private double price;

    public Publication(String title, String language, double price) {
        this.title = title;
        this.language = language;
        this.price = price;
    }

    public void print(){
        System.out.print("\ntitle = " + title + ", language = " + language + ", price = " + price);
    }
}
