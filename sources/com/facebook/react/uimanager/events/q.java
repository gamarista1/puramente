package com.facebook.react.uimanager.events;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum q {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f41664b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f41671a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(q qVar) {
            C6496s.h(qVar, "type");
            return qVar.c();
        }

        private a() {
        }
    }

    static {
        q[] a10;
        f41670h = C6714a.a(a10);
        f41664b = new a((DefaultConstructorMarker) null);
    }

    private q(String str) {
        this.f41671a = str;
    }

    public static final String b(q qVar) {
        return f41664b.a(qVar);
    }

    public final String c() {
        return this.f41671a;
    }
}
