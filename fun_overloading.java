//funcction overloading or method overloading
//Defintion is Defining the different function with same name, same class with different argumnets is called function overloading.

class fun_overloading{
    public static void area(double r){
        System.out.println("Area of circle is "+(3.14*r*r));
    }
    public static void area(double l, double w){
        System.out.println("Area of rectangle is "+(l*w));
    }
    public static void area(double a, double b, double c){
        double s=(a+b+c)/2;
        double x=java.lang.Math.sqrt(s*(s-1)*(s-2)*(s-3));   //Heron's formula to find area of triangle
        System.out.print("Area of triangle is "+ x);
    }
    public static void main(String args[]){
        int r=2;
        area(2);

        int l=5,w=2;
        area(l,w);

        int a=5,b=1,c=2;
        area(a,b,c);
    }
}


