package com.requestfilter.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.requestfilter.utils.validations.simplerequest.interfaces.CustomerIdExist;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public class SimpleRequest {

    @NotNull
    @JsonProperty(value = "user-agent")
    private List<String> userAgents;

    @NotNull(message = "Customer Id cannot be empty")
    @JsonProperty(value = "customerID")
    @CustomerIdExist
    private Integer customerId;

    @NotNull(message = "Tag Id cannot be empty and must be Numeric")
    @JsonProperty(value = "tagID")
    private Integer tagId;

    @NotBlank(message = "User Id cannot be empty and must be String")
    @JsonProperty(value = "userID")
    private String userId;

    @NotBlank(message = "Remote Ip cannot be empty and must be String")
    @JsonProperty(value = "remoteIP")
    private String remoteIp;

    @NotNull(message = "TimeStamp Id cannot be empty and must be Numeric")
    private Integer timestamp;

    public SimpleRequest() {}

    public void setUserAgents(List<String> userAgents) {
        this.userAgents = userAgents;
    }

    public List<String> getUserAgents() {
        return userAgents;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public String getUserId() {
        return userId;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "SimpleRequest{" +
                ", customerId=" + customerId +
                ", tagId=" + tagId +
                ", userId='" + userId + '\'' +
                ", remoteIp='" + remoteIp + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }


}
