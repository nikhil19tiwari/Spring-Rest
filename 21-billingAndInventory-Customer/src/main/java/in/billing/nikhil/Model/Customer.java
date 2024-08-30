package in.billing.nikhil.Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customer_Id;
	@Column(name = "name")
	private String  customer_Name;
	@Column(name ="city")
	private String  city;
	@Column(name ="phone")
	private long  phone_No;
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone_No() {
		return phone_No;
	}
	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}
	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", city=" + city
				+ ", phone_No=" + phone_No + "]";
	}
	public Customer(Integer customer_Id, String customer_Name, String city, long phone_No) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Name = customer_Name;
		this.city = city;
		this.phone_No = phone_No;
	}
	

}
