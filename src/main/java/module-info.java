module com.billstephens.contactsjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml;

    opens com.billstephens.contactsjavafx to javafx.fxml;
    opens com.billstephens.contactsjavafx.datamodel to javafx.base;
    exports com.billstephens.contactsjavafx;
}