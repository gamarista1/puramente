package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C1546b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;

public abstract class b0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f16896g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f16897a;

    /* renamed from: b  reason: collision with root package name */
    private final List f16898b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List f16899c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f16900d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16901e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16902f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b0 a(ViewGroup viewGroup, J j10) {
            C6496s.h(viewGroup, "container");
            C6496s.h(j10, "fragmentManager");
            c0 D02 = j10.D0();
            C6496s.g(D02, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, D02);
        }

        public final b0 b(ViewGroup viewGroup, c0 c0Var) {
            C6496s.h(viewGroup, "container");
            C6496s.h(c0Var, "factory");
            Object tag = viewGroup.getTag(S1.b.f5843b);
            if (tag instanceof b0) {
                return (b0) tag;
            }
            b0 a10 = c0Var.a(viewGroup);
            C6496s.g(a10, "factory.createController(container)");
            viewGroup.setTag(S1.b.f5843b, a10);
            return a10;
        }

        private a() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f16903a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16904b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f16905c;

        public final void a(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            if (!this.f16905c) {
                c(viewGroup);
            }
            this.f16905c = true;
        }

        public boolean b() {
            return this.f16903a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(C1546b bVar, ViewGroup viewGroup) {
            C6496s.h(bVar, "backEvent");
            C6496s.h(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            if (!this.f16904b) {
                f(viewGroup);
            }
            this.f16904b = true;
        }
    }

    private static final class c extends d {

        /* renamed from: l  reason: collision with root package name */
        private final Q f16906l;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(androidx.fragment.app.b0.d.b r3, androidx.fragment.app.b0.d.a r4, androidx.fragment.app.Q r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.C6496s.h(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.C6496s.h(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.C6496s.h(r5, r0)
                androidx.fragment.app.q r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.C6496s.g(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.f16906l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.c.<init>(androidx.fragment.app.b0$d$b, androidx.fragment.app.b0$d$a, androidx.fragment.app.Q):void");
        }

        public void d() {
            super.d();
            h().mTransitioning = false;
            this.f16906l.m();
        }

        public void p() {
            if (!n()) {
                super.p();
                if (i() == d.a.ADDING) {
                    C1769q k10 = this.f16906l.k();
                    C6496s.g(k10, "fragmentStateManager.fragment");
                    View findFocus = k10.mView.findFocus();
                    if (findFocus != null) {
                        k10.setFocusedView(findFocus);
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                        }
                    }
                    View requireView = h().requireView();
                    C6496s.g(requireView, "this.fragment.requireView()");
                    if (requireView.getParent() == null) {
                        this.f16906l.b();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(k10.getPostOnViewCreatedAlpha());
                } else if (i() == d.a.REMOVING) {
                    C1769q k11 = this.f16906l.k();
                    C6496s.g(k11, "fragmentStateManager.fragment");
                    View requireView2 = k11.requireView();
                    C6496s.g(requireView2, "fragment.requireView()");
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + k11);
                    }
                    requireView2.clearFocus();
                }
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private b f16907a;

        /* renamed from: b  reason: collision with root package name */
        private a f16908b;

        /* renamed from: c  reason: collision with root package name */
        private final C1769q f16909c;

        /* renamed from: d  reason: collision with root package name */
        private final List f16910d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private boolean f16911e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16912f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f16913g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f16914h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f16915i = true;

        /* renamed from: j  reason: collision with root package name */
        private final List f16916j;

        /* renamed from: k  reason: collision with root package name */
        private final List f16917k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            

            /* renamed from: a  reason: collision with root package name */
            public static final a f16922a = null;

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    C6496s.h(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        return b.INVISIBLE;
                    }
                    return b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* renamed from: androidx.fragment.app.b0$d$b$b  reason: collision with other inner class name */
            public /* synthetic */ class C0295b {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f16928a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                static {
                    /*
                        androidx.fragment.app.b0$d$b[] r0 = androidx.fragment.app.b0.d.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.fragment.app.b0$d$b r1 = androidx.fragment.app.b0.d.b.REMOVED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.fragment.app.b0$d$b r1 = androidx.fragment.app.b0.d.b.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.fragment.app.b0$d$b r1 = androidx.fragment.app.b0.d.b.GONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.fragment.app.b0$d$b r1 = androidx.fragment.app.b0.d.b.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        f16928a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.d.b.C0295b.<clinit>():void");
                }
            }

            static {
                f16922a = new a((DefaultConstructorMarker) null);
            }

            public static final b c(int i10) {
                return f16922a.b(i10);
            }

            /* JADX WARNING: type inference failed for: r7v1, types: [android.view.ViewParent] */
            /* JADX WARNING: type inference failed for: r0v8, types: [android.view.ViewParent] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 2 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(android.view.View r6, android.view.ViewGroup r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "view"
                    kotlin.jvm.internal.C6496s.h(r6, r0)
                    java.lang.String r0 = "container"
                    kotlin.jvm.internal.C6496s.h(r7, r0)
                    int[] r0 = androidx.fragment.app.b0.d.b.C0295b.f16928a
                    int r1 = r5.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    r2 = 0
                    java.lang.String r3 = "FragmentManager"
                    r4 = 2
                    if (r0 == r1) goto L_0x00bf
                    java.lang.String r1 = "SpecialEffectsController: Setting view "
                    if (r0 == r4) goto L_0x006b
                    r7 = 3
                    if (r0 == r7) goto L_0x0047
                    r7 = 4
                    if (r0 == r7) goto L_0x0025
                    goto L_0x00f1
                L_0x0025:
                    boolean r0 = androidx.fragment.app.J.L0(r4)
                    if (r0 == 0) goto L_0x0042
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to INVISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x0042:
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x0047:
                    boolean r7 = androidx.fragment.app.J.L0(r4)
                    if (r7 == 0) goto L_0x0064
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r1)
                    r7.append(r6)
                    java.lang.String r0 = " to GONE"
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    android.util.Log.v(r3, r7)
                L_0x0064:
                    r7 = 8
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x006b:
                    boolean r0 = androidx.fragment.app.J.L0(r4)
                    if (r0 == 0) goto L_0x0088
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to VISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x0088:
                    android.view.ViewParent r0 = r6.getParent()
                    boolean r1 = r0 instanceof android.view.ViewGroup
                    if (r1 == 0) goto L_0x0093
                    r2 = r0
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                L_0x0093:
                    if (r2 != 0) goto L_0x00ba
                    boolean r0 = androidx.fragment.app.J.L0(r4)
                    if (r0 == 0) goto L_0x00b7
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "SpecialEffectsController: Adding view "
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to Container "
                    r0.append(r1)
                    r0.append(r7)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x00b7:
                    r7.addView(r6)
                L_0x00ba:
                    r7 = 0
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x00bf:
                    android.view.ViewParent r7 = r6.getParent()
                    boolean r0 = r7 instanceof android.view.ViewGroup
                    if (r0 == 0) goto L_0x00ca
                    r2 = r7
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                L_0x00ca:
                    if (r2 == 0) goto L_0x00f1
                    boolean r7 = androidx.fragment.app.J.L0(r4)
                    if (r7 == 0) goto L_0x00ee
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r0 = "SpecialEffectsController: Removing view "
                    r7.append(r0)
                    r7.append(r6)
                    java.lang.String r0 = " from container "
                    r7.append(r0)
                    r7.append(r2)
                    java.lang.String r7 = r7.toString()
                    android.util.Log.v(r3, r7)
                L_0x00ee:
                    r2.removeView(r6)
                L_0x00f1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.d.b.b(android.view.View, android.view.ViewGroup):void");
            }
        }

        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f16929a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    androidx.fragment.app.b0$d$a[] r0 = androidx.fragment.app.b0.d.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.fragment.app.b0$d$a r1 = androidx.fragment.app.b0.d.a.ADDING     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.fragment.app.b0$d$a r1 = androidx.fragment.app.b0.d.a.REMOVING     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.fragment.app.b0$d$a r1 = androidx.fragment.app.b0.d.a.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f16929a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.d.c.<clinit>():void");
            }
        }

        public d(b bVar, a aVar, C1769q qVar) {
            C6496s.h(bVar, "finalState");
            C6496s.h(aVar, "lifecycleImpact");
            C6496s.h(qVar, "fragment");
            this.f16907a = bVar;
            this.f16908b = aVar;
            this.f16909c = qVar;
            ArrayList arrayList = new ArrayList();
            this.f16916j = arrayList;
            this.f16917k = arrayList;
        }

        public final void a(Runnable runnable) {
            C6496s.h(runnable, "listener");
            this.f16910d.add(runnable);
        }

        public final void b(b bVar) {
            C6496s.h(bVar, "effect");
            this.f16916j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            this.f16914h = false;
            if (!this.f16911e) {
                this.f16911e = true;
                if (this.f16916j.isEmpty()) {
                    d();
                    return;
                }
                for (b a10 : C6565s.e1(this.f16917k)) {
                    a10.a(viewGroup);
                }
            }
        }

        public void d() {
            this.f16914h = false;
            if (!this.f16912f) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f16912f = true;
                for (Runnable run : this.f16910d) {
                    run.run();
                }
            }
        }

        public final void e(b bVar) {
            C6496s.h(bVar, "effect");
            if (this.f16916j.remove(bVar) && this.f16916j.isEmpty()) {
                d();
            }
        }

        public final List f() {
            return this.f16917k;
        }

        public final b g() {
            return this.f16907a;
        }

        public final C1769q h() {
            return this.f16909c;
        }

        public final a i() {
            return this.f16908b;
        }

        public final boolean j() {
            return this.f16915i;
        }

        public final boolean k() {
            return this.f16911e;
        }

        public final boolean l() {
            return this.f16912f;
        }

        public final boolean m() {
            return this.f16913g;
        }

        public final boolean n() {
            return this.f16914h;
        }

        public final void o(b bVar, a aVar) {
            C6496s.h(bVar, "finalState");
            C6496s.h(aVar, "lifecycleImpact");
            int i10 = c.f16929a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f16909c + " mFinalState = " + this.f16907a + " -> REMOVED. mLifecycleImpact  = " + this.f16908b + " to REMOVING.");
                    }
                    this.f16907a = b.REMOVED;
                    this.f16908b = a.REMOVING;
                    this.f16915i = true;
                } else if (i10 == 3 && this.f16907a != b.REMOVED) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f16909c + " mFinalState = " + this.f16907a + " -> " + bVar + '.');
                    }
                    this.f16907a = bVar;
                }
            } else if (this.f16907a == b.REMOVED) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f16909c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f16908b + " to ADDING.");
                }
                this.f16907a = b.VISIBLE;
                this.f16908b = a.ADDING;
                this.f16915i = true;
            }
        }

        public void p() {
            this.f16914h = true;
        }

        public final void q(boolean z10) {
            this.f16915i = z10;
        }

        public final void r(boolean z10) {
            this.f16913g = z10;
        }

        public String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            return "Operation {" + hexString + "} {finalState = " + this.f16907a + " lifecycleImpact = " + this.f16908b + " fragment = " + this.f16909c + '}';
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16930a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16930a = iArr;
        }
    }

    public b0(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "container");
        this.f16897a = viewGroup;
    }

    private final void B(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) list.get(i10)).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6565s.D(arrayList, ((d) it.next()).f());
        }
        List e12 = C6565s.e1(C6565s.j1(arrayList));
        int size2 = e12.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) e12.get(i11)).g(this.f16897a);
        }
    }

    private final void C() {
        for (d dVar : this.f16898b) {
            if (dVar.i() == d.a.ADDING) {
                View requireView = dVar.h().requireView();
                C6496s.g(requireView, "fragment.requireView()");
                dVar.o(d.b.f16922a.b(requireView.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b bVar, d.a aVar, Q q10) {
        synchronized (this.f16898b) {
            try {
                C1769q k10 = q10.k();
                C6496s.g(k10, "fragmentStateManager.fragment");
                d o10 = o(k10);
                if (o10 == null) {
                    if (q10.k().mTransitioning) {
                        C1769q k11 = q10.k();
                        C6496s.g(k11, "fragmentStateManager.fragment");
                        o10 = p(k11);
                    } else {
                        o10 = null;
                    }
                }
                if (o10 != null) {
                    o10.o(bVar, aVar);
                    return;
                }
                c cVar = new c(bVar, aVar, q10);
                this.f16898b.add(cVar);
                cVar.a(new Z(this, cVar));
                cVar.a(new a0(this, cVar));
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(b0 b0Var, c cVar) {
        C6496s.h(b0Var, "this$0");
        C6496s.h(cVar, "$operation");
        if (b0Var.f16898b.contains(cVar)) {
            d.b g10 = cVar.g();
            View view = cVar.h().mView;
            C6496s.g(view, "operation.fragment.mView");
            g10.b(view, b0Var.f16897a);
        }
    }

    /* access modifiers changed from: private */
    public static final void i(b0 b0Var, c cVar) {
        C6496s.h(b0Var, "this$0");
        C6496s.h(cVar, "$operation");
        b0Var.f16898b.remove(cVar);
        b0Var.f16899c.remove(cVar);
    }

    private final d o(C1769q qVar) {
        Object obj;
        Iterator it = this.f16898b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (C6496s.c(dVar.h(), qVar) && !dVar.k()) {
                break;
            }
        }
        return (d) obj;
    }

    private final d p(C1769q qVar) {
        Object obj;
        Iterator it = this.f16899c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (C6496s.c(dVar.h(), qVar) && !dVar.k()) {
                break;
            }
        }
        return (d) obj;
    }

    public static final b0 u(ViewGroup viewGroup, J j10) {
        return f16896g.a(viewGroup, j10);
    }

    public static final b0 v(ViewGroup viewGroup, c0 c0Var) {
        return f16896g.b(viewGroup, c0Var);
    }

    private final boolean w(List list) {
        boolean z10;
        Iterable<d> iterable = list;
        loop0:
        while (true) {
            z10 = true;
            for (d dVar : iterable) {
                if (!dVar.f().isEmpty()) {
                    Iterable<b> f10 = dVar.f();
                    if (!(f10 instanceof Collection) || !((Collection) f10).isEmpty()) {
                        for (b b10 : f10) {
                            if (!b10.b()) {
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (d f11 : iterable) {
                C6565s.D(arrayList, f11.f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List list) {
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).h().mTransitioning) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void A(C1546b bVar) {
        C6496s.h(bVar, "backEvent");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.a());
        }
        ArrayList arrayList = new ArrayList();
        for (d f10 : this.f16899c) {
            C6565s.D(arrayList, f10.f());
        }
        List e12 = C6565s.e1(C6565s.j1(arrayList));
        int size = e12.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) e12.get(i10)).e(bVar, this.f16897a);
        }
    }

    public final void D(boolean z10) {
        this.f16901e = z10;
    }

    public final void c(d dVar) {
        C6496s.h(dVar, "operation");
        if (dVar.j()) {
            d.b g10 = dVar.g();
            View requireView = dVar.h().requireView();
            C6496s.g(requireView, "operation.fragment.requireView()");
            g10.b(requireView, this.f16897a);
            dVar.q(false);
        }
    }

    public abstract void d(List list, boolean z10);

    public void e(List list) {
        C6496s.h(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6565s.D(arrayList, ((d) it.next()).f());
        }
        List e12 = C6565s.e1(C6565s.j1(arrayList));
        int size = e12.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) e12.get(i10)).d(this.f16897a);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c((d) list.get(i11));
        }
        List e13 = C6565s.e1(list);
        int size3 = e13.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) e13.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.f16899c);
        e(this.f16899c);
    }

    public final void j(d.b bVar, Q q10) {
        C6496s.h(bVar, "finalState");
        C6496s.h(q10, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + q10.k());
        }
        g(bVar, d.a.ADDING, q10);
    }

    public final void k(Q q10) {
        C6496s.h(q10, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + q10.k());
        }
        g(d.b.GONE, d.a.NONE, q10);
    }

    public final void l(Q q10) {
        C6496s.h(q10, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + q10.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, q10);
    }

    public final void m(Q q10) {
        C6496s.h(q10, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + q10.k());
        }
        g(d.b.VISIBLE, d.a.NONE, q10);
    }

    public final void n() {
        boolean z10;
        boolean z11;
        if (!this.f16902f) {
            if (!this.f16897a.isAttachedToWindow()) {
                q();
                this.f16901e = false;
                return;
            }
            synchronized (this.f16898b) {
                try {
                    List<d> h12 = C6565s.h1(this.f16899c);
                    this.f16899c.clear();
                    for (d dVar : h12) {
                        if (this.f16898b.isEmpty() || !dVar.h().mTransitioning) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        dVar.r(z11);
                    }
                    for (d dVar2 : h12) {
                        if (this.f16900d) {
                            if (J.L0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                            }
                            dVar2.d();
                        } else {
                            if (J.L0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                            }
                            dVar2.c(this.f16897a);
                        }
                        this.f16900d = false;
                        if (!dVar2.l()) {
                            this.f16899c.add(dVar2);
                        }
                    }
                    if (!this.f16898b.isEmpty()) {
                        C();
                        List h13 = C6565s.h1(this.f16898b);
                        if (!h13.isEmpty()) {
                            this.f16898b.clear();
                            this.f16899c.addAll(h13);
                            if (J.L0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                            }
                            d(h13, this.f16901e);
                            boolean w10 = w(h13);
                            boolean x10 = x(h13);
                            if (!x10 || w10) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            this.f16900d = z10;
                            if (J.L0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + w10 + " \ntransition = " + x10);
                            }
                            if (!x10) {
                                B(h13);
                                e(h13);
                            } else if (w10) {
                                B(h13);
                                int size = h13.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    c((d) h13.get(i10));
                                }
                            }
                            this.f16901e = false;
                            if (J.L0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                            }
                        } else {
                            return;
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                } finally {
                }
            }
        }
    }

    public final void q() {
        String str;
        String str2;
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f16897a.isAttachedToWindow();
        synchronized (this.f16898b) {
            try {
                C();
                B(this.f16898b);
                List<d> h12 = C6565s.h1(this.f16899c);
                for (d r10 : h12) {
                    r10.r(false);
                }
                for (d dVar : h12) {
                    if (J.L0(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f16897a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f16897a);
                }
                List<d> h13 = C6565s.h1(this.f16898b);
                for (d r11 : h13) {
                    r11.r(false);
                }
                for (d dVar2 : h13) {
                    if (J.L0(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f16897a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f16897a);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.f16902f) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f16902f = false;
            n();
        }
    }

    public final d.a s(Q q10) {
        d.a aVar;
        int i10;
        C6496s.h(q10, "fragmentStateManager");
        C1769q k10 = q10.k();
        C6496s.g(k10, "fragmentStateManager.fragment");
        d o10 = o(k10);
        d.a aVar2 = null;
        if (o10 != null) {
            aVar = o10.i();
        } else {
            aVar = null;
        }
        d p10 = p(k10);
        if (p10 != null) {
            aVar2 = p10.i();
        }
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = e.f16930a[aVar.ordinal()];
        }
        if (i10 == -1 || i10 == 1) {
            return aVar2;
        }
        return aVar;
    }

    public final ViewGroup t() {
        return this.f16897a;
    }

    public final boolean y() {
        return !this.f16898b.isEmpty();
    }

    public final void z() {
        C1769q qVar;
        Object obj;
        boolean z10;
        synchronized (this.f16898b) {
            try {
                C();
                List list = this.f16898b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    qVar = null;
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    d dVar = (d) obj;
                    d.b.a aVar = d.b.f16922a;
                    View view = dVar.h().mView;
                    C6496s.g(view, "operation.fragment.mView");
                    d.b a10 = aVar.a(view);
                    d.b g10 = dVar.g();
                    d.b bVar = d.b.VISIBLE;
                    if (g10 == bVar && a10 != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) obj;
                if (dVar2 != null) {
                    qVar = dVar2.h();
                }
                if (qVar != null) {
                    z10 = qVar.isPostponed();
                } else {
                    z10 = false;
                }
                this.f16902f = z10;
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
