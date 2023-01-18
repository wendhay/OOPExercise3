public class Keyboard {
    
    private String function; //Attribute
    
    public Keyboard(){          //Constructor
        function = "unknown"; 
    }
    public String getFunction(){
        return function;
    }
    
    public void setFunction(String function){ //Mutator
        this.function = function;
    }
    
    public String LightUpKeyboard(){
        return "Keyboard lighting on!";
    }
    public String TurnOffKeyboard(){
        return "Keyboard lighting off!";
    }
    
}
