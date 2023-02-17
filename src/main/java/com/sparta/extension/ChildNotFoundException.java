package com.sparta.extension;

public class ChildNotFoundException extends Exception{
    @Override
    public String getMessage() {
        return "child of this class is not found";
    }
}

