/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teamassignment1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author c0617418
 */
public class TeamAssignment1 {

    private static String cust_id="";
    private static String cust_name="";
    private static String notes="";
    private static String product_id="";
    private static int quant=0;
    private static Date date_Received;
    private static Date Date;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner kb=new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Enter Customer Id");
        System.out.println("Enter the customer Name");
        cust_id=kb.nextLine();
        cust_name=kb.nextLine();
        product_id=kb.nextLine();
        quant=kb.nextInt();
        notes=kb.nextLine();
        
        Order order=new Order(cust_id,cust_name);
        
        Purchase p=new Purchase(product_id,quant);
        
        if(cust_id.equals("") || cust_name.equals("")){
            throw NewException();
        
        }
        else if(p.getProductId().equals("")||p.getQuantity()==0){
            throw NewException();
        }
        else {
         date_Received=date;   
        order.setTimeReceived(Date date_Received);
        
        }
        
    }

    private static Exception NewException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
