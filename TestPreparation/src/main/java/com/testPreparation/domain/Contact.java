package com.testPreparation.domain;

import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class Contact implements Serializable {
    private String id;
    private String cellphone;
    private String address;
    private String postalCode;
    private SiteManager siteManager;

    private Contact()
    {

    }

    public Contact(Builder builder) {
        this.id = builder.id;
        this.cellphone = builder.cellphone;
        this.address = builder.address;
        this.postalCode = builder.postalCode;
        this.siteManager = builder.siteManager;
    }
    public static class Builder{
        private String id;
        private String cellphone;
        private String address;
        private String postalCode;
        private SiteManager siteManager;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }
        public Builder cellphone(String value)
        {
            this.cellphone = value;
            return this;
        }
        public Builder address(String value)
        {
            this.address = value;
            return this;
        }
        public Builder postalCode(String value)
        {
            this.postalCode = value;
            return this;
        }
        public Builder siteManager(SiteManager value)
        {
            this.siteManager = value;
            return this;
        }
        public Contact build()
        {
            return new Contact(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return id.equals(contact.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
