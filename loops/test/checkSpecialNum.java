import java.util.Scanner;

class checkSpecialNum {
    public static void main(String[] arags) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        int mul = 1;
        int originalNum = num;

        while(num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            mul = mul * rem;
            num = num / 10;
        }

        int check = sum + mul;
        if(check == originalNum)
        System.out.println("Its is special number digit");
        else 
        System.out.println("Its not a special number digit");

    }
}


// 4. WAJP to check whether the number is Abudent number or not 
//  12 => Find Factors => 1+2+3+4+6 => 16>12 then its Abudent number

// 5. WAJP to check whether the number is Amicable/Friendly number or not
// take two numbers => num1= 220 -> All Factors Addition and num2 = 284 -> All Factors Addition and check Addition num1 and num2 Opposite or not if opposite then its Amicable/Friendly

