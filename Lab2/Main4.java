abstract class Employee {
    public abstract void insert();

    public abstract void delete();

    static Employee getEmployee(String type) {
        if (type == "developer")
            return new developer();
        return new manager();
    }
}

class developer extends Employee {
    public void insert() {
        System.out.println("Data inserted in Developer database");
    }

    public void delete() {
        System.out.println("Data deleted from Developer database");
    }

}

class manager extends Employee {
    public void insert() {
        System.out.println("Data inserted in Manager database");
    }

    public void delete() {
        System.out.println("Data deleted from Manager database");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Employee d = Employee.getEmployee("developer");
        Employee m = Employee.getEmployee("manager");

        d.insert();
        d.delete();

        m.insert();
        m.delete();
    }
}
