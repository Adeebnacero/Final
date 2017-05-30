package com.testPreparation.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class Reputation implements Serializable {

    private String id;
    private Date date;
    private int value;

    private Reputation(){

    }
    public Reputation(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.value = builder.value;
    }

    public static class Builder{
        private String id;
        private Date date;
        private int value;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }
        public Builder date(Date value)
        {
            this.date = value;
            return this;
        }
        public Builder value(int value)
        {
            this.value = value;
            return this;
        }
        public Reputation build()
        {
            return new Reputation(this);
        }
    }
    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reputation that = (Reputation) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
