package org.ingomohr.pojo;

import java.io.Serializable;

public class BookPojo implements Serializable {

    private final String title;
    private final int id;

    public BookPojo(String title, int id) {
        if (id == 42) {
            throw new IllegalArgumentException("Unsupported id: " + id);
        }
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BookPojo other = (BookPojo) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BookPojo [title=" + title + ", id=" + id + "]";
    }

}
