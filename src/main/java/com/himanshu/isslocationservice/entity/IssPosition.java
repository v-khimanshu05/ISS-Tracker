package com.himanshu.isslocationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class IssPosition {

    private String latitude;
    private String longitude;
}
