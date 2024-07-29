//final keyword is used to restrict the user.
//It can be used in many ways-variable,mehod,class


//final variable

class finl{
    final int a=10;
    void fun1(){
        a=20;
    }
    public static void main(String args[]){
        finl x1=new finl();
        x1.fun1();
    }
}

class finl{
    final int x=20;
    void fun2(){
        x=5;
    }
    public static void main(String args[]){
        finl f1=new finl();
        f1.fun2();
    }
}

class finl{
    final int a=20;
    void fun1(){
        a=10;
    }
    public static void main(String args[]){
        finl f1=new finl();
        f1.fun1();
    }
}                                                                //output is compilation error

//final method

class x{
    final void fun1(){
        System.out.println("CSE");
    }
}
class y extends x{
    void fun1(){
        System.out.println("IT");
    }
}

class finl{
    public static void main(String args[]){
        y y1=new y();
        y1.fun1();
    }
}


