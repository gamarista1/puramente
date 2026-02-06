package com.facebook.react.views.text;

import android.text.Spannable;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f42155k = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f42156a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42157b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f42158c;

    /* renamed from: d  reason: collision with root package name */
    private final float f42159d;

    /* renamed from: e  reason: collision with root package name */
    private final float f42160e;

    /* renamed from: f  reason: collision with root package name */
    private final float f42161f;

    /* renamed from: g  reason: collision with root package name */
    private final float f42162g;

    /* renamed from: h  reason: collision with root package name */
    private final int f42163h;

    /* renamed from: i  reason: collision with root package name */
    private final int f42164i;

    /* renamed from: j  reason: collision with root package name */
    private final int f42165j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(Spannable spannable, int i10, int i11, int i12, int i13) {
            C6496s.h(spannable, AttributeType.TEXT);
            return new g(spannable, i10, false, i11, i12, i13);
        }

        private a() {
        }
    }

    public g(Spannable spannable, int i10, boolean z10, float f10, float f11, float f12, float f13, int i11, int i12, int i13) {
        C6496s.h(spannable, AttributeType.TEXT);
        this.f42156a = spannable;
        this.f42157b = i10;
        this.f42158c = z10;
        this.f42159d = f10;
        this.f42160e = f11;
        this.f42161f = f12;
        this.f42162g = f13;
        this.f42163h = i11;
        this.f42164i = i12;
        this.f42165j = i13;
    }

    public static final g a(Spannable spannable, int i10, int i11, int i12, int i13) {
        return f42155k.a(spannable, i10, i11, i12, i13);
    }

    public final boolean b() {
        return this.f42158c;
    }

    public final int c() {
        return this.f42157b;
    }

    public final int d() {
        return this.f42165j;
    }

    public final float e() {
        return this.f42162g;
    }

    public final float f() {
        return this.f42159d;
    }

    public final float g() {
        return this.f42161f;
    }

    public final float h() {
        return this.f42160e;
    }

    public final Spannable i() {
        return this.f42156a;
    }

    public final int j() {
        return this.f42163h;
    }

    public final int k() {
        return this.f42164i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(Spannable spannable, int i10, boolean z10, int i11, int i12, int i13) {
        this(spannable, i10, z10, -1.0f, -1.0f, -1.0f, -1.0f, i11, i12, i13);
        C6496s.h(spannable, AttributeType.TEXT);
    }
}
