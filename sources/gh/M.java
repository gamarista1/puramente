package Gh;

import Hh.d;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class M implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f63223b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f63224c;

    /* renamed from: a  reason: collision with root package name */
    private final C5407h f63225a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ M d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ M e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ M f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final M a(File file, boolean z10) {
            C6496s.h(file, "<this>");
            String file2 = file.toString();
            C6496s.g(file2, "toString(...)");
            return b(file2, z10);
        }

        public final M b(String str, boolean z10) {
            C6496s.h(str, "<this>");
            return d.k(str, z10);
        }

        public final M c(Path path, boolean z10) {
            C6496s.h(path, "<this>");
            return b(path.toString(), z10);
        }

        private a() {
        }
    }

    static {
        String str = File.separator;
        C6496s.g(str, "separator");
        f63224c = str;
    }

    public M(C5407h hVar) {
        C6496s.h(hVar, "bytes");
        this.f63225a = hVar;
    }

    public static /* synthetic */ M r(M m10, M m11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m10.o(m11, z10);
    }

    /* renamed from: a */
    public int compareTo(M m10) {
        C6496s.h(m10, "other");
        return b().compareTo(m10.b());
    }

    public final C5407h b() {
        return this.f63225a;
    }

    public final M c() {
        int h10 = d.o(this);
        if (h10 == -1) {
            return null;
        }
        return new M(b().Q(0, h10));
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        int h10 = d.o(this);
        if (h10 == -1) {
            h10 = 0;
        } else if (h10 < b().O() && b().j(h10) == 92) {
            h10++;
        }
        int O10 = b().O();
        int i10 = h10;
        while (h10 < O10) {
            if (b().j(h10) == 47 || b().j(h10) == 92) {
                arrayList.add(b().Q(i10, h10));
                i10 = h10 + 1;
            }
            h10++;
        }
        if (i10 < b().O()) {
            arrayList.add(b().Q(i10, b().O()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof M) || !C6496s.c(((M) obj).b(), b())) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (d.o(this) != -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final String i() {
        return j().W();
    }

    public final C5407h j() {
        int d10 = d.l(this);
        if (d10 != -1) {
            return C5407h.R(b(), d10 + 1, 0, 2, (Object) null);
        }
        if (u() == null || b().O() != 2) {
            return b();
        }
        return C5407h.f63296e;
    }

    public final M l() {
        M m10;
        if (C6496s.c(b(), d.f63483d) || C6496s.c(b(), d.f63480a) || C6496s.c(b(), d.f63481b) || d.n(this)) {
            return null;
        }
        int d10 = d.l(this);
        if (d10 != 2 || u() == null) {
            if (d10 == 1 && b().P(d.f63481b)) {
                return null;
            }
            if (d10 != -1 || u() == null) {
                if (d10 == -1) {
                    return new M(d.f63483d);
                }
                if (d10 != 0) {
                    return new M(C5407h.R(b(), 0, d10, 1, (Object) null));
                }
                m10 = new M(C5407h.R(b(), 0, 1, 1, (Object) null));
            } else if (b().O() == 2) {
                return null;
            } else {
                m10 = new M(C5407h.R(b(), 0, 2, 1, (Object) null));
            }
        } else if (b().O() == 3) {
            return null;
        } else {
            m10 = new M(C5407h.R(b(), 0, 3, 1, (Object) null));
        }
        return m10;
    }

    public final M m(M m10) {
        C6496s.h(m10, "other");
        if (C6496s.c(c(), m10.c())) {
            List e10 = e();
            List e11 = m10.e();
            int min = Math.min(e10.size(), e11.size());
            int i10 = 0;
            while (i10 < min && C6496s.c(e10.get(i10), e11.get(i10))) {
                i10++;
            }
            if (i10 == min && b().O() == m10.b().O()) {
                return a.e(f63223b, ".", false, 1, (Object) null);
            }
            if (e11.subList(i10, e11.size()).indexOf(d.f63484e) == -1) {
                C5404e eVar = new C5404e();
                C5407h f10 = d.m(m10);
                if (f10 == null && (f10 = d.m(this)) == null) {
                    f10 = d.s(f63224c);
                }
                int size = e11.size();
                for (int i11 = i10; i11 < size; i11++) {
                    eVar.k0(d.f63484e);
                    eVar.k0(f10);
                }
                int size2 = e10.size();
                while (i10 < size2) {
                    eVar.k0((C5407h) e10.get(i10));
                    eVar.k0(f10);
                    i10++;
                }
                return d.q(eVar, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + m10).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + m10).toString());
    }

    public final M o(M m10, boolean z10) {
        C6496s.h(m10, "child");
        return d.j(this, m10, z10);
    }

    public final M p(String str) {
        C6496s.h(str, "child");
        return d.j(this, d.q(new C5404e().X(str), false), false);
    }

    public final File s() {
        return new File(toString());
    }

    public final Path t() {
        Path a10 = Paths.get(toString(), new String[0]);
        C6496s.g(a10, "get(...)");
        return a10;
    }

    public String toString() {
        return b().W();
    }

    public final Character u() {
        if (C5407h.u(b(), d.f63480a, 0, 2, (Object) null) != -1 || b().O() < 2 || b().j(1) != 58) {
            return null;
        }
        char j10 = (char) b().j(0);
        if (('a' > j10 || j10 >= '{') && ('A' > j10 || j10 >= '[')) {
            return null;
        }
        return Character.valueOf(j10);
    }
}
