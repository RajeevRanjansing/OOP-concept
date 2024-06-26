// Constructor
//constructor is a special type of method which is same as class name.
//constructor is used to initialize the object.


//1st program

class A{
     int a;String name; boolean c;          //here we are not intializing the value
        void show(){
            System.out.println(a+" "+ name +" "+c);
        }
}
class B{
    public static void main(String args[]){
        A r=new A();
        r.show();
    }                                          //constructor automatically initialize the object
}                                              //output is 0 null false




//2nd program
//Default constructor=Default constructor does not have any parameter is default constructor

class A{
     int a;String name; boolean c;
    A(){
        a=100; name="Rajeev"; c=true;                         //here we are initializing the object
    }                                                         //Advantage of initializing the object is we can put any value according to us.
        void show(){
            System.out.println(a+" "+ name +" "+c);
        }
}
class B{
    public static void main(String args[]){
        A r=new A();
        r.show();
    }                                                       //output is 100 Rajeev true
}                                                             


//3rd program
//parameterised constructor=A constructor through which we can pass one or more parameter is called parameterised constructor.

class A{
    A(int x,int y){
        System.out.println("x + y= "+(x+y));
    }
    A(String a, String b){
        System.out.println("name = "+(a+b));
    }
}
class B{
    public static void main(String args[]){
        A a=new A(100,200);
        A x=new A("Akshat","Rajeev");
    }                                                       //output is x+y=300
}                                                           name=Akshat Rajeev



//4th program
//copy constructor=copy constructor copy the content of one object into other object by help of ref variable.     

class A{
    int a; String name;
    A(){
        a=10; name="Rajeev";
        System.out.println(a+" "+name);
    }
    A(A ref){
       a= ref.a;
       name= ref.name;
       System.out.println(a+" "+name);
    }
}
class B{
    public static void main(String args[]){
        A a=new A();
        A b=new A(a);
    }                                                  //output is    10 Rajeev
}                                                          //           10 Rajeev


//5th program
//private constructor= In java, it is possible to write constructor as a private but according to rule, we can not access private member outside the class.

class B{
     String name; int a;
     private B(){
          name="Rajeev"; a=10;
          System.out.println("My name is "+ name +" value is  "+ a);
     }
     public static void main(String args[]){
          B r=new B();
     }
}
                                                                                                         
