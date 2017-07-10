package pack1;

public class Person {
	private String lastName, firstName, id, ssn;
	private static int counter = 0;

	public Person(String lastName, String firstName, String id, String ssn) {
		super();
		lastName = lastName;
		this.firstName = firstName;
		this.id = id;
		this.ssn = ssn;
		counter++;
	}
	
	public Person() {
		counter++;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", id=" + id + ", ssn=" + ssn + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void increment() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
	
}
