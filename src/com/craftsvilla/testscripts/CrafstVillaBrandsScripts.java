package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompage.CartPage;
import com.craftsvilla.pompage.CraftsVillaBrandsPage;
import com.craftsvilla.pompage.CraftsVillaPartySareesPage;
import com.craftsvilla.pompage.HomePage;
import com.craftsvilla.pompage.ProductDescription;

public class CrafstVillaBrandsScripts extends BaseTest
{
	
	public HomePage hp = null;
	public CraftsVillaBrandsPage bp = null;
	public CraftsVillaPartySareesPage sp = null;
	public ProductDescription pd = null;
	public CartPage cp = null;
	
	
	@Test
	public void TC_01_buyCraftsVillaOrangeSaree()
	{
		hp = new HomePage(driver);
		bp = new CraftsVillaBrandsPage(driver);
		sp = new CraftsVillaPartySareesPage(driver);
		pd = new ProductDescription(driver);
		cp = new CartPage(driver);
		
		
		hp.gotoSarees();
		bp.clickOnPartyWearSarees();
		sp.clickOnProduct1495231684();
		pd.clickOnBuyNow();
		cp.setEmail("abc@gmail.com");
		cp.setFirstName("abc");
	}

}
