package com.requestfilter.entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="hourly_stats")
public class HourlyStats {

    @Id
    @NotNull
    @Column(name = "ip", length = 11)
    private Integer ip;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "custome_id")
    private Customer customer;

    @NotNull
    @Column(name = "time")
    private String time;

    @NotNull
    @Column(name = "request_count")
    private BigInteger requestCount;

    @NotNull
    @Column(name = "invalid_count")
    private BigInteger invalidCount;
}
