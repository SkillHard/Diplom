package com.company.abitcard.web.direction;

import com.haulmont.cuba.gui.screen.*;
import com.company.abitcard.entity.Direction;

@UiController("abitcard_Direction.edit")
@UiDescriptor("direction-edit.xml")
@EditedEntityContainer("directionDc")
@LoadDataBeforeShow
public class DirectionEdit extends StandardEditor<Direction> {
}