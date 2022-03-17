package coma.game.models.contents;

import coma.game.components.Canvas;
import coma.game.components.Image;
import coma.game.views.Renderer;

/**
 * Base class for all entities in game scenes.
 */
public abstract class GameObject {

    public final Canvas image;

    public GameObject(final Image image) {
        this.image = new Canvas(image);

        Renderer.addComponents(this.image);
    }

    public void destroy() {
        this.image.isVisible = false;
        Renderer.removeComponents(this.image);
    }
}

