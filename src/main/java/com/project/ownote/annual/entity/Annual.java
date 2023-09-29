package com.project.ownote.annual.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "annual")
public class Annual {
    @Id
    private Long annual_id;
    private String annual_content;
    private String annual_startdate;
    private String annual_enddate;
    private int anncheck_id;
    private int emp_id;
    private int anninfo_code;
    public void setAnnualTime(double annualTime) {
    }
}
