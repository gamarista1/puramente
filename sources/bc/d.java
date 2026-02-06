package Bc;

import com.google.protobuf.C4881t;

public enum d implements C4881t.a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    

    /* renamed from: f  reason: collision with root package name */
    private static final C4881t.b f50328f = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f50330a;

    class a implements C4881t.b {
        a() {
        }
    }

    private static final class b implements C4881t.c {

        /* renamed from: a  reason: collision with root package name */
        static final C4881t.c f50331a = null;

        static {
            f50331a = new b();
        }

        private b() {
        }
    }

    static {
        f50328f = new a();
    }

    private d(int i10) {
        this.f50330a = i10;
    }

    public static C4881t.c b() {
        return b.f50331a;
    }

    public final int d() {
        return this.f50330a;
    }
}
