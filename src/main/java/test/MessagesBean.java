package test;


import javax.enterprise.context.ApplicationScoped;import java.lang.String;

@ApplicationScoped
public class MessagesBean {
    private String messages = "";

    public synchronized void addMessage(String m) {
        messages = messages + m + '\n';
    }

    public String getMessages() {
        return messages;
    }

}
