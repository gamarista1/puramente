package Mf;

import Mf.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum c {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f64110a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(f fVar) {
            C6496s.h(fVar, "functionTypeKind");
            if (C6496s.c(fVar, f.a.f64123e)) {
                return c.Function;
            }
            if (C6496s.c(fVar, f.d.f64126e)) {
                return c.SuspendFunction;
            }
            if (C6496s.c(fVar, f.b.f64124e)) {
                return c.KFunction;
            }
            if (C6496s.c(fVar, f.c.f64125e)) {
                return c.KSuspendFunction;
            }
            return c.UNKNOWN;
        }

        private a() {
        }
    }

    static {
        c[] a10;
        f64117h = C6714a.a(a10);
        f64110a = new a((DefaultConstructorMarker) null);
    }
}
