import java.util.ArrayList;

public class BitCamp {

	private ArrayList<Student> listOfStudents;
	private int numberOfStudent;

	public BitCamp(int numberOfStudent) 
	{
	this.listOfStudents = new ArrayList<Student>(numberOfStudent);	
		this.numberOfStudent = numberOfStudent;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public ArrayList<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public void setListOfStudents(ArrayList<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	public void addStudent(Student student) {
		listOfStudents.add(student);
		
	}

	public void removeStudent(Student student) {
		listOfStudents.remove(student);
		numberOfStudent--;
	}

	
	public String toXml(){
		String xml = "";
		xml +="<NumberOfStudents>" + numberOfStudent + "</NumberOfStudents>\n";
		for(int i = 0; i < listOfStudents.size(); i++){
			xml += "\n<Student>\n";
		
			xml += listOfStudents.get(i).toXML();
			xml +="</Student>\n";
		}
		return xml;
		
	}
	

}
