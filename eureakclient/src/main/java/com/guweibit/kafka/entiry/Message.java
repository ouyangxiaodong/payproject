package com.guweibit.kafka.entiry;

import lombok.Data;

@Data
public class Message {
    private String id;
    private String messageInfo;
    private String status;
    private String createTime;
}

