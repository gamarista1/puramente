package com.facebook.react.views.scroll;

import android.os.SystemClock;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.views.scroll.k;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.C3863a;
import x1.f;

public final class j extends d {

    /* renamed from: k  reason: collision with root package name */
    public static final a f42053k = new a((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private static final String f42054l = j.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final f f42055m = new f(3);

    /* renamed from: a  reason: collision with root package name */
    private float f42056a;

    /* renamed from: b  reason: collision with root package name */
    private float f42057b;

    /* renamed from: c  reason: collision with root package name */
    private float f42058c;

    /* renamed from: d  reason: collision with root package name */
    private float f42059d;

    /* renamed from: e  reason: collision with root package name */
    private int f42060e;

    /* renamed from: f  reason: collision with root package name */
    private int f42061f;

    /* renamed from: g  reason: collision with root package name */
    private int f42062g;

    /* renamed from: h  reason: collision with root package name */
    private int f42063h;

    /* renamed from: i  reason: collision with root package name */
    private k f42064i;

    /* renamed from: j  reason: collision with root package name */
    private long f42065j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(int i10, int i11, k kVar, float f10, float f11, float f12, float f13, int i12, int i13, int i14, int i15) {
            j jVar = (j) j.f42055m.b();
            if (jVar == null) {
                jVar = new j((DefaultConstructorMarker) null);
            }
            jVar.c(i10, i11, kVar, f10, f11, f12, f13, i12, i13, i14, i15);
            return jVar;
        }

        public final j b(int i10, k kVar, float f10, float f11, float f12, float f13, int i11, int i12, int i13, int i14) {
            return a(-1, i10, kVar, f10, f11, f12, f13, i11, i12, i13, i14);
        }

        private a() {
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final void c(int i10, int i11, k kVar, float f10, float f11, float f12, float f13, int i12, int i13, int i14, int i15) {
        super.init(i10, i11);
        this.f42064i = kVar;
        this.f42056a = f10;
        this.f42057b = f11;
        this.f42058c = f12;
        this.f42059d = f13;
        this.f42060e = i12;
        this.f42061f = i13;
        this.f42062g = i14;
        this.f42063h = i15;
        this.f42065j = SystemClock.uptimeMillis();
    }

    public static final j d(int i10, int i11, k kVar, float f10, float f11, float f12, float f13, int i12, int i13, int i14, int i15) {
        return f42053k.a(i10, i11, kVar, f10, f11, f12, f13, i12, i13, i14, i15);
    }

    public static final j e(int i10, k kVar, float f10, float f11, float f12, float f13, int i11, int i12, int i13, int i14) {
        return f42053k.b(i10, kVar, f10, f11, f12, f13, i11, i12, i13, i14);
    }

    public boolean canCoalesce() {
        if (this.f42064i == k.SCROLL) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(VerticalAlignment.TOP, 0.0d);
        createMap.putDouble(VerticalAlignment.BOTTOM, 0.0d);
        createMap.putDouble(BlockAlignment.LEFT, 0.0d);
        createMap.putDouble(BlockAlignment.RIGHT, 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", (double) G.f(this.f42056a));
        createMap2.putDouble("y", (double) G.f(this.f42057b));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble(Snapshot.WIDTH, (double) G.f((float) this.f42060e));
        createMap3.putDouble(Snapshot.HEIGHT, (double) G.f((float) this.f42061f));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble(Snapshot.WIDTH, (double) G.f((float) this.f42062g));
        createMap4.putDouble(Snapshot.HEIGHT, (double) G.f((float) this.f42063h));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", (double) this.f42058c);
        createMap5.putDouble("y", (double) this.f42059d);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", getViewTag());
        createMap6.putDouble(DiagnosticsEntry.TIMESTAMP_KEY, (double) this.f42065j);
        createMap6.putBoolean("responderIgnoreScroll", true);
        C6496s.e(createMap6);
        return createMap6;
    }

    public String getEventName() {
        k.a aVar = k.f42066a;
        Object c10 = C3863a.c(this.f42064i);
        C6496s.g(c10, "assertNotNull(...)");
        return aVar.a((k) c10);
    }

    public void onDispose() {
        try {
            f42055m.a(this);
        } catch (IllegalStateException e10) {
            String str = f42054l;
            C6496s.g(str, "TAG");
            ReactSoftExceptionLogger.logSoftException(str, e10);
        }
    }

    private j() {
    }
}
