public class inheritance {
    public static void main(String []args){
        fish f1=new fish();
        f1.eat();
        

    }
    
}
class animal{
    String color;
    void eat(){
         System.out.println("eats");
    }
    void breathe(){
        System.out.println("brethes");
    }
}
class fish extends animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
class shark extends fish{
    void smiles(){
        System.out.println("smiles"); 

    }
}
class mamals extends animal{
    void walk(){
        System.out.println("walks");
    }
} 
class human extends mamals{
    void clap(){
        System.out.println("claps");
    }
}
