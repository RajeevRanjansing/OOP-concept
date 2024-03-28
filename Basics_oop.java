//1st program

class oop{
    public static void main(String args[]){
        person p1=new person();
        p1.age=24;
        p1.Name="rajeev";

        person p2=new person();
        p2.age=32;
        p2.Name="shashi";

        System.out.println(p1.age + " "+ p1.Name);
        System.out.println(p2.age + " "+ p2.Name);
   }
}
class person{
    String Name;
    int age;
}

//2nd program

class oop{
    public static void main(String args[]){
        person p1=new person();
        p1.name="rajeev";
        p1.age=22;
        System.out.println(p1.name +" "+ p1.age);
    }
}
class person{
    String name;
    int age;
}

//3rd program

class oop{
    public static void main(String args[]){
        student p1=new student();
        p1.name="Rajeev";
        p1.age=22;
        p1.address="Sarigam";
        p1.cgpa=9;

        student p2=new student();
        p2.name="Shashi";
        p2.age=23;
        p2.address="Mumbai";
        p2.cgpa=10;
        System.out.println(p1.name +" "+ p1.age +" "+ p1.address + " " + p1.cgpa);
        System.out.print(p2.name+" "+ p2.age +" "+ p2.address +" "+p2.cgpa);
    }
}
class student{
    String name;
    int age;
    String address;
    int cgpa;
}

//4th program

class oop{
    public static void main(String args[]){
        child c=new child();
        c.name="arav";
        c.age=4;
        c.school="smart kid"; 
    //System.out.println(c.name +" "+ c.age +" " + c.school);
     

      child c1=new child();
        c1.name="aryan";
        c1.age=5;
        c1.school="smart kid"; 
           System.out.println(c1.name +" "+ c1.age +" "+ c1.school);
     
      c.eat();
      c1.walk(4);
    }
}
class child{
    String name;
    int age;
    String school;

    void eat(){
        System.out.println(name +" is eating");
    }
        void walk(){
        System.out.print(name +" is walking");
    }

    void walk(int a){
        System.out.println(name + " walked " + a +" steps ");
    }
}
//5th program

class oop{
    public static void main(String args[]){
        person p1=new person();
        p1.name="rajeev";
        p1.age=22;
        p1.cgpa=9;
        System.out.println(p1.name +" "+ p1.age +" "+ p1.cgpa);
    }
}

class person{
    String name;
    int age;
    int cgpa;
}

//6th program

class oop{
    public static void main(String args[]){
        void running(5);
    }
}

int sleep(){
    System.out.println("rajeev is walking");
}

void running(int a){
    System.out.println("Rajeev runs daily " + a + " km ");
}

//7th program

class oop{
    public static void main(String args[]){
        person p1=new person();
        p1.name="rajeev singh";
        p1.age=22;
        p1.cgpa=9;
        System.out.print("name is " + p1.name +"\n" + "age is "+ p1.age +"\n" + "cgpa is "+ p1.cgpa);
    }
}
class person{
    String name;
    int age;
    int cgpa;
}

//8th program

class oop{
    public static void main(String args[]){
        person p1=new person();
            p1.name="rajeev";
            p1.age=22;
            p1.cgpa=9;
    
        person p2=new person();
        p2.name="Shashi";
        p2.age=23;
        p2.cgpa=8;

        p1.eat();
        p2.walk();
        p2.walk(4);
    }
}
class person{
    String name;
    int age;
    int cgpa;

    void walk(){
        System.out.println(name  + "  is running");
    }
    void eat(){
        System.out.println(name + "  is eating");
    }

    void walk(int steps){
        System.out.print(name + "walked" + steps + "steps");
    }
}

//9th program

class oop{
    public static void main(String args[]){
        name n1=new name();
        n1.name="Rajeev";
        n1.age=22;
        n1.address="Sarigam";
        System.out.println("name is "+ n1.name);
        System.out.println("age is "+ n1.age);
        System.out.println("address is "+ n1.address);
        n1.walk();
    }
}
class name{
    String name;
    int age;
    String address;

    void walk(){
        System.out.print(name +"is walking");
    }
}

