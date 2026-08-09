class Countt{
    String name;
    static int Cot=0;
    Countt(){
        Cot++;
    }
    static void show(){
        System.out.println(Cot);
    }
}

public class count {
    public static void main(String[] args) {
        Countt c=new Countt();
        Countt c1=new Countt();
        Countt c2=new Countt();
        Countt.show();

    }
    
}
