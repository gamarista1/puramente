package gg;

import Fg.S;
import Of.C5487e;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

/* renamed from: gg.H  reason: case insensitive filesystem */
public final class C5948H implements C5947G {

    /* renamed from: a  reason: collision with root package name */
    public static final C5948H f67717a = new C5948H();

    private C5948H() {
    }

    public String b(C5487e eVar) {
        C6496s.h(eVar, "classDescriptor");
        return null;
    }

    public S c(S s10) {
        C6496s.h(s10, "kotlinType");
        return null;
    }

    public S d(Collection collection) {
        C6496s.h(collection, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + C6565s.x0(collection, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null));
    }

    public void e(S s10, C5487e eVar) {
        C6496s.h(s10, "kotlinType");
        C6496s.h(eVar, "descriptor");
    }

    public String f(C5487e eVar) {
        C6496s.h(eVar, "classDescriptor");
        return null;
    }

    /* renamed from: g */
    public C5969s a(C5487e eVar) {
        C6496s.h(eVar, "classDescriptor");
        return null;
    }
}
