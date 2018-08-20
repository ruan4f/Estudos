package com.ruanferreira.buscahoteis.POJO;

import com.google.gson.annotations.SerializedName;
import java.util.List;


public class Oferta {

    private static final String FIELD_CODE = "code";
    private static final String FIELD_CONTENT = "content";
    private static final String FIELD_MESSAGE = "message";


    @SerializedName(FIELD_CODE)
    private int mCode;
    @SerializedName(FIELD_CONTENT)
    private List<Content> mContents;
    @SerializedName(FIELD_MESSAGE)
    private String mMessage;


    public Oferta(){

    }

    public void setCode(int code) {
        mCode = code;
    }

    public int getCode() {
        return mCode;
    }

    public void setContents(List<Content> contents) {
        mContents = contents;
    }

    public List<Content> getContents() {
        return mContents;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public String getMessage() {
        return mMessage;
    }

    @Override
    public String toString(){
        return "code = " + mCode + ", contents = " + mContents + ", message = " + mMessage;
    }


}