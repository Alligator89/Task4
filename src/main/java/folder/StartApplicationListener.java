package folder;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class StartApplicationListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Application listener starting ...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application listener finishing ...");
    }
}
