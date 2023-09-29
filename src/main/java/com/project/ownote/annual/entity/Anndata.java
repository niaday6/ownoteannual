package com.project.ownote.annual.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "anndata")
public class Anndata {
    @Id
    private Long anndata_id;
    private int anndata_date;
    private int anndata_add;
    private double anndata_used;
    private double anndata_extra;
    private int emp_id;
    private int annual_id;




}
