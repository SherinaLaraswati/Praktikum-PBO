package posttest2;

/*
Nama: Sherina Laraswati
NIM: 2109106050
Kelas: Informatika A 2021
*/

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Posttest2{
    
    public static void main(String[] args)throws Exception{
        ArrayList<Toserba> list = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        String kategori, namaBarang;
        int tanggalMasuk, stok, ubah, delete, pilihan;
        
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
                list.add(tsb);
                tsb.clear();
                
            }else if(pilihan == 2){
                if(list.isEmpty()){
                    System.out.println("Kosong");
                }
                    for(int i = 0; i<list.size(); i++){
                        System.out.println("\nKategori Barang: " + list.get(i).getKategori());
                        System.out.println("Tanggal Masuk: " + list.get(i).getTanggalMasuk());
                        System.out.println("Nama Barang: " + list.get(i).getNamaBarang());
                        System.out.println("Stok Barang: " + list.get(i).getStok());
                    }  
                System.out.println("\n\n\n\n");
                
            }else if(pilihan == 3){
                
                System.out.println("----- U P D A T E  D A T A ----- ");
                System.out.println("Index Yang akan di Update: ");
                ubah = Integer.parseInt(br.readLine());
                
                System.out.println("Masukkan Kategori Barang: ");
                list.get(ubah-1).setKategori(br.readLine());
                
                System.out.println("Masukkan Tanggal Masuk: ");
                list.get(ubah-1).setTanggalMasuk(Integer.parseInt(br.readLine()));
                
                System.out.println("Masukkan Nama Barang: ");
                list.get(ubah-1).setNamaBarang(br.readLine());
                
                System.out.println("Masukkan Stok Barang: ");
                list.get(ubah-1).setStok(Integer.parseInt(br.readLine()));
                System.out.println("Data Berhasil Diupdate!!");
                System.out.println("\n\n\n\n");
                
            }else if(pilihan == 4){
                System.out.println("Index yang akan dihapus: ");
                delete = Integer.parseInt(br.readLine());

                list.remove(delete-1);
                System.out.println("Data Berhasil Dihapus!!");
                System.out.println("\n\n\n\n");
                
            }else if(pilihan == 5){
                System.out.println("\n\n");
                System.out.println("============================");
                System.out.println("Pendataan Toserba Berakhir");
                break;
                
            }else{
                System.out.println("Tidak Ada pilihan selain yang Ditampilkan");
            }
        } 
    }
}
