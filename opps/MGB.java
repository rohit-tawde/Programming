class ATM   // Driver Class -> The class which having main method 
{

    int money = 1000000;

    public void withdraw() { 

        System.out.println("Machha you can withdraw the cash ");
    }
} 
    
class MGB    // Maharasthra Gramin Bank
{
    public static void main(String[] args) { 

        ATM ref = new ATM(); // custructor calling stmt
        System.out.println("Total Amount: "+ ref.money); 
        ref.withdraw();  // method calling stmt
        
    }
}