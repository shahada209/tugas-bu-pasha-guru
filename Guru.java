//object Class
public class Guru {
    String Guru;
    int id;
    String nama;
    String mapel;
    String alamat;

    public String getGuru() {
        return this.Guru;
    }

    public void setGuru(String Guru) {
        this.Guru = Guru;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }



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