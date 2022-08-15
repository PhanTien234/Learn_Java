package Manage_Bill;

public class Bill {
    protected int customer_code;
    protected String customer_type;
    protected int oldIndex;
    protected int newIndex;
    protected int unitPrice;

    public Bill(int customer_code, String customer_type, int oldIndex, int newIndex, int unitPrice) {
        this.customer_code = customer_code;
        this.customer_type = customer_type;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.unitPrice = unitPrice;
    }
    public Bill(){

    }

    public int price() {

//        System.out.println("customer type            unit price of using water");
//        System.out.println("“Resident”                       500     ");
//        System.out.println("“Business” or “Organization”     400     ");
//        System.out.println("otherwise                        300     ");
//        System.out.println("Enter your Unit price");
        switch (unitPrice) {
            case 1:
                unitPrice = 500;
                break;
            case 2:
                unitPrice = 400;
                break;
            case 3:
                unitPrice = 300;

            default:
        }
        return unitPrice;
    }
    public int payment(){
        return unitPrice*(newIndex-oldIndex);
    }
    public void display(){
        System.out.println("Customer code: " + customer_code);
        System.out.println("Customer type: " + customer_type);
        System.out.println("Customer old index of water: " + oldIndex);
        System.out.println("Customer new index of water: " + newIndex);
        System.out.println("Customer unit price of using water: " + price());
        System.out.println("Customer payment: " + payment());

    }

    public int getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(int customer_code) {
        this.customer_code = customer_code;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
