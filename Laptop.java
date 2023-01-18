public class Laptop {
    
    private String color;
    private Keyboard keyboard;
    private Touchpad touchpad;
    
    public Laptop(String color){
        this.color = color;
        keyboard = new Keyboard();
        touchpad = new Touchpad();
    }
    public Laptop(String color, Keyboard keyboard, Touchpad touchpad){
        this.color = color;
        this.keyboard = keyboard;
        this.touchpad = touchpad;
        
    }        
    public String getColor(){
        return color; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String Switch(){
        return keyboard.LightUpKeyboard();
    }
    
    public String Warn(){
        return touchpad.cleanTouchpad();
    }     
}
