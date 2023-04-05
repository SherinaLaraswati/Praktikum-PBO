
package posttest5;

/*
Nama: Sherina Laraswati
NIM: 2109106050
Kelas: Informatika A 2021
*/

/**
 *
 * @author sherina laraswati
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Posttest5 {
    
    public static final void notif(){
            System.out.println("=========================================");
            System.out.println("Data Yang Telah Disimpan Di Dalam Sistem");
        }
    
    public static void main(String[] args) throws IOException {
        
        
        ArrayList <alatMasak> amsk= new ArrayList<>();
        ArrayList <pengharumR> pRuang = new ArrayList<>();
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        
        String spek, namaBarang, jenis, varian, merekBrg;
        int tanggalMasuk, stok, ubah, delete, pilihan, pil, hargaBarang = 0, choice, ch, chs;
        while(true){
            
            System.out.println("\n------ T O S E R B A ------");
            System.out.println("[1] Menambahkan Data Barang");
            System.out.println("[2] Menampilkan Data Barang");
            System.out.println("[3] Mengupdate Data Barang");  
            System.out.println("[4] Menghapus Data Barang");
            System.out.println("[5] Exit Program\n");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = Integer.parseInt(br.readLine());
            System.out.println("\n\n");
            if(pilihan == 1){
                System.out.println("--- K A T E G O R I ---");
                System.out.print("[1] Alat Masak\n"
                        + "[2] Pengharum Ruangan\n"
                        + "Masukkan Pilihan Anda: ");
                pil = Integer.parseInt(br.readLine());
                if(pil == 1){
                    System.out.println("\n------ C R E A T E ------ ");
                   
                    System.out.println("Kategori: Alat Masak");
                    
                    System.out.print("Nama Barang: ");
                    namaBarang = br.readLine();
                    
                    System.out.print("Tanggal Masuk: ");
                    tanggalMasuk = Integer.parseInt(br.readLine());
                    
                    System.out.print("Stok Barang: ");
                    stok = Integer.parseInt(br.readLine());

                    System.out.print("Harga Barang Satuan: ");
                    hargaBarang = Integer.parseInt(br.readLine());
                    
                    System.out.print("Spesifikasi Barang: ");
                    spek = br.readLine();
                    alatMasak amk = new alatMasak(tanggalMasuk, stok, hargaBarang, namaBarang, spek);
                    amsk.add(amk);
                    System.out.println("\n");
                    amk.notif(stok, hargaBarang);
                    System.out.println("\n\n");
                }else if(pil == 2){
                    System.out.println("\n\n");
                    System.out.println("------ C R E A T E ------ ");
                    
                    System.out.println("Kategori: Pengharum Ruangan");
                    
                    System.out.print("Merek Barang: ");
                    merekBrg = br.readLine();
                    
                    System.out.print("Tanggal Masuk: ");
                    tanggalMasuk = Integer.parseInt(br.readLine());
                    
                    System.out.print("Stok Barang: ");
                    stok = Integer.parseInt(br.readLine());

                    System.out.print("Harga Barang Satuan: ");
                    hargaBarang = Integer.parseInt(br.readLine());
                    
                    System.out.print("Jenis Pengharum Ruangan: ");
                    jenis = br.readLine();
                    
                    System.out.print("Varian Pengharum Ruangan: ");
                    varian = br.readLine();
                    
                    pengharumR pR = new pengharumR(tanggalMasuk, stok, hargaBarang, merekBrg, jenis, varian);
                    pRuang.add(pR);
                    System.out.println("\n");
                    pR.notif(stok, hargaBarang);
                    System.out.println("\n\n");
                }else{
                    System.out.println("Pilihan Tidak Tersedia!!");
                    System.out.println("\n\n");
                }
                
            }else if(pilihan == 2){
                System.out.println("----- L I H A T -----");
                System.out.print("[1] Data Alat Masak\n"
                        + "[2] Data Pengharum Ruangan\n"
                        + "Masukkan Pilihan Anda: ");
                choice = Integer.parseInt(br.readLine());
                if(choice == 1){
                     for(int i = 0; i<amsk.size(); i++){
                        System.out.println("\nKategori Barang: Alat Masak");
                        System.out.println("Nama Barang: " + amsk.get(i).getNamaBarang());
                        System.out.println("Tanggal Masuk: " + amsk.get(i).getTanggalMasuk());
                        System.out.println("Stok Barang: " + amsk.get(i).getStok());
                        System.out.println("Harga Persatuan: " + amsk.get(i).getHarga());
                        System.out.println("Spek Barang: " + amsk.get(i).getSpesifikasiBarang());
                        notif();
                        System.out.println("\n");
                    }
                        
                }else if(choice == 2)
                {
                    for(int i = 0; i<pRuang.size(); i++)
                    {
                        System.out.println("\nKategori Barang: Pengharum Ruangan");
                        System.out.println("Merek Barang: " + pRuang.get(i).getMerek());
                        System.out.println("Tanggal Masuk: " + pRuang.get(i).getTanggalMasuk());
                        System.out.println("Stok Barang: " + pRuang.get(i).getStok());
                        System.out.println("Harga Persatuan: " + pRuang.get(i).getHarga());
                        System.out.println("Jenis Barang: " + pRuang.get(i).getJenis());
                        System.out.println("Varian Barang: " + pRuang.get(i).getVarian());
                        notif();
                        System.out.println("\n");
                    }
                }
                
            }else if(pilihan == 3){
                    System.out.println("----- U P D A T E -----");
                    System.out.print("[1] Update Data Alat Masak\n"
                            + "[2] Update Data Pengharum Ruangan\n"
                            + "masukkan Pilihan Anda: ");
                    ch = Integer.parseInt(br.readLine());
                    if(ch == 1){
                        System.out.println("\n---- Data Alat Masak -----");
                        for(int i = 0; i<amsk.size(); i++){
                            System.out.println("\nKategori Barang: Alat Masak");
                            System.out.println("Nama Barang: " + amsk.get(i).getNamaBarang());
                            System.out.println("Tanggal Masuk: " + amsk.get(i).getTanggalMasuk());
                            System.out.println("Stok Barang: " + amsk.get(i).getStok());
                            System.out.println("Harga Persatuan: " + amsk.get(i).getHarga());
                            System.out.println("Spek Barang: " + amsk.get(i).getSpesifikasiBarang());
                            System.out.println("\n\n");
                         }
                        System.out.print("Index Yang Akan Di Update: ");
                        ubah = Integer.parseInt(br.readLine());
                        
                        System.out.println("Kategori: Alat Masak");
                        System.out.print("Nama Barang: ");
                        amsk.get(ubah-1).setNamaBarang(br.readLine());
                        System.out.print("Tanggal Masuk: ");
                        amsk.get(ubah-1).setTanggalMasuk(Integer.parseInt(br.readLine()));
                        System.out.print("Stok Barang: ");
                        amsk.get(ubah-1).setStok(Integer.parseInt(br.readLine()));
                        System.out.print("Harga Barang: ");
                        amsk.get(ubah-1).setHarga(Integer.parseInt(br.readLine()));
                        System.out.print("Spek Barang: ");
                        amsk.get(ubah-1).setSpesifikasiBarang(br.readLine());
                        System.out.println("\n");
                        amsk.get(0).giat();
                        System.out.println("\n\n");
                    }else if(ch == 2)
                    {
                        System.out.println("\n---- Data Pengharum Ruangan ----");
                        for(int i = 0; i<pRuang.size(); i++){
                            System.out.println("\nKategori Barang: Pengharum Ruangan");
                            System.out.println("Merek Barang: " + pRuang.get(i).getMerek());
                            System.out.println("Tanggal Masuk: " + pRuang.get(i).getTanggalMasuk());
                            System.out.println("Stok Barang: " + pRuang.get(i).getStok());
                            System.out.println("Harga Persatuan: " + pRuang.get(i).getHarga());
                            System.out.println("Jenis Barang: " + pRuang.get(i).getJenis());
                            System.out.println("Varian Barang: " + pRuang.get(i).getVarian());
                            System.out.println("\n\n");
                        }
                        System.out.print("Index Yang Akan Di Update: ");
                        ubah = Integer.parseInt(br.readLine());
                        System.out.println("\n\n");
                        System.out.println("Kategori: Pengharum Ruangan");
                        System.out.print("Merek Barang: ");
                        pRuang.get(ubah-1).setMerek(br.readLine());
                        System.out.print("Tanggal Masuk: ");
                        pRuang.get(ubah-1).setTanggalMasuk(Integer.parseInt(br.readLine()));
                        System.out.print("Stok Barang: ");
                        pRuang.get(ubah-1).setStok(Integer.parseInt(br.readLine()));
                        System.out.print("Harga Barang: ");
                        pRuang.get(ubah-1).setHarga(Integer.parseInt(br.readLine()));
                        System.out.print("Jenis Barang: ");
                        pRuang.get(ubah-1).setJenis(br.readLine());
                        System.out.print("Varian Barang: ");
                        pRuang.get(ubah-1).setVarian(br.readLine());
                        System.out.println("\n");
                        pRuang.get(0).giat();
                        System.out.println("\n\n");
                }
                
            }else if(pilihan == 4){
                System.out.println("------ D E L E T E ------");
                System.out.print("[1] Delete Data Alat Masak\n"
                        + "[2] Delete Data Pengharum Ruangan\n"
                        + "Masukkan Pilihan Anda: ");
                chs = Integer.parseInt(br.readLine());
                if(chs == 1){
                    System.out.println("\n---- Data Alat Masak -----");
                    for(int i = 0; i<amsk.size(); i++){
                            System.out.println("\nKategori Barang: Alat Masak");
                            System.out.println("Nama Barang: " + amsk.get(i).getNamaBarang());
                            System.out.println("Tanggal Masuk: " + amsk.get(i).getTanggalMasuk());
                            System.out.println("Stok Barang: " + amsk.get(i).getStok());
                            System.out.println("Harga Persatuan: " + amsk.get(i).getHarga());
                            System.out.println("Spek Barang: " + amsk.get(i).getSpesifikasiBarang());
                            System.out.println("\n\n");
                        }
                    System.out.print("Index yang akan dihapus: ");
                    delete = Integer.parseInt(br.readLine());
                    System.out.println("\n");
                    amsk.get(0).giat();
                    amsk.remove(delete-1);
                    System.out.println("\n\n");
                }else if(chs == 2){
                    System.out.println("\n---- Data Pengharum Ruangan -----");
                    for(int i = 0; i<pRuang.size(); i++){
                            System.out.println("\nKategori Barang: Pengharum Ruangan");
                            System.out.println("Merek Barang: " + pRuang.get(i).getMerek());
                            System.out.println("Tanggal Masuk: " + pRuang.get(i).getTanggalMasuk());
                            System.out.println("Stok Barang: " + pRuang.get(i).getStok());
                            System.out.println("Harga Persatuan: " + pRuang.get(i).getHarga());
                            System.out.println("Jenis Barang: " + pRuang.get(i).getJenis());
                            System.out.println("Varian Barang: " + pRuang.get(i).getVarian());
                            System.out.println("\n\n");
                        }
                    System.out.print("\nIndex yang akan dihapus: ");
                    delete = Integer.parseInt(br.readLine());
                    pRuang.get(0).giat();
                    pRuang.remove(delete-1);
                    System.out.println("\n\n");
                }
              
            }else if(pilihan == 5){
                System.out.println("============================");
                System.out.println("Pendataan Toserba Berakhir");
                System.out.println("============================");
                break;
                
            }else{
                System.out.println("Tidak Ada pilihan selain yang Ditampilkan");
            }
        } 
    }
}
