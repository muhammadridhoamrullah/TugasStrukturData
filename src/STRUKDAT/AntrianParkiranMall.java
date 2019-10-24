package STRUKDAT;
//@author Muhammad Ridho Amrullah
import java.util.Scanner;
public class AntrianParkiranMall{
    int noantrian;
    String platnomor,merkmobil;
    AntrianParkiranMall next;
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Input Nomor Antrian Parkiran    : ");
        noantrian=in.nextInt();
        System.out.print("Input Plat Nomor Anda \t\t: ");
        platnomor=str.nextLine();
        System.out.print("Merk Mobil Anda \t\t: ");
        merkmobil=str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println("\t"+noantrian+" \t "+platnomor+" \t "+merkmobil+" \t");
    }
    public static void main(String[] args){
        int menu=0;
        KelasAntrian que=new KelasAntrian();
        while(menu!=4){
            System.out.print("MENU PROGRAM PARKIR MALL\n1.Masukkan Mobil KeParkiran (Enqueue)\n2.Keluarkan Mobil Dari Parkiran (Dequeue)\n3.Cek Keadaan Parkiran (Display)\n4.Keluar\n : ");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else if(menu==4)System.out.println("Keluar");
            else System.out.println("SALAH INPUTAN");
            System.out.println("");
        }
    }
}