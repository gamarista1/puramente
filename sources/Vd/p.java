package vd;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.C6496s;
import vd.C5260d;
import wd.e;

public final class p extends C5260d {

    public static final class a extends C5260d.c {

        /* renamed from: b  reason: collision with root package name */
        private final Class f61923b = p.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f61924c = "ManualGestureHandler";

        public String d() {
            return this.f61924c;
        }

        public Class e() {
            return this.f61923b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public p a(Context context) {
            return new p();
        }

        /* renamed from: h */
        public e c(p pVar) {
            C6496s.h(pVar, "handler");
            return new e(pVar);
        }
    }

    /* access modifiers changed from: protected */
    public void l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        if (S() == 0) {
            p();
        }
    }
}
