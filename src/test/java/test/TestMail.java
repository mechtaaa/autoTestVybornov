package test;

import org.testng.annotations.Test;
import pages.InitialMailPage;
import pages.MailPage;
import pages.Settings;

import static com.codeborne.selenide.Selenide.switchTo;

public class TestMail extends Settings {
    MailPage mailPage = new MailPage();
    InitialMailPage initialMailPage = new InitialMailPage();

    @Test
    public void autoTest(){
        mailPage.authorizationMail();
        switchTo().window(1);
        initialMailPage.writeMail();
    }
}