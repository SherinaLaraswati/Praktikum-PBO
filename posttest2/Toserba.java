package posttest2;

/**
 *
 * @author sherina laraswati
 */
public class Toserba {

    private String namaBarang;
    private String kategori;
    private int tanggalMasuk;
    private int stok;
    public Toserba(String Kategori, int TanggalMasuk, String NamaBarang, int Stok){
        this.kategori = Kategori;
        this.tanggalMasuk = TanggalMasuk;
        this.namaBarang = NamaBarang;
        this.stok = Stok;
    }
    
    void clear(){
        System.out.println("\n\n\n\n");
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    /**
     * @return the tanggalMasuk
     */
    public int getTanggalMasuk() {
        return tanggalMasuk;
    }

    /**
     * @param tanggalMasuk the tanggalMasuk to set
     */
    public void setTanggalMasuk(int tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }
}