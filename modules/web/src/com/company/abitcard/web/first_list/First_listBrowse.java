package com.company.abitcard.web.first_list;

import com.haulmont.cuba.gui.screen.*;
import com.company.abitcard.entity.First_list;

@UiController("abitcard_First_list.browse")
@UiDescriptor("first_list-browse.xml")
@LookupComponent("first_listsTable")
@LoadDataBeforeShow
public class First_listBrowse extends StandardLookup<First_list> {
}