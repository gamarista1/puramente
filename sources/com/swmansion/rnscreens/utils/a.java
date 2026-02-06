package com.swmansion.rnscreens.utils;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0879a f59925c = new C0879a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final a f59926d = new a(new b(Integer.MIN_VALUE, false), 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final b f59927a;

    /* renamed from: b  reason: collision with root package name */
    private final float f59928b;

    /* renamed from: com.swmansion.rnscreens.utils.a$a  reason: collision with other inner class name */
    public static final class C0879a {
        public /* synthetic */ C0879a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f59926d;
        }

        private C0879a() {
        }
    }

    public a(b bVar, float f10) {
        C6496s.h(bVar, "cacheKey");
        this.f59927a = bVar;
        this.f59928b = f10;
    }

    public final float b() {
        return this.f59928b;
    }

    public final boolean c(b bVar) {
        C6496s.h(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        if (this.f59927a.a() == Integer.MIN_VALUE || !C6496s.c(this.f59927a, bVar)) {
            return false;
        }
        return true;
    }
}
