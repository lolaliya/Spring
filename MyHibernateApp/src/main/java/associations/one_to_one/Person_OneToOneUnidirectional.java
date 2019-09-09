package associations.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person_one_to_one")
public class Person_OneToOneUnidirectional {

	@Id @Column(name="person_id")
	private int id;

	private String name;

	private int age;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addr_id", referencedColumnName="addrs_id")
	private Address1 address;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}

}