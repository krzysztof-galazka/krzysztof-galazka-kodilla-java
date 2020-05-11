import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;
import java.util.stream.Collectors;

public class Game extends Application {

    private GridPane gridPane;
    private GridPane gridPane2;
    private final String BACKGROUND_IMG = "resources/background.png";

    private Pane root = new Pane();

    private double bulletTime = 0;

    private Player player = new Player(300, 750, 40, 40, "player", Color.BLUE);

    private Parent createContent() {
        root.setPrefSize(600, 800);

        //root.getChildren().add(player.getImageView());

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };

        timer.start();

        nextLevel();

        return root;
    }

    private void nextLevel() {
        for (int i = 0; i < 5; i++) {
            Ship s = new Ship(90 + i * 100, 150, 30, 30, "enemy", Color.RED);

            root.getChildren().add(s);
        }
    }

    private List<Ship> ship() {
        return root.getChildren().stream().map(n -> (Ship) n).collect(Collectors.toList());
    }

    private void update() {
        bulletTime += 0.015;

        ship().forEach(n -> {
            if (n instanceof Ship) {
                Ship s = (Ship) n;

                switch (s.type) {

                    case "enemybullet":
                        s.moveDown();

                        if (s.getBoundsInParent().intersects(player.getBoundsInParent())) {
                            player.dead = true;
                            s.dead = true;
                        }
                        break;

                    case "playerbullet":
                        s.moveUp();

                        ship().stream().filter(e -> e.type.equals("enemy")).forEach(enemy -> {
                            if (s.getBoundsInParent().intersects(enemy.getBoundsInParent())) {
                                enemy.dead = true;
                                s.dead = true;
                            }
                        });

                        break;

                    case "enemy":

                        if (bulletTime > 2) {
                            if (Math.random() < 0.3) {
                                shoot(s);
                            }
                        }

                        break;
                }
            }
        });

        root.getChildren().removeIf(n -> {
            Ship s = (Ship) n;
            return s.dead;
        });

        if (bulletTime > 2) {
            bulletTime = 0;
        }
    }

    private void shoot(Node who) {
        String txt = (who instanceof Player) ? "player" : "enemy";
        Ship s = new Ship((int) who.getTranslateX() + 20, (int) who.getTranslateY(), 5, 20, txt + "bullet", Color.BLACK);

        root.getChildren().add(s);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createContent());

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case A:
                    player.moveLeft();
                    break;
                case D:
                    player.moveRight();
                    break;
                case SPACE:
                    shoot(player);
                    break;
            }
        });

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
