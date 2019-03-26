package com.suse.hl.clazzmenoir.common.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
@NoArgsConstructor
public class CommRequest {
    private Integer pageNum = 1;
    private Integer pageSize = Integer.MAX_VALUE;
    private String keyword;
    public String getKeywordLike() {
        return StringUtils.isNotBlank(keyword) ? '%' + keyword.trim() + '%' : null;
    }
}
