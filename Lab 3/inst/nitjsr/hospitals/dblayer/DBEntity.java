package inst.nitjsr.hospitals.dblayer;

public interface DBEntity {

    public void insert(DBEntity d);

    public void delete(int x);

    public void update(int x, DBEntity d);

    public static DBEntity getEntity(String type) {
        DBEntity obj = null;
        if (type == "doctor")
            obj = new Doctor();
        else if (type == "staff")
            obj = new Staff();
        else if (type == "patient")
            obj = new Patient();
        return obj;
    }

    default void alter() {
        System.out.println("Implementation in Progress");
    }
}
