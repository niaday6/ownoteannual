package com.project.ownote.annual.dto;

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
    private double annual_time;
    private int anninfo_code;
    private int anncheck_id;
    private int emp_id;

    public void setAnnualTime(double annualTime) {
    }
}
