import java.lang.reflect.Array;

public class Person {
   private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + this.name);
    }


    public static void main(String[] args) {
        Person person1 = new Person("Yasin");
//        person1.setName("Yasin");
        person1.sayHello();
        person1.setName("Fred");
//        System.out.println(person1.name);
        person1.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); // John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // Jane
    }


}
