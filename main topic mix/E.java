class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    String breed;
    Dog(String name,String breed){
        super(name);
        this.breed=breed;
    }
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class E {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", "German Shepherd");
        System.out.println(d.name);
        System.out.println(d.breed);
        d.sound();
        
    }
    
}
