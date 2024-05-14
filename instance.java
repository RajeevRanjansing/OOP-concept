//instance block 

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

                                            
