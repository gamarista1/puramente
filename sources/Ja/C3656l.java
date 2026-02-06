package ja;

import android.util.SparseBooleanArray;

/* renamed from: ja.l  reason: case insensitive filesystem */
public final class C3656l {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f45017a;

    /* renamed from: ja.l$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f45018a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f45019b;

        public b a(int i10) {
            C3645a.f(!this.f45019b);
            this.f45018a.append(i10, true);
            return this;
        }

        public b b(C3656l lVar) {
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                a(lVar.b(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int a10 : iArr) {
                a(a10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            if (z10) {
                return a(i10);
            }
            return this;
        }

        public C3656l e() {
            C3645a.f(!this.f45019b);
            this.f45019b = true;
            return new C3656l(this.f45018a);
        }
    }

    public boolean a(int i10) {
        return this.f45017a.get(i10);
    }

    public int b(int i10) {
        C3645a.c(i10, 0, c());
        return this.f45017a.keyAt(i10);
    }

    public int c() {
        return this.f45017a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3656l)) {
            return false;
        }
        C3656l lVar = (C3656l) obj;
        if (M.f44981a >= 24) {
            return this.f45017a.equals(lVar.f45017a);
        }
        if (c() != lVar.c()) {
            return false;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            if (b(i10) != lVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (M.f44981a >= 24) {
            return this.f45017a.hashCode();
        }
        int c10 = c();
        for (int i10 = 0; i10 < c(); i10++) {
            c10 = (c10 * 31) + b(i10);
        }
        return c10;
    }

    private C3656l(SparseBooleanArray sparseBooleanArray) {
        this.f45017a = sparseBooleanArray;
    }
}
