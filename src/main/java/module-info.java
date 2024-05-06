module com.viewer.picture_viewer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.viewer.picture_viewer to javafx.fxml;
    exports com.viewer.picture_viewer;
}