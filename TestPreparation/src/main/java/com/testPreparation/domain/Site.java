package com.testPreparation.domain;

import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class Site implements Serializable{
    private String id;
    private String name;
    private String url;
    private String urlStory;
    private Site()
    {

    }

    public Site(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.url = builder.url;
        this.urlStory = builder.urlStory;
    }
    public static class Builder{
        private String id;
        private String name;
        private String url;
        private String urlStory;

        public Builder id(String value){
            this.id = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder url(String value){
            this.url = value;
            return this;
        }
        public Builder urlStory(String value){
            this.urlStory = value;
            return this;
        }
        public Site build()
        {
            return new Site(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlStory() {
        return urlStory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Site site = (Site) o;

        return id.equals(site.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
