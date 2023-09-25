package edu.au.cpsc.part2.uimodel;

import javafx.beans.property.*;
import javafx.beans.value.ObservableBooleanValue;


public class Part2Model {
    private final StringProperty nameProperty;
    private final StringProperty orderProperty;
    private final StringProperty partOrderedProperty;
    private final StringProperty partDescriptionProperty;
    private final BooleanProperty backorderSelectedProperty;
    private final BooleanProperty modifiedProperty;
    private final BooleanProperty newProperty;

    // try to get this to work...
   // private final BooleanProperty nameValidProperty;


    public Part2Model() {
        nameProperty = new SimpleStringProperty();
        orderProperty = new SimpleStringProperty();
        partOrderedProperty = new SimpleStringProperty();
        partDescriptionProperty = new SimpleStringProperty();
        backorderSelectedProperty = new SimpleBooleanProperty();
        modifiedProperty = new SimpleBooleanProperty();
        newProperty = new SimpleBooleanProperty();

        //nameValidProperty = new SimpleBooleanProperty();

        //Listeners
        nameProperty.addListener((observable, oldValue, newValue) -> setModified(true));
        orderProperty.addListener((observable, oldValue, newValue) -> setModified(true));
        partOrderedProperty.addListener((observable, oldValue, newValue) -> setModified(true));
        partDescriptionProperty.addListener((observable, oldValue, newValue) -> setModified(true));
        backorderSelectedProperty.addListener((observable, oldValue, newValue) -> setModified(true));

    }

    public StringProperty nameProperty() { return nameProperty; }
    public StringProperty orderProperty() { return orderProperty; }
    public StringProperty partOrderedProperty() { return partOrderedProperty; }
    public StringProperty partDescriptionProperty() { return partDescriptionProperty; }
    public BooleanProperty backorderSelectedProperty() { return backorderSelectedProperty; }
    public BooleanProperty modifiedProperty() { return modifiedProperty; }
    public BooleanProperty newProperty() { return newProperty; }

    //public BooleanProperty nameValidProperty() { return nameValidProperty; }



    public String getName() { return nameProperty.get(); }
    public void setName(String name) { nameProperty.set(name); }
    public String getOrder() { return orderProperty.get(); }
    public void setOrder(String order) { orderProperty.set(order); }
    public String getPartOrdered() { return partOrderedProperty.get(); }
    public void setPartOrdered(String partOrdered) { partOrderedProperty.set(partOrdered); }
    public String getPartDescription() { return partDescriptionProperty.get(); }
    public void setPartDescription(String partDescription) { partDescriptionProperty.set(partDescription); }
    public Boolean isBackorderSelected() { return backorderSelectedProperty.get(); }
    public void setBackorderSelected(Boolean backorderSelected) { backorderSelectedProperty.set(backorderSelected); }
    public Boolean isModified() { return modifiedProperty.get(); }
    public void setModified(boolean modified) { modifiedProperty.set(modified); }
    public Boolean isNew() {return newProperty.get(); }
    public void setNew (boolean n) { newProperty.set(n); }

    //public Boolean isNameValidProperty() {return nameValidProperty.get(); }
    //public void setNameValidProperty (boolean nameValid) { newProperty.set(nameValid); }

}
