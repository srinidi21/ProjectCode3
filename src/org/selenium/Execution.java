package org.selenium;

public class Execution extends Adectin {
	
	public static void main(String[] args) {
		LaunchApp("http://adactinhotelapp.com/");
		POJOClass1 p=new POJOClass1();
		fill(p.getUser(),"shivanibuelah");
		fill(p.getPassword(),"Jajessies@2");
		klik(p.getLgnbtn());
		
		POJOClass2 o=new POJOClass2();
		dd(o.getLocation(),1);
		dd(o.getHotel(),1);
		dd(o.getRoom_type(),2);
		dd(o.getRoom_nos(),3);
		fill(o.getCheckin(),"06/06/2020");
		fill(o.getCheckout(),"08/06/2020");
		dd(o.getAdultRoom(),1);
		dd(o.getChildRoom(),0);
		klik(o.getSearch());
		
		POJOClass3 j=new POJOClass3();
		klik(j.getSelect());
		klik(j.getContinue());
		
		POJOClass4 a=new POJOClass4();
		fill(a.getFirstname(),"Srinidi");
		fill(a.getLastname(),"Buelah");
		fill(a.getAddress(),"Chennai");
		fill(a.getCreditcardno(),"1234567898521597");
		dd(a.getCardtype(),1);
		dd(a.getMonth(),2);
		dd(a.getYear(),3);
		fill(a.getCvvnumber(),"012");
		klik(a.getBooknow());
		
		POJOClass5 b=new POJOClass5();
		print(b.getHotelname());
		print(b.getLocation());
		print(b.getRoomtype());
		print(b.getArrivaldate());
		print(b.getDeparturedate());
		print(b.getTotalrooms());
		print(b.getAdultsroom());
		print(b.getChildrenroom());
		print(b.getPricenight());
		print(b.getTotal_price());
		print(b.getGst());
		print(b.getFinalprice());
		print(b.getFirstname());
		print(b.getAddress());
		print(b.getOrderno());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
