package ig;

import pg.C6648j;

public enum x implements C6648j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    

    /* renamed from: h  reason: collision with root package name */
    private static C6648j.b f68459h;

    /* renamed from: a  reason: collision with root package name */
    private final int f68461a;

    static class a implements C6648j.b {
        a() {
        }

        /* renamed from: b */
        public x a(int i10) {
            return x.a(i10);
        }
    }

    static {
        f68459h = new a();
    }

    private x(int i10, int i11) {
        this.f68461a = i11;
    }

    public static x a(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    public final int d() {
        return this.f68461a;
    }
}
