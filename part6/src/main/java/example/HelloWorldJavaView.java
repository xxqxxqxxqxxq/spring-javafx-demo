package example;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;


/**
 * @ClassName HelloWorldJavaView
 * @Description: TODO
 * @Author xxq
 * @Date 2019/12/10 9:07
 * @Version V1.0
 **/
@FXMLView
public class HelloWorldJavaView extends AbstractFxmlView {

    public Pane myJavaCodePane;

    public HelloWorldJavaView(){
        Pane pane = new Pane();
        Button button = new Button("A button");
        pane.getChildren().add(button);
        myJavaCodePane=pane;
    }

    @Override
    public Parent getView() {
        return myJavaCodePane;
    }
}
