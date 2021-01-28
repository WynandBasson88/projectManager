// Import the Scanner class
import java.util.Scanner;

// Class Person
/**
 * Java class Person
 * <br>
 * This class will be used to construct objects of type Person
 * @author Wynand Basson
 * @version 1.00, 25 January 2021
 */
public class Person {

	// Attributes (private for encapsulation)
	/**
	 * String value for the person's name
	 */
	private String personName;
	
	/**
	 * String value for the person's number
	 */
	private String personNumber;
	
	/**
	 * String value for the person's email
	 */
	private String personEmail;
	
	/**
	 * String value for the person's address
	 */
	private String personAddress;
	
	// Constructor
	/**
	 * 
	 * @param name Construct the person's name
	 * @param number Construct the person's number
	 * @param email Construct the person's email
	 * @param address Construct the person's address
	 */
	public Person(String name, String number, String email, String address)
	{
		this.setPersonName(name);
		this.setPersonNumber(number);
		this.setPersonEmail(email);
		this.setPersonAddress(address);
	}
	
	// Setters
	/**
	 * 
	 * @param Name Set the person's name
	 */
	public void setPersonName(String Name)
	{
		this.personName = Name;
	}
	
	/**
	 * 
	 * @param Number Set the person's number
	 */
	public void setPersonNumber(String Number)
	{
		this.personNumber = Number;
	}
	
	/**
	 * 
	 * @param Email Set the person's email
	 */
	public void setPersonEmail(String Email)
	{
		this.personEmail = Email;
	}
	
	/**
	 * 
	 * @param Address Set the person's address
	 */
	public void setPersonAddress(String Address)
	{
		this.personAddress = Address;
	}
	
	// Getters
	/**
	 * 
	 * @return Get the person's name
	 */
	public String getPersonName()
	{
		return personName;
	}
	
	/**
	 * 
	 * @return Get the person's number
	 */
	public String getPersonNumber()
	{
		return personNumber;
	}
	
	/**
	 * 
	 * @return Get the person's email
	 */
	public String getPersonEmail()
	{
		return personEmail;
	}
	
	/**
	 * 
	 * @return Get the person's address
	 */
	public String getPersonAddress()
	{
		return personAddress;
	}
	
	// Method displayPersonDetails() displays all the attributes
	/**
	 * Display the person's details by using the getters
	 */
	public void displayPersonDetails()
	{
		System.out.println("Name: " + getPersonName());
		System.out.println("Number: " + getPersonNumber());
		System.out.println("Email: " + getPersonEmail());
		System.out.println("Address: " + getPersonAddress());	
	}
	
	// Method updatePersonNumber() updates the persons number
	/**
	 * Update the person's number
	 */
	public void updatePersonNumber()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the person's number: ");
		setPersonNumber(s.nextLine());
		System.out.println(" ");
		displayPersonDetails();
	}
	
	// Method updatePersonEmail() updates the persons email
	/**
	 * Update the person's email
	 */
	public void updatePersonEmail()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the person's email address: ");
		setPersonEmail(s.nextLine());
		System.out.println(" ");
		displayPersonDetails();
	}
	
	// Method updatePersonAddress() updates the persons address
	/**
	 * Update the person's address
	 */
	public void updatePersonAddress()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the person's address: ");
		setPersonAddress(s.nextLine());
		System.out.println(" ");
		displayPersonDetails();
	}
}
