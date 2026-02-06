package androidx.fragment.app;

import T1.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C1546b;
import androidx.activity.G;
import androidx.activity.H;
import androidx.core.app.s;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.view.B;
import androidx.core.view.C1720w;
import androidx.fragment.app.T;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import g.C1998a;
import g.C1999b;
import g.C2000c;
import g.C2004g;
import h.C2012a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import x1.C2896a;

public abstract class J {

    /* renamed from: U  reason: collision with root package name */
    private static boolean f16705U = false;

    /* renamed from: V  reason: collision with root package name */
    static boolean f16706V = true;

    /* renamed from: A  reason: collision with root package name */
    C1769q f16707A;

    /* renamed from: B  reason: collision with root package name */
    private C1777z f16708B = null;

    /* renamed from: C  reason: collision with root package name */
    private C1777z f16709C = new d();

    /* renamed from: D  reason: collision with root package name */
    private c0 f16710D = null;

    /* renamed from: E  reason: collision with root package name */
    private c0 f16711E = new e();

    /* renamed from: F  reason: collision with root package name */
    private C2000c f16712F;

    /* renamed from: G  reason: collision with root package name */
    private C2000c f16713G;

    /* renamed from: H  reason: collision with root package name */
    private C2000c f16714H;

    /* renamed from: I  reason: collision with root package name */
    ArrayDeque f16715I = new ArrayDeque();

    /* renamed from: J  reason: collision with root package name */
    private boolean f16716J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f16717K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f16718L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f16719M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f16720N;

    /* renamed from: O  reason: collision with root package name */
    private ArrayList f16721O;

    /* renamed from: P  reason: collision with root package name */
    private ArrayList f16722P;

    /* renamed from: Q  reason: collision with root package name */
    private ArrayList f16723Q;

    /* renamed from: R  reason: collision with root package name */
    private M f16724R;

    /* renamed from: S  reason: collision with root package name */
    private c.C0141c f16725S;

    /* renamed from: T  reason: collision with root package name */
    private Runnable f16726T = new f();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f16727a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f16728b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final S f16729c = new S();

    /* renamed from: d  reason: collision with root package name */
    ArrayList f16730d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f16731e;

    /* renamed from: f  reason: collision with root package name */
    private final B f16732f = new B(this);

    /* renamed from: g  reason: collision with root package name */
    private H f16733g;

    /* renamed from: h  reason: collision with root package name */
    C1753a f16734h = null;

    /* renamed from: i  reason: collision with root package name */
    boolean f16735i = false;

    /* renamed from: j  reason: collision with root package name */
    private final G f16736j = new b(false);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f16737k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    private final Map f16738l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    private final Map f16739m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final Map f16740n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o  reason: collision with root package name */
    ArrayList f16741o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private final C f16742p = new C(this);

    /* renamed from: q  reason: collision with root package name */
    private final CopyOnWriteArrayList f16743q = new CopyOnWriteArrayList();

    /* renamed from: r  reason: collision with root package name */
    private final C2896a f16744r = new D(this);

    /* renamed from: s  reason: collision with root package name */
    private final C2896a f16745s = new E(this);

    /* renamed from: t  reason: collision with root package name */
    private final C2896a f16746t = new F(this);

    /* renamed from: u  reason: collision with root package name */
    private final C2896a f16747u = new G(this);

    /* renamed from: v  reason: collision with root package name */
    private final B f16748v = new c();

    /* renamed from: w  reason: collision with root package name */
    int f16749w = -1;

    /* renamed from: x  reason: collision with root package name */
    private A f16750x;

    /* renamed from: y  reason: collision with root package name */
    private C1775x f16751y;

    /* renamed from: z  reason: collision with root package name */
    private C1769q f16752z;

    class a implements C1999b {
        a() {
        }

        /* renamed from: b */
        public void a(Map map) {
            int i10;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            l lVar = (l) J.this.f16715I.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVar.f16763a;
            int i12 = lVar.f16764b;
            C1769q i13 = J.this.f16729c.i(str);
            if (i13 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i13.onRequestPermissionsResult(i12, strArr, iArr);
        }
    }

    class b extends G {
        b(boolean z10) {
            super(z10);
        }

        public void c() {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + J.f16706V + " fragment manager " + J.this);
            }
            if (J.f16706V) {
                J.this.q();
            }
        }

        public void d() {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + J.f16706V + " fragment manager " + J.this);
            }
            J.this.H0();
        }

        public void e(C1546b bVar) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + J.f16706V + " fragment manager " + J.this);
            }
            J j10 = J.this;
            if (j10.f16734h != null) {
                for (b0 A10 : j10.w(new ArrayList(Collections.singletonList(J.this.f16734h)), 0, 1)) {
                    A10.A(bVar);
                }
                Iterator it = J.this.f16741o.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.c.a(it.next());
                    throw null;
                }
            }
        }

        public void f(C1546b bVar) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + J.f16706V + " fragment manager " + J.this);
            }
            if (J.f16706V) {
                J.this.Z();
                J.this.m1();
            }
        }
    }

    class c implements B {
        c() {
        }

        public void a(Menu menu) {
            J.this.M(menu);
        }

        public void b(Menu menu) {
            J.this.Q(menu);
        }

        public boolean c(MenuItem menuItem) {
            return J.this.L(menuItem);
        }

        public void d(Menu menu, MenuInflater menuInflater) {
            J.this.E(menu, menuInflater);
        }
    }

    class d extends C1777z {
        d() {
        }

        public C1769q a(ClassLoader classLoader, String str) {
            return J.this.y0().b(J.this.y0().f(), str, (Bundle) null);
        }
    }

    class e implements c0 {
        e() {
        }

        public b0 a(ViewGroup viewGroup) {
            return new C1758f(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        public void run() {
            J.this.c0(true);
        }
    }

    class g implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1769q f16759a;

        g(C1769q qVar) {
            this.f16759a = qVar;
        }

        public void a(J j10, C1769q qVar) {
            this.f16759a.onAttachFragment(qVar);
        }
    }

    class h implements C1999b {
        h() {
        }

        /* renamed from: b */
        public void a(C1998a aVar) {
            l lVar = (l) J.this.f16715I.pollLast();
            if (lVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVar.f16763a;
            int i10 = lVar.f16764b;
            C1769q i11 = J.this.f16729c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.onActivityResult(i10, aVar.b(), aVar.a());
        }
    }

    class i implements C1999b {
        i() {
        }

        /* renamed from: b */
        public void a(C1998a aVar) {
            l lVar = (l) J.this.f16715I.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVar.f16763a;
            int i10 = lVar.f16764b;
            C1769q i11 = J.this.f16729c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.onActivityResult(i10, aVar.b(), aVar.a());
        }
    }

    static class j extends C2012a {
        j() {
        }

        /* renamed from: a */
        public Intent createIntent(Context context, C2004g gVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = gVar.a();
            if (!(a10 == null || (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new C2004g.a(gVar.d()).b((Intent) null).c(gVar.c(), gVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (J.L0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: b */
        public C1998a parseResult(int i10, Intent intent) {
            return new C1998a(i10, intent);
        }
    }

    public static abstract class k {
        @Deprecated
        public void onFragmentActivityCreated(J j10, C1769q qVar, Bundle bundle) {
        }

        public void onFragmentAttached(J j10, C1769q qVar, Context context) {
        }

        public void onFragmentCreated(J j10, C1769q qVar, Bundle bundle) {
        }

        public void onFragmentDestroyed(J j10, C1769q qVar) {
        }

        public void onFragmentDetached(J j10, C1769q qVar) {
        }

        public void onFragmentPaused(J j10, C1769q qVar) {
        }

        public void onFragmentPreAttached(J j10, C1769q qVar, Context context) {
        }

        public void onFragmentPreCreated(J j10, C1769q qVar, Bundle bundle) {
        }

        public void onFragmentResumed(J j10, C1769q qVar) {
        }

        public void onFragmentSaveInstanceState(J j10, C1769q qVar, Bundle bundle) {
        }

        public void onFragmentStarted(J j10, C1769q qVar) {
        }

        public void onFragmentStopped(J j10, C1769q qVar) {
        }

        public void onFragmentViewCreated(J j10, C1769q qVar, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(J j10, C1769q qVar) {
        }
    }

    interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class n implements m {

        /* renamed from: a  reason: collision with root package name */
        final String f16765a;

        /* renamed from: b  reason: collision with root package name */
        final int f16766b;

        /* renamed from: c  reason: collision with root package name */
        final int f16767c;

        n(String str, int i10, int i11) {
            this.f16765a = str;
            this.f16766b = i10;
            this.f16767c = i11;
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            C1769q qVar = J.this.f16707A;
            if (qVar != null && this.f16766b < 0 && this.f16765a == null && qVar.getChildFragmentManager().h1()) {
                return false;
            }
            return J.this.k1(arrayList, arrayList2, this.f16765a, this.f16766b, this.f16767c);
        }
    }

    class o implements m {
        o() {
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean l12 = J.this.l1(arrayList, arrayList2);
            if (!J.this.f16741o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(J.this.q0((C1753a) it.next()));
                }
                Iterator it2 = J.this.f16741o.iterator();
                while (it2.hasNext()) {
                    android.support.v4.media.session.c.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        C1769q qVar = (C1769q) it3.next();
                        throw null;
                    }
                }
            }
            return l12;
        }
    }

    private void B1() {
        for (Q f12 : this.f16729c.k()) {
            f1(f12);
        }
    }

    private void C1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Y("FragmentManager"));
        A a10 = this.f16750x;
        if (a10 != null) {
            try {
                a10.i("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            try {
                Y("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
            }
        }
        throw runtimeException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (s0() <= 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (Q0(r4.f16752z) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (L0(3) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        android.util.Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + r4 + " enabled state is " + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r4.f16736j.j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void E1() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.f16727a
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.f16727a     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
            r2 = 3
            r3 = 1
            if (r1 != 0) goto L_0x0038
            androidx.activity.G r1 = r4.f16736j     // Catch:{ all -> 0x0034 }
            r1.j(r3)     // Catch:{ all -> 0x0034 }
            boolean r1 = L0(r2)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "FragmentManager "
            r2.append(r3)     // Catch:{ all -> 0x0034 }
            r2.append(r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = " enabling OnBackPressedCallback, caused by non-empty pending actions"
            r2.append(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0034 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0036
        L_0x0034:
            r1 = move-exception
            goto L_0x0073
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            int r0 = r4.s0()
            if (r0 <= 0) goto L_0x0048
            androidx.fragment.app.q r0 = r4.f16752z
            boolean r0 = r4.Q0(r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            boolean r0 = L0(r2)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OnBackPressedCallback for FragmentManager "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " enabled state is "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L_0x006d:
            androidx.activity.G r0 = r4.f16736j
            r0.j(r3)
            return
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.J.E1():void");
    }

    static C1769q F0(View view) {
        Object tag = view.getTag(S1.b.f5842a);
        if (tag instanceof C1769q) {
            return (C1769q) tag;
        }
        return null;
    }

    public static boolean L0(int i10) {
        if (f16705U || Log.isLoggable("FragmentManager", i10)) {
            return true;
        }
        return false;
    }

    private boolean M0(C1769q qVar) {
        if ((!qVar.mHasMenu || !qVar.mMenuVisible) && !qVar.mChildFragmentManager.r()) {
            return false;
        }
        return true;
    }

    private void N(C1769q qVar) {
        if (qVar != null && qVar.equals(h0(qVar.mWho))) {
            qVar.performPrimaryNavigationFragmentChanged();
        }
    }

    private boolean N0() {
        C1769q qVar = this.f16752z;
        if (qVar == null) {
            return true;
        }
        if (!qVar.isAdded() || !this.f16752z.getParentFragmentManager().N0()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    private void U(int i10) {
        try {
            this.f16728b = true;
            this.f16729c.d(i10);
            c1(i10, false);
            for (b0 q10 : v()) {
                q10.q();
            }
            this.f16728b = false;
            c0(true);
        } catch (Throwable th2) {
            this.f16728b = false;
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U0() {
        Iterator it = this.f16741o.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.c.a(it.next());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V0(Configuration configuration) {
        if (N0()) {
            B(configuration, false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void W0(Integer num) {
        if (N0() && num.intValue() == 80) {
            H(false);
        }
    }

    private void X() {
        if (this.f16720N) {
            this.f16720N = false;
            B1();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X0(androidx.core.app.k kVar) {
        if (N0()) {
            I(kVar.a(), false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Y0(v vVar) {
        if (N0()) {
            P(vVar.a(), false);
        }
    }

    /* access modifiers changed from: private */
    public void Z() {
        for (b0 q10 : v()) {
            q10.q();
        }
    }

    private void b0(boolean z10) {
        if (this.f16728b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f16750x == null) {
            if (this.f16719M) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f16750x.h().getLooper()) {
            if (!z10) {
                s();
            }
            if (this.f16721O == null) {
                this.f16721O = new ArrayList();
                this.f16722P = new ArrayList();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private static void e0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C1753a aVar = (C1753a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                aVar.x(-1);
                aVar.D();
            } else {
                aVar.x(1);
                aVar.C();
            }
            i10++;
        }
    }

    private void f0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = ((C1753a) arrayList.get(i10)).f16830r;
        ArrayList arrayList3 = this.f16723Q;
        if (arrayList3 == null) {
            this.f16723Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f16723Q.addAll(this.f16729c.o());
        C1769q C02 = C0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C1753a aVar = (C1753a) arrayList.get(i12);
            if (!((Boolean) arrayList2.get(i12)).booleanValue()) {
                C02 = aVar.E(this.f16723Q, C02);
            } else {
                C02 = aVar.H(this.f16723Q, C02);
            }
            if (z11 || aVar.f16821i) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.f16723Q.clear();
        if (!z10 && this.f16749w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((C1753a) arrayList.get(i13)).f16815c.iterator();
                while (it.hasNext()) {
                    C1769q qVar = ((T.a) it.next()).f16833b;
                    if (!(qVar == null || qVar.mFragmentManager == null)) {
                        this.f16729c.r(x(qVar));
                    }
                }
            }
        }
        e0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && !this.f16741o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(q0((C1753a) it2.next()));
            }
            if (this.f16734h == null) {
                Iterator it3 = this.f16741o.iterator();
                while (it3.hasNext()) {
                    android.support.v4.media.session.c.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        C1769q qVar2 = (C1769q) it4.next();
                        throw null;
                    }
                }
                Iterator it5 = this.f16741o.iterator();
                while (it5.hasNext()) {
                    android.support.v4.media.session.c.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        C1769q qVar3 = (C1769q) it6.next();
                        throw null;
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C1753a aVar2 = (C1753a) arrayList.get(i14);
            if (booleanValue) {
                for (int size = aVar2.f16815c.size() - 1; size >= 0; size--) {
                    C1769q qVar4 = ((T.a) aVar2.f16815c.get(size)).f16833b;
                    if (qVar4 != null) {
                        x(qVar4).m();
                    }
                }
            } else {
                Iterator it7 = aVar2.f16815c.iterator();
                while (it7.hasNext()) {
                    C1769q qVar5 = ((T.a) it7.next()).f16833b;
                    if (qVar5 != null) {
                        x(qVar5).m();
                    }
                }
            }
        }
        c1(this.f16749w, true);
        for (b0 b0Var : w(arrayList, i10, i11)) {
            b0Var.D(booleanValue);
            b0Var.z();
            b0Var.n();
        }
        while (i10 < i11) {
            C1753a aVar3 = (C1753a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && aVar3.f16878v >= 0) {
                aVar3.f16878v = -1;
            }
            aVar3.G();
            i10++;
        }
        if (z11) {
            r1();
        }
    }

    private int i0(String str, int i10, boolean z10) {
        if (this.f16730d.isEmpty()) {
            return -1;
        }
        if (str != null || i10 >= 0) {
            int size = this.f16730d.size() - 1;
            while (size >= 0) {
                C1753a aVar = (C1753a) this.f16730d.get(size);
                if ((str != null && str.equals(aVar.F())) || (i10 >= 0 && i10 == aVar.f16878v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z10) {
                while (size > 0) {
                    C1753a aVar2 = (C1753a) this.f16730d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.F())) && (i10 < 0 || i10 != aVar2.f16878v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f16730d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z10) {
            return 0;
        } else {
            return this.f16730d.size() - 1;
        }
    }

    public static C1769q j0(View view) {
        C1769q o02 = o0(view);
        if (o02 != null) {
            return o02;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private boolean j1(String str, int i10, int i11) {
        c0(false);
        b0(true);
        C1769q qVar = this.f16707A;
        if (qVar != null && i10 < 0 && str == null && qVar.getChildFragmentManager().h1()) {
            return true;
        }
        boolean k12 = k1(this.f16721O, this.f16722P, str, i10, i11);
        if (k12) {
            this.f16728b = true;
            try {
                p1(this.f16721O, this.f16722P);
            } finally {
                t();
            }
        }
        E1();
        X();
        this.f16729c.b();
        return k12;
    }

    public static J n0(View view) {
        C1773v vVar;
        C1769q o02 = o0(view);
        if (o02 == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    vVar = null;
                    break;
                } else if (context instanceof C1773v) {
                    vVar = (C1773v) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (vVar != null) {
                return vVar.getSupportFragmentManager();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (o02.isAdded()) {
            return o02.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + o02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    static C1769q o0(View view) {
        while (view != null) {
            C1769q F02 = F0(view);
            if (F02 != null) {
                return F02;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void p0() {
        for (b0 r10 : v()) {
            r10.r();
        }
    }

    private void p1(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!((C1753a) arrayList.get(i10)).f16830r) {
                        if (i11 != i10) {
                            f0(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                            while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C1753a) arrayList.get(i11)).f16830r) {
                                i11++;
                            }
                        }
                        f0(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    f0(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private boolean r0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f16727a) {
            if (this.f16727a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f16727a.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= ((m) this.f16727a.get(i10)).a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.f16727a.clear();
                this.f16750x.h().removeCallbacks(this.f16726T);
            }
        }
    }

    private void r1() {
        if (this.f16741o.size() > 0) {
            android.support.v4.media.session.c.a(this.f16741o.get(0));
            throw null;
        }
    }

    private void s() {
        if (S0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void t() {
        this.f16728b = false;
        this.f16722P.clear();
        this.f16721O.clear();
    }

    private M t0(C1769q qVar) {
        return this.f16724R.g(qVar);
    }

    static int t1(int i10) {
        int i11 = 4097;
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 8194) {
            i11 = 8197;
            if (i10 == 8197) {
                return 4100;
            }
            if (i10 == 4099) {
                return 4099;
            }
            if (i10 != 4100) {
                return 0;
            }
        }
        return i11;
    }

    private void u() {
        boolean z10;
        A a10 = this.f16750x;
        if (a10 instanceof e0) {
            z10 = this.f16729c.p().k();
        } else if (a10.f() instanceof Activity) {
            z10 = !((Activity) this.f16750x.f()).isChangingConfigurations();
        } else {
            z10 = true;
        }
        if (z10) {
            for (C1755c cVar : this.f16738l.values()) {
                for (String d10 : cVar.f16931a) {
                    this.f16729c.p().d(d10, false);
                }
            }
        }
    }

    private Set v() {
        HashSet hashSet = new HashSet();
        for (Q k10 : this.f16729c.k()) {
            ViewGroup viewGroup = k10.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(b0.v(viewGroup, D0()));
            }
        }
        return hashSet;
    }

    private ViewGroup v0(C1769q qVar) {
        ViewGroup viewGroup = qVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (qVar.mContainerId > 0 && this.f16751y.d()) {
            View c10 = this.f16751y.c(qVar.mContainerId);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private void z1(C1769q qVar) {
        ViewGroup v02 = v0(qVar);
        if (v02 != null && qVar.getEnterAnim() + qVar.getExitAnim() + qVar.getPopEnterAnim() + qVar.getPopExitAnim() > 0) {
            if (v02.getTag(S1.b.f5844c) == null) {
                v02.setTag(S1.b.f5844c, qVar);
            }
            ((C1769q) v02.getTag(S1.b.f5844c)).setPopDirection(qVar.getPopDirection());
        }
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.f16717K = false;
        this.f16718L = false;
        this.f16724R.m(false);
        U(0);
    }

    /* access modifiers changed from: package-private */
    public C A0() {
        return this.f16742p;
    }

    /* access modifiers changed from: package-private */
    public void A1(C1769q qVar) {
        if (L0(2)) {
            Log.v("FragmentManager", "show: " + qVar);
        }
        if (qVar.mHidden) {
            qVar.mHidden = false;
            qVar.mHiddenChanged = !qVar.mHiddenChanged;
        }
    }

    /* access modifiers changed from: package-private */
    public void B(Configuration configuration, boolean z10) {
        if (z10 && (this.f16750x instanceof androidx.core.content.f)) {
            C1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (C1769q qVar : this.f16729c.o()) {
            if (qVar != null) {
                qVar.performConfigurationChanged(configuration);
                if (z10) {
                    qVar.mChildFragmentManager.B(configuration, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C1769q B0() {
        return this.f16752z;
    }

    /* access modifiers changed from: package-private */
    public boolean C(MenuItem menuItem) {
        if (this.f16749w < 1) {
            return false;
        }
        for (C1769q qVar : this.f16729c.o()) {
            if (qVar != null && qVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public C1769q C0() {
        return this.f16707A;
    }

    /* access modifiers changed from: package-private */
    public void D() {
        this.f16717K = false;
        this.f16718L = false;
        this.f16724R.m(false);
        U(1);
    }

    /* access modifiers changed from: package-private */
    public c0 D0() {
        c0 c0Var = this.f16710D;
        if (c0Var != null) {
            return c0Var;
        }
        C1769q qVar = this.f16752z;
        if (qVar != null) {
            return qVar.mFragmentManager.D0();
        }
        return this.f16711E;
    }

    public void D1(k kVar) {
        this.f16742p.p(kVar);
    }

    /* access modifiers changed from: package-private */
    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f16749w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (C1769q qVar : this.f16729c.o()) {
            if (qVar != null && P0(qVar) && qVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qVar);
                z10 = true;
            }
        }
        if (this.f16731e != null) {
            for (int i10 = 0; i10 < this.f16731e.size(); i10++) {
                C1769q qVar2 = (C1769q) this.f16731e.get(i10);
                if (arrayList == null || !arrayList.contains(qVar2)) {
                    qVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.f16731e = arrayList;
        return z10;
    }

    public c.C0141c E0() {
        return this.f16725S;
    }

    /* access modifiers changed from: package-private */
    public void F() {
        this.f16719M = true;
        c0(true);
        Z();
        u();
        U(-1);
        A a10 = this.f16750x;
        if (a10 instanceof androidx.core.content.g) {
            ((androidx.core.content.g) a10).removeOnTrimMemoryListener(this.f16745s);
        }
        A a11 = this.f16750x;
        if (a11 instanceof androidx.core.content.f) {
            ((androidx.core.content.f) a11).removeOnConfigurationChangedListener(this.f16744r);
        }
        A a12 = this.f16750x;
        if (a12 instanceof s) {
            ((s) a12).removeOnMultiWindowModeChangedListener(this.f16746t);
        }
        A a13 = this.f16750x;
        if (a13 instanceof t) {
            ((t) a13).removeOnPictureInPictureModeChangedListener(this.f16747u);
        }
        A a14 = this.f16750x;
        if ((a14 instanceof C1720w) && this.f16752z == null) {
            ((C1720w) a14).removeMenuProvider(this.f16748v);
        }
        this.f16750x = null;
        this.f16751y = null;
        this.f16752z = null;
        if (this.f16733g != null) {
            this.f16736j.h();
            this.f16733g = null;
        }
        C2000c cVar = this.f16712F;
        if (cVar != null) {
            cVar.d();
            this.f16713G.d();
            this.f16714H.d();
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        U(1);
    }

    /* access modifiers changed from: package-private */
    public d0 G0(C1769q qVar) {
        return this.f16724R.j(qVar);
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z10) {
        if (z10 && (this.f16750x instanceof androidx.core.content.g)) {
            C1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (C1769q qVar : this.f16729c.o()) {
            if (qVar != null) {
                qVar.performLowMemory();
                if (z10) {
                    qVar.mChildFragmentManager.H(true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H0() {
        this.f16735i = true;
        c0(true);
        this.f16735i = false;
        if (f16706V && this.f16734h != null) {
            if (!this.f16741o.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(q0(this.f16734h));
                Iterator it = this.f16741o.iterator();
                while (it.hasNext()) {
                    android.support.v4.media.session.c.a(it.next());
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        C1769q qVar = (C1769q) it2.next();
                        throw null;
                    }
                }
            }
            Iterator it3 = this.f16734h.f16815c.iterator();
            while (it3.hasNext()) {
                C1769q qVar2 = ((T.a) it3.next()).f16833b;
                if (qVar2 != null) {
                    qVar2.mTransitioning = false;
                }
            }
            for (b0 f10 : w(new ArrayList(Collections.singletonList(this.f16734h)), 0, 1)) {
                f10.f();
            }
            Iterator it4 = this.f16734h.f16815c.iterator();
            while (it4.hasNext()) {
                C1769q qVar3 = ((T.a) it4.next()).f16833b;
                if (qVar3 != null && qVar3.mContainer == null) {
                    x(qVar3).m();
                }
            }
            this.f16734h = null;
            E1();
            if (L0(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f16736j.g() + " for  FragmentManager " + this);
            }
        } else if (this.f16736j.g()) {
            if (L0(3)) {
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
            }
            h1();
        } else {
            if (L0(3)) {
                Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
            }
            this.f16733g.l();
        }
    }

    /* access modifiers changed from: package-private */
    public void I(boolean z10, boolean z11) {
        if (z11 && (this.f16750x instanceof s)) {
            C1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (C1769q qVar : this.f16729c.o()) {
            if (qVar != null) {
                qVar.performMultiWindowModeChanged(z10);
                if (z11) {
                    qVar.mChildFragmentManager.I(z10, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I0(C1769q qVar) {
        if (L0(2)) {
            Log.v("FragmentManager", "hide: " + qVar);
        }
        if (!qVar.mHidden) {
            qVar.mHidden = true;
            qVar.mHiddenChanged = true ^ qVar.mHiddenChanged;
            z1(qVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(C1769q qVar) {
        Iterator it = this.f16743q.iterator();
        while (it.hasNext()) {
            ((N) it.next()).a(this, qVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void J0(C1769q qVar) {
        if (qVar.mAdded && M0(qVar)) {
            this.f16716J = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void K() {
        for (C1769q qVar : this.f16729c.l()) {
            if (qVar != null) {
                qVar.onHiddenChanged(qVar.isHidden());
                qVar.mChildFragmentManager.K();
            }
        }
    }

    public boolean K0() {
        return this.f16719M;
    }

    /* access modifiers changed from: package-private */
    public boolean L(MenuItem menuItem) {
        if (this.f16749w < 1) {
            return false;
        }
        for (C1769q qVar : this.f16729c.o()) {
            if (qVar != null && qVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void M(Menu menu) {
        if (this.f16749w >= 1) {
            for (C1769q qVar : this.f16729c.o()) {
                if (qVar != null) {
                    qVar.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O() {
        U(5);
    }

    /* access modifiers changed from: package-private */
    public boolean O0(C1769q qVar) {
        if (qVar == null) {
            return false;
        }
        return qVar.isHidden();
    }

    /* access modifiers changed from: package-private */
    public void P(boolean z10, boolean z11) {
        if (z11 && (this.f16750x instanceof t)) {
            C1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (C1769q qVar : this.f16729c.o()) {
            if (qVar != null) {
                qVar.performPictureInPictureModeChanged(z10);
                if (z11) {
                    qVar.mChildFragmentManager.P(z10, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P0(C1769q qVar) {
        if (qVar == null) {
            return true;
        }
        return qVar.isMenuVisible();
    }

    /* access modifiers changed from: package-private */
    public boolean Q(Menu menu) {
        boolean z10 = false;
        if (this.f16749w < 1) {
            return false;
        }
        for (C1769q qVar : this.f16729c.o()) {
            if (qVar != null && P0(qVar) && qVar.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public boolean Q0(C1769q qVar) {
        if (qVar == null) {
            return true;
        }
        J j10 = qVar.mFragmentManager;
        if (!qVar.equals(j10.C0()) || !Q0(j10.f16752z)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void R() {
        E1();
        N(this.f16707A);
    }

    /* access modifiers changed from: package-private */
    public boolean R0(int i10) {
        if (this.f16749w >= i10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.f16717K = false;
        this.f16718L = false;
        this.f16724R.m(false);
        U(7);
    }

    public boolean S0() {
        if (this.f16717K || this.f16718L) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void T() {
        this.f16717K = false;
        this.f16718L = false;
        this.f16724R.m(false);
        U(5);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        this.f16718L = true;
        this.f16724R.m(true);
        U(4);
    }

    /* access modifiers changed from: package-private */
    public void W() {
        U(2);
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f16729c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f16731e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((C1769q) this.f16731e.get(i10)).toString());
            }
        }
        int size2 = this.f16730d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C1753a aVar = (C1753a) this.f16730d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.A(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f16737k.get());
        synchronized (this.f16727a) {
            try {
                int size3 = this.f16727a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println((m) this.f16727a.get(i12));
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f16750x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f16751y);
        if (this.f16752z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f16752z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f16749w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f16717K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f16718L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f16719M);
        if (this.f16716J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f16716J);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z0(C1769q qVar, String[] strArr, int i10) {
        if (this.f16714H != null) {
            this.f16715I.addLast(new l(qVar.mWho, i10));
            this.f16714H.b(strArr);
            return;
        }
        this.f16750x.l(qVar, strArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void a0(m mVar, boolean z10) {
        if (!z10) {
            if (this.f16750x != null) {
                s();
            } else if (this.f16719M) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f16727a) {
            try {
                if (this.f16750x != null) {
                    this.f16727a.add(mVar);
                    v1();
                } else if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a1(C1769q qVar, Intent intent, int i10, Bundle bundle) {
        if (this.f16712F != null) {
            this.f16715I.addLast(new l(qVar.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f16712F.b(intent);
            return;
        }
        this.f16750x.n(qVar, intent, i10, bundle);
    }

    /* access modifiers changed from: package-private */
    public void b1(C1769q qVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        C1769q qVar2 = qVar;
        Bundle bundle2 = bundle;
        if (this.f16713G != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (L0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + qVar);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            C2004g a10 = new C2004g.a(intentSender).b(intent2).c(i12, i11).a();
            int i14 = i10;
            this.f16715I.addLast(new l(qVar2.mWho, i10));
            if (L0(2)) {
                Log.v("FragmentManager", "Fragment " + qVar + "is launching an IntentSender for result ");
            }
            this.f16713G.b(a10);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        this.f16750x.o(qVar, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* access modifiers changed from: package-private */
    public boolean c0(boolean z10) {
        C1753a aVar;
        b0(z10);
        boolean z11 = false;
        if (!this.f16735i && (aVar = this.f16734h) != null) {
            aVar.f16877u = false;
            aVar.y();
            if (L0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f16734h + " as part of execPendingActions for actions " + this.f16727a);
            }
            this.f16734h.z(false, false);
            this.f16727a.add(0, this.f16734h);
            Iterator it = this.f16734h.f16815c.iterator();
            while (it.hasNext()) {
                C1769q qVar = ((T.a) it.next()).f16833b;
                if (qVar != null) {
                    qVar.mTransitioning = false;
                }
            }
            this.f16734h = null;
        }
        while (r0(this.f16721O, this.f16722P)) {
            z11 = true;
            this.f16728b = true;
            try {
                p1(this.f16721O, this.f16722P);
            } finally {
                t();
            }
        }
        E1();
        X();
        this.f16729c.b();
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void c1(int i10, boolean z10) {
        A a10;
        if (this.f16750x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f16749w) {
            this.f16749w = i10;
            this.f16729c.t();
            B1();
            if (this.f16716J && (a10 = this.f16750x) != null && this.f16749w == 7) {
                a10.p();
                this.f16716J = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d0(m mVar, boolean z10) {
        if (!z10 || (this.f16750x != null && !this.f16719M)) {
            b0(z10);
            C1753a aVar = this.f16734h;
            boolean z11 = false;
            if (aVar != null) {
                aVar.f16877u = false;
                aVar.y();
                if (L0(3)) {
                    Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f16734h + " as part of execSingleAction for action " + mVar);
                }
                this.f16734h.z(false, false);
                boolean a10 = this.f16734h.a(this.f16721O, this.f16722P);
                Iterator it = this.f16734h.f16815c.iterator();
                while (it.hasNext()) {
                    C1769q qVar = ((T.a) it.next()).f16833b;
                    if (qVar != null) {
                        qVar.mTransitioning = false;
                    }
                }
                this.f16734h = null;
                z11 = a10;
            }
            boolean a11 = mVar.a(this.f16721O, this.f16722P);
            if (z11 || a11) {
                this.f16728b = true;
                try {
                    p1(this.f16721O, this.f16722P);
                } finally {
                    t();
                }
            }
            E1();
            X();
            this.f16729c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void d1() {
        if (this.f16750x != null) {
            this.f16717K = false;
            this.f16718L = false;
            this.f16724R.m(false);
            for (C1769q qVar : this.f16729c.o()) {
                if (qVar != null) {
                    qVar.noteStateNotSaved();
                }
            }
        }
    }

    public final void e1(FragmentContainerView fragmentContainerView) {
        View view;
        for (Q q10 : this.f16729c.k()) {
            C1769q k10 = q10.k();
            if (k10.mContainerId == fragmentContainerView.getId() && (view = k10.mView) != null && view.getParent() == null) {
                k10.mContainer = fragmentContainerView;
                q10.b();
                q10.m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f1(Q q10) {
        C1769q k10 = q10.k();
        if (!k10.mDeferStart) {
            return;
        }
        if (this.f16728b) {
            this.f16720N = true;
            return;
        }
        k10.mDeferStart = false;
        q10.m();
    }

    public boolean g0() {
        boolean c02 = c0(true);
        p0();
        return c02;
    }

    /* access modifiers changed from: package-private */
    public void g1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            a0(new n((String) null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* access modifiers changed from: package-private */
    public C1769q h0(String str) {
        return this.f16729c.f(str);
    }

    public boolean h1() {
        return j1((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void i(C1753a aVar) {
        this.f16730d.add(aVar);
    }

    public boolean i1(int i10, int i11) {
        if (i10 >= 0) {
            return j1((String) null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* access modifiers changed from: package-private */
    public Q j(C1769q qVar) {
        String str = qVar.mPreviousWho;
        if (str != null) {
            T1.c.f(qVar, str);
        }
        if (L0(2)) {
            Log.v("FragmentManager", "add: " + qVar);
        }
        Q x10 = x(qVar);
        qVar.mFragmentManager = this;
        this.f16729c.r(x10);
        if (!qVar.mDetached) {
            this.f16729c.a(qVar);
            qVar.mRemoving = false;
            if (qVar.mView == null) {
                qVar.mHiddenChanged = false;
            }
            if (M0(qVar)) {
                this.f16716J = true;
            }
        }
        return x10;
    }

    public void k(N n10) {
        this.f16743q.add(n10);
    }

    public C1769q k0(int i10) {
        return this.f16729c.g(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean k1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        boolean z10;
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i02 = i0(str, i10, z10);
        if (i02 < 0) {
            return false;
        }
        for (int size = this.f16730d.size() - 1; size >= i02; size--) {
            arrayList.add((C1753a) this.f16730d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void l(C1769q qVar) {
        this.f16724R.b(qVar);
    }

    public C1769q l0(String str) {
        return this.f16729c.h(str);
    }

    /* access modifiers changed from: package-private */
    public boolean l1(ArrayList arrayList, ArrayList arrayList2) {
        if (L0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f16727a);
        }
        if (this.f16730d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList arrayList3 = this.f16730d;
        C1753a aVar = (C1753a) arrayList3.get(arrayList3.size() - 1);
        this.f16734h = aVar;
        Iterator it = aVar.f16815c.iterator();
        while (it.hasNext()) {
            C1769q qVar = ((T.a) it.next()).f16833b;
            if (qVar != null) {
                qVar.mTransitioning = true;
            }
        }
        return k1(arrayList, arrayList2, (String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f16737k.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public C1769q m0(String str) {
        return this.f16729c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void m1() {
        a0(new o(), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.activity.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: androidx.fragment.app.q} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(androidx.fragment.app.A r4, androidx.fragment.app.C1775x r5, androidx.fragment.app.C1769q r6) {
        /*
            r3 = this;
            androidx.fragment.app.A r0 = r3.f16750x
            if (r0 != 0) goto L_0x016c
            r3.f16750x = r4
            r3.f16751y = r5
            r3.f16752z = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.J$g r5 = new androidx.fragment.app.J$g
            r5.<init>(r6)
            r3.k(r5)
            goto L_0x001f
        L_0x0015:
            boolean r5 = r4 instanceof androidx.fragment.app.N
            if (r5 == 0) goto L_0x001f
            r5 = r4
            androidx.fragment.app.N r5 = (androidx.fragment.app.N) r5
            r3.k(r5)
        L_0x001f:
            androidx.fragment.app.q r5 = r3.f16752z
            if (r5 == 0) goto L_0x0026
            r3.E1()
        L_0x0026:
            boolean r5 = r4 instanceof androidx.activity.K
            if (r5 == 0) goto L_0x003b
            r5 = r4
            androidx.activity.K r5 = (androidx.activity.K) r5
            androidx.activity.H r0 = r5.getOnBackPressedDispatcher()
            r3.f16733g = r0
            if (r6 == 0) goto L_0x0036
            r5 = r6
        L_0x0036:
            androidx.activity.G r1 = r3.f16736j
            r0.i(r5, r1)
        L_0x003b:
            if (r6 == 0) goto L_0x0046
            androidx.fragment.app.J r4 = r6.mFragmentManager
            androidx.fragment.app.M r4 = r4.t0(r6)
            r3.f16724R = r4
            goto L_0x005f
        L_0x0046:
            boolean r5 = r4 instanceof androidx.lifecycle.e0
            if (r5 == 0) goto L_0x0057
            androidx.lifecycle.e0 r4 = (androidx.lifecycle.e0) r4
            androidx.lifecycle.d0 r4 = r4.getViewModelStore()
            androidx.fragment.app.M r4 = androidx.fragment.app.M.h(r4)
            r3.f16724R = r4
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.M r4 = new androidx.fragment.app.M
            r5 = 0
            r4.<init>(r5)
            r3.f16724R = r4
        L_0x005f:
            androidx.fragment.app.M r4 = r3.f16724R
            boolean r5 = r3.S0()
            r4.m(r5)
            androidx.fragment.app.S r4 = r3.f16729c
            androidx.fragment.app.M r5 = r3.f16724R
            r4.A(r5)
            androidx.fragment.app.A r4 = r3.f16750x
            boolean r5 = r4 instanceof x3.C2914f
            if (r5 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            x3.f r4 = (x3.C2914f) r4
            x3.d r4 = r4.getSavedStateRegistry()
            androidx.fragment.app.H r5 = new androidx.fragment.app.H
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.h(r0, r5)
            android.os.Bundle r4 = r4.b(r0)
            if (r4 == 0) goto L_0x0090
            r3.s1(r4)
        L_0x0090:
            androidx.fragment.app.A r4 = r3.f16750x
            boolean r5 = r4 instanceof g.C2003f
            if (r5 == 0) goto L_0x0128
            g.f r4 = (g.C2003f) r4
            g.e r4 = r4.getActivityResultRegistry()
            if (r6 == 0) goto L_0x00b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.mWho
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r5 = ""
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            h.d r1 = new h.d
            r1.<init>()
            androidx.fragment.app.J$h r2 = new androidx.fragment.app.J$h
            r2.<init>()
            g.c r0 = r4.m(r0, r1, r2)
            r3.f16712F = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.J$j r1 = new androidx.fragment.app.J$j
            r1.<init>()
            androidx.fragment.app.J$i r2 = new androidx.fragment.app.J$i
            r2.<init>()
            g.c r0 = r4.m(r0, r1, r2)
            r3.f16713G = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            h.b r0 = new h.b
            r0.<init>()
            androidx.fragment.app.J$a r1 = new androidx.fragment.app.J$a
            r1.<init>()
            g.c r4 = r4.m(r5, r0, r1)
            r3.f16714H = r4
        L_0x0128:
            androidx.fragment.app.A r4 = r3.f16750x
            boolean r5 = r4 instanceof androidx.core.content.f
            if (r5 == 0) goto L_0x0135
            androidx.core.content.f r4 = (androidx.core.content.f) r4
            x1.a r5 = r3.f16744r
            r4.addOnConfigurationChangedListener(r5)
        L_0x0135:
            androidx.fragment.app.A r4 = r3.f16750x
            boolean r5 = r4 instanceof androidx.core.content.g
            if (r5 == 0) goto L_0x0142
            androidx.core.content.g r4 = (androidx.core.content.g) r4
            x1.a r5 = r3.f16745s
            r4.addOnTrimMemoryListener(r5)
        L_0x0142:
            androidx.fragment.app.A r4 = r3.f16750x
            boolean r5 = r4 instanceof androidx.core.app.s
            if (r5 == 0) goto L_0x014f
            androidx.core.app.s r4 = (androidx.core.app.s) r4
            x1.a r5 = r3.f16746t
            r4.addOnMultiWindowModeChangedListener(r5)
        L_0x014f:
            androidx.fragment.app.A r4 = r3.f16750x
            boolean r5 = r4 instanceof androidx.core.app.t
            if (r5 == 0) goto L_0x015c
            androidx.core.app.t r4 = (androidx.core.app.t) r4
            x1.a r5 = r3.f16747u
            r4.addOnPictureInPictureModeChangedListener(r5)
        L_0x015c:
            androidx.fragment.app.A r4 = r3.f16750x
            boolean r5 = r4 instanceof androidx.core.view.C1720w
            if (r5 == 0) goto L_0x016b
            if (r6 != 0) goto L_0x016b
            androidx.core.view.w r4 = (androidx.core.view.C1720w) r4
            androidx.core.view.B r5 = r3.f16748v
            r4.addMenuProvider(r5)
        L_0x016b:
            return
        L_0x016c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.J.n(androidx.fragment.app.A, androidx.fragment.app.x, androidx.fragment.app.q):void");
    }

    public void n1(k kVar, boolean z10) {
        this.f16742p.o(kVar, z10);
    }

    /* access modifiers changed from: package-private */
    public void o(C1769q qVar) {
        if (L0(2)) {
            Log.v("FragmentManager", "attach: " + qVar);
        }
        if (qVar.mDetached) {
            qVar.mDetached = false;
            if (!qVar.mAdded) {
                this.f16729c.a(qVar);
                if (L0(2)) {
                    Log.v("FragmentManager", "add from attach: " + qVar);
                }
                if (M0(qVar)) {
                    this.f16716J = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o1(C1769q qVar) {
        if (L0(2)) {
            Log.v("FragmentManager", "remove: " + qVar + " nesting=" + qVar.mBackStackNesting);
        }
        boolean isInBackStack = qVar.isInBackStack();
        if (!qVar.mDetached || !isInBackStack) {
            this.f16729c.u(qVar);
            if (M0(qVar)) {
                this.f16716J = true;
            }
            qVar.mRemoving = true;
            z1(qVar);
        }
    }

    public T p() {
        return new C1753a(this);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (L0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f16734h);
        }
        C1753a aVar = this.f16734h;
        if (aVar != null) {
            aVar.f16877u = false;
            aVar.y();
            this.f16734h.s(true, new I(this));
            this.f16734h.h();
            this.f16735i = true;
            g0();
            this.f16735i = false;
            this.f16734h = null;
        }
    }

    /* access modifiers changed from: package-private */
    public Set q0(C1753a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f16815c.size(); i10++) {
            C1769q qVar = ((T.a) aVar.f16815c.get(i10)).f16833b;
            if (qVar != null && aVar.f16821i) {
                hashSet.add(qVar);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    public void q1(C1769q qVar) {
        this.f16724R.l(qVar);
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        boolean z10 = false;
        for (C1769q qVar : this.f16729c.l()) {
            if (qVar != null) {
                z10 = M0(qVar);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public int s0() {
        int i10;
        int size = this.f16730d.size();
        if (this.f16734h != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    /* access modifiers changed from: package-private */
    public void s1(Parcelable parcelable) {
        Q q10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f16750x.f().getClassLoader());
                    this.f16739m.put(next.substring(7), bundle2);
                }
            }
            HashMap hashMap = new HashMap();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f16750x.f().getClassLoader());
                    hashMap.put(next2.substring(9), bundle);
                }
            }
            this.f16729c.x(hashMap);
            L l10 = (L) bundle3.getParcelable("state");
            if (l10 != null) {
                this.f16729c.v();
                Iterator it = l10.f16770a.iterator();
                while (it.hasNext()) {
                    Bundle B10 = this.f16729c.B((String) it.next(), (Bundle) null);
                    if (B10 != null) {
                        C1769q f10 = this.f16724R.f(((P) B10.getParcelable("state")).f16787b);
                        if (f10 != null) {
                            if (L0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + f10);
                            }
                            q10 = new Q(this.f16742p, this.f16729c, f10, B10);
                        } else {
                            q10 = new Q(this.f16742p, this.f16729c, this.f16750x.f().getClassLoader(), w0(), B10);
                        }
                        C1769q k10 = q10.k();
                        k10.mSavedFragmentState = B10;
                        k10.mFragmentManager = this;
                        if (L0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k10.mWho + "): " + k10);
                        }
                        q10.o(this.f16750x.f().getClassLoader());
                        this.f16729c.r(q10);
                        q10.s(this.f16749w);
                    }
                }
                for (C1769q qVar : this.f16724R.i()) {
                    if (!this.f16729c.c(qVar.mWho)) {
                        if (L0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + qVar + " that was not found in the set of active Fragments " + l10.f16770a);
                        }
                        this.f16724R.l(qVar);
                        qVar.mFragmentManager = this;
                        Q q11 = new Q(this.f16742p, this.f16729c, qVar);
                        q11.s(1);
                        q11.m();
                        qVar.mRemoving = true;
                        q11.m();
                    }
                }
                this.f16729c.w(l10.f16771b);
                if (l10.f16772c != null) {
                    this.f16730d = new ArrayList(l10.f16772c.length);
                    int i10 = 0;
                    while (true) {
                        C1754b[] bVarArr = l10.f16772c;
                        if (i10 >= bVarArr.length) {
                            break;
                        }
                        C1753a b10 = bVarArr[i10].b(this);
                        if (L0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + b10.f16878v + "): " + b10);
                            PrintWriter printWriter = new PrintWriter(new Y("FragmentManager"));
                            b10.B("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f16730d.add(b10);
                        i10++;
                    }
                } else {
                    this.f16730d = new ArrayList();
                }
                this.f16737k.set(l10.f16773d);
                String str = l10.f16774e;
                if (str != null) {
                    C1769q h02 = h0(str);
                    this.f16707A = h02;
                    N(h02);
                }
                ArrayList arrayList = l10.f16775f;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        this.f16738l.put((String) arrayList.get(i11), (C1755c) l10.f16776g.get(i11));
                    }
                }
                this.f16715I = new ArrayDeque(l10.f16777h);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C1769q qVar = this.f16752z;
        if (qVar != null) {
            sb2.append(qVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f16752z)));
            sb2.append("}");
        } else {
            A a10 = this.f16750x;
            if (a10 != null) {
                sb2.append(a10.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f16750x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public C1775x u0() {
        return this.f16751y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public Bundle T0() {
        C1754b[] bVarArr;
        Bundle bundle = new Bundle();
        p0();
        Z();
        c0(true);
        this.f16717K = true;
        this.f16724R.m(true);
        ArrayList y10 = this.f16729c.y();
        HashMap m10 = this.f16729c.m();
        if (!m10.isEmpty()) {
            ArrayList z10 = this.f16729c.z();
            int size = this.f16730d.size();
            if (size > 0) {
                bVarArr = new C1754b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new C1754b((C1753a) this.f16730d.get(i10));
                    if (L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f16730d.get(i10));
                    }
                }
            } else {
                bVarArr = null;
            }
            L l10 = new L();
            l10.f16770a = y10;
            l10.f16771b = z10;
            l10.f16772c = bVarArr;
            l10.f16773d = this.f16737k.get();
            C1769q qVar = this.f16707A;
            if (qVar != null) {
                l10.f16774e = qVar.mWho;
            }
            l10.f16775f.addAll(this.f16738l.keySet());
            l10.f16776g.addAll(this.f16738l.values());
            l10.f16777h = new ArrayList(this.f16715I);
            bundle.putParcelable("state", l10);
            for (String str : this.f16739m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f16739m.get(str));
            }
            for (String str2 : m10.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) m10.get(str2));
            }
        } else if (L0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void v1() {
        synchronized (this.f16727a) {
            try {
                if (this.f16727a.size() == 1) {
                    this.f16750x.h().removeCallbacks(this.f16726T);
                    this.f16750x.h().post(this.f16726T);
                    E1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Set w(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C1753a) arrayList.get(i10)).f16815c.iterator();
            while (it.hasNext()) {
                C1769q qVar = ((T.a) it.next()).f16833b;
                if (!(qVar == null || (viewGroup = qVar.mContainer) == null)) {
                    hashSet.add(b0.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public C1777z w0() {
        C1777z zVar = this.f16708B;
        if (zVar != null) {
            return zVar;
        }
        C1769q qVar = this.f16752z;
        if (qVar != null) {
            return qVar.mFragmentManager.w0();
        }
        return this.f16709C;
    }

    /* access modifiers changed from: package-private */
    public void w1(C1769q qVar, boolean z10) {
        ViewGroup v02 = v0(qVar);
        if (v02 != null && (v02 instanceof FragmentContainerView)) {
            ((FragmentContainerView) v02).setDrawDisappearingViewsLast(!z10);
        }
    }

    /* access modifiers changed from: package-private */
    public Q x(C1769q qVar) {
        Q n10 = this.f16729c.n(qVar.mWho);
        if (n10 != null) {
            return n10;
        }
        Q q10 = new Q(this.f16742p, this.f16729c, qVar);
        q10.o(this.f16750x.f().getClassLoader());
        q10.s(this.f16749w);
        return q10;
    }

    public List x0() {
        return this.f16729c.o();
    }

    /* access modifiers changed from: package-private */
    public void x1(C1769q qVar, C1790m.b bVar) {
        if (!qVar.equals(h0(qVar.mWho)) || !(qVar.mHost == null || qVar.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + qVar + " is not an active fragment of FragmentManager " + this);
        }
        qVar.mMaxState = bVar;
    }

    /* access modifiers changed from: package-private */
    public void y(C1769q qVar) {
        if (L0(2)) {
            Log.v("FragmentManager", "detach: " + qVar);
        }
        if (!qVar.mDetached) {
            qVar.mDetached = true;
            if (qVar.mAdded) {
                if (L0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + qVar);
                }
                this.f16729c.u(qVar);
                if (M0(qVar)) {
                    this.f16716J = true;
                }
                z1(qVar);
            }
        }
    }

    public A y0() {
        return this.f16750x;
    }

    /* access modifiers changed from: package-private */
    public void y1(C1769q qVar) {
        if (qVar == null || (qVar.equals(h0(qVar.mWho)) && (qVar.mHost == null || qVar.mFragmentManager == this))) {
            C1769q qVar2 = this.f16707A;
            this.f16707A = qVar;
            N(qVar2);
            N(this.f16707A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + qVar + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public void z() {
        this.f16717K = false;
        this.f16718L = false;
        this.f16724R.m(false);
        U(4);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 z0() {
        return this.f16732f;
    }

    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f16763a;

        /* renamed from: b  reason: collision with root package name */
        int f16764b;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            /* renamed from: b */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(String str, int i10) {
            this.f16763a = str;
            this.f16764b = i10;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f16763a);
            parcel.writeInt(this.f16764b);
        }

        l(Parcel parcel) {
            this.f16763a = parcel.readString();
            this.f16764b = parcel.readInt();
        }
    }
}
