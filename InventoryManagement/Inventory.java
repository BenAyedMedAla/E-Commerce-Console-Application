import java.util.ArrayList;

    public class Inventory {
        ArrayList <ClothingProduct> clothingList;
        ArrayList <ElectronicProduct> electronicList;
 
public Inventory(){
        clothingList=new ArrayList<ClothingProduct>();
        electronicList=new ArrayList<ElectronicProduct>();
    }
public void ajout(Product p){
        Boolean test=true;
        for(ClothingProduct a:clothingList){
            if(a.getId()==p.getId()){
                test=false;
                System.out.println("this ID exist ");
            } 
        }
        for(ElectronicProduct a:electronicList){
            if(a.getId()==p.getId()){
                test=false;
                System.out.println("this ID exist ");
            } 
        }
        if(test==true)
        if (p instanceof ClothingProduct){
            clothingList.add((ClothingProduct)p);
        }
        else{
            electronicList.add((ElectronicProduct)p);
        }
    }
public void modify(int id,int quantity,double price){
    boolean test=false;
    for(ClothingProduct a:clothingList){
            if(a.getId()==id){
                a.setPrice(price);
                a.setQuantity(quantity);
                a.adminDisplay();
                test=true;
            } 
        }
    for(ElectronicProduct a:electronicList){
           if(a.getId()==id){
                a.setPrice(price);
                a.setQuantity(quantity);
                a.adminDisplay();
                test=true;
            } 
        }
    if(test==false){
        System.out.println("  product introuvable ");
    }
}
public void delet(int id){
    boolean test=false;
    for(ClothingProduct a:clothingList){
            if(a.getId()==id){
                clothingList.remove(a);
                test=true;
                System.err.println(" *product removed ");
            } 
        }
    for(ElectronicProduct a:electronicList){
           if(a.getId()==id){
                electronicList.remove(a);
                System.err.println(" *product removed ");
                test=true;
            } 
        }
    if(test==false){
        System.out.println("  product introuvable ");
    } 
}
public void seeAll(int type){
    if (type==1){
    System.out.println("");
    System.out.println("         **CLOTHINGPRODUCTS** ");
    for(ClothingProduct a:clothingList){
            a.adminDisplay();
            a.seeReviews();
            } 
     System.out.println("");
    System.out.println("         **ELECTRONICPRODUCTS** ");       
    for(ElectronicProduct a:electronicList){
           a.adminDisplay();
           a.seeReviews();
        }
    }
    else{
    System.out.println("");
    System.out.println("         **CLOTHINGPRODUCTS** ");
    for(ClothingProduct a:clothingList){
            a.customerDisplay();
            a.seeReviews();
            } 
     System.out.println("");
    System.out.println("         **ELECTRONICPRODUCTS** ");       
    for(ElectronicProduct a:electronicList){
           a.customerDisplay();
           a.seeReviews();
        }

    }
}
public void search(String s,int type){
    if (type==1){
         for(ClothingProduct a:clothingList){
            if(a.getName().lastIndexOf(s)!=-1){
                a.adminDisplay();
                a.seeReviews();
            } 
        }
    for(ElectronicProduct a:electronicList){
           if(a.getName().lastIndexOf(s)!=-1){
                a.adminDisplay();
                a.seeReviews();
            } 
        }
    }
   else{
    for(ClothingProduct a:clothingList){
            if(a.getName().lastIndexOf(s)!=-1){
                a.customerDisplay();
                a.seeReviews();
            } 
        }
    for(ElectronicProduct a:electronicList){
           if(a.getName().lastIndexOf(s)!=-1){
                a.customerDisplay();
                a.seeReviews();
            } 
        }
   }
}
public boolean quantityEnough(int id,int quantity){
    boolean test=false;
    for(ElectronicProduct a:electronicList){
        if(a.id==id){
            test=true;
            return (a.getQuantity()>=quantity);    
            }
        }
    for(ClothingProduct a:clothingList){
            if(a.getId()==id){
                test=true;
                return (a.getQuantity()>=quantity);
            } 
        }
    if (test==false){
        System.out.println(" product introuvable verify the ID");
    }
    return test;
    }
public int getq(int id){
    int x=0;
    for(ElectronicProduct a:electronicList){
        if(a.id==id){
             x=a.getQuantity();    
            }
        }
    for(ClothingProduct a:clothingList){
            if(a.getId()==id){
            x=a.getQuantity();
            } 
    }
    return x;
    }
public double getpr(int id){
    double x=0;
    for(ElectronicProduct a:electronicList){
        if(a.id==id){
             x=a.getPrice();    
            }
        }
    for(ClothingProduct a:clothingList){
            if(a.getId()==id){
            x=a.getPrice();
            } 
    }
    return x;
    }
public void setqAfterAdd(int id,int quantity){
    for(ElectronicProduct a:electronicList){
        if(a.getId()==id){
             a.setQuantity(a.getQuantity()-quantity);  
            }
        }
    for(ClothingProduct a:clothingList){
            if(a.getId()==id){
            a.setQuantity(a.getQuantity()-quantity);
            } 
}
}
public void setqAfterRemove(int id,int quantity){
    for(ElectronicProduct a:electronicList){
        if(a.getId()==id){
             a.setQuantity(a.getQuantity()+quantity);  
            }
        }
    for(ClothingProduct a:clothingList){
            if(a.getId()==id){
            a.setQuantity(a.getQuantity()+quantity);
            } 
}
}
public boolean inventoryTest(int id){
    boolean test=false;
    for(ElectronicProduct a:electronicList){
        if(a.id==id){
            test=true;    
            }
        }
    for(ClothingProduct a:clothingList){
            if(a.getId()==id){
                test=true;
            } 
        }
    return test;
}
public void idDisplay(int id){
    for(ClothingProduct a:clothingList){
        if (a.getId()==id){
            a.customerDisplay();
        }    
    }   
    for(ElectronicProduct a:electronicList){
        if (a.getId()==id){
            a.customerDisplay();
        }    
    }
}
public void addreview(int id,String s,double d){
    for(ClothingProduct a:clothingList){
        if (a.getId()==id){
            a.addRate(d);
            a.addReview(s);
        }    
    }   
    for(ElectronicProduct a:electronicList){
        if (a.getId()==id){
            a.addRate(d);
            a.addReview(s);
        }    
    }
}

}

    

