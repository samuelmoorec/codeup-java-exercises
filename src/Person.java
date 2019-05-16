public class Person {
    private String Name;
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
        Person randomGuy = new Person();
        randomGuy.setName("Dillian");
        randomGuy.getName();
    }

}
