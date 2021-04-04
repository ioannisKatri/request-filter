package com.requestfilter.entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @NotNull
    @Column(name = "id")
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "tag_id")
    private Integer tagId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "remote_ip")
    private int remoteIp;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "success")
    private Boolean success;

    @Column(name = "invalid_user_agent_id")
    private Integer invalidUserAgentId;

    @Generated(GenerationTime.ALWAYS)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    public Request() {
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getTagId() {
        return tagId;
    }

    public int getUserId() {
        return userId;
    }

    public int getRemoteIp() {
        return remoteIp;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public Integer getInvalidUserAgentId() {
        return invalidUserAgentId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
