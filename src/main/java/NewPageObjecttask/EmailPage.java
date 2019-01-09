package NewPageObjecttask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPage extends Utils {
    By objProductclick = By.xpath("//img[@alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]");
   By objEmailfriend=By.xpath("//input[@value=\"Email a friend\"]");
   By objEmailaddress=By.id("FriendEmail");
   By objPersonalmessage=By.id("PersonalMessage");
   By objSendemail=By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");


    public EmailPage(WebDriver driver) {

    }


    public void productclick() {
        select_element(objProductclick); }
        public void emailfriend(){
        select_element(objEmailfriend); }
        public void emailaddress(){
        enter_text(objEmailaddress, "das123"+dateStamp()+"@gmail.com"); }
        public void personalmessage(){
        enter_text(objPersonalmessage,"this is good product"); }
        public void sendemailbutton(){
        select_element(objSendemail);
        }
}

