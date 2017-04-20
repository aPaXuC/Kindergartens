package Source;

public abstract class Person {

	private E_FirstNames firstName;
	private E_LastNames lastName;

	public Person(E_FirstNames firstName, E_LastNames lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public E_FirstNames getFirstName() {
		return firstName;
	}

	public E_LastNames getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}

}
