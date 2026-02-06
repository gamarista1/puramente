package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.modules.core.b;
import g8.C3540a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import z8.C4236a;
import z8.C4237b;

public class s0 {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public static final String f41720A = "s0";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int[] f41721a = new int[4];
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C f41722b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f41723c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f41724d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final i f41725e;

    /* renamed from: f  reason: collision with root package name */
    private final ReactApplicationContext f41726f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f41727g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList f41728h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f41729i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public ArrayDeque f41730j = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public C3540a f41731k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f41732l = false;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f41733m = false;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f41734n = false;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public long f41735o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public long f41736p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public long f41737q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public long f41738r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public long f41739s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public long f41740t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public long f41741u;

    /* renamed from: v  reason: collision with root package name */
    private long f41742v;

    /* renamed from: w  reason: collision with root package name */
    private long f41743w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public long f41744x;

    /* renamed from: y  reason: collision with root package name */
    private long f41745y;

    /* renamed from: z  reason: collision with root package name */
    private long f41746z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f41747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f41748b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayDeque f41749c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f41750d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f41751e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f41752f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f41753g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f41754h;

        a(int i10, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j10, long j11, long j12, long j13) {
            this.f41747a = i10;
            this.f41748b = arrayList;
            this.f41749c = arrayDeque;
            this.f41750d = arrayList2;
            this.f41751e = j10;
            this.f41752f = j11;
            this.f41753g = j12;
            this.f41754h = j13;
        }

        public void run() {
            C4237b.a(0, "DispatchUI").a("BatchId", this.f41747a).c();
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = this.f41748b;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        g gVar = (g) it.next();
                        try {
                            gVar.d();
                        } catch (RetryableMountingLayerException e10) {
                            RetryableMountingLayerException retryableMountingLayerException = e10;
                            if (gVar.a() == 0) {
                                gVar.c();
                                s0.this.f41727g.add(gVar);
                            } else {
                                ReactSoftExceptionLogger.logSoftException(s0.f41720A, new ReactNoCrashSoftException((Throwable) retryableMountingLayerException));
                            }
                        } catch (Throwable th2) {
                            ReactSoftExceptionLogger.logSoftException(s0.f41720A, th2);
                        }
                    }
                }
                ArrayDeque arrayDeque = this.f41749c;
                if (arrayDeque != null) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext()) {
                        ((r) it2.next()).b();
                    }
                }
                ArrayList arrayList2 = this.f41750d;
                if (arrayList2 != null) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((r) it3.next()).b();
                    }
                }
                if (s0.this.f41734n && s0.this.f41736p == 0) {
                    s0.this.f41736p = this.f41751e;
                    s0.this.f41737q = SystemClock.uptimeMillis();
                    s0.this.f41738r = this.f41752f;
                    s0.this.f41739s = this.f41753g;
                    s0.this.f41740t = uptimeMillis;
                    s0 s0Var = s0.this;
                    s0Var.f41741u = s0Var.f41737q;
                    s0.this.f41744x = this.f41754h;
                    C4236a.b(0, "delayBeforeDispatchViewUpdates", 0, s0.this.f41736p * 1000000);
                    C4236a.h(0, "delayBeforeDispatchViewUpdates", 0, s0.this.f41739s * 1000000);
                    C4236a.b(0, "delayBeforeBatchRunStart", 0, s0.this.f41739s * 1000000);
                    C4236a.h(0, "delayBeforeBatchRunStart", 0, s0.this.f41740t * 1000000);
                }
                s0.this.f41722b.clearLayoutAnimation();
                if (s0.this.f41731k != null) {
                    s0.this.f41731k.a();
                }
                C4236a.i(0);
            } catch (Exception e11) {
                s0.this.f41733m = true;
                throw e11;
            } catch (Throwable th3) {
                C4236a.i(0);
                throw th3;
            }
        }
    }

    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        public void runGuarded() {
            s0.this.R();
        }
    }

    private final class c extends v {

        /* renamed from: c  reason: collision with root package name */
        private final int f41757c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f41758d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f41759e;

        public c(int i10, int i11, boolean z10, boolean z11) {
            super(i10);
            this.f41757c = i11;
            this.f41759e = z10;
            this.f41758d = z11;
        }

        public void b() {
            if (!this.f41759e) {
                s0.this.f41722b.setJSResponder(this.f41811a, this.f41757c, this.f41758d);
            } else {
                s0.this.f41722b.clearJSResponder();
            }
        }
    }

    private class d implements r {

        /* renamed from: a  reason: collision with root package name */
        private final ReadableMap f41761a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f41762b;

        public void b() {
            s0.this.f41722b.configureLayoutAnimation(this.f41761a, this.f41762b);
        }

        private d(ReadableMap readableMap, Callback callback) {
            this.f41761a = readableMap;
            this.f41762b = callback;
        }
    }

    private final class e extends v {

        /* renamed from: c  reason: collision with root package name */
        private final C3415h0 f41764c;

        /* renamed from: d  reason: collision with root package name */
        private final String f41765d;

        /* renamed from: e  reason: collision with root package name */
        private final W f41766e;

        public e(C3415h0 h0Var, int i10, String str, W w10) {
            super(i10);
            this.f41764c = h0Var;
            this.f41765d = str;
            this.f41766e = w10;
            C4236a.l(0, "createView", this.f41811a);
        }

        public void b() {
            C4236a.f(0, "createView", this.f41811a);
            s0.this.f41722b.createView(this.f41764c, this.f41811a, this.f41765d, this.f41766e);
        }
    }

    private final class f extends v implements g {

        /* renamed from: c  reason: collision with root package name */
        private final int f41768c;

        /* renamed from: d  reason: collision with root package name */
        private final ReadableArray f41769d;

        /* renamed from: e  reason: collision with root package name */
        private int f41770e = 0;

        public f(int i10, int i11, ReadableArray readableArray) {
            super(i10);
            this.f41768c = i11;
            this.f41769d = readableArray;
        }

        public int a() {
            return this.f41770e;
        }

        public void b() {
            try {
                s0.this.f41722b.dispatchCommand(this.f41811a, this.f41768c, this.f41769d);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(s0.f41720A, new RuntimeException("Error dispatching View Command", th2));
            }
        }

        public void c() {
            this.f41770e++;
        }

        public void d() {
            s0.this.f41722b.dispatchCommand(this.f41811a, this.f41768c, this.f41769d);
        }
    }

    private interface g {
        int a();

        void c();

        void d();
    }

    private final class h extends v implements g {

        /* renamed from: c  reason: collision with root package name */
        private final String f41772c;

        /* renamed from: d  reason: collision with root package name */
        private final ReadableArray f41773d;

        /* renamed from: e  reason: collision with root package name */
        private int f41774e = 0;

        public h(int i10, String str, ReadableArray readableArray) {
            super(i10);
            this.f41772c = str;
            this.f41773d = readableArray;
        }

        public int a() {
            return this.f41774e;
        }

        public void b() {
            try {
                s0.this.f41722b.dispatchCommand(this.f41811a, this.f41772c, this.f41773d);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(s0.f41720A, new RuntimeException("Error dispatching View Command", th2));
            }
        }

        public void c() {
            this.f41774e++;
        }

        public void d() {
            s0.this.f41722b.dispatchCommand(this.f41811a, this.f41772c, this.f41773d);
        }
    }

    private class i extends C3422o {

        /* renamed from: a  reason: collision with root package name */
        private final int f41776a;

        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r2 = android.os.SystemClock.uptimeMillis();
            r1.b();
            r0 = r8.f41777b;
            com.facebook.react.uimanager.s0.o(r0, com.facebook.react.uimanager.s0.e(r0) + (android.os.SystemClock.uptimeMillis() - r2));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
            com.facebook.react.uimanager.s0.n(r8.f41777b, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
            throw r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(long r9) {
            /*
                r8 = this;
            L_0x0000:
                long r0 = java.lang.System.nanoTime()
                long r0 = r0 - r9
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r0 = r0 / r2
                r2 = 16
                long r2 = r2 - r0
                int r0 = r8.f41776a
                long r0 = (long) r0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0014
                goto L_0x0028
            L_0x0014:
                com.facebook.react.uimanager.s0 r0 = com.facebook.react.uimanager.s0.this
                java.lang.Object r0 = r0.f41724d
                monitor-enter(r0)
                com.facebook.react.uimanager.s0 r1 = com.facebook.react.uimanager.s0.this     // Catch:{ all -> 0x0029 }
                java.util.ArrayDeque r1 = r1.f41730j     // Catch:{ all -> 0x0029 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0029 }
                if (r1 == 0) goto L_0x002b
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            L_0x0028:
                return
            L_0x0029:
                r9 = move-exception
                goto L_0x0057
            L_0x002b:
                com.facebook.react.uimanager.s0 r1 = com.facebook.react.uimanager.s0.this     // Catch:{ all -> 0x0029 }
                java.util.ArrayDeque r1 = r1.f41730j     // Catch:{ all -> 0x0029 }
                java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0029 }
                com.facebook.react.uimanager.s0$r r1 = (com.facebook.react.uimanager.s0.r) r1     // Catch:{ all -> 0x0029 }
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x004f }
                r1.b()     // Catch:{ Exception -> 0x004f }
                com.facebook.react.uimanager.s0 r0 = com.facebook.react.uimanager.s0.this     // Catch:{ Exception -> 0x004f }
                long r4 = r0.f41735o     // Catch:{ Exception -> 0x004f }
                long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x004f }
                long r6 = r6 - r2
                long r4 = r4 + r6
                r0.f41735o = r4     // Catch:{ Exception -> 0x004f }
                goto L_0x0000
            L_0x004f:
                r9 = move-exception
                com.facebook.react.uimanager.s0 r10 = com.facebook.react.uimanager.s0.this
                r0 = 1
                r10.f41733m = r0
                throw r9
            L_0x0057:
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.s0.i.a(long):void");
        }

        /* JADX INFO: finally extract failed */
        public void doFrameGuarded(long j10) {
            if (s0.this.f41733m) {
                U5.a.I("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            C4236a.c(0, "dispatchNonBatchedUIOperations");
            try {
                a(j10);
                C4236a.i(0);
                s0.this.R();
                com.facebook.react.modules.core.b.h().k(b.a.DISPATCH_UI, this);
            } catch (Throwable th2) {
                C4236a.i(0);
                throw th2;
            }
        }

        private i(ReactContext reactContext, int i10) {
            super(reactContext);
            this.f41776a = i10;
        }
    }

    private final class j implements r {

        /* renamed from: a  reason: collision with root package name */
        private final int f41778a;

        /* renamed from: b  reason: collision with root package name */
        private final float f41779b;

        /* renamed from: c  reason: collision with root package name */
        private final float f41780c;

        /* renamed from: d  reason: collision with root package name */
        private final Callback f41781d;

        public void b() {
            try {
                s0.this.f41722b.measure(this.f41778a, s0.this.f41721a);
                float f10 = (float) s0.this.f41721a[0];
                float f11 = (float) s0.this.f41721a[1];
                int findTargetTagForTouch = s0.this.f41722b.findTargetTagForTouch(this.f41778a, this.f41779b, this.f41780c);
                try {
                    s0.this.f41722b.measure(findTargetTagForTouch, s0.this.f41721a);
                    this.f41781d.invoke(Integer.valueOf(findTargetTagForTouch), Float.valueOf(G.f(((float) s0.this.f41721a[0]) - f10)), Float.valueOf(G.f(((float) s0.this.f41721a[1]) - f11)), Float.valueOf(G.f((float) s0.this.f41721a[2])), Float.valueOf(G.f((float) s0.this.f41721a[3])));
                } catch (r unused) {
                    this.f41781d.invoke(new Object[0]);
                }
            } catch (r unused2) {
                this.f41781d.invoke(new Object[0]);
            }
        }

        private j(int i10, float f10, float f11, Callback callback) {
            this.f41778a = i10;
            this.f41779b = f10;
            this.f41780c = f11;
            this.f41781d = callback;
        }
    }

    private final class k extends v {

        /* renamed from: c  reason: collision with root package name */
        private final int[] f41783c;

        /* renamed from: d  reason: collision with root package name */
        private final u0[] f41784d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f41785e;

        public k(int i10, int[] iArr, u0[] u0VarArr, int[] iArr2) {
            super(i10);
            this.f41783c = iArr;
            this.f41784d = u0VarArr;
            this.f41785e = iArr2;
        }

        public void b() {
            s0.this.f41722b.manageChildren(this.f41811a, this.f41783c, this.f41784d, this.f41785e);
        }
    }

    private final class l implements r {

        /* renamed from: a  reason: collision with root package name */
        private final int f41787a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f41788b;

        public void b() {
            try {
                s0.this.f41722b.measureInWindow(this.f41787a, s0.this.f41721a);
                this.f41788b.invoke(Float.valueOf(G.f((float) s0.this.f41721a[0])), Float.valueOf(G.f((float) s0.this.f41721a[1])), Float.valueOf(G.f((float) s0.this.f41721a[2])), Float.valueOf(G.f((float) s0.this.f41721a[3])));
            } catch (E unused) {
                this.f41788b.invoke(new Object[0]);
            }
        }

        private l(int i10, Callback callback) {
            this.f41787a = i10;
            this.f41788b = callback;
        }
    }

    private final class m implements r {

        /* renamed from: a  reason: collision with root package name */
        private final int f41790a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f41791b;

        public void b() {
            try {
                s0.this.f41722b.measure(this.f41790a, s0.this.f41721a);
                float f10 = G.f((float) s0.this.f41721a[0]);
                float f11 = G.f((float) s0.this.f41721a[1]);
                this.f41791b.invoke(0, 0, Float.valueOf(G.f((float) s0.this.f41721a[2])), Float.valueOf(G.f((float) s0.this.f41721a[3])), Float.valueOf(f10), Float.valueOf(f11));
            } catch (E unused) {
                this.f41791b.invoke(new Object[0]);
            }
        }

        private m(int i10, Callback callback) {
            this.f41790a = i10;
            this.f41791b = callback;
        }
    }

    private final class n extends v {
        public n(int i10) {
            super(i10);
        }

        public void b() {
            s0.this.f41722b.removeRootView(this.f41811a);
        }
    }

    private final class o extends v {

        /* renamed from: c  reason: collision with root package name */
        private final int f41794c;

        public void b() {
            try {
                s0.this.f41722b.sendAccessibilityEvent(this.f41811a, this.f41794c);
            } catch (RetryableMountingLayerException e10) {
                ReactSoftExceptionLogger.logSoftException(s0.f41720A, e10);
            }
        }

        private o(int i10, int i11) {
            super(i10);
            this.f41794c = i11;
        }
    }

    private class p implements r {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f41796a;

        public void b() {
            s0.this.f41722b.setLayoutAnimationEnabled(this.f41796a);
        }

        private p(boolean z10) {
            this.f41796a = z10;
        }
    }

    private class q implements r {

        /* renamed from: a  reason: collision with root package name */
        private final l0 f41798a;

        public q(l0 l0Var) {
            this.f41798a = l0Var;
        }

        public void b() {
            this.f41798a.a(s0.this.f41722b);
        }
    }

    public interface r {
        void b();
    }

    private final class s extends v {

        /* renamed from: c  reason: collision with root package name */
        private final int f41800c;

        /* renamed from: d  reason: collision with root package name */
        private final int f41801d;

        /* renamed from: e  reason: collision with root package name */
        private final int f41802e;

        /* renamed from: f  reason: collision with root package name */
        private final int f41803f;

        /* renamed from: g  reason: collision with root package name */
        private final int f41804g;

        /* renamed from: h  reason: collision with root package name */
        private final com.facebook.yoga.h f41805h;

        public s(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
            super(i11);
            this.f41800c = i10;
            this.f41801d = i12;
            this.f41802e = i13;
            this.f41803f = i14;
            this.f41804g = i15;
            this.f41805h = hVar;
            C4236a.l(0, "updateLayout", this.f41811a);
        }

        public void b() {
            C4236a.f(0, "updateLayout", this.f41811a);
            s0.this.f41722b.updateLayout(this.f41800c, this.f41811a, this.f41801d, this.f41802e, this.f41803f, this.f41804g, this.f41805h);
        }
    }

    private final class t extends v {

        /* renamed from: c  reason: collision with root package name */
        private final W f41807c;

        public void b() {
            s0.this.f41722b.updateProperties(this.f41811a, this.f41807c);
        }

        private t(int i10, W w10) {
            super(i10);
            this.f41807c = w10;
        }
    }

    private final class u extends v {

        /* renamed from: c  reason: collision with root package name */
        private final Object f41809c;

        public u(int i10, Object obj) {
            super(i10);
            this.f41809c = obj;
        }

        public void b() {
            s0.this.f41722b.updateViewExtraData(this.f41811a, this.f41809c);
        }
    }

    private abstract class v implements r {

        /* renamed from: a  reason: collision with root package name */
        public int f41811a;

        public v(int i10) {
            this.f41811a = i10;
        }
    }

    public s0(ReactApplicationContext reactApplicationContext, C c10, int i10) {
        this.f41722b = c10;
        this.f41725e = new i(reactApplicationContext, i10 == -1 ? 8 : i10);
        this.f41726f = reactApplicationContext;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = android.os.SystemClock.uptimeMillis();
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r12.f41734n == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r12.f41742v = android.os.SystemClock.uptimeMillis() - r2;
        r12.f41743w = r12.f41735o;
        r12.f41734n = false;
        z8.C4236a.b(0, "batchedExecutionTime", 0, r2 * 1000000);
        z8.C4236a.g(0, "batchedExecutionTime", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r12.f41735o = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void R() {
        /*
            r12 = this;
            boolean r0 = r12.f41733m
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Not flushing pending UI operations because of previously thrown Exception"
            U5.a.I(r0, r1)
            return
        L_0x000c:
            java.lang.Object r0 = r12.f41723c
            monitor-enter(r0)
            java.util.ArrayList r1 = r12.f41729i     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0064
            java.util.ArrayList r1 = r12.f41729i     // Catch:{ all -> 0x0062 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
            r12.f41729i = r2     // Catch:{ all -> 0x0062 }
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            long r2 = android.os.SystemClock.uptimeMillis()
            java.util.Iterator r0 = r1.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0029
        L_0x0039:
            boolean r0 = r12.f41734n
            r4 = 0
            if (r0 == 0) goto L_0x005f
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r2
            r12.f41742v = r0
            long r0 = r12.f41735o
            r12.f41743w = r0
            r0 = 0
            r12.f41734n = r0
            java.lang.String r8 = "batchedExecutionTime"
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r2 * r6
            r6 = 0
            r9 = 0
            z8.C4236a.b(r6, r8, r9, r10)
            java.lang.String r1 = "batchedExecutionTime"
            z8.C4236a.g(r4, r1, r0)
        L_0x005f:
            r12.f41735o = r4
            return
        L_0x0062:
            r1 = move-exception
            goto L_0x0066
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.s0.R():void");
    }

    public void A() {
        this.f41728h.add(new c(0, 0, true, false));
    }

    public void B(ReadableMap readableMap, Callback callback) {
        this.f41728h.add(new d(readableMap, callback));
    }

    public void C(C3415h0 h0Var, int i10, String str, W w10) {
        synchronized (this.f41724d) {
            this.f41745y++;
            this.f41730j.addLast(new e(h0Var, i10, str, w10));
        }
    }

    public void D(int i10, int i11, ReadableArray readableArray) {
        this.f41727g.add(new f(i10, i11, readableArray));
    }

    public void E(int i10, String str, ReadableArray readableArray) {
        this.f41727g.add(new h(i10, str, readableArray));
    }

    public void F(int i10, float f10, float f11, Callback callback) {
        this.f41728h.add(new j(i10, f10, f11, callback));
    }

    public void G(int i10, int[] iArr, u0[] u0VarArr, int[] iArr2) {
        this.f41728h.add(new k(i10, iArr, u0VarArr, iArr2));
    }

    public void H(int i10, Callback callback) {
        this.f41728h.add(new m(i10, callback));
    }

    public void I(int i10, Callback callback) {
        this.f41728h.add(new l(i10, callback));
    }

    public void J(int i10) {
        this.f41728h.add(new n(i10));
    }

    public void K(int i10, int i11) {
        this.f41728h.add(new o(i10, i11));
    }

    public void L(int i10, int i11, boolean z10) {
        this.f41728h.add(new c(i10, i11, false, z10));
    }

    public void M(boolean z10) {
        this.f41728h.add(new p(z10));
    }

    public void N(l0 l0Var) {
        this.f41728h.add(new q(l0Var));
    }

    public void O(int i10, Object obj) {
        this.f41728h.add(new u(i10, obj));
    }

    public void P(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
        this.f41728h.add(new s(i10, i11, i12, i13, i14, i15, hVar));
    }

    public void Q(int i10, String str, W w10) {
        this.f41746z++;
        this.f41728h.add(new t(i10, w10));
    }

    /* access modifiers changed from: package-private */
    public C S() {
        return this.f41722b;
    }

    public Map T() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f41736p));
        hashMap.put("CommitEndTime", Long.valueOf(this.f41737q));
        hashMap.put("LayoutTime", Long.valueOf(this.f41738r));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f41739s));
        hashMap.put("RunStartTime", Long.valueOf(this.f41740t));
        hashMap.put("RunEndTime", Long.valueOf(this.f41741u));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f41742v));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f41743w));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.f41744x));
        hashMap.put("CreateViewCount", Long.valueOf(this.f41745y));
        hashMap.put("UpdatePropsCount", Long.valueOf(this.f41746z));
        return hashMap;
    }

    public boolean U() {
        if (!this.f41728h.isEmpty() || !this.f41727g.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void V() {
        this.f41732l = false;
        com.facebook.react.modules.core.b.h().n(b.a.DISPATCH_UI, this.f41725e);
        R();
    }

    public void W(l0 l0Var) {
        this.f41728h.add(0, new q(l0Var));
    }

    public void X() {
        this.f41734n = true;
        this.f41736p = 0;
        this.f41745y = 0;
        this.f41746z = 0;
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        this.f41732l = true;
        if (!M7.b.j()) {
            com.facebook.react.modules.core.b.h().k(b.a.DISPATCH_UI, this.f41725e);
        }
    }

    public void Z(C3540a aVar) {
        this.f41731k = aVar;
    }

    public void y(int i10, View view) {
        this.f41722b.addRootView(i10, view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ba, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(int r20, long r21, long r23) {
        /*
            r19 = this;
            r15 = r19
            r0 = r20
            java.lang.String r1 = "UIViewOperationQueue.dispatchViewUpdates"
            r13 = 0
            z8.b$a r1 = z8.C4237b.a(r13, r1)
            java.lang.String r2 = "batchId"
            z8.b$a r1 = r1.a(r2, r0)
            r1.c()
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0031 }
            long r16 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x0031 }
            java.util.ArrayList r1 = r15.f41727g     // Catch:{ all -> 0x0031 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0031 }
            r2 = 0
            if (r1 != 0) goto L_0x0035
            java.util.ArrayList r1 = r15.f41727g     // Catch:{ all -> 0x0031 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0031 }
            r3.<init>()     // Catch:{ all -> 0x0031 }
            r15.f41727g = r3     // Catch:{ all -> 0x0031 }
            r4 = r1
            goto L_0x0036
        L_0x0031:
            r0 = move-exception
            r2 = r13
            goto L_0x00bc
        L_0x0035:
            r4 = r2
        L_0x0036:
            java.util.ArrayList r1 = r15.f41728h     // Catch:{ all -> 0x0031 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x0049
            java.util.ArrayList r1 = r15.f41728h     // Catch:{ all -> 0x0031 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0031 }
            r3.<init>()     // Catch:{ all -> 0x0031 }
            r15.f41728h = r3     // Catch:{ all -> 0x0031 }
            r6 = r1
            goto L_0x004a
        L_0x0049:
            r6 = r2
        L_0x004a:
            java.lang.Object r1 = r15.f41724d     // Catch:{ all -> 0x0031 }
            monitor-enter(r1)     // Catch:{ all -> 0x0031 }
            java.util.ArrayDeque r3 = r15.f41730j     // Catch:{ all -> 0x0060 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r3 != 0) goto L_0x005e
            java.util.ArrayDeque r2 = r15.f41730j     // Catch:{ all -> 0x0060 }
            java.util.ArrayDeque r3 = new java.util.ArrayDeque     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            r15.f41730j = r3     // Catch:{ all -> 0x0060 }
        L_0x005e:
            r5 = r2
            goto L_0x0063
        L_0x0060:
            r0 = move-exception
            r2 = r13
            goto L_0x00b8
        L_0x0063:
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            g8.a r1 = r15.f41731k     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x006b
            r1.b()     // Catch:{ all -> 0x0031 }
        L_0x006b:
            com.facebook.react.uimanager.s0$a r9 = new com.facebook.react.uimanager.s0$a     // Catch:{ all -> 0x0031 }
            r1 = r9
            r2 = r19
            r3 = r20
            r7 = r21
            r18 = r9
            r9 = r23
            r13 = r16
            r1.<init>(r3, r4, r5, r6, r7, r9, r11, r13)     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = "acquiring mDispatchRunnablesLock"
            r2 = 0
            z8.b$a r1 = z8.C4237b.a(r2, r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "batchId"
            z8.b$a r0 = r1.a(r4, r0)     // Catch:{ all -> 0x00ab }
            r0.c()     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r15.f41723c     // Catch:{ all -> 0x00ab }
            monitor-enter(r1)     // Catch:{ all -> 0x00ab }
            z8.C4236a.i(r2)     // Catch:{ all -> 0x00b1 }
            java.util.ArrayList r0 = r15.f41729i     // Catch:{ all -> 0x00b1 }
            r4 = r18
            r0.add(r4)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r15.f41732l     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00ad
            com.facebook.react.uimanager.s0$b r0 = new com.facebook.react.uimanager.s0$b     // Catch:{ all -> 0x00ab }
            com.facebook.react.bridge.ReactApplicationContext r1 = r15.f41726f     // Catch:{ all -> 0x00ab }
            r0.<init>(r1)     // Catch:{ all -> 0x00ab }
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x00ad
        L_0x00ab:
            r0 = move-exception
            goto L_0x00bc
        L_0x00ad:
            z8.C4236a.i(r2)
            return
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00b4:
            r0 = move-exception
            r2 = 0
            goto L_0x00bc
        L_0x00b8:
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ba:
            r0 = move-exception
            goto L_0x00b8
        L_0x00bc:
            z8.C4236a.i(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.s0.z(int, long, long):void");
    }
}
