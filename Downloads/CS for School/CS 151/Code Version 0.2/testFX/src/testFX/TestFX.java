package testFX;
/*
import javafx.application.Application;
import javafx.stage.Stage;

public class TestFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch();
	}

} */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestFX extends Application {

    private int count = 0;

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click me!");
        button.setOnAction(e -> {
            count++;
            button.setText("Clicked " + count + " times");
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 200, 100);

        primaryStage.setTitle("Button Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
