package sf;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import mf.C6550c;
import mf.C6559l;

/* renamed from: sf.b  reason: case insensitive filesystem */
final class C6715b extends C6550c implements EnumEntries, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final Enum[] f73526b;

    public C6715b(Enum[] enumArr) {
        C6496s.h(enumArr, "entries");
        this.f73526b = enumArr;
    }

    private final Object writeReplace() {
        return new C6716c(this.f73526b);
    }

    public int a() {
        return this.f73526b.length;
    }

    public boolean b(Enum enumR) {
        C6496s.h(enumR, "element");
        if (((Enum) C6559l.m0(this.f73526b, enumR.ordinal())) == enumR) {
            return true;
        }
        return false;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return b((Enum) obj);
    }

    /* renamed from: g */
    public Enum get(int i10) {
        C6550c.f72053a.b(i10, this.f73526b.length);
        return this.f73526b[i10];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return k((Enum) obj);
    }

    public int k(Enum enumR) {
        C6496s.h(enumR, "element");
        int ordinal = enumR.ordinal();
        if (((Enum) C6559l.m0(this.f73526b, ordinal)) == enumR) {
            return ordinal;
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return n((Enum) obj);
    }

    public int n(Enum enumR) {
        C6496s.h(enumR, "element");
        return indexOf(enumR);
    }
}
