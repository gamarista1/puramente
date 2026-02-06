package Xf;

import sf.C6714a;

/* renamed from: Xf.c  reason: case insensitive filesystem */
public enum C5670c {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f66373a;

    static {
        C5670c[] a10;
        f66372i = C6714a.a(a10);
    }

    private C5670c(String str) {
        this.f66373a = str;
    }

    public final String b() {
        return this.f66373a;
    }
}
