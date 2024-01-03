import java.util.ArrayList;
import java.util.Scanner;

class Train {
    // Attributes for train details
    int trainNumber;
    String name;
    String source;
    String destination;
    String time;
    int capacity;
    int availableSeats;

    // Constructor to initialize train details
    Train(int trainNumber, String name, String source, String destination, String time, int capacity) {
        this.trainNumber = trainNumber;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.capacity = capacity;
        this.availableSeats = capacity;
    }

    // Methods for seat availability, booking, canceling, and information display
    int getAvailableSeats() {
        return availableSeats;
    }

    void bookSeat() {
        availableSeats--;
    }

    void cancelTicket() {
        availableSeats++;
    }

    void displayInfo() {
        // Code to display train details
    }
}

// Classes for Ticket and ReservationSystem (similar structure)

public class RailwayReservationSystem {
    public static void main(String[] args) {
        // Create ReservationSystem object, trains, and stations list
        ReservationSystem system = new ReservationSystem();
        // ...

        // Display menu and handle user input
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display menu options
            // Get user choice
            try {
                choice = scanner.nextInt();
                // Call appropriate methods based on choice
                // Implement error handling for invalid choices
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine(); // Clear the scanner buffer
            }
        } while (choice != 6); // Exit when choice is 6
    }
}

