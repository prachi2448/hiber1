package PracticeHiber.com.pack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
	private int empid;
	private String empname;
	private String position;
	private String city;
	private Trainig tre;
	
	public int getEmpid() {
		return empid;
	}
	public Trainig getTre() {
		return tre;
	}
	public void setTre(Trainig tre) {
		this.tre = tre;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public employee(int empid, String empname, String position, String city) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.position = position;
		this.city = city;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
