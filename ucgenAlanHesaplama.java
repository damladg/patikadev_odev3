import java.util.Scanner;

public class ucgenAlanHesaplama {
    public static void main(String[] args) {
        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarını giriniz : ");
        double a = scan.nextDouble();

        System.out.print("Üçgenin ikinci kenarını giriniz :");
        double b = scan.nextDouble();

        System.out.print("Üçgenin üçüncü kenarını giriniz :");
        double c = scan.nextDouble();

        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        double u = (a+b+c)/2 ; //yarı çevre
        System.out.println("Yarı çevre hesaplaması : "+ u);

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı : " + alan);









    }
}
