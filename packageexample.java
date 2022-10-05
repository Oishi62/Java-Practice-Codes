package Academic;
public class Student
{
    String name,department,address;
    public int roll;
     Student(String name,int roll, String department, String address)
     {
                 this.name=name;
                 this.department=department;
                 this.address=address;
                 this.roll=roll;
     }
     
      public void displayDetails()
      {
                   // Details of a particular student printed here
       }
}

package Library;
public class Book
{
     String bookname;
     Book(String bookname)
     {
              this.bookname=bookname;
              
     }
     public void displayBook()
     {
            
             // To display the names of the books issued by a particular student
     }
}

import Academic.Student;
import Library.Book;
class Demo
{
    public static void main(String[] s)
    {
      
      Student ob[]=new Student[100];
      Book b[]=new Book[100];
      int i,roll; String name,department,address,bookname;
      for(i=0;i<100;i++)
     {
      Scanner sc=new Scanner(System.in);
      //All the details are accepted from the user here
      ob[i]=new Student(name,roll,department,address);
      b[i]=new Book(bookname);
      }
      roll=sc.nextInt();
      getdetails(ob,b,roll);
       
    }
    static void getDetails(Student ob[],Book b[],roll)
    {
       for(int i=0;i<100;i++)
       {
             if(ob[i].roll==roll)
             break;
       }
       ob[i].displayDetails();
       b[i].displayBook();
  
}

 
