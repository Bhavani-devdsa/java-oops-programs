public class constructer{
    public static void main(String args[]){
        pen p1=new pen();
        p1.setclor("yellow");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());

    }
}
    class pen{
         private String color;
       private int tip=5;
       pen(){
        System.out.println("constucter is called");
       }

        String getcolor(){
            return this.color;
        }
        int gettip(){
            return this.tip;
        }
    
    void setclor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}

    


    
