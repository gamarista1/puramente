package com.bugsnag.android;

import java.util.Map;

class M1 {
    M1() {
    }

    public L1 a(Map map) {
        return new L1((String) U0.c(map, "id"), (String) U0.c(map, "email"), (String) U0.c(map, "name"));
    }
}
