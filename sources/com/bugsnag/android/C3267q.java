package com.bugsnag.android;

import K4.s;
import K4.v;
import com.bugsnag.android.K0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bugsnag.android.q  reason: case insensitive filesystem */
public final class C3267q implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    public String f38822a;

    /* renamed from: b  reason: collision with root package name */
    public BreadcrumbType f38823b;

    /* renamed from: c  reason: collision with root package name */
    public Map f38824c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f38825d;

    public C3267q(String str, BreadcrumbType breadcrumbType, Map map, Date date) {
        this.f38822a = str;
        this.f38823b = breadcrumbType;
        this.f38824c = map;
        this.f38825d = date;
    }

    public final v a(int i10) {
        Map map = this.f38824c;
        if (map == null) {
            return new v(0, 0);
        }
        return s.f32405a.e(i10, map);
    }

    public void toStream(K0 k02) {
        k02.n();
        k02.y(DiagnosticsEntry.TIMESTAMP_KEY).E0(this.f38825d);
        k02.y("name").j0(this.f38822a);
        k02.y("type").j0(this.f38823b.toString());
        k02.y("metaData");
        k02.I0(this.f38824c, true);
        k02.t();
    }

    public C3267q(String str) {
        this(str, BreadcrumbType.MANUAL, new LinkedHashMap(), new Date());
    }
}
