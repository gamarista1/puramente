package com.android.billingclient.api;

import J4.B;
import com.google.android.gms.internal.play_billing.zze;

/* renamed from: com.android.billingclient.api.e  reason: case insensitive filesystem */
public final class C3198e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f38265a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f38266b;

    /* renamed from: com.android.billingclient.api.e$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f38267a;

        /* renamed from: b  reason: collision with root package name */
        private String f38268b = "";

        /* synthetic */ a(B b10) {
        }

        public C3198e a() {
            C3198e eVar = new C3198e();
            eVar.f38265a = this.f38267a;
            eVar.f38266b = this.f38268b;
            return eVar;
        }

        public a b(String str) {
            this.f38268b = str;
            return this;
        }

        public a c(int i10) {
            this.f38267a = i10;
            return this;
        }
    }

    public static a c() {
        return new a((B) null);
    }

    public String a() {
        return this.f38266b;
    }

    public int b() {
        return this.f38265a;
    }

    public String toString() {
        String zzi = zze.zzi(this.f38265a);
        String str = this.f38266b;
        return "Response Code: " + zzi + ", Debug Message: " + str;
    }
}
