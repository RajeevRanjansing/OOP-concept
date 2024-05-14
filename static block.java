//1st program 
//static keyword is required.

class A{
    
    static{
                System.out.println("Rajeev kumar singh");
    }
    public static void main(String args[]){
                            //static block is executed without making object 
        }
}                      //output is Rajeev kumar singh 

//2nd program

class A{
    int a=10; static int b=20;
    static{
                System.out.println(a + " "+ b);     //here we can use only static variable
    }
    public static void main(String args[]){
                            //static block is executed without making object 
        }
}                                    //output is error, we can not use non-static variable inside static method

//3rd program

class B{
    int a=10; static int b=20;
    static{
                System.out.println(b + " ");
    }
    public static void main(String args[]){
                            //static block is executed without making object 
        }
}                                    //output is 20
