package bluf;
import java.util.Arrays;
import java.util.Random;
public class bluf {
	public static void main(String[] args) {
		Random veri = new Random();
		//listeleri olusturduk
		int [] control=new int[52];
		String[] deste= new String[52];
		String[] deste2=new String[52];
		String[] maca = new String[13];
		String[] sinek = new String[13];
		String[] kupa = new String[13];
		String[] karo = new String[13];
		String[] kullanici1 = new String[13];
		String[] kullanici2 = new String[13];
		String[] kullanici3 = new String[13];
		String[] kullanici4 = new String[13];
		//Maca Sinek Karo ve Kupa kartlarini olusturduk
		for (int i=0;i<maca.length;i++)
			maca[i] = (i+1) + " maca " ;
		for (int i=0;i<sinek.length;i++)
			sinek[i] = (i+1) + " sinek ";
		for (int i=0;i<kupa.length;i++)
			kupa[i] = (i+1) + " kupa ";
		for (int i=0;i<karo.length;i++)
			karo[i] = (i+1) + " karo ";
		//Desteyi oluþturduk.Kupa Maca Sinek ve Karo sýrayla
		System.arraycopy(kupa,0,deste,0,kupa.length);
		System.arraycopy(maca,0,deste,13,maca.length);
		System.arraycopy(sinek,0,deste,26,sinek.length);
		System.arraycopy(karo,0,deste,39,karo.length);
		int devam,asd=0,a=0;
		//Desteyi karistirdik
		do
		{
		devam=0;
		int sayi=veri.nextInt(52);
		deste2[a]=deste[sayi];
		control[a]=sayi;
		for(int i=0 ;i<a ; i++ )
		if(sayi==control[i]){devam=1;}
		if(devam==1)continue;
		a++;
		if(a==52)asd=1;
		}while(asd!=1);
		//Desteden 13 13 kullanicilara verdik sirayla
		System.arraycopy(deste2, 0, kullanici1, 0, kullanici1.length);
		System.arraycopy(deste2, 13, kullanici2, 0, kullanici2.length);
		System.arraycopy(deste2, 26, kullanici3, 0, kullanici3.length);
		System.arraycopy(deste2, 39, kullanici4, 0, kullanici4.length);
		//Kullaniciya dagitilan kartlari dizdik
		Arrays.sort(kullanici1);
		Arrays.sort(kullanici2);
		Arrays.sort(kullanici3);
		Arrays.sort(kullanici4);
		//Kullanici kartlarini ekrana yazdirdik
		System.out.println("1.KULLANÝCÝ");
		for (int i=0;i<13;i++)
			System.out.println(kullanici1[i]);
		System.out.println("2.KULLANÝCÝ");
		for (int i=0;i<13;i++)
			System.out.println(kullanici2[i]);
		System.out.println("3.KULLANÝCÝ");
		for (int i=0;i<13;i++)
			System.out.println(kullanici3[i]);
		System.out.println("4.KULLANÝCÝ");
		for (int i=0;i<13;i++)
			System.out.println(kullanici4[i]);
		}
}

