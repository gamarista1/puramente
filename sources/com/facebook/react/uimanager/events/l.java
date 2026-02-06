package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.i0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n7.C3863a;
import x1.f;

public class l extends d {

    /* renamed from: g  reason: collision with root package name */
    private static final String f41616g = "l";

    /* renamed from: h  reason: collision with root package name */
    private static final f f41617h = new f(6);

    /* renamed from: a  reason: collision with root package name */
    private MotionEvent f41618a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f41619b;

    /* renamed from: c  reason: collision with root package name */
    private short f41620c = -1;

    /* renamed from: d  reason: collision with root package name */
    private List f41621d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public b f41622e;

    /* renamed from: f  reason: collision with root package name */
    private d.b f41623f;

    class a implements d.b {
        a() {
        }

        public boolean a(int i10, String str) {
            if (!str.equals(l.this.f41619b)) {
                return false;
            }
            if (m.f(str)) {
                for (i0.b b10 : l.this.f41622e.e()) {
                    if (b10.b() == i10) {
                        return true;
                    }
                }
                return false;
            } else if (l.this.getViewTag() == i10) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f41625a;

        /* renamed from: b  reason: collision with root package name */
        private int f41626b;

        /* renamed from: c  reason: collision with root package name */
        private int f41627c;

        /* renamed from: d  reason: collision with root package name */
        private int f41628d;

        /* renamed from: e  reason: collision with root package name */
        private Map f41629e;

        /* renamed from: f  reason: collision with root package name */
        private Map f41630f;

        /* renamed from: g  reason: collision with root package name */
        private Map f41631g;

        /* renamed from: h  reason: collision with root package name */
        private Map f41632h;

        /* renamed from: i  reason: collision with root package name */
        private Set f41633i;

        public b(int i10, int i11, int i12, int i13, Map map, Map map2, Map map3, Map map4, Set set) {
            this.f41625a = i10;
            this.f41626b = i11;
            this.f41627c = i12;
            this.f41628d = i13;
            this.f41629e = map;
            this.f41630f = map2;
            this.f41631g = map3;
            this.f41632h = map4;
            this.f41633i = new HashSet(set);
        }

        public int b() {
            return this.f41626b;
        }

        public final Map c() {
            return this.f41631g;
        }

        public final Map d() {
            return this.f41630f;
        }

        public final List e() {
            return (List) this.f41630f.get(Integer.valueOf(this.f41626b));
        }

        public Set f() {
            return this.f41633i;
        }

        public int g() {
            return this.f41627c;
        }

        public final Map h() {
            return this.f41629e;
        }

        public int i() {
            return this.f41625a;
        }

        public final Map j() {
            return this.f41632h;
        }

        public int k() {
            return this.f41628d;
        }

        public boolean l(int i10) {
            return this.f41633i.contains(Integer.valueOf(i10));
        }
    }

    private l() {
    }

    private void c(WritableMap writableMap, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if ((i10 & 4096) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        writableMap.putBoolean("ctrlKey", z10);
        if ((i10 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        writableMap.putBoolean("shiftKey", z11);
        if ((i10 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        writableMap.putBoolean("altKey", z12);
        if ((i10 & 65536) != 0) {
            z13 = true;
        }
        writableMap.putBoolean("metaKey", z13);
    }

    private List d() {
        int actionIndex = this.f41618a.getActionIndex();
        String str = this.f41619b;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1786514288:
                if (str.equals("topPointerEnter")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1780335505:
                if (str.equals("topPointerLeave")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1304584214:
                if (str.equals("topPointerDown")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1304316135:
                if (str.equals("topPointerMove")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1304250340:
                if (str.equals("topPointerOver")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1065042973:
                if (str.equals("topPointerUp")) {
                    c10 = 5;
                    break;
                }
                break;
            case -992108237:
                if (str.equals("topClick")) {
                    c10 = 6;
                    break;
                }
                break;
            case 383186882:
                if (str.equals("topPointerCancel")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1343400710:
                if (str.equals("topPointerOut")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
                return Arrays.asList(new WritableMap[]{e(actionIndex)});
            case 3:
            case 7:
                return f();
            default:
                return null;
        }
    }

    private WritableMap e(int i10) {
        boolean z10;
        double d10;
        WritableMap createMap = Arguments.createMap();
        int pointerId = this.f41618a.getPointerId(i10);
        createMap.putDouble("pointerId", (double) pointerId);
        String e10 = m.e(this.f41618a.getToolType(i10));
        createMap.putString("pointerType", e10);
        if (h() || (!this.f41622e.l(pointerId) && pointerId != this.f41622e.f41625a)) {
            z10 = false;
        } else {
            z10 = true;
        }
        createMap.putBoolean("isPrimary", z10);
        float[] fArr = (float[]) this.f41622e.c().get(Integer.valueOf(pointerId));
        double f10 = (double) G.f(fArr[0]);
        double f11 = (double) G.f(fArr[1]);
        createMap.putDouble("clientX", f10);
        createMap.putDouble("clientY", f11);
        float[] fArr2 = (float[]) this.f41622e.j().get(Integer.valueOf(pointerId));
        createMap.putDouble("screenX", (double) G.f(fArr2[0]));
        createMap.putDouble("screenY", (double) G.f(fArr2[1]));
        createMap.putDouble("x", f10);
        createMap.putDouble("y", f11);
        createMap.putDouble("pageX", f10);
        createMap.putDouble("pageY", f11);
        float[] fArr3 = (float[]) this.f41622e.h().get(Integer.valueOf(pointerId));
        createMap.putDouble("offsetX", (double) G.f(fArr3[0]));
        createMap.putDouble("offsetY", (double) G.f(fArr3[1]));
        createMap.putInt("target", getViewTag());
        createMap.putDouble(DiagnosticsEntry.TIMESTAMP_KEY, (double) getTimestampMs());
        createMap.putInt("detail", 0);
        createMap.putDouble("tiltX", 0.0d);
        createMap.putDouble("tiltY", 0.0d);
        createMap.putInt("twist", 0);
        if (e10.equals("mouse") || h()) {
            createMap.putDouble(Snapshot.WIDTH, 1.0d);
            createMap.putDouble(Snapshot.HEIGHT, 1.0d);
        } else {
            double f12 = (double) G.f(this.f41618a.getTouchMajor(i10));
            createMap.putDouble(Snapshot.WIDTH, f12);
            createMap.putDouble(Snapshot.HEIGHT, f12);
        }
        int buttonState = this.f41618a.getButtonState();
        createMap.putInt("button", m.a(e10, this.f41622e.g(), buttonState));
        createMap.putInt("buttons", m.b(this.f41619b, e10, buttonState));
        if (h()) {
            d10 = 0.0d;
        } else {
            d10 = m.d(createMap.getInt("buttons"), this.f41619b);
        }
        createMap.putDouble("pressure", d10);
        createMap.putDouble("tangentialPressure", 0.0d);
        c(createMap, this.f41618a.getMetaState());
        return createMap;
    }

    private List f() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f41618a.getPointerCount(); i10++) {
            arrayList.add(e(i10));
        }
        return arrayList;
    }

    private void g(String str, int i10, b bVar, MotionEvent motionEvent, short s10) {
        super.init(bVar.k(), i10, motionEvent.getEventTime());
        this.f41619b = str;
        this.f41618a = MotionEvent.obtain(motionEvent);
        this.f41620c = s10;
        this.f41622e = bVar;
    }

    private boolean h() {
        return this.f41619b.equals("topClick");
    }

    public static l i(String str, int i10, b bVar, MotionEvent motionEvent) {
        l lVar = (l) f41617h.b();
        if (lVar == null) {
            lVar = new l();
        }
        lVar.g(str, i10, bVar, (MotionEvent) C3863a.c(motionEvent), 0);
        return lVar;
    }

    public static l j(String str, int i10, b bVar, MotionEvent motionEvent, short s10) {
        l lVar = (l) f41617h.b();
        if (lVar == null) {
            lVar = new l();
        }
        lVar.g(str, i10, bVar, (MotionEvent) C3863a.c(motionEvent), s10);
        return lVar;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (this.f41618a == null) {
            ReactSoftExceptionLogger.logSoftException(f41616g, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f41621d == null) {
            this.f41621d = d();
        }
        List list = this.f41621d;
        if (list != null) {
            boolean z10 = true;
            if (list.size() <= 1) {
                z10 = false;
            }
            for (WritableMap writableMap : this.f41621d) {
                if (z10) {
                    writableMap = writableMap.copy();
                }
                rCTEventEmitter.receiveEvent(getViewTag(), this.f41619b, writableMap);
            }
        }
    }

    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        boolean z10;
        boolean z11;
        if (this.f41618a == null) {
            ReactSoftExceptionLogger.logSoftException(f41616g, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f41621d == null) {
            this.f41621d = d();
        }
        List list = this.f41621d;
        if (list != null) {
            if (list.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (WritableMap writableMap : this.f41621d) {
                if (z10) {
                    writableMap = writableMap.copy();
                }
                WritableMap writableMap2 = writableMap;
                int surfaceId = getSurfaceId();
                int viewTag = getViewTag();
                String str = this.f41619b;
                short s10 = this.f41620c;
                if (s10 != -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rCTModernEventEmitter.receiveEvent(surfaceId, viewTag, str, z11, s10, writableMap2, m.c(str));
            }
        }
    }

    public short getCoalescingKey() {
        return this.f41620c;
    }

    public d.b getEventAnimationDriverMatchSpec() {
        if (this.f41623f == null) {
            this.f41623f = new a();
        }
        return this.f41623f;
    }

    public String getEventName() {
        return this.f41619b;
    }

    public void onDispose() {
        this.f41621d = null;
        MotionEvent motionEvent = this.f41618a;
        this.f41618a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f41617h.a(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(f41616g, e10);
        }
    }
}
