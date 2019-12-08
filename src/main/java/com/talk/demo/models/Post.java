package com.talk.demo.models;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Post implements Serializable {

    private String From;
    private List<User> To;
    private String Body;
    private String Type;
    private String Msg_Type;
    private String Host;
    private String Domain;
    private boolean ret;
    private int errCode;
    private String errMsg;

    @JsonProperty("errcode")
    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    @JsonProperty("errmsg")
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
        return this.Domain;
    }

    public void setDomain(String domain) {
        this.Domain = domain;
    }

    public Post() {}

    public Post(String From, List<User> To, String Body, String Type, String Msg_Type, String Host, String Domain) {
        this.From = From;
        this.To = To;
        this.Body = Body;
        this.Type = Type;
        this.Msg_Type = Msg_Type;
        this.Host = Host;
        this.Domain = Domain;
    }

    @JsonProperty("From")
    public String getFrom() {
        return this.From;
    }

    public void setFrom(String From) {
        this.From = From;
    }
    
    public List<User> getTo() {
        return this.To;
    }

    public void setTo(List<User> to) {
        this.To = to;
    }

    @JsonProperty("Type")
    public String getType() {
        return this.Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    @JsonProperty("Msg_Type")
    public String getMsg_Type() {
        return this.Msg_Type;
    }

    public void setMsg_Type(String msg_Type) {
        this.Msg_Type = msg_Type;
    }

    @JsonProperty("Host")
    public String getHost() {
        return this.Host;
    }

    public void setHost(String host) {
        this.Host = host;
    }

    @JsonProperty("Body")
    public String getBody() {
        return this.Body;
    }

    public void setBody(String body) {
        this.Body = body;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
//        return "Post{" +
//                "From=" + From +
//                ", To=" + To +
//                ", Body='" + Body + '\'' +
//                '}';
    }
}
