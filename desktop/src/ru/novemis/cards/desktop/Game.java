package ru.novemis.cards.desktop;

import ru.novemis.cards.desktop.common.Screens;

import static ru.novemis.cards.desktop.common.Screens.ScreensList.MAIN_MENU_SCREEN;

public class Game extends com.badlogic.gdx.Game {

    @Override
    public void create() {
        this.setScreen(Screens.get(MAIN_MENU_SCREEN));
    }
}
