package SoftwareAssignment22.SoftwareAssignment2;

import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 * Hello world!
 *
 */
public class Student 
{
	private String name;
	private int age;
	private LocalDate dob;
	private String username;
	private ArrayList<String> courses;
	private ArrayList<Module> modulesRegistered = new ArrayList();
	
	public String getUsername() {
		username = getName() + getAge();
		return username;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dateOfBirth) {
		this.dob = dateOfBirth;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	public ArrayList<Module> getModulesRegistered() {
		return modulesRegistered;
	}
	public void setModulesRegistered(ArrayList<Module> modulesRegistered) {
		this.modulesRegistered = modulesRegistered;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
