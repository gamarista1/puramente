package com.android.billingclient.api;

import J4.J;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.android.billingclient.api.i  reason: case insensitive filesystem */
public final class C3202i {

    /* renamed from: a  reason: collision with root package name */
    private final zzco f38309a;

    /* renamed from: com.android.billingclient.api.i$a */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public zzco f38310a;

        /* synthetic */ a(J j10) {
        }

        public C3202i a() {
            if (this.f38310a != null) {
                return new C3202i(this, (J) null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() <= 1) {
                this.f38310a = zzco.zzk(list);
                return this;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
    }

    /* renamed from: com.android.billingclient.api.i$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f38311a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38312b;

        /* renamed from: com.android.billingclient.api.i$b$a */
        public static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public String f38313a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f38314b;

            /* synthetic */ a(J j10) {
            }

            public b a() {
                if ("first_party".equals(this.f38314b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                } else if (this.f38313a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                } else if (this.f38314b != null) {
                    return new b(this, (J) null);
                } else {
                    throw new IllegalArgumentException("Product type must be provided.");
                }
            }

            public a b(String str) {
                this.f38313a = str;
                return this;
            }

            public a c(String str) {
                this.f38314b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, J j10) {
            this.f38311a = aVar.f38313a;
            this.f38312b = aVar.f38314b;
        }

        public static a a() {
            return new a((J) null);
        }

        public final String b() {
            return this.f38311a;
        }

        public final String c() {
            return this.f38312b;
        }
    }

    /* synthetic */ C3202i(a aVar, J j10) {
        this.f38309a = aVar.f38310a;
    }

    public static a a() {
        return new a((J) null);
    }

    public final zzco b() {
        return this.f38309a;
    }

    public final String c() {
        return ((b) this.f38309a.get(0)).c();
    }
}
