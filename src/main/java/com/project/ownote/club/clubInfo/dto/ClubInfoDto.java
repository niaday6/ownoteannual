package com.project.ownote.club.clubInfo.dto;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import lombok.*;

import java.sql.Timestamp;
import java.time.DateTimeException;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClubInfoDto {  //Club DB all data

    private Long club_id;
    private String emp_name;    // emp_name ( emp table import_)
    private String club_name;
    private String club_sub;
    private Date club_regdate;



}
