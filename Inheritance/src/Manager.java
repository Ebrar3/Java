public class Manager extends Employee {
    public Manager(int id, String name,String surname,int age, String job){
        super(id,name,surname,age);
        this.job=job;
    }// Constructure yaptık
    String job;
    public Manager(){
        this.job="departman bilinmiyor";
    } //overloading yaptık Manager ı aynı zamanda bu yöntemle de uygulayabiliriz

     public void introduce (){
        System.out.println("Hi, my name is " + name + " and I am a manager.");
     }// üst sınıftaki bir metodu override ediyoruz.

}
