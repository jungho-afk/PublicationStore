public class Main {
    public static void main(String[] args) {
        Magazine mag = new Magazine("과학동아", "동아사이언스", 2024, 8000, 5);
        Novel novel = new Novel("해리포터", "문학사", 2001, 12000, "판타지");
        Textbook text = new Textbook("자바 프로그래밍", "교육출판", 2023, 15000, "컴퓨터");

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(mag);
        cart.addItem(novel);
        cart.addItem(text);

        cart.printCart();

        novel.applyDiscount(0.1); // 10% 할인
        System.out.println("할인 적용 후:");
        cart.printCart();
    }
}