package SpringCore.SpringCoreMaven.Dao;

import java.io.Serializable;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import SpringCore.SpringCoreMaven.Entities.Student;

public class Student_Dao {
	private HibernateTemplate hibernate_template;
	
	// Save Student Method
	@Transactional
	public int insert(Student students) {
		// Insert Operation 
		Integer save = (Integer) this.hibernate_template.save(students);
		return save;
	}

	public HibernateTemplate getHibernate_template() {
		return hibernate_template;
	}

	public void setHibernate_template(HibernateTemplate hibernate_template) {
		this.hibernate_template = hibernate_template;
	} 
	
	
}
