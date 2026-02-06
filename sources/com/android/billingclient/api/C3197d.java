package com.android.billingclient.api;

import J4.A;
import J4.y;
import J4.z;
import android.text.TextUtils;
import com.android.billingclient.api.C3201h;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.android.billingclient.api.d  reason: case insensitive filesystem */
public class C3197d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f38239a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f38240b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f38241c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public c f38242d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzco f38243e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f38244f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f38245g;

    /* renamed from: com.android.billingclient.api.d$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f38246a;

        /* renamed from: b  reason: collision with root package name */
        private String f38247b;

        /* renamed from: c  reason: collision with root package name */
        private List f38248c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList f38249d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f38250e;

        /* renamed from: f  reason: collision with root package name */
        private c.a f38251f;

        /* synthetic */ a(A a10) {
            c.a a11 = c.a();
            c.a unused = a11.f38261c = true;
            this.f38251f = a11;
        }

        public C3197d a() {
            boolean z10;
            boolean z11;
            ArrayList arrayList;
            zzco zzco;
            ArrayList arrayList2 = this.f38249d;
            boolean z12 = true;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            List list = this.f38248c;
            if (list == null || list.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z10 && !z11) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            } else if (!z10 || !z11) {
                if (!z10) {
                    this.f38248c.forEach(new z());
                } else if (this.f38249d.contains((Object) null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                } else if (this.f38249d.size() > 1) {
                    android.support.v4.media.session.c.a(this.f38249d.get(0));
                    throw null;
                }
                C3197d dVar = new C3197d((A) null);
                if (!z10) {
                    if (!z11 || ((b) this.f38248c.get(0)).b().h().isEmpty()) {
                        z12 = false;
                    }
                    dVar.f38239a = z12;
                    dVar.f38240b = this.f38246a;
                    dVar.f38241c = this.f38247b;
                    dVar.f38242d = this.f38251f.a();
                    ArrayList arrayList3 = this.f38249d;
                    if (arrayList3 != null) {
                        arrayList = new ArrayList(arrayList3);
                    } else {
                        arrayList = new ArrayList();
                    }
                    dVar.f38244f = arrayList;
                    dVar.f38245g = this.f38250e;
                    List list2 = this.f38248c;
                    if (list2 != null) {
                        zzco = zzco.zzk(list2);
                    } else {
                        zzco = zzco.zzl();
                    }
                    dVar.f38243e = zzco;
                    return dVar;
                }
                android.support.v4.media.session.c.a(this.f38249d.get(0));
                throw null;
            } else {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
        }

        public a b(boolean z10) {
            this.f38250e = z10;
            return this;
        }

        public a c(String str) {
            this.f38246a = str;
            return this;
        }

        public a d(List list) {
            this.f38248c = new ArrayList(list);
            return this;
        }

        public a e(c cVar) {
            this.f38251f = c.c(cVar);
            return this;
        }
    }

    /* renamed from: com.android.billingclient.api.d$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C3201h f38252a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38253b;

        /* renamed from: com.android.billingclient.api.d$b$a */
        public static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public C3201h f38254a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f38255b;

            /* synthetic */ a(A a10) {
            }

            public b a() {
                zzbe.zzc(this.f38254a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f38254a.f() != null) {
                    zzbe.zzc(this.f38255b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, (A) null);
            }

            public a b(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f38255b = str;
                    return this;
                }
                throw new IllegalArgumentException("offerToken can not be empty");
            }

            public a c(C3201h hVar) {
                this.f38254a = hVar;
                if (hVar.c() != null) {
                    hVar.c().getClass();
                    C3201h.b c10 = hVar.c();
                    if (c10.e() != null) {
                        this.f38255b = c10.e();
                    }
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, A a10) {
            this.f38252a = aVar.f38254a;
            this.f38253b = aVar.f38255b;
        }

        public static a a() {
            return new a((A) null);
        }

        public final C3201h b() {
            return this.f38252a;
        }

        public final String c() {
            return this.f38253b;
        }
    }

    /* renamed from: com.android.billingclient.api.d$c */
    public static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f38256a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f38257b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f38258c = 0;

        /* renamed from: com.android.billingclient.api.d$c$a */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private String f38259a;

            /* renamed from: b  reason: collision with root package name */
            private String f38260b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f38261c;

            /* renamed from: d  reason: collision with root package name */
            private int f38262d = 0;

            /* synthetic */ a(A a10) {
            }

            public c a() {
                boolean z10 = true;
                if (TextUtils.isEmpty(this.f38259a) && TextUtils.isEmpty((CharSequence) null)) {
                    z10 = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.f38260b);
                if (z10 && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                } else if (this.f38261c || z10 || !isEmpty) {
                    c cVar = new c((A) null);
                    cVar.f38256a = this.f38259a;
                    cVar.f38258c = this.f38262d;
                    cVar.f38257b = this.f38260b;
                    return cVar;
                } else {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
            }

            public a b(String str) {
                this.f38259a = str;
                return this;
            }

            public a c(String str) {
                this.f38260b = str;
                return this;
            }

            public a d(int i10) {
                this.f38262d = i10;
                return this;
            }

            public final a f(String str) {
                this.f38259a = str;
                return this;
            }
        }

        /* synthetic */ c(A a10) {
        }

        public static a a() {
            return new a((A) null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a a10 = a();
            a10.f(cVar.f38256a);
            a10.d(cVar.f38258c);
            a10.c(cVar.f38257b);
            return a10;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            return this.f38258c;
        }

        /* access modifiers changed from: package-private */
        public final String d() {
            return this.f38256a;
        }

        /* access modifiers changed from: package-private */
        public final String e() {
            return this.f38257b;
        }
    }

    /* synthetic */ C3197d(A a10) {
    }

    public static a a() {
        return new a((A) null);
    }

    public final int b() {
        return this.f38242d.b();
    }

    /* access modifiers changed from: package-private */
    public final C3198e c() {
        if (this.f38243e.isEmpty()) {
            return O.f38144l;
        }
        b bVar = (b) this.f38243e.get(0);
        for (int i10 = 1; i10 < this.f38243e.size(); i10++) {
            b bVar2 = (b) this.f38243e.get(i10);
            if (!bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                return O.a(5, "All products should have same ProductType.");
            }
        }
        String h10 = bVar.b().h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        zzco zzco = this.f38243e;
        int size = zzco.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar3 = (b) zzco.get(i11);
            bVar3.b().e().equals("subs");
            if (hashSet.contains(bVar3.b().d())) {
                return O.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", new Object[]{bVar3.b().d()}));
            }
            hashSet.add(bVar3.b().d());
            if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !h10.equals(bVar3.b().h())) {
                return O.a(5, "All products must have the same package name.");
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.contains(str)) {
                return O.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", new Object[]{str}));
            }
        }
        C3201h.b c10 = bVar.b().c();
        if (c10 == null || c10.d() == null) {
            return O.f38144l;
        }
        return O.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    public final String d() {
        return this.f38240b;
    }

    public final String e() {
        return this.f38241c;
    }

    public final String f() {
        return this.f38242d.d();
    }

    public final String g() {
        return this.f38242d.e();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f38244f);
        return arrayList;
    }

    public final List i() {
        return this.f38243e;
    }

    public final boolean q() {
        return this.f38245g;
    }

    /* access modifiers changed from: package-private */
    public final boolean r() {
        if (this.f38240b == null && this.f38241c == null && this.f38242d.e() == null && this.f38242d.b() == 0 && !this.f38243e.stream().anyMatch(new y()) && !this.f38239a && !this.f38245g) {
            return false;
        }
        return true;
    }
}
