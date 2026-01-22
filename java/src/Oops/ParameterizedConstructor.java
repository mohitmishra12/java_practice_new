package Oops;

class Employee{
    int Empid;
    String Empname;
    int Empage;

    Employee(int id,String name ,int age){
        Empid=id;
        Empname=name;
        Empage=age;
    }

    void Displays(){
        System.out.println("my EmpId : " +Empid +  "and name :"+ Empname  +  " and age"+ Empage);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Mohit",23);
        emp.Displays();

    }
}
