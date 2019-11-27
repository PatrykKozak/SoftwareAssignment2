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
	   
	   ArrayList<String> courses = new ArrayList();
	   courses.add("IT");
	   courses.add("Maths");
	   
	   LocalDate dateOfBirth = LocalDate.parse("1998-04-18");
	   
	   
	   student.setName("Patryk");
	   student.setAge(21);
	   student.setCourses(courses);
	   student.setDob(dateOfBirth);
	 //  student.setModulesRegistered(modulesRegistered);
	   String x = student.getName();
	   String y = "Patryk";
	   System.out.println(dateOfBirth);
	   assertEquals(x,y);
   }
	
	@Test
	public void test2() {
		
	/*	Module module = new Module();
		module
		module.setListOfStudents(); */
	}
}
