package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import x1.f;

public final class n extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f59610c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final f f59611d = new f(7);

    /* renamed from: a  reason: collision with root package name */
    private WritableMap f59612a;

    /* renamed from: b  reason: collision with root package name */
    private short f59613b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(C5260d dVar) {
            C6496s.h(dVar, "handler");
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("handlerTag", dVar.T());
            createMap.putInt("state", dVar.S());
            createMap.putInt("numberOfTouches", dVar.V());
            createMap.putInt("eventType", dVar.U());
            createMap.putInt("pointerType", dVar.Q());
            WritableArray t10 = dVar.t();
            if (t10 != null) {
                createMap.putArray("changedTouches", t10);
            }
            WritableArray s10 = dVar.s();
            if (s10 != null) {
                createMap.putArray("allTouches", s10);
            }
            if (dVar.a0() && dVar.S() == 4) {
                createMap.putInt("state", 2);
            }
            C6496s.g(createMap, "apply(...)");
            return createMap;
        }

        public final n b(C5260d dVar) {
            C6496s.h(dVar, "handler");
            n nVar = (n) n.f59611d.b();
            if (nVar == null) {
                nVar = new n((DefaultConstructorMarker) null);
            }
            nVar.c(dVar);
            return nVar;
        }

        private a() {
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final void c(C5260d dVar) {
        View W10 = dVar.W();
        C6496s.e(W10);
        super.init(n0.f(W10), W10.getId());
        this.f59612a = f59610c.a(dVar);
        this.f59613b = dVar.I();
    }

    public boolean canCoalesce() {
        return true;
    }

    public short getCoalescingKey() {
        return this.f59613b;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        return this.f59612a;
    }

    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    public void onDispose() {
        this.f59612a = null;
        f59611d.a(this);
    }

    private n() {
    }
}
