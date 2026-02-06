package com.bugsnag.android;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.bugsnag.android.n0  reason: case insensitive filesystem */
public final class C3259n0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f38786a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f38787b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38788c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38789d;

    public C3259n0(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f38786a = z10;
        this.f38787b = z11;
        this.f38788c = z12;
        this.f38789d = z13;
    }

    public final C3259n0 a() {
        return new C3259n0(this.f38786a, this.f38787b, this.f38788c, this.f38789d);
    }

    public final boolean b() {
        return this.f38786a;
    }

    public final boolean c() {
        return this.f38787b;
    }

    public final boolean d() {
        return this.f38788c;
    }

    public final boolean e() {
        return this.f38789d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3259n0) {
            C3259n0 n0Var = (C3259n0) obj;
            if (this.f38786a == n0Var.f38786a && this.f38787b == n0Var.f38787b && this.f38788c == n0Var.f38788c && this.f38789d == n0Var.f38789d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f38786a) * 31) + Boolean.hashCode(this.f38787b)) * 31) + Boolean.hashCode(this.f38788c)) * 31) + Boolean.hashCode(this.f38789d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3259n0(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public C3259n0(boolean z10) {
        this(z10, z10, z10, z10);
    }
}
