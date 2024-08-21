import java.util.Scanner;
public class TesGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

        System.out.println("Nama :");
        String nama = in.nextLine();
        System.out.println("Mapel :");
        String mapel = in.nextLine();
        System.out.println("Alamat :");
        String alamat = in.nextLine();
        System.out.println("ID :"); 
        int id = in.nextInt();

        //membuat objek
        Guru buaulia = new Guru();
        Guru pakdiaur = new Guru();
        Guru bufeni = new  Guru();
        Guru pakandre = new Guru();
        Guru bupasha = new Guru();

        buaulia.id = 1;
        buaulia.nama = "buAulia";
        buaulia.mapel = "produktifRpl";
        buaulia.alamat = "malang";

            System.out.println("ini data buaulia");
            System.out.println(buaulia.id);
            System.out.println(buaulia.nama);
            System.out.println(buaulia.mapel);
            System.out.println(buaulia.alamat);


        pakdiaur.id = 2;
        pakdiaur.nama = "pakDiaur";
        pakdiaur.mapel = "pjok";
        pakdiaur.alamat = "malang";

           System.out.println("ini data pakdiaur");
           System.out.println(pakdiaur.id);
           System.out.println(pakdiaur.nama);
           System.out.println(pakdiaur.mapel);
           System.out.println(pakdiaur.alamat);
        
        bufeni.id = 3;
        bufeni.nama = "buFeni";
        bufeni.mapel = "mtk";
        bufeni.alamat = "malang";
            
           System.out.println("ini data bufeni");
           System.out.println(bufeni.id);
           System.out.println(bufeni.nama);
           System.out.println(bufeni.mapel);
           System.out.println(bufeni.alamat);

        pakandre.id = 4;
        pakandre.nama = "pakAndre";
        pakandre.mapel = "b inggris";
        pakandre.alamat = "malang";

            System.out.println("ini data pakAndre");
            System.out.println(pakandre.id);
            System.out.println(pakandre.nama);
            System.out.println(pakandre.mapel);
            System.out.println(pakandre.alamat);

        bupasha.id = 5;
        bupasha.nama = "buPasha";
        bupasha.mapel = "produktifRpl";
        bupasha.alamat = "malang";
        
           System.out.println("Ini data bupasha");
           System.out.println(bupasha.id);
           System.out.println(bupasha.nama);
           System.out.println(bupasha.mapel);
           System.out.println(bupasha.alamat);

        buaulia.print();
        pakdiaur.print();
        bufeni.print();
        pakandre.print();
        bupasha.print();


    }
} 