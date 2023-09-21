package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Skill extends AbstractEntity {

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJob(List<Job> jobs) {
        this.jobs = jobs;
    }
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();
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