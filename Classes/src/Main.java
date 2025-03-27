public class Main {
    public static void main(String[] args) {
        Customer customer1= new Customer("Murat",1,20);
        Customer customer2= new Customer();
        customer2.name="Deniz";
        customer2.id=2;
        customer2.yas=20;
        CustomerManager customerManager=new CustomerManager();
        customerManager.addCustomer("Murat",1,20);
        customerManager.printCustomer(customer1);
        customerManager.printCustomer(customer2);
    }
}