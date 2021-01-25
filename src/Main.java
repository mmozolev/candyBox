public class Main {
    public static void main(String[] args) throws Exception {
        Box candyBox = new Box();
        candyBox.add(new Lollypop("Барбарис", 300, 43.50, 70));
        candyBox.add(new Gingerbread("Шоколадный пряник", 350, 75.20, 25));
        candyBox.add(0, new Chocolate("Алёнка", 100, 60.99, 75));
        candyBox.add(2, new ChocolateCandy("Ласточка", 150, 35.20, 85));
        candyBox.getInfo();
        System.out.println();

        candyBox.optimizeByPrice(600);
        candyBox.getInfo();
    }
}
