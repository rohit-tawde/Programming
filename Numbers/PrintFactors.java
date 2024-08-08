class PrintFactors {
    public static void main(String[] args) {

        int num = 12;
        int sum = 0;
        System.out.println("Factors of Numbers: ");
        for(int i = 1; i<=num; i++) {

            if(num % i == 0) {
                // System.out.println(" "+i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    
}