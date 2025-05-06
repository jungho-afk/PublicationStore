import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Publication> items = new ArrayList<>();

    public void addItem(Publication pub) {
        items.add(pub);
        System.out.println(pub.getTitle() + " 추가됨!");
    }

    public void removeItem(String title) {
        items.removeIf(p -> p.getTitle().equals(title));
        System.out.println(title + " 제거됨!");
    }

    public void printCart() {
        System.out.println("=== 장바구니 목록 ===");
        for (Publication pub : items) {
            pub.printInfo();
        }
    }
}