package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java8.Es;
import io.vavr.control.Try;
import org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class escenarioEnviarCorreoConAdjunto implements Es {

    String correoElectronico;
    public escenarioEnviarCorreoConAdjunto()
    {
        Dado("^un correo electrónico \"([^\"]*)\"$", (String correo) -> {
            correoElectronico = correo;
        });

        Cuando("^ingrese al dominio del correo \"([^\"]*)\"$", (String paginaCorreo) -> {
            open(paginaCorreo);
            $("#identifierId").setValue(correoElectronico).pressEnter();
            String xPathContrasenia = "//div[@id='password']//input[@class='whsOnd zHQkBf']";
            $(By.xpath(xPathContrasenia)).waitUntil(Condition.exist,5000).setValue("******").pressEnter();
            String xPathBotonCompose = "//div[@class='T-I J-J5-Ji T-I-KE L3']";
            $(By.xpath(xPathBotonCompose)).waitUntil(Condition.exist,10000).click();
            String xPathPara = "/html[1]/body[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/textarea[1]";
            $(By.xpath(xPathPara)).waitUntil(Condition.exist,5000).setValue("mariacadavid@seven4n.com").click();
            String xPathAsunto = "/html[1]/body[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[3]/input[1]";
            $(By.xpath(xPathAsunto)).setValue("Holaaa Prueba Automatización");


        });


        Entonces("^deseo enviar un correo electronico con el adjunto de la siguiente ruta \"([^\"]*)\" o con el nombre del archivo \"([^\"]*)\"$",
                (String ruta, String nombreDelArchivo) -> {
                    $(By.xpath("/html[1]/body[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
                    sleep(7000);
                    StringSelection ss = new StringSelection(nombreDelArchivo);
                    //upload your file using RobotClass
                    //attach your path where file is located.
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
                    Robot robot = new Robot();
                    robot.mouseMove(160,120);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.mouseMove(1247,47);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    sleep(5000);
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    robot.keyRelease(KeyEvent.VK_V);
                    sleep(5000);
                    robot.mouseMove(400,146);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    sleep(5000);
                    String xPathBotonSend = "/html[1]/body[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]";
                    $(By.xpath(xPathBotonSend)).waitUntil(Condition.exist,10000).click();
                    sleep(5000);

                });







    }

}
