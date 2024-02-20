public class Invoice
{
    //tamrin7
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAmount() {
        return "amount is : "+amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String GetCustomerName()
    {
        String N=customer.getName();
        return N;
    }

    public double getAmountAfterDiscount()
    {

        return amount-(customer.getDiscount()*amount/100);
    }








}
