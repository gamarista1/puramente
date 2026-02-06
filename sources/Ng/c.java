package ng;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.List;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f72287c = new c("");

    /* renamed from: a  reason: collision with root package name */
    private final d f72288a;

    /* renamed from: b  reason: collision with root package name */
    private transient c f72289b;

    public c(String str) {
        if (str == null) {
            a(1);
        }
        this.f72288a = new d(str, this);
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public static c k(f fVar) {
        if (fVar == null) {
            a(14);
        }
        return new c(d.m(fVar));
    }

    public String b() {
        String b10 = this.f72288a.b();
        if (b10 == null) {
            a(4);
        }
        return b10;
    }

    public c c(f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new c(this.f72288a.c(fVar), this);
    }

    public boolean d() {
        return this.f72288a.e();
    }

    public c e() {
        c cVar = this.f72289b;
        if (cVar != null) {
            if (cVar == null) {
                a(6);
            }
            return cVar;
        } else if (!d()) {
            c cVar2 = new c(this.f72288a.g());
            this.f72289b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f72288a.equals(((c) obj).f72288a)) {
            return true;
        }
        return false;
    }

    public List f() {
        List h10 = this.f72288a.h();
        if (h10 == null) {
            a(11);
        }
        return h10;
    }

    public f g() {
        f i10 = this.f72288a.i();
        if (i10 == null) {
            a(9);
        }
        return i10;
    }

    public f h() {
        f j10 = this.f72288a.j();
        if (j10 == null) {
            a(10);
        }
        return j10;
    }

    public int hashCode() {
        return this.f72288a.hashCode();
    }

    public boolean i(f fVar) {
        if (fVar == null) {
            a(12);
        }
        return this.f72288a.k(fVar);
    }

    public d j() {
        d dVar = this.f72288a;
        if (dVar == null) {
            a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f72288a.toString();
    }

    public c(d dVar) {
        if (dVar == null) {
            a(2);
        }
        this.f72288a = dVar;
    }

    private c(d dVar, c cVar) {
        if (dVar == null) {
            a(3);
        }
        this.f72288a = dVar;
        this.f72289b = cVar;
    }
}
