package SoftwareAssignment22.SoftwareAssignment2;

import java.util.ArrayList;

public class Module {
	private String moduleName;
	private ArrayList<Student> listOfStudents = new ArrayList();
	private ArrayList<String> courses;
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public ArrayList<Student> getListOfStudents() {
		
		return listOfStudents;
	}
	public void setListOfStudents(ArrayList<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
	
}
