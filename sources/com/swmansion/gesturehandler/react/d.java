package com.swmansion.gesturehandler.react;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.react.c;
import kotlin.jvm.internal.C6496s;
import ud.C5240g;
import ud.C5241h;
import vd.C5260d;
import vd.r;

public final class d implements r {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f59580a;

    /* renamed from: b  reason: collision with root package name */
    private final C5241h f59581b = new C5241h();

    public d(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactApplicationContext");
        this.f59580a = reactApplicationContext;
    }

    private final void d(C5260d dVar) {
        C5260d.c a10;
        if (dVar.T() >= 0 && dVar.S() == 4 && (a10 = e.f59582a.a(dVar)) != null) {
            int F10 = dVar.F();
            if (F10 == 1) {
                i(c.a.c(c.f59575d, dVar, a10.c(dVar), false, 4, (Object) null));
            } else if (F10 == 2) {
                h(c.f59575d.b(dVar, a10.c(dVar), true));
            } else if (F10 == 3) {
                g("onGestureHandlerEvent", c.f59575d.a(a10.c(dVar)));
            } else if (F10 == 4) {
                g("onGestureHandlerEvent", c.f59575d.a(a10.c(dVar)));
            }
        }
    }

    private final void e(C5260d dVar, int i10, int i11) {
        C5260d.c a10;
        if (dVar.T() >= 0 && (a10 = e.f59582a.a(dVar)) != null) {
            int F10 = dVar.F();
            if (F10 == 1) {
                i(m.f59605d.b(dVar, i10, i11, a10.c(dVar)));
            } else if (F10 == 2 || F10 == 3) {
                g("onGestureHandlerStateChange", m.f59605d.a(a10.c(dVar), i10, i11));
            } else if (F10 == 4) {
                g("onGestureHandlerStateChange", m.f59605d.a(a10.c(dVar), i10, i11));
            }
        }
    }

    private final void f(C5260d dVar) {
        if (dVar.T() >= 0) {
            if (dVar.S() == 2 || dVar.S() == 4 || dVar.S() == 0 || dVar.W() != null) {
                int F10 = dVar.F();
                if (F10 == 1) {
                    i(n.f59610c.b(dVar));
                } else if (F10 == 4) {
                    g("onGestureHandlerEvent", n.f59610c.a(dVar));
                }
            }
        }
    }

    private final void g(String str, WritableMap writableMap) {
        a.a(this.f59580a).emit(str, writableMap);
    }

    private final void h(c cVar) {
        C5240g.a(this.f59580a, cVar);
    }

    private final void i(com.facebook.react.uimanager.events.d dVar) {
        this.f59581b.a(dVar, this.f59580a);
    }

    public void a(C5260d dVar, int i10, int i11) {
        C6496s.h(dVar, "handler");
        e(dVar, i10, i11);
    }

    public void b(C5260d dVar, MotionEvent motionEvent) {
        C6496s.h(dVar, "handler");
        C6496s.h(motionEvent, "event");
        d(dVar);
    }

    public void c(C5260d dVar) {
        C6496s.h(dVar, "handler");
        f(dVar);
    }
}
