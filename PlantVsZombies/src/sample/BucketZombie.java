package sample;

import javafx.scene.layout.Pane;

public class BucketZombie extends Zombie {
    public BucketZombie(int x, int y, Pane pane) {
        super(15, 3, "file:src/sample/assets/bucketheadzombie.gif", x, y, pane, 68, 118);
    }
}
