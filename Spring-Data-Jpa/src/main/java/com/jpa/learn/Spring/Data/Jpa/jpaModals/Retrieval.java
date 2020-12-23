package com.jpa.learn.Spring.Data.Jpa.jpaModals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Retrieval {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String source;
    private String lob;
    private String logicalname;
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public String getLogicalname() {
        return logicalname;
    }

    public void setLogicalname(String logicalname) {
        this.logicalname = logicalname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Retrieval{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", lob='" + lob + '\'' +
                ", logicalname='" + logicalname + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public  Retrieval(){

    }

    public Retrieval(long id, String source, String lob, String logicalname, String status) {
        this.id = id;
        this.source = source;
        this.lob = lob;
        this.logicalname = logicalname;
        this.status = status;
    }
}
