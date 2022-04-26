
package org.greenscart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\GreensCart\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement txtEmail = driver.findElement(By.id("loginEmailId"));
		txtEmail.sendKeys("sundargeee.gaja@gmail.com");
		WebElement txtPass = driver.findElement(By.id("loginPassword"));
		txtPass.sendKeys("Sundarp1103053@");
		WebElement btnLogin = driver.findElement(By.xpath("//input[contains(@class,'btnRegister form-control')]"));
		btnLogin.click();
		Thread.sleep(3000);
		WebElement txtSearch = driver.findElement(By.id("typeahead-basic"));
		txtSearch.sendKeys("Apple iPhone 12 Pro Max");
		Thread.sleep(1000);
		WebElement btnSearch = driver.findElement(By.xpath("//button[contains(@class,'btn btn-outline-secondary')]"));
		btnSearch.click();
		WebElement btnView = driver.findElement(By.xpath("//img[contains(@class,'card-img-top')]"));
		btnView.click();
		Thread.sleep(500);
		WebElement btnBuyNow = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		btnBuyNow.click();
		WebElement btnSelectGiftCode = driver.findElement(By.xpath("//button[contains(@class,'btn btn-block btn-outline-primary btn-lg')]"));
		btnSelectGiftCode.click();
		Thread.sleep(1000);
		WebElement btnAddGiftCode = driver.findElement(By.xpath("//span[text()='GRN10']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(btnAddGiftCode).perform();
	}
}
