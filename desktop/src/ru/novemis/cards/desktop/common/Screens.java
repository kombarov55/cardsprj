package ru.novemis.cards.desktop.common;

import com.badlogic.gdx.Screen;
import ru.novemis.cards.desktop.mainmenu.MainMenuScreen;

public class Screens {

    public enum ScreensList {
        MAIN_MENU_SCREEN
    }

    public static Screen get(ScreensList value) {
        switch (value) {
            case MAIN_MENU_SCREEN: return new MainMenuScreen();

            default: throw new RuntimeException();
        }
    }

}
