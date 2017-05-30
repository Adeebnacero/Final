package com.testPreparation.domain;

import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteDown implements Serializable {
    private String id;
    private int counter;
    private VoteDown()
        {

        }
    public VoteDown(Builder builder) {
        this.id = builder.id;
        this.counter = builder.counter;

    }
    public static class Builder{
        private int counter;
        private String id;

        public Builder counter(int value)
        {
            this.counter = value;
            return this;
        } public Builder id(String value)
        {
            this.id = value;
            return this;
        }
        public VoteDown build()
        {
            return new VoteDown(this);
        }
    }

    public String getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoteDown voteDown = (VoteDown) o;

        return id.equals(voteDown.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
