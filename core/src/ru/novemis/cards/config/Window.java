package ru.novemis.cards.config;

import com.badlogic.gdx.Screen;
import ru.novemis.cards.common.Screens;

import static ru.novemis.cards.common.Screens.ScreensList.MAIN_MENU_SCREEN;

public class Window {
    public static int width = 1280;
    public static int height = 720;

    public static Screen activeScreen = Screens.get(MAIN_MENU_SCREEN);
}
