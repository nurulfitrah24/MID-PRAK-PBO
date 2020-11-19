import java.util.Scanner;

class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String name;
	
		
		System.out.print("masukkan nama anda : ");
        name = input.nextLine();
        
      

		Enkapulasi e = new Enkapulasi();
		e.setNama(name);
	
		e.pilihan();
		e.pembayaran();
		e.cetak();
	
	}
}  