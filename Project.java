import java.util.Scanner;

public class Project {

	// Declare Attributes for the Class Project
	String projectName;
	String projectNumber;
	String buildingType;
	String physicalAddress;
	String erfNumber;
	String projectDeadline;
	double projectValue;
	double paidToDate;
	String finalised;
	String completionDate;
	
	// The Class Project will contain Sub-Objects
	// We will construct Objects (instances of the Class Person within Class Project) and call these Sub-Objects contractor, architect and customer
	Person contractor;
	Person customer;
	Person architect;
	
	// Define the Class Methods
	// Define the Constructor needed to construct Objects from the Class Project
	public Project(String ProjectName, String ProjectNumber, String BuildingType, String PhysicalAddress, String ERFNumber,String projectDeadline, double ProjectValue, double PaidToDate, String ContractorName, String ContractorNumber, String ContractorEmail, String ContractorAddress, String CustomerName, String CustomerNumber, String CustomerEmail, String CustomerAddress, String ArchitectName, String ArchitectNumber, String ArchitectEmail, String ArchitectAddress)
	{
		this.projectName = ProjectName;
		this.projectNumber = ProjectNumber;
		this.buildingType = BuildingType;
		this.physicalAddress = PhysicalAddress;
		this.erfNumber = ERFNumber;
		this.projectDeadline = projectDeadline;
		this.projectValue = ProjectValue;
		this.paidToDate = PaidToDate;
		this.finalised = "No";
		this.completionDate = "";
		
		// Use the Person constructor to construct an object called contractor of type Person WITHIN THIS PROJECT CONSTRUCTOR
		this.contractor = new Person(ContractorName, ContractorNumber, ContractorEmail, ContractorAddress);
		this.customer = new Person(CustomerName, CustomerNumber, CustomerEmail, CustomerAddress);
		this.architect = new Person(ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress);
		
		// If a project name is not entered give it a name automatically
		if(this.projectName.equals(""))
		{
			this.projectName = this.buildingType + " " + this.customer.personName;
		}
	}
	
	// Define a function projectDetails() that displays all the attribute values when called from the Class ProjectManager
	public void displayProjectDetails()
	{
		System.out.println("Project name: " + projectName);
		System.out.println("Project number: " + projectNumber);
		System.out.println("Building type: " + buildingType);
		System.out.println("Physical address: " + physicalAddress);
		System.out.println("ERF number: " + erfNumber);
		System.out.println("Project value: " + projectValue);
		System.out.println("Paid to date: " + paidToDate);
		System.out.println("Project deadline: " + projectDeadline);
		System.out.println("Is the project finalised: " + finalised);
		System.out.println("Completion date: " + completionDate);
		
		// Call the non static function displayPersonDetails() from  the Person Class using the object contractor
		System.out.println(" ");
		System.out.println("Contractor Details");
		contractor.displayPersonDetails();
		
		System.out.println("Customer Details");
		customer.displayPersonDetails();
		
		System.out.println("Architect Details");
		architect.displayPersonDetails();

	}
	
	// Define a function updateProjectDeadline() that updates the deadline and displays all the attribute values when called from the Class ProjectManager
	public void updateProjectDeadline()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the project deadline: ");
		projectDeadline = s.nextLine();
		System.out.println(" ");
		
		displayProjectDetails();
	}
	
	// Define a function updateProjectPaidToDate() that updates the amount paid to date and displays all the attribute values when called from the Class ProjectManager
	public void updateProjectPaidToDate()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the amount paid to date: ");
		paidToDate = s.nextDouble();
		System.out.println(" ");
		
		displayProjectDetails();
	}
	
	public void finaliseProject()
	{
		finalised = "Finalised";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the completion date: ");
		completionDate = s.nextLine();
		System.out.println(" ");
		
		if(paidToDate < projectValue)
		{
			System.out.println("Poised Engineering Invoice");
			customer.displayPersonDetails();
			
			System.out.println("Outstanding balance: " + (projectValue - paidToDate) + "\n");
		}
		else if (paidToDate >= projectValue)
		{
			System.out.println("The customer does not have an outstanding balance.\n");
		}
		
		
		
	}
	
}
