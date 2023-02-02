package crud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CRUD {

    private static String p;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Components> c = new ArrayList<Components>();
       
        Scanner s = new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        int ch;
       do{
         System.out.println("1. Add Record ");
         System.out.println("2. Display record");
         System.out.println("3. report/search Record");
         System.out.println("4. Delete Record");
         System.out.println("5. Edit Record");
         System.out.println("0. exit");
         System.out.println("please choose a number:");
         
         ch = s.nextInt();
       switch(ch){
           case 1:
                System.out.print("ENTER NAME : ");
                
               String ne = s1.nextLine();
               
               System.out.print("ENTER CODE : ");
               int ce = s.nextInt();
              
                
                System.out.print("ENTER PERIPHERALS:"
                        + " please choose and TYPE WHAT YOU CHOOSE:"
                        + "input peripheral, output peripHeral, input/output pheripheral : ");
               String pe =s1.nextLine();
               c.add(new Components(ne,ce,pe));
             break;
           case 2:
               System.out.println("----------------------");
                Iterator<Components> i = c.iterator();
                while(i.hasNext()){
                 Components e = i.next();
                 System.out.println(e);
                }
                System.out.println("----------------------");
                
               break;
           case 3:
             boolean found = false;
               System.out.println("Enter Code to Search :");
             int code = s.nextInt();
               System.out.println("----------------------");
                i = c.iterator();
                while(i.hasNext()){
                 Components e = i.next();
                 if(e.getcode()== code) { 
                  System.out.println(e);
                  found = true;
                  }
                } 
                if(!found){
                    System.out.println("Record not found");
                }
                
                System.out.println("----------------------");
                
               break;  
            case 4:
            found = false;
               System.out.println("Enter Code to Delete :");
              code = s.nextInt();
               System.out.println("----------------------");
                i = c.iterator();
                while(i.hasNext()){
                 Components e = i.next();
                 if(e.getcode()== code) { 
                  i.remove();
                  found = true;
                  }
                } 
                if(!found){
                    System.out.println("Record not found");
                }
                else{
                    System.out.println("Record is Succesfully Deleted...!");
                }
                
                System.out.println("----------------------");
                
               break;  
           case 5:
            found = false;
               System.out.println("Enter Code to Update :");
              code = s.nextInt();
               System.out.println("----------------------");
                ListIterator<Components>li = c.listIterator();
                while(li.hasNext()){
                 Components e = li.next();
                 if(e.getcode()== code) { 
                  System.out.println("ENTER NEW NAME : ");
                   String name = s1.nextLine();
                
                   System.out.println("ENTER NEW PERIPHERAL : ");
                   String peripheral = s.nextLine();
                   li.set(new Components(name,code,peripheral));
                  found = true;
                  }
                } 
                if(!found){
                    System.out.println("Record not found");
                }
                else{
                    System.out.println("Record is Succesfully Updated...!");
                }
                
                System.out.println("----------------------");
                
               break;  
  
       }      
       
 
         
       }while(ch!=0);
        
        
     
    }
}
  






class Components {
          
          private String name;
          private int code;
          private String peripheral;
          
        Components(String name, int code, String peripheral){
            
            this.name = name;
            this.code = code;
            this.peripheral = peripheral;
            
        }

    Components(String ne, String pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Components(String ne, String ce, String pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
         public String getname(){
          return name;
         
        } 
          
        public int getcode(){
          return code;
         
        } 
         public String getperipheral(){
          return peripheral;
        } 
         public String toString(){
          return name+""+code+""+peripheral;
        
        
        }
    
        }
