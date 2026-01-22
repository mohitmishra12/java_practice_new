package Oops;

class encapulateClass{

    private int empId;
    private String name;
    private  double salary;
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}



public class Encapulation {
    public static void main(String[] args) {
        encapulateClass en = new encapulateClass();
        en.setEmpId(1);
        en.setName("mohit");
        en.setSalary(12500.32);
        System.out.println(en.getEmpId());
        System.out.println(en.getName());
        System.out.println(en.getSalary());

    }
}
