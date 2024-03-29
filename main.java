public class main {
            public static void main(String[] args) {
                int number = 321;

                // Extract the digits and find the sum
                int digit1 = number % 10; // Extract the last digit (1)
                number /= 10; // Remove the last digit
                int digit2 = number % 10; // Extract the next digit (2)
                number /= 10; // Remove the second digit
                int digit3 = number; // The remaining number is the first digit (3)

                int sum = digit1 + digit2 + digit3; // Calculate the sum of digits

                // Print the sum of digits
                System.out.println("The sum of the digits in 321 is: " + sum);

            }
        }




