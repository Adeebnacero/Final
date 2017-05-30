package com.testPreparation.domain;

import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class VoteUp implements Serializable{
    private String id;
    private int counter;
    private VoteUp()
    {

    }
    public VoteUp(Builder builder) {
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
        public VoteUp build()
        {
            return new VoteUp(this);
        }
    }

    public int getCounter() {
        return counter;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoteUp voteUp = (VoteUp) o;

        return id.equals(voteUp.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
