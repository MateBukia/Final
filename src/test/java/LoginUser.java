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
        SelenideElement home =  $(byText("Home"));
        Assert.assertTrue(home.is(Condition.visible), "Home screen check");
        $(byText("Signup / Login")).click();
        Assert.assertTrue(newusersignup.is(Condition.visible),"New User Signup check");
        $(By.name("name")).setValue(myname);
        $(By.name("email"),0).setValue(myemail);

    }
}
