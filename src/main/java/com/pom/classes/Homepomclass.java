package com.pom.classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepomclass {
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement Menu;
	public void menubutton()
	{
		Menu.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement Logout;
	public void logoutbtn()
	{
		Logout.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement Addtocart;
	public void addtocartbtn()
	{
		Addtocart.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> Alladdtocat;
	
	public void allproductaddtocart()
	{
		for (WebElement element : Alladdtocat) 
		{
		    element.click();
		}
	}
	
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement addToCart;
    public String gettextfromaddtocat()
	{
		String totalproducts=addToCart.getText();
		return totalproducts;
	}
    
    
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	public void clickdropodownfilter()
	{
		
		Select s= new Select(dropdown);
		s.selectByVisibleText("Price (low to high)");
	
			
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement textdropdown;
	public String getdropdowntext()
	{
		
		Select s= new Select(textdropdown);
		WebElement selectoption = s.getFirstSelectedOption();
	   return selectoption.getText();
		
	}
	
	
	
	
	
	public Homepomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
