package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import wd.b;
import x1.f;

public final class m extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f59605d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final f f59606e = new f(7);

    /* renamed from: a  reason: collision with root package name */
    private b f59607a;

    /* renamed from: b  reason: collision with root package name */
    private int f59608b;

    /* renamed from: c  reason: collision with root package name */
    private int f59609c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(b bVar, int i10, int i11) {
            C6496s.h(bVar, "dataBuilder");
            WritableMap createMap = Arguments.createMap();
            C6496s.e(createMap);
            bVar.a(createMap);
            createMap.putInt("state", i10);
            createMap.putInt("oldState", i11);
            C6496s.g(createMap, "apply(...)");
            return createMap;
        }

        public final m b(C5260d dVar, int i10, int i11, b bVar) {
            C6496s.h(dVar, "handler");
            C6496s.h(bVar, "dataBuilder");
            m mVar = (m) m.f59606e.b();
            if (mVar == null) {
                mVar = new m((DefaultConstructorMarker) null);
            }
            mVar.c(dVar, i10, i11, bVar);
            return mVar;
        }

        private a() {
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final void c(C5260d dVar, int i10, int i11, b bVar) {
        View W10 = dVar.W();
        C6496s.e(W10);
        super.init(n0.f(W10), W10.getId());
        this.f59607a = bVar;
        this.f59608b = i10;
        this.f59609c = i11;
    }

    public boolean canCoalesce() {
        return false;
    }

    public short getCoalescingKey() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        a aVar = f59605d;
        b bVar = this.f59607a;
        C6496s.e(bVar);
        return aVar.a(bVar, this.f59608b, this.f59609c);
    }

    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    public void onDispose() {
        this.f59607a = null;
        this.f59608b = 0;
        this.f59609c = 0;
        f59606e.a(this);
    }

    private m() {
    }
}
