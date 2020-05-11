import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Player extends ImageView {
    boolean dead = false;
    final String type;

    static final Image playerImage = new Image("file:src/main/resources/player.png");

    Player(int x, int y, int w, int h, String type, Color color) {
        super(playerImage);
        this.type = type;
        setTranslateX(x);
        setTranslateY(y);
    }

    void moveLeft() {
        setTranslateX(getTranslateX() - 5);
    }

    void moveRight() {
        setTranslateX(getTranslateX() + 5);
    }

    void moveUp() {
        setTranslateY(getTranslateY() - 5);
    }

    void moveDown() {
        setTranslateY(getTranslateY() + 5);
    }

    public Node getImageView() {
        return new ImageView(playerImage);
    }
}
