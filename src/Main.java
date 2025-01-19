package conversor;
import com.google.gson.Gson;
import conversor.modelos.Connection;
import conversor.modelos.MainMenu;

public class Main {
    public static void main(String[] args) {
        MainMenu menu = new MainMenu(new Connection(), new Gson());
        menu.mainMenu();
    }
}