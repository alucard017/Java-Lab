class Employee {
    int id;
    String name;
    String office;
    String designation;

    public Employee(int id, String name, String office, String designation) {
        this.id = id;
        this.name = name;
        this.office = office;
        this.designation = designation;
    }
}

class Developer extends Employee {
    Developer(int id, String name, String office) {
        super(id, name, office, "Developer");
    }
}

class Manager extends Employee {
    Manager(int id, String name, String office) {
        super(id, name, office, "Manager");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Developer d = new Developer(12, "Apurba", "Google");
        Manager m = new Manager(15, "Shubham", "Facebook");

        System.out.print("Developer  information:  ");
        System.out.print("\nid: " + d.id +"\nname: " + d.name + "\noffice: " + d.office+ "\ndesignation: " + d.designation);
        System.out.print("\n\nManager  information:  ");
        System.out.print("\nid: " + m.id +"\nname: " + m.name + "\noffice: " + m.office+ "\ndesignation: " + m.designation);
    }
}
