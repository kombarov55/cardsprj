package ru.novemis.cards.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.novemis.cards.Game;
import ru.novemis.cards.config.Window;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Window.width;
		config.height = Window.height;
		new LwjglApplication(new Game(), config);
	}
}
