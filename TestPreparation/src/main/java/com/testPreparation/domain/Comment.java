package com.testPreparation.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class Comment implements Serializable {

    private String id;
    private User user;
    private VoteUp voteUp;
    private Site site;
    private VoteDown voteDown;
    private List<AbuseReport> abuseReport;
    private List<Response> response;
    private ContentFilter contentFilter;

    private String comment;
    private Date date;
    private String ipAddress;

    public Comment(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.voteUp = builder.voteUp;
        this.site = builder.site;
        this.voteDown = builder.voteDown;
        this.abuseReport = builder.abuseReport;
        this.response = builder.response;
        this.contentFilter = builder.contentFilter;
        this.comment = builder.comment;
        this.date = builder.date;
        this.ipAddress = builder.ipAddress;
    }
    public static class Builder{

        private String id;
        private User user;
        private VoteUp voteUp;
        private Site site;
        private VoteDown voteDown;
        private List<AbuseReport> abuseReport;
        private List<Response> response;
        private ContentFilter contentFilter;

        private String comment;
        private Date date;
        private String ipAddress;

        public Builder contentFilter(ContentFilter value)
        {
            this.contentFilter = value;
            return this;
        }
        public Builder response(List<Response> value)
        {
            this.response = value;
            return this;
        }
        public Builder abuseReport(List<AbuseReport> value)
        {
            this.abuseReport = value;
            return this;
        }
        public Builder voteDown(VoteDown value)
        {
            this.voteDown = value;
            return this;
        }
        public Builder site(Site value)
        {
            this.site = value;
            return this;
        }

        public Builder voteUp(VoteUp value)
        {
            this.voteUp = value;
            return this;
        }
        public Builder user(User value)
        {
            this.user = value;
            return this;
        }

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
        public Builder ipAddress(String value)
        {
            this.ipAddress = value;
            return this;
        }
        public Builder comment(String value)
        {
            this.comment = value;
            return this;
        }
        public Comment build()
        {
            return new Comment(this);
        }
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public VoteUp getVoteUp() {
        return voteUp;
    }

    public Site getSite() {
        return site;
    }

    public VoteDown getVoteDown() {
        return voteDown;
    }

    public List<AbuseReport> getAbuseReport() {
        return abuseReport;
    }

    public List<Response> getResponse() {
        return response;
    }

    public ContentFilter getContentFilter() {
        return contentFilter;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        return id.equals(comment.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}