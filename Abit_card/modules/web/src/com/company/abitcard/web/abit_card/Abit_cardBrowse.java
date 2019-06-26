package com.company.abitcard.web.abit_card;

import com.haulmont.cuba.gui.screen.*;
import com.company.abitcard.entity.Abit_card;

@UiController("abitcard_Abit_card.browse")
@UiDescriptor("abit_card-browse.xml")
@LookupComponent("abit_cardsTable")
@LoadDataBeforeShow
public class Abit_cardBrowse extends StandardLookup<Abit_card> {
}