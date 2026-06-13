class overloading{

    public void abc()
    {
        System.out.println("hallo");
    }

     public void abc(String a)
    {
        System.out.println("hallo"+ a);
    }
     public void abc(String a, String b)
    {
        System.out.println("hallo"+a+b);
    }
    
}

class overriding extends overloading{


     public void abc(String a)
    {
        System.out.println("yo"+a);
    }
    
}

public class method {
    public static void main(String[] args) {
        
        overloading obj = new overloading();
        obj.abc();
        obj.abc(" mere");
        obj.abc(" mere"," bhai");
        overriding obj2 = new overriding();
        obj2.abc(" gutten tag");
    }
}
