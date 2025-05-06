public class Publication {
    private String title;
    private String publisher;
    private int year;
    private double price;

    public Publication(String title, String publisher, int year, double price) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    // Getter/Setter
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void applyDiscount(double rate) {
        this.price *= (1 - rate);
    }

    public void printInfo() {
        System.out.println(title + " | " + publisher + " | " + year + " | " + price);
    }
}