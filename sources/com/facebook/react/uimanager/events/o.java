package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.events.q;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import n7.C3863a;
import x1.f;

public final class o extends d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f41654f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f41655g = o.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final f f41656h = new f(3);

    /* renamed from: a  reason: collision with root package name */
    private MotionEvent f41657a;

    /* renamed from: b  reason: collision with root package name */
    private q f41658b;

    /* renamed from: c  reason: collision with root package name */
    private short f41659c;

    /* renamed from: d  reason: collision with root package name */
    private float f41660d;

    /* renamed from: e  reason: collision with root package name */
    private float f41661e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(int i10, int i11, q qVar, MotionEvent motionEvent, long j10, float f10, float f11, p pVar) {
            C6496s.h(pVar, "touchEventCoalescingKeyHelper");
            o oVar = (o) o.f41656h.b();
            if (oVar == null) {
                oVar = new o((DefaultConstructorMarker) null);
            }
            Object c10 = C3863a.c(motionEvent);
            C6496s.g(c10, "assertNotNull(...)");
            oVar.g(i10, i11, qVar, (MotionEvent) c10, j10, f10, f11, pVar);
            return oVar;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41662a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.facebook.react.uimanager.events.q[] r0 = com.facebook.react.uimanager.events.q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.uimanager.events.q r1 = com.facebook.react.uimanager.events.q.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.uimanager.events.q r1 = com.facebook.react.uimanager.events.q.END     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.uimanager.events.q r1 = com.facebook.react.uimanager.events.q.CANCEL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.facebook.react.uimanager.events.q r1 = com.facebook.react.uimanager.events.q.MOVE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f41662a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.o.b.<clinit>():void");
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final void g(int i10, int i11, q qVar, MotionEvent motionEvent, long j10, float f10, float f11, p pVar) {
        boolean z10;
        super.init(i10, i11, motionEvent.getEventTime());
        short s10 = 0;
        if (j10 != Long.MIN_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        SoftAssertions.assertCondition(z10, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            pVar.a(j10);
        } else if (action == 1) {
            pVar.e(j10);
        } else if (action == 2) {
            s10 = pVar.b(j10);
        } else if (action == 3) {
            pVar.e(j10);
        } else if (action == 5 || action == 6) {
            pVar.d(j10);
        } else {
            throw new RuntimeException("Unhandled MotionEvent action: " + action);
        }
        this.f41657a = MotionEvent.obtain(motionEvent);
        this.f41658b = qVar;
        this.f41659c = s10;
        this.f41660d = f10;
        this.f41661e = f11;
    }

    public static final o h(int i10, int i11, q qVar, MotionEvent motionEvent, long j10, float f10, float f11, p pVar) {
        return f41654f.a(i10, i11, qVar, motionEvent, j10, f10, f11, pVar);
    }

    private final boolean i() {
        if (this.f41657a != null) {
            return true;
        }
        String str = f41655g;
        C6496s.g(str, "TAG");
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    public final MotionEvent c() {
        Object c10 = C3863a.c(this.f41657a);
        C6496s.g(c10, "assertNotNull(...)");
        return (MotionEvent) c10;
    }

    public boolean canCoalesce() {
        int i10;
        q qVar = (q) C3863a.c(this.f41658b);
        if (qVar == null) {
            i10 = -1;
        } else {
            i10 = b.f41662a[qVar.ordinal()];
        }
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4) {
            return true;
        }
        q qVar2 = this.f41658b;
        throw new RuntimeException("Unknown touch event type: " + qVar2);
    }

    public final q d() {
        Object c10 = C3863a.c(this.f41658b);
        C6496s.g(c10, "assertNotNull(...)");
        return (q) c10;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "rctEventEmitter");
        if (i()) {
            r.d(rCTEventEmitter, this);
        }
    }

    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        C6496s.h(rCTModernEventEmitter, "rctEventEmitter");
        if (i()) {
            rCTModernEventEmitter.receiveTouches(this);
        }
    }

    public final float e() {
        return this.f41660d;
    }

    public final float f() {
        return this.f41661e;
    }

    public short getCoalescingKey() {
        return this.f41659c;
    }

    /* access modifiers changed from: protected */
    public int getEventCategory() {
        q qVar = this.f41658b;
        if (qVar == null) {
            return 2;
        }
        int i10 = b.f41662a[qVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 4;
        }
        throw new C6535s();
    }

    public String getEventName() {
        q.a aVar = q.f41664b;
        Object c10 = C3863a.c(this.f41658b);
        C6496s.g(c10, "assertNotNull(...)");
        return aVar.a((q) c10);
    }

    public void onDispose() {
        MotionEvent motionEvent = this.f41657a;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f41657a = null;
        try {
            f41656h.a(this);
        } catch (IllegalStateException e10) {
            String str = f41655g;
            C6496s.g(str, "TAG");
            ReactSoftExceptionLogger.logSoftException(str, e10);
        }
    }

    private o() {
    }
}
