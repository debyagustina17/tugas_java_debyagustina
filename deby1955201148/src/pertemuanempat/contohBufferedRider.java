
package pertemuanempat;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author LENOVO
 */
public class contohBufferedRider {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
    String nama;
    String jeniskelamin;
    String asaldaerah;
    String namawali;
    String alamatrumah;
     //object InputStream
   InputStreamReader isr = new InputStreamReader (System.in);
   // object contoscanner
   BufferedReader br = new BufferedReader(isr);
   // mengisi veriabel nama dengan BufferedRider
   System.out.println("Siapa Nama Anda ?");
   nama = br.readLine();
   
   System.out.println("Apa Jenis Kelamin Anda ?");
   jeniskelamin = br.readLine();
   
   System.out.println("Nama Asal Daerah Anda ?");
   asaldaerah = br.readLine();
   
   System.out.println("nama wali adalah ?");
   namawali = br.readLine ();
   
   System.out.println("alamat rumah anda ?");
   alamatrumah = br.readLine();
   
   //tampilkan nama
   System.out.println("nama anda adalah ?" + nama);
   System.out.println("Apa Jenis Kelamin Anda ?" + jeniskelamin);
   System.out.println("asal daerah anda ?" + asaldaerah);
   System.out.println("nama wali adalah ?" + namawali);
   System.out.println(" alamat rumah anda?" + alamatrumah);
   
   
   


           
    
}
}