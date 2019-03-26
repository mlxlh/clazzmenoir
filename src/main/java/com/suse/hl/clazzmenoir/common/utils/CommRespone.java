package com.suse.hl.clazzmenoir.common.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CommRespone<T> {
    private long total;
    private List<T> data;

    public CommRespone() {
    }

    public CommRespone(long total) {
        this.total = total;
    }

    public CommRespone(List<T> data) {
        this.data = data;
    }

    public CommRespone(long total, List<T> data) {
        this.total = total;
        this.data = data;
    }

}
