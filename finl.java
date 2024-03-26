//final variable

// class finl{
//     final int a=10;
//     void fun1(){
//         a=20;
//     }
//     public static void main(String args[]){
//         finl x1=new finl();
//         x1.fun1();
//     }
// }

// class finl{
//     final int x=20;
//     void fun2(){
//         x=5;
//     }
//     public static void main(String args[]){
//         finl f1=new finl();
//         f1.fun2();
//     }
// }

// class finl{
//     final int a=20;
//     void fun1(){
//         a=10;
//     }
//     public static void main(String args[]){
//         finl f1=new finl();
//         f1.fun1();
//     }
// }

//final method

// class x{
//     final void fun1(){
//         System.out.println("CSE");
//     }
// }
// class y extends x{
//     void fun1(){
//         System.out.println("IT");
//     }
// }

// class finl{
//     public static void main(String args[]){
//         y y1=new y();
//         y1.fun1();
//     }
// }


//inheritance

// class x{
//     int a;
//     void fun1(){
//         a=a+1;
//         System.out.println("value of a is "+a);
//     }
// }
// class y extends x{
//     int b;
//     void fun2(){
//         b=a+b;
//         System.out.println("value of b is "+ b);
//     }
// }
// class finl{
//     public static void main(String args[]){
//         y y1=new y();
//         y1.a=10;
//         y1.b=20;
//         y1.fun1();
//         y1.fun2();
//     }
// }

//method overloading
// class finl{
//     public static void area(double r){
//         System.out.println(3.14*r*r);
//     }
//     public static void area(double l, double w){
//         System.out.println(l*w);
//     }
//     public static void area(double a, double b,double c){
//         double s=(a+b+c)/2;
//         double ar=(s*(s-a)*(s-b)*(s-c));
//         System.out.println(ar);
//     }
//     public static void main(String args[]){
//         int r=2;
//         area(r);

//         int l=5,w=4;
//         area(l,w);
//     }
// }

//super keyword

// class x
// {
//     int a=10;
// }

// class y extends x{
//     int a=20;
//     void show(){
//         System.out.println(a);
//         System.out.print(super.a);
//     }
// }
// class finl{
//     public static void main(String args[]){
//         y y1=new y();
        
//         y1.show();
//     }
// }

// class x{
//     void show(){
//         System.out.println("hello");
//     }
// }
// class y extends x{
//     void show(){
//         super.show();
//         System.out.println("rajeev");
//     }
// }
// class finl{
//     public static void main(String args[]){
//         y y1=new y();
//         y1.show();
//     }
// }

//final keyword

class finl{
    final int a=10;
    void fun1(){
        a=20;
        
    }
    public static void main(String args[]){
        finl f1=new finl();
        f1.fun1();
    }
}