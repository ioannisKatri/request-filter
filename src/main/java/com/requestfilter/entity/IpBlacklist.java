package com.requestfilter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ip_blacklist")
public class IpBlacklist {

    @Id
    @Column(name="ip", length = 11)
    private Integer ip;

    public IpBlacklist() {
    }


}
