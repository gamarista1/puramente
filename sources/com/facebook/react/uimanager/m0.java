package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.yoga.h;
import g8.C3540a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import n7.C3863a;
import z8.C4236a;
import z8.C4237b;

public class m0 {

    /* renamed from: a  reason: collision with root package name */
    protected Object f41695a;

    /* renamed from: b  reason: collision with root package name */
    protected final EventDispatcher f41696b;

    /* renamed from: c  reason: collision with root package name */
    protected final ReactApplicationContext f41697c;

    /* renamed from: d  reason: collision with root package name */
    protected final C3409e0 f41698d;

    /* renamed from: e  reason: collision with root package name */
    private final B0 f41699e;

    /* renamed from: f  reason: collision with root package name */
    private final s0 f41700f;

    /* renamed from: g  reason: collision with root package name */
    private final D f41701g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f41702h;

    /* renamed from: i  reason: collision with root package name */
    private long f41703i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f41704j;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f41705a;

        a(U u10) {
            this.f41705a = u10;
        }

        public void run() {
            m0.this.f41698d.b(this.f41705a);
        }
    }

    m0(ReactApplicationContext reactApplicationContext, B0 b02, EventDispatcher eventDispatcher, int i10) {
        this(reactApplicationContext, b02, new s0(reactApplicationContext, new C(b02), i10), eventDispatcher);
    }

    private void A(U u10) {
        if (u10.hasUpdates()) {
            for (int i10 = 0; i10 < u10.getChildCount(); i10++) {
                A(u10.getChildAt(i10));
            }
            u10.onBeforeLayout(this.f41701g);
        }
    }

    private void L(U u10) {
        D.j(u10);
        this.f41698d.g(u10.getReactTag());
        for (int childCount = u10.getChildCount() - 1; childCount >= 0; childCount--) {
            L(u10.getChildAt(childCount));
        }
        u10.removeAndDisposeAllChildren();
    }

    private void c(U u10) {
        ViewManager viewManager = (ViewManager) C3863a.c(this.f41699e.c(u10.getViewClass()));
        if (viewManager instanceof C3424q) {
            C3424q qVar = (C3424q) viewManager;
            if (qVar != null && qVar.needsCustomLayoutForChildren()) {
                throw new r("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + u10.getViewClass() + "). Use measure instead.");
            }
            return;
        }
        throw new r("Trying to use view " + u10.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
    }

    private boolean e(int i10, String str) {
        if (this.f41698d.c(i10) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i10 + ", since the view does not exist";
        if (!E7.a.f30669b) {
            U5.a.I("ReactNative", str2);
            return false;
        }
        throw new r(str2);
    }

    private void n() {
        if (this.f41700f.U()) {
            m(-1);
        }
    }

    private void y(int i10, int i11, int[] iArr) {
        U c10 = this.f41698d.c(i10);
        U c11 = this.f41698d.c(i11);
        if (c10 == null || c11 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Tag ");
            if (c10 != null) {
                i10 = i11;
            }
            sb2.append(i10);
            sb2.append(" does not exist");
            throw new r(sb2.toString());
        }
        if (c10 != c11) {
            U parent = c10.getParent();
            while (parent != c11) {
                if (parent != null) {
                    parent = parent.getParent();
                } else {
                    throw new r("Tag " + i11 + " is not an ancestor of tag " + i10);
                }
            }
        }
        z(c10, c11, iArr);
    }

    private void z(U u10, U u11, int[] iArr) {
        int i10;
        int i11;
        if (u10 == u11 || u10.isVirtual()) {
            i11 = 0;
            i10 = 0;
        } else {
            i11 = Math.round(u10.getLayoutX());
            i10 = Math.round(u10.getLayoutY());
            for (U parent = u10.getParent(); parent != u11; parent = parent.getParent()) {
                C3863a.c(parent);
                c(parent);
                i11 += Math.round(parent.getLayoutX());
                i10 += Math.round(parent.getLayoutY());
            }
            c(u11);
        }
        iArr[0] = i11;
        iArr[1] = i10;
        iArr[2] = u10.getScreenWidth();
        iArr[3] = u10.getScreenHeight();
    }

    public void B() {
        this.f41704j = false;
        this.f41699e.f();
    }

    public void C() {
    }

    public void D() {
        this.f41700f.V();
    }

    public void E() {
        this.f41700f.Y();
    }

    public void F(l0 l0Var) {
        this.f41700f.W(l0Var);
    }

    public void G() {
        this.f41700f.X();
    }

    public void H(View view, int i10, C3415h0 h0Var) {
        synchronized (this.f41695a) {
            U h10 = h();
            h10.setReactTag(i10);
            h10.setThemedContext(h0Var);
            h0Var.runOnNativeModulesQueueThread(new a(h10));
            this.f41700f.y(i10, view);
        }
    }

    public void I(int i10) {
        synchronized (this.f41695a) {
            this.f41698d.h(i10);
        }
    }

    public void J(int i10) {
        I(i10);
        this.f41700f.J(i10);
    }

    /* access modifiers changed from: protected */
    public final void K(U u10) {
        L(u10);
        u10.dispose();
    }

    public int M(int i10) {
        if (this.f41698d.f(i10)) {
            return i10;
        }
        U N10 = N(i10);
        if (N10 != null) {
            return N10.getRootTag();
        }
        U5.a.I("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i10);
        return 0;
    }

    public final U N(int i10) {
        return this.f41698d.c(i10);
    }

    /* access modifiers changed from: protected */
    public final ViewManager O(String str) {
        return this.f41699e.e(str);
    }

    public void P(int i10, int i11) {
        this.f41700f.K(i10, i11);
    }

    public void Q(int i10, ReadableArray readableArray) {
        if (this.f41704j) {
            synchronized (this.f41695a) {
                try {
                    U c10 = this.f41698d.c(i10);
                    int i11 = 0;
                    while (i11 < readableArray.size()) {
                        U c11 = this.f41698d.c(readableArray.getInt(i11));
                        if (c11 != null) {
                            c10.addChildAt(c11, i11);
                            i11++;
                        } else {
                            throw new r("Trying to add unknown view tag: " + readableArray.getInt(i11));
                        }
                    }
                    this.f41701g.k(c10, readableArray);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void R(int i10, boolean z10) {
        U c10 = this.f41698d.c(i10);
        if (c10 != null) {
            while (c10.getNativeKind() == B.NONE) {
                c10 = c10.getParent();
            }
            this.f41700f.L(c10.getReactTag(), i10, z10);
        }
    }

    public void S(boolean z10) {
        this.f41700f.M(z10);
    }

    public void T(C3540a aVar) {
        this.f41700f.Z(aVar);
    }

    public void U(int i10, Object obj) {
        U c10 = this.f41698d.c(i10);
        if (c10 == null) {
            U5.a.I("ReactNative", "Attempt to set local data for view with unknown tag: " + i10);
            return;
        }
        c10.setLocalData(obj);
        n();
    }

    public void V(int i10, W w10) {
        UiThreadUtil.assertOnUiThread();
        this.f41700f.S().updateProperties(i10, w10);
    }

    public void W(int i10, int i11, int i12, int i13, int i14) {
        U c10 = this.f41698d.c(i10);
        if (c10 == null) {
            U5.a.I("ReactNative", "Tried to update size of non-existent tag: " + i10);
            return;
        }
        c10.setPadding(4, (float) i12);
        c10.setPadding(1, (float) i11);
        c10.setPadding(5, (float) i14);
        c10.setPadding(3, (float) i13);
        n();
    }

    public void X(int i10, int i11, int i12) {
        U c10 = this.f41698d.c(i10);
        if (c10 == null) {
            U5.a.I("ReactNative", "Tried to update size of non-existent tag: " + i10);
            return;
        }
        c10.setStyleWidth((float) i11);
        c10.setStyleHeight((float) i12);
        n();
    }

    public void Y(int i10, int i11, int i12) {
        U c10 = this.f41698d.c(i10);
        if (c10 == null) {
            U5.a.I("ReactNative", "Tried to update non-existent root tag: " + i10);
            return;
        }
        Z(c10, i11, i12);
    }

    public void Z(U u10, int i10, int i11) {
        u10.setMeasureSpecs(i10, i11);
    }

    public void a(l0 l0Var) {
        this.f41700f.N(l0Var);
    }

    public void a0(int i10, String str, ReadableMap readableMap) {
        if (this.f41704j) {
            if (this.f41699e.c(str) != null) {
                U c10 = this.f41698d.c(i10);
                if (c10 == null) {
                    throw new r("Trying to update non-existent view with tag " + i10);
                } else if (readableMap != null) {
                    W w10 = new W(readableMap);
                    c10.updateProperties(w10);
                    t(c10, str, w10);
                }
            } else {
                throw new r("Got unknown view type: " + str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(U u10, float f10, float f11, List list) {
        if (u10.hasUpdates()) {
            if (u10.dispatchUpdatesWillChangeLayout(f10, f11) && u10.shouldNotifyOnLayout() && !this.f41698d.f(u10.getReactTag())) {
                list.add(u10);
            }
            Iterable<U> calculateLayoutOnChildren = u10.calculateLayoutOnChildren();
            if (calculateLayoutOnChildren != null) {
                for (U b10 : calculateLayoutOnChildren) {
                    b(b10, u10.getLayoutX() + f10, u10.getLayoutY() + f11, list);
                }
            }
            u10.dispatchUpdates(f10, f11, this.f41700f, this.f41701g);
            u10.markUpdateSeen();
            this.f41701g.p(u10);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0() {
        /*
            r13 = this;
            java.lang.String r0 = "rootTag"
            java.lang.String r1 = "UIImplementation.updateViewHierarchy"
            r2 = 0
            z8.C4236a.c(r2, r1)
            r1 = 0
        L_0x000a:
            com.facebook.react.uimanager.e0 r4 = r13.f41698d     // Catch:{ all -> 0x0093 }
            int r4 = r4.d()     // Catch:{ all -> 0x0093 }
            if (r1 >= r4) goto L_0x00a2
            com.facebook.react.uimanager.e0 r4 = r13.f41698d     // Catch:{ all -> 0x0093 }
            int r4 = r4.e(r1)     // Catch:{ all -> 0x0093 }
            com.facebook.react.uimanager.e0 r5 = r13.f41698d     // Catch:{ all -> 0x0093 }
            com.facebook.react.uimanager.U r4 = r5.c(r4)     // Catch:{ all -> 0x0093 }
            java.lang.Integer r5 = r4.getWidthMeasureSpec()     // Catch:{ all -> 0x0093 }
            if (r5 == 0) goto L_0x009e
            java.lang.Integer r5 = r4.getHeightMeasureSpec()     // Catch:{ all -> 0x0093 }
            if (r5 == 0) goto L_0x009e
            java.lang.String r5 = "UIImplementation.notifyOnBeforeLayoutRecursive"
            z8.b$a r5 = z8.C4237b.a(r2, r5)     // Catch:{ all -> 0x0093 }
            int r6 = r4.getReactTag()     // Catch:{ all -> 0x0093 }
            z8.b$a r5 = r5.a(r0, r6)     // Catch:{ all -> 0x0093 }
            r5.c()     // Catch:{ all -> 0x0093 }
            r13.A(r4)     // Catch:{ all -> 0x0099 }
            z8.C4236a.i(r2)     // Catch:{ all -> 0x0093 }
            r13.d(r4)     // Catch:{ all -> 0x0093 }
            java.lang.String r5 = "UIImplementation.applyUpdatesRecursive"
            z8.b$a r5 = z8.C4237b.a(r2, r5)     // Catch:{ all -> 0x0093 }
            int r6 = r4.getReactTag()     // Catch:{ all -> 0x0093 }
            z8.b$a r5 = r5.a(r0, r6)     // Catch:{ all -> 0x0093 }
            r5.c()     // Catch:{ all -> 0x0093 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008d }
            r5.<init>()     // Catch:{ all -> 0x008d }
            r6 = 0
            r13.b(r4, r6, r6, r5)     // Catch:{ all -> 0x008d }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x008d }
        L_0x0062:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x008d }
            com.facebook.react.uimanager.U r5 = (com.facebook.react.uimanager.U) r5     // Catch:{ all -> 0x008d }
            com.facebook.react.uimanager.events.EventDispatcher r6 = r13.f41696b     // Catch:{ all -> 0x008d }
            int r8 = r5.getReactTag()     // Catch:{ all -> 0x008d }
            int r9 = r5.getScreenX()     // Catch:{ all -> 0x008d }
            int r10 = r5.getScreenY()     // Catch:{ all -> 0x008d }
            int r11 = r5.getScreenWidth()     // Catch:{ all -> 0x008d }
            int r12 = r5.getScreenHeight()     // Catch:{ all -> 0x008d }
            r7 = -1
            com.facebook.react.uimanager.F r5 = com.facebook.react.uimanager.F.c(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x008d }
            r6.h(r5)     // Catch:{ all -> 0x008d }
            goto L_0x0062
        L_0x008d:
            r0 = move-exception
            goto L_0x0095
        L_0x008f:
            z8.C4236a.i(r2)     // Catch:{ all -> 0x0093 }
            goto L_0x009e
        L_0x0093:
            r0 = move-exception
            goto L_0x00a6
        L_0x0095:
            z8.C4236a.i(r2)     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0099:
            r0 = move-exception
            z8.C4236a.i(r2)     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x00a2:
            z8.C4236a.i(r2)
            return
        L_0x00a6:
            z8.C4236a.i(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.m0.b0():void");
    }

    public void c0(int i10, int i11, Callback callback) {
        U c10 = this.f41698d.c(i10);
        U c11 = this.f41698d.c(i11);
        if (c10 == null || c11 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(c10.isDescendantOf(c11)));
        }
    }

    /* access modifiers changed from: protected */
    public void d(U u10) {
        float f10;
        C4237b.a(0, "cssRoot.calculateLayout").a("rootTag", u10.getReactTag()).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = u10.getWidthMeasureSpec().intValue();
            int intValue2 = u10.getHeightMeasureSpec().intValue();
            float f11 = Float.NaN;
            if (View.MeasureSpec.getMode(intValue) == 0) {
                f10 = Float.NaN;
            } else {
                f10 = (float) View.MeasureSpec.getSize(intValue);
            }
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f11 = (float) View.MeasureSpec.getSize(intValue2);
            }
            u10.calculateLayout(f10, f11);
        } finally {
            C4236a.i(0);
            this.f41703i = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    public void f() {
        this.f41700f.A();
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f41700f.B(readableMap, callback);
    }

    /* access modifiers changed from: protected */
    public U h() {
        V v10 = new V();
        if (com.facebook.react.modules.i18nmanager.a.f().i(this.f41697c)) {
            v10.setLayoutDirection(h.RTL);
        }
        v10.setViewClassName("Root");
        return v10;
    }

    /* access modifiers changed from: protected */
    public U i(String str) {
        return this.f41699e.c(str).createShadowNodeInstance(this.f41697c);
    }

    public void j(int i10, String str, int i11, ReadableMap readableMap) {
        W w10;
        if (this.f41704j) {
            synchronized (this.f41695a) {
                try {
                    U i12 = i(str);
                    U c10 = this.f41698d.c(i11);
                    C3863a.d(c10, "Root node with tag " + i11 + " doesn't exist");
                    i12.setReactTag(i10);
                    i12.setViewClassName(str);
                    i12.setRootTag(c10.getReactTag());
                    i12.setThemedContext(c10.getThemedContext());
                    this.f41698d.a(i12);
                    if (readableMap != null) {
                        w10 = new W(readableMap);
                        i12.updateProperties(w10);
                    } else {
                        w10 = null;
                    }
                    s(i12, i11, w10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void k(int i10, int i11, ReadableArray readableArray) {
        if (e(i10, "dispatchViewManagerCommand: " + i11)) {
            this.f41700f.D(i10, i11, readableArray);
        }
    }

    public void l(int i10, String str, ReadableArray readableArray) {
        if (e(i10, "dispatchViewManagerCommand: " + str)) {
            this.f41700f.E(i10, str, readableArray);
        }
    }

    public void m(int i10) {
        C4237b.a(0, "UIImplementation.dispatchViewUpdates").a("batchId", i10).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            b0();
            this.f41701g.o();
            this.f41700f.z(i10, uptimeMillis, this.f41703i);
        } finally {
            C4236a.i(0);
        }
    }

    public void o(int i10, float f10, float f11, Callback callback) {
        this.f41700f.F(i10, f10, f11, callback);
    }

    public Map p() {
        return this.f41700f.T();
    }

    public int q() {
        return this.f41700f.S().getRootViewNum();
    }

    /* access modifiers changed from: package-private */
    public s0 r() {
        return this.f41700f;
    }

    /* access modifiers changed from: protected */
    public void s(U u10, int i10, W w10) {
        if (!u10.isVirtual()) {
            this.f41701g.g(u10, u10.getThemedContext(), w10);
        }
    }

    /* access modifiers changed from: protected */
    public void t(U u10, String str, W w10) {
        if (!u10.isVirtual()) {
            this.f41701g.m(u10, str, w10);
        }
    }

    public void u(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int i11;
        int i12;
        int i13;
        int i14 = i10;
        ReadableArray readableArray6 = readableArray;
        ReadableArray readableArray7 = readableArray2;
        ReadableArray readableArray8 = readableArray3;
        ReadableArray readableArray9 = readableArray4;
        ReadableArray readableArray10 = readableArray5;
        if (this.f41704j) {
            synchronized (this.f41695a) {
                try {
                    U c10 = this.f41698d.c(i14);
                    if (readableArray6 == null) {
                        i11 = 0;
                    } else {
                        i11 = readableArray.size();
                    }
                    if (readableArray8 == null) {
                        i12 = 0;
                    } else {
                        i12 = readableArray3.size();
                    }
                    if (readableArray10 == null) {
                        i13 = 0;
                    } else {
                        i13 = readableArray5.size();
                    }
                    if (i11 != 0) {
                        if (readableArray7 == null || i11 != readableArray2.size()) {
                            throw new r("Size of moveFrom != size of moveTo!");
                        }
                    }
                    if (i12 != 0) {
                        if (readableArray9 == null || i12 != readableArray4.size()) {
                            throw new r("Size of addChildTags != size of addAtIndices!");
                        }
                    }
                    int i15 = i11 + i12;
                    u0[] u0VarArr = new u0[i15];
                    int i16 = i11 + i13;
                    int[] iArr = new int[i16];
                    try {
                        int[] iArr2 = new int[i16];
                        int i17 = i15;
                        int[] iArr3 = new int[i13];
                        if (i11 > 0) {
                            C3863a.c(readableArray);
                            C3863a.c(readableArray2);
                            int i18 = 0;
                            while (i18 < i11) {
                                int i19 = i16;
                                int i20 = readableArray6.getInt(i18);
                                int reactTag = c10.getChildAt(i20).getReactTag();
                                u0VarArr[i18] = new u0(reactTag, readableArray7.getInt(i18));
                                iArr[i18] = i20;
                                iArr2[i18] = reactTag;
                                i18++;
                                readableArray6 = readableArray;
                                i16 = i19;
                                iArr3 = iArr3;
                                c10 = c10;
                            }
                        }
                        U u10 = c10;
                        int[] iArr4 = iArr3;
                        int i21 = i16;
                        if (i12 > 0) {
                            C3863a.c(readableArray3);
                            C3863a.c(readableArray4);
                            for (int i22 = 0; i22 < i12; i22++) {
                                u0VarArr[i11 + i22] = new u0(readableArray8.getInt(i22), readableArray9.getInt(i22));
                            }
                        }
                        if (i13 > 0) {
                            C3863a.c(readableArray5);
                            int i23 = 0;
                            while (i23 < i13) {
                                int i24 = readableArray10.getInt(i23);
                                U u11 = u10;
                                int reactTag2 = u11.getChildAt(i24).getReactTag();
                                int i25 = i11 + i23;
                                iArr[i25] = i24;
                                iArr2[i25] = reactTag2;
                                iArr4[i23] = reactTag2;
                                i23++;
                                u10 = u11;
                            }
                        }
                        U u12 = u10;
                        Arrays.sort(u0VarArr, u0.f41821c);
                        Arrays.sort(iArr);
                        int i26 = i21 - 1;
                        int i27 = -1;
                        while (i26 >= 0) {
                            int i28 = iArr[i26];
                            if (i28 != i27) {
                                u12.removeChildAt(i28);
                                i27 = iArr[i26];
                                i26--;
                            } else {
                                throw new r("Repeated indices in Removal list for view tag: " + i10);
                            }
                        }
                        int i29 = i17;
                        int i30 = 0;
                        while (i30 < i29) {
                            u0 u0Var = u0VarArr[i30];
                            int[] iArr5 = iArr2;
                            U c11 = this.f41698d.c(u0Var.f41822a);
                            if (c11 != null) {
                                u12.addChildAt(c11, u0Var.f41823b);
                                i30++;
                                iArr2 = iArr5;
                            } else {
                                throw new r("Trying to add unknown view tag: " + u0Var.f41822a);
                            }
                        }
                        int[] iArr6 = iArr2;
                        this.f41701g.i(u12, iArr, iArr6, u0VarArr, iArr4);
                        for (int i31 = 0; i31 < i13; i31++) {
                            K(this.f41698d.c(iArr4[i31]));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
    }

    public void v(int i10, Callback callback) {
        if (this.f41704j) {
            this.f41700f.H(i10, callback);
        }
    }

    public void w(int i10, Callback callback) {
        if (this.f41704j) {
            this.f41700f.I(i10, callback);
        }
    }

    public void x(int i10, int i11, Callback callback, Callback callback2) {
        if (this.f41704j) {
            try {
                y(i10, i11, this.f41702h);
                callback2.invoke(Float.valueOf(G.f((float) this.f41702h[0])), Float.valueOf(G.f((float) this.f41702h[1])), Float.valueOf(G.f((float) this.f41702h[2])), Float.valueOf(G.f((float) this.f41702h[3])));
            } catch (r e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    protected m0(ReactApplicationContext reactApplicationContext, B0 b02, s0 s0Var, EventDispatcher eventDispatcher) {
        this.f41695a = new Object();
        C3409e0 e0Var = new C3409e0();
        this.f41698d = e0Var;
        this.f41702h = new int[4];
        this.f41703i = 0;
        this.f41704j = true;
        this.f41697c = reactApplicationContext;
        this.f41699e = b02;
        this.f41700f = s0Var;
        this.f41701g = new D(s0Var, e0Var);
        this.f41696b = eventDispatcher;
    }
}
