// Import the Scanner class
import java.util.Scanner;
import java.util.Formatter;

// Class Person
public class Project {

	// Attributes (private for encapsulation)
	private String projectName;
	private String projectNumber;
	private String buildingType;
	private String physicalAddress;
	private String erfNumber;
	private String projectDeadline;
	private double projectValue;
	private double paidToDate;
	private String finalised;
	private String completionDate;
	
	// The Class Project will contain Sub-Objects
	// We will construct Sub-Objects and call these Sub-Objects contractor, architect and customer
	private Person contractor;
	private Person customer;
	private Person architect;
	
	// Constructor
	public Project(String projectName, String projectNumber, String buildingType, String physicalAddress, String erfNumber,String projectDeadline, double projectValue, double paidToDate, String finalised, String completionDate, String contractorName, String contractorNumber, String contractorEmail, String contractorAddress, String customerName, String customerNumber, String customerEmail, String customerAddress, String architectName, String architectNumber, String architectEmail, String architectAddress)
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
		
		// Construct Sub-Object called contractor, customer and architect of type Person WITHIN THIS PROJECT CONSTRUCTOR
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
	public void setProjectName(String ProjectName)
	{
		this.projectName = ProjectName;
	}
	
	public void setProjectNumber(String ProjectNumber)
	{
		this.projectNumber = ProjectNumber;
	}
	
	public void setBuildingType(String BuildingType)
	{
		this.buildingType = BuildingType;
	}
	
	public void setPhysicalAddress(String PhysicalAddress)
	{
		this.physicalAddress = PhysicalAddress;
	}
	
	public void setERFNumber(String ERFNumber)
	{
		this.erfNumber = ERFNumber;
	}
	
	public void setProjectDeadline(String ProjectDeadline)
	{
		this.projectDeadline = ProjectDeadline;
	}
	
	public void setProjectValue(double ProjectValue)
	{
		this.projectValue = ProjectValue;
	}
	
	public void setPaidToDate(double PaidToDate)
	{
		this.paidToDate = PaidToDate;
	}
	
	public void setFinalised(String Finalised)
	{
		this.finalised = Finalised;
	}
	
	public void setCompletionDate(String CompletionDate)
	{
		this.completionDate = CompletionDate;
	}
	
	public void setContractor(String ContractorName, String ContractorNumber, String ContractorEmail, String ContractorAddress)
	{
		this.contractor = new Person(ContractorName, ContractorNumber, ContractorEmail, ContractorAddress);
	}
	
	public void setCustomer(String CustomerName, String CustomerNumber, String CustomerEmail, String CustomerAddress)
	{
		this.customer = new Person(CustomerName, CustomerNumber, CustomerEmail, CustomerAddress);
	}
	
	public void setArchitect(String ArchitectName, String ArchitectNumber, String ArchitectEmail, String ArchitectAddress)
	{
		this.architect = new Person(ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress);
	}
	
	// Getters
	public String getProjectName()
	{
		return projectName;
	}
	
	public String getProjectNumber()
	{
		return projectNumber;
	}
	
	public String getBuildingType()
	{
		return buildingType;
	}
	
	public String getPhysicalAddress()
	{
		return physicalAddress;
	}
	
	public String getERFNumber()
	{
		return erfNumber;
	}
	
	public String getProjectDeadline()
	{
		return projectDeadline;
	}
	
	public double getProjectValue()
	{
		return projectValue;
	}
	
	public double getPaidToDate()
	{
		return paidToDate;
	}
	
	public String getFinalised()
	{
		return finalised;
	}
	
	public String getCompletionDate()
	{
		return completionDate;
	}
	
	public Person getContractor()
	{
		return contractor;
	}
	
	public Person getCustomer()
	{
		return customer;
	}
	
	public Person getArchitect()
	{
		return architect;
	}
	
	// Method displayProjectDetails() displays all the attributes
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
		System.out.println(" ");
		System.out.println("Contractor Details");
		getContractor().displayPersonDetails();
		
		System.out.println("Customer Details");
		getCustomer().displayPersonDetails();
		
		System.out.println("Architect Details");
		getArchitect().displayPersonDetails();
	}
	
	// Method updateProjectDeadline() updates the project deadline
	public void updateProjectDeadline()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the project deadline: ");
		setProjectDeadline(s.nextLine());
		System.out.println("The project deadline has been updated to: " + getProjectDeadline());
		System.out.println(" ");
	}
	
	// Method updateProjectPaidToDate() updates the amount paid to date
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
	public void finaliseProject()
	{
		setFinalised("Finalised");
		System.out.println("The project status has been updated to: " + getFinalised());
		System.out.println(" ");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the completion date: ");
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
	public void printInvoice()
	{
		try
		{
			Formatter file = new Formatter("Invoice.txt");
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
