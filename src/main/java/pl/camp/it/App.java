package pl.camp.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.camp.it.configuration.AppConfiguration;
import pl.camp.it.configuration.AppConfiguration2;
import pl.camp.it.gui.GUI;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        GUI gui = context.getBean(GUI.class);

        gui.login();
        gui.register();
    }
}
