package common;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCounterListener implements HttpSessionListener {

    private static int totalActiveSessions;

    public static int getTotalActiveSessions() {
        return totalActiveSessions;
    }

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        totalActiveSessions++;
        System.out.println("sessionCreated - add one session into counter");
        printCounter(httpSessionEvent);
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        totalActiveSessions--;
        System.out.println("sessionDestroyed - deduct one session from counter");
        printCounter(httpSessionEvent);
    }

    private void printCounter(HttpSessionEvent sessionEvent){

        HttpSession session = sessionEvent.getSession();

        ApplicationContext context =
                WebApplicationContextUtils.
                        getWebApplicationContext(session.getServletContext());

        CounterService counterService =
                    (CounterService) context.getBean("counterService");

        counterService.printCounter(totalActiveSessions);
    }
}
