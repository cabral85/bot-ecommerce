package com.cabralbots.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "B_SUB_PRODUCT")
public class SubProduct implements Serializable {
    @Id
    @Column(name = "id_sub_product")
    private Long idSubProduct;

    @ManyToOne
    @JoinColumn(name = "id_product")
    @Column(name = "id_product")
    private Product product;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "desc", length = 500, nullable = true)
    private String desc;

    @Column(name = "path", length = 1000, nullable = false)
    private String path;
}
