package com.company;

import com.company.Bookings;
import com.company.Customers;

import java.util.Scanner;

public class HotelRoomReservationSystem {
    private final Scanner input;
    private char choice;
    
    private final Customers customers;
    private final Rooms rooms;
    private final Bookings bookings;

    /**
     * Constructor.
     */
    public HotelRoomReservationSystem() {
        input = new Scanner(System.in);
        customers = new Customers();
        rooms = new Rooms();
        bookings = new Bookings();



    }
    
    /**
     * This method displays the main hotel management system.
     */
    public void showMainMenu() {
        while(true) {
            System.out.println("\n\nHotel Room Reservation System");
            System.out.println("1. Manage Customers");
            System.out.println("2. Manage Bookings");
            System.out.println("3. Manage Rooms");
            System.out.println("4. Exit");
            System.out.print("Enter choice :: ");
            choice = input.nextLine().charAt(0);
            
            // if user chooses to manage customers
            if (choice == '1')
                manageCustomers();

            // if user chooses to manage bookings
            else if (choice == '2')
                manageBookings();

            // if user chooses to manage rooms
            else if (choice == '3')
                manageRooms();

            // if user chooses to exit
            else if (choice == '4')
                break;

            // if user enters a wrong choice
            else
                invalidChoice();
        }
    }
    
    /**
     * This method displays that selected choice is wrong and waits for enter key.
     */
    private void invalidChoice() {
        System.out.println("\nInvalid Choice!");
        System.out.print("Press enter key to continue...");
        input.nextLine();
    }

    /**
     * This method displays the customer management options.
     */
    private void manageCustomers() {
        while(true) {
            System.out.println("\n\nManage Customers");
            System.out.println("1. Add New Customer");
            System.out.println("2. View Customer Details");
            System.out.println("3. Edit Customer Details");
            System.out.println("4. Delete Customer");
            System.out.println("5. View All Customers");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter choice :: ");
            choice = input.nextLine().charAt(0);

            // if user chooses to add new customer
            if (choice == '1')
                customers.addCustomer();

            // if user chooses to view customer details
            else if (choice == '2')
                customers.viewCustomer();

            // if user chooses to edit customer details
            else if (choice == '3')
                customers.editCustomer();

            // if user chooses to delete a customer
            else if (choice == '4')
                customers.deleteCustomer();

            // if user chooses to view all customers details
            else if (choice == '5')
                customers.viewAllCustomers();

            // if user wants to go back to main menu
            else if (choice == '6')
                break;

            // if user enters a wrong choice
            else
                invalidChoice();
        }
    }

    /**
     * This method displays the booking management options.
     */
    private void manageBookings() {
        while(true) {
            System.out.println("\n\nManage Bookings");
            System.out.println("1. Search for booking");
            System.out.println("2. Check In Room");
            System.out.println("3. Check Out Room");
            System.out.println("4. Edit booking");
            System.out.println("5. View All Bookings");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter choice :: ");
            choice = input.nextLine().charAt(0);

            // if user chooses to search a booking details
            if (choice == '1')
                bookings.searchBooking();

            // if user chooses to check in a customer to room
            else if (choice == '2')
                bookings.checkInRoom(customers, rooms);

            // if user chooses to check out a customer to roon
            else if (choice == '3')
                bookings.checkOutRoom(customers, rooms);

            // if user chooses to edit a booking details
            else if (choice == '4')
                bookings.editBooking(customers, rooms);

            // if user chooses to view all booking details
            else if (choice == '5')
                bookings.viewAllBookings();

            // if user wants to go back to main menu
            else if (choice == '6')
                break;

            // if user enters a wrong choice
            else
                invalidChoice();
        }
    }

    /**
     * This method displays the room management options.
     */
    private void manageRooms() {
        while(true) {
            System.out.println("\n\nManage Rooms");
            System.out.println("1. Add New Room");
            System.out.println("2. View Room Details");
            System.out.println("3. Edit Room Details");
            System.out.println("4. Delete Room");
            System.out.println("5. View All Rooms");
            System.out.println("6. View All Available Rooms");
            System.out.println("7. Back to Main Menu");
            System.out.print("Enter choice :: ");
            choice = input.nextLine().charAt(0);

            // if user chooses to add new room
            if (choice == '1')
                rooms.addRoom();

            // if user chooses to view a room details
            else if (choice == '2')
                rooms.viewRoom();

            // if user chooses to edit a room details
            else if (choice == '3')
                rooms.editRoom();

            // if user chooses to delete a room details
            else if (choice == '4')
                rooms.deleteRoom();

            // if user chooses to view all rooms details
            else if (choice == '5')
                rooms.viewAllRooms();

            // if user chooses to view details of only available rooms
            else if (choice == '6')
                rooms.viewAllAvailableRooms();

            // if user wants to go back to main menu
            else if (choice == '7')
                break;

            // if user enters a wrong choice
            else
                invalidChoice();
        }
    }
}