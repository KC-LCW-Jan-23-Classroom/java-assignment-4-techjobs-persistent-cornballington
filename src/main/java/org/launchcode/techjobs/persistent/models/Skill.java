package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import java.lang.reflect.Field;

@Entity
public class Skill extends AbstractEntity {

    private Field description;
    public Field getDescription() {
        return description;
    }

    public void setDescription(Field description) {
        this.description = description;
    }

    public Skill() {

    }
}