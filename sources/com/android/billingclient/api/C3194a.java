package com.android.billingclient.api;

import J4.C3035a;
import J4.C3036b;
import J4.C3037c;
import J4.C3038d;
import J4.C3039e;
import J4.C3040f;
import J4.C3041g;
import J4.C3042h;
import J4.C3044j;
import J4.C3045k;
import J4.C3046l;
import J4.C3047m;
import J4.C3048n;
import J4.E;
import J4.N;
import J4.o;
import J4.s;
import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.C3200g;
import com.google.android.gms.internal.play_billing.zze;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* renamed from: com.android.billingclient.api.a  reason: case insensitive filesystem */
public abstract class C3194a {

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.android.billingclient.api.a$a  reason: collision with other inner class name */
    public @interface C0618a {
    }

    /* renamed from: com.android.billingclient.api.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private volatile C3200g f38193a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f38194b;

        /* renamed from: c  reason: collision with root package name */
        private volatile C3047m f38195c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f38196d;

        /* renamed from: e  reason: collision with root package name */
        private volatile boolean f38197e;

        /* synthetic */ b(Context context, N n10) {
            this.f38194b = context;
        }

        private final boolean e() {
            try {
                return this.f38194b.getPackageManager().getApplicationInfo(this.f38194b.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }

        public C3194a a() {
            if (this.f38194b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.f38195c == null) {
                if (this.f38196d || this.f38197e) {
                    Context context = this.f38194b;
                    if (e()) {
                        return new L((String) null, context, (N) null, (ExecutorService) null);
                    }
                    return new C3195b((String) null, context, (N) null, (ExecutorService) null);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            } else if (this.f38193a == null || !this.f38193a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            } else if (this.f38195c != null) {
                C3200g gVar = this.f38193a;
                Context context2 = this.f38194b;
                C3047m mVar = this.f38195c;
                if (e()) {
                    return new L((String) null, gVar, context2, mVar, (s) null, (N) null, (ExecutorService) null);
                }
                return new C3195b((String) null, gVar, context2, mVar, (s) null, (N) null, (ExecutorService) null);
            } else {
                C3200g gVar2 = this.f38193a;
                Context context3 = this.f38194b;
                if (e()) {
                    return new L((String) null, gVar2, context3, (E) null, (N) null, (ExecutorService) null);
                }
                return new C3195b((String) null, gVar2, context3, (E) null, (N) null, (ExecutorService) null);
            }
        }

        public b b() {
            C3200g.a c10 = C3200g.c();
            c10.b();
            c(c10.a());
            return this;
        }

        public b c(C3200g gVar) {
            this.f38193a = gVar;
            return this;
        }

        public b d(C3047m mVar) {
            this.f38195c = mVar;
            return this;
        }
    }

    public static b h(Context context) {
        return new b(context, (N) null);
    }

    public abstract void a(C3035a aVar, C3036b bVar);

    public abstract void b(C3039e eVar, C3040f fVar);

    public abstract void c();

    public abstract void d(C3041g gVar, C3038d dVar);

    public abstract C3198e e(String str);

    public abstract boolean f();

    public abstract C3198e g(Activity activity, C3197d dVar);

    public abstract void i(C3202i iVar, C3044j jVar);

    public abstract void j(C3048n nVar, C3045k kVar);

    public abstract void k(o oVar, C3046l lVar);

    public abstract C3198e l(Activity activity, C3199f fVar, C3042h hVar);

    public abstract void m(C3037c cVar);
}
