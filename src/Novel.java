public class Novel extends Publication {
    private String genre;

    public Novel(String title, String publisher, int year, double price, String genre) {
        super(title, publisher, year, price);
        this.genre = genre;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("장르: " + genre);
    }
}