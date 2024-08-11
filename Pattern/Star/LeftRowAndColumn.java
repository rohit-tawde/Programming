class LeftRowAndColumn {

    public static void main(String[] args) {

        int num = 4;


        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num; j++) {

                if(j==num || i==1) {

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