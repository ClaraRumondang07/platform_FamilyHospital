package pojos;
// Generated Oct 30, 2018 3:03:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pasien generated by hbm2java
 */
public class Pasien  implements java.io.Serializable {


     private String noRm;
     private String nama;
     private String alamat;
     private String nik;
     private Date tanggalLahir;
     private String kelamin;

    public Pasien() {
    }

	
    public Pasien(String noRm) {
        this.noRm = noRm;
    }
    public Pasien(String noRm, String nama, String alamat, String nik, Date tanggalLahir, String kelamin) {
       this.noRm = noRm;
       this.nama = nama;
       this.alamat = alamat;
       this.nik = nik;
       this.tanggalLahir = tanggalLahir;
       this.kelamin = kelamin;
    }
   
    public String getNoRm() {
        return this.noRm;
    }
    
    public void setNoRm(String noRm) {
        this.noRm = noRm;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNik() {
        return this.nik;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }
    public Date getTanggalLahir() {
        return this.tanggalLahir;
    }
    
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String getKelamin() {
        return this.kelamin;
    }
    
    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }




}


