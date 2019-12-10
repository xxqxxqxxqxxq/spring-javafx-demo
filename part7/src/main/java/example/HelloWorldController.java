package example;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;

/**
 * @ClassName HelloController
 * @Description: TODO
 * @Author xxq
 * @Date 2019/12/9 18:48
 * @Version V1.0
 **/
@FXMLController
public class HelloWorldController {
    @FXML
    Pane myDynamicPane;

    @Autowired
    SomeButtonsView someButtonsView;

    @Autowired
    SomeOtherView someOtherView;


    public void showSomeButtonView(ActionEvent actionEvent) {
        myDynamicPane.getChildren().clear();
        myDynamicPane.getChildren().add(someButtonsView.getView());
    }

    public void showSomeOtherView(ActionEvent actionEvent) {
        myDynamicPane.getChildren().clear();
        myDynamicPane.getChildren().add(someOtherView.getView());
    }
}
