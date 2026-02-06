package com.facebook.react.uimanager;

import java.util.Comparator;

public class u0 {

    /* renamed from: c  reason: collision with root package name */
    public static Comparator f41821c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f41822a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41823b;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(u0 u0Var, u0 u0Var2) {
            return u0Var.f41823b - u0Var2.f41823b;
        }
    }

    public u0(int i10, int i11) {
        this.f41822a = i10;
        this.f41823b = i11;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f41823b == u0Var.f41823b && this.f41822a == u0Var.f41822a) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "[" + this.f41822a + ", " + this.f41823b + "]";
    }
}
