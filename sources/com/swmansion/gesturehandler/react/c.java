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

public final class c extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f59575d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final f f59576e = new f(7);

    /* renamed from: a  reason: collision with root package name */
    private b f59577a;

    /* renamed from: b  reason: collision with root package name */
    private short f59578b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f59579c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c c(a aVar, C5260d dVar, b bVar, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.b(dVar, bVar, z10);
        }

        public final WritableMap a(b bVar) {
            C6496s.h(bVar, "dataBuilder");
            WritableMap createMap = Arguments.createMap();
            C6496s.e(createMap);
            bVar.a(createMap);
            C6496s.g(createMap, "apply(...)");
            return createMap;
        }

        public final c b(C5260d dVar, b bVar, boolean z10) {
            C6496s.h(dVar, "handler");
            C6496s.h(bVar, "dataBuilder");
            c cVar = (c) c.f59576e.b();
            if (cVar == null) {
                cVar = new c((DefaultConstructorMarker) null);
            }
            cVar.c(dVar, bVar, z10);
            return cVar;
        }

        private a() {
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final void c(C5260d dVar, b bVar, boolean z10) {
        View W10 = dVar.W();
        C6496s.e(W10);
        super.init(n0.f(W10), W10.getId());
        this.f59577a = bVar;
        this.f59579c = z10;
        this.f59578b = dVar.I();
    }

    public boolean canCoalesce() {
        return true;
    }

    public short getCoalescingKey() {
        return this.f59578b;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        a aVar = f59575d;
        b bVar = this.f59577a;
        C6496s.e(bVar);
        return aVar.a(bVar);
    }

    public String getEventName() {
        if (this.f59579c) {
            return "topGestureHandlerEvent";
        }
        return "onGestureHandlerEvent";
    }

    public void onDispose() {
        this.f59577a = null;
        f59576e.a(this);
    }

    private c() {
    }
}
