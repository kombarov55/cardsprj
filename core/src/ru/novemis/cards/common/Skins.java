package ru.novemis.cards.common;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import static ru.novemis.cards.common.Lazy.lazy;

public class Skins {

    public static Lazy<Skin> custom = lazy(() -> new Skin(Gdx.files.internal("custom-skin/custom-skin.json")));
}
