package com.back.shared.cash.dto;

import com.back.boundedContext.cash.domain.CashMember;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class CashMemberDto {
    int id;
    LocalDateTime createDate;
    LocalDateTime modifyDate;
    String username;
    String password;
    String nickname;
    int activityScore;

    public CashMemberDto(CashMember member) {
        this(
            member.getId(),
            member.getCreateDate(),
            member.getModifyDate(),
            member.getUsername(),
            "",
            member.getNickname(),
            member.getActivityScore()
        );
    }

}
