import java.util.ArrayList;

public class Login {
    private int typeOfowner; 
    private ArrayList<String> customerAdressList;
    private ArrayList<String> customerPasswordList;
    private ArrayList<String> adminAdressList;
    public ArrayList<String> adminPasswordList;
    private String result="";
    public Login(){
        customerAdressList=new ArrayList<String>();
        customerPasswordList=new ArrayList<String>();
        adminAdressList=new ArrayList<String>();
        adminPasswordList=new ArrayList<String>();
       
    }
    public String getResult() {
        return result;
    }
    public void opening(int typeOfowner,String mailAdress,String password){
        this.typeOfowner=typeOfowner;    
            if(this.typeOfowner==1){
                if(adminAdressList.contains(mailAdress)){
                    if(adminPasswordList.contains(password)){
                        System.out.println("");
                        System.out.println("                        ***WELCOM ADMIN***             ");
                        this.result="yes";
                    }
                    else{
                        System.out.println("  Invalid password  ");
                        this.result="no";
                    }
                }
                else{
                    System.out.println(" you dont have account do you want to join us ?");
                    this.result="nothing";
                }
            }
            else{
            if(customerAdressList.contains(mailAdress)){
                    if(customerPasswordList.contains(password)){
                        System.out.println("");
                        System.out.println("                    ***WELCOM CUSTOMER***       ");
                        this.result="yes";
                    }
                    else{
                        System.out.println("  Invalid password  ");
                        this.result="no";
                    }
                }
                else{
                    System.out.println(" you dont have account do you want to join us ?");
                    this.result="nothing";
                }
            }
    }
public void signing(int typeOfowner,String mailAdress,String password){
        if (typeOfowner==1){
            adminAdressList.add(mailAdress);
            adminPasswordList.add(password);
            System.out.println(" welcome admin ");
        }
        if(typeOfowner==2){
            customerAdressList.add(mailAdress);
            customerPasswordList.add(password);
        System.out.println("  welcome customer  ");
        }

    }
}
    
    

    
