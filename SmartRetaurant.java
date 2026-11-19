import java.util.Scanner;

public class SmartRestaurant {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        final double DRINK_PRICE = 15.50; 

        System.out.print("Enter customer's name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer's age: ");
        int customerAge = scanner.nextInt();

        System.out.print("Enter price of the meal: ");
        double mealPrice = scanner.nextDouble();

        System.out.print("Enter number of drinks ordered: ");
        int drinkCount = scanner.nextInt();

        System.out.print("Is the customer a student? (yes/no): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Enter service rating from 1 to 5: ");
        int serviceRating = scanner.nextInt();

        if (serviceRating < 1 || serviceRating > 5) {
            System.out.println("Error: Service rating must be between 1 and 5.");
        } else {
           
            double drinksCost = drinkCount * DRINK_PRICE;
            double subtotal = mealPrice + drinksCost;

    
            double discountPercentage = 0.0;
            if (isStudent) {
                discountPercentage = 0.10; 
            }
            
            if (customerAge >= 60) {
                double seniorDiscount = 0.05; 
                if (seniorDiscount > discountPercentage) {
                    discountPercentage = seniorDiscount;
                }
            }

            double discountAmount = subtotal * discountPercentage;
            double discountedTotal = subtotal - discountAmount;

          
            double tipAmount = 0.0;
            if (serviceRating == 4 || serviceRating == 5) {
                tipAmount = discountedTotal * 0.10;
            }

            double exactFinalBill = discountedTotal + tipAmount;

         
            int wholeNumberBill = (int) exactFinalBill;

         
            System.out.println("\nSMART RESTAURANT");
            System.out.println("Customer: " + customerName);
            System.out.println("Meal: $" + mealPrice);
            System.out.println("Drinks: $" + drinksCost);
            System.out.println("Discount: $" + discountAmount);
            System.out.println("Tip: $" + tipAmount);
            System.out.println("Final bill: $" + exactFinalBill);
            System.out.println("Whole amount: $" + wholeNumberBill);
        }

        scanner.close();
    }
}
