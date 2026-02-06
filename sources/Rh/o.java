package rh;

import Gh.C5407h;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C6496s;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f73446a = new o();

    private o() {
    }

    public static final String a(String str, String str2, Charset charset) {
        C6496s.h(str, "username");
        C6496s.h(str2, "password");
        C6496s.h(charset, "charset");
        String a10 = C5407h.f63295d.c(str + ':' + str2, charset).a();
        return "Basic " + a10;
    }
}
