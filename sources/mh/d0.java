package mh;

import kotlin.enums.EnumEntries;
import sf.C6714a;

public enum d0 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    

    /* renamed from: a  reason: collision with root package name */
    public final char f72209a;

    /* renamed from: b  reason: collision with root package name */
    public final char f72210b;

    static {
        d0[] a10;
        f72208h = C6714a.a(a10);
    }

    private d0(char c10, char c11) {
        this.f72209a = c10;
        this.f72210b = c11;
    }

    public static EnumEntries b() {
        return f72208h;
    }
}
