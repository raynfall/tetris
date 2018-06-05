import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Tetris extends Application {

    public static void main(String[] args) {
        Tetris game = new Tetris();
        launch(args);
    }

    public void start(Stage gameStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 1000, Color.GRAY);
        gameStage.setScene(scene);

        gameStage.show();
    }
}
