package com.infosec.projectui;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ProjectView implements Initializable {

    @FXML
    private ComboBox<String> algo_select;

    @FXML
    private Label encryptImgLabel;

    @FXML
    private Label decryptImgLabel;

    @FXML
    private TextArea msgTxtArea;

    private List<String> lstFiles;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        algo_select.setItems(FXCollections.observableArrayList("AES", "RC6", "RSA"));
        algo_select.getSelectionModel().selectFirst();
        msgTxtArea.setEditable(false);

        lstFiles  = new ArrayList<>();
        lstFiles.add("*.jpg");
        lstFiles.add("*.png");
        lstFiles.add("*.jpeg");
    }

    @FXML
    void onEncryptImageSelect(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", lstFiles));
        File f = fc.showOpenDialog(null);

        if (f != null) {
            encryptImgLabel.setText(f.getAbsolutePath());
        }
    }

    @FXML
    void onDecryptImageSelect(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", lstFiles));
        File f = fc.showOpenDialog(null);

        if (f != null) {
            decryptImgLabel.setText(f.getAbsolutePath());
        }
    }

    @FXML
    void handleEncrypt(ActionEvent event) {
        String selectedAlgorithm = algo_select.getValue();

        // Encryption logic
    }

    @FXML
    void handleDecrypt(ActionEvent event) {
        String selectedAlgorithm = algo_select.getValue();

        // Decryption logic


        msgTxtArea.setText("Decrypted Message");
    }
}
