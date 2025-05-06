public class Magazine extends Publication {
    private int issue;

    public Magazine(String title, String publisher, int year, double price, int issue) {
        super(title, publisher, year, price);
        this.issue = issue;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("잡지 호수: " + issue);
    }
}