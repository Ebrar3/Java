public class CustomerManager {
    public void addCustomer(String name,int id,int yas){
        Customer customer=new Customer(name,id,yas);
    }

    public void printCustomer(Customer customer){
        System.out.println(customer.name+" "+customer.id+" "+customer.yas);
    }


}
