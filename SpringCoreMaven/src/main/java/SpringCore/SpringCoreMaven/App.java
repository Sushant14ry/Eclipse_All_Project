package SpringCore.SpringCoreMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringCore.SpringCoreMaven.Dao.Student_Dao;
import SpringCore.SpringCoreMaven.Entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      Student_Dao Student_dao = context.getBean("Student_dao",Student_Dao.class);
    
      Student students = new Student(12,"Sushant","KTM");
      
      int insert = Student_dao.insert(students);
      System.out.println("Done...."+insert);
    }
}
