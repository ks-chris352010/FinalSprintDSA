package com.keyin.FinalSprint.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Node {
    @JsonProperty
    int value;
    @JsonProperty
    Node left;
    @JsonProperty
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    // Getters and setters:
    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

