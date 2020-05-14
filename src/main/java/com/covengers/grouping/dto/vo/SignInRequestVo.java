package com.covengers.grouping.dto.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class SignInRequestVo {
    private final String email;
    private final String password;
}
