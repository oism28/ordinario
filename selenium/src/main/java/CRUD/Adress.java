package CRUD;

public class Adress {

	private String firstName;
	private String lastName;
	private String adress1;
	private String city;
	private String zipcode;
	public Adress(String firstName, String lastName, String adress1, String city, String zipcode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress1 = adress1;
		this.city = city;
		this.zipcode = zipcode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdress1() {
		return adress1;
	}
	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
}
