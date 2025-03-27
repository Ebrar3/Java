// Scanner sınıfını dahil et, dışarıdan nesne almak için kullanılıyor.
public class Main {
    public static void main(String[] args) {

        int number =45;
        isPrime(number);

    }
    public static void isPrime(int number){
        boolean prime=true;
        if (number ==1){
            prime=false;
        } else if (number<0) {
            prime=false;
        } else{
            for(int i=2; i<number; i++){
                if( number %i ==0){
                    prime=false;
                }
            }
        }
        if (prime){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }

    }
}