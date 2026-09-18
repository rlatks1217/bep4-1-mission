package com.back.global.rsData;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RsData<T> { // 응답 데이터 formatting
    private final String resultCode;
    private final String msg;
    private final T data;
    // 실패할 경우를 대비해
    public RsData(String resultCode, String msg) {
        this(resultCode, msg, null);
    }
}