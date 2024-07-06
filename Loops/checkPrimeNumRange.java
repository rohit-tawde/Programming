import java.util.Scanner;

class CheckPrimeNumRange {
    public static void main(String[] args) {

        // 4. WAJP to print prime numbers between the range 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        int num1 = sc.nextInt();
        System.out.println("Enter the upper bound:");
        int num2 = sc.nextInt();

        for (int j = num1; j <= num2; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



// 2. WAJP to check whether the number is neon number or not
//  Square = 9 = 81 = 8+1 = 9 is calles neon number

// 3. WAJP to check whether the number is amstrong number or not
//  153 = 1 , 5, 3 qube = 1 + 125 + 27 = 153 then its amstrong

// 4. WAJP to print first 20 numbers from fibonacci series
//   the addition of previews 2 number is next number then its fibonacci series
//  0 1 1 2 3 5 8

// 5. WAJP to check whether the number is Nieven number or not
// ex. 6804 = 6 + 8 + 0 + 4 = 18 then devide 6804/18== reminder 0 then Nieven number
