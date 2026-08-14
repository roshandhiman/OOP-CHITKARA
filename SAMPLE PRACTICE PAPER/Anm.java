import java.util.*;
class Animal{
    void sound(){};
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("The Dog barkssssss");
    }
}

class cat extends Animal{
    @Override
    void sound(){
        System.out.println("The cat barkssssss");
    }
}






public class Anm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Animal a;
        String s=sc.next();

        if(s.equalsIgnoreCase("Dog")){
            a=new Dog();    
        }else{
            a=new cat(); 
        }
        a.sound();

    }
}
