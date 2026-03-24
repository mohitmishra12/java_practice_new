package Arrays;

interface Animals{
    void Sound();
}

class dogs implements Animals{
    @Override
    public void Sound() {
        System.out.println("Dog Sound: Brockk Brock" );

    }
}

public class InterfaceMethod {
    public static void main(String[] args) {
        dogs animals= new dogs();
        animals.Sound();

    }
}
