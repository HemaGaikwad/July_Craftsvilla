package com.craftsvilla.pompage;

import org.apache.bcel.verifier.VerificationResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class CraftsVillaBrandsPage extends BasePage
{
	
	@FindBy(linkText = "Craftsvilla Partywear Sarees")
	private WebElement cvPartywearSarees;
	
	@FindBy(linkText = "Craftsvilla Designer Suits ")
	private WebElement cvDesignerSuits;
	
	@FindBy(linkText = "Craftsvilla Anarkalis")
	private WebElement cvAnarkalis;

	public CraftsVillaBrandsPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnPartyWearSarees()
	{
		verifyElementPresent(cvPartywearSarees);
		cvPartywearSarees.click();
		
	}
	
	public void clickOnAnarkalis()
	{
		verifyElementPresent(cvAnarkalis);
		cvAnarkalis.click();
		
	}
	
	
	public void clickOnDesignerSuits()
	{
		verifyElementPresent(cvDesignerSuits);
		cvDesignerSuits.click();
		
	}
}
