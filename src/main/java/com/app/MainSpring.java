package com.app;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.*;
import com.repository.*;

public class MainSpring {
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		AdressRepository adressRep =(AdressRepository) context.getBean("adressRepository");
//		adressRep.count();//how many are saved adress
//		adressRep.delete(0);//delete by id
//		adressRep.findAll();//shows all what are in table
//		adressRep.save(iterable or object);//shows all what are in table
		
		
		adressRep.save(new Adress("adress 1"));
//		System.out.println(adressRep.findByNameAdress("adress 1"));//для одного результату
//		System.out.println(adressRep.findListByNameAdress("adress 1"));//List значень
		
		Adress ac =new Adress("1925 Grassland Pkwy Alpharetta GA 30004 (1085.9km)");
		adressRep.save(ac);
		List<Adress> listAdress = new LinkedList<>(Arrays.asList(
		new Adress("LG Twin Towers, 20 Yeouido-dong, Youngdeungpo-gu, Seoul"),
		new Adress("13F Marunouchi Center Building 6-1, Marunouchi, Chiyoda-ku, Tokyo"),
		new Adress("Wilk Elektronik SA Mikolowska 42 43-173 Laziska Gorne"),
		new Adress("3355 Michelson Drive, Suite 100 Irvine, California"),
		new Adress("Royal Philips Amstelplein 2 Philips Center, Breitner Tower P.O. Box 77900 1070 MX Amsterdam"),
		new Adress("Kingston Technology Company, Inc.17600 Newhope Street Fountain Valley, CA 92708 USA"),
		new Adress("1-47 Ochiai, Tama-shi, Tokyo 206-8530, Japan"),
		new Adress("2200 Mission College Blvd.Santa Clara, CA 95054-1549 USA"),
		new Adress("1 Commerce Valley Dr. East Markham, ON L3T 7X6 Canada")));
		adressRep.save(listAdress);
//		
		SiteRepository siteRep =(SiteRepository) context.getBean("siteRepository");
		List<Site> listSite = new LinkedList<>(Arrays.asList(
		new Site("http://www.asus.com/support/Service-Center/USA"),
		new Site("http://www.hitachi.co.jp/"),
		new Site("http://www.goodram.com/company/"),
		new Site("http://www.lgcorp.com/"),
		new Site("http://wdc.com/en/"),
		new Site("http://www.philips.eu/"),
		new Site("http://www.kingston.com/"),
		new Site("http://www.teac.co.jp/"),
		new Site("www.intel.com"),
		new Site("http://www.amd.com/"),
		new Site("http://www.asus.ru/support/Service-Center/USA"),
		new Site("http://www.hitachi.ua.jp/"),
		new Site("http://www.goodram.ua"),
		new Site("www.lg.com/ua"),
		new Site("http://wdc.com/ua/"),
		new Site("http://www.philips.ua/"),
		new Site("http://www.kingston.ua/"),
		new Site("http://www.teac.ua/"),
		new Site("www.intel.ru"),
		new Site("http://www.amd.ua/")));
		siteRep.save(listSite);
//		
		PhoneRepository phoneRep =(PhoneRepository) context.getBean("phoneRepository");
		List<Phone> listPhone = new LinkedList<>(Arrays.asList(
		new Phone("770-751-1177"),
		new Phone("770-751-1187"),
		new Phone("3888-111-5325"),
		new Phone("3988-111-5326"),
		new Phone("+81 3-3258-1111"),
		new Phone("+81 3-3258-1121"),
		new Phone("+48 32 736 90 00"),
		new Phone("+48 33 736 90 01"),
		new Phone("1 (800) 245-4932"),
		new Phone("1 (800) 275-4931"),
		new Phone("+8 52 700 45 00"),
		new Phone("+8 52 700 45 10"),
		new Phone("+1 (877) 546-4786"),
		new Phone("+1 (877) 546-4787"),
		new Phone("Tel: +81-42-356-9100"),
		new Phone("Fax:+81-42-356-9105"),
		new Phone("(408) 765-8080"),
		new Phone("(408) 765-8081"),
		new Phone("905-882-2601"),
		new Phone("905-882-2700")));
		phoneRep.save(listPhone);
		
		CountryRepository countryRep =(CountryRepository) context.getBean("countryRepository");
		List<Country> listCountry = new LinkedList<>(Arrays.asList(
		new Country("Netherlands"),
		new Country("China"),
		new Country("POland"),
		new Country("USA"),
		new Country("Italy"),
		new Country("Korea"),
		new Country("Japon"),
		new Country("Canada"),
		new Country("Russia")));
		countryRep.save(listCountry);
//		
		CategoryRepository categoryRep =(CategoryRepository) context.getBean("categoryRepository");
		List<Category> listCategory = new LinkedList<>(Arrays.asList(
		new Category("HDD"),
		new Category("SDD"),
		new Category("ODD"),
		new Category("CPUs"),
		new Category("MotherBoards"),
		new Category("Memory_Modules"),
		new Category("Videocards"),
		new Category("Monitors"),
		new Category("SoundCards"),
		new Category("PowerSupply"),
		new Category("UPS"),
		new Category("Cases"),
		new Category("NetworkCards")));
		categoryRep.save(listCategory);
//		
//		categoryRep.exists(4);
//		categoryRep.equals(listCategory.get(4).getName());
//		
		NamedRepository namedRep =(NamedRepository) context.getBean("namedRepository");
		List<Named> listNamed = new LinkedList<>(Arrays.asList(
		new Named("Petro"),
		new Named("Ivan"),
		new Named("Kolya"),
		new Named("Ira"),
		new Named("Igor"),
		new Named("Vova"),
		new Named("Tereza"),
		new Named("Serh")));
		namedRep.save(listNamed);
		
		FamilyRepository familyRep =(FamilyRepository) context.getBean("familyRepository");
		List<Family> listFamily = new LinkedList<>(Arrays.asList(
		new Family("Ivanov"),
		new Family("Petrov"),
		new Family("Volkov"),
		new Family("Norton"),
		new Family("Rakhmanin"),
		new Family("Rybak"),
		new Family("Dubyk")));
		familyRep.save(listFamily);
		
//		familyRep.deleteAll();
//		familyRep.count();
//		familyRep.delete(8);
//familyRep.delete(new Family("Dubyk"));
		
		CustomerRepository customerRep =(CustomerRepository) context.getBean("customerRepository");
		Customer c1=new Customer("mail01@mail.ru","qwerty");
		c1.setNamed(namedRep.findOne(1));
		c1.setFamily(familyRep.findOne(2));
		c1.setSex(Sex.MALE);
		Customer c2=new Customer("","qwerty");
		c2.setNamed(namedRep.findOne(4));
		c2.setFamily(familyRep.findOne(5));
		c2.setSex(Sex.FEMALE);
		Customer admin=new Customer("sleshnfs@mail.ru","123456");
		admin.setNamed(namedRep.findOne(1));
		admin.setFamily(familyRep.findOne(5));
		admin.setSex(Sex.MALE);
		Customer c3=new Customer("wert@gmail.com","qwerty24");
		c3.setNamed(namedRep.findOne(7));
		c3.setFamily(familyRep.findOne(3));
		c3.setSex(Sex.FEMALE);
		Customer c4=new Customer("ubuntu@ukr.net","pass123");
		c4.setNamed(namedRep.findOne(8));
		c4.setFamily(familyRep.findOne(4));
		c4.setSex(Sex.MALE);
		List<Customer> lc=new LinkedList<>(
				Arrays.asList(c1,c2,c3,admin,c4));
		customerRep.save(lc);
		
		LocationRepository locationRep =(LocationRepository) context.getBean("locationRepository");
		Location l1=new Location();
		l1.setAdress(adressRep.findOne(1));
		l1.createListSite().add(siteRep.findOne(1));
		l1.getSites().add(siteRep.findOne(11));
		l1.createListPhone().add(phoneRep.findOne(1));
		l1.getPhones().add(phoneRep.findOne(2));
		l1.setCountry(countryRep.findOne(4));
		
		Location l2=new Location();
		l2.setAdress(adressRep.findOne(2));
		l2.createListPhone().add(phoneRep.findOne(3));
		l2.getPhones().add(phoneRep.findOne(4));
		l2.createListSite().add(siteRep.findOne(2));
		l2.getSites().add(siteRep.findOne(12));
		l2.setCountry(countryRep.findOne(6));
		
		Location l3=new Location();
		l3.setAdress(adressRep.findOne(3));
		l3.createListPhone().add(phoneRep.findOne(5));
		l3.getPhones().add(phoneRep.findOne(6));
		l3.createListSite().add(siteRep.findOne(3));
		l3.getSites().add(siteRep.findOne(13));
		l3.setCountry(countryRep.findOne(7));
		
		Location l4=new Location();
		l4.setAdress(adressRep.findOne(3));
		l4.createListPhone().add(phoneRep.findOne(5));
		l4.getPhones().add(phoneRep.findOne(6));
		l4.createListSite().add(siteRep.findOne(3));
		l4.getSites().add(siteRep.findOne(13));
		l4.setCountry(countryRep.findOne(7));
		
		Location l5=new Location();
		l5.setAdress(adressRep.findOne(5));
		l5.createListPhone().add(phoneRep.findOne(9));
		l5.getPhones().add(phoneRep.findOne(10));
		l5.createListSite().add(siteRep.findOne(5));
		l5.getSites().add(siteRep.findOne(15));
		l5.setCountry(countryRep.findOne(4));
		
		Location l6=new Location();
		l6.setAdress(adressRep.findOne(6));
		l6.createListPhone().add(phoneRep.findOne(11));
		l6.getPhones().add(phoneRep.findOne(12));
		l6.createListSite().add(siteRep.findOne(6));
		l6.getSites().add(siteRep.findOne(16));
		l6.setCountry(countryRep.findOne(1));
		
		Location l7=new Location();
		l7.setAdress(adressRep.findOne(7));
		l7.createListPhone().add(phoneRep.findOne(13));
		l7.getPhones().add(phoneRep.findOne(14));
		l7.createListSite().add(siteRep.findOne(7));
		l7.getSites().add(siteRep.findOne(17));
		l7.setCountry(countryRep.findOne(4));
		
		Location l8=new Location();
		l8.setAdress(adressRep.findOne(8));
		l8.createListPhone().add(phoneRep.findOne(15));
		l8.getPhones().add(phoneRep.findOne(16));
		l8.createListSite().add(siteRep.findOne(8));
		l8.getSites().add(siteRep.findOne(18));
		l8.setCountry(countryRep.findOne(7));
				
		Location l9=new Location();
		l9.setAdress(adressRep.findOne(9));
		l9.createListPhone().add(phoneRep.findOne(18));
		l9.getPhones().add(phoneRep.findOne(17));
		l9.createListSite().add(siteRep.findOne(9));
		l9.getSites().add(siteRep.findOne(19));
		l9.setCountry(countryRep.findOne(4));
		
		Location l10=new Location();
		l10.setAdress(adressRep.findOne(10));
		l10.createListPhone().add(phoneRep.findOne(19));
		l10.getPhones().add(phoneRep.findOne(20));
		l10.createListSite().add(siteRep.findOne(10));
		l10.getSites().add(siteRep.findOne(20));
		l10.setCountry(countryRep.findOne(8));
		
		List<Location> loc=new LinkedList<>(
				Arrays.asList(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10));
		locationRep.save(loc);
		
		ManufacturerRepository manufacturerRep =(ManufacturerRepository) context.getBean("manufacturerRepository");
		Manufacturer m1=new Manufacturer("asus");
		m1.setLocations(new LinkedList<>());
		m1.getLocations().add(locationRep.findOne(1));
		m1.getLocations().add(locationRep.findOne(2));
	
		Manufacturer m2=new Manufacturer("Hitachi");
		m2.setLocations(new LinkedList<>());
		m2.getLocations().add(locationRep.findOne(3));
		m2.getLocations().add(locationRep.findOne(6));
				
		Manufacturer m3=new Manufacturer("GOODRAM");
		m3.setLocations(new LinkedList<>());
		m3.getLocations().add(locationRep.findOne(4));
		m3.getLocations().add(locationRep.findOne(1));
			
		Manufacturer m4=new Manufacturer("LG");
		m4.setLocations(new LinkedList<>());
		m4.getLocations().add(locationRep.findOne(2));
		m4.getLocations().add(locationRep.findOne(9));
		
		Manufacturer m5=new Manufacturer("Phillips");
		m5.setLocations(new LinkedList<>());
		m5.getLocations().add(locationRep.findOne(6));
		m5.getLocations().add(locationRep.findOne(1));
	
		Manufacturer m6=new Manufacturer("Western Digital");
		m6.setLocations(new LinkedList<>());
		m6.getLocations().add(locationRep.findOne(5));
		m6.getLocations().add(locationRep.findOne(8));
	
		Manufacturer m7=new Manufacturer("Kingston");
		m7.setLocations(new LinkedList<>());
		m7.getLocations().add(locationRep.findOne(7));
		m7.getLocations().add(locationRep.findOne(3));
		
		Manufacturer m8=new Manufacturer("teac");
		m8.setLocations(new LinkedList<>());
		m8.getLocations().add(locationRep.findOne(8));
		m8.getLocations().add(locationRep.findOne(2));
		
		Manufacturer m9=new Manufacturer("INTEL");
		m9.setLocations(new LinkedList<>());
		m9.getLocations().add(locationRep.findOne(9));
		m9.getLocations().add(locationRep.findOne(1));
			
		Manufacturer m10=new Manufacturer("AMD");
		m10.setLocations(new LinkedList<>());
		m10.getLocations().add(locationRep.findOne(10));
		m10.getLocations().add(locationRep.findOne(5));
		List<Manufacturer> mlist=new LinkedList<>(
				Arrays.asList(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10));
		manufacturerRep.save(mlist);
		
		TovarRepository tovarRep =(TovarRepository) context.getBean("tovarRepository");
		Tovar t1=new Tovar("WD10EZEX",1489.50,16);
		t1.setDetail("HDD 1000GB WD - this device established according to the standarts of quality");
		t1.setCategory(categoryRep.findOne(1));
		t1.setManufacturer(manufacturerRep.findOne(6));
	
		Tovar t2=new Tovar("0A38028 / HDE721010SLA330",1318,15);
		t2.setDetail("The Deskstar E7K1000 hard drive provides an exceptional blend of power efficiency and "
				+ "performance making it an ideal solution for power-conscious enterprises");
		t2.setCategory(categoryRep.findOne(1));
		t2.setManufacturer(manufacturerRep.findOne(2));
		
		Tovar t3=new Tovar("SSDPR-CX100-120",1414,13);  		//for detail treba column (size napysaty)
		t3.setDetail("GOODRAM CX100 is equipped with Toshiba A19 NAND flash and the new controller Phison PS3110-S10"
				+ " and it provides the highest level of performance.");
		t3.setCategory(categoryRep.findOne(2));
		t3.setManufacturer(manufacturerRep.findOne(3));
		
		Tovar t4=new Tovar("SV300S37A/120G",1407,18);  		
		t4.setDetail("SSDNow V300 features an LSI SandForce controller customized for Kingston "
				+ "and optimized for next-generation Flash memory to deliver the utmost in quality "
				+ "and reliability from two leading SSD brands");
		t4.setCategory(categoryRep.findOne(2));
		t4.setManufacturer(manufacturerRep.findOne(7));
			
		Tovar t5=new Tovar("BD-W512GSA",2005,18);  		
		t5.setDetail("ODD Blu-Ray/HD-DVD Teac BD-W512GSA - a worthy representative of his lineup.");
		t5.setCategory(categoryRep.findOne(3));
		t5.setManufacturer(manufacturerRep.findOne(8));
		
		Tovar t6=new Tovar("BW-12D1S-U/BLK/G/AS",3936,14);  		
		t6.setDetail("Blu-Ray/HD-DVD ASUS - functional and stylish optical device, which is with high level "
				+ "of recording speed Blu-Ray discs");
		t6.setCategory(categoryRep.findOne(3));
		t6.setManufacturer(manufacturerRep.findOne(1));
		
		Tovar t7=new Tovar("223V5LSB2/10",2786,13);  		
		t7.setDetail("Monitor PHILIPS 243V5LSB/00-its amazing quality of LED image and vivid color reproduction");
		t7.setCategory(categoryRep.findOne(8));
		t7.setManufacturer(manufacturerRep.findOne(5));
		
		Tovar t8=new Tovar("29UC97C-B",12059,14);  		
		t8.setDetail("Monitor LG 29UC97C-B is created for gamers, and for those who proffesionall works with "
				+ "multimedia content");
		t8.setCategory(categoryRep.findOne(8));
		t8.setManufacturer(manufacturerRep.findOne(4));
		
		Tovar t9=new Tovar("VS239NV",4519,18);  		
		t9.setDetail("Monitor Asus VS239NV is designed in elegant classic case and features high quality of IPS-matrix"
				+ "and wide angles of view and support Full HD resolution.");
		t9.setCategory(categoryRep.findOne(8));
		t9.setManufacturer(manufacturerRep.findOne(1));
		
		Tovar t10=new Tovar("BX80646I54460",4928,31);  		
		t10.setDetail("CPU Intel Core i5-4460 is realized on new architecture Haswell Refresh.");
		t10.setCategory(categoryRep.findOne(4));
		t10.setManufacturer(manufacturerRep.findOne(9));
		
		Tovar t11=new Tovar("FD6300WMHKBOX",2842,51);  		
		t11.setDetail("AMD FX-6300 its new cpu,which is built on microarchitecture Piledriver"
				+ " and made on 32 nm techprocese.");
		t11.setCategory(categoryRep.findOne(4));
		t11.setManufacturer(manufacturerRep.findOne(10));
		List<Tovar> lot=new LinkedList<>(Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11));
		tovarRep.save(lot);
		
		TovarAmountRepository tovarAmountRep=(TovarAmountRepository) context.getBean("tovarAmountRepository");
		TovarAmount ta1=new TovarAmount(5);
		ta1.setTovar(tovarRep.findOne(1));
		
		TovarAmount ta2=new TovarAmount(2);
		ta2.setTovar(tovarRep.findOne(2));
		
		TovarAmount ta3=new TovarAmount(1);
		ta3.setTovar(tovarRep.findOne(3));
		
		TovarAmount ta4=new TovarAmount(2);
		ta4.setTovar(tovarRep.findOne(4));
		
		TovarAmount ta5=new TovarAmount(3);
		ta5.setTovar(tovarRep.findOne(5));
		
		TovarAmount ta6=new TovarAmount(4);
		ta6.setTovar(tovarRep.findOne(6));
		
		TovarAmount ta7=new TovarAmount(2);
		ta7.setTovar(tovarRep.findOne(7));
		
		TovarAmount ta8=new TovarAmount(1);
		ta8.setTovar(tovarRep.findOne(8));
		
		TovarAmount ta9=new TovarAmount(1);
		ta9.setTovar(tovarRep.findOne(9));
		
		TovarAmount ta10=new TovarAmount(2);
		ta10.setTovar(tovarRep.findOne(10));
		
		TovarAmount ta11=new TovarAmount(1);
		ta11.setTovar(tovarRep.findOne(11));
		List<TovarAmount> talist=new LinkedList<>(Arrays.asList(ta1,ta2,ta3,ta4,ta5,ta6,
				ta7,ta8,ta9,ta10,ta11));
		tovarAmountRep.save(talist);
		
		BuyRepository buyRep= (BuyRepository) context.getBean("buyRepository");
		Buy b1=new Buy("26-02-2016");
		b1.setCustomer(customerRep.findOne(1));
		b1.setTovarAmounts(new LinkedList<TovarAmount>());
		b1.getTovarAmounts().add(tovarAmountRep.findOne(10));
		b1.getTovarAmounts().add(tovarAmountRep.findOne(2));
		b1.getTovarAmounts().add(tovarAmountRep.findOne(5));
		
		Buy b2=new Buy("25-02-2016");
		b2.setCustomer(customerRep.findOne(2));
		b2.setTovarAmounts(new LinkedList<TovarAmount>());
		b2.getTovarAmounts().add(tovarAmountRep.findOne(7));
		b2.getTovarAmounts().add(tovarAmountRep.findOne(2));
		b2.getTovarAmounts().add(tovarAmountRep.findOne(1));
	
		Buy b3=new Buy("24-02-2016");
		b3.setCustomer(customerRep.findOne(3));
		b3.setTovarAmounts(new LinkedList<TovarAmount>());
		b3.getTovarAmounts().add(tovarAmountRep.findOne(1));
		b3.getTovarAmounts().add(tovarAmountRep.findOne(11));
		b3.getTovarAmounts().add(tovarAmountRep.findOne(3));
		
		Buy b4=new Buy("22-02-2016");
		b4.setCustomer(customerRep.findOne(4));
		b4.setTovarAmounts(new LinkedList<TovarAmount>());
		b4.getTovarAmounts().add(tovarAmountRep.findOne(2));
		b4.getTovarAmounts().add(tovarAmountRep.findOne(6));
		b4.getTovarAmounts().add(tovarAmountRep.findOne(8));
		
		List<Buy> bl=new LinkedList<>(Arrays.asList(b1,b2,b3,b4));
		buyRep.save(bl);
	
//		Iterable<Adress> al=ar.findAll();
//		for (Adress adress : al) {
//			System.out.println(adress);
//		}
//		ac.setName("adress 1");
//		ac.save(c);
		
		context.close();
	}

}

