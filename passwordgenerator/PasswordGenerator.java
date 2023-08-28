
package passwordgenerator;

import java.util.Random;
import java.util.Scanner;


public class PasswordGenerator {

    static char[] generatePass(int len){
        System.out.print("Your password is:  ");
        String charcaps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String charsmall="abcdefghijklmnopqrstuvwxyz";
        String num="123456789";
        String special="!@#$%^&*()?<>/";
        String result=charcaps+charsmall+num+special;
        Random rand =new Random();
        
        char[] password=new char[len];
        for(int i=0; i<len; i++){
            password[i]=result.charAt(rand.nextInt(result.length()));
        }
        return password;
        
    }
    
    
    public static void main(String[] args) {
       
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter your length");
       int length=sc.nextInt();
       
        System.out.println(generatePass(length));
        
    }
    
}
