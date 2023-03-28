package homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Service {

	public static final List<Albums> ALBUMS_LIST = new ArrayList<>();

	public static final List<Customers> CUSTOMERS = new ArrayList<>();
	
	public static void generateAlbumsAndCustomers() {
		    ALBUMS_LIST.add(new Songs("Mesafe","Serdar Ortaç",2006,"Melek,Dansöz,Sor,Gitme","Gitme",3.47)) ;
		    ALBUMS_LIST.add(new Songs("Mesafe","Serdar Ortaç",2006,"Melek,Dansöz,Sor,Gitme","Dansöz",5.16));
		    ALBUMS_LIST.add(new Songs("Mesafe","Serdar Ortaç",2006,"Melek,Dansöz,Sor,Gitme","Sor",3.55));
		    ALBUMS_LIST.add(new Songs("Mesafe","Serdar Ortaç",2006,"Melek,Dansöz,Sor,Gitme","Melek",5.26));
		    ALBUMS_LIST.add(new Songs("Festival","Kenan Doğulu",2006,"Çakkıdı,Aşk Kokusu,Baş Harfi Ben,Yüzsüz Yürek","Çakkıdı",3.19));
		    ALBUMS_LIST.add(new Songs("Festival","Kenan Doğulu",2006,"Çakkıdı,Aşk Kokusu,Baş Harfi Ben,Yüzsüz Yürek","Aşk Kokusu",4.39));
		    ALBUMS_LIST.add(new Songs("Festival","Kenan Doğulu",2006,"Çakkıdı,Aşk Kokusu,Baş Harfi Ben,Yüzsüz Yürek","Baş Harfi Ben",3.36));
		    ALBUMS_LIST.add(new Songs("Festival","Kenan Doğulu",2006,"Çakkıdı,Aşk Kokusu,Baş Harfi Ben,Yüzsüz Yürek","Yüzsüz Yürek",3.21));
		    

		    CUSTOMERS.add(new Customers("Beste", "Saraç"));
		    CUSTOMERS.add(new Customers("Ahmet", "Gültekin"));
		    CUSTOMERS.add(new Customers("Selika", "Tuğ"));
		    CUSTOMERS.add(new Customers("Elif", "Erol"));
		    CUSTOMERS.add(new Customers("Sena", "Çaprazlı"));
		  }
	 
	public static void buyAlbums(String albumName,String name,String surname) {
		
		 Albums albums = null;
		 Customers customer = null;
		    for (Albums a : ALBUMS_LIST) {
		      if (a.getAlbumName().equals(albumName)) {
		        albums = a;
		        break;
		      }
		    }

		    for (Customers c : CUSTOMERS) {
		      if (c.getName().equals(name)) {
		        customer = c;
		        break;
		      }
		    }
		    if (albums != null && customer != null) {
		      albums.buy(customer);
		    } else {
		      System.out.println("Hatalı bilgi girişi!!");
		    }
		  }
	
