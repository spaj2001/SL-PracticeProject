//4.CameraMain.java
package camera.rental;
import java.util.Scanner; 
public class CameraMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("+-----------+"); 
		System.out.println("| WELCOME TO CAMERA RENTAL APP |");
		System.out.println("+--------+"); 
		System.out.println("PLEASE LOGIN TO CONTINUE");
		System.out.println("USERNAME "); 
		String s1 = scanner.nextLine(); 
		System.out.println("PASSWORD "); 
		String s2 = scanner.nextLine();
		CameraRentalApp rentalApp = new CameraRentalApp();
		// Sample camera
		rentalApp.addCamera(new Camera("Canon	", "EOS R5 ", 50.0)); 
		rentalApp.addCamera(new Camera("Sony	", "A7 III ", 45.0)); 
		rentalApp.addCamera(new Camera("SAMSUNG ", "DS123 ", 100.0)); 
		rentalApp.addCamera(new Camera("SONY	", "DSLR	", 112.5)); 
		rentalApp.addCamera(new Camera("Panasonic", "ANOTHER", 105.0)); 
		rentalApp.addCamera(new Camera("SAMSUNG ", "SM12	", 104.0)); 
		rentalApp.addCamera(new Camera("SONY	", "CT	", 120.5)); 
		rentalApp.addCamera(new Camera("Panasonic", "	", 150.0)); 
		rentalApp.addCamera(new Camera("SAMSUNG ", "ModelX ", 100.0));
		rentalApp.addCamera(new Camera("SONY	", "HD-012 ", 120.5));
		rentalApp.addCamera(new Camera("NIKON	", "DIGITAL", 150.0));
		rentalApp.addCamera(new Camera("LG	", "ModelX ", 110.0));
		while (true) { 
			System.out.println("1.MY CAMERA");
			System.out.println("2.REMOVE A CAMERA"); 
			System.out.println("3.VIEW ALL CAMERAS"); 
			System.out.println("4.MY WALLET");
			System.out.println("5.RENT A CAMERA");
			System.out.println("6.EXIT"); 
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt(); 
			switch (choice) {
			case 1:
				System.out.print("Enter the brand of the new camera: ");
						String brand = scanner.next(); 
						System.out.print("Enter the model of the new camera: ");
						String model = scanner.next(); 
						System.out.print("Enter the per-day rental amount: ");
						double rentalAmount = scanner.nextDouble(); 
						rentalApp.addCamera(new Camera(brand, model,rentalAmount)); 
						System.out.println("New camera added successfully.");
						break;
			case 2:
				rentalApp.displayAvailableCameras(); 
				System.out.print("Enter the number of the camera to remove: ");
				int removeIndex = scanner.nextInt();
				rentalApp.removeCamera(removeIndex); 
				break;

			case 3:
			rentalApp.displayAvailableCameras(); 
				break;


			case 4:
				double balance = rentalApp.checkWalletBalance();
				System.out.println("Current wallet balance: " + balance);
				System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET ?(1.YES 2.NO)");
				int ans = scanner.nextInt(); if (ans == 1) {
					System.out.print("Enter the amount to deposit: ");
					double depositAmount = scanner.nextDouble();
					rentalApp.depositMoney(depositAmount);
				}
				break; 
			case 5:
			
			System.out.print("Enter the number of the camera you want to rent: ");
			int cameraIndex = scanner.nextInt(); 
			rentalApp.rentCamera(cameraIndex);
			break;
			case 6:
				System.out.println("THANK YOU FOR USING. Goodbye!"); System.exit(0);
				break; 
			default :
				System.out.println("Invalid choice. Please try again."); 
				break;
		}
		}			 
		}
}
