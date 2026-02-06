package com.facebook;

import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3902s;
import u7.C4098e;

/* renamed from: com.facebook.v  reason: case insensitive filesystem */
public class C3459v extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42565a = new a((DefaultConstructorMarker) null);
    public static final long serialVersionUID = 1;

    /* renamed from: com.facebook.v$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3459v() {
    }

    /* access modifiers changed from: private */
    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                C4098e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    public C3459v(String str) {
        super(str);
        Random random = new Random();
        if (str != null && I.G() && random.nextInt(100) > 50) {
            C3902s.a(C3902s.b.ErrorReport, new C3458u(str));
        }
    }

    public C3459v(String str, Throwable th2) {
        super(str, th2);
    }

    public C3459v(Throwable th2) {
        super(th2);
    }
}
