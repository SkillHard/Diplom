package com.company.abitcard.web.connection;

import com.haulmont.cuba.gui.screen.*;
import com.company.abitcard.entity.Connection;

@UiController("abitcard_Connection.browse")
@UiDescriptor("connection-browse.xml")
@LookupComponent("connectionsTable")
@LoadDataBeforeShow
public class ConnectionBrowse extends StandardLookup<Connection> {
}