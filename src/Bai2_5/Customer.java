package Bai2_5;

public class Customer {
    private int id;
    private String name;
    private char gender;
    private int discount;
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId(){
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return this.name + "(" + id + ")";
    }
}
