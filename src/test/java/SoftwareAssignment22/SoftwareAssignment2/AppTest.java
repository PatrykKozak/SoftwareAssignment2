package SoftwareAssignment22.SoftwareAssignment2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void test() {
	   Student student = new Student();
	   Module module = new Module();
	   CourseProgramme courseProgramme = new CourseProgramme();
	   
	   
	   courseProgramme.getCloseDate();
	   ArrayList<String> courses = new ArrayList();
	   courses.add("IT");
	   courses.add("Maths");
	   ArrayList<String> checkCourses = new ArrayList();
	   checkCourses.add("IT");
	   checkCourses.add("Maths");
	   

	   module.setCourses(courses);
	   LocalDate dateOfBirth = LocalDate.parse("1998-04-18");
	   LocalDate checkDate = LocalDate.parse("1998-04-18");
	   
	   student.setName("Patryk");
	   student.setAge(21);
	   student.setCourses(courses);
	   student.setDob(dateOfBirth);
	   
	 
	   String y = "Patryk";
	   String z = "Patryk21";
	   
	   assertEquals(student.getName(),y);
	   assertEquals(student.getDob(), checkDate);
	   assertEquals(student.getUsername(), z);
	   assertEquals(module.getCourses(), checkCourses);
	   
   }
}
