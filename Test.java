import java.util.Scanner;

import PaymentProcessing.CreditCard;
import PaymentProcessing.PromotionCode;

public class Test {
    public static void main(String[] args) {
        System.out.println("       **WELCOM to the E-Commerce Console Application**      ");
        System.out.println("");
        System.out.println("");
        int stop;
        int log;
        String mailadress;
        String password;
        Login l=new Login();
        int type;
        Inventory inventory=new Inventory();
        PromotionCode pcode=new PromotionCode();
        Scanner sc=new Scanner(System.in);
do{    
        
        do {
                System.out.println("    Do you want to LOGIN or SIGN UP ? ");
                System.out.println("respond by(1:login / 2:signup) ");
                int response=sc.nextInt();
                System.out.println("   who are you ? respond by( 1:admin/ 2:customer ) :");
                System.out.println("");
                type=sc.nextInt();
                
                if (response==1){
                    System.out.println("   email adress :");
                    System.out.println("");
                    mailadress=sc.next();
                    do{
                    System.out.println("   password :");
                    System.out.println("");
                    password=sc.next();
                    l.opening(type,mailadress,password);
                }while(l.getResult()=="no");
                        if(l.getResult()=="yes") break;}
                
                if (response==2 || l.getResult()=="nothing") {
                    System.out.println("   Your Firstname :");
                    System.out.println("");
                    String fname=sc.next();
                    System.out.println("   Your Lastname :");
                    System.out.println("");
                    String lname=sc.next();
                    System.out.println("   Your age :");
                    System.out.println("");
                    int age=sc.nextInt();
                    System.out.println("  write your email adress :");
                    System.out.println("");
                    mailadress=sc.next();
                    System.out.println("  write your password :");
                    System.out.println("");
                    password=sc.next();
                    System.out.println(type);
                    l.signing(type,mailadress,password);
                }
                System.out.println("");
                System.out.println("    Do you want to repeat? (1:YES / 2: NO) ");
                log=sc.nextInt();
            }while(log==1);

    if(type==1){
            do{
            System.out.println("1: creat new product ");
            System.out.println("2: modify a product ");
            System.out.println("3: delet a product   ");
            System.out.println("4: see all products ");
            System.out.println("5: search a product (type letters of the product you are searching for )");
            System.out.println("6: add a promotioncode");
            System.out.println("0: LOGOUT");
            log=sc.nextInt();
            switch (log) {
                case 1:
                    System.out.println("");
                    System.out.println(" 1:electronic / 2:clothing");
                    int c;
                    String name;
                    Double price;
                    int id;
                    int quantity;
                    c=sc.nextInt();
                    System.out.println("! unique ID :");
                    id=sc.nextInt();
                    System.out.println("name :");
                    name=sc.next();
                    System.out.println("Price :");
                    price=sc.nextDouble();
                    System.out.println("Quantity :");
                    quantity=sc.nextInt();
                    if (c==1){
                        ElectronicProduct p;
                        String powersource;
                        System.out.println(" powersource :");
                        powersource=sc.next();
                        p=new ElectronicProduct(name, price, id, quantity, powersource);
                        inventory.ajout(p);
                    }
                    else{
                        ClothingProduct p;
                        String size;
                        System.out.println("size (S,M,L,XL,XXL...) :");
                        size=sc.next();
                        p=new ClothingProduct(name, price, id, quantity,size);
                        inventory.ajout(p);
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println(" ID of the product to modify ");
                    int i;
                    int q;
                    double p;
                    i=sc.nextInt();
                    System.out.println("");
                    System.out.println("new price : ");
                    p=sc.nextDouble();
                    System.out.println("new quantity : ");
                    q=sc.nextInt();
                    inventory.modify(i,q,p);
                    break;
                case 3:
                    System.out.println("");
                    System.out.println(" ID of the product to delet :");
                    int i2;
                    i2=sc.nextInt();
                    inventory.delet(i2);
                    break;
                case 4:
                    System.out.println("");
                    inventory.seeAll(type);
                    break;
                case 5:
                    System.out.println("");
                    System.out.println(" write :");
                    String s;
                    s=sc.next();
                    inventory.search(s,type);
                    break;
                case 6:
                    int codd;
                    System.out.println(" write a code :"); 
                    codd=sc.nextInt();
                    pcode.addCode(codd);
                case 0:
                    break;
                default:
                    break;
            }
            System.out.println("");
        }while(log!=0);
        }
        else{
            double balance;
            int code;
            System.out.println("give your creditcard a balance ");
            balance=sc.nextDouble();
            System.out.println("give your creditcard a code");
            code=sc.nextInt();
            CreditCard creditCard= new CreditCard(code, balance);
            ShoppingCart cart=new ShoppingCart();
            do{
            System.out.println("1: search a product (type letters of the product you are searching for ) ");
            System.out.println("2: see all products ");
            System.out.println("3: add an item to your chart ");
            System.out.println("4: remove an item from your chart ");
            System.out.println("5: modify the chart ");
            System.out.println("6: see your chart ");
            System.out.println("7: add a review about a product ");
            System.out.println("8: payment ");
            System.out.println("0: LOGOUT");
            log=sc.nextInt();
            switch (log) {
                case 1:
                    System.out.println("");
                    System.out.println(" write :");
                    String s;
                    s=sc.next();
                    inventory.search(s,type);
                    break;
                case 2:
                    System.out.println("");
                    inventory.seeAll(type);
                    break;
                case 3:
                    int i3; 
                    int q3;   
                    System.out.println("");
                    System.out.println(" ID of the product to add in the chart :");
                    i3=sc.nextInt();
                    System.out.println(" quantity of the product to add in the chart :");
                    q3=sc.nextInt();
                    cart.addCart(i3, q3, inventory);
                    break;
                case 4:
                    cart.seeAll(inventory);
                    int i4;
                    System.out.println("");
                    System.out.println(" ID of the product to remove from the chart :");
                    i4=sc.nextInt();
                    cart.removeCart(i4,inventory);
                    break;
                case 5:
                    cart.seeAll(inventory);
                    int i5;
                    int q5;
                    System.out.println("");
                    System.out.println(" ID of the product :");
                    i5=sc.nextInt();
                    System.out.println(" new quantity  :");
                    q5=sc.nextInt();
                    if(q5<=inventory.getq(i5)){
                        cart.removeCart(i5,inventory);
                        cart.addCart(i5, q5, inventory);
                    }
                    else {
                        System.out.println("insufficient quantity of this product  we only have  "+inventory.getq(i5));
                    }
                    break;
                case 6:
                    cart.seeAll(inventory);
                    break;
                case 7:
                    int i7;
                    double rate;
                    String review;
                    System.out.println("");
                    System.out.println(" ID of the product :");
                    i7=sc.nextInt();
                    System.out.println(" rate :");
                    rate=sc.nextDouble();
                    System.out.println(" comment:  (use '_' as ' ')");
                    review=sc.next();
                    inventory.addreview(i7, review, rate);
                    break;
                case 8:
                    int cod;
                    int repitation=0;
                    int respo;
                    do{
                    System.out.println("");
                    System.out.println("enter your creditcard pincode :");
                    cod=sc.nextInt();
                    if(cod==creditCard.getCode()){
                        break;
                    }
                    System.out.println(" verify your creditcard pincode ! ");
                    }while(repitation<3);
                    if(cod==creditCard.getCode()){
                        double total=cart.total(inventory);
                        System.out.println("Total ="+total);
                        System.out.println("do you have a promotioncode ? (1: yes / 2: no)");
                        respo=sc.nextInt();
                        if (respo==1){
                            System.out.println("write the code :");
                            cod=sc.nextInt();
                            if(pcode.verifcationCode(cod)==true){
                                System.out.println(" **CONGRATULATIONS YOU HAVE 40% OFF**");
                                total=total-(total*40)/100;
                            }
                            else{
                                System.out.println(" invalid code");
                            }
                        }
                        boolean test=creditCard.payment(total);
                        if (test==true){
                            cart.clear();
                            System.out.println("your balance = "+creditCard.getBalance()+" dt");
                        }   
                    }break;       
                case 0:
                    break;
                default:
                    break;
            }
            System.out.println("");
        }while(log!=0);
        }
System.out.println("");
System.out.println("    Do you want to repeat the procedeer? (1:YES / 2: NO) ");
log=sc.nextInt();
if(log==2){
    System.out.println("        **GOOD BYE**");
}
}while(log==1);
   }
}

