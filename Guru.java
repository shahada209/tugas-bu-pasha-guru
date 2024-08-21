//object Class
public class Guru {
    String Guru;
    int id;
    String nama;
    String mapel;
    String alamat;

    // Construktor nama sama dgn nama class
    public Guru() {
    

        id = 5;
        nama = "";
        mapel = "";
        alamat = "";

    }

        // Construktor Parameter
        public Guru(int id, String nama, String mapel, String alamat) {
            this.id = id ;
            this.nama = nama;
            this.mapel = mapel;
            this.alamat = alamat;

            // method
            
            
            
            
        }
        public void print() {
            System.out.println("--------");
            System.out.println("ID : "+ id);
            System.out.println("Nama :"+ nama);
            System.out.println("Mapel :"+ mapel);
            System.out.println("Alamat :"+ alamat);
            System.out.println("--------");

    
        



        }





    

}