public class Main {
    public static void main(String[] args) {
        System.out.println("Persons:");
        Customer c1= new Customer();
        c1.getInfo();
        c1.introduce();
        c1.id=1;
        c1.age=20;
        c1.name="Ece";
        c1.surname="Demir";
        c1.getInfo();

        System.out.println("-----------------------");

        Customer c2= new Customer(2,"Ayşe","Polat",21);
        c2.getInfo();
        c2.introduce();

        System.out.println("-----------------------");

        Employee e1 =new Employee();
        e1.getInfo();
        e1.id=3;
        e1.name="Ahmet";
        e1.surname="Demir";
        e1.age=22;
        e1.introduce();
        e1.getInfo();

        System.out.println("-----------------------");

        Employee e2=new Employee(4,"Fatma","Alemdar",35);
        e2.getInfo();
        e2.introduce();

        System.out.println("-----------------------");

        Manager m1=new Manager();
        m1.id=5;
        m1.name="Mehmet";
        m1.surname="Demir";
        m1.age=23;
        m1.introduce();
        m1.job="departman";
        m1.getInfo();


        System.out.println("-----------------------");

        Manager m2=new Manager(6,"Ali","Demir",24,"departman");
        m2.getInfo();
        m2.introduce();

    }

}