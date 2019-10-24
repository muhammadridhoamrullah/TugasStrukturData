import java.util.Scanner;
//@author Muhammad Ridho Amrullah
class  ProgramStack                               
{
	public static void main(String[] args) 
	{ 
		int type_of_op;			//Variable Yang Digunakan			
		KelasStack ob1=new KelasStack();            		
		Scanner s = new Scanner(System.in);    

		while(true)
		{
			System.out.println("Tumpukan Uang Koin :");          //Menu-Menu nya
			System.out.println("Tekan 1 Untuk PUSH(Masukkan) Koin");
			System.out.println("Tekan 2 Untuk POP(Keluarkan) Koin");
			System.out.println("Tekan 3 Untuk Menampilkan Stack Koin");
			System.out.println("Tekan 4 Untuk Keluar");
			type_of_op = s.nextInt();							
			switch(type_of_op)
			{
			case 1: System.out.println("Masukkan Nominal Koin Yang diPUSH");
					
					ob1.push(s.nextInt());          //Nge-Push Stack
					break;

			case 2: System.out.println("Nominal Yang Anda Keluarkan Adalah "+ ob1.pop());
					break;

			case 3: System.out.println("Isi Stack ");
					ob1.print();
					break;
			default: System.out.println("Anda Salah Masukkan Inputan"); 
					return ;

			}
		
		}
		
	}
}