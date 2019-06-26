package com.company.abitcard.web.connection;

import com.haulmont.cuba.gui.screen.*;
import com.company.abitcard.entity.Connection;

@UiController("abitcard_Connection.edit")
@UiDescriptor("connection-edit.xml")
@EditedEntityContainer("connectionDc")
@LoadDataBeforeShow
public class ConnectionEdit extends StandardEditor<Connection> {
}