public class Touchpad {
    
    private String inventor;
    
    public Touchpad(){
        inventor = "unkown";
    }
    public String getInventor(){
        return inventor;
    }
    public void setInventor(String inventor){
        this.inventor = inventor;
    }
    public String cleanTouchpad(){
        return "Touch pad is clean!";
    }
    public String DirtyTouchpad(){
        return "Touch pad is dirty!";
    }
}
