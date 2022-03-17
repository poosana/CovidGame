package coma.game.models.contents;

import com.badlogic.gdx.audio.Sound;
import coma.game.Resources;
import coma.game.components.Image;

/**
 * Class for all game units.
 */
public abstract class Unit extends GameObject {
    private int tileRow;
    private int tileCol;

    protected int health;
    protected int attackDamage;

    public Unit(Image img, int health, int attack) {
        super(img.clone());

        this.health = health;
        this.attackDamage = attack;
    }

    public void setTile(int row, int col) {
        this.tileRow = row;
        this.tileCol = col;

        this.updateMove();
    }

    public void moveTile(int row, int col) {
        this.tileRow += row;
        this.tileCol += col;

        this.updateMove();
    }

    public boolean shouldDead() {
        return this.health <= 0;
    }

    private void updateMove() {
        this.image.setPosition(112 + this.tileCol * 24, 446 - this.tileRow * 23);
    }
}
