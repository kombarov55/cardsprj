package ru.novemis.cards.common;

import com.badlogic.gdx.Screen;
import ru.novemis.cards.mainmenu.MainMenuScreen;

import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.collections4.map.LazyMap.lazyMap;

public class Screens {

    public enum ScreenInfo {
        MAIN_MENU_SCREEN
    }

    public static Map<ScreenInfo, Screen> screens = lazyMap(
            new HashMap<>(),
            Screens::create
    );

    public static Screen create(ScreenInfo value) {
        switch (value) {
            case MAIN_MENU_SCREEN: return new MainMenuScreen();

            default: throw new RuntimeException();
        }
    }

}
