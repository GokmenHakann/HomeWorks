package hakan;
import java.util.Scanner;
public class homework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sonuc;
		double disk,a,b,c,x1,x2;
		System.out.println("Diskriminant hesaplamas� i�in A de�erini giriniz : ");
		a=scan.nextDouble();
		System.out.println("B de�erini giriniz : ");
		b=scan.nextDouble();
		System.out.println("C de�erini giriniz : ");
		c=scan.nextDouble();
		disk=((b*b)-(4))*(a*c);//d>0 i�in b'ye 2den b�y�k say� ver, d=0 i�in b'ye 2 ver, d<0 i�in b'ye 1
		System.out.println("Diskriminant hesaplamas� sonucu = "+disk); // bir nevi test 
		
		if(disk<0) {	
			sonuc="Bu denklemin ger�el say�larla ifade edilebilecek bir k�k� yoktur.";
		}
		else if(disk==0) {
			x1=-b/(2*a);
			x2=x1;
			sonuc="Bu denklemin birbirine e�it olan 2 k�k� vard�r ve bu = "+x1+" dur";
		}
		else if(disk>0) {
			x1=(b+Math.sqrt(disk))/(2*a);
			x2=(-b-Math.sqrt(disk))/(2*a);
			sonuc="Bu denklemin iki farkl� k�k� vard�r bunlardan k�k 1 = "+x1+"  ve k�k 2 = "+x2;
		}
		else {
			sonuc="Bu terslikte bir i� var! %n Siz en iyisi ba�tan bi deneyin"; // garip bir �ey olursa diye
		}
		
		System.out.print(sonuc); 
	}

}
