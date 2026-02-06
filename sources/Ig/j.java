package ig;

import pg.C6648j;

public enum j implements C6648j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    

    /* renamed from: f  reason: collision with root package name */
    private static C6648j.b f68165f;

    /* renamed from: a  reason: collision with root package name */
    private final int f68167a;

    static class a implements C6648j.b {
        a() {
        }

        /* renamed from: b */
        public j a(int i10) {
            return j.a(i10);
        }
    }

    static {
        f68165f = new a();
    }

    private j(int i10, int i11) {
        this.f68167a = i11;
    }

    public static j a(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    public final int d() {
        return this.f68167a;
    }
}
