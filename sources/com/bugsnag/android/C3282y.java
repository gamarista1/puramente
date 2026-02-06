package com.bugsnag.android;

import K4.k;

/* renamed from: com.bugsnag.android.y  reason: case insensitive filesystem */
public final class C3282y {

    /* renamed from: a  reason: collision with root package name */
    private final C f38972a = new C();

    /* renamed from: b  reason: collision with root package name */
    private final C3284z f38973b;

    /* renamed from: c  reason: collision with root package name */
    private final L f38974c;

    /* renamed from: d  reason: collision with root package name */
    private final BreadcrumbState f38975d;

    /* renamed from: e  reason: collision with root package name */
    private final Z0 f38976e;

    /* renamed from: f  reason: collision with root package name */
    private final B0 f38977f;

    public C3282y(k kVar, G g10) {
        C3284z zVar = g10.f38481a.f38450c;
        this.f38973b = zVar;
        L l10 = new L();
        if (g10.f() != null) {
            l10.e(g10.f());
        }
        this.f38974c = l10;
        this.f38975d = new BreadcrumbState(kVar.s(), zVar, kVar.r());
        this.f38976e = a(g10);
        this.f38977f = g10.f38481a.f38452e.e();
    }

    private final Z0 a(G g10) {
        return g10.f38481a.f38451d.f(g10.f38481a.f38451d.h().e());
    }

    public final BreadcrumbState b() {
        return this.f38975d;
    }

    public final C3284z c() {
        return this.f38973b;
    }

    public final C d() {
        return this.f38972a;
    }

    public final L e() {
        return this.f38974c;
    }

    public final B0 f() {
        return this.f38977f;
    }

    public final Z0 g() {
        return this.f38976e;
    }
}
