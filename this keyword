//this keyword is written inside the method.
// Local variables are declared within a method or a block of code.
//Instance variables are declared within a class but outside any method, constructor, or block.

//1st program

class B{
    int a;    //instance variable
    B(int a){    //local variable
        this.a=a;            
    }
    void show(){
        System.out.println(a);
    }
    public static void main(String args[]){
        B r=new B(100);
        r.show();
    }
}

//2nd program

class B{
    B(){
        System.out.println("Rajeev kumar singh");
    }
    B(int a){
        this();        //here this keyword is used to call the default constructor of same class
        System.out.println(a);
    }
    public static void main(String args[]){
        B b=new B(10);

    }                                           //output is Rajeev kumar singh
}                                                                    //10

//3rd program

class B{
    B(){
        this(10);     //here this keyword is used to call the parameterised constructor(written below) of same class
    }
    B(int a){                        //parameterised constructor
        System.out.println(a);
    }
    public static void main(String args[]){
        B b=new B();

    }                                           //output is 10
}  
