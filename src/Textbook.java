public class Textbook extends Publication {
    private String subject;

    public Textbook(String title, String publisher, int year, double price, String subject) {
        super(title, publisher, year, price);
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("과목: " + subject);
    }
}