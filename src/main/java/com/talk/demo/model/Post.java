package com.talk.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Post implements Serializable {


    @JsonProperty("ret")
    private boolean ret;
    @JsonProperty("errcode")
    private int errCode;
    @JsonProperty("errmsg")
    private String errMsg;
    @JsonProperty("From")
    private String from;

    @JsonProperty(value = "To")
    private List<User> to;

    @JsonProperty(value = "Body")
    private String body;

    @JsonProperty(value = "Type")
    private String type;

    @JsonProperty(value = "Msg_Type")
    private String msgType;

    @JsonProperty(value = "Host")
    private String host;

    @JsonProperty(value = "Domain")
    private String domain;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }


    @JsonProperty("Domain")
    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Post() {}


    public Post(String from, List<User> to, String body, String type, String msgType, String host, String domain) {
        this.from = from;
        this.to = to;
        this.body = body;
        this.type = type;
        this.msgType = msgType;
        this.host = host;
        this.domain = domain;
    }

    @JsonProperty("From")
    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    
    public List<User> getTo() {
        return this.to;
    }

    public void setTo(List<User> to) {
        this.to = to;
    }

    @JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getMsgType() {
        return this.msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    @JsonProperty("Host")
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty("Body")
    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
