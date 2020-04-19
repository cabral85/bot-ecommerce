package com.cabralbots.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "T_SESSION")
@NoArgsConstructor
public class Session implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSession;

    @Column(name = "ip")
    private String ip;

    @OneToOne
    @JoinColumn(name = "id")
    private UserProduct userProduct;

    @Temporal(TemporalType.DATE)
    @Column(name = "logged_time")
    private Date loggedTime;
}
