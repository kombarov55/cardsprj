package ru.novemis.cards.config;

import com.badlogic.gdx.Screen;

import static ru.novemis.cards.common.Screens.ScreenInfo.MAIN_MENU_SCREEN;
import static ru.novemis.cards.common.Screens.screens;

public class Window {
    public static int width = 1280;
    public static int height = 720;

    public static Screen activeScreen = screens.get(MAIN_MENU_SCREEN);
}
