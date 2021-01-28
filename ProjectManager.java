// Imports
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Class ProjectManager
/**
 * Java class ProjectManager
 * <br>
 * This class contains the main method and will be used to create, display, print, update and finalise projects
 * @author Wynand Basson
 * @version 1.00, 25 January 2021
 */
public class ProjectManager {

	// main() method
	/**
	 * 
	 * @param args The main method calls projectManager() to start the application
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Call the projectManager() method
		projectManager();	
	}
	
	// METHODS
	
	// Method projectManager()
	/**
	 * This method is the start of the project manager application and contains the program flow logic
	 */
	private static void projectManager()
	{		
		// Create a running Menu
		while (true)
		{	
			// Display the main menu
			String userSelection = displayMainMenu();
					
			// Defensive Programming
			while(!userSelection.equals("1") && !userSelection.equals("2") && !userSelection.equals("3") && !userSelection.equals("4") && !userSelection.equals("5") && !userSelection.equals("6") && !userSelection.equals("7") && !userSelection.equals("8") && !userSelection.equals("9") && !userSelection.equals("10") && !userSelection.equals("11"))
			{
				userSelection = invalidMenuSelection();
			}
					
			// Create a project
			if (userSelection.equals("1"))
			{
				createProject();
			}
					
			// Display the captured details of all projects
			if (userSelection.equals("2"))
			{
				displayAllProjects();
			}

			// Display the captured details of all completed projects
			if (userSelection.equals("3"))
			{
				displayCompletedProjects();
			}
			
			// Display the captured details of all uncompleted projects
			if (userSelection.equals("4"))
			{
				displayUnCompletedProjects();
			}
			
			// Display the captured details of all overdue projects
			if (userSelection.equals("5"))
			{
				displayOverdueProjects();
			}
			
			// Print the captured details of all projects
			if (userSelection.equals("6"))
			{
				printAllProjects();
			}
			
			// Print the captured details of all completed projects
			if (userSelection.equals("7"))
			{
				printCompletedProjects();
			}
			
			// Print the captured details of all uncompleted projects
			if (userSelection.equals("8"))
			{
				printUnCompletedProjects();
			}
			
			// Print the captured details of all overdue projects
			if (userSelection.equals("9"))
			{
				printOverdueProjects();
			}
					
			// Display the sub menu to select, display, update and finalise a project
			if (userSelection.equals("10"))
			{
				selectProject();
			}
					
			// Exit the project manager and print latest project details to file Projects_All.txt
			if (userSelection.equals("11"))
			{
				printAllProjects();
				System.out.println("Goodbye!");
				break;
			}
		}
	}
	
	// Method for the main menu
	/**
	 * 
	 * @return The user selection is returned as a String value in order to make a main menu selection
	 */
	private static String displayMainMenu()
	{
		Scanner menu = new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("1. Add a new project");
		System.out.println("2. Display all projects");
		System.out.println("3. Display all completed projects");
		System.out.println("4. Display all uncompleted projects");
		System.out.println("5. Display all overdue projects");
		System.out.println("6. Print all projects");
		System.out.println("7. Print all completed projects");
		System.out.println("8. Print all uncompleted projects");
		System.out.println("9. Print all overdue projects");
		System.out.println("10. Select a project");
		System.out.println("11. Exit");
		System.out.println("Select an option from the menu above: ");
		String Selection = menu.nextLine();
		System.out.println(" ");
		return Selection;
	}
	
	// Method for defensive programming
	/**
	 * 
	 * @return The user selection is returned as a String value in order to make a main menu selection
	 */
	private static String invalidMenuSelection()
	{
		Scanner menu = new Scanner(System.in);
		System.out.println("You did not make a valid selection.");
		System.out.println("Select an option from the menu above: ");
		String Selection = menu.nextLine();
		System.out.println(" ");
		return Selection;
	}
	
	// Method for the update menu
	/**
	 * 
	 * @return The user selection is returned as a String value in order to make a update menu selection 
	 */
	private static String updateMenuSelection()
	{
		Scanner menu = new Scanner(System.in);
		System.out.println("Update Menu");
		System.out.println("1. Display project");
		System.out.println("2. Print project");
		System.out.println("3. Update project deadline");
		System.out.println("4. Update amount paid to date");
		System.out.println("5. Update contractor number");
		System.out.println("6. Update contractor email");
		System.out.println("7. Update contractor address");
		System.out.println("8. Update customer number");
		System.out.println("9. Update customer email");
		System.out.println("10. Update customer address");
		System.out.println("11. Update architect number");
		System.out.println("12. Update architect email");
		System.out.println("13. Update architect address");
		System.out.println("14. Finalise project");
		System.out.println("15. To select a different project");
		System.out.println("Select an option from the menu above: ");
		String Selection = menu.nextLine();
		System.out.println(" ");
		return Selection;
	}
	
	// Method to create a project
	/**
	 * Project details are captured by constructing a Project object
	 */
	private static void createProject()
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
		
		System.out.println("Please enter the project deadline (Format: yyyy-MM-dd): ");
		String deadline = inputString.nextLine();
		LocalDate projDeadline = deadlineException(deadline); // Defensive Programming
		
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
		
		// Construct an object called Project of type Project
		Project Project = new Project(projName, projNumber, buildType, physAddress, erfNum, projDeadline, projCost, paidToDate, finalised, completionDate, contractorName, contractorNumber, contractorEmail, contractorAddress, customerName, customerNumber, customerEmail, customerAddress, architectName, architectNumber, architectEmail, architectAddress);
		
		AddProjectData(Project);
	}
	
	// Method deadlineException() handles the deadline exception
	/**
	 * 
	 * @param Deadline The value to be cast from a string type to a LocalDate type
	 * @return The LocalDate value is returned either as entered by the user if the cast is successful or kept unchanged if the cast fails
	 */
	private static LocalDate deadlineException(String Deadline)
	{
		try // Defensive Programming: Try to cast the String value to a LocalDate value
		{
			LocalDate ProjDeadline = LocalDate.parse(Deadline, DateTimeFormatter.ISO_DATE);
			return ProjDeadline;
		}
		catch(Exception e) // If the cast fails return a default date
		{
			System.out.println("Invalid date format. Be sure to use the format: yyyy-MM-dd");
			System.out.println("Deadline set to default date: 2030-12-31 and can be adjusted later");
			LocalDate ProjDeadline = LocalDate.parse("2030-12-31", DateTimeFormatter.ISO_DATE);
			System.out.println("");
			return ProjDeadline;
		}
	}
	
	// Method for capturing project details in file Data.txt
	/**
	 * 
	 * @param project Used for capturing project details in text file Data.txt
	 */
	private static void AddProjectData(Project project)
	{
		// Defensive programming: If we fail to create and write to the text file an exception will be thrown and the catch block will execute 
		try
		{
			FileWriter f = new FileWriter("Data.txt", true);
			Formatter file = new Formatter(f);
			file.format("%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s", 
					project.getProjectName(), ";", project.getProjectNumber(), ";", project.getBuildingType(), ";", project.getPhysicalAddress(), ";", project.getERFNumber(), ";",
					project.getProjectDeadline(), ";", project.getProjectValue(), ";", project.getPaidToDate(), ";", project.getFinalised(), ";", project.getCompletionDate(), ";",
					project.getContractor().getPersonName(), ";", project.getContractor().getPersonNumber(), ";", project.getContractor().getPersonEmail(), ";", project.getContractor().getPersonAddress(), ";",
					project.getCustomer().getPersonName(), ";", project.getCustomer().getPersonNumber(), ";", project.getCustomer().getPersonEmail(), ";", project.getCustomer().getPersonAddress(), ";",
					project.getArchitect().getPersonName(), ";", project.getArchitect().getPersonNumber(), ";", project.getArchitect().getPersonEmail(), ";", project.getArchitect().getPersonAddress(), "\r\n");
			file.close();
			System.out.println("");	
			System.out.println("Project details captured successfully in the Data.txt file");
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println("An error occured when trying to add project details to the file Data.txt");				
		}		
	}
	
	// Method for updating project details in file Data.txt
	/**
	 * 
	 * @param ProjectObjects Used to update project details in text file Data.txt
	 */
	private static void updateProjectData(ArrayList <Project> ProjectObjects)
	{
		// Defensive programming: If we fail to create and write to the text file an exception will be thrown and the catch block will execute 
		try
		{
			Formatter file = new Formatter("Data.txt");
			for(int i = 0; i < ProjectObjects.size(); i++)
			{
				file.format("%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s", 
					ProjectObjects.get(i).getProjectName(), ";", ProjectObjects.get(i).getProjectNumber(), ";", ProjectObjects.get(i).getBuildingType(), ";", ProjectObjects.get(i).getPhysicalAddress(), ";", ProjectObjects.get(i).getERFNumber(), ";",
					ProjectObjects.get(i).getProjectDeadline(), ";", ProjectObjects.get(i).getProjectValue(), ";", ProjectObjects.get(i).getPaidToDate(), ";", ProjectObjects.get(i).getFinalised(), ";", ProjectObjects.get(i).getCompletionDate(), ";",
					ProjectObjects.get(i).getContractor().getPersonName(), ";", ProjectObjects.get(i).getContractor().getPersonNumber(), ";", ProjectObjects.get(i).getContractor().getPersonEmail(), ";", ProjectObjects.get(i).getContractor().getPersonAddress(), ";",
					ProjectObjects.get(i).getCustomer().getPersonName(), ";", ProjectObjects.get(i).getCustomer().getPersonNumber(), ";", ProjectObjects.get(i).getCustomer().getPersonEmail(), ";", ProjectObjects.get(i).getCustomer().getPersonAddress(), ";",
					ProjectObjects.get(i).getArchitect().getPersonName(), ";", ProjectObjects.get(i).getArchitect().getPersonNumber(), ";", ProjectObjects.get(i).getArchitect().getPersonEmail(), ";", ProjectObjects.get(i).getArchitect().getPersonAddress(), "\r\n");
			}
			file.close();
		}
		catch(Exception e)
		{
			System.out.println("An error occured when trying to add the updated project details to the Data.txt file");				
		}		
	}
	
	// Method projectObjectList() reads from file Data.txt and puts the info in a data structure (ArrayList of project objects) 
	/**
	 * 
	 * @return Returns an array list of project objects to have all projects information readily available
	 */
	private static ArrayList<Project> projectObjectList()
	{
		// Defensive programming: If we fail to read from the text file an exception will be thrown and the catch block will execute 
		try
		{
			File file = new File("Data.txt");
			Scanner s = new Scanner(file);
			ArrayList<Project> projectObjectList = new ArrayList<>();
			
			while(s.hasNextLine())
			{
				String[] tempStringArray = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
				String line = s.nextLine();
				tempStringArray = line.trim().split(" ; ");
				Project tempProject = new Project(tempStringArray[0], tempStringArray[1], tempStringArray[2], tempStringArray[3], tempStringArray[4], LocalDate.parse(tempStringArray[5], DateTimeFormatter.ISO_DATE),
						Double.parseDouble(tempStringArray[6]), Double.parseDouble(tempStringArray[7]), tempStringArray[8], tempStringArray[9], tempStringArray[10], 
						tempStringArray[11], tempStringArray[12], tempStringArray[13], tempStringArray[14], tempStringArray[15], tempStringArray[16], tempStringArray[17],
						tempStringArray[18], tempStringArray[19], tempStringArray[20], tempStringArray[21]);
				projectObjectList.add(tempProject);	
			}
			return projectObjectList;
		}
		catch(Exception e)
		{
			System.out.println("The file Data.txt was not found at the destination");
			System.out.println("");
			return null;
		}	
	}
	
	// Method to display all the projects in the console
	/**
	 * Display all the projects captured
	 */
	private static void displayAllProjects()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the projects info readily available in a data structure
		
		if(projectObjects == null)
		{
			System.out.println("Add a new project to generate the Data.txt file");
			System.out.println("");
		}
		else
		{
			System.out.println("All projects displayed:");
			System.out.println("");	
			
			for (int i = 0; i < projectObjects.size(); i++)
			{
				projectObjects.get(i).displayProjectDetails();
			}
		}
	}
	
	// Method to display all the completed projects in the console
	/**
	 * Display all completed projects
	 */
	private static void displayCompletedProjects()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the need the projects info readily available in a data structure
		
		if(projectObjects == null)
		{
			System.out.println("Add a new project to generate the Data.txt file");
			System.out.println("");
		}
		else
		{
			System.out.println("All completed projects displayed:");
			System.out.println("");	
			
			for (int i = 0; i < projectObjects.size(); i++)
			{
				if(projectObjects.get(i).getFinalised().equals("Finalised"))
				{
					projectObjects.get(i).displayProjectDetails();
				}
			}
		}
	}
	
	// Method to display all the uncompleted projects in the console
	/**
	 * Display all uncompleted projects
	 */
	private static void displayUnCompletedProjects()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the need the projects info readily available in a data structure
			
		if(projectObjects == null)
		{
			System.out.println("Add a new project to generate the Data.txt file");
			System.out.println("");
		}
		else
		{
			System.out.println("All uncompleted projects displayed:");
			System.out.println("");	
				
			for (int i = 0; i < projectObjects.size(); i++)
			{
				if(projectObjects.get(i).getFinalised().equals("Not Finalised"))
				{
					projectObjects.get(i).displayProjectDetails();
				}
			}
		}
	}
	
	// Method to display all the overdue projects in the console
	/**
	 * Display all overdue projects
	 */
	private static void displayOverdueProjects()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the need the projects info readily available in a data structure
				
		if(projectObjects == null)
		{
			System.out.println("Add a new project to generate the Data.txt file");
			System.out.println("");
		}
		else
		{
			System.out.println("All overdue projects displayed:");
			System.out.println("");	
					
			for (int i = 0; i < projectObjects.size(); i++)
			{
				if(projectObjects.get(i).getFinalised().equals("Not Finalised") && (projectObjects.get(i).getProjectDeadline().isBefore(LocalDate.now())))
				{
					projectObjects.get(i).displayProjectDetails();
				}
			}
		}
	}
	
	// Method for printing all the projects to text file Projects_All.txt
	/**
	 * Print all captured projects
	 */
	private static void printAllProjects()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the projects info readily available in a data structure
		
		// Defensive programming: If we fail to create and write to the text file an exception will be thrown and the catch block will execute 
		try
		{
			Formatter file = new Formatter("Projects_All.txt");
			for(int i = 0; i < projectObjects.size(); i++)
			{
				file.format("%s %s %s", "Project Name:", projectObjects.get(i).getProjectName(), "\r\n");
				file.format("%s %s %s", "Project Number:", projectObjects.get(i).getProjectNumber(), "\r\n");
				file.format("%s %s %s", "Building Type:", projectObjects.get(i).getBuildingType(), "\r\n");
				file.format("%s %s %s", "Physical Address:", projectObjects.get(i).getPhysicalAddress(), "\r\n");
				file.format("%s %s %s", "ERF Number:", projectObjects.get(i).getERFNumber(), "\r\n");
				file.format("%s %s %s", "Project Deadline:", projectObjects.get(i).getProjectDeadline(), "\r\n");
				file.format("%s %s %s", "Project Value:", projectObjects.get(i).getProjectValue(), "\r\n");
				file.format("%s %s %s", "Paid To Date:", projectObjects.get(i).getPaidToDate(), "\r\n");
				file.format("%s %s %s", "Finalised:", projectObjects.get(i).getFinalised(), "\r\n");
				file.format("%s %s %s", "Completion Date:", projectObjects.get(i).getCompletionDate(), "\r\n");
				file.format("%s %s %s", "Contractor Name:", projectObjects.get(i).getContractor().getPersonName(), "\r\n");
				file.format("%s %s %s", "Contractor Number:", projectObjects.get(i).getContractor().getPersonNumber(), "\r\n");
				file.format("%s %s %s", "Contractor Email:", projectObjects.get(i).getContractor().getPersonEmail(), "\r\n");
				file.format("%s %s %s", "Contractor Address:", projectObjects.get(i).getContractor().getPersonAddress(), "\r\n");
				file.format("%s %s %s", "Customer Name:", projectObjects.get(i).getCustomer().getPersonName(), "\r\n");
				file.format("%s %s %s", "Customer Number:", projectObjects.get(i).getCustomer().getPersonNumber(), "\r\n");
				file.format("%s %s %s", "Customer Email:", projectObjects.get(i).getCustomer().getPersonEmail(), "\r\n");
				file.format("%s %s %s", "Customer Address:", projectObjects.get(i).getCustomer().getPersonAddress(), "\r\n");
				file.format("%s %s %s", "Architect Name:", projectObjects.get(i).getArchitect().getPersonName(), "\r\n");
				file.format("%s %s %s", "Architect Number:", projectObjects.get(i).getArchitect().getPersonNumber(), "\r\n");
				file.format("%s %s %s", "Architect Email:", projectObjects.get(i).getArchitect().getPersonEmail(), "\r\n");
				file.format("%s %s %s %s", "Architect Address:", projectObjects.get(i).getArchitect().getPersonAddress(), "\r\n", "\r\n");
			}
			file.close();
			System.out.println("File Projects_All.txt created successfully");
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println("An error occured when trying to print all the projects to the Projects_All.txt file");
			System.out.println("");
		}
	}
	
	// Method for printing a single project to text file Projects_Single.txt
	/**
	 * 
	 * @param i To represent the selected project
	 */
	private static void printSingleProject(int i)
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the projects info readily available in a data structure

		// Defensive programming: If we fail to create and write to the text file an exception will be thrown and the catch block will execute 
		try
		{
			Formatter file = new Formatter("Projects_Single.txt");
			file.format("%s %s %s", "Project Name:", projectObjects.get(i).getProjectName(), "\r\n");
			file.format("%s %s %s", "Project Number:", projectObjects.get(i).getProjectNumber(), "\r\n");
			file.format("%s %s %s", "Building Type:", projectObjects.get(i).getBuildingType(), "\r\n");
			file.format("%s %s %s", "Physical Address:", projectObjects.get(i).getPhysicalAddress(), "\r\n");
			file.format("%s %s %s", "ERF Number:", projectObjects.get(i).getERFNumber(), "\r\n");
			file.format("%s %s %s", "Project Deadline:", projectObjects.get(i).getProjectDeadline(), "\r\n");
			file.format("%s %s %s", "Project Value:", projectObjects.get(i).getProjectValue(), "\r\n");
			file.format("%s %s %s", "Paid To Date:", projectObjects.get(i).getPaidToDate(), "\r\n");
			file.format("%s %s %s", "Finalised:", projectObjects.get(i).getFinalised(), "\r\n");
			file.format("%s %s %s", "Completion Date:", projectObjects.get(i).getCompletionDate(), "\r\n");
			file.format("%s %s %s", "Contractor Name:", projectObjects.get(i).getContractor().getPersonName(), "\r\n");
			file.format("%s %s %s", "Contractor Number:", projectObjects.get(i).getContractor().getPersonNumber(), "\r\n");
			file.format("%s %s %s", "Contractor Email:", projectObjects.get(i).getContractor().getPersonEmail(), "\r\n");
			file.format("%s %s %s", "Contractor Address:", projectObjects.get(i).getContractor().getPersonAddress(), "\r\n");
			file.format("%s %s %s", "Customer Name:", projectObjects.get(i).getCustomer().getPersonName(), "\r\n");
			file.format("%s %s %s", "Customer Number:", projectObjects.get(i).getCustomer().getPersonNumber(), "\r\n");
			file.format("%s %s %s", "Customer Email:", projectObjects.get(i).getCustomer().getPersonEmail(), "\r\n");
			file.format("%s %s %s", "Customer Address:", projectObjects.get(i).getCustomer().getPersonAddress(), "\r\n");
			file.format("%s %s %s", "Architect Name:", projectObjects.get(i).getArchitect().getPersonName(), "\r\n");
			file.format("%s %s %s", "Architect Number:", projectObjects.get(i).getArchitect().getPersonNumber(), "\r\n");
			file.format("%s %s %s", "Architect Email:", projectObjects.get(i).getArchitect().getPersonEmail(), "\r\n");
			file.format("%s %s %s %s", "Architect Address:", projectObjects.get(i).getArchitect().getPersonAddress(), "\r\n", "\r\n");
			file.close();
			System.out.println("File Projects_Single.txt created successfully");
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println("An error occured when trying to print the selected project to the Project_Single.txt file");
			System.out.println("");
		}
	}	
	
	// Method for printing the completed projects to text file Projects_Completed.txt
	/**
	 * Print the completed projects
	 */
	private static void printCompletedProjects()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the projects info readily available in a data structure
		
		// Defensive programming: If we fail to create and write to the text file an exception will be thrown and the catch block will execute 
		try
		{
			Formatter file = new Formatter("Projects_Completed.txt");
			for(int i = 0; i < projectObjects.size(); i++)
			{
				if(projectObjects.get(i).getFinalised().equals("Finalised"))
				{
					file.format("%s %s %s", "Project Name:", projectObjects.get(i).getProjectName(), "\r\n");
					file.format("%s %s %s", "Project Number:", projectObjects.get(i).getProjectNumber(), "\r\n");
					file.format("%s %s %s", "Building Type:", projectObjects.get(i).getBuildingType(), "\r\n");
					file.format("%s %s %s", "Physical Address:", projectObjects.get(i).getPhysicalAddress(), "\r\n");
					file.format("%s %s %s", "ERF Number:", projectObjects.get(i).getERFNumber(), "\r\n");
					file.format("%s %s %s", "Project Deadline:", projectObjects.get(i).getProjectDeadline(), "\r\n");
					file.format("%s %s %s", "Project Value:", projectObjects.get(i).getProjectValue(), "\r\n");
					file.format("%s %s %s", "Paid To Date:", projectObjects.get(i).getPaidToDate(), "\r\n");
					file.format("%s %s %s", "Finalised:", projectObjects.get(i).getFinalised(), "\r\n");
					file.format("%s %s %s", "Completion Date:", projectObjects.get(i).getCompletionDate(), "\r\n");
					file.format("%s %s %s", "Contractor Name:", projectObjects.get(i).getContractor().getPersonName(), "\r\n");
					file.format("%s %s %s", "Contractor Number:", projectObjects.get(i).getContractor().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Contractor Email:", projectObjects.get(i).getContractor().getPersonEmail(), "\r\n");
					file.format("%s %s %s", "Contractor Address:", projectObjects.get(i).getContractor().getPersonAddress(), "\r\n");
					file.format("%s %s %s", "Customer Name:", projectObjects.get(i).getCustomer().getPersonName(), "\r\n");
					file.format("%s %s %s", "Customer Number:", projectObjects.get(i).getCustomer().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Customer Email:", projectObjects.get(i).getCustomer().getPersonEmail(), "\r\n");
					file.format("%s %s %s", "Customer Address:", projectObjects.get(i).getCustomer().getPersonAddress(), "\r\n");
					file.format("%s %s %s", "Architect Name:", projectObjects.get(i).getArchitect().getPersonName(), "\r\n");
					file.format("%s %s %s", "Architect Number:", projectObjects.get(i).getArchitect().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Architect Email:", projectObjects.get(i).getArchitect().getPersonEmail(), "\r\n");
					file.format("%s %s %s %s", "Architect Address:", projectObjects.get(i).getArchitect().getPersonAddress(), "\r\n", "\r\n");
				}
			}
			file.close();
			System.out.println("File Projects_Completed.txt created successfully");
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println("An error occured when trying to print all the completed projects to the Projects_Completed.txt file");
			System.out.println("");
		}
	}
	
	// Method for printing the uncompleted projects to text file Projects_Uncompleted.txt
	/**
	 * Print the uncompleted projects
	 */
	private static void printUnCompletedProjects()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the need the projects info readily available in a data structure
			
		// Defensive programming: If we fail to create and write to the text file an exception will be thrown and the catch block will execute 
		try
		{
			Formatter file = new Formatter("Projects_Uncompleted.txt");
			for(int i = 0; i < projectObjects.size(); i++)
			{
				if(projectObjects.get(i).getFinalised().equals("Not Finalised"))
				{
					file.format("%s %s %s", "Project Name:", projectObjects.get(i).getProjectName(), "\r\n");
					file.format("%s %s %s", "Project Number:", projectObjects.get(i).getProjectNumber(), "\r\n");
					file.format("%s %s %s", "Building Type:", projectObjects.get(i).getBuildingType(), "\r\n");
					file.format("%s %s %s", "Physical Address:", projectObjects.get(i).getPhysicalAddress(), "\r\n");
					file.format("%s %s %s", "ERF Number:", projectObjects.get(i).getERFNumber(), "\r\n");
					file.format("%s %s %s", "Project Deadline:", projectObjects.get(i).getProjectDeadline(), "\r\n");
					file.format("%s %s %s", "Project Value:", projectObjects.get(i).getProjectValue(), "\r\n");
					file.format("%s %s %s", "Paid To Date:", projectObjects.get(i).getPaidToDate(), "\r\n");
					file.format("%s %s %s", "Finalised:", projectObjects.get(i).getFinalised(), "\r\n");
					file.format("%s %s %s", "Completion Date:", projectObjects.get(i).getCompletionDate(), "\r\n");
					file.format("%s %s %s", "Contractor Name:", projectObjects.get(i).getContractor().getPersonName(), "\r\n");
					file.format("%s %s %s", "Contractor Number:", projectObjects.get(i).getContractor().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Contractor Email:", projectObjects.get(i).getContractor().getPersonEmail(), "\r\n");
					file.format("%s %s %s", "Contractor Address:", projectObjects.get(i).getContractor().getPersonAddress(), "\r\n");
					file.format("%s %s %s", "Customer Name:", projectObjects.get(i).getCustomer().getPersonName(), "\r\n");
					file.format("%s %s %s", "Customer Number:", projectObjects.get(i).getCustomer().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Customer Email:", projectObjects.get(i).getCustomer().getPersonEmail(), "\r\n");
					file.format("%s %s %s", "Customer Address:", projectObjects.get(i).getCustomer().getPersonAddress(), "\r\n");
					file.format("%s %s %s", "Architect Name:", projectObjects.get(i).getArchitect().getPersonName(), "\r\n");
					file.format("%s %s %s", "Architect Number:", projectObjects.get(i).getArchitect().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Architect Email:", projectObjects.get(i).getArchitect().getPersonEmail(), "\r\n");
					file.format("%s %s %s %s", "Architect Address:", projectObjects.get(i).getArchitect().getPersonAddress(), "\r\n", "\r\n");
				}
			}
			file.close();
			System.out.println("File Projects_Uncompleted.txt created successfully");
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println("An error occured when trying to print all the uncompleted projects to the Projects_Uncompleted.txt file");
			System.out.println("");
		}
	}
	
	// Method for printing the overdue projects to text file Projects_Overdue.txt
	/**
	 * Print the overdue projects
	 */
	private static void printOverdueProjects()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the projects info readily available in a data structure
				
		// Defensive programming: If we fail to create and write to the text file an exception will be thrown and the catch block will execute 
		try
		{
			Formatter file = new Formatter("Projects_Overdue.txt");
			for(int i = 0; i < projectObjects.size(); i++)
			{
				if(projectObjects.get(i).getFinalised().equals("Not Finalised") && projectObjects.get(i).getProjectDeadline().isBefore(LocalDate.now()))
				{
					file.format("%s %s %s", "Project Name:", projectObjects.get(i).getProjectName(), "\r\n");
					file.format("%s %s %s", "Project Number:", projectObjects.get(i).getProjectNumber(), "\r\n");
					file.format("%s %s %s", "Building Type:", projectObjects.get(i).getBuildingType(), "\r\n");
					file.format("%s %s %s", "Physical Address:", projectObjects.get(i).getPhysicalAddress(), "\r\n");
					file.format("%s %s %s", "ERF Number:", projectObjects.get(i).getERFNumber(), "\r\n");
					file.format("%s %s %s", "Project Deadline:", projectObjects.get(i).getProjectDeadline(), "\r\n");
					file.format("%s %s %s", "Project Value:", projectObjects.get(i).getProjectValue(), "\r\n");
					file.format("%s %s %s", "Paid To Date:", projectObjects.get(i).getPaidToDate(), "\r\n");
					file.format("%s %s %s", "Finalised:", projectObjects.get(i).getFinalised(), "\r\n");
					file.format("%s %s %s", "Completion Date:", projectObjects.get(i).getCompletionDate(), "\r\n");
					file.format("%s %s %s", "Contractor Name:", projectObjects.get(i).getContractor().getPersonName(), "\r\n");
					file.format("%s %s %s", "Contractor Number:", projectObjects.get(i).getContractor().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Contractor Email:", projectObjects.get(i).getContractor().getPersonEmail(), "\r\n");
					file.format("%s %s %s", "Contractor Address:", projectObjects.get(i).getContractor().getPersonAddress(), "\r\n");
					file.format("%s %s %s", "Customer Name:", projectObjects.get(i).getCustomer().getPersonName(), "\r\n");
					file.format("%s %s %s", "Customer Number:", projectObjects.get(i).getCustomer().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Customer Email:", projectObjects.get(i).getCustomer().getPersonEmail(), "\r\n");
					file.format("%s %s %s", "Customer Address:", projectObjects.get(i).getCustomer().getPersonAddress(), "\r\n");
					file.format("%s %s %s", "Architect Name:", projectObjects.get(i).getArchitect().getPersonName(), "\r\n");
					file.format("%s %s %s", "Architect Number:", projectObjects.get(i).getArchitect().getPersonNumber(), "\r\n");
					file.format("%s %s %s", "Architect Email:", projectObjects.get(i).getArchitect().getPersonEmail(), "\r\n");
					file.format("%s %s %s %s", "Architect Address:", projectObjects.get(i).getArchitect().getPersonAddress(), "\r\n", "\r\n");
				}
			}
			file.close();
			System.out.println("File Projects_Overdue.txt created successfully");
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println("An error occured when trying to print all the overdue projects to the Projects_Overdue.txt file");
			System.out.println("");
		}
	}
	
	// Method selectProject() to select, update and finalise a project
	/**
	 * To select a project for display, print, update or finalising
	 */
	private static void selectProject()
	{
		ArrayList<Project> projectObjects = projectObjectList(); // We need the need the projects info readily available in a data structure
		
		if(projectObjects == null)
		{
			System.out.println("Add a new project to generate the Data.txt file");
			System.out.println("");
		}
		else
		{
			while(true)
			{
				Scanner in = new Scanner(System.in);
				System.out.println("Please enter the project number to select it: ");
				System.out.println("Type exit to return to the main menu");
				String projectNr = in.nextLine();
				System.out.println("");
				
				if(projectNr.equalsIgnoreCase("exit"))
				{
					System.out.println("You are being redirected to the main menu");
					System.out.println("");	
					break;
				}
				
				for(int i = 0; i < projectObjects.size(); i++) // Loop through the data structure (ArrayList of project objects)
				{
					if(projectObjects.get(i).getProjectNumber().equals(projectNr)) // Allow further execution once the project number entered matches one of the data structure project numbers
					{
						// Display the update menu 
						String selection = updateMenuSelection();
						
						// Defensive Programming
						while(!selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4") && !selection.equals("5") && !selection.equals("6") && !selection.equals("7") && !selection.equals("8") && !selection.equals("9") && !selection.equals("10") && !selection.equals("11") && !selection.equals("12") && !selection.equals("13") && !selection.equals("14") && !selection.equals("15"))
						{
							selection = invalidMenuSelection();
						}
						
						if(selection.equals("1")) // Display a selected project
						{
							projectObjects.get(i).displayProjectDetails();
						}
						
						if(selection.equals("2")) // Print a selected project
						{
							printSingleProject(i);
						}
						
						if(selection.equals("3")) // Update the project deadline
						{
							projectObjects.get(i).updateProjectDeadline();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("4")) // Update the amount paid to date
						{
							projectObjects.get(i).updateProjectPaidToDate();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("5")) // Update the contractor number
						{
							projectObjects.get(i).getContractor().updatePersonNumber();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("6")) // Update the contractor email
						{
							projectObjects.get(i).getContractor().updatePersonEmail();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("7")) // Update the contractor address
						{
							projectObjects.get(i).getContractor().updatePersonAddress();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("8")) //Update the customer number
						{
							projectObjects.get(i).getCustomer().updatePersonNumber();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("9")) // Update the customer email
						{
							projectObjects.get(i).getCustomer().updatePersonEmail();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("10")) // Update the customer address
						{
							projectObjects.get(i).getCustomer().updatePersonAddress();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("11")) // Update the architect number
						{
							projectObjects.get(i).getArchitect().updatePersonNumber();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("12")) // Update the architect email
						{
							projectObjects.get(i).getArchitect().updatePersonEmail();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("13")) // Update the architect address
						{
							projectObjects.get(i).getArchitect().updatePersonAddress();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("14")) // Finalise the project
						{
							projectObjects.get(i).finaliseProject();
							updateProjectData(projectObjects);
						}
						
						if(selection.equals("15")) // Return to select a new project
						{
							System.out.println("You can enter a different project number.\n");
							break;
						}	
					}
				}	
			}
		}
	}
}
