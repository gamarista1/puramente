package androidx.compose.ui.platform;

import J0.n0;
import O0.h;
import java.util.List;

/* renamed from: androidx.compose.ui.platform.h1  reason: case insensitive filesystem */
public final class C1636h1 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f13748a;

    /* renamed from: b  reason: collision with root package name */
    private final List f13749b;

    /* renamed from: c  reason: collision with root package name */
    private Float f13750c;

    /* renamed from: d  reason: collision with root package name */
    private Float f13751d;

    /* renamed from: e  reason: collision with root package name */
    private h f13752e;

    /* renamed from: f  reason: collision with root package name */
    private h f13753f;

    public C1636h1(int i10, List list, Float f10, Float f11, h hVar, h hVar2) {
        this.f13748a = i10;
        this.f13749b = list;
        this.f13750c = f10;
        this.f13751d = f11;
        this.f13752e = hVar;
        this.f13753f = hVar2;
    }

    public boolean Y0() {
        return this.f13749b.contains(this);
    }

    public final h a() {
        return this.f13752e;
    }

    public final Float b() {
        return this.f13750c;
    }

    public final Float c() {
        return this.f13751d;
    }

    public final int d() {
        return this.f13748a;
    }

    public final h e() {
        return this.f13753f;
    }

    public final void f(h hVar) {
        this.f13752e = hVar;
    }

    public final void g(Float f10) {
        this.f13750c = f10;
    }

    public final void h(Float f10) {
        this.f13751d = f10;
    }

    public final void i(h hVar) {
        this.f13753f = hVar;
    }
}
