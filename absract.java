public class absract {
    public static void main(String args[]){
    
        mustang m1=new mustang();


    }
    
}
abstract class animal{
    String color;
    animal(){
        System.out.println("thammudu");
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class horse extends animal{
    horse(){
        System.out.println("thinnava");
    }
    void changecolor(){
        color="broen";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("raa");

    }
    void changecolor(){
        color="pink";
    

        

    }void walk(){
        System.out.println("four legs");
    }
    

    
}
