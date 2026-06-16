module daihocmo.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens daihocmo.mavenproject3 to javafx.fxml;
    exports daihocmo.mavenproject3;
}
