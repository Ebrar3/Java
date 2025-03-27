public class Person {
    public Person(int id, String name,String surname,int age){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public Person(){}
    int id;
    String name;
    String surname;
    int age; //görünmez bir =0; var yanında aslında, deafault olarak 0 atıyor.

    public void introduce (){
        if(this.name==null && this.age==0){
            System.out.println("Hi, my name and age are not known.");
        }
        else {
            System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
        }
    }

    public void getInfo(){
        System.out.println("Id: " + id + "\nName: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }
}
