package com.facebook.react.views.scroll;

import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    private static final a f41940f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private int f41941a = Integer.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private int f41942b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private float f41943c;

    /* renamed from: d  reason: collision with root package name */
    private float f41944d;

    /* renamed from: e  reason: collision with root package name */
    private long f41945e = -11;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final float a() {
        return this.f41943c;
    }

    public final float b() {
        return this.f41944d;
    }

    public final boolean c(int i10, int i11) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f41945e;
        if (uptimeMillis - j10 <= 10 && this.f41941a == i10 && this.f41942b == i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (uptimeMillis - j10 != 0) {
            this.f41943c = ((float) (i10 - this.f41941a)) / ((float) (uptimeMillis - j10));
            this.f41944d = ((float) (i11 - this.f41942b)) / ((float) (uptimeMillis - j10));
        }
        this.f41945e = uptimeMillis;
        this.f41941a = i10;
        this.f41942b = i11;
        return z10;
    }
}
