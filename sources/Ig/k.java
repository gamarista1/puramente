package ig;

import pg.C6648j;

public enum k implements C6648j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    

    /* renamed from: f  reason: collision with root package name */
    private static C6648j.b f68172f;

    /* renamed from: a  reason: collision with root package name */
    private final int f68174a;

    static class a implements C6648j.b {
        a() {
        }

        /* renamed from: b */
        public k a(int i10) {
            return k.a(i10);
        }
    }

    static {
        f68172f = new a();
    }

    private k(int i10, int i11) {
        this.f68174a = i11;
    }

    public static k a(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }

    public final int d() {
        return this.f68174a;
    }
}
