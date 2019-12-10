package example;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName example.Main
 * @Description: TODO
 * @Author xxq
 * @Date 2019/12/10 9:00
 * @Version V1.0
 **/
@SpringBootApplication
public class Main extends AbstractJavaFxApplicationSupport {
    
    public static void main(String[] args) {
        launch(Main.class,HelloWorldJavaView.class,args);
    }
}
