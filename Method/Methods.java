class Methods {

    public static void printMsg() {
        int temp = add();
        System.out.println(temp);
        System.out.println("Good Morning");

    }
    public static void main(String[] args) {

        System.out.println("Main Start");
        printMsg();
        System.out.println(add());
        System.out.println("Main End");

    }
    public static int add() {

        int a = 30;
        int b = 40;
        int res = a+b;
        System.out.println(res);
        return a;

    }
}