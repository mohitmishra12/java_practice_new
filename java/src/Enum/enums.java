package Enum;


enum Status {
    SUCCESS, FAILED, PENDING
}
public class enums {
    public static void main(String[] args) {
        Status status = Status.SUCCESS;

        switch (status) {
            case SUCCESS:
                System.out.println("Operation successful");
                break;
            case FAILED:
                System.out.println("Operation failed");
                break;
            case PENDING:
                System.out.println("Operation pending");
                break;
        }
    }
}