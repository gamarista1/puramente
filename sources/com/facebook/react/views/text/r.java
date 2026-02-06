package com.facebook.react.views.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum r {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f42225a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str, r rVar) {
            if (str != null) {
                return s.a(str, rVar);
            }
            return null;
        }

        private a() {
        }
    }

    static {
        r[] a10;
        f42232h = C6714a.a(a10);
        f42225a = new a((DefaultConstructorMarker) null);
    }

    public static final String b(String str, r rVar) {
        return f42225a.a(str, rVar);
    }
}
