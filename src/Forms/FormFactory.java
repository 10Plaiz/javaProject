package Forms;

public class FormFactory {
    
    public static javax.swing.JFrame createForm(String formType, int userID) {
        switch (formType) {
            case "LogIn":
                return new LogIn();
            case "Menu":
                return new Menu(userID);
            case "Reserve":
                return new Reserve(userID);
            case "Sell":
                return new Sell(userID);
            case "Buy":
                return new Buy(userID);
            case "History":
                return new History(userID);
            case "LearnMore":
                return new LearnMore(userID);
            default:
                throw new IllegalArgumentException("Unknown form type: " + formType);
        }
    }
}
