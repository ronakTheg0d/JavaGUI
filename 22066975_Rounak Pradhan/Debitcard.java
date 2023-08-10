
/**
 * Write a description of class Debitcard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Debitcard extends Bankcard
{
    private int PINnumber;
    private int WithdrawalAmount;
    private String DateofWithdrawal;
    private boolean hasWithdrawn;
    
    public Debitcard(double balance_amount, int card_ID, String bank_account, String issuer_bank, String client_name, int PINnumber)
    {
        super(balance_amount, card_ID, bank_account, issuer_bank);
        super.setclient_name(client_name);
        this.PINnumber= PINnumber;
        this.hasWithdrawn= false;
    }
    public int getPINnumber()
    {
        return this.PINnumber;
    }
    public int getWithdrawalAmount()
    {
        return this.WithdrawalAmount;
    }
    public String getDateofWithdrawal()
    {
        return this.DateofWithdrawal;
    }
    public boolean gethasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    //mutator method
    public void setWithdrawalAmount(int WithdrawalAmount)
    {
        this.WithdrawalAmount = WithdrawalAmount;
    }
    public void withdraw(int WithdrawalAmount, String dateofWithdrawal, int enteredPin) 
    {
        if(enteredPin == PINnumber){
            if(WithdrawalAmount <= getbalance_amount()){
                setbalance_amount(getbalance_amount() - WithdrawalAmount);
                this.DateofWithdrawal= DateofWithdrawal;
                this.WithdrawalAmount=WithdrawalAmount;
                this.hasWithdrawn= true;
                System.out.println("Withdrawal successful");
                System.out.println("New balance amount is"+super.getbalance_amount());
                
            }
            else {
                System.out.println("Insufficient balance");
                System.out.println("Your Balance Amount is"+super.getbalance_amount());
            }
            }
            else {
                System.out.println("Invalid pin number");
            }
        }
    public void display()
    {
           super.display();
            if(this.hasWithdrawn == true) {
           System.out.println("the pin number is"+getPINnumber());
           System.out.println("The withdrawal amount is"+getWithdrawalAmount());
           System.out.println("Date of Withdrawal:"+DateofWithdrawal);
           }
            else {
                System.out.println("Balance Amount is"+super.getbalance_amount());
            }
    }
    }
    
    

    
    

