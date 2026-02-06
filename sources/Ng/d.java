package ng;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import mf.C6559l;
import yf.C6798l;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    private static final f f72290e = f.m("<root>");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f72291f = Pattern.compile("\\.");

    /* renamed from: g  reason: collision with root package name */
    private static final C6798l f72292g = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f72293a;

    /* renamed from: b  reason: collision with root package name */
    private transient c f72294b;

    /* renamed from: c  reason: collision with root package name */
    private transient d f72295c;

    /* renamed from: d  reason: collision with root package name */
    private transient f f72296d;

    static class a implements C6798l {
        a() {
        }

        /* renamed from: a */
        public f invoke(String str) {
            return f.f(str);
        }
    }

    d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f72293a = str;
        this.f72294b = cVar;
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case 18:
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case 18:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case StdKeyDeserializer.TYPE_URL:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case StdKeyDeserializer.TYPE_CLASS:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case 18:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    private void d() {
        int lastIndexOf = this.f72293a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f72296d = f.f(this.f72293a.substring(lastIndexOf + 1));
            this.f72295c = new d(this.f72293a.substring(0, lastIndexOf));
            return;
        }
        this.f72296d = f.f(this.f72293a);
        this.f72295c = c.f72287c.j();
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(17);
        }
        return new d(fVar.b(), c.f72287c.j(), fVar);
    }

    public String b() {
        String str = this.f72293a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String str;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            str = fVar.b();
        } else {
            str = this.f72293a + "." + fVar.b();
        }
        return new d(str, this, fVar);
    }

    public boolean e() {
        return this.f72293a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.f72293a.equals(((d) obj).f72293a)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (this.f72294b != null || b().indexOf(60) < 0) {
            return true;
        }
        return false;
    }

    public d g() {
        d dVar = this.f72295c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        } else if (!e()) {
            d();
            d dVar2 = this.f72295c;
            if (dVar2 == null) {
                a(8);
            }
            return dVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public List h() {
        List list;
        if (e()) {
            list = Collections.emptyList();
        } else {
            list = C6559l.R0(f72291f.split(this.f72293a), f72292g);
        }
        if (list == null) {
            a(14);
        }
        return list;
    }

    public int hashCode() {
        return this.f72293a.hashCode();
    }

    public f i() {
        f fVar = this.f72296d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        } else if (!e()) {
            d();
            f fVar2 = this.f72296d;
            if (fVar2 == null) {
                a(11);
            }
            return fVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public f j() {
        if (e()) {
            f fVar = f72290e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f i10 = i();
        if (i10 == null) {
            a(13);
        }
        return i10;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int indexOf = this.f72293a.indexOf(46);
        if (indexOf == -1) {
            indexOf = this.f72293a.length();
        }
        String b10 = fVar.b();
        if (indexOf != b10.length() || !this.f72293a.regionMatches(0, b10, 0, indexOf)) {
            return false;
        }
        return true;
    }

    public c l() {
        c cVar = this.f72294b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f72294b = cVar2;
        return cVar2;
    }

    public String toString() {
        String str;
        if (e()) {
            str = f72290e.b();
        } else {
            str = this.f72293a;
        }
        if (str == null) {
            a(18);
        }
        return str;
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f72293a = str;
    }

    private d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f72293a = str;
        this.f72295c = dVar;
        this.f72296d = fVar;
    }
}
