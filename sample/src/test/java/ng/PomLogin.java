package ng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomLogin {

	@FindBy(id="txtUsername")
	public static WebElement username;
	
	@FindBy(id="txtPassword")
	public static WebElement password;
	
	@FindBy(id="btnLogin")
	public static WebElement login;
	
   @FindBy(id="menu_admin_viewAdminModule")
	public static WebElement admin;
   
   @FindBy(id="menu_admin_UserManagement")
	public static WebElement menu;
	
   @FindBy(xpath="//*[@id=\"menu_admin_viewSystemUsers\"]")
   public static WebElement users;
	
	
	


}
