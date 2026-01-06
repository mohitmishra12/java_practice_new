package String;

public class PalindromeString {
    public static void main(String[] args) {

        String str = "taat";
        String rev = " ";

        for(int i=str.length()-1;1>=i;i--){
            rev += str.charAt(i);
            System.out.println(rev);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
