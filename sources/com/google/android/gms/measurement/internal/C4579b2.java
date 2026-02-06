package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.b2  reason: case insensitive filesystem */
final class C4579b2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C4586c2 f55014a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55015b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f55016c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f55017d;

    /* renamed from: e  reason: collision with root package name */
    private final String f55018e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f55019f;

    public final void run() {
        this.f55014a.a(this.f55018e, this.f55015b, this.f55016c, this.f55017d, this.f55019f);
    }

    private C4579b2(String str, C4586c2 c2Var, int i10, Throwable th2, byte[] bArr, Map map) {
        C4536s.l(c2Var);
        this.f55014a = c2Var;
        this.f55015b = i10;
        this.f55016c = th2;
        this.f55017d = bArr;
        this.f55018e = str;
        this.f55019f = map;
    }
}
