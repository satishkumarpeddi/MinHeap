module com.example.minheap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minheap to javafx.fxml;
    exports com.example.minheap;
}