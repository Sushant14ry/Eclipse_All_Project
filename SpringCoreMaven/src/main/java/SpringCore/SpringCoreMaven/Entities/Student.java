package SpringCore.SpringCoreMaven.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="student_id")
	private int id;
	@Column(name="student_name")
	private String name;
	@Column(name="student_city")
	private String city;
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Student() {
		
	}
	
	
	
}
