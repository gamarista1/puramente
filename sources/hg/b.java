package Hg;

import sf.C6714a;

public enum b {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f63348a;

    static {
        b[] a10;
        f63347j = C6714a.a(a10);
    }

    private b(String str) {
        this.f63348a = str;
    }

    public final String b() {
        return this.f63348a;
    }
}
