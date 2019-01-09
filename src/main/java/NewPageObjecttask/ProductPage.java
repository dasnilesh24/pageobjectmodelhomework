package NewPageObjecttask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends Utils {
    By objProductclick = By.xpath("//img[@alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]");
    By objEmailfriend=By.xpath("//input[@value=\"Email a friend\"]");
    By objEmailaddress=By.id("FriendEmail");
    By objYourEmailaAddress=By.id("YourEmailAddress");
    By objPersonalmessage=By.id("PersonalMessage");
    By objSendemail=By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");


    public ProductPage(WebDriver driver) {

    }


    public void productclick() {
        select_element(objProductclick); }
    public void emailfriend(){
        select_element(objEmailfriend); }
    public void emailaddress(){
        enter_text(objEmailaddress, "das123"+dateStamp()+"@gmail.com"); }
        public void youremailaddress(){
        enter_text(objYourEmailaAddress,"dasabc"+dateStamp()+"@gmail.com");
        }
    public void personalmessage(){
        enter_text(objPersonalmessage,"this is good product"); }
    public void sendemailbutton(){
        select_element(objSendemail);
    }
}
// public void unregister_user_shouldnot_able_to_send_email() {
//        //click on item
//        select_element(By.xpath("//img[@alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]"));
//        DateFormat dt = new SimpleDateFormat("MMddYYHHMMSS");
//        Date date = new Date();
//        String date1 = dt.format(date);
//        //click on email
//        select_element(By.xpath("//input[@value=\"Email a friend\"]"));
//        enter_text(By.id("FriendEmail"), "das123" + date1 + "@gmail.com");
//        //enter my email address
//        enter_text(By.id("YourEmailAddress"), "dasabc" + date1 + "@gmail.com");
//        //enter comment
//        enter_text(By.id("PersonalMessage"), "this is very good phone");
//        select_element(By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]"));
//        String acutalemailmessage = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
//        System.out.println("actualemailmessage");
//        String expectedresult = "Only registered customers can use email a friend feature";
//        Assert.assertEquals("test case failed", acutalemailmessage, expectedresult);