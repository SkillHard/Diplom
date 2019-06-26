package com.company.abitcard.web.direction;

import com.haulmont.cuba.gui.screen.*;
import com.company.abitcard.entity.Direction;

@UiController("abitcard_Direction.browse")
@UiDescriptor("direction-browse.xml")
@LookupComponent("directionsTable")
@LoadDataBeforeShow
public class DirectionBrowse extends StandardLookup<Direction> {
}