package com.YJ.PMS.request;

import lombok.Data;

@Data
public class CreateCommentRequest {
    private String comment;
    private Long issueId;
}
