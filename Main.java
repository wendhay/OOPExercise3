public class Main {
    public static void main(String[] args){
       
        
        Laptop acer = new Laptop("black"); //Create an object
     
        Keyboard keyboard = new Keyboard();
        Touchpad touchpad = new Touchpad();
        acer = new Laptop("red", keyboard, touchpad);
        //System.out.println(acer.switch());
        System.out.println(acer.Switch());
        
        //System.out.println(acer.Warn());
        System.out.println(acer.Warn());
        
        //call an accessor method from that object
        System.out.println("Laptop color: " + acer.getColor());
    
    }
}
