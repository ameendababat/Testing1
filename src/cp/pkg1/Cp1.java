/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.pkg1;
import java.util.Scanner;

public class Cp1 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String a= input.nextLine();
        boolean flag = false; 
        for (int i = 0; i<a.length(); i++) {
            if(a.charAt(i)=='H'|| a.charAt(i)=='Q'||a.charAt(i)=='9' ){
               flag =true; 
            }
          
            }
        if(flag==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
           
        }
}
  
                    
    
