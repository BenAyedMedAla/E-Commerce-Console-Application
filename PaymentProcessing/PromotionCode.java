package PaymentProcessing;

import java.util.ArrayList;

public class PromotionCode {
    ArrayList<Integer> list;
    public PromotionCode(){
        list=new ArrayList<Integer>();
    }
    public void addCode(int code){
        list.add(code);
    }
    public boolean verifcationCode(int code){
        return (list.contains(code));
    }    
}
