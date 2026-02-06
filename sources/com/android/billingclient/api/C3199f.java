package com.android.billingclient.api;

import J4.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.android.billingclient.api.f  reason: case insensitive filesystem */
public final class C3199f {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f38271a;

    /* renamed from: com.android.billingclient.api.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Set f38272a = new HashSet();

        public a a(int i10) {
            this.f38272a.add(Integer.valueOf(i10));
            return this;
        }

        public C3199f b() {
            return new C3199f(this.f38272a, (G) null);
        }
    }

    /* synthetic */ C3199f(Set set, G g10) {
        this.f38271a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static a a() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public final ArrayList b() {
        return this.f38271a;
    }
}
