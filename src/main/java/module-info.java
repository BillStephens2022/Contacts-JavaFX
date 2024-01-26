module com.billstephens.contactsjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml;

    opens com.billstephens.contactsjavafx to javafx.fxml;
    exports com.billstephens.contactsjavafx;
}