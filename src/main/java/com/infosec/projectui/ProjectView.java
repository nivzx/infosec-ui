package com.infosec.projectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ProjectView implements Initializable {

    //Encrypt parameters
    @FXML
    private TextArea plainText;

    @FXML
    private PasswordField password;

    @FXML
    private ImageView encryptImageView;
    @FXML
    private Image encryptImage;

    @FXML
    private Label encryptImgLabel;


    //Decrypt parameters
    @FXML
    private ImageView decryptImageView;
    @FXML
    private Image decryptImage;

    @FXML
    private Label decryptImgLabel;

    @FXML
    private TextArea decryptedText;

    private List<String> lstFiles;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initFileTypes();

        decryptedText.setEditable(false);
    }

    @FXML
    void onEncryptImageSelect(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", lstFiles));
        File selectedFile = fc.showOpenDialog(null);

        if (selectedFile != null) {
            encryptImgLabel.setText(selectedFile.getAbsolutePath());
            this.encryptImage = new Image(selectedFile.getAbsolutePath());
            this.encryptImageView.setImage(this.encryptImage);
        }
    }

    @FXML
    void onDecryptImageSelect(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", lstFiles));
        File selectedFile = fc.showOpenDialog(null);

        if (selectedFile != null) {
            decryptImgLabel.setText(selectedFile.getAbsolutePath());
            this.decryptImage = new Image(selectedFile.getAbsolutePath());
            this.decryptImageView.setImage(this.decryptImage);
        }
    }

    @FXML
    void handleEncrypt(ActionEvent event) {
        // Encryption logic

        // Plaintext -> plainText.getText()
        // Image -> encryptImage
        // Password -> password.getText()
    }

    @FXML
    void handleDecrypt(ActionEvent event) {
        // Decryption logic

        // Image -> decryptImage
        // Decrypted text -> decryptedText.setText()

        String decryptedMessage = "Decrypted Message";

        // Set decrypted text to the TextArea
        decryptedText.setText(decryptedMessage);
    }

    private void initFileTypes() {
        lstFiles  = new ArrayList<>();
        lstFiles.add("*.jpg");
        lstFiles.add("*.png");
        lstFiles.add("*.jpeg");
    }
}
