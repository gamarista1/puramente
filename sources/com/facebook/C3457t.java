package com.facebook;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.t  reason: case insensitive filesystem */
public final class C3457t extends C3459v {

    /* renamed from: d  reason: collision with root package name */
    public static final a f42561d = new a((DefaultConstructorMarker) null);
    public static final long serialVersionUID = 1;

    /* renamed from: b  reason: collision with root package name */
    private final int f42562b;

    /* renamed from: c  reason: collision with root package name */
    private final String f42563c;

    /* renamed from: com.facebook.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3457t(String str, int i10, String str2) {
        super(str);
        this.f42562b = i10;
        this.f42563c = str2;
    }

    public String toString() {
        String str = "{FacebookDialogException: " + "errorCode: " + this.f42562b + ", message: " + getMessage() + ", url: " + this.f42563c + "}";
        C6496s.g(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
