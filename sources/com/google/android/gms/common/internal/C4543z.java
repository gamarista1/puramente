package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;

/* renamed from: com.google.android.gms.common.internal.z  reason: case insensitive filesystem */
public class C4543z implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final C4543z f54253b = a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f54254a;

    /* renamed from: com.google.android.gms.common.internal.z$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f54255a;

        /* synthetic */ a(D d10) {
        }

        public C4543z a() {
            return new C4543z(this.f54255a, (E) null);
        }
    }

    /* synthetic */ C4543z(String str, E e10) {
        this.f54254a = str;
    }

    public static a a() {
        return new a((D) null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f54254a;
        if (str != null) {
            bundle.putString(MetricTracker.Place.API, str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4543z)) {
            return false;
        }
        return C4535q.b(this.f54254a, ((C4543z) obj).f54254a);
    }

    public final int hashCode() {
        return C4535q.c(this.f54254a);
    }
}
