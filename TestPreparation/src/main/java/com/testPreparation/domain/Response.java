package com.testPreparation.domain;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class Response implements Serializable {
    private String id;
    private String ipAddress ;
    private String comment;
    private VoteUp voteUp;

    private ContentFilter contentFilter;
    private Date date;
    private List<AbuseReport> abuseReport;
    private User user;
    private VoteDown voteDown;

    private Response()
    {

    }

    public Response (Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.ipAddress = builder.ipAddress;
        this.comment = builder.comment;
        this.contentFilter = builder.contentFilter;
        this.voteUp = builder.voteUp;
        this.abuseReport = builder.abuseReport;
        this.user = builder.user;
        this.voteDown = builder.voteDown;
    }
    public static class Builder {
        private String id;
        private Date date;
        private String ipAddress;
        private String comment;
        private ContentFilter contentFilter;
        private VoteUp voteUp;
        private List<AbuseReport> abuseReport;
        private User user;
        private VoteDown voteDown;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder ipAddress(String value) {
            this.ipAddress = value;
            return this;
        }

        public Builder comment(String value) {
            this.comment = value;
            return this;
        }

        public Builder contentFilter(ContentFilter value) {
            this.contentFilter = value;
            return this;
        }

        public Builder voteUp(VoteUp value) {
            this.voteUp = value;
            return this;
        }

        public Builder user(User value) {
            this.user = value;
            return this;
        }

        public Builder voteDown(VoteDown value) {
            this.voteDown = value;
            return this;
        }

        public Builder abuseReport(List<AbuseReport> value) {
            this.abuseReport = value;
            return this;
        }

        public Response build() {
            return new Response(this);
        }

    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getComment() {
        return comment;
    }

    public ContentFilter getContentFilter() {
        return contentFilter;
    }

    public VoteUp getVoteUp() {
        return voteUp;
    }

    public List<AbuseReport> getAbuseReport() {
        return abuseReport;
    }

    public User getUser() {
        return user;
    }

    public VoteDown getVoteDown() {
        return voteDown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response response = (Response) o;

        return id.equals(response.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

