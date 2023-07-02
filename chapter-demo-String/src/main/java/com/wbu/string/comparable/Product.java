package com.wbu.string.comparable;

/**
 * @auther 11852
 * @create 2023/6/9
 */
public class Product implements Comparable{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o==this){
            return 0;
        }
        if(o instanceof Product){
//            return this.compareTo(this.price);
            Product product = (Product) o;
//            return Integer.compare(this.price,price);
            int value = Integer.compare(this.price, product.price);
            if (value!=0){
                return -value;
            }
            return -this.name.compareTo(product.name);
//            return name.compareTo(this.name);
        }
        throw new RuntimeException("类型不匹配");
    }
}
