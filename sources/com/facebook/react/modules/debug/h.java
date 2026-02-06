package com.facebook.react.modules.debug;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import g8.C3540a;
import java.util.TreeMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.C3863a;

public final class h implements Choreographer.FrameCallback {

    /* renamed from: n  reason: collision with root package name */
    private static final a f41021n = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ReactContext f41022a;

    /* renamed from: b  reason: collision with root package name */
    private Choreographer f41023b;

    /* renamed from: c  reason: collision with root package name */
    private final UIManagerModule f41024c;

    /* renamed from: d  reason: collision with root package name */
    private final d f41025d = new d();

    /* renamed from: e  reason: collision with root package name */
    private long f41026e = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f41027f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f41028g;

    /* renamed from: h  reason: collision with root package name */
    private int f41029h;

    /* renamed from: i  reason: collision with root package name */
    private int f41030i;

    /* renamed from: j  reason: collision with root package name */
    private int f41031j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f41032k;

    /* renamed from: l  reason: collision with root package name */
    private double f41033l = 60.0d;

    /* renamed from: m  reason: collision with root package name */
    private TreeMap f41034m;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f41035a;

        /* renamed from: b  reason: collision with root package name */
        private final int f41036b;

        /* renamed from: c  reason: collision with root package name */
        private final int f41037c;

        /* renamed from: d  reason: collision with root package name */
        private final int f41038d;

        /* renamed from: e  reason: collision with root package name */
        private final double f41039e;

        /* renamed from: f  reason: collision with root package name */
        private final double f41040f;

        /* renamed from: g  reason: collision with root package name */
        private final int f41041g;

        public b(int i10, int i11, int i12, int i13, double d10, double d11, int i14) {
            this.f41035a = i10;
            this.f41036b = i11;
            this.f41037c = i12;
            this.f41038d = i13;
            this.f41039e = d10;
            this.f41040f = d11;
            this.f41041g = i14;
        }
    }

    public h(ReactContext reactContext) {
        C6496s.h(reactContext, "reactContext");
        this.f41022a = reactContext;
        this.f41024c = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
    }

    public static /* synthetic */ void l(h hVar, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = hVar.f41033l;
        }
        hVar.k(d10);
    }

    /* access modifiers changed from: private */
    public static final void m(h hVar) {
        Choreographer instance = Choreographer.getInstance();
        hVar.f41023b = instance;
        if (instance != null) {
            instance.postFrameCallback(hVar);
        }
    }

    /* access modifiers changed from: private */
    public static final void o(h hVar) {
        Choreographer instance = Choreographer.getInstance();
        hVar.f41023b = instance;
        if (instance != null) {
            instance.removeFrameCallback(hVar);
        }
    }

    public final int c() {
        return this.f41030i;
    }

    public final int d() {
        return (int) (((this.f41033l * ((double) i())) / ((double) 1000)) + ((double) 1));
    }

    public void doFrame(long j10) {
        if (this.f41026e == -1) {
            this.f41026e = j10;
        }
        long j11 = this.f41027f;
        this.f41027f = j10;
        if (this.f41025d.d(j11, j10)) {
            this.f41031j++;
        }
        this.f41028g++;
        int d10 = d();
        if ((d10 - this.f41029h) - 1 >= 4) {
            this.f41030i++;
        }
        if (this.f41032k) {
            C3863a.c(this.f41034m);
            b bVar = new b(g(), h(), d10, this.f41030i, e(), f(), i());
            TreeMap treeMap = this.f41034m;
            if (treeMap != null) {
                b bVar2 = (b) treeMap.put(Long.valueOf(System.currentTimeMillis()), bVar);
            }
        }
        this.f41029h = d10;
        Choreographer choreographer = this.f41023b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final double e() {
        if (this.f41027f == this.f41026e) {
            return 0.0d;
        }
        return (((double) g()) * 1.0E9d) / ((double) (this.f41027f - this.f41026e));
    }

    public final double f() {
        if (this.f41027f == this.f41026e) {
            return 0.0d;
        }
        return (((double) h()) * 1.0E9d) / ((double) (this.f41027f - this.f41026e));
    }

    public final int g() {
        return this.f41028g - 1;
    }

    public final int h() {
        return this.f41031j - 1;
    }

    public final int i() {
        return (int) ((((double) this.f41027f) - ((double) this.f41026e)) / 1000000.0d);
    }

    public final void j() {
        this.f41026e = -1;
        this.f41027f = -1;
        this.f41028g = 0;
        this.f41030i = 0;
        this.f41031j = 0;
        this.f41032k = false;
        this.f41034m = null;
    }

    public final void k(double d10) {
        if (!this.f41022a.isBridgeless()) {
            this.f41022a.getCatalystInstance().addBridgeIdleDebugListener(this.f41025d);
        }
        UIManagerModule uIManagerModule = this.f41024c;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(this.f41025d);
        }
        this.f41033l = d10;
        UiThreadUtil.runOnUiThread(new f(this));
    }

    public final void n() {
        if (!this.f41022a.isBridgeless()) {
            this.f41022a.getCatalystInstance().removeBridgeIdleDebugListener(this.f41025d);
        }
        UIManagerModule uIManagerModule = this.f41024c;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener((C3540a) null);
        }
        UiThreadUtil.runOnUiThread(new g(this));
    }
}
