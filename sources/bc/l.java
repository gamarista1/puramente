package Bc;

import com.google.protobuf.C4881t;

public enum l implements C4881t.a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    

    /* renamed from: d  reason: collision with root package name */
    private static final C4881t.b f50361d = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f50363a;

    class a implements C4881t.b {
        a() {
        }
    }

    private static final class b implements C4881t.c {

        /* renamed from: a  reason: collision with root package name */
        static final C4881t.c f50364a = null;

        static {
            f50364a = new b();
        }

        private b() {
        }
    }

    static {
        f50361d = new a();
    }

    private l(int i10) {
        this.f50363a = i10;
    }

    public static l b(int i10) {
        if (i10 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static C4881t.c c() {
        return b.f50364a;
    }

    public final int d() {
        return this.f50363a;
    }
}
