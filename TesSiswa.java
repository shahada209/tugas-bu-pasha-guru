//Driver Class
import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();

        Siswa ari = new Siswa(id, nama, ipk);
        //nilai diatas 75 lulus
        if (ari.getIpk() >= 75){
            System.out.println(ari.getNama() + "Lulus");
        }else{
            System.out.println(ari.getNama() + "Lulus");
        }

        //nilai huruf
        if (ari.getIpk() < 70){
            System.out.println("E");
        }
        else if (ari.getIpk() > 60 &&  ari.getIpk() <= 70) {
            System.out.println("D");
        }
        else if (ari.getIpk() > 70 &&  ari.getIpk() <= 80) {
            System.out.println("C");
        }
        else if (ari.getIpk() > 80 &&  ari.getIpk() <= 90) {
            System.out.println("B");
        }
        else if (ari.getIpk() > 90 &&  ari.getIpk() <= 100) {
            System.out.println("A");
        }

        in.close();









    }
    
}
