import java.util.Scanner;
public class kelipatan{
	public int jumkel(int hasil,int batasan){
		for (int angka1 = 0; angka1 < batasan; angka1++){
			if(angka1 % 3 == 0 || angka1 % 5 == 0){
				hasil = angka1 + hasil;
			}
		}
		return hasil;
	}
	public static void main (String args[]){
		int hasil = 0 ;
		int batasan;
		kelipatan ipl = new kelipatan();
		Scanner input = new Scanner(System.in);
		System.out.print("Kelipatan 3 dan 5\n");
		System.out.print("Batasan : ");
		batasan = input.nextInt();
		System.out.print("Hasil Kelipatan : ");
		System.out.println(ipl.jumkel(hasil,batasan));
	}
}