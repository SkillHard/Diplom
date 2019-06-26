package com.company.abitcard.web.abit_card;

import com.haulmont.cuba.gui.screen.*;
import com.company.abitcard.entity.Abit_card;

@UiController("abitcard_Abit_card.edit")
@UiDescriptor("abit_card-edit.xml")
@EditedEntityContainer("abit_cardDc")
@LoadDataBeforeShow
public class Abit_cardEdit extends StandardEditor<Abit_card> {
}