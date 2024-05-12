// Constructor
//constructor is a special type of method.
//constructor is used to initialize the object.

class A{
     int a;String name; boolean c;
    A(){
        a=100; name="Rajeev"; c=true;
    }
        void show(){
            System.out.println(a+" "+ name +" "+c);
        }
}
class B{
    public static void main(String args[]){
        A r=new A();
        r.show();
    }
}
