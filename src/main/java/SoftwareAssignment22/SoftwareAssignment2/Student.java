package SoftwareAssignment22.SoftwareAssignment2;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class Student 
{
	public String name;
	public int age;
	public Date dob;
	public String username;
	public String courses[];
	public String modulesRegistered[];
	
	public String getUsername() {
		username = name + age;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String[] getModulesRegistered() {
		return modulesRegistered;
	}
	public void setModulesRegistered(String[] modulesRegistered) {
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
