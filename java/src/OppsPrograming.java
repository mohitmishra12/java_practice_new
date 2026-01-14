class MyOopsclass{
     int a;
     String b;
     double c;
     boolean d;
}
public class OppsPrograming {
    public static void main(String[] args) {
        MyOopsclass ops = new MyOopsclass();
        ops.a=1;
        ops.b="Hello";
        ops.c=1.2;
        ops.d=true;
        System.out.println(ops.a);
        System.out.println(ops.b.toUpperCase().charAt(2));
        if (ops.b.charAt(2) == 'l') {
            System.out.println("Match");
        }else {
            System.out.println("not match");
        }
        System.out.println(ops.c);

    }
}
