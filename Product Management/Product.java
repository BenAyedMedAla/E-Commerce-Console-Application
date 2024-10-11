import java.util.ArrayList;

public abstract class Product {
    protected String name;
    protected double price;
    protected int id;
    protected int quantity;
    protected ArrayList<String> reviews=new ArrayList<String>();
    protected ArrayList<Double> rates=new ArrayList<Double>();
    public Product(String name, double price,int id,int quantity) {
        this.name = name;
        this.price = price;
        this.id=id;
        this.quantity=quantity;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public abstract void adminDisplay();
    public abstract void customerDisplay();
    public void addReview(String s){
        reviews.add(s);
    }
    public void addRate(Double d){
        rates.add(d);
    }
    public double getRate(){
        double sum=0;
        for (double d:rates){
            sum+=d;
        }
        return (sum/rates.size());
    }
    public void seeReviews(){
        for (String s:reviews){
            System.out.println(s);
        }
        System.out.println(" rate : "+this.getRate());
    }

}

