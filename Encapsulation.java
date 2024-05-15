//Encapsulation is a mechanism through which we can binding the data members and members method in a single unit. 
//we can access private data member using getter and setter method.
//Getter method get the value.
//setter method set the value. 
class B{
    private String name;
    private int age;
    private int roll;

    public String getName(){
        System.out.println(name);
        return name;
    }
    public int getAge(){
        System.out.println(age);
        return age;
    }
    public int getRoll(){
        System.out.println(roll);
        return roll;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }

    public static void main(String args[]){
        B b=new B();
            b.setName("Rajeev");
            b.setAge(22);
            b.setRoll(27);

            b.getName();
            b.getAge();
            b.getRoll();
        
    } 
}

