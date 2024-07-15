class Pattern4 {
    public static void main(String[] args) {
        int num = 4;

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num; j++) {
                // if(j<=i ) {
                // if(i+j>=num+1) {
                // if(i+j < num+1) {\
                 if(j>=i) {
                    // System.out.print(((i-1)+j) +" ");

                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}