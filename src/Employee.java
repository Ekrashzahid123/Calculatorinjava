public class Employee{
 
 private  String name;
 private  int Employeeid;
 private String Departement;
 private float salary;

public Employee(String name,int Employeeid,String Departement,float salary)
{
    this.name=name;
    this.Employeeid=Employeeid;
    this.Departement=Departement;
    this.salary=salary;
}
public String getname()
{
    return name;
}
public int getEmployeeid()
{
    return Employeeid;
}
public String getDeparement()
{
    return Departement;
}
public  float getsalary()
{
    return salary;
}

public void  setname(String name)
{
    this.name=name;
}
public void setEmployeeid(int Employeeid)
{
    this.Employeeid=Employeeid;
}
public void setDepartement(String Departement)
{
    this.Departement=Departement;
}
public void setSalary(float salary)
{
    this.salary=salary;
}
public void print()
{
    System.err.println("The Name of EMployee is as: "+name);
    System.err.println("The ID of EMployee is as:"+Employeeid);
    System.out.println("The Departement of employee is as"+Departement);
    System.err.println("The Salary of the employee is as:"+salary);
}
public static void main(String[] args) {
    Employee obj1=new Employee("ALi",123,"SST",12);
    Employee obj2=new Employee("abrar",456,"SST",1200);
    obj1.print();
    obj2.print();
}
}