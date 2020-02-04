
package praktikum1pbo;
import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum1PBO {
      ArrayList <Prak1pbo> uhuy = new ArrayList<>();
       Prak1pbo dinda = new Prak1pbo();
       Prak1pbo putri = new Prak1pbo();
      
   

    public static void main(String[] args) {
        Praktikum1PBO z = new Praktikum1PBO();
        z.uhuymenu();
       
    }
    public void next(){
        Scanner yh = new Scanner(System.in);
        System.out.println("Apakah Anda Mau Lanjut? Y/T");
        System.out.println("Pilihan Anda ?");
        String yuhu;
        yuhu = yh.nextLine();
        switch(yuhu){
            case "Y" : uhuymenu();
                break;
            case "T" : System.out.println("Terimakasih Telah Berpartisipasi");
        }
    }
    public void Menu(){ 
         Scanner u = new Scanner(System.in);
         if(uhuy.isEmpty()==true){
        System.out.println(" Silahkan Isi Data Diri Anda ");
        System.out.println(" Nama                       :");
        String nama = u.nextLine();
        dinda.setNama(nama);
        System.out.println(" NIK                        :");
        String nik=u.nextLine();
        dinda.setNIK(nik);
        System.out.println(" Tempat Tanggal Lahir       :");
        String ttl=u.nextLine();
        dinda.setTTL(ttl);
        System.out.println(" Jeni Kelamin               :");
        String jk=u.nextLine();
        dinda.setJenisKelamin(jk);
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. AB");
        System.out.println("4. O");
        System.out.println(" Golongan Darah             :");
        int goldar=u.nextInt();
        dinda.setGolDarah(goldar);
        if(goldar==1){
            System.out.println("A");
        } else if(goldar==2){
            System.out.println("B");
        } else if(goldar==3){
            System.out.println("AB");
        } else if (goldar==4){
            System.out.println("O");
        } else {
            System.out.println("Pilihan Anda Salah");
        }
                uhuy.add(dinda);
        
        next();
         } else {
        System.out.print(" Nama                       :");
        String nama = u.nextLine();
        putri.setNama(nama);
        System.out.print(" NIK                        :");
        String nik=u.nextLine();
        putri.setNIK(nik);
        System.out.print(" Tempat Tanggal Lahir       :");
        String ttl=u.nextLine();
        putri.setTTL(ttl);
        System.out.print(" Jeni Kelamin               :");
        String jk=u.nextLine();
        putri.setJenisKelamin(jk);
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. AB");
        System.out.println("4. O");
        System.out.print(" Golongan Darah             :");
        int goldar=u.nextInt();
        putri.setGolDarah(goldar);
        if(goldar==1){
            System.out.print("A");
        } else if(goldar==2){
            System.out.print("B");
        } else if(goldar==3){
            System.out.print("AB");
        } else if (goldar==4){
            System.out.print("O");
        } else {
            System.out.print("Pilihan Anda Salah");
        }
                uhuy.add(putri);
        
        next();
             
         }
        
    }
    public void Tampilan(){
        System.out.println("Tampilan Data");
        for(int a=0; a<uhuy.size(); a++){
        System.out.println("\n");
        System.out.print("Nama : " + uhuy.get(a).getNama());
        System.out.print("NIK : " + uhuy.get(a).getNIK());
        System.out.print("Tempat Tanggal Lahir : " + uhuy.get(a).getTTL());
        System.out.print("Jenis Kelamin : " + uhuy.get(a).getJenisKelamin());
        System.out.print("Golongan Darah : " + uhuy.get(a).getGolDarah() );
        }  
        next();
    }
        
    public void uhuymenu(){
        Scanner s = new Scanner(System.in);
        int y = 0;
        System.out.println("\n S E L A M A T D A T A N G");
        System.out.println("\n     Tampilan Menu");
        System.out.println("1. Pengisian                ");
        System.out.println("2. Tampilan Data            ");
        System.out.println("\n Masukan Pilihan Anda    :");
        y=s.nextInt();
        
        switch (y){
            case 1 : Menu();
                break;
            case 2 : Tampilan();
                break;
            case 3 : y=3;
                System.out.println("Terimakasih");
                break;
            default :
                System.out.println("Pilihan Salah");
                break;
                
        }
        next();
    }
    
    
}
