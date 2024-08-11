class P3 {
public static void main(String[] args) {

        int num = 4;

        for(int i=1; i<num*2; i++) {

            for(int j=1; j<num*2; j++) {

                if(i+j<=num*2 && j-i<=num-num || j>=i )
                {
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