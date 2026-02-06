package com.bugsnag.android;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum E1 {
    ALWAYS,
    UNHANDLED_ONLY,
    NEVER;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f38474a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E1 a(String str) {
            E1 e12;
            E1[] values = E1.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    e12 = null;
                    break;
                }
                e12 = values[i10];
                i10++;
                if (C6496s.c(e12.name(), str)) {
                    break;
                }
            }
            if (e12 == null) {
                return E1.ALWAYS;
            }
            return e12;
        }

        private a() {
        }
    }

    static {
        f38474a = new a((DefaultConstructorMarker) null);
    }
}
