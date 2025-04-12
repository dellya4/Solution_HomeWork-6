import configurate.SupportHandler;
import handlers.FAQBotHandler;
import handlers.JuniorSupportHandler;
import handlers.SeniorSupportHandler;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<SupportHandler> handlers = new ArrayList<>();
        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        handlers.add(faq);
        handlers.add(junior);
        handlers.add(senior);

        faq.set_next(junior).set_next(senior);


        menu menu = new menu(faq, handlers);
        menu.run();
    }
}
