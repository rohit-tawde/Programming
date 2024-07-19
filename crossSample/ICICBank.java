class ATM {
    private double money = 1000000;

    public double getMoney()  {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void withdraw() {
        System.out.println("You can withdraw");
    }
}

class ICICBank {
    public static void main(String[] args) {
        ATM m = new ATM();

        m.setMoney(15000000);

        System.out.println("Total Amount: "+ m.getMoney());

        m.withdraw();
    }
}