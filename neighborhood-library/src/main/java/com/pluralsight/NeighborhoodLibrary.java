package com.pluralsight;


import java.util.Scanner;


public class NeighborhoodLibrary {
    private static Book[] books = new Book[20];


    private static int numOfBooks = 5;
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {




        books[0] = new Book(0301, "446", "Goodnight Punpun vol. 4", true, "Isaiah");
        books[1] = new Book(12345, "8815", "Tomie by Junji Ito", false, "");
        books[2] = new Book(2222, "75486", "Vagabond vol. 3", true, "Roni");
        books[3] = new Book(4321, "5752", "Slam Dunk vol. 1", false, "");
        books[4] = new Book(5742, "322", "Naruto vol. 27", false, "");


        while (true) {


            System.out.println("Digital Library \n");
            System.out.println("What would you like to do?");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Books Checked Out");
            System.out.println("3 - Exit the program\n");
            System.out.println("Awaiting user input: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");


            switch (userInput) {
                case 1:
                    System.out.println("Available books: \n");
                    availableBooks();
                    checkingOutBook();


                    break;
                case 2:
                    System.out.println("Checked out books: \n");
                    unavailableBooks();
                    options();


                    break;
                case 3:
                    System.out.println("Hope you have a great day! Goodbye!");
                    return;




            }
        }




    }


    public static void availableBooks() {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getIsCheckedOut() == false) {
                System.out.println("Book: " + "\"" + books[i].getTitle() + "\", ID: " + books[i].getId() +
                        ", ISBN: " + books[i].getIsbn() + "\n");
            }
        }
    }


    public static void checkingOutBook() {
        System.out.println("Would you like to check out a book?\n Yes or No");
        String choice = scanner.nextLine().trim();


        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter your name for checkout: ");
            String name = scanner.nextLine().trim();
            System.out.println("Enter the title of the book you want to check out:");
            String title = scanner.nextLine();


            for (int b = 0; b < numOfBooks; b++) {
                if (books[b].getTitle().equalsIgnoreCase(title)) {
                    books[b].checkOut(name);
                }
            }


        } else if(choice.equalsIgnoreCase("no")) {
            System.out.println("Heading back...");
        }
    }




    public static void unavailableBooks() {
        for (int a = 0; a < numOfBooks; a++) {
            if (books[a].getIsCheckedOut()) {
                System.out.println("The book: \"" + books[a].getTitle() + "\", ID: " + books[a].getId() +
                        ", ISBN: " + books[a].getIsbn() + ", is currently in the possession of: " +
                        books[a].getCheckedOutTo() + "\n");
            }
        }
    }


    public static void options() {


        System.out.println("Would you like to: \n C - Check In a book \n X - Go back to Home Screen");
        char choice = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();
        //char. have to be wrapped in single quotations
        if (choice == 'C') {
            System.out.println("What's the ID of the book you want to check in?");
            int id = scanner.nextInt();
            scanner.nextLine();


            for(int i = 0; i < numOfBooks; i++){
                if(id == books[i].getId()){
                    books[i].checkIn();
                }
            }
        } else if (choice == 'X') {
            System.out.println("Rerouting to main screen...");


        }
    }
}
