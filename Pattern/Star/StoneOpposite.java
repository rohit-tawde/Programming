class StoneOpposite
{
    public static void main(String[] args) {

        int num = 5;

        for(int i=1; i<=num; i++) {

            for(int j=1; j<num*2; j++) {

                // if(  i+j<=num*2 && j-i>=num-num )
                if(i+j<=num*2 && i<=j)
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