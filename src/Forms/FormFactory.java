package Forms;

import java.util.HashMap;
import java.util.Map;

public class FormFactory {
    private static final Map<String, FormFactoryInterface> factoryMap = new HashMap<>();

    static {
        factoryMap.put("LogIn", new LogInFactory());
        factoryMap.put("Menu", new MenuFactory());
        factoryMap.put("Reserve", new ReserveFactory());
        factoryMap.put("Sell", new SellFactory());
        factoryMap.put("Buy", new BuyFactory());
        factoryMap.put("History", new HistoryFactory());
        factoryMap.put("LearnMore", new LearnMoreFactory());
    }

    public static javax.swing.JFrame createForm(String formType, int userID) {
        FormFactoryInterface factory = factoryMap.get(formType);
        if (factory == null) {
            throw new IllegalArgumentException("Unknown form type: " + formType);
        }
        return factory.createForm(userID);
    }
}
