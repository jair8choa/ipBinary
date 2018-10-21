import java.io.Reader;
import java.util.Scanner;
public class I {
    public static String Cadena(int divi) {
        String bTotal="";
        int r = 0 ;
        do {
            r=divi%2;
            
            if (r==0) {
                bTotal="0"+bTotal;
            }else{
                bTotal="1"+bTotal;
            }
            divi = divi/2;
        } while (divi>=1);
        for (int ce = 1; bTotal.length()< 8; ce++) {
            bTotal="0"+bTotal;
        }
        return bTotal;

    }
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        int ipB1,ipB2,ipB3,ipB4;
        String ip;
        ip = Reader.next();
        String c1 ="",c2 ="",c3 ="",c4 ="";
        int i=0;
        for (; ip.charAt(i) != '.'; i++) {
            c1 = c1+ip.charAt(i);
        }
        i=i+1;
        for (; ip.charAt(i) != '.'; i++) {
            c2 = c2+ip.charAt(i);
        }
        i = i+1;
        for (; ip.charAt(i) != '.'; i++) {
            c3 = c3+ip.charAt(i);
        }
        i = i+1;
        for (; i < ip.length(); i++) {
            c4 = c4+ip.charAt(i);
        }
        ipB1=Integer.parseInt(c1);
        ipB2=Integer.parseInt(c2);
        ipB3=Integer.parseInt(c3);
        ipB4=Integer.parseInt(c4);
        int divi=16;

        String binario = Cadena(ipB1)+Cadena(ipB2)+Cadena(ipB3)+ Cadena(ipB4);
        System.out.println(binario);
      
    }
}