import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int enb=1,enk=2,num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı arasından min ve max değerlerini bulmak istiyorsunuz : ");
        int piece = scanner.nextInt();
        for(int i=1;i<=piece;i++){
            System.out.print("Sayı giriniz : ");
            num= scanner.nextInt();
            if(enk>enb){
                enk=num;
                enb=num;
            }
            if(num>enb){
                enb=num;
            }
            if(num<enk){
                enk=num;
            }

        }
        System.out.println("Girilen sayılardan en büyük sayı : "+enb+"\nGirilen sayılardan en küçük sayı : "+enk);


    }
}
