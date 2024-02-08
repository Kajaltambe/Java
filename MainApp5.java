class Employee
{
   int empId ;
   String empName ;
   double empSalary;
   int yearOfExp;
    
    Employee(int id ,String name ,double salary ,int exp)
    {
       empId=id ;
	empName =name;
	empSalary =salary;
	yearOfExp =exp;
     }

     Employee(int id ,String name ,double salary )
    {
       empId=id ;
	empName =name;
	empSalary =salary;
	
     }
	
     void display()
     {
       System.out.println(empId+"\t\t"+empName+"\t"+empSalary+"\t"+ yearOfExp);
      }
    }

public class MainApp5
{
public static void main(String args[])
{
  Employee e1 =new Employee(101,"ABC",2345.35);
  Employee e2 =new Employee(201,"ABCDR",10s00.23,2);
  e1.display();
  e2.display();
}
}
     
     