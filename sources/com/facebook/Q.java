package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

public final class Q extends AbstractList {

    /* renamed from: g  reason: collision with root package name */
    public static final b f39347g = new b((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicInteger f39348h = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private Handler f39349a;

    /* renamed from: b  reason: collision with root package name */
    private int f39350b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39351c;

    /* renamed from: d  reason: collision with root package name */
    private List f39352d;

    /* renamed from: e  reason: collision with root package name */
    private List f39353e;

    /* renamed from: f  reason: collision with root package name */
    private String f39354f;

    public interface a {
        void a(Q q10);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public Q() {
        this.f39351c = String.valueOf(Integer.valueOf(f39348h.incrementAndGet()));
        this.f39353e = new ArrayList();
        this.f39352d = new ArrayList();
    }

    private final List k() {
        return M.f39311n.i(this);
    }

    private final P n() {
        return M.f39311n.l(this);
    }

    public final List A() {
        return this.f39352d;
    }

    public int C() {
        return this.f39352d.size();
    }

    public final int D() {
        return this.f39350b;
    }

    public /* bridge */ int E(M m10) {
        return super.indexOf(m10);
    }

    public /* bridge */ int H(M m10) {
        return super.lastIndexOf(m10);
    }

    /* renamed from: I */
    public final /* bridge */ M remove(int i10) {
        return P(i10);
    }

    public /* bridge */ boolean N(M m10) {
        return super.remove(m10);
    }

    public M P(int i10) {
        return (M) this.f39352d.remove(i10);
    }

    /* renamed from: Q */
    public M set(int i10, M m10) {
        C6496s.h(m10, "element");
        return (M) this.f39352d.set(i10, m10);
    }

    public final void R(Handler handler) {
        this.f39349a = handler;
    }

    public final void S(int i10) {
        if (i10 >= 0) {
            this.f39350b = i10;
            return;
        }
        throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.");
    }

    /* renamed from: a */
    public void add(int i10, M m10) {
        C6496s.h(m10, "element");
        this.f39352d.add(i10, m10);
    }

    /* renamed from: b */
    public boolean add(M m10) {
        C6496s.h(m10, "element");
        return this.f39352d.add(m10);
    }

    public void clear() {
        this.f39352d.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof M;
        }
        if (!z10) {
            return false;
        }
        return g((M) obj);
    }

    public final void d(a aVar) {
        C6496s.h(aVar, "callback");
        if (!this.f39353e.contains(aVar)) {
            this.f39353e.add(aVar);
        }
    }

    public /* bridge */ boolean g(M m10) {
        return super.contains(m10);
    }

    public final List h() {
        return k();
    }

    public final /* bridge */ int indexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof M;
        }
        if (!z10) {
            return -1;
        }
        return E((M) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof M;
        }
        if (!z10) {
            return -1;
        }
        return H((M) obj);
    }

    public final P m() {
        return n();
    }

    /* renamed from: r */
    public M get(int i10) {
        return (M) this.f39352d.get(i10);
    }

    public final /* bridge */ int size() {
        return C();
    }

    public final String t() {
        return this.f39354f;
    }

    public final Handler v() {
        return this.f39349a;
    }

    public final List x() {
        return this.f39353e;
    }

    public final String z() {
        return this.f39351c;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj == null ? true : obj instanceof M)) {
            return false;
        }
        return N((M) obj);
    }

    public Q(Collection collection) {
        C6496s.h(collection, "requests");
        this.f39351c = String.valueOf(Integer.valueOf(f39348h.incrementAndGet()));
        this.f39353e = new ArrayList();
        this.f39352d = new ArrayList(collection);
    }

    public Q(M... mArr) {
        C6496s.h(mArr, "requests");
        this.f39351c = String.valueOf(Integer.valueOf(f39348h.incrementAndGet()));
        this.f39353e = new ArrayList();
        this.f39352d = new ArrayList(C6559l.e(mArr));
    }
}
