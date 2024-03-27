//Arithmetic Exception
//1st program of 

import java.util.*;
class Expt_handling{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();  
    try{
        int c=a/b;
        System.out.print("value of c is "+ c);
    }
    catch(Exception e){
          System.out.println(e);
        }
    }
 }

//2nd program

class Expt_handling{
    public static void main(String args[]){
        int a=10,b=0,c;
        c=a/b;
        System.out.println("value of c is "+c);
    }
}