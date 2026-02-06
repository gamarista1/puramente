package vd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import ud.C5239f;
import yf.C6787a;

/* renamed from: vd.d  reason: case insensitive filesystem */
public abstract class C5260d {

    /* renamed from: J  reason: collision with root package name */
    public static final b f61833J = new b((DefaultConstructorMarker) null);

    /* renamed from: K  reason: collision with root package name */
    private static final Void f61834K = null;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public static MotionEvent.PointerProperties[] f61835L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public static MotionEvent.PointerCoords[] f61836M;

    /* renamed from: N  reason: collision with root package name */
    private static short f61837N;

    /* renamed from: A  reason: collision with root package name */
    private i f61838A;

    /* renamed from: B  reason: collision with root package name */
    private r f61839B;

    /* renamed from: C  reason: collision with root package name */
    private e f61840C;

    /* renamed from: D  reason: collision with root package name */
    private int f61841D;

    /* renamed from: E  reason: collision with root package name */
    private int f61842E;

    /* renamed from: F  reason: collision with root package name */
    private int f61843F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f61844G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f61845H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f61846I;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int[] f61847a = new int[12];
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f61848b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f61849c;

    /* renamed from: d  reason: collision with root package name */
    private int f61850d;

    /* renamed from: e  reason: collision with root package name */
    private View f61851e;

    /* renamed from: f  reason: collision with root package name */
    private int f61852f;

    /* renamed from: g  reason: collision with root package name */
    private float f61853g;

    /* renamed from: h  reason: collision with root package name */
    private float f61854h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f61855i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f61856j;

    /* renamed from: k  reason: collision with root package name */
    private int f61857k;

    /* renamed from: l  reason: collision with root package name */
    private WritableArray f61858l;

    /* renamed from: m  reason: collision with root package name */
    private WritableArray f61859m;

    /* renamed from: n  reason: collision with root package name */
    private int f61860n;

    /* renamed from: o  reason: collision with root package name */
    private int f61861o;

    /* renamed from: p  reason: collision with root package name */
    private final C0914d[] f61862p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f61863q;

    /* renamed from: r  reason: collision with root package name */
    private float[] f61864r;

    /* renamed from: s  reason: collision with root package name */
    private short f61865s;

    /* renamed from: t  reason: collision with root package name */
    private float f61866t;

    /* renamed from: u  reason: collision with root package name */
    private float f61867u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f61868v;

    /* renamed from: w  reason: collision with root package name */
    private float f61869w;

    /* renamed from: x  reason: collision with root package name */
    private float f61870x;

    /* renamed from: y  reason: collision with root package name */
    private int f61871y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f61872z;

    /* renamed from: vd.d$a */
    public static final class a extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(vd.C5260d r21, android.view.MotionEvent r22, java.lang.IllegalArgumentException r23) {
            /*
                r20 = this;
                r0 = r22
                r1 = r23
                java.lang.String r2 = "handler"
                r3 = r21
                kotlin.jvm.internal.C6496s.h(r3, r2)
                java.lang.String r2 = "event"
                kotlin.jvm.internal.C6496s.h(r0, r2)
                java.lang.String r2 = "e"
                kotlin.jvm.internal.C6496s.h(r1, r2)
                java.lang.Class r2 = r21.getClass()
                Ff.d r2 = kotlin.jvm.internal.O.b(r2)
                java.lang.String r2 = r2.w()
                int r4 = r21.S()
                android.view.View r5 = r21.W()
                vd.i r6 = r21.P()
                boolean r7 = r21.d0()
                boolean r8 = r21.Z()
                boolean r9 = r21.a0()
                int r10 = r21.f61848b
                int[] r11 = r21.f61847a
                r18 = 62
                r19 = 0
                java.lang.String r12 = ", "
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                java.lang.String r3 = mf.C6559l.K0(r11, r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "\n    handler: "
                r11.append(r12)
                r11.append(r2)
                java.lang.String r2 = "\n    state: "
                r11.append(r2)
                r11.append(r4)
                java.lang.String r2 = "\n    view: "
                r11.append(r2)
                r11.append(r5)
                java.lang.String r2 = "\n    orchestrator: "
                r11.append(r2)
                r11.append(r6)
                java.lang.String r2 = "\n    isEnabled: "
                r11.append(r2)
                r11.append(r7)
                java.lang.String r2 = "\n    isActive: "
                r11.append(r2)
                r11.append(r8)
                java.lang.String r2 = "\n    isAwaiting: "
                r11.append(r2)
                r11.append(r9)
                java.lang.String r2 = "\n    trackedPointersCount: "
                r11.append(r2)
                r11.append(r10)
                java.lang.String r2 = "\n    trackedPointers: "
                r11.append(r2)
                r11.append(r3)
                java.lang.String r2 = "\n    while handling event: "
                r11.append(r2)
                r11.append(r0)
                java.lang.String r0 = "\n      "
                r11.append(r0)
                java.lang.String r0 = r11.toString()
                java.lang.String r0 = Sg.p.f(r0)
                r2 = r20
                r2.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vd.C5260d.a.<init>(vd.d, android.view.MotionEvent, java.lang.IllegalArgumentException):void");
        }
    }

    /* renamed from: vd.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean c(float f10) {
            return !Float.isNaN(f10);
        }

        /* access modifiers changed from: private */
        public final void d(int i10) {
            if (C5260d.f61835L == null) {
                C5260d.f61835L = new MotionEvent.PointerProperties[12];
                C5260d.f61836M = new MotionEvent.PointerCoords[12];
            }
            while (i10 > 0) {
                MotionEvent.PointerProperties[] d10 = C5260d.f61835L;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (d10 == null) {
                    C6496s.v("pointerProps");
                    d10 = null;
                }
                int i11 = i10 - 1;
                if (d10[i11] == null) {
                    MotionEvent.PointerProperties[] d11 = C5260d.f61835L;
                    if (d11 == null) {
                        C6496s.v("pointerProps");
                        d11 = null;
                    }
                    d11[i11] = new MotionEvent.PointerProperties();
                    MotionEvent.PointerCoords[] c10 = C5260d.f61836M;
                    if (c10 == null) {
                        C6496s.v("pointerCoords");
                    } else {
                        pointerCoordsArr = c10;
                    }
                    pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
                    i10--;
                } else {
                    return;
                }
            }
        }

        private b() {
        }
    }

    /* renamed from: vd.d$c */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f61873a = new a((DefaultConstructorMarker) null);

        /* renamed from: vd.d$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            public final void b(C5260d dVar, ReadableMap readableMap) {
                float f10;
                float f11;
                float f12;
                if (readableMap.getType("hitSlop") == ReadableType.Number) {
                    float g10 = G.g(readableMap.getDouble("hitSlop"));
                    dVar.z0(g10, g10, g10, g10, Float.NaN, Float.NaN);
                    return;
                }
                ReadableMap map = readableMap.getMap("hitSlop");
                C6496s.e(map);
                float f13 = Float.NaN;
                if (map.hasKey("horizontal")) {
                    f10 = G.g(map.getDouble("horizontal"));
                } else {
                    f10 = Float.NaN;
                }
                float f14 = f10;
                if (map.hasKey("vertical")) {
                    f11 = G.g(map.getDouble("vertical"));
                } else {
                    f11 = Float.NaN;
                }
                float f15 = f11;
                if (map.hasKey(BlockAlignment.LEFT)) {
                    f10 = G.g(map.getDouble(BlockAlignment.LEFT));
                }
                float f16 = f10;
                if (map.hasKey(VerticalAlignment.TOP)) {
                    f11 = G.g(map.getDouble(VerticalAlignment.TOP));
                }
                float f17 = f11;
                if (map.hasKey(BlockAlignment.RIGHT)) {
                    f14 = G.g(map.getDouble(BlockAlignment.RIGHT));
                }
                float f18 = f14;
                if (map.hasKey(VerticalAlignment.BOTTOM)) {
                    f15 = G.g(map.getDouble(VerticalAlignment.BOTTOM));
                }
                float f19 = f15;
                if (map.hasKey(Snapshot.WIDTH)) {
                    f12 = G.g(map.getDouble(Snapshot.WIDTH));
                } else {
                    f12 = Float.NaN;
                }
                if (map.hasKey(Snapshot.HEIGHT)) {
                    f13 = G.g(map.getDouble(Snapshot.HEIGHT));
                }
                dVar.z0(f16, f17, f18, f19, f12, f13);
            }

            private a() {
            }
        }

        /* access modifiers changed from: protected */
        public abstract C5260d a(Context context);

        public final C5260d b(Context context, int i10) {
            C5260d a10 = a(context);
            a10.I0(i10);
            return a10;
        }

        public abstract wd.b c(C5260d dVar);

        public abstract String d();

        public abstract Class e();

        public void f(C5260d dVar, ReadableMap readableMap) {
            C6496s.h(dVar, "handler");
            C6496s.h(readableMap, "config");
            dVar.s0();
            if (readableMap.hasKey("shouldCancelWhenOutside")) {
                dVar.G0(readableMap.getBoolean("shouldCancelWhenOutside"));
            }
            if (readableMap.hasKey("enabled")) {
                dVar.y0(readableMap.getBoolean("enabled"));
            }
            if (readableMap.hasKey("hitSlop")) {
                f61873a.b(dVar, readableMap);
            }
            if (readableMap.hasKey("needsPointerData")) {
                dVar.C0(readableMap.getBoolean("needsPointerData"));
            }
            if (readableMap.hasKey("manualActivation")) {
                dVar.f61868v = readableMap.getBoolean("manualActivation");
            }
            if (readableMap.hasKey("mouseButton")) {
                dVar.B0(readableMap.getInt("mouseButton"));
            }
        }
    }

    /* renamed from: vd.d$d  reason: collision with other inner class name */
    private static final class C0914d {

        /* renamed from: a  reason: collision with root package name */
        private final int f61874a;

        /* renamed from: b  reason: collision with root package name */
        private float f61875b;

        /* renamed from: c  reason: collision with root package name */
        private float f61876c;

        /* renamed from: d  reason: collision with root package name */
        private float f61877d;

        /* renamed from: e  reason: collision with root package name */
        private float f61878e;

        public C0914d(int i10, float f10, float f11, float f12, float f13) {
            this.f61874a = i10;
            this.f61875b = f10;
            this.f61876c = f11;
            this.f61877d = f12;
            this.f61878e = f13;
        }

        public final float a() {
            return this.f61877d;
        }

        public final float b() {
            return this.f61878e;
        }

        public final int c() {
            return this.f61874a;
        }

        public final float d() {
            return this.f61875b;
        }

        public final float e() {
            return this.f61876c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0914d)) {
                return false;
            }
            C0914d dVar = (C0914d) obj;
            if (this.f61874a == dVar.f61874a && Float.compare(this.f61875b, dVar.f61875b) == 0 && Float.compare(this.f61876c, dVar.f61876c) == 0 && Float.compare(this.f61877d, dVar.f61877d) == 0 && Float.compare(this.f61878e, dVar.f61878e) == 0) {
                return true;
            }
            return false;
        }

        public final void f(float f10) {
            this.f61877d = f10;
        }

        public final void g(float f10) {
            this.f61878e = f10;
        }

        public final void h(float f10) {
            this.f61875b = f10;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f61874a) * 31) + Float.hashCode(this.f61875b)) * 31) + Float.hashCode(this.f61876c)) * 31) + Float.hashCode(this.f61877d)) * 31) + Float.hashCode(this.f61878e);
        }

        public final void i(float f10) {
            this.f61876c = f10;
        }

        public String toString() {
            int i10 = this.f61874a;
            float f10 = this.f61875b;
            float f11 = this.f61876c;
            float f12 = this.f61877d;
            float f13 = this.f61878e;
            return "PointerData(pointerId=" + i10 + ", x=" + f10 + ", y=" + f11 + ", absoluteX=" + f12 + ", absoluteY=" + f13 + ")";
        }
    }

    public C5260d() {
        int[] iArr = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr[i10] = 0;
        }
        this.f61849c = iArr;
        this.f61856j = true;
        C0914d[] dVarArr = new C0914d[12];
        for (int i11 = 0; i11 < 12; i11++) {
            dVarArr[i11] = null;
        }
        this.f61862p = dVarArr;
        this.f61841D = 3;
    }

    private final void A(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C();
        this.f61858l = null;
        this.f61860n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f61862p[pointerId] = new C0914d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - ((float) this.f61849c[0]), (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - ((float) this.f61849c[1]));
        C0914d dVar = this.f61862p[pointerId];
        C6496s.e(dVar);
        n(dVar);
        this.f61862p[pointerId] = null;
        this.f61861o--;
        y();
    }

    private final void C() {
        this.f61859m = null;
        for (C0914d dVar : this.f61862p) {
            if (dVar != null) {
                o(dVar);
            }
        }
    }

    private final int E() {
        int[] iArr;
        int i10 = 0;
        while (i10 < this.f61848b) {
            int i11 = 0;
            while (true) {
                iArr = this.f61847a;
                if (i11 < iArr.length && iArr[i11] != i10) {
                    i11++;
                }
            }
            if (i11 == iArr.length) {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    private final void F0(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i10 = 1;
        if (toolType == 1) {
            i10 = 0;
        } else if (toolType != 2) {
            i10 = 3;
            if (toolType == 3) {
                i10 = 2;
            }
        }
        this.f61841D = i10;
    }

    private final Activity H(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return H(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void b(C5260d dVar) {
        dVar.q();
    }

    private final boolean b0(int i10) {
        int i11 = this.f61842E;
        if (i11 == 0) {
            if (i10 == 1) {
                return true;
            }
            return false;
        } else if ((i10 & i11) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean e0(int i10) {
        if (this.f61847a[i10] != -1) {
            return true;
        }
        return false;
    }

    private final void h0(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (this.f61852f != i10) {
            if (this.f61861o > 0 && (i10 == 5 || i10 == 3 || i10 == 1)) {
                r();
            }
            int i11 = this.f61852f;
            this.f61852f = i10;
            if (i10 == 4) {
                short s10 = f61837N;
                f61837N = (short) (s10 + 1);
                this.f61865s = s10;
            }
            i iVar = this.f61838A;
            C6496s.e(iVar);
            iVar.A(this, i10, i11);
            p0(i10, i11);
        }
    }

    private final boolean i0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f61848b) {
            return true;
        }
        int length = this.f61847a.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.f61847a[i10];
            if (i11 != -1 && i11 != i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: android.view.MotionEvent$PointerProperties[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.view.MotionEvent$PointerProperties[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.view.MotionEvent$PointerProperties[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.view.MotionEvent$PointerCoords} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.view.MotionEvent$PointerProperties[]} */
    /* JADX WARNING: type inference failed for: r9v3, types: [android.view.MotionEvent$PointerCoords[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00b6 A[EDGE_INSN: B:77:0x00b6->B:42:0x00b6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.view.MotionEvent m(android.view.MotionEvent r26) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            boolean r0 = r25.i0(r26)
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            int r0 = r26.getActionMasked()
            r3 = 2
            r4 = 5
            r5 = 0
            r6 = -1
            r7 = 1
            if (r0 == 0) goto L_0x0036
            r8 = 6
            if (r0 == r7) goto L_0x0020
            if (r0 == r4) goto L_0x0036
            if (r0 == r8) goto L_0x0020
            r3 = r0
            r0 = r6
            goto L_0x004b
        L_0x0020:
            int r0 = r26.getActionIndex()
            int r4 = r2.getPointerId(r0)
            int[] r9 = r1.f61847a
            r4 = r9[r4]
            if (r4 == r6) goto L_0x004b
            int r3 = r1.f61848b
            if (r3 != r7) goto L_0x0034
            r3 = r7
            goto L_0x004b
        L_0x0034:
            r3 = r8
            goto L_0x004b
        L_0x0036:
            int r0 = r26.getActionIndex()
            int r8 = r2.getPointerId(r0)
            int[] r9 = r1.f61847a
            r8 = r9[r8]
            if (r8 == r6) goto L_0x004b
            int r3 = r1.f61848b
            if (r3 != r7) goto L_0x004a
            r3 = r5
            goto L_0x004b
        L_0x004a:
            r3 = r4
        L_0x004b:
            vd.d$b r4 = f61833J
            int r7 = r1.f61848b
            r4.d(r7)
            float r4 = r26.getRawX()
            float r7 = r26.getX()
            float r4 = r4 - r7
            float r7 = r26.getRawY()
            float r8 = r26.getY()
            float r7 = r7 - r8
            r2.offsetLocation(r4, r7)
            int r8 = r26.getPointerCount()
            r13 = r3
            r14 = r5
        L_0x006d:
            java.lang.String r3 = "pointerCoords"
            java.lang.String r9 = "pointerProps"
            r10 = 0
            if (r5 >= r8) goto L_0x00b6
            int r11 = r2.getPointerId(r5)
            int[] r12 = r1.f61847a
            r12 = r12[r11]
            if (r12 == r6) goto L_0x00b3
            android.view.MotionEvent$PointerProperties[] r12 = f61835L
            if (r12 != 0) goto L_0x0086
            kotlin.jvm.internal.C6496s.v(r9)
            r12 = r10
        L_0x0086:
            r12 = r12[r14]
            r2.getPointerProperties(r5, r12)
            android.view.MotionEvent$PointerProperties[] r12 = f61835L
            if (r12 != 0) goto L_0x0093
            kotlin.jvm.internal.C6496s.v(r9)
            r12 = r10
        L_0x0093:
            r9 = r12[r14]
            kotlin.jvm.internal.C6496s.e(r9)
            int[] r12 = r1.f61847a
            r11 = r12[r11]
            r9.id = r11
            android.view.MotionEvent$PointerCoords[] r9 = f61836M
            if (r9 != 0) goto L_0x00a6
            kotlin.jvm.internal.C6496s.v(r3)
            goto L_0x00a7
        L_0x00a6:
            r10 = r9
        L_0x00a7:
            r3 = r10[r14]
            r2.getPointerCoords(r5, r3)
            if (r5 != r0) goto L_0x00b1
            int r3 = r14 << 8
            r13 = r13 | r3
        L_0x00b1:
            int r14 = r14 + 1
        L_0x00b3:
            int r5 = r5 + 1
            goto L_0x006d
        L_0x00b6:
            android.view.MotionEvent$PointerProperties[] r0 = f61835L
            if (r0 != 0) goto L_0x00be
            kotlin.jvm.internal.C6496s.v(r9)
            r0 = r10
        L_0x00be:
            int r0 = r0.length
            if (r0 != 0) goto L_0x00c2
            goto L_0x00cd
        L_0x00c2:
            android.view.MotionEvent$PointerCoords[] r0 = f61836M
            if (r0 != 0) goto L_0x00ca
            kotlin.jvm.internal.C6496s.v(r3)
            r0 = r10
        L_0x00ca:
            int r0 = r0.length
            if (r0 != 0) goto L_0x00ff
        L_0x00cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            android.view.MotionEvent$PointerCoords[] r2 = f61836M
            if (r2 != 0) goto L_0x00d7
            kotlin.jvm.internal.C6496s.v(r3)
            r2 = r10
        L_0x00d7:
            int r2 = r2.length
            android.view.MotionEvent$PointerProperties[] r3 = f61835L
            if (r3 != 0) goto L_0x00e0
            kotlin.jvm.internal.C6496s.v(r9)
            goto L_0x00e1
        L_0x00e0:
            r10 = r3
        L_0x00e1:
            int r3 = r10.length
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "pointerCoords.size="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", pointerProps.size="
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L_0x00ff:
            long r5 = r26.getDownTime()     // Catch:{ IllegalArgumentException -> 0x0110 }
            long r11 = r26.getEventTime()     // Catch:{ IllegalArgumentException -> 0x0110 }
            android.view.MotionEvent$PointerProperties[] r0 = f61835L     // Catch:{ IllegalArgumentException -> 0x0110 }
            if (r0 != 0) goto L_0x0112
            kotlin.jvm.internal.C6496s.v(r9)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r15 = r10
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            goto L_0x014d
        L_0x0112:
            r15 = r0
        L_0x0113:
            android.view.MotionEvent$PointerCoords[] r0 = f61836M     // Catch:{ IllegalArgumentException -> 0x0110 }
            if (r0 != 0) goto L_0x011d
            kotlin.jvm.internal.C6496s.v(r3)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r16 = r10
            goto L_0x011f
        L_0x011d:
            r16 = r0
        L_0x011f:
            int r17 = r26.getMetaState()     // Catch:{ IllegalArgumentException -> 0x0110 }
            int r18 = r26.getButtonState()     // Catch:{ IllegalArgumentException -> 0x0110 }
            float r19 = r26.getXPrecision()     // Catch:{ IllegalArgumentException -> 0x0110 }
            float r20 = r26.getYPrecision()     // Catch:{ IllegalArgumentException -> 0x0110 }
            int r21 = r26.getDeviceId()     // Catch:{ IllegalArgumentException -> 0x0110 }
            int r22 = r26.getEdgeFlags()     // Catch:{ IllegalArgumentException -> 0x0110 }
            int r23 = r26.getSource()     // Catch:{ IllegalArgumentException -> 0x0110 }
            int r24 = r26.getFlags()     // Catch:{ IllegalArgumentException -> 0x0110 }
            r9 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IllegalArgumentException -> 0x0110 }
            float r3 = -r4
            float r4 = -r7
            r2.offsetLocation(r3, r4)
            r0.offsetLocation(r3, r4)
            return r0
        L_0x014d:
            vd.d$a r3 = new vd.d$a
            r3.<init>(r1, r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.C5260d.m(android.view.MotionEvent):android.view.MotionEvent");
    }

    private final void n(C0914d dVar) {
        if (this.f61858l == null) {
            this.f61858l = Arguments.createArray();
        }
        WritableArray writableArray = this.f61858l;
        C6496s.e(writableArray);
        writableArray.pushMap(u(dVar));
    }

    private final void o(C0914d dVar) {
        if (this.f61859m == null) {
            this.f61859m = Arguments.createArray();
        }
        WritableArray writableArray = this.f61859m;
        C6496s.e(writableArray);
        writableArray.pushMap(u(dVar));
    }

    private final void r() {
        this.f61860n = 4;
        this.f61858l = null;
        C();
        for (C0914d dVar : this.f61862p) {
            if (dVar != null) {
                n(dVar);
            }
        }
        this.f61861o = 0;
        C6559l.A(this.f61862p, (Object) null, 0, 0, 6, (Object) null);
        y();
    }

    private final WritableMap u(C0914d dVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", dVar.c());
        createMap.putDouble("x", (double) G.f(dVar.d()));
        createMap.putDouble("y", (double) G.f(dVar.e()));
        createMap.putDouble("absoluteX", (double) G.f(dVar.a()));
        createMap.putDouble("absoluteY", (double) G.f(dVar.b()));
        return createMap;
    }

    private final void x(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f61858l = null;
        this.f61860n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f61862p[pointerId] = new C0914d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - ((float) this.f61849c[0]), (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - ((float) this.f61849c[1]));
        this.f61861o++;
        C0914d dVar = this.f61862p[pointerId];
        C6496s.e(dVar);
        n(dVar);
        C();
        y();
    }

    /* access modifiers changed from: private */
    public final void y0(boolean z10) {
        if (!(this.f61851e == null || this.f61856j == z10)) {
            UiThreadUtil.runOnUiThread(new C5259c(this));
        }
        this.f61856j = z10;
    }

    private final void z(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f61858l = null;
        this.f61860n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            C0914d dVar = this.f61862p[motionEvent.getPointerId(i11)];
            if (!(dVar == null || (dVar.d() == motionEvent.getX(i11) && dVar.e() == motionEvent.getY(i11)))) {
                dVar.h(motionEvent.getX(i11));
                dVar.i(motionEvent.getY(i11));
                dVar.f((motionEvent2.getX(i11) + rawX) - ((float) this.f61849c[0]));
                dVar.g((motionEvent2.getY(i11) + rawY) - ((float) this.f61849c[1]));
                n(dVar);
                i10++;
            }
        }
        if (i10 > 0) {
            C();
            y();
        }
    }

    public final void A0(e eVar) {
        this.f61840C = eVar;
    }

    public final void B() {
        int i10 = this.f61852f;
        if (i10 == 2 || i10 == 4) {
            h0(5);
        }
    }

    /* access modifiers changed from: protected */
    public final void B0(int i10) {
        this.f61842E = i10;
    }

    public final void C0(boolean z10) {
        this.f61863q = z10;
    }

    public final void D() {
        int i10 = this.f61852f;
        if (i10 == 4 || i10 == 0 || i10 == 2) {
            k0();
            h0(1);
        }
    }

    /* access modifiers changed from: protected */
    public final void D0(int i10) {
        this.f61871y = i10;
    }

    public final void E0(r rVar) {
        this.f61839B = rVar;
    }

    public final int F() {
        return this.f61857k;
    }

    public final int G() {
        return this.f61843F;
    }

    /* access modifiers changed from: protected */
    public final void G0(boolean z10) {
        this.f61872z = z10;
    }

    public final void H0(boolean z10) {
        this.f61846I = z10;
    }

    public final short I() {
        return this.f61865s;
    }

    public final void I0(int i10) {
        this.f61850d = i10;
    }

    public final float J() {
        return (this.f61866t + this.f61869w) - ((float) this.f61849c[0]);
    }

    /* access modifiers changed from: protected */
    public final boolean J0(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "sourceEvent");
        if (motionEvent.getToolType(0) == 3) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 5 || (motionEvent.getAction() != 2 && !b0(motionEvent.getActionButton()))) {
                return false;
            }
            if (motionEvent.getAction() != 2 || b0(motionEvent.getButtonState())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final float K() {
        return (this.f61867u + this.f61870x) - ((float) this.f61849c[1]);
    }

    public boolean K0(C5260d dVar) {
        e eVar;
        C6496s.h(dVar, "handler");
        if (dVar == this || (eVar = this.f61840C) == null) {
            return false;
        }
        return eVar.b(this, dVar);
    }

    public final float L() {
        return this.f61866t;
    }

    public boolean L0(C5260d dVar) {
        C6496s.h(dVar, "handler");
        if (dVar == this) {
            return true;
        }
        e eVar = this.f61840C;
        if (eVar != null) {
            return eVar.a(this, dVar);
        }
        return false;
    }

    public final float M() {
        return this.f61867u;
    }

    public boolean M0(C5260d dVar) {
        e eVar;
        C6496s.h(dVar, "handler");
        if (dVar == this || (eVar = this.f61840C) == null) {
            return false;
        }
        return eVar.c(this, dVar);
    }

    public final boolean N() {
        return this.f61863q;
    }

    public final boolean N0(C5260d dVar) {
        e eVar;
        C6496s.h(dVar, "handler");
        if (dVar == this || (eVar = this.f61840C) == null) {
            return false;
        }
        return eVar.d(this, dVar);
    }

    public final int O() {
        return this.f61871y;
    }

    public final void O0(int i10) {
        if (!e0(i10)) {
            this.f61847a[i10] = E();
            this.f61848b++;
        }
    }

    /* access modifiers changed from: protected */
    public final i P() {
        return this.f61838A;
    }

    public final void P0(int i10) {
        if (e0(i10)) {
            this.f61847a[i10] = -1;
            this.f61848b--;
        }
    }

    public final int Q() {
        return this.f61841D;
    }

    /* access modifiers changed from: protected */
    public final PointF Q0(PointF pointF) {
        PointF K10;
        C6496s.h(pointF, "point");
        i iVar = this.f61838A;
        if (iVar != null && (K10 = iVar.K(this.f61851e, pointF)) != null) {
            return K10;
        }
        pointF.x = Float.NaN;
        pointF.y = Float.NaN;
        return pointF;
    }

    public final boolean R() {
        return this.f61846I;
    }

    public final void R0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            x(motionEvent, motionEvent2);
            z(motionEvent, motionEvent2);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
            z(motionEvent, motionEvent2);
            A(motionEvent, motionEvent2);
        } else if (motionEvent.getActionMasked() == 2) {
            z(motionEvent, motionEvent2);
        }
    }

    public final int S() {
        return this.f61852f;
    }

    public final boolean S0(MotionEvent motionEvent) {
        int i10;
        C6496s.h(motionEvent, "event");
        if (!this.f61856j || (i10 = this.f61852f) == 1 || i10 == 3 || i10 == 5 || !e0(motionEvent.getPointerId(motionEvent.getActionIndex()))) {
            return false;
        }
        return true;
    }

    public final int T() {
        return this.f61850d;
    }

    public final void T0(C6787a aVar) {
        C6496s.h(aVar, "closure");
        this.f61855i = true;
        aVar.invoke();
        this.f61855i = false;
    }

    public final int U() {
        return this.f61860n;
    }

    public final int V() {
        return this.f61861o;
    }

    public final View W() {
        return this.f61851e;
    }

    public final void X(MotionEvent motionEvent, MotionEvent motionEvent2) {
        int i10;
        C6496s.h(motionEvent, "transformedEvent");
        C6496s.h(motionEvent2, "sourceEvent");
        if (this.f61856j && (i10 = this.f61852f) != 3 && i10 != 1 && i10 != 5 && this.f61848b >= 1) {
            try {
                MotionEvent[] motionEventArr = {m(motionEvent), m(motionEvent2)};
                MotionEvent motionEvent3 = motionEventArr[0];
                MotionEvent motionEvent4 = motionEventArr[1];
                this.f61853g = motionEvent3.getX();
                this.f61854h = motionEvent3.getY();
                this.f61871y = motionEvent3.getPointerCount();
                boolean g02 = g0(this.f61851e, this.f61853g, this.f61854h);
                this.f61855i = g02;
                if (!this.f61872z || g02) {
                    k kVar = k.f61899a;
                    this.f61866t = kVar.b(motionEvent3, true);
                    this.f61867u = kVar.c(motionEvent3, true);
                    this.f61869w = motionEvent3.getRawX() - motionEvent3.getX();
                    this.f61870x = motionEvent3.getRawY() - motionEvent3.getY();
                    if (motionEvent2.getAction() == 0 || motionEvent2.getAction() == 9 || motionEvent2.getAction() == 7) {
                        F0(motionEvent2);
                    }
                    if (motionEvent2.getAction() == 9 || motionEvent2.getAction() == 7 || motionEvent2.getAction() == 10) {
                        m0(motionEvent3, motionEvent4);
                    } else {
                        l0(motionEvent3, motionEvent4);
                    }
                    if (!C6496s.c(motionEvent3, motionEvent)) {
                        motionEvent3.recycle();
                    }
                    if (!C6496s.c(motionEvent4, motionEvent2)) {
                        motionEvent4.recycle();
                        return;
                    }
                    return;
                }
                int i11 = this.f61852f;
                if (i11 == 4) {
                    q();
                } else if (i11 == 2) {
                    D();
                }
            } catch (a unused) {
                D();
            }
        }
    }

    public final boolean Y(C5260d dVar) {
        C6496s.h(dVar, "other");
        int length = this.f61847a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f61847a[i10] != -1 && dVar.f61847a[i10] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z() {
        return this.f61844G;
    }

    public final boolean a0() {
        return this.f61845H;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    public final boolean c0(vd.C5260d r4) {
        /*
            r3 = this;
            java.lang.String r0 = "of"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            android.view.View r0 = r3.f61851e
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x0017
            android.view.View r0 = (android.view.View) r0
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 == 0) goto L_0x002f
            android.view.View r2 = r4.f61851e
            boolean r2 = kotlin.jvm.internal.C6496s.c(r0, r2)
            if (r2 == 0) goto L_0x0024
            r4 = 1
            return r4
        L_0x0024:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x0017
            android.view.View r0 = (android.view.View) r0
            goto L_0x0018
        L_0x002f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.C5260d.c0(vd.d):boolean");
    }

    public final boolean d0() {
        return this.f61856j;
    }

    public final boolean f0() {
        return this.f61855i;
    }

    public final boolean g0(View view, float f10, float f11) {
        float f12;
        float f13;
        View view2 = view;
        float f14 = f10;
        float f15 = f11;
        C5239f.a aVar = C5239f.f61716a;
        C6496s.e(view);
        if (aVar.b(view2)) {
            return aVar.a(view2, f14, f15);
        }
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float[] fArr = this.f61864r;
        float f16 = 0.0f;
        if (fArr != null) {
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr[2];
            float f20 = fArr[3];
            b bVar = f61833J;
            if (bVar.c(f17)) {
                f13 = 0.0f - f17;
            } else {
                f13 = 0.0f;
            }
            if (bVar.c(f18)) {
                f16 = 0.0f - f18;
            }
            if (bVar.c(f19)) {
                width += f19;
            }
            if (bVar.c(f20)) {
                height += f20;
            }
            float f21 = fArr[4];
            float f22 = fArr[5];
            if (bVar.c(f21)) {
                if (!bVar.c(f17)) {
                    f13 = width - f21;
                } else if (!bVar.c(f19)) {
                    width = f21 + f13;
                }
            }
            if (bVar.c(f22)) {
                if (!bVar.c(f18)) {
                    f16 = height - f22;
                } else if (!bVar.c(f20)) {
                    height = f22 + f16;
                }
            }
            f12 = f16;
            f16 = f13;
        } else {
            f12 = 0.0f;
        }
        if (f16 > f14 || f14 > width || f12 > f15 || f15 > height) {
            return false;
        }
        return true;
    }

    public final void k() {
        l(false);
    }

    public void l(boolean z10) {
        if (!this.f61868v || z10) {
            int i10 = this.f61852f;
            if (i10 == 0 || i10 == 2) {
                h0(4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void l0(MotionEvent motionEvent, MotionEvent motionEvent2);

    /* access modifiers changed from: protected */
    public void m0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
    }

    public final void p() {
        if (this.f61852f == 0) {
            h0(2);
        }
    }

    public final void q() {
        int i10 = this.f61852f;
        if (i10 == 4 || i10 == 0 || i10 == 2 || this.f61845H) {
            j0();
            h0(3);
        }
    }

    public final void q0(View view, i iVar) {
        Context context;
        if (this.f61851e == null && this.f61838A == null) {
            Arrays.fill(this.f61847a, -1);
            this.f61848b = 0;
            this.f61852f = 0;
            this.f61851e = view;
            this.f61838A = iVar;
            View view2 = null;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            Activity H10 = H(context);
            if (H10 != null) {
                view2 = H10.findViewById(16908290);
            }
            if (view2 != null) {
                view2.getLocationOnScreen(this.f61849c);
            } else {
                int[] iArr = this.f61849c;
                iArr[0] = 0;
                iArr[1] = 0;
            }
            n0();
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset");
    }

    public final void r0() {
        this.f61851e = null;
        this.f61838A = null;
        Arrays.fill(this.f61847a, -1);
        this.f61848b = 0;
        this.f61861o = 0;
        C6559l.A(this.f61862p, (Object) null, 0, 0, 6, (Object) null);
        this.f61860n = 0;
        o0();
    }

    public final WritableArray s() {
        WritableArray writableArray = this.f61859m;
        this.f61859m = null;
        return writableArray;
    }

    public void s0() {
        this.f61863q = false;
        this.f61868v = false;
        this.f61872z = false;
        y0(true);
        this.f61864r = (float[]) f61834K;
        this.f61842E = 0;
    }

    public final WritableArray t() {
        WritableArray writableArray = this.f61858l;
        this.f61858l = null;
        return writableArray;
    }

    public String toString() {
        String str;
        View view = this.f61851e;
        if (view == null) {
            str = null;
        } else {
            C6496s.e(view);
            str = view.getClass().getSimpleName();
        }
        String simpleName = getClass().getSimpleName();
        int i10 = this.f61850d;
        return simpleName + "@[" + i10 + "]:" + str;
    }

    public final void u0(int i10) {
        this.f61857k = i10;
    }

    public void v(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "event");
        r rVar = this.f61839B;
        if (rVar != null) {
            rVar.b(this, motionEvent);
        }
    }

    public final void v0(int i10) {
        this.f61843F = i10;
    }

    public void w(int i10, int i11) {
        r rVar = this.f61839B;
        if (rVar != null) {
            rVar.a(this, i10, i11);
        }
    }

    public final void w0(boolean z10) {
        this.f61844G = z10;
    }

    public final void x0(boolean z10) {
        this.f61845H = z10;
    }

    public void y() {
        r rVar;
        if (this.f61858l != null && (rVar = this.f61839B) != null) {
            rVar.c(this);
        }
    }

    public final void z0(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.f61864r == null) {
            this.f61864r = new float[6];
        }
        float[] fArr = this.f61864r;
        C6496s.e(fArr);
        fArr[0] = f10;
        float[] fArr2 = this.f61864r;
        C6496s.e(fArr2);
        fArr2[1] = f11;
        float[] fArr3 = this.f61864r;
        C6496s.e(fArr3);
        fArr3[2] = f12;
        float[] fArr4 = this.f61864r;
        C6496s.e(fArr4);
        fArr4[3] = f13;
        float[] fArr5 = this.f61864r;
        C6496s.e(fArr5);
        fArr5[4] = f14;
        float[] fArr6 = this.f61864r;
        C6496s.e(fArr6);
        fArr6[5] = f15;
        b bVar = f61833J;
        if (bVar.c(f14) && bVar.c(f10) && bVar.c(f12)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        } else if (bVar.c(f14) && !bVar.c(f10) && !bVar.c(f12)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        } else if (bVar.c(f15) && bVar.c(f13) && bVar.c(f11)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        } else if (bVar.c(f15) && !bVar.c(f13) && !bVar.c(f11)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    /* access modifiers changed from: protected */
    public void j0() {
    }

    /* access modifiers changed from: protected */
    public void k0() {
    }

    /* access modifiers changed from: protected */
    public void n0() {
    }

    /* access modifiers changed from: protected */
    public void o0() {
    }

    public void t0() {
    }

    /* access modifiers changed from: protected */
    public void p0(int i10, int i11) {
    }
}
