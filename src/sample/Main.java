package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        int n = 5;
        int row;
        int column;

        GridPane grid = new GridPane();

        for(row = 0; row < n; row++) {
            for(column = 0; column < n; column++) {
                TextField box = new TextField();
                box.setEditable(false);

                if((row + column) % 2 == 1){
                    box.setStyle("-fx-background-color: hotpink");
                    grid.add(box, column, row);
                }
                else {
                    box.setStyle("-fx-background-color: black");
                    grid.add(box, column, row);
                }

            }
        }

        Scene scene = new Scene(grid);
        primaryStage.setTitle("Checkerboard");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
