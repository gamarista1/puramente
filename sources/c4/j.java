package C4;

import D4.b;
import H4.f;
import u4.C4071k;
import u4.L;
import u4.M;
import w4.C4118c;
import w4.C4127l;

public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29954a;

    /* renamed from: b  reason: collision with root package name */
    private final a f29955b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29956c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 == 4) {
                return INTERSECT;
            }
            if (i10 != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f29954a = str;
        this.f29955b = aVar;
        this.f29956c = z10;
    }

    public C4118c a(L l10, C4071k kVar, b bVar) {
        if (l10.g0(M.MergePathsApi19)) {
            return new C4127l(this);
        }
        f.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f29955b;
    }

    public String c() {
        return this.f29954a;
    }

    public boolean d() {
        return this.f29956c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f29955b + '}';
    }
}
