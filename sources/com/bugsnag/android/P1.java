package com.bugsnag.android;

import L4.d;
import android.util.JsonReader;
import com.bugsnag.android.C3238g0;
import com.bugsnag.android.L1;
import com.bugsnag.android.v1;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

public final class P1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f38567a;

    /* renamed from: b  reason: collision with root package name */
    private final d f38568b;

    /* renamed from: c  reason: collision with root package name */
    private final d f38569c;

    /* renamed from: d  reason: collision with root package name */
    private final d f38570d;

    /* renamed from: e  reason: collision with root package name */
    private final S0 f38571e;

    /* renamed from: f  reason: collision with root package name */
    private final y1 f38572f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f38573g;

    /* synthetic */ class a extends C6494p implements C6798l {
        a(Object obj) {
            super(1, obj, L1.a.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/User;", 0);
        }

        /* renamed from: i */
        public final L1 invoke(JsonReader jsonReader) {
            return ((L1.a) this.receiver).a(jsonReader);
        }
    }

    public P1(boolean z10, d dVar, d dVar2, File file, d dVar3, S0 s02) {
        this.f38567a = z10;
        this.f38568b = dVar;
        this.f38569c = dVar2;
        this.f38570d = dVar3;
        this.f38571e = s02;
        this.f38573g = new AtomicReference((Object) null);
        this.f38572f = new y1(file);
    }

    /* access modifiers changed from: private */
    public static final void c(P1 p12, v1 v1Var) {
        if (v1Var instanceof v1.s) {
            p12.e(((v1.s) v1Var).f38943a);
        }
    }

    private final L1 d() {
        String str = null;
        if (((r1) this.f38570d.get()).c()) {
            r1 r1Var = (r1) this.f38570d.get();
            C3238g0.c cVar = (C3238g0.c) this.f38569c.get();
            if (cVar != null) {
                str = cVar.a();
            }
            L1 d10 = r1Var.d(str);
            e(d10);
            return d10;
        } else if (!this.f38572f.a().canRead() || this.f38572f.a().length() <= 0 || !this.f38567a) {
            return null;
        } else {
            try {
                return (L1) this.f38572f.b(new a(L1.f38529d));
            } catch (Exception e10) {
                this.f38571e.b("Failed to load user info", e10);
                return null;
            }
        }
    }

    private final boolean f(L1 l12) {
        if (l12.b() == null && l12.c() == null && l12.a() == null) {
            return false;
        }
        return true;
    }

    public final N1 b(L1 l12) {
        N1 n12;
        String str;
        if (!f(l12)) {
            if (this.f38567a) {
                l12 = d();
            } else {
                l12 = null;
            }
        }
        if (l12 == null || !f(l12)) {
            C3238g0.c cVar = (C3238g0.c) this.f38569c.get();
            if (cVar == null) {
                str = null;
            } else {
                str = cVar.a();
            }
            n12 = new N1(new L1(str, (String) null, (String) null));
        } else {
            n12 = new N1(l12);
        }
        n12.addObserver(new O1(this));
        return n12;
    }

    public final void e(L1 l12) {
        if (this.f38567a && !C6496s.c(l12, this.f38573g.getAndSet(l12))) {
            try {
                this.f38572f.c(l12);
            } catch (Exception e10) {
                this.f38571e.b("Failed to persist user info", e10);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P1(boolean z10, d dVar, d dVar2, File file, d dVar3, S0 s02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, dVar, dVar2, (i10 & 8) != 0 ? new File((File) dVar.get(), "user-info") : file, dVar3, s02);
    }
}
