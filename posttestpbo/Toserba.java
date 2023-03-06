/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttestpbo;

/**
 *
 * @author sherina laraswati
 */
public class Toserba {
    String namaBarang, kategori;
    int tanggalMasuk, stok;
    
    public Toserba(String Kategori, int TanggalMasuk, String NamaBarang, int Stok ){
        this.kategori = Kategori;
        this.tanggalMasuk = TanggalMasuk;
        this.namaBarang = NamaBarang;
        this.stok = Stok;
    }
    void clear(){
        System.out.println("\n\n\n\n\n\n");
    }
}

class Update{
    String kategori,namaBarang;
    int tanggalMasuk, stok, ubah;
    
    public Update(int Ubah, String Kategori, int TanggalMasuk, String NamaBarang, int Stok){
        this.kategori = Kategori;
        this.tanggalMasuk = TanggalMasuk;
        this.namaBarang = NamaBarang;
        this.stok = Stok;
        this.ubah = Ubah;
    }
    void clear(){
        System.out.println("\n\n\n\n\n\n");
    }
}

class Delete{
    int delete1;
    
    public Delete(int Delete1){
        this.delete1 = Delete1;
    }

    void hapus(){
        System.out.println("Index " + delete1 + " Telah terhapus");
    }
    void clear(){
        System.out.println("\n\n\n\n\n\n");
    } 
}
