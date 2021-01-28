// Import the Scanner class
import java.util.Scanner;

// Class Person
public class Person {

	// Attributes (private for encapsulation)
	private String personName;
	private String personNumber;
	private String personEmail;
	private String personAddress;
	
	// Constructor
	public Person(String name, String number, String email, String address)
	{
		this.setPersonName(name);
		this.setPersonNumber(number);
		this.setPersonEmail(email);
		this.setPersonAddress(address);
	}
	
	// Setters
	public void setPersonName(String Name)
	{
		this.personName = Name;
	}
	
	public void setPersonNumber(String Number)
	{
		this.personNumber = Number;
	}
	
	public void setPersonEmail(String Email)
	{
		this.personEmail = Email;
	}
	
	public void setPersonAddress(String Address)
	{
		this.personAddress = Address;
	}
	
	// Getters
	public String getPersonName()
	{
		return personName;
	}
	
	public String getPersonNumber()
	{
		return personNumber;
	}
	
	public String getPersonEmail()
	{
		return personEmail;
	}
	
	public String getPersonAddress()
	{
		return personAddress;
	}
	
	// Method displayPersonDetails() displays all the attribute values when called
	public void displayPersonDetails()
	{
		System.out.println("Name: " + getPersonName());
		System.out.println("Number: " + getPersonNumber());
		System.out.println("Email: " + getPersonEmail());
		System.out.println("Address: " + getPersonAddress());
		System.out.println(" ");	
	}
	
	// Method updatePersonNumber() updates the persons number
	public void updatePersonNumber()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the person's number: ");
		setPersonNumber(s.nextLine());
		System.out.println(" ");
		displayPersonDetails();
	}
	
	// Method updatePersonEmail() updates the persons email
	public void updatePersonEmail()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the person's email address: ");
		setPersonEmail(s.nextLine());
		System.out.println(" ");
		displayPersonDetails();
	}
	
	// Method updatePersonAddress() updates the persons address
	public void updatePersonAddress()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the person's address: ");
		setPersonAddress(s.nextLine());
		System.out.println(" ");
		displayPersonDetails();
	}
}
