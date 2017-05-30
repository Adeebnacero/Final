package com.testPreparation.domain;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class Role {
    private String id;
    private String name;
    private String description;

    private Role()
    {

    }

    public Role(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
    }
    public static class Builder{
        private String id;
        private String name;
        private String description;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }
        public Builder name(String value)
        {
            this.name = value;
            return this;
        }
        public Builder description(String value)
        {
            this.description = value;
            return this;
        }
        public Role build()
        {
            return new Role(this);
        }

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        return id.equals(role.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
