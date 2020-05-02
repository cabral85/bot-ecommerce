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
    @Column(name = "id_session")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSession;

    @Column(name = "ip")
    private String ip;

    @OneToOne
    @JoinColumn(name = "id_user_product")
    private UserProduct userProduct;

    @Temporal(TemporalType.DATE)
    @Column(name = "logged_time")
    private Date loggedTime;
}
