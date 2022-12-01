package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MailPage {
    SelenideElement inputMail = $(By.xpath("//a[@class='home-link2 headline__personal-enter home-link2_color_black']"));
    SelenideElement mail = $(By.xpath("//button[@data-t='button:default']"));
    SelenideElement login = $(By.xpath("//input[@data-t='field:input-login']"));
    SelenideElement buttonLoginIn = $(By.xpath("//button[@id='passp:sign-in']"));
    SelenideElement password = $(By.xpath("//input[@data-t='field:input-passwd']"));
    SelenideElement buttonPasswordIn = $(By.xpath("//button[@id='passp:sign-in']"));
    SelenideElement clickMail = $(By.xpath("//a[@aria-label='Почта ']"));

    public void authorizationMail() {
        inputMail.shouldBe(Condition.visible).click();
        mail.shouldBe(Condition.visible).click();
        login.shouldBe(Condition.visible).sendKeys("SimbirTest21");
        buttonLoginIn.shouldBe(Condition.visible).click();
        password.shouldBe(Condition.visible).sendKeys("21SimbirTest");
        buttonPasswordIn.shouldBe(Condition.visible).click();
        clickMail.shouldBe(Condition.visible).click();
    }
}