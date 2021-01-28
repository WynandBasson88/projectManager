// Import the Scanner class
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Class Person
/**
 * Java class Project
 * <br>
 * This class will be used to construct objects of type Project
 * @author Wynand Basson
 * @version 1.00, 25 January 2021
 */
public class Project {

	// Attributes (private for encapsulation)
	/**
	 * String value for the project name
	 */
	private String projectName;
	
	/**
	 * String value for the project number
	 */
	private String projectNumber;
	
	/**
	 * String value for the building type
	 */
	private String buildingType;
	
	/**
	 * String value for the physical address
	 */
	private String physicalAddress;
	
	/**
	 * String value for the ERF number
	 */
	private String erfNumber;
	
	/**
	 * LocalDate value for the project deadline
	 */
	private LocalDate projectDeadline;
	
	/**
	 * double value for the project value
	 */
	private double projectValue;
	
	/**
	 * double value for the amount paid to date
	 */
	private double paidToDate;
	
	/**
	 * String value for the project status
	 */
	private String finalised;
	
	/**
	 * String value for the project completion date
	 */
	private String completionDate;
	
	// We will construct Sub-Objects in the Project class and call them contractor, architect and customer
	/**
	 * Person sub-object for the project contractor
	 */
	private Person contractor;
	
	/**
	 * Person sub-object for the project customer
	 */
	private Person customer;
	
	/**
	 * Person sub-object for the project architect
	 */
	private Person architect;
	
	// Constructor
	/**
	 * 
	 * @param projectName Construct the project name
	 * @param projectNumber Construct the project number
	 * @param buildingType Construct the project building type
	 * @param physicalAddress Construct the project physical address
	 * @param erfNumber Construct the project ERF number
	 * @param projectDeadline Construct the project deadline
	 * @param projectValue Construct the project value
	 * @param paidToDate Construct the project amount paid to date
	 * @param finalised Construct the project status
	 * @param completionDate Construct the project completion date
	 * @param contractorName Construct the contractor name
	 * @param contractorNumber Construct the contractor number
	 * @param contractorEmail Construct the contractor email
	 * @param contractorAddress Construct the contractor address
	 * @param customerName Construct the customer name
	 * @param customerNumber Construct the customer number
	 * @param customerEmail Construct the customer email
	 * @param customerAddress Construct the customer address
	 * @param architectName Construct the architect name
	 * @param architectNumber Construct the architect number
	 * @param architectEmail Construct the architect email
	 * @param architectAddress Construct the architect address
	 */
	public Project(String projectName, String projectNumber, String buildingType, String physicalAddress, String erfNumber, LocalDate projectDeadline, double projectValue, double paidToDate, String finalised, String completionDate, String contractorName, String contractorNumber, String contractorEmail, String contractorAddress, String customerName, String customerNumber, String customerEmail, String customerAddress, String architectName, String architectNumber, String architectEmail, String architectAddress)
	{
		this.setProjectName(projectName);
		this.setProjectNumber(projectNumber);
		this.setBuildingType(buildingType);
		this.setPhysicalAddress(physicalAddress);
		this.setERFNumber(erfNumber);
		this.setProjectDeadline(projectDeadline);
		this.setProjectValue(projectValue);
		this.setPaidToDate(paidToDate);
		this.setFinalised(finalised);
		this.setCompletionDate(completionDate);
		
		// Construct Sub-Objects called contractor, customer and architect of type Person WITHIN THIS PROJECT CONSTRUCTOR
		this.setContractor(contractorName, contractorNumber, contractorEmail, contractorAddress);
		this.setCustomer(customerName, customerNumber, customerEmail, customerAddress);
		this.setArchitect(architectName, architectNumber, architectEmail, architectAddress);
		
		// If a project name is not entered give it a name automatically
		if(this.getProjectName().equals(""))
		{
			this.setProjectName(this.getBuildingType() + " " + this.getCustomer().getPersonName());
		}
	}
	
	// Setters
	/**
	 * 
	 * @param ProjectName Set the project name
	 */
	public void setProjectName(String ProjectName)
	{
		this.projectName = ProjectName;
	}
	
	/**
	 * 
	 * @param ProjectNumber Set the project number
	 */
	public void setProjectNumber(String ProjectNumber)
	{
		this.projectNumber = ProjectNumber;
	}
	
	/**
	 * 
	 * @param BuildingType Set the project building type
	 */
	public void setBuildingType(String BuildingType)
	{
		this.buildingType = BuildingType;
	}
	
	/**
	 * 
	 * @param PhysicalAddress Set the project physical address
	 */
	public void setPhysicalAddress(String PhysicalAddress)
	{
		this.physicalAddress = PhysicalAddress;
	}
	
	/**
	 * 
	 * @param ERFNumber Set the project ERF number
	 */
	public void setERFNumber(String ERFNumber)
	{
		this.erfNumber = ERFNumber;
	}
	
	/**
	 * 
	 * @param ProjectDeadline Set the project deadline
	 */
	public void setProjectDeadline(LocalDate ProjectDeadline)
	{
		this.projectDeadline = ProjectDeadline;
	}
	
	/**
	 * 
	 * @param ProjectValue Set the project value
	 */
	public void setProjectValue(double ProjectValue)
	{
		this.projectValue = ProjectValue;
	}
	
	/**
	 * 
	 * @param PaidToDate Set the project amount paid to date
	 */
	public void setPaidToDate(double PaidToDate)
	{
		this.paidToDate = PaidToDate;
	}
	
	/**
	 * 
	 * @param Finalised Set the project status
	 */
	public void setFinalised(String Finalised)
	{
		this.finalised = Finalised;
	}
	
	/**
	 * 
	 * @param CompletionDate Set the project completion date
	 */
	public void setCompletionDate(String CompletionDate)
	{
		this.completionDate = CompletionDate;
	}
	
	/**
	 * 
	 * @param ContractorName Set the contractor name
	 * @param ContractorNumber Set the contractor number
	 * @param ContractorEmail Set the contractor email
	 * @param ContractorAddress Set the contractor address
	 */
	public void setContractor(String ContractorName, String ContractorNumber, String ContractorEmail, String ContractorAddress)
	{
		this.contractor = new Person(ContractorName, ContractorNumber, ContractorEmail, ContractorAddress);
	}
	
	/**
	 * 
	 * @param CustomerName Set the customer name
	 * @param CustomerNumber Set the customer number
	 * @param CustomerEmail Set the customer email
	 * @param CustomerAddress Set the customer address
	 */
	public void setCustomer(String CustomerName, String CustomerNumber, String CustomerEmail, String CustomerAddress)
	{
		this.customer = new Person(CustomerName, CustomerNumber, CustomerEmail, CustomerAddress);
	}
	
	/**
	 * 
	 * @param ArchitectName Set the architect name
	 * @param ArchitectNumber Set the architect number
	 * @param ArchitectEmail Set the architect email
	 * @param ArchitectAddress Set the architect address
	 */
	public void setArchitect(String ArchitectName, String ArchitectNumber, String ArchitectEmail, String ArchitectAddress)
	{
		this.architect = new Person(ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress);
	}
	
	// Getters
	/**
	 * 
	 * @return Get the project name
	 */
	public String getProjectName()
	{
		return projectName;
	}
	
	/**
	 * 
	 * @return Get the project number
	 */
	public String getProjectNumber()
	{
		return projectNumber;
	}
	
	/**
	 * 
	 * @return Get the project building type
	 */
	public String getBuildingType()
	{
		return buildingType;
	}
	
	/**
	 * 
	 * @return Get the project physical address
	 */
	public String getPhysicalAddress()
	{
		return physicalAddress;
	}
	
	/**
	 * 
	 * @return Get the project ERF number
	 */
	public String getERFNumber()
	{
		return erfNumber;
	}
	
	/**
	 * 
	 * @return Get the project deadline
	 */
	public LocalDate getProjectDeadline()
	{
		return projectDeadline;
	}
	
	/**
	 * 
	 * @return Get the project value
	 */
	public double getProjectValue()
	{
		return projectValue;
	}
	
	/**
	 * 
	 * @return Get the project amount paid to date
	 */
	public double getPaidToDate()
	{
		return paidToDate;
	}
	
	/**
	 * 
	 * @return Get the project status
	 */
	public String getFinalised()
	{
		return finalised;
	}
	
	/**
	 * 
	 * @return Get the project completion date 
	 */
	public String getCompletionDate()
	{
		return completionDate;
	}
	
	/**
	 * 
	 * @return Get the contractor
	 */
	public Person getContractor()
	{
		return contractor;
	}
	
	/**
	 * 
	 * @return Get the customer
	 */
	public Person getCustomer()
	{
		return customer;
	}
	
	/**
	 * 
	 * @return Get the architect
	 */
	public Person getArchitect()
	{
		return architect;
	}
	
	// Method displayProjectDetails() displays all the attributes
	/**
	 * Display the project details by using the getters
	 */
	public void displayProjectDetails()
	{
		System.out.println("Project name: " + getProjectName());
		System.out.println("Project number: " + getProjectNumber());
		System.out.println("Building type: " + getBuildingType());
		System.out.println("Physical address: " + getPhysicalAddress());
		System.out.println("ERF number: " + getERFNumber());
		System.out.println("Project value: " + getProjectValue());
		System.out.println("Paid to date: " + getPaidToDate());
		System.out.println("Project deadline: " + getProjectDeadline());
		System.out.println("Is the project finalised: " + getFinalised());
		System.out.println("Completion date: " + getCompletionDate());
		
		// Call non static method displayPersonDetails() from  the Person Class using the object contractor, customer and architect
		System.out.println("Contractor Details");
		getContractor().displayPersonDetails();
		
		System.out.println("Customer Details");
		getCustomer().displayPersonDetails();
		
		System.out.println("Architect Details");
		getArchitect().displayPersonDetails();
		System.out.println("");
	}
	
	// Method updateProjectDeadline() updates the project deadline
	/**
	 * Update the project deadline
	 */
	public void updateProjectDeadline()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the project deadline (Format: yyyy-MM-dd): ");
		String stringDeadline = s.nextLine();
		LocalDate deadline = updateDeadlineException(stringDeadline);
		setProjectDeadline(deadline);
		System.out.println("The project deadline has been updated to: " + getProjectDeadline());
		System.out.println(" ");
	}
	
	// Method updateDeadlineException() handles the update deadline exception
	/**
	 * 
	 * @param StringDeadline The value to be cast from a string type to a LocalDate type
	 * @return The LocalDate value is returned either as entered by the user if the cast is successful or kept unchanged if the cast fails
	 */
	private LocalDate updateDeadlineException(String StringDeadline)
	{
		try // Defensive Programming: Try to cast the String value to a LocalDate value
		{
			LocalDate Deadline = LocalDate.parse(StringDeadline, DateTimeFormatter.ISO_DATE);
			return Deadline;
		}
		catch(Exception e) // If the cast fails keep the date unchanged
		{
			System.out.println("Invalid date format. Be sure to use the format: yyyy-MM-dd");
			System.out.println("Deadline kept unchanged with date: " + getProjectDeadline());
			System.out.println("");
			return getProjectDeadline();
		}
	}
	
	// Method updateProjectPaidToDate() updates the amount paid to date
	/**
	 * Update the amount paid to date
	 */
	public void updateProjectPaidToDate()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the amount paid to date: ");
		while(!s.hasNextDouble()) // Defensive Programming
		{
			System.out.println("Please make a valid entry: ");
			s.next();
		}
		setPaidToDate(s.nextDouble());
		System.out.println("The amount paid to date has been updated to: " + getPaidToDate());
		System.out.println(" ");
	}
	
	// Method finaliseProject() finalises the project and prints an Invoice
	/**
	 * The project status is finalised
	 */
	public void finaliseProject()
	{
		setFinalised("Finalised");
		System.out.println("The project status has been updated to: " + getFinalised());
		System.out.println(" ");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the completion date (Format: yyyy-MM-dd): ");
		setCompletionDate(s.nextLine());
		System.out.println("The project completion date has been updated to: " + getCompletionDate());
		System.out.println(" ");
		
		if(getPaidToDate() < getProjectValue())
		{
			System.out.println("Poised Engineering Invoice");
			getCustomer().displayPersonDetails();
			System.out.println("Outstanding balance: " + (getProjectValue() - getPaidToDate()) + "\n");
			printInvoice();
			System.out.println("Invoice printed successfully in file Invoice.txt\n");
		}
		else if (getPaidToDate() >= getProjectValue())
		{
			System.out.println("The customer does not have an outstanding balance.\n");
		}
	}
	
	// Method to print an Invoice
	/**
	 * An invoice is generated
	 */
	public void printInvoice()
	{
		try
		{
			FileWriter f = new FileWriter("Invoice.txt", true);
			Formatter file = new Formatter(f);
			file.format("%s %s", "Poised Engineering Invoice", "\r\n");
			file.format("%s %s %s", "Name:", getCustomer().getPersonName(), "\r\n");
			file.format("%s %s %s", "Number:", getCustomer().getPersonNumber(), "\r\n");
			file.format("%s %s %s", "Email:", getCustomer().getPersonEmail(), "\r\n");
			file.format("%s %s %s", "Address:", getCustomer().getPersonAddress(), "\r\n");
			file.format("%s %s %s %s", "Outstanding Balance:", (getProjectValue() - getPaidToDate()), "\r\n", "\r\n");
			file.close();
		}
		catch(Exception e)
		{
			System.out.println("An error occured");
		}
	}
}
