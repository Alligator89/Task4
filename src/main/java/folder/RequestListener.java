package folder;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

import java.time.LocalDateTime;

public class RequestListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request listener start ..." + LocalDateTime.now());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request listener finish ..." + LocalDateTime.now());
    }
}
