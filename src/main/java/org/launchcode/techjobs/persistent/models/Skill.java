package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import java.lang.reflect.Field;

@Entity
public class Skill extends AbstractEntity {

    private String description;
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill() {

    }
}