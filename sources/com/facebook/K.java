package com.facebook;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class K extends C3459v {

    /* renamed from: c  reason: collision with root package name */
    public static final a f39308c = new a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;

    /* renamed from: b  reason: collision with root package name */
    private final C3462y f39309b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K(C3462y yVar, String str) {
        super(str);
        C6496s.h(yVar, "requestError");
        this.f39309b = yVar;
    }

    public final C3462y c() {
        return this.f39309b;
    }

    public String toString() {
        String str = "{FacebookServiceException: " + "httpResponseCode: " + this.f39309b.k() + ", facebookErrorCode: " + this.f39309b.c() + ", facebookErrorType: " + this.f39309b.e() + ", message: " + this.f39309b.d() + "}";
        C6496s.g(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
