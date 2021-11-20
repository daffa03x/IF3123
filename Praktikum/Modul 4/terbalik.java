import java.util.Scanner;
public class terbalik{
   public static void main(String[] args){
		String kata = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Kata Sebelum Terbalik : ");
		kata = input.nextLine();
		String reverse = new StringBuffer(kata).reverse().toString();
		System.out.print("Kata Setelah Dibalik : "+reverse);
	}
}