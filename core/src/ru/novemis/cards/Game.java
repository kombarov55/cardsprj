package ru.novemis.cards;

import ru.novemis.cards.common.Screens;

import static ru.novemis.cards.common.Screens.ScreensList.MAIN_MENU_SCREEN;

public class Game extends com.badlogic.gdx.Game {

    @Override
    public void create() {
        this.setScreen(Screens.get(MAIN_MENU_SCREEN));
    }
}
