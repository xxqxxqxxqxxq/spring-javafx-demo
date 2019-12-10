package example;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.stage.Modality;

/**
 * @ClassName ViewController
 * @Description: TODO
 * @Author xxq
 * @Date 2019/12/9 17:07
 * @Version V1.0
 **/
@FXMLController
public class ViewController {

    public void showToolWindows(Event event) {
        Main.showView(ToolView.class, Modality.NONE);
    }

}
