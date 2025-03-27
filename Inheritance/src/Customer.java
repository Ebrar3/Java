public class Customer extends Person {
    public void introduce (){
        System.out.println("Hi, my name is " + name + " and I am a costumer."+ "I am " + age + " years old.");
    }

    public Customer(){}
    public Customer(int id, String name,String surname,int age){
        super(id,name,surname,age);
    }

}
