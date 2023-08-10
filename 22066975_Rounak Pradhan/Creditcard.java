
/**
 * Write a description of class Creditcard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Creditcard extends Bankcard
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    public Creditcard(double balance_amount, int card_ID, String bank_account, String issuer_bank, String client_name, int cvcNumber, double interestRate, String expirationDate)
    {
        super(balance_amount, card_ID, bank_account, issuer_bank);
        super.setclient_name(client_name);
        this.cvcNumber= cvcNumber;
        this.interestRate= interestRate;
        this.expirationDate= expirationDate;
        this.isGranted= false;
    }
    public int getcvcNumber()
    {
        return this.cvcNumber;
    }
    public double getcreditLimit()
    {
        return this.creditLimit;
    }
    public double getinterestRate()
    {
        return this.interestRate;
    }
    public int getgracePeriod()
    {
        return this.gracePeriod;
    }
    public boolean getisGranted()
    {
        return this.isGranted;
    }
    public void setcreditLimit(double newcreditLimit, int newgracePeriod)
    {
        //logical error is solved
        if (newcreditLimit <= 2.5 * getbalance_amount()){ 
            this.creditLimit= newcreditLimit;
            this.gracePeriod= newgracePeriod;
            this.isGranted= true;
        }
        else{
            System.out.println("Credit cannot be issued");
        }
    }
        public void cancelCreditcard()
        {
            cvcNumber= 0;
            creditLimit= 0;
            gracePeriod= 0;
            isGranted= false;
        }
        public void display()
        {
            if (isGranted == true) {
                super.display();
                System.out.println("CVC number:"+this.cvcNumber);
                System.out.println("Interest rate:"+this.interestRate);
                System.out.println("Expiration date:"+this.expirationDate);
                System.out.println("Credit limit:"+this.creditLimit);
                System.out.println("Grace period:"+this.gracePeriod);
            }
            else {
                super.display();
                System.out.println("cvcNumber:"+this.cvcNumber);
                System.out.println("Interest rate:"+this.interestRate);
                System.out.println("Expiration date:"+this.expirationDate);
            }
        }
    }
