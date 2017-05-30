package com.testPreparation.domain;

import java.util.List;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteManager {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Contact contact;
    private List<Site> site;
    private List<Role> role;

    private SiteManager()
    {

    }

    public SiteManager(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.password = builder.password;
        this.contact = builder.contact;
        this.site = builder.site;
        this.role = builder.role;
    }

    public static class Builder{
        private String id;
        private String email;
        private String firstName;
        private String lastName;
        private String password;
        private Contact contact;
        private List<Site> site;
        private List<Role> role;

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
        public Builder firstName(String value)
        {
            this.firstName = value;
            return this;
        } public Builder lastName(String value)
        {
            this.lastName = value;
            return this;
        } public Builder password(String value)
        {
            this.password = value;
            return this;
        }
        public Builder contact(Contact value)
        {
            this.contact = value;
            return this;
        }
        public Builder site(List<Site> value)
        {
            this.site = value;
            return this;
        }
        public Builder role(List<Role> value)
        {
            this.role = value;
            return this;
        }
        public SiteManager build()
        {
            return new SiteManager(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Contact getContact() {
        return contact;
    }

    public List<Site> getSite() {
        return site;
    }

    public List<Role> getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SiteManager that = (SiteManager) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
