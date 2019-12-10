package example;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

/**
 * @ClassName SomeButtonsController
 * @Description: TODO
 * @Author xxq
 * @Date 2019/12/9 18:57
 * @Version V1.0
 **/
@FXMLController
public class SomeButtonsController {


    public void reactOnClick(ActionEvent actionEvent) {
        System.out.println("Clicked a button");
    }
}
