import java.util.Scanner;

class checkDisariumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int originalNum = num;
        int count = 0;
        int mul1 = 1;
        int mul2 = 1;
        int mul3 = 1;



        while(num != 0) {
            int rem = num % 10;
            count++;
             num = num / 10;
            
            if(count==3) {
                //System.out.println(rem);
               
                mul1 = rem * rem * rem;
                
            }
            if(count==2) {
                 //System.out.println(rem);
               
                    mul2 = rem * rem;
                
            }
             if(count==1) {
                //System.out.println(rem);
               
                    mul3 = rem * rem * rem;
                
            }
           
        }


        // System.out.println(count);
        System.out.println(mul1);
         System.out.println(mul2);
          System.out.println(mul3);

          int sum = mul1 + mul2 + mul3;

          if(sum == originalNum) {
            System.out.println("Its is disarium number");
          }
          else {
           System.out.println("Its is not a disarium number");
           
        }

    }
}