package com.StudentDao;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.SpringORMHb.entites.Animal;
import com.SpringOrmfirst.Student;



public class StudentDao {
 
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	 
	 
	 
		@Transactional
		public  int insert(Student st) {
			Integer i = (Integer) this.hibernateTemplate.save(st);

			System.out.println("inserted Succsesfully " + i);

			return i; 
			
		
		 }
		@Transactional
		public int update1 (Student o) {
			 
		 StudentDao studentDao = this;
		studentDao.hibernateTemplate.update(o);
		System.out.println("updated succsessfully");
			return 1;
		}
	 
		@Transactional
		public Student getAnimal(int id) {
			

			Student student = this.hibernateTemplate.get(Student.class, id);
			System.out.println(student);
			return student;

		}
		public List<Student> getAllAnimal() {

			List<Student> loadAll = this.hibernateTemplate.loadAll(Student.class);

			System.out.println(loadAll);
			return loadAll;

		}




     
	
}
