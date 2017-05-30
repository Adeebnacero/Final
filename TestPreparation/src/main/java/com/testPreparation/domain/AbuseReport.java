package com.testPreparation.domain;

import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class AbuseReport implements Serializable {
    private String id;
    private String description;
    private AbuseReport()
    {

    }

    public AbuseReport(Builder builder) {
        this.id = builder.id;
        this.description = builder.description;
    }
    public static class Builder{
        private String id;
        private String description;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }
        public Builder description(String value)
        {
            this.description = value;
            return this;
        }
        public AbuseReport build()
        {
            return new AbuseReport(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbuseReport that = (AbuseReport) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
