package NewPageObjecttask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationPage extends Utils {
    By objRegister =By.className("ico-register") ;
    By objGender= By.className("forcheckbox");
    By objFirstname=By.id("FirstName");
    By objLastname=By.id("LastName");
    By objBirthday=By.xpath("//select[@name=\"DateOfBirthDay\"]");
    By objbirthmonth=By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    By objBirthyear=By.xpath("//select[@name=\"DateOfBirthYear\"]");
    By objEmail=By.id("Email");
    By objCompanyname=By.id("Company");
    By objNewsletter=By.xpath("//input[@id=\"Newsletter\"]");
    By objPassword=By.id("Password");
    By objConfirmpassword=By.id("ConfirmPassword");
    By objRegisterbutton=By.id("register-button");
    By objEntercontinue=By.xpath("//input[@name=\"register-continue\"]");

    public RegistrationPage(WebDriver driver) {

    }


    public void register(){
        select_element(objRegister);
    }
    public void gender(){
        select_element(objGender);


    }
        public void firstname(){enter_text(objFirstname,"Nilesh");
        }
        public void lastname(){
        enter_text(objLastname,"Patel");
        }
        public void birthday(){
        selectByIndex(objBirthday,8);
        }
        public void birthmonth(){
        selectbyVisibleText(objbirthmonth,"January");
        }
        public void birthyear(){
        selectByValue(objBirthyear,"1992");
        }
        public void email(){
        enter_text(objEmail,"dasabc"+ dateStamp()+"@gamail.com");
        }
        public void companyname(){
        enter_text(objCompanyname,"east india");
        }
        public void newsletter(){
        select_element(objNewsletter);
        }
        public void password(){
        enter_text(objPassword,"das123");
        }
        public void confirmpassword(){
        enter_text(objConfirmpassword,"das123");
        }
        public void registerbutton(){
        select_element(objRegisterbutton); }
        public void entercontinue(){
        select_element(objEntercontinue);


    }



    }

