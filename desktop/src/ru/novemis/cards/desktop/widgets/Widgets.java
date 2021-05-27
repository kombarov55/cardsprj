package ru.novemis.cards.desktop.widgets;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import ru.novemis.cards.desktop.common.TextureCache;

public class Widgets {

    public static ImageParams image() {
        return new ImageParams(params -> createImage(params));
    }

    private static Image createImage(final ImageParams imageParams) {
        Image image = new Image(TextureCache.get(imageParams.img));
        image.setPosition(imageParams.x, imageParams.y);
        image.setSize(imageParams.width, imageParams.height);

        final Runnable onClick = imageParams.onClick;

        image.addListener(new ClickListener() {
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                onClick.run();
            }
        });

        return image;
    }

}
