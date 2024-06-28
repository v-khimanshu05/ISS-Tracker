package com.himanshu.isslocationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "isslocations")
public class ISSLocation {
    private Integer id;
    private long timestamp;
    private String message;
    private IssPosition issPosition;
}
