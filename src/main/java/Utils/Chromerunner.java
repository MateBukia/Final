package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
<<<<<<< HEAD
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

=======
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.$;
>>>>>>> 3dfb8c0b062052ae9a7e780686c41167dda168bb
import static com.codeborne.selenide.Selenide.open;

public class Chromerunner {
    @BeforeMethod
    public void setUp(){
        open("https://automationexercise.com/");
        Configuration.browserSize = "1920x1080";
    }
    @AfterMethod
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
<<<<<<< HEAD




      public   String    myemail = "bukiamat@gmail.com";
      public     String    mypassword = "Paroli345%";
}

=======
}
>>>>>>> 3dfb8c0b062052ae9a7e780686c41167dda168bb
