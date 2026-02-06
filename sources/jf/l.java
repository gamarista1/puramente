package Jf;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class l implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f63820a = new l();

    private l() {
    }

    public List a() {
        return C6565s.n();
    }

    public Void b() {
        return null;
    }

    public Object call(Object[] objArr) {
        C6496s.h(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) b();
    }

    public Type getReturnType() {
        Class cls = Void.TYPE;
        C6496s.g(cls, "TYPE");
        return cls;
    }
}
