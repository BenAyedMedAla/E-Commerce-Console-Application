public class ElectronicProduct extends Product {
    private String powerSource;

    public ElectronicProduct(String name, double price, int id,int quantity ,String powerSource) {
        super(name, price,id,quantity);
        this.powerSource = powerSource;
    }

    public void customerDisplay() {
            System.out.println(" ---> ID : " + id+ "  ,Electronic Product: " + name + " , Price: " + price +" dt ,powersource: "+powerSource );   
    }
    public void adminDisplay() {
            System.out.println(" ---> ID : " + id+ "  ,Electronic Product: " + name + " , Price: " + price +" dt ,powersource: "+powerSource +"  quantity :  "+quantity);   
    }
}
