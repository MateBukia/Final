import Utils.Chromerunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Userregister extends Chromerunner {
    @Test
    public void Userregistration(){
        SelenideElement home =  $(byText("Home"));
        Assert.assertTrue(home.is(Condition.visible), "Home screen check");
        $(byText("Signup / Login")).click();
        String  myname = "Mate Bukia",
                myemail = "bukiamat@gmail.com",
                daynum = "28",
                yearnum = "1996",
                monthvalue = "May",
                myfirstname = "Mate",
                mylastname = "Bukia",
                mycompany = "Crystal",
                myaddress = "Tbilisi",
                myaddress_2 = "Tbilisi Street",
                mycountry = "United States",
                mystate = "New Jersey",
                mycity = "Brooklyn",
                myzipcode = "2209",
                mypassword = "Paroli345%",
                mymobilenumber = "599090909";
        SelenideElement
                name = $(By.id("name")),
                email = $(By.id("email")),
                password = $(By.id("password")),
                optin = $(By.id("optin")),
                months = $(By.id("months")),
                years = $(By.id("years")),
                days  = $(By.id("days")),
                firstname = $(By.id("first_name")),
                lastname = $(By.id("last_name")),
                company = $(By.id("company")),
                address = $(By.id("address1")),
                address_2 = $(By.id("address2")),
                country = $(By.id("country")),
                state = $(By.id("state")),
                city = $(By.id("city")),
                zipcode = $(By.id("zipcode")),
                mobilenumber = $(By.id("mobile_number")),
                newusersignup = $(byText("New User Signup!")),
                accinfo = $(byText("Enter Account Information"));

        Assert.assertTrue(newusersignup.is(Condition.visible),"New User Signup check");
        $(By.name("name")).setValue(myname);
        $(By.name("email"),1).setValue(myemail);
        $(byText("Signup")).click();
        Assert.assertEquals(accinfo.getText(), "ENTER ACCOUNT INFORMATION","Account information is not visible");
        $(By.id("id_gender1")).click();
        Assert.assertEquals(name.getValue(),myname, "Name check");
        Assert.assertEquals(email.getValue(),myemail, "Email check");
        $(By.id("password")).setValue(mypassword);
        Assert.assertEquals(password.getValue(),mypassword, "Password check");
        $(By.id("days")).sendKeys((CharSequence) daynum);
        Assert.assertEquals(days.getValue(), daynum, "Days check");
        $(By.id("months")).sendKeys((CharSequence) monthvalue);
        Assert.assertEquals(months.getText(),monthvalue, "Months check");
        $(By.id("years")).sendKeys((CharSequence) yearnum);
        Assert.assertEquals(years.getValue(), yearnum, "Months check");
        $(By.id("optin")).click();
        Assert.assertTrue(optin.isSelected(),"Optin check");
        $(By.id("first_name")).setValue(myfirstname);
        Assert.assertEquals(firstname.getValue(), myfirstname, "First name check");
        $(By.id("last_name")).setValue(mylastname);
        Assert.assertEquals(lastname.getValue(), mylastname, "Last name check");
        $(By.id("company")).setValue(mycompany);
        Assert.assertEquals(company.getValue(), mycompany, "Company name check");
        $(By.id("address1")).setValue(myaddress);
        Assert.assertEquals(address.getValue(), myaddress, "address name check");
        $(By.id("address2")).setValue(myaddress_2);
        Assert.assertEquals(address_2.getValue(), myaddress_2, "address_2 name check");
        $(By.id("country")).sendKeys(mycountry);
        Assert.assertEquals(country.getValue(), mycountry, "country name check");
        $(By.id("state")).setValue(mystate);
        Assert.assertEquals(state.getValue(), mystate, "state name check");
        $(By.id("city")).setValue(mycity);
        Assert.assertEquals(city.getValue(), mycity, "city name check");
        $(By.id("zipcode")).setValue(myzipcode);
        Assert.assertEquals(zipcode.getValue(), myzipcode, "zipcode name check");
        $(By.id("mobile_number")).setValue(mymobilenumber);
        Assert.assertEquals(mobilenumber.getValue(), mymobilenumber, "mobilenumber name check");
        $(byText("Create Account")).click();
        Assert.assertTrue($(byText("Congratulations! Your new account has been successfully created!")).is(Condition.visible),"Account creation check");
        $(byText("Continue")).click();

    }

}
