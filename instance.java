//instance block 
//No any keyword is required.
//1st program

class B{
    B(){
        System.out.println("Aman");
    }
    {
        System.out.println("Akash");        //instance block is wriiten within bracket
    }
    public static void main(String args[]){
        B b=new B();            //At the time object creation, instance block is call first as comapare to constructor.
    }
}                                       //output is Akash
                                            //Aman

// 2nd program

class B{
    int a=10; static int b=20;
    {
                System.out.println(a + " "+ b);        //we can access static and non-static variable inside instance block.
    }
    public static void main(String args[]){
           B b=new B();                 //static block is executed without making object 
        }
}
