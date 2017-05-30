package com.testPreparation.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class User implements Serializable{
    private String id;
    private String email;
    private String screenName;
    private String password;
    private String status;
    private List<Reputation> reputation;

    private User()
    {

    }

    public User(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.screenName = builder.screenName;
        this.password = builder.password;
        this.status = builder.status;
        this.reputation = builder.reputation;
    }
    public static class Builder{
        private String id;
        private String email;
        private String screenName;
        private String password;
        private String status;
        private List<Reputation> reputation;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }
        public Builder email(String value)
                {
                    this.email = value;
                    return this;
                }
        public Builder screenName(String value)
                {
                    this.screenName = value;
                    return this;
                }
        public Builder password(String value)
                {
                    this.password = value;
                    return this;
                }
        public Builder status(String value)
                {
                    this.status = value;
                    return this;
                }
        public Builder reputation(List<Reputation> value)
                {
                    this.reputation = value;
                    return this;
                }
        public User build()
        {
            return new User(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public List<Reputation> getReputation() {
        return reputation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
