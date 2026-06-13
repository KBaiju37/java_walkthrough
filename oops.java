class SmartPhone{
    public boolean isOn;
    public int brightness;

    public SmartPhone(){
       System.out.println("");
    }

    public void turnOn(){
          isOn = true;
          brightness = 100;
    }

    public void status(){
        System.out.println("brightness Status "+(isOn ? "ON":"OFF")+" at "+ brightness );
    }
   
    }



public class oops {


    public static void main(String[] args) {

        SmartPhone moto = new SmartPhone();
        moto.turnOn();
        moto.status();
        SmartPhone obj = new SmartPhone();
        obj.status();





        
    }
}
