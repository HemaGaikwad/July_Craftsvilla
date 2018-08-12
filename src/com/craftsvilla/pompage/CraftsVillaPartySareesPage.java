package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class CraftsVillaPartySareesPage  extends BasePage
{
	@FindBy(xpath ="//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-35632-MCRAF53895038860-1510327541-Craftsvilla_1.jpg']")
	private WebElement product1510327541;
	
	
	@FindBy(xpath = "https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-35646-MCRAF88284804670-1495231684-Craftsvilla_1.jpg")
	private WebElement product1495231684;
	
	
	
	public CraftsVillaPartySareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProduct1510327541()
	{
		verifyElementPresent(product1510327541);
		product1510327541.click();
	}
	
	public void clickOnProduct1495231684()
	{
		verifyElementPresent(product1495231684);
		product1495231684.click();
	}
}
