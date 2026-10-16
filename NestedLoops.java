import java.util.Scanner;
        /* This program will find perfect numbers up to 200 using nested loops and adding each number before itself
         together. This program will display the number itself as well as the sum.
         a perfect number is s number that divides perfectly into itself*/
public class NestedLoops {
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter the upper limit for the perfect number search: ");

                long limit = input.nextLong();

                //call the method
                findPerfectNumbers(limit);
            }

            public static void findPerfectNumbers(long limit) {
                for (long n = 1; n <= limit; n++) {
                    long sum = 0;

                    //tests possible divisors
                    for (long d = 1; d < n; d++) { //variable d is divisor

                        //checking if it divides perfectly
                        if (n % d == 0) {
                            sum += d;
                        }
                    }
                    if (sum == n) {
                        System.out.println(n);
                    }
                }
            }
        }