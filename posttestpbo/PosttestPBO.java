/*
Nama: Sherina Laraswati
NIM: 2109106050
Kelas: Informatika A 2021
*/
package posttestpbo;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PosttestPBO {

    public static void main(String[] args)throws Exception{
        ArrayList kategoriB = new ArrayList<>();
        ArrayList tanggalMasukB = new ArrayList<>();
        ArrayList namaBarangB = new ArrayList<>();
        ArrayList stokB = new ArrayList<>();
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        
        String kategori, namaBarang;
        int tanggalMasuk, stok, ubah, delete1, pilihan;
        
        while(true){
            System.out.println("------ T O S E R B A ------");
            System.out.println("1. Menambahkan Data Barang");
            System.out.println("2. Menampilkan Data Barang");
            System.out.println("3. Mengupdate Data Barang");  
            System.out.println("4. Menghapus Data Barang");
            System.out.println("5. Exit Program\n");
            System.out.println("Masukkan Pilihan Anda:");
            pilihan = Integer.parseInt(br.readLine());
            
            if(pilihan == 1){
                System.out.println("----- C R E A T E  D A T A ----- ");
                System.out.println("Masukkan Kategori Barang: ");
                kategori = br.readLine();
                
                System.out.println("Masukkan Tanggal Masuk: ");
                tanggalMasuk = Integer.parseInt(br.readLine());
                
                System.out.println("Masukkan Nama Barang: ");
                namaBarang = br.readLine();
                
                System.out.println("Masukkan Stok Barang: ");
                stok = Integer.parseInt(br.readLine());
                
                Toserba tsb = new Toserba(kategori, tanggalMasuk, namaBarang, stok);
                kategoriB.add(tsb.kategori); tanggalMasukB.add(tsb.tanggalMasuk);
                namaBarangB.add(tsb.namaBarang); stokB.add(tsb.stok);
                tsb.clear();
                
            }else if(pilihan == 2){
                if(kategoriB.size() == 0){
                    System.out.println("Kosong");
                }
                    for(int i = 0; i<kategoriB.size(); i++){
                        System.out.println("\nKategori Barang: " + kategoriB.get(i));
                        System.out.println("Tanggal Masuk: " + tanggalMasukB.get(i));
                        System.out.println("Nama Barang: " + namaBarangB.get(i));
                        System.out.println("Stok Barang: " + stokB.get(i));
                    }  
                System.out.println("\n\n\n\n\n\n");
                
            }else if(pilihan == 3){
                
                System.out.println("----- U P D A T E  D A T A ----- ");
                System.out.println("Index Yang akan di Update: ");
                ubah = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Kategori Barang: ");
                kategori = br.readLine();
                
                System.out.println("Masukkan Tanggal Masuk: ");
                tanggalMasuk = Integer.parseInt(br.readLine());
                
                System.out.println("Masukkan Nama Barang: ");
                namaBarang = br.readLine();
                
                System.out.println("Masukkan Stok Barang: ");
                stok = Integer.parseInt(br.readLine());
                
                Update up = new Update(ubah, kategori, tanggalMasuk,namaBarang, stok);
            
                kategoriB.set(up.ubah, up.kategori); tanggalMasukB.set(up.ubah, up.tanggalMasuk);
                namaBarangB.set(up.ubah, up.namaBarang); stokB.set(up.ubah, up.stok);
                up.clear();
            }else if(pilihan == 4){
                System.out.println("Index yang akan dihapus: ");
                delete1 = Integer.parseInt(br.readLine());
                Delete dlt = new Delete(delete1);
                kategoriB.remove(dlt.delete1);tanggalMasukB.remove(dlt.delete1);
                namaBarangB.remove(dlt.delete1);stokB.remove(dlt.delete1);
                dlt.hapus();
                dlt.clear();
            }else if(pilihan == 5){
                System.out.println("\n\n\n\n\n\n");
                System.out.println("Pendataan Toserba Berakhir");
                break;
            }else{
                System.out.println("Tidak Ada pilihan selain yang Ditampilkan");
            }
        } 
    }
}
