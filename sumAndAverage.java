import java.util.Scanner;

class sumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ilagay kung ilan ang i-aaverage mo: ");
        double sum = 0.0d;
        
        /* i-input ng user */
        int numOfValues = scanner.nextInt();

        /* dito kapag nilagay ng user is negative number, mag-eerror */
        if (numOfValues < 0) {
            System.out.println("ERROR!!!!!!!!!!!!!!!!");
        }   
        /* kapag hindi negative in-input, pprint niya yung mga nasa inside ng else */            
        else {
            System.out.print("Enter " + numOfValues + " values: ");
                for (int i = 0; i < numOfValues; i++) {

                    /* i-input ng user mga values na i-aaverage. */
                    int value = scanner.nextInt();

                    /* kunin sum */
                    sum += value;
                }

            /* kunin average */
            double average = sum / numOfValues;

            System.out.println("");
            System.out.println("The average is: " + average);
            System.out.println("");
            System.out.println("The sum is: " + sum);
        }
    }
}
    
        