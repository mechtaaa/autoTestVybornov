package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InitialMailPage {
    SelenideElement buttonWrite =  $(By.xpath("//a[@aria-describedby='tooltip-0-1']"));
    SelenideElement whomWriteMail = $(By.xpath("//div[@aria-label='Кому']"));
    SelenideElement writeTextMail = $(By.xpath("//div[@title='Напишите что-нибудь']"));
    SelenideElement sendMail =  $(By.xpath("//button[@class='Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l']"));
    public void writeMail(){
        buttonWrite.shouldBe(Condition.visible).click();
        whomWriteMail.shouldBe(Condition.visible).sendKeys("dokuchaev_av@tkbbank.ru");
        writeTextMail.shouldBe(Condition.visible).sendKeys("Добрый день\n" +
                "\n" +
                "Простейший автотест готов\n" +
                "\n" +
                "Выборнов Александр Андреевич");
        sendMail.shouldBe(Condition.visible).click();
    }
}