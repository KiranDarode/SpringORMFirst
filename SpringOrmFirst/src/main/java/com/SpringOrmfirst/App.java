package com.SpringOrmfirst;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.StudentDao.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		StudentDao stdio = (StudentDao) context.getBean("StudentDao");

		Student st = new Student(1, "kiran", "darode", "pune");
		Scanner sc = new Scanner(System.in);
		
		Student s2=new Student(9,"deva","rama","nagar");
	
		//stdio.update1(s2);
		//stdio.getAnimal(9);
	//	 stdio.insert(st);
		//stdio.getAllAnimal();

	}
}
