// Constructor
//constructor is a special type of method.
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
//Default constructor

class A{
     int a;String name; boolean c;
    A(){
        a=100; name="Rajeev"; c=true;                         //here we are initializing the object
    }                                                         //Advantage of initializing the object is we can put any value a/c to us.
        void show(){
            System.out.println(a+" "+ name +" "+c);
        }
}
class B{
    public static void main(String args[]){
        A r=new A();
        r.show();
    }
}                                                             //output is 100 Rajeev true
