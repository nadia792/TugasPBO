import java.util.Scanner;

abstract class Penumpang{
    protected String nama;
    protected String NoTiket;
    public Penumpang(String nama, String NoTiket){
        this.nama=nama;
        this.NoTiket=NoTiket;
    }
    public abstract double hitungHargaTiket();
    public void TampilkanData(){
        System.out.println("========================================");
        System.out.println("Nama : "+ nama);
        System.out.println("No Tiket : "+ NoTiket);
        System.out.println("Harga Tiket : RP "+ hitungHargaTiket());
    }
    //OVERLOADING
    public void TampilkanData(String tipe){
        TampilkanData();
        System.out.println("Tipe : "+ tipe);
        System.out.println("========================================");
    }
}
    class PenumpangReguler extends Penumpang{
        public PenumpangReguler(String nama, String NoTiket){
            super(nama, NoTiket);
        }
        @Override
        public double hitungHargaTiket(){
            return 1000000;
        }
    }
    class PenumpangVIP extends Penumpang{
    public PenumpangVIP(String nama, String NoTiket){
        super(nama, NoTiket);
    }
    @Override
    public double hitungHargaTiket(){
        return 2000000;
    }
}
    class InputPenumpang{
        protected Scanner Nadia = new Scanner(System.in);
    }
public class Pesawat extends InputPenumpang{
    public static void main(String[] args){
        Pesawat p = new Pesawat();
        System.out.print("Nama Penumpang: ");
        String nama = p.Nadia.nextLine();
        System.out.print("No Tiket: ");
        String NoTiket = p.Nadia.nextLine();
        System.out.print("Tipe (1= Reguler, 2= VIP): ");
        int Pilihan = p.Nadia.nextInt();
        
        Penumpang g;
        if (Pilihan ==2){
            g = new PenumpangVIP(nama, NoTiket);
            g.TampilkanData("VIP");
        }else{
            g = new PenumpangReguler(nama, NoTiket);
            g.TampilkanData("Reguler");
        }
    }
    
}
