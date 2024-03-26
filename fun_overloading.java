//funcction overloading or method overloading
//Defintion is Defining the different function with same name, same class with different argumnets is called function overloading.

// class fun_overloading{
//     public static void area(double r){
//         System.out.println("Area of circle is "+(3.14*r*r));
//     }
//     public static void area(double l, double w){
//         System.out.println("Area of rectangle is "+(l*w));
//     }
//     public static void area(double a, double b, double c){
//         double s=(a+b+c)/2;
//         double x=java.lang.Math.sqrt(s*(s-1)*(s-2)*(s-3));   //Heron's formula to find area of triangle
//         System.out.print("Area of triangle is "+ x);
//     }
//     public static void main(String args[]){
//         int r=2;
//         area(2);

//         int l=5,w=2;
//         area(l,w);

//         int a=5,b=1,c=2;
//         area(a,b,c);
//     }

// }


//java program to find palindrome

// import java.util.*;
// class q{
//     public static void main(String args[]){
//         int s=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a number: ");
//         int n=sc.nextInt();
//         int c=n;
//         while(n>0){
//             int r=n%10;
//              s=(s*10)+r;
//             n=n/10;
//         }
//         if(c==s){
//             System.out.print("It is pallindrome number");
//         }
//         else{
//             System.out.print("It is not pallindrome number");
//         }
//     }
// }

//java program to find palindrome

// import java.util.*;
// class q{
//     public static void main(String args[]){
//         int sum=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a number: ");
//         int n=sc.nextInt();
//         int c=n;
//         while(n>0){
//             int r=n%10;
//             sum=(r*r*r)+sum;
//             n=n/10;
//         }
//         if(c==sum){
//             System.out.print("It is  armstrong number");
//         }
//         else{
//             System.out.print("It is not armstrong number");
//         }
//     }
// }

// class A{
//     int a;
//     void fun1(){
//         a=a+1;
//         System.out.print("Value of a is "+a);
//     }
// }
// class B extends A{
//     int b;
//     void fun2(){
//         b=a+b;
//         System.out.print("Value of b is "+b);
//     }
// }

// class q{
//     public static void main(String args[]){
//         B q1=new B();
//         q1.a=10;
//         q1.b=20;
//         q1.fun1();
//         q1.fun2();
//     }
// }

// class q{
//     public static void area(double r){
//         System.out.println("Area of circle is "+(3.14*r*r));
//     }
//     public static void area(double l, double w){
//         System.out.println("Area of rect. is "+(l*w));
//     }
//     public static void area(double a, double b, double c){
//        double s=(a+b+c)/2;
//         double ar=java.lang.Math.sqrt(s*(s-a)*(s-b)*(s-c));
//         System.out.println(ar);
//     }
//     public static void main(String args[]){
//         int r=2;
//         area(2);
//     }
// }
