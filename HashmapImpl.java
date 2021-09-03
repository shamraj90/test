import java.util.HashMap;
import java.util.Objects;

public class HashmapImpl {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Sham");

        HashMap<Integer, Employee> mp = new HashMap();
        mp.put(null, employee1);

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Sham");


        mp.put(employee.getId(), employee);

        Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setName("Sham");
        mp.put(employee2.getId(), employee2);
        employee2=null;
        System.err.println("Map : " + mp);

        Employee emp=new Employee();


        System.err.println("emp before " + emp);
        emp=null;
        System.err.println("emp after "+ emp);

    }


}


class Employee {

     static int id=11;
     static String name="kundi";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}