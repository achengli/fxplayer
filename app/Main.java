import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Mostrar la ventana de inicio de sesión
        LoginView loginView = new LoginView();
        Scene loginScene = new Scene(loginView, 400, 300);
        primaryStage.setTitle("Inicio de Sesión");
        primaryStage.setScene(loginScene);
        primaryStage.show();
        
        // Cambiar a la ventana principal después de iniciar sesión
        loginView.setOnLoginSuccess(() -> {
            MainView mainView = new MainView();
            Scene mainScene = new Scene(mainView, 800, 600);
            primaryStage.setTitle("Gestor de Música");
            primaryStage.setScene(mainScene);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
