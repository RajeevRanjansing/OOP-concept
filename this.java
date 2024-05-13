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
