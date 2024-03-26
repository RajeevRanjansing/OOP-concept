//Defintion of inheritance is getting the property of one class to another class is called inheritance.

//1st program

class A{
    int a;
    void fun1()
    {
        a=a+1;
        System.out.print("Value of a is "+a);
    }
}

class B extends A{
    int b;
    void fun2()
    {
        b=a+b;
        System.out.print("value of b is "+b);
    }
}
class inheritance{
    public static void main(String args[]){
        B b1=new B();
        b1.a=10;
        b1.b=11;
        b1.fun1();
        b1.fun2();
    }
}


//2nd program

class A{
    int a;
    void fun1(){
        a=a+1;
        System.out.println("Value of a is "+a);
    }
}

class B extends A{
    int b;
    void fun2(){
        b=b+a;
        System.out.println("Value of b is "+b);
    }
}

class c extends B{
    int c;
    void fun3(){
        c=b+c;
        System.out.println("value of c is "+ c);
    }
}

class ABC{
    public static void main(String args[]){
        c c1=new c();
        c1.a=10;
        c1.b=20;
        c1.c=30;
        c1.fun1();
        c1.fun2();
        c1.fun3();
    }
}

