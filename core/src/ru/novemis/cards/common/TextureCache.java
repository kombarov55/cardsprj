package ru.novemis.cards.common;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

public class TextureCache {

    private static Map<String, Texture> nameToTexture = new HashMap<>();

    public static Texture get(String path) {
        Texture texture = nameToTexture.get(path);

        if (texture != null) {
            return texture;
        }

        texture = new Texture(Gdx.files.internal(path));
        nameToTexture.put(path, texture);
        return texture;
    }
}
