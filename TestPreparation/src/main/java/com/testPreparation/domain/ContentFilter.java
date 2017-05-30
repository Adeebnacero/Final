package com.testPreparation.domain;

import javax.swing.text.AbstractDocument;
import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class ContentFilter implements Serializable {
    private String id;
    private Response response;
    private Comment comment;

    private ContentFilter()
    {

    }

    public ContentFilter(Builder builder) {
        this.id = builder.id;
        this.response = builder.response;
        this.comment = builder.comment;
    }
    public static class Builder{
        private String id;
        private Response response;
        private Comment comment;

        public Builder id(String value){
            this.id = value;
            return this;
        }
        public Builder response(Response value){
            this.response = value;
            return this;
        }
        public Builder comment(Comment value){
            this.comment = value;
            return this;
        }
    }

    public String getId() {
        return id;
    }

    public Response getResponse() {
        return response;
    }

    public Comment getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContentFilter that = (ContentFilter) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
