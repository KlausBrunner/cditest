package test;


import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

@ApplicationScoped
public class MessageBean {
    private final String message;

    public MessageBean() {
        message = "Here's a message from the message bean. I was initialised at " + new Date() + ".";
    }

    public String getMessage() {
        return message;
    }
}
