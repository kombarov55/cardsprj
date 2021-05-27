package ru.novemis.cards;

import ru.novemis.cards.config.Window;

public class Game extends com.badlogic.gdx.Game {

    @Override
    public void create() {
        this.setScreen(Window.activeScreen);
    }
}
