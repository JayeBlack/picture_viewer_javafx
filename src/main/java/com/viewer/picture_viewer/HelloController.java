package com.viewer.picture_viewer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button btnnext;

    @FXML
    private Button btnprevious;

    @FXML
    private ImageView imageview;
    FileChooser dialogbox = new FileChooser();
    //variable to keep number of pictures in directory
    int t_pics = 0;
    //variable to keep track of index of current picture
    int c_index = 0;
    //list of files

    List<File> accepted_pics = new ArrayList<>() {
    };

    //list to contain the supported image extensions
    List<String> supported_extensions = Arrays.asList("jpg", "png", "jpeg");

    @FXML
    void onnext(ActionEvent event) {

    }

    @FXML
    void onopen(ActionEvent event) throws MalformedURLException {
        dialogbox.getExtensionFilters().add(new FileChooser.ExtensionFilter("Pictures(*.png,*jpg,*jpeg)", "*.jpg", "*.png", "*.jpeg"));
        File selectedfile = dialogbox.showOpenDialog(new Stage());
        if (selectedfile == null) {
            //do nothing
        } else {
            accepted_pics.clear();
            btnprevious.setDisable(false);
            btnnext.setDisable(false);
            //display the selected image
            imageview.setImage(new Image(selectedfile.toURL().toString()));
        }
    }

    @FXML
    void onprevious(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnnext.setDisable(true);
        btnprevious.setDisable(true);
//        dialogbox.setInitialDirectory(new File )
    }
}
