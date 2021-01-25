public interface Packing {

    void add(int index, Candy candy);
    void add(Candy candy);
    void remove(int index);
    void remove();
    int getWeight();
    double getPrice();
    void getInfo();
}
