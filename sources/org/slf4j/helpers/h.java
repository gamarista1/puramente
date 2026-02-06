package org.slf4j.helpers;

import ci.c;
import ci.d;
import java.io.Serializable;

abstract class h implements c, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    h() {
    }

    public abstract String getName();

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return d.k(getName());
    }
}
