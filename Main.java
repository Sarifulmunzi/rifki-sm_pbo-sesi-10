
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        while (true) {
		
            System.out.println("Welcome to the Parking Fee Calculator!");
			System.out.println("1. Two Wheeler Parking");
			System.out.println("2. Four Wheeler Parking");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.print("Enter the number of hours: ");
				int hours = scanner.nextInt();
				ParkingLot twoWheelerParkingLot = new TwoWheelerParkingLot();
				System.out.println("Two Wheeler Parking Fee: " + ParkingFeeCalculator.calculateParkingFee(twoWheelerParkingLot, hours));
			} else if (choice == 2) {
				System.out.print("Enter the number of hours: ");
				int hours = scanner.nextInt();
				ParkingLot fourWheelerParkingLot = new FourWheelerParkingLot();
				System.out.println("Four Wheeler Parking Fee: " + ParkingFeeCalculator.calculateParkingFee(fourWheelerParkingLot, hours));
			} else if (choice == 3) {
				break;
			}else if (choice == 4) {
				break;
			} else {
				System.out.println("Invalid choice. Please try again.");
			}
		}

		scanner.close();
	}
}
