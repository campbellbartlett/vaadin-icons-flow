package com.vaadin.flow.component.icon;

import java.io.Serializable;

/**
 * interface that allows an Icon Component to defer
 * instantiation of the Icon to it's subclass
 */
@FunctionalInterface
public interface IconFactory extends Serializable {
    Icon create();
}
