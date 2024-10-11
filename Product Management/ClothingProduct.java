public class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price,int id, int quantity, String size) {
        super(name, price,id,quantity);
        this.size = size;
    }

    public void customerDisplay() {
        System.out.println(" ---> ID :  " + id +"  ,Clothing Product: " + name + " , Price: " + price + " dt , Size: " + size);
    }
    public void adminDisplay() {
        System.out.println(" ---> ID :  " + id +"  ,Clothing Product: " + name + " , Price: " + price + " dt , Size: " + size+ "  quantity :  "+quantity);
    }
}