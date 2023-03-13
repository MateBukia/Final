import Utils.Chromerunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginUser extends Chromerunner {
    @Test
    public void myuser(){
        Chromerunner obj = new Chromerunner();

        SelenideElement  email = $(By.name("email"),0),
                         password = $(By.name("password")),
                         login = $(byText("Login")),
                         logout = $(byText("Logout"));
       /* String  myemail = "bukiamat@gmail.com",
                mypassword = "Paroli345%",
                myname = "Mate Bukia";*/


        SelenideElement home =  $(byText("Home"));
        Assert.assertTrue(home.is(Condition.visible), "Home screen check");
        $(byText("Signup / Login")).click();
        $(By.name("email"),0).setValue(myemail.toString());
        Assert.assertEquals(email.getValue(), myemail, "Email check");
        $(By.name("password")).setValue(mypassword);
        Assert.assertEquals(password.getValue(), mypassword, "Password check");
        $(byText("Login")).click();
        Assert.assertTrue(logout.is(Condition.visible), "Login check");
    }
}
