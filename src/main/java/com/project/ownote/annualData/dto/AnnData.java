package com.project.ownote.annualData.dto;

import lombok.*;

import javax.persistence.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "anndata")
public class AnnData {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long  anndata_id;

  private int  anndata_date;
    private int anndata_add;
    private double anndata_used;
    private double anndata_extra;
    private int emp_id;
    private int annual_id;
}
