package STRUKDAT;
//@author Muhammad Ridho Amrullah

import STRUKDAT.AntrianParkiranMall;

class KelasAntrian{
    AntrianParkiranMall head,tail;
    public KelasAntrian(){
        head=null;
        tail=null;
    }
    public void enque(){
        AntrianParkiranMall baru=new AntrianParkiranMall();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("Parkiran Kosong");
        else{
            System.out.println("Mobil Keluar Dengan No Antrian : "+head.noantrian);
            head=head.next;
        }
    }
    public void view(){
        if(head==null)System.out.println("Parkiran Kosong");
        else{
            System.out.println(" No Antrian \t No Plat \t Merk Mobil \t");
            for(AntrianParkiranMall a=head; a!=null; a=a.next) a.read();
        }
    }
}
