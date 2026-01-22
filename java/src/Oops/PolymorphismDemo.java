package Oops;

class toyota{
    void mytoyota(){
        System.out.println("this is my toyota car");
    }
}

class mahindra extends toyota{
    @Override
    void mytoyota() {
        System.out.println("this is mahindra car");
    }
}

class tata extends mahindra{
    @Override
    void mytoyota() {
        System.out.println("this is my tata car");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        mahindra mymahindra = new mahindra();
        mymahindra.mytoyota();
        tata newtata = new tata();
        newtata.mytoyota();

    }
}
