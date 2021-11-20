import java.util.Scanner;
public class obat{
	public String dosis(String gender,int usia,int bb,String hasil){
		boolean set = false;
		String pembanding = "laki-laki";
		String pembanding2 = "perempuan";
		if(gender.equals(pembanding) && bb > 150 && usia > 21 || gender.equals(pembanding2) && usia < 21 && bb < 150){
			hasil = "Obat 1";
			set = true;
		}else if(gender.equals(pembanding) && usia > 21 && bb < 150 || gender.equals(pembanding) && usia < 21 && bb > 150){
			hasil = "obat 2";
			set = true;
		}else if(gender.equals(pembanding) && usia < 21 && bb < 150 || gender.equals(pembanding2) && usia > 21 && bb > 150){
			hasil = "obat 3";
			set = true;
		}else{
			hasil = "Pasien Tidak Memerlukan Obat";
		}
		return hasil;
	}
	public static void main(String args[]){
		String hasil = "";
		String gender = "";
		int usia,bb;
		obat ipl = new obat();
		Scanner input = new Scanner(System.in);
		System.out.print("Gender : ");
		gender = input.nextLine();
		System.out.print("Usia : ");
		usia = input.nextInt();
		System.out.print("Berat Badan : ");
		bb = input.nextInt();
		System.out.print(ipl.dosis(gender,usia,bb,hasil));
	}
}