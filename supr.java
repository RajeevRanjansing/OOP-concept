//Definition of super keyword is 
//super keyword is used to refer immediate super class instance variable.
//super is used to immediate super class constructor.
//super is used to immediate super class method.

//1st program

class A{
    int a=50;
}
class B extends A{
    int a=100;
    void show(){
        System.out.println(a);
         System.out.println(super.a);
    }
}
class supr
{
    public static void main(String args[]){
        B b1=new B();
        b1.show();
    }
}

//2nd program

class A{
    void show(){
        System.out.println("Hello Developer");
    }
}
class B extends A{
    void show(){
         System.out.print("Hello Rajeev");
    }
}
class supr{
    public static void main(String args[]){
        B b1=new B();
        b1.show();                                            //output is Hello Rajeev
    }
}

//3rd program

class A{
    void show(){
        System.out.println("namaste");
    }
}
class B extends A{
  
    void show(){
        super.show();
        System.out.println("Rajeev");
        
    }
}
class supr{
    public static void main(String args[]){
        B b1=new B();
        b1.show();                                          //output is namaste Rajeev
    }
}

//4th program

class x{
    void show(){
    System.out.println("CSE");
}
}

class y extends x{
    void show(){
        super.show();
    System.out.print("mech");
}
}

class supr{
    public static void main(String args[]){
        y y1=new y();
        y1.show();                                          //output is CSE mech
    }
}

//5th program

class x{
    x(){
    System.out.println("CSE");
    }
}

class y extends x{
    y() {
        //here constructor automatically write super();
    System.out.print("mech");
    }
}

class supr{
    public static void main(String args[]){
        y y1=new y();
                                              //output is CSE mech
    }
}


//Note:- Incase of Default constructor, there is not necessary to write super();
// But incase of parameterised constructor, there is compulsory to write super();

//6th program

class x{
    x(int a){
    System.out.println("CSE"+ a);
    }
}

class y extends x{
    y() {
        super(100);
    System.out.print("mech");
    }
}

class supr{
    public static void main(String args[]){
        y y1=new y();
    }                                          //output is CSE 100
}                                                   //mech
    







