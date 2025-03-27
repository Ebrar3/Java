public class Main {
    public static void main(String[] args) {
    product product1=new product(1,"Masa",100);
    System.out.println(product1.getName());
    System.out.println(product1.getPrice());
    System.out.println(product1.getId());
    product1.setName("Kasa");
    product1.setPrice(200);
    product1.setId(2);

    }
}