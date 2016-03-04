package com.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

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
		
//		Adress ac =new Adress("1925 Grassland Pkwy Alpharetta GA 30004 (1085.9km)");
//		adressRep.save(ac);
//		List<Adress> listAdress = new ArrayList<>(Arrays.asList(
//		new Adress("LG Twin Towers, 20 Yeouido-dong, Youngdeungpo-gu, Seoul"),
//		new Adress("13F Marunouchi Center Building 6-1, Marunouchi, Chiyoda-ku, Tokyo"),
//		new Adress("Wilk Elektronik SA Mikolowska 42 43-173 Laziska Gorne"),
//		new Adress("3355 Michelson Drive, Suite 100 Irvine, California"),
//		new Adress("Royal Philips Amstelplein 2 Philips Center, Breitner Tower P.O. Box 77900 1070 MX Amsterdam"),
//		new Adress("Kingston Technology Company, Inc.17600 Newhope Street Fountain Valley, CA 92708 USA"),
//		new Adress("1-47 Ochiai, Tama-shi, Tokyo 206-8530, Japan"),
//		new Adress("2200 Mission College Blvd.Santa Clara, CA 95054-1549 USA"),
//		new Adress("1 Commerce Valley Dr. East Markham, ON L3T 7X6 Canada")));
//		adressRep.save(listAdress);
//		
		SiteRepository siteRep =(SiteRepository) context.getBean("siteRepository");
//		List<Site> listSite = new ArrayList<>(Arrays.asList(
//		new Site("http://www.asus.com/support/Service-Center/USA"),
//		new Site("http://www.hitachi.co.jp/"),
//		new Site("http://www.goodram.com/company/"),
//		new Site("http://www.lgcorp.com/"),
//		new Site("http://wdc.com/en/"),
//		new Site("http://www.philips.eu/"),
//		new Site("http://www.kingston.com/"),
//		new Site("http://www.teac.co.jp/"),
//		new Site("www.intel.com"),
//		new Site("http://www.amd.com/"),
//		new Site("http://www.asus.ru/support/Service-Center/USA"),
//		new Site("http://www.hitachi.ua.jp/"),
//		new Site("http://www.goodram.ua"),
//		new Site("www.lg.com/ua"),
//		new Site("http://wdc.com/ua/"),
//		new Site("http://www.philips.ua/"),
//		new Site("http://www.kingston.ua/"),
//		new Site("http://www.teac.ua/"),
//		new Site("www.intel.ru"),
//		new Site("http://www.amd.ua/")));
//		siteRep.save(listSite);
//		
		PhoneRepository phoneRep =(PhoneRepository) context.getBean("phoneRepository");
//		List<Phone> listPhone = new ArrayList<>(Arrays.asList(
//		new Phone("770-751-1177"),
//		new Phone("770-751-1187"),
//		new Phone("3888-111-5325"),
//		new Phone("3988-111-5326"),
//		new Phone("+81 3-3258-1111"),
//		new Phone("+81 3-3258-1121"),
//		new Phone("+48 32 736 90 00"),
//		new Phone("+48 33 736 90 01"),
//		new Phone("1 (800) 245-4932"),
//		new Phone("1 (800) 275-4931"),
//		new Phone("+8 52 700 45 00"),
//		new Phone("+8 52 700 45 10"),
//		new Phone("+1 (877) 546-4786"),
//		new Phone("+1 (877) 546-4787"),
//		new Phone("Tel: +81-42-356-9100"),
//		new Phone("Fax:+81-42-356-9105"),
//		new Phone("(408) 765-8080"),
//		new Phone("(408) 765-8081"),
//		new Phone("905-882-2601"),
//		new Phone("905-882-2700")));
//		phoneRep.save(listPhone);
//		
//		
		CountryRepository countryRep =(CountryRepository) context.getBean("countryRepository");
//		List<Country> listCountry = new ArrayList<>(Arrays.asList(
//		new Country("Netherlands"),
//		new Country("China"),
//		new Country("POland"),
//		new Country("USA"),
//		new Country("Italy"),
//		new Country("Korea"),
//		new Country("Japon"),
//		new Country("Canada"),
//		new Country("Russia")));
//		countryRep.save(listCountry);
//		
		CategoryRepository categoryRep =(CategoryRepository) context.getBean("categoryRepository");
//		List<Category> listCategory = new ArrayList<>(Arrays.asList(
//		new Category("HDD"),
//		new Category("SDD"),
//		new Category("ODD"),
//		new Category("CPUs"),
//		new Category("MotherBoards"),
//		new Category("Memory_Modules"),
//		new Category("Videocards"),
//		new Category("Monitors"),
//		new Category("SoundCards"),
//		new Category("PowerSupply"),
//		new Category("UPS"),
//		new Category("Cases"),
//		new Category("NetworkCards")));
//		categoryRep.save(listCategory);
//		
//		categoryRep.exists(4);
//		categoryRep.equals(listCategory.get(4).getName());
//		
//		
		NamedRepository namedRep =(NamedRepository) context.getBean("namedRepository");
//		List<Named> listNamed = new ArrayList<>(Arrays.asList(
//		new Named("Petro"),
//		new Named("Ivan"),
//		new Named("Kolya"),
//		new Named("Ira"),
//		new Named("Igor"),
//		new Named("Vova"),
//		new Named("Tereza"),
//		new Named("Serh")));
//		namedRep.save(listNamed);
		
		FamilyRepository familyRep =(FamilyRepository) context.getBean("familyRepository");
//		List<Family> listFamily = new ArrayList<>(Arrays.asList(
//		new Family("Ivanov"),
//		new Family("Petrov"),
//		new Family("Volkov"),
//		new Family("Norton"),
//		new Family("Rakhmanin"),
//		new Family("Rybak"),
//		new Family("Dubyk")));
//		familyRep.save(listFamily);
		
//		familyRep.deleteAll();
//		familyRep.count();
//		familyRep.delete(8);
		
		familyRep.delete(new Family("Dubyk"));
		
		CustomerRepository customerRep =(CustomerRepository) context.getBean("customerRepository");
//		Customer c1=new Customer("mail01@mail.ru","qwerty");
//		c1.setNamed(namedRep.findOne(1));
//		c1.setFamily(familyRep.findOne(2));
//		c1.setSex(Sex.MALE);
//		Customer c2=new Customer("","qwerty");
//		c2.setNamed(namedRep.findOne(4));
//		c2.setFamily(familyRep.findOne(5));
//		c2.setSex(Sex.FEMALE);
//		Customer admin=new Customer("sleshnfs@mail.ru","123456");
//		admin.setNamed(namedRep.findOne(1));
//		admin.setFamily(familyRep.findOne(5));
//		admin.setSex(Sex.MALE);
//		Customer c3=new Customer("wert@gmail.com","qwerty24");
//		c3.setNamed(namedRep.findOne(7));
//		c3.setFamily(familyRep.findOne(3));
//		c3.setSex(Sex.FEMALE);
//		Customer c4=new Customer("ubuntu@ukr.net","pass123");
//		c4.setNamed(namedRep.findOne(8));
//		c4.setFamily(familyRep.findOne(4));
//		c4.setSex(Sex.MALE);
//		List<Customer> lc=new LinkedList<>(
//				Arrays.asList(c1,c2,c3,admin,c4));
//		customerRep.save(lc);
		
		
		
		
		
		
//		Iterable<Adress> al=ar.findAll();
//		for (Adress adress : al) {
//			System.out.println(adress);
//		}
//		ac.setName("adress 1");
//		ac.save(c);
	}

}

