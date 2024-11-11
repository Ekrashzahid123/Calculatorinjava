public class Dean extends Employee {
    private int workinghour;

public Dean(String name,int Employeeid,String Departement,float salary,int workinghour)
{
    super(name, Employeeid, Departement, salary);
    this.workinghour=workinghour;
}
public int getworkinghour()
{
    return workinghour;
}
public void setworkinghour()
{
    this.workinghour=workinghour;
}

public void print()
{
    super.print();
   System.err.println("Working hour is as"+ workinghour);

}
public void work()
{
    System.err.println("The Dean is working");
}

public static void main(String[] args) {
    Dean obj1=new Dean("ALI", 123, "SST", 1000, 12);
    obj1.print();

}    
}
