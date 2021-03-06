package SoftwareAssignment22.SoftwareAssignment2;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class CourseProgramme {
	private String className;
	private String listOfModules[];
	private String listOfStundentsEnrolled[];
	private DateTime startDate;
	private DateTime closeDate;
	private ArrayList<Module> modulesRegistered = new ArrayList();
	
	public ArrayList<Module> getModulesRegistered() {
		return modulesRegistered;
	}
	public void setModulesRegistered(ArrayList<Module> modulesRegistered) {
		this.modulesRegistered = modulesRegistered;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String[] getListOfModules() {
		return listOfModules;
	}
	public void setListOfModules(String[] listOfModules) {
		this.listOfModules = listOfModules;
	}
	public String[] getListOfStundentsEnrolled() {
		return listOfStundentsEnrolled;
	}
	public void setListOfStundentsEnrolled(String[] listOfStundentsEnrolled) {
		this.listOfStundentsEnrolled = listOfStundentsEnrolled;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(DateTime closeDate) {
		this.closeDate = closeDate;
	}
	
}
