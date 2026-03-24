package Arrays;
class  GCExample{
    int str = 23;
}

public class GerbageCollection {
    public static void main(String[] args) {

        GCExample obj1 = new GCExample();
        GCExample obj2 = new GCExample();

        obj1 = null;
        obj2 = obj1;

        System.gc();
    }
}
