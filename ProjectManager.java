import java.util.Scanner;

public class ProjectManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare variables that will be used as input arguments when constructing new Project Objects
		String projName;
		String projNumber;
		String buildType;
		String physAddress;
		String erfNum;
		String projDeadline;
		double projCost;
		double paidToDate;
		String contractorName;
		String contractorNumber;
		String contractorEmail;
		String contractorAddress;
		String customerName;
		String customerNumber;
		String customerEmail;
		String customerAddress;
		String architectName;
		String architectNumber;
		String architectEmail;
		String architectAddress;
		
		// Create an object called input of type Scanner
		Scanner userChoice = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		// Declare a variable to initialise the while loops
		String userSelection =  " ";
		String selection = " ";
		
		// Ensure the project object is initialised 
		Project project = new Project("", "", "", "", "", "", 0.0, 0.0, "", "", "", "", "", "", "", "", "", "", "", "");
		
		// For quick testing the Person Class Objects (wyn & mar)
		/*
		Person wyn= new Person("Wynand", "083", "bassonwy", "Nederland");
		wyn.displayPersonDetails();
		
		Person marc= new Person("Marco", "076", "bassonma", "SA");
		marc.displayPersonDetails();
		*/
		
		// For quick testing the Project Class Objects (silviaHouse & nikkiMansion)
		/*
		Project silviaHouse = new Project("Silvia House", "01SH", "House", "Brink 4D, 8021AP Zwolle, Netherlands", "001", "20 Jan 2021", 1000.00, 500.00, "Wynand", "0832960050", "bassonwynand@gmail.com", "Brink 4D, 8021AP, Zwolle", "", "", "", "", "", "", "", "");
		silviaHouse.displayProjectDetails();
		silviaHouse.contractor.displayPersonDetails();
		
		Project nikkiMansion = new Project("Nikki Mansion", "02NM", "Mansion", "111 Rissik str, Potchefstroom, SA", "002", "20 Dec 2022", 2000.00, 700.00, "Marco", "0762390082", "bassonmarco@gmail.com", "14 La Bone Vie, Potchefstroom, SA", "", "", "", "", "", "", "", "");
		nikkiMansion.displayProjectDetails();
		nikkiMansion.contractor.displayPersonDetails();
		*/
		
		// Create a running Menu
		while (!userSelection.equals("5"))
		{
			System.out.println("Menu");
			System.out.println("1. Create a new project");
			System.out.println("2. Display project details");
			System.out.println("3. Update project details");
			System.out.println("4. Finalise project");
			System.out.println("5. Exit");
			System.out.println("Select an option from the menu above: ");
			userSelection = userChoice.nextLine();
			System.out.println(" ");
			
			while(!userSelection.equals("1") && !userSelection.equals("2") && !userSelection.equals("3") && !userSelection.equals("4") && !userSelection.equals("5") )
			{
				System.out.println("You did not make a valid Selection.");
				System.out.println("Select an option from the menu above: ");
				userSelection = userChoice.nextLine();
				System.out.println(" ");
			}
			
			if (userSelection.equals("1"))
			{
				// Ask the user to input details about the project and save the inputs
				System.out.println("Please enter the project name: ");
				projName = input.nextLine();
				
				System.out.println("Please enter the project number: ");
				projNumber = input.nextLine();
				
				System.out.println("Please enter the type of building: ");
				buildType = input.nextLine();
				
				System.out.println("Please enter the physical address: ");
				physAddress = input.nextLine();
				
				System.out.println("Please enter the ERF number: ");
				erfNum = input.nextLine();
				
				System.out.println("Please enter the project deadline: ");
				projDeadline = input.nextLine();
				
				System.out.println("Please enter the contractor's name: ");
				contractorName = input.nextLine();
				
				System.out.println("Please enter the contractor's number: ");
				contractorNumber = input.nextLine();
				
				System.out.println("Please enter the contractor's email: ");
				contractorEmail = input.nextLine();
				
				System.out.println("Please enter the contractor's address: ");
				contractorAddress = input.nextLine();
				
				System.out.println("Please enter the customer's name: ");
				customerName = input.nextLine();
				
				System.out.println("Please enter the customer's number: ");
				customerNumber = input.nextLine();
				
				System.out.println("Please enter the customer's email: ");
				customerEmail = input.nextLine();
				
				System.out.println("Please enter the customer's address: ");
				customerAddress = input.nextLine();
				
				System.out.println("Please enter the architect's name: ");
				architectName = input.nextLine();
				
				System.out.println("Please enter the architect's number: ");
				architectNumber = input.nextLine();
				
				System.out.println("Please enter the architect's email: ");
				architectEmail = input.nextLine();
				
				System.out.println("Please enter the architect's address: ");
				architectAddress = input.nextLine();
				
				System.out.println("Please enter the project cost: ");
				projCost = input.nextDouble();
				
				System.out.println("Please enter the amount paid to date: ");
				paidToDate = input.nextDouble();
				
				
				// Use the Class Project constructor to construct an object called project of type Project
				project = new Project(projName, projNumber, buildType, physAddress, erfNum, projDeadline, projCost, paidToDate, contractorName, contractorNumber, contractorEmail, contractorAddress, customerName, customerNumber, customerEmail, customerAddress, architectName, architectNumber, architectEmail, architectAddress);
				
				// Display the captured details of the project
				System.out.println("\nProject details captured!\n");
				project.displayProjectDetails();
				
			}
			
			if (userSelection.equals("2"))
			{
				System.out.println("Project details:\n");
				project.displayProjectDetails();
			}
			
			if (userSelection.equals("3"))
			{
				while(!selection.equals("12"))
				{
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
					selection = s.nextLine();
					System.out.println(" ");
					
					while(!selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4") && !selection.equals("5") && !selection.equals("6") && !selection.equals("7") && !selection.equals("8") && !selection.equals("9") && !selection.equals("10") && !selection.equals("11") && !selection.equals("12"))
					{
						System.out.println("You did not make a valid Selection.");
						System.out.println("Select an option from the menu above: ");
						selection = s.nextLine();
						System.out.println(" ");
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
						project.contractor.updatePersonNumber();
					}
					
					if(selection.equals("4"))
					{
						project.contractor.updatePersonEmail();
					}
					
					if(selection.equals("5"))
					{
						project.contractor.updatePersonAddress();
					}
					
					if(selection.equals("6"))
					{
						project.customer.updatePersonNumber();
					}
					
					if(selection.equals("7"))
					{
						project.customer.updatePersonEmail();
					}
					
					if(selection.equals("8"))
					{
						project.customer.updatePersonAddress();
					}
					
					if(selection.equals("9"))
					{
						project.architect.updatePersonNumber();
					}
					
					if(selection.equals("10"))
					{
						project.architect.updatePersonEmail();
					}
					
					if(selection.equals("11"))
					{
						project.architect.updatePersonAddress();
					}

				}	
			}
			
			if (userSelection.equals("4"))
			{
				project.finaliseProject();
			}
			
			if (userSelection.equals("5"))
			{
				System.out.println("Goodbye!");
			}
		}
	}
}
