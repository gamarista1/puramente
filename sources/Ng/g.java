package ng;

import Sg.m;
import kotlin.jvm.internal.C6496s;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f72300a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final m f72301b = new m("[^\\p{L}\\p{Digit}]");

    /* renamed from: c  reason: collision with root package name */
    private static final String f72302c = "$context_receiver";

    private g() {
    }

    public static final f a(int i10) {
        f i11 = f.i(f72302c + '_' + i10);
        C6496s.g(i11, "identifier(...)");
        return i11;
    }

    public static final String b(String str) {
        C6496s.h(str, "name");
        return f72301b.e(str, "_");
    }
}
