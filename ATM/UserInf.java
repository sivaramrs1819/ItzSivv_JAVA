package ATM;

public class UserInf {
    private String user_Name;
    private int user_ID;
    private int PIN;
    private int Amount;
    private String Account_NO;

    public String getAccount_NO() {
        return Account_NO.substring(12, 16);
    }

    UserInf(){
        PIN = 1819;
        user_ID = 1345;
        Amount = 1000000;
        user_Name = "ItzzSivv";
        Account_NO = "5768589876789067";
    }

    public String getUser_Name() {
        return user_Name;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int pIN) {
        PIN = pIN;
    }

    public void setAmount(int amount) {
        Amount = getAmount() + amount;
    }
    public void setAmount2(int amount2){
        if (Amount>=amount2) {
            Amount = getAmount() - amount2;
            System.out.println("\nAmount successfully debited from XXXXXXXXXXXX" + getAccount_NO());
            System.out.println("Remaining Balance : "+ "$" + getAmount());
        }else{
            System.out.println("Insufficient balance");
            System.out.println("Remaining Balance : "+ "$" + getAmount());
        }
    }

    public int getAmount() {
        return Amount;
    }
    
    public void ShowUserDetails(){
        System.out.println("\nAccount Details : ");
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println("\nUserName :" + getUser_Name());
        System.out.println("UserID :" + getUser_ID());
        System.out.println("Account Balance :" + "$" + getAmount());
    }
}
