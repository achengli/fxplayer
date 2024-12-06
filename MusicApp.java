
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class MusicApp extends Application {

    private String username = "User123"; // Variable para simular un usuario logueado.
    private List<String> playlists = new ArrayList<>(); // Lista de playlists creadas por el usuario.
    private List<String> favorites = new ArrayList<>(); // Lista de canciones favoritas.

    @Override
    public void start(Stage primaryStage) {
        showLoginScreen(primaryStage);
    }

    private void showLoginScreen(Stage stage) {
        // Login UI
        Label lblUsername = new Label("Usuario:");
        TextField txtUsername = new TextField();
        Label lblPassword = new Label("Contraseña:");
        PasswordField txtPassword = new PasswordField();
        Button btnLogin = new Button("Iniciar Sesión");

        VBox loginLayout = new VBox(10, lblUsername, txtUsername, lblPassword, txtPassword, btnLogin);
        loginLayout.setAlignment(Pos.CENTER);
        loginLayout.setPadding(new Insets(20));

        btnLogin.setOnAction(e -> showMainApp(stage, txtUsername.getText()));

        Scene loginScene = new Scene(loginLayout, 300, 200);
        stage.setScene(loginScene);
        stage.setTitle("Login");
        stage.show();
    }

    private void showMainApp(Stage stage, String user) {
        this.username = user.isEmpty() ? "User123" : user;

        // Left Panel: User Info & Buttons
        Label lblWelcome = new Label("Usuario: " + username);
        TextField txtChangeNick = new TextField();
        txtChangeNick.setPromptText("Cambiar Nickname");
        Button btnChangeNick = new Button("Actualizar");
        btnChangeNick.setOnAction(e -> lblWelcome.setText("Usuario: " + txtChangeNick.getText()));

        Button btnSongs = new Button("Lista de Canciones");
        Button btnPlaylists = new Button("Lista de Playlists");
        Button btnFavorites = new Button("Canciones Favoritas");

        VBox leftPanel = new VBox(10, lblWelcome, txtChangeNick, btnChangeNick);
        VBox.setVgrow(leftPanel, Priority.ALWAYS);
        leftPanel.setPadding(new Insets(10));
        leftPanel.setStyle("-fx-background-color: #f0f0f0;");
        leftPanel.setPrefWidth(200);

        VBox bottomButtons = new VBox(10, btnSongs, btnPlaylists, btnFavorites);
        bottomButtons.setAlignment(Pos.CENTER);
        bottomButtons.setPadding(new Insets(10));
        VBox.setMargin(bottomButtons, new Insets(20, 0, 0, 0));

        VBox leftPanelContainer = new VBox(leftPanel, bottomButtons);
        VBox.setVgrow(leftPanel, Priority.ALWAYS);

        // Middle Panel: Song List
        ListView<HBox> songListView = new ListView<>();
        populateSongList(songListView);

        VBox middlePanel = new VBox(songListView);
        middlePanel.setPadding(new Insets(10));
        HBox.setHgrow(middlePanel, Priority.ALWAYS);

        // Main Layout
        HBox mainLayout = new HBox(leftPanelContainer, middlePanel);
        Scene mainScene = new Scene(mainLayout, 900, 600);

        stage.setScene(mainScene);
        stage.setTitle("Music App");
        stage.show();
    }

    private void populateSongList(ListView<HBox> songListView) {
        for (int i = 1; i <= 5; i++) {
            HBox songItem = createSongItem("Canción " + i, "song" + i + ".png");
            songListView.getItems().add(songItem);
        }
    }

    private HBox createSongItem(String songTitle, String imageName) {
        // Song Image
        ImageView songImage = new ImageView(new Image("https://via.placeholder.com/50"));
        songImage.setFitWidth(50);
        songImage.setFitHeight(50);

        // Song Title
        Label lblTitle = new Label(songTitle);
        lblTitle.setStyle("-fx-font-weight: bold; -fx-font-size: 14px;");

        // Play Slider
        Slider playSlider = new Slider();
        playSlider.setMin(0);
        playSlider.setMax(100);
        playSlider.setValue(0);

        // Buttons
        Button btnAddToPlaylist = new Button("Añadir a Playlist");
        Button btnAddToFavorites = new Button("Añadir a Favoritos");

        btnAddToPlaylist.setOnAction(e -> showAddToPlaylistDialog(songTitle));
        btnAddToFavorites.setOnAction(e -> {
            if (!favorites.contains(songTitle)) {
                favorites.add(songTitle);
                showAlert("Favoritos", "Canción añadida a favoritos.");
            } else {
                showAlert("Favoritos", "La canción ya está en favoritos.");
            }
        });

        VBox songDetails = new VBox(5, lblTitle, playSlider, new HBox(10, btnAddToPlaylist, btnAddToFavorites));
        songDetails.setAlignment(Pos.CENTER_LEFT);

        HBox songItem = new HBox(10, songImage, songDetails);
        songItem.setPadding(new Insets(10));
        songItem.setStyle("-fx-border-color: #ddd; -fx-border-width: 1px;");
        return songItem;
    }

    private void showAddToPlaylistDialog(String songTitle) {
        Stage dialog = new Stage();
        dialog.setTitle("Añadir a Playlist");

        Label lblInfo = new Label("Nombre de la Playlist:");
        TextField txtPlaylistName = new TextField();
        Button btnAdd = new Button("Añadir");
        Button btnCancel = new Button("Cancelar");

        btnAdd.setOnAction(e -> {
            String playlistName = txtPlaylistName.getText();
            if (!playlists.contains(playlistName)) {
                playlists.add(playlistName);
                showAlert("Playlist", "Playlist creada y canción añadida.");
            } else {
                showAlert("Playlist", "Canción añadida a la playlist.");
            }
            dialog.close();
        });

        btnCancel.setOnAction(e -> dialog.close());

        VBox layout = new VBox(10, lblInfo, txtPlaylistName, new HBox(10, btnAdd, btnCancel));
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10));

        Scene scene = new Scene(layout, 300, 150);
        dialog.setScene(scene);
        dialog.showAndWait();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

