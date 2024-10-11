
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    HashMap<Integer,Integer> cart;
    public ShoppingCart(){
        cart=new HashMap<Integer,Integer>();
    }
    public void addCart(int id,int quantity,Inventory inv){
        if (inv.quantityEnough(id,quantity)==true){
            cart.put(id, quantity);
            inv.setqAfterAdd(id, quantity);
        }
        else{
            if(inv.inventoryTest(id)==true){
            System.out.println(" insufficient quantity of this product  we have only  "+inv.getq(id));}
            else{
                System.out.println(" product introuvable ");
            }
        }
    }
    public void removeCart(int id,Inventory inv){
        inv.setqAfterRemove(id,(int)cart.get(id));
        cart.remove(id);
    }
    public void seeAll(Inventory inv){
        System.out.println("        ** YOUR CHART **");
        for (Map.Entry m: cart.entrySet()){
            inv.idDisplay((int)m.getKey());
            System.out.println(" quantity : "+m.getValue());
        }
    }
    public double total(Inventory inv){
        double somme=0.0;
        for (Map.Entry m: cart.entrySet()){
            somme=somme+(inv.getpr((int)m.getKey()))*((int)m.getValue());
        }
        return somme;
    }
    public void clear(){
        cart.clear();
    }
    
}
