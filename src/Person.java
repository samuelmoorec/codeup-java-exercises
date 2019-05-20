public class Person {

    public Person(String name){
        this.Name = name;
    }

    public String Name;
    // returns the person's name
    public String getName(){
        return this.Name;
    }
    // changes the name property to the passed value
    public void setName(String newName){
        this.Name = newName;
        this.sayHello();
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("Hello my name is %s\n",this.Name);
    }

    public static void main(String[] args) {
        Person randomGuy = new Person("Bob");
        randomGuy.setName("Dillian");
        System.out.println(randomGuy.getName());
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }


}
