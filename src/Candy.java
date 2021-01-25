public abstract class Candy {
    private String name;
    private int weight;
    private double price;
    private int sugarContent;

    public Candy(String name, int weight, double price, int sugarContent) throws Exception {
        if (sugarContent >= 0 && sugarContent <=100) {
            this.name = name;
            this.weight = weight;
            this.price = price;
            this.sugarContent = sugarContent;
        }
        else throw new Exception("Invalid field. sugarContent must be between 0 and 100");
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    @Override
    public String toString() {
        return String.format("Name: %s , Weight: %d грамм, Price: %.2f руб., SugarContent: %d%%\n",
                name, weight, price, sugarContent);
    }
}
