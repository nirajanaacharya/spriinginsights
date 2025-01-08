package com.springfile.springintro;

import java.util.List;

public class Collection {
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "friends=" + friends +
                '}';
    }
}
