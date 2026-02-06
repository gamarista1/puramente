package com.bugsnag.android;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum V {
    DELIVERED,
    UNDELIVERED,
    FAILURE;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f38608a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V a(int i10) {
            if (200 <= i10 && i10 < 300) {
                return V.DELIVERED;
            }
            if (400 > i10 || i10 >= 500 || i10 == 408 || i10 == 429) {
                return V.UNDELIVERED;
            }
            return V.FAILURE;
        }

        private a() {
        }
    }

    static {
        f38608a = new a((DefaultConstructorMarker) null);
    }
}
