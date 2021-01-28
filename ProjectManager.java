// Imports
import java.util.Formatter;
import java.util.Scanner;

// Class ProjectManager
public class ProjectManager {

	// main() method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Call the projectManager() method
		projectManager();
		
	}
	
	// Method projectManager()
	private static void projectManager()
	{		
		// Ensure the project object is initialised 
		Project project = new Project("", "", "", "", "", "", 0.0, 0.0, "", "", "", "", "", "", "", "", "", "", "", "", "", "");
		
		// Create a running Menu
		while (true)
		{
			// Display the main menu
			String userSelection = mainMenuSelection();
					
			// Defensive Programming
			while(!userSelection.equals("1") && !userSelection.equals("2") && !userSelection.equals("3") && !userSelection.equals("4") && !userSelection.equals("5") && !userSelection.equals("6"))
			{
				userSelection = invalidMenuSelection();
			}
					
			// Create a project
			if (userSelection.equals("1"))
			{
				// Capture project details and construct a project object
				project = createProject();
						
				System.out.println("\nProject details captured!\n");	
				project.displayProjectDetails();			
			}
					
			// Display the captured details of the project
			if (userSelection.equals("2"))
			{
				project.displayProjectDetails();
			}
			
			if (userSelection.equals("3"))
			{
				printProjectOverview(project);
				System.out.println("Project overview printed out successfully in file Projects.txt!\n");
			}
					
			// Display the update menu
			if (userSelection.equals("4"))
			{
				while(true)
				{
					String selection = updateMenuSelection();
							
					// Defensive Programming
					while(!selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4") && !selection.equals("5") && !selection.equals("6") && !selection.equals("7") && !selection.equals("8") && !selection.equals("9") && !selection.equals("10") && !selection.equals("11") && !selection.equals("12"))
					{
						selection = invalidMenuSelection();
					}
							
					if(selection.equals("1"))
					{
						project.updateProjectDeadline();
					}
							
					if(selection.equals("2"))
					{
						project.updateProjectPaidToDate();
					}
							
					if(selection.equals("3"))
					{
						project.getContractor().updatePersonNumber();
					}
							
					if(selection.equals("4"))
					{
						project.getContractor().updatePersonEmail();
					}
							
					if(selection.equals("5"))
					{
						project.getContractor().updatePersonAddress();
					}
							
					if(selection.equals("6"))
					{
						project.getCustomer().updatePersonNumber();
					}
							
					if(selection.equals("7"))
					{
						project.getCustomer().updatePersonEmail();
					}
							
					if(selection.equals("8"))
					{
						project.getCustomer().updatePersonAddress();
					}
							
					if(selection.equals("9"))
					{
						project.getArchitect().updatePersonNumber();
					}
							
					if(selection.equals("10"))
					{
						project.getArchitect().updatePersonEmail();
					}
							
					if(selection.equals("11"))
					{
						project.getArchitect().updatePersonAddress();
					}
							
					if(selection.equals("12"))
					{
						System.out.println("You are being directed to the Main Menu.\n");
						break;
					}

				}	
			}
					
			// Finalise the project and print a receipt
			if (userSelection.equals("5"))
			{
				project.finaliseProject();
			}
					
			// Exit the project manager
			if (userSelection.equals("6"))
			{
				System.out.println("Goodbye!");
				break;
			}
		}
	}
	
	//Methods
	
	// Method for the main menu
	private static String mainMenuSelection()
	{
		Scanner menu = new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("1. Create a new project");
		System.out.println("2. Display project details");
		System.out.println("3. Print project details");
		System.out.println("4. Update project details");
		System.out.println("5. Finalise project");
		System.out.println("6. Exit");
		System.out.println("Select an option from the menu above: ");
		String Selection = menu.nextLine();
		System.out.println(" ");
		return Selection;
	}
	
	// Method for defensive programming
	private static String invalidMenuSelection()
	{
		Scanner menu = new Scanner(System.in);
		System.out.println("You did not make a valid Selection.");
		System.out.println("Select an option from the menu above: ");
		String Selection = menu.nextLine();
		System.out.println(" ");
		return Selection;
	}
	
	// Method for the update menu
	private static String updateMenuSelection()
	{
		Scanner menu = new Scanner(System.in);
		System.out.println("Update Menu");
		System.out.println("1. Update project deadline");
		System.out.println("2. Update amount paid to date");
		System.out.println("3. Update contractor number");
		System.out.println("4. Update contractor email");
		System.out.println("5. Update contractor address");
		System.out.println("6. Update customer number");
		System.out.println("7. Update customer email");
		System.out.println("8. Update customer address");
		System.out.println("9. Update architect number");
		System.out.println("10. Update architect email");
		System.out.println("11. Update architect address");
		System.out.println("12. Exit to Main Menu");
		System.out.println("Select an option from the menu above: ");
		String Selection = menu.nextLine();
		System.out.println(" ");
		return Selection;
	}
	
	// Method to create a project
	private static Project createProject()
	{	
		Scanner inputString = new Scanner(System.in);
		Scanner inputDouble = new Scanner(System.in);
		
		// Ask the user to input details about the project and save the inputs
		System.out.println("Please enter the project name: ");
		String projName = inputString.nextLine();
		
		System.out.println("Please enter the project number: ");
		String projNumber = inputString.nextLine();
		
		System.out.println("Please enter the type of building: ");
		String buildType = inputString.nextLine();
		
		System.out.println("Please enter the physical address: ");
		String physAddress = inputString.nextLine();
		
		System.out.println("Please enter the ERF number: ");
		String erfNum = inputString.nextLine();
		
		System.out.println("Please enter the project deadline: ");
		String projDeadline = inputString.nextLine();
		
		System.out.println("Please enter the contractor's name: ");
		String contractorName = inputString.nextLine();
		
		System.out.println("Please enter the contractor's number: ");
		String contractorNumber = inputString.nextLine();
		
		System.out.println("Please enter the contractor's email: ");
		String contractorEmail = inputString.nextLine();
		
		System.out.println("Please enter the contractor's address: ");
		String contractorAddress = inputString.nextLine();
		
		System.out.println("Please enter the customer's name: ");
		String customerName = inputString.nextLine();
		
		System.out.println("Please enter the customer's number: ");
		String customerNumber = inputString.nextLine();
		
		System.out.println("Please enter the customer's email: ");
		String customerEmail = inputString.nextLine();
		
		System.out.println("Please enter the customer's address: ");
		String customerAddress = inputString.nextLine();
		
		System.out.println("Please enter the architect's name: ");
		String architectName = inputString.nextLine();
		
		System.out.println("Please enter the architect's number: ");
		String architectNumber = inputString.nextLine();
		
		System.out.println("Please enter the architect's email: ");
		String architectEmail = inputString.nextLine();
		
		System.out.println("Please enter the architect's address: ");
		String architectAddress = inputString.nextLine();
		
		System.out.println("Please enter the project cost: ");
		while(!inputDouble.hasNextDouble()) // Defensive Programming
		{
			System.out.println("Please make a valid entry: ");
			inputDouble.next();
		}
		double projCost = inputDouble.nextDouble();
		
		System.out.println("Please enter the amount paid to date: ");
		while(!inputDouble.hasNextDouble()) // Defensive Programming
		{
			System.out.println("Please make a valid entry: ");
			inputDouble.next();
		}
		double paidToDate = inputDouble.nextDouble();
		
		String finalised = "Not Finalised";
		String completionDate = "";
		
		// Construct an object called project of type Project
		Project Project = new Project(projName, projNumber, buildType, physAddress, erfNum, projDeadline, projCost, paidToDate, finalised, completionDate, contractorName, contractorNumber, contractorEmail, contractorAddress, customerName, customerNumber, customerEmail, customerAddress, architectName, architectNumber, architectEmail, architectAddress);
		
		return Project;
	}
	
	// Method for printing the projects to text file Projects.txt
	private static void printProjectOverview(Project project)
	{
		// Defensive programming: If we fail to create and write to the text file an exception will be thrown and the catch block will execute 
		try
		{
			Formatter file = new Formatter("Projects.txt");
			file.format("%s %s %s", "Project Name:", project.getProjectName(), "\r\n");
			file.format("%s %s %s", "Project Number:", project.getProjectNumber(), "\r\n");
			file.format("%s %s %s", "Building Type:", project.getBuildingType(), "\r\n");
			file.format("%s %s %s", "Physical Address:", project.getPhysicalAddress(), "\r\n");
			file.format("%s %s %s", "ERF Number:", project.getERFNumber(), "\r\n");
			file.format("%s %s %s", "Project Deadline:", project.getProjectDeadline(), "\r\n");
			file.format("%s %s %s", "Project Value:", project.getProjectValue(), "\r\n");
			file.format("%s %s %s", "Paid To Date:", project.getPaidToDate(), "\r\n");
			file.format("%s %s %s", "Finalised:", project.getFinalised(), "\r\n");
			file.format("%s %s %s", "Completion Date:", project.getCompletionDate(), "\r\n");
			file.format("%s %s %s", "Contractor Name:", project.getContractor().getPersonName(), "\r\n");
			file.format("%s %s %s", "Contractor Number:", project.getContractor().getPersonNumber(), "\r\n");
			file.format("%s %s %s", "Contractor Email:", project.getContractor().getPersonEmail(), "\r\n");
			file.format("%s %s %s", "Contractor Address:", project.getContractor().getPersonAddress(), "\r\n");
			file.format("%s %s %s", "Customer Name:", project.getCustomer().getPersonName(), "\r\n");
			file.format("%s %s %s", "Customer Number:", project.getCustomer().getPersonNumber(), "\r\n");
			file.format("%s %s %s", "Customer Email:", project.getCustomer().getPersonEmail(), "\r\n");
			file.format("%s %s %s", "Customer Address:", project.getCustomer().getPersonAddress(), "\r\n");
			file.format("%s %s %s", "Architect Name:", project.getArchitect().getPersonName(), "\r\n");
			file.format("%s %s %s", "Architect Number:", project.getArchitect().getPersonNumber(), "\r\n");
			file.format("%s %s %s", "Architect Email:", project.getArchitect().getPersonEmail(), "\r\n");
			file.format("%s %s %s %s", "Architect Address:", project.getArchitect().getPersonAddress(), "\r\n", "\r\n");
			file.close();
		}
		catch(Exception e)
		{
			System.out.println("An error occured");
		}
	}
}
