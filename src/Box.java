import java.util.ArrayList;

public class Box implements Packing {

    private ArrayList<Candy> candyBox = new ArrayList<>();

    @Override
    public void add(int index, Candy candy) {
        candyBox.add(index, candy);
    }

    @Override
    public void add(Candy candy) {
        if (candyBox.isEmpty()) candyBox.add(0, candy);
        else candyBox.add(candyBox.size()-1, candy);
    }

    @Override
    public void remove(int index) {
        candyBox.remove(index);
    }

    @Override
    public void remove() {
        candyBox.remove(candyBox.size()-1);
    }

    @Override
    public int getWeight() {
        int weight = 0;
        for (Candy candy : candyBox) {
            weight += candy.getWeight();
        }
        return weight;
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        for (Candy candy : candyBox) {
            price += candy.getPrice();
        }
        return price;
    }

    @Override
    public void getInfo() {
        System.out.println("Price of box: " + getPrice() + " руб.");
        System.out.println("Weight of box: " + getWeight() + " грамм.");
        for (Candy candy : candyBox) {
            System.out.print(candy);
        }
    }

    public void optimizeByWeight(int weight) {
        candyBox.sort((o1, o2) -> {
            if (o1.getWeight() > o2.getWeight()) return 1;
            else if (o1.getWeight() < o2.getWeight()) return -1;
            else return 0;
        });
        while (weight < getWeight()) {
            candyBox.remove(0);
        }
    }

    public void optimizeByPrice(int weight) {
        candyBox.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) return 1;
            else if (o1.getPrice() < o2. getPrice()) return -1;
            else return 0;
        });
        while (weight < getWeight()) {
            candyBox.remove(0);
        }
    }
}
