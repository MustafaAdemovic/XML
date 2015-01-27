public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private int number;

	public Student(String firstName, String lastName, int age, int number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.number = number;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	public String toXML() {
		return "<firstName> " + firstName + " </firstName>\n" + "<lastName> "
				+ lastName + " </lastName>\n" + "<age> " + age + " </age>\n"
				+ "<number> " + number + " </number>\n";

	}

}
