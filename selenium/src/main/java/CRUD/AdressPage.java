package CRUD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdressPage {
	
	private By firstName = By.id("address_first_name");
	private By lastName = By.id("address_last_name");
	private By address1 = By.id("address_street_address");
	private By city = By.id("address_city");
	private By zipCode = By.id("address_zip_code");
	private By newAddressLink = By.linkText("New Address");
	private By createAddress = By.name("commit");
	private By successMessage = By.cssSelector("div.alert.alert-notice");
	private By firstNameValue = By.xpath("//span[@data-test='first_name']");
	
	public AddressPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAddressLink() {
		driver.findElement(newAddressLink).click();
	} 
	
	public void fillAddressForm(Adddress address) {
		driver.findElement(firstName).sendKeys(address.getFirstName());
		driver.findElement(lastName).sendKeys(address.getLastName());
		driver.findElement(address1).sendKeys(address.getAddress1());
		driver.findElement(city).sendKeys(address.getCity());
		driver.findElement(zipCode).sendKeys(address.getZipCode());
		driver.findElement(createAddress).click();
		return driver.findElement(successMessage).getText();
	}
	
	
	public void addAddress(Address address) {
		clickAddressLink();
		return fillAddressForm(address);	
	}
	
	public void updateAddress(Address address, String firstName) {
		clickAddressLink();
		driver.findElement(By.xpath("//td[text()='"+firstName+"']//following-sibling::td/a[text()='Edit']")).click();
		return fillAddressForm();
	}
	
	public void deleteAddress(String firstName) {
		clickAddressLink();
		driver.findElement(By.xpath("//td[text()='"+firstName+"']//following-sibling::td/a[text()='Destroy']")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertsIsPresent()).accept();
		return driver.findElement(successMessage).getText();
	}
	
	public String getAddress(String firstName) {
		clickAddressLink();
		driver.findElement(By.xpath("//td[text()='"+firstName+"']//following-sibling::td/a[text()='Show']")).click();
		return driver.findElement(firstNameValue).getText();
	}
}
