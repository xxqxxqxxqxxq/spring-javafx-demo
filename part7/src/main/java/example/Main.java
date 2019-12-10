package example;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Main
 * @Description: TODO
 * @Author xxq
 * @Date 2019/12/9 18:46
 * @Version V1.0
 **/
@SpringBootApplication
public class Main extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launch(Main.class,HelloWorldView.class,args);
    }
}
