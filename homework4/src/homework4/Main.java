package homework4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Service.generateAlbumsAndCustomers();
		int choice = 0;
		 do {
		      System.out.println("###################");
		      System.out.println("1- Albüm satın al");
		      System.out.println("2- Albümleri listele");
		      System.out.println("###################");
		      choice = scanner.nextInt();
		      switch (choice) {
		        case 1 -> {
		          System.out.print("Albüm adı giriniz: ");
		          String albumsName = scanner.nextLine();
		          System.out.println("Müşteri adı giriniz: ");
		          var name = scanner.nextLine();
		          System.out.println("Müşteri soyadı giriniz: ");
		          var surname = scanner.nextLine();
		          Service.buyAlbums(albumsName,name,surname);
		        }
		        case 2 -> {
		          System.out.println(Service.ALBUMS_LIST);
		          scanner.nextLine();
		        }
		        
		       
		    } 
		 }while (choice > -1);
		    System.out.println("İyi günlerde kullanın.");
		  }
		}



