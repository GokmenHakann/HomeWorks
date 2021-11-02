package hakan;
import java.util.Scanner;
public class homework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sonuc;
		double disk,a,b,c,x1,x2;
		System.out.println("Diskriminant hesaplamasý için A deðerini giriniz : ");
		a=scan.nextDouble();
		System.out.println("B deðerini giriniz : ");
		b=scan.nextDouble();
		System.out.println("C deðerini giriniz : ");
		c=scan.nextDouble();
		disk=((b*b)-(4))*(a*c);//d>0 için b'ye 2den büyük sayý ver, d=0 için b'ye 2 ver, d<0 için b'ye 1
		System.out.println("Diskriminant hesaplamasý sonucu = "+disk); // bir nevi test 
		
		if(disk<0) {	
			sonuc="Bu denklemin gerçel sayýlarla ifade edilebilecek bir kökü yoktur.";
		}
		else if(disk==0) {
			x1=-b/(2*a);
			x2=x1;
			sonuc="Bu denklemin birbirine eþit olan 2 kökü vardýr ve bu = "+x1+" dur";
		}
		else if(disk>0) {
			x1=(b+Math.sqrt(disk))/(2*a);
			x2=(-b-Math.sqrt(disk))/(2*a);
			sonuc="Bu denklemin iki farklý kökü vardýr bunlardan kök 1 = "+x1+"  ve kök 2 = "+x2;
		}
		else {
			sonuc="Bu terslikte bir iþ var! %n Siz en iyisi baþtan bi deneyin"; // garip bir þey olursa diye
		}
		
		System.out.print(sonuc); 
	}

}
