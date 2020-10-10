package PAGEOBJECTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HOMEPAGE 
{

	public WebDriver myD;
	
	public HOMEPAGE(WebDriver myD)
	{
		this.myD=myD;
	}
	
	By GoogleSearch=By.name("q");
	By GoogleSubmit=By.name("btnK");
	
	public WebElement getGoogleSearch()
	{
		return myD.findElement(GoogleSearch);
	}
	
	public WebElement getGoogleSubmit()
	{
		return myD.findElement(GoogleSubmit);
	}
}
