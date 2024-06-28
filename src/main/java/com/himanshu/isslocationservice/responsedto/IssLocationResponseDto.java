package com.himanshu.isslocationservice.responsedto;

import com.himanshu.isslocationservice.entity.IssPosition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class IssLocationResponseDto {

    private long timestamp;
    private String message;
    private IssPosition iss_position;
}
