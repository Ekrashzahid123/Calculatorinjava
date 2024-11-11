public class leacturer extends Employee {
    private int noofsubject;

    public leacturer(String name, int Employeeid, String Departement, float salary, int noofsubject) {
        super(name, Employeeid, Departement, salary);
        this.noofsubject = noofsubject;
    }

    public int getnoofsubject() {
        return noofsubject;
    }

    public void setnoofsubject() {
        this.noofsubject = noofsubject;
    }

    public void print() {
        super.print();
        System.err.println("the no of subject is" + noofsubject);

    }

    public void takingclass() {
        System.err.println("Teacher is taking class");
    }

    public static void main(String[] args) {

    leacturer obj2=new leacturer(
        "USMAN", 22, "SST", 110, 2);
        obj2.print();
    }

}
