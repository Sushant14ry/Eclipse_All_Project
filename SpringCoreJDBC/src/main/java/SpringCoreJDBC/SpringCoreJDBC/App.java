package SpringCoreJDBC.SpringCoreJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import SpringCoreJDBC.SpringCoreJDBC.Dao.StudentDao;
import SpringCoreJDBC.SpringCoreJDBC.Entities.Student;

public class App 
{
    public static void main( String[] args )
    {
      System.out.println("My Program Statrted");
      // Spring Jdbc Template
      
      ApplicationContext context = 
    		 new AnnotationConfigApplicationContext(Jdbc_config.class);
      StudentDao studenttdaoo = context.getBean("Student_Dao",StudentDao.class);
      
      List<Student> allStudents = studenttdaoo.getAllStudents();
      for(Student s : allStudents) {
    	  System.out.println(s);
      }
    }
}
