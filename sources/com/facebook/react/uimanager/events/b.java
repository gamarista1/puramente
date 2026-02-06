package com.facebook.react.uimanager.events;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b implements EventDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41573a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final EventDispatcher f41574b = new b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventDispatcher a() {
            return b.f41574b;
        }

        private a() {
        }
    }

    private b() {
    }

    public static final EventDispatcher l() {
        return f41573a.a();
    }

    public void a(int i10, RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "eventEmitter");
    }

    public void b() {
    }

    public void c(a aVar) {
        C6496s.h(aVar, "listener");
    }

    public void d() {
    }

    public void e(int i10) {
    }

    public void f(g gVar) {
        C6496s.h(gVar, "listener");
    }

    public void g(g gVar) {
        C6496s.h(gVar, "listener");
    }

    public void h(d dVar) {
        C6496s.h(dVar, "event");
        String eventName = dVar.getEventName();
        U5.a.b("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + eventName);
    }

    public void i(a aVar) {
        C6496s.h(aVar, "listener");
    }

    public void j(int i10, RCTModernEventEmitter rCTModernEventEmitter) {
        C6496s.h(rCTModernEventEmitter, "eventEmitter");
    }
}
