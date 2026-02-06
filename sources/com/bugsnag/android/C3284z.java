package com.bugsnag.android;

import K4.m;
import K4.o;
import android.support.v4.media.session.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

/* renamed from: com.bugsnag.android.z  reason: case insensitive filesystem */
public final class C3284z {

    /* renamed from: f  reason: collision with root package name */
    public static final a f38994f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Collection f38995a;

    /* renamed from: b  reason: collision with root package name */
    private final Collection f38996b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection f38997c;

    /* renamed from: d  reason: collision with root package name */
    private final List f38998d;

    /* renamed from: e  reason: collision with root package name */
    private m f38999e;

    /* renamed from: com.bugsnag.android.z$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3284z(Collection collection, Collection collection2, Collection collection3, List list) {
        this.f38995a = collection;
        this.f38996b = collection2;
        this.f38997c = collection3;
        this.f38998d = list;
        this.f38999e = new o();
    }

    private final Map b() {
        HashMap hashMap = new HashMap();
        if (c().size() > 0) {
            hashMap.put("onBreadcrumb", Integer.valueOf(c().size()));
        }
        if (d().size() > 0) {
            hashMap.put("onError", Integer.valueOf(d().size()));
        }
        if (e().size() > 0) {
            hashMap.put("onSendError", Integer.valueOf(e().size()));
        }
        if (f().size() > 0) {
            hashMap.put("onSession", Integer.valueOf(f().size()));
        }
        return hashMap;
    }

    public void a(C3242h1 h1Var) {
        if (this.f38995a.add(h1Var)) {
            this.f38999e.d("onError");
        }
    }

    public final Collection c() {
        return this.f38996b;
    }

    public final Collection d() {
        return this.f38995a;
    }

    public final List e() {
        return this.f38998d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3284z)) {
            return false;
        }
        C3284z zVar = (C3284z) obj;
        return C6496s.c(this.f38995a, zVar.f38995a) && C6496s.c(this.f38996b, zVar.f38996b) && C6496s.c(this.f38997c, zVar.f38997c) && C6496s.c(this.f38998d, zVar.f38998d);
    }

    public final Collection f() {
        return this.f38997c;
    }

    public final boolean g(Breadcrumb breadcrumb, S0 s02) {
        if (this.f38996b.isEmpty()) {
            return true;
        }
        for (Object a10 : this.f38996b) {
            c.a(a10);
            try {
                throw null;
            } catch (Throwable th2) {
                s02.b("OnBreadcrumbCallback threw an Exception", th2);
            }
        }
        return true;
    }

    public final boolean h(C3262o0 o0Var, S0 s02) {
        if (this.f38995a.isEmpty()) {
            return true;
        }
        for (C3242h1 a10 : this.f38995a) {
            try {
                if (!a10.a(o0Var)) {
                    return false;
                }
            } catch (Throwable th2) {
                s02.b("OnBreadcrumbCallback threw an Exception", th2);
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f38995a.hashCode() * 31) + this.f38996b.hashCode()) * 31) + this.f38997c.hashCode()) * 31) + this.f38998d.hashCode();
    }

    public final boolean i(C3262o0 o0Var, S0 s02) {
        for (Object a10 : this.f38998d) {
            c.a(a10);
            try {
                throw null;
            } catch (Throwable th2) {
                s02.b("OnSendCallback threw an Exception", th2);
            }
        }
        return true;
    }

    public final boolean j(C6787a aVar, S0 s02) {
        if (this.f38998d.isEmpty()) {
            return true;
        }
        return i((C3262o0) aVar.invoke(), s02);
    }

    public final boolean k(C3254l1 l1Var, S0 s02) {
        if (this.f38997c.isEmpty()) {
            return true;
        }
        for (Object a10 : this.f38997c) {
            c.a(a10);
            try {
                throw null;
            } catch (Throwable th2) {
                s02.b("OnSessionCallback threw an Exception", th2);
            }
        }
        return true;
    }

    public final void l(m mVar) {
        this.f38999e = mVar;
        mVar.a(b());
    }

    public String toString() {
        return "CallbackState(onErrorTasks=" + this.f38995a + ", onBreadcrumbTasks=" + this.f38996b + ", onSessionTasks=" + this.f38997c + ", onSendTasks=" + this.f38998d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3284z(Collection collection, Collection collection2, Collection collection3, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CopyOnWriteArrayList() : collection, (i10 & 2) != 0 ? new CopyOnWriteArrayList() : collection2, (i10 & 4) != 0 ? new CopyOnWriteArrayList() : collection3, (i10 & 8) != 0 ? new CopyOnWriteArrayList() : list);
    }
}
