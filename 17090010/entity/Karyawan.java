package entity;

public class Karyawan {

    private String id;
    private String nama;
    private String divisi;
    private String jk;
    private String agama;
    private String alamat;

    public Karyawan(String id, String nama, String divisi, String jk, String agama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.divisi = divisi;
        this.jk = jk;
        this.agama = agama;
        this.alamat = alamat;
    }

    public boolean equals(Object object){
        Karyawan tmp = (Karyawan) object;
        return id.equals(tmp.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}