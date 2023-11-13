package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
    MemberPlatinum memplatinum = new MemberPlatinum();
    MemberGold memgold = new MemberGold();
    MemberSilver memsilver = new MemberSilver();

        //Nama: RIZKA KURNIA ILLAHI
        //NIM: 2211521012
        //Ini adalah polymorphism
        //antar kelas memiliki method sama namun perilaku berbeda
        //terlihat bahwa  object dibuat dari kelas yang berbeda
        //ketika memanggil method sama maka outputnya akan berbeda

        System.out.println("Total bayar member platinum Rp." + memplatinum.hitungTotalBayar(500000));
        System.out.println("Total bayar member gold Rp." + memgold.hitungTotalBayar(500000));
        System.out.println("Total bayar member silver Rp." + memsilver.hitungTotalBayar(500000));
        
}
    
}

