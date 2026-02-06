package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import ya.C5286c;

/* renamed from: com.google.android.gms.common.api.internal.w  reason: case insensitive filesystem */
public abstract class C4510w {

    /* renamed from: a  reason: collision with root package name */
    private final C5286c[] f54075a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54076b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54077c;

    /* renamed from: com.google.android.gms.common.api.internal.w$a */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public r f54078a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f54079b = true;

        /* renamed from: c  reason: collision with root package name */
        private C5286c[] f54080c;

        /* renamed from: d  reason: collision with root package name */
        private int f54081d = 0;

        /* synthetic */ a(h0 h0Var) {
        }

        public C4510w a() {
            boolean z10;
            if (this.f54078a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C4536s.b(z10, "execute parameter required");
            return new g0(this, this.f54080c, this.f54079b, this.f54081d);
        }

        public a b(r rVar) {
            this.f54078a = rVar;
            return this;
        }

        public a c(boolean z10) {
            this.f54079b = z10;
            return this;
        }

        public a d(C5286c... cVarArr) {
            this.f54080c = cVarArr;
            return this;
        }

        public a e(int i10) {
            this.f54081d = i10;
            return this;
        }
    }

    protected C4510w(C5286c[] cVarArr, boolean z10, int i10) {
        this.f54075a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.f54076b = z11;
        this.f54077c = i10;
    }

    public static a a() {
        return new a((h0) null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(a.b bVar, TaskCompletionSource taskCompletionSource);

    public boolean c() {
        return this.f54076b;
    }

    public final int d() {
        return this.f54077c;
    }

    public final C5286c[] e() {
        return this.f54075a;
    }
}
