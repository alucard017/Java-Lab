public class Main5 {
    static int count;

    public Main5() {
        count++;
    }

    static int getEmployeCount() {
        return count;
    }

    public static void main(String[] args) {
        Main5 ob1 = new Main5();
        Main5 ob2 = new Main5();
        Main5 ob3 = new Main5();
        Main5 ob4 = new Main5();
        Main5 ob5 = new Main5();
        System.out.println("Total Objects Created: "+Main5.getEmployeCount()); // 5
    }
}
