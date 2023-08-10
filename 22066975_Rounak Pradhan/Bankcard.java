
/**
 * Write a description of class Bankcard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bankcard
  {
    private int card_ID;
    private String client_name;
    private String issuer_bank;//Semantic error solved by changing int to String
    private String bank_account;
    private double balance_amount;
    public Bankcard(double balance_amount,int card_ID,String bank_account,String issuer_bank )
    {
    this.card_ID=card_ID;
    this.client_name="";
    this.issuer_bank=issuer_bank;
    this.bank_account=bank_account;
    this.balance_amount=balance_amount;
    }
    public int getcard_Id()
    {
        return card_ID;
    }
    public String getclient_name()
    {
        return client_name;
    }
    public String getissuer_bank()
    {
        return issuer_bank;
    }
    public String getbank_account()
    {
        return bank_account;
    }
    public double getbalance_amount()
    {
        //now the syntax error is solved
        return balance_amount;
    }
    public void setclient_name(String clientName)
    {
        this.client_name=clientName;
    }
    public void setbalance_amount(double balance_Amount)
    {
        this.balance_amount=balance_Amount;
    }
    public void display()
    {
        System.out.println("Card ID:"+ this.card_ID);
        if (this.client_name. isEmpty()){
            System.out.println("Client name: Not assigned");
    
        }
        else{
            System.out.println("Client name:"+ client_name);
        }
        System.out.println("Issuer bank"+ issuer_bank);
        System.out.println("Bank account:"+ bank_account);
        System.out.println("Balance amount:"+ balance_amount);
    }
    }

