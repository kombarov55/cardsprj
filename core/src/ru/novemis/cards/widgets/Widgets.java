package ru.novemis.cards.widgets;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import ru.novemis.cards.common.Resources;

public class Widgets {

    public static ImageParams image() {
        return new ImageParams();
    }

    public static TextButtonParams textButton() {
        return new TextButtonParams();
    }

    static Image createImage(final ImageParams imageParams) {
        Image image = new Image(Resources.textures.get(imageParams.img));
        image.setPosition(imageParams.x, imageParams.y);
        image.setSize(imageParams.width, imageParams.height);

        final Runnable onClick = imageParams.onClick;

        image.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                onClick.run();
                return true;
            }
        });

        return image;
    }

    static TextButton createTextButton(TextButtonParams params) {
        TextButton x = new TextButton(params.text, params.skin);
        x.setPosition(params.x, params.y);
        x.setSize(params.width, params.height);

        final Runnable onClick = params.onClick;

        x.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                onClick.run();
                return true;
            }
        });

        return x;
    }

}
