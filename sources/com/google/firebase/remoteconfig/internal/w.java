package com.google.firebase.remoteconfig.internal;

import Dc.r;
import Dc.t;

public class w implements r {

    /* renamed from: a  reason: collision with root package name */
    private final long f57940a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57941b;

    /* renamed from: c  reason: collision with root package name */
    private final t f57942c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f57943a;

        /* renamed from: b  reason: collision with root package name */
        private int f57944b;

        /* renamed from: c  reason: collision with root package name */
        private t f57945c;

        public w a() {
            return new w(this.f57943a, this.f57944b, this.f57945c);
        }

        /* access modifiers changed from: package-private */
        public b b(t tVar) {
            this.f57945c = tVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b c(int i10) {
            this.f57944b = i10;
            return this;
        }

        public b d(long j10) {
            this.f57943a = j10;
            return this;
        }

        private b() {
        }
    }

    static b d() {
        return new b();
    }

    public long a() {
        return this.f57940a;
    }

    public t b() {
        return this.f57942c;
    }

    public int c() {
        return this.f57941b;
    }

    private w(long j10, int i10, t tVar) {
        this.f57940a = j10;
        this.f57941b = i10;
        this.f57942c = tVar;
    }
}
