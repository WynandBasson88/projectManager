import java.util.Scanner;

public class Person {

	// Declare Attributes for the Class Person
	String personName;
	String personNumber;
	String personEmail;
	String personAddress;
	
	// Define the Class Methods
	// Define the Constructor needed to construct Objects from the Class Person
	public Person(String Name, String Number, String Email, String Address)
	{
		this.personName = Name;
		this.personNumber = Number;
		this.personEmail = Email;
		this.personAddress = Address;
	}
	
	// Define a function personDetails() that displays all the attribute values when called from the Class ProjectManager
	public void displayPersonDetails()
	{
		System.out.println("Name: " + personName);
		System.out.println("Number: " + personNumber);
		System.out.println("Email: " + personEmail);
		System.out.println("Address: " + personAddress);
		System.out.println(" ");
		
	}
	
	// Define a function updatePersonNumber() that updates the persons number and displays all the attribute values when called from Class ProjectManager
	public void updatePersonNumber()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the person's number: ");
		personNumber = s.nextLine();
		System.out.println(" ");
		
		displayPersonDetails();
		
	}
	
	// Define a function updatePersonEmail() that updates the persons email and displays all the attribute values when called from Class ProjectManager
	public void updatePersonEmail()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the person's email address: ");
		personEmail = s.nextLine();
		System.out.println(" ");
		
		displayPersonDetails();
		
	}
	
	// Define a function updatePersonAddress() that updates the persons address and displays all the attribute values when called from Class ProjectManager
	public void updatePersonAddress()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the person's address: ");
		personAddress = s.nextLine();
		System.out.println(" ");
		
		displayPersonDetails();
		
	}
}
