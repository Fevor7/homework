package mas1;
import obr.Vvod;
import obr.Work;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mas;
		int v=0;
		mas = Vvod.vod();
		System.out.println ("Введенный Вами массив: ");
		Vvod.prnt(mas);
		do {
			Vvod.prntMenu();
			switch (Vvod.csn()) {
			case 1: { System.out.println ("Введите новый эемент массива: " ); mas = Work.adb(mas, Vvod.csn2()); break;}
			case 2:{  mas=Work.sort2(mas); Vvod.prnt(mas); break;}
			case 3:{  mas=Work.sort(mas);  Vvod.prnt(mas); break;}	
			case 4:{  System.out.println ("максимальный элемент маccива: "+Work.maxEl(mas)); break;}	
			case 5:{  System.out.println ("минимальный элемент маccива: "+Work.minEl(mas)); break; }	
			case 6:{ Vvod.prnt(mas); break;}	
			case 0:{  System.out.println ("Программа завершена!!"); v=1; break;}	
			}
			
			
			
		} while (v==0);
		
		
		
		
		
		
		
		
		/*mas=Work.adb(mas, 25); // добавление элемента
		mas=Work.sort(mas);
		Vvod.prnt(mas);
		mas=Work.sort2(mas); // по возрастанию
		Vvod.prnt(mas);
		System.out.println ("максимальный элемент маccива: "+Work.maxEl(mas));
		System.out.println ("минимальный элемент маccива: "+Work.minEl(mas));*/

	}

}
