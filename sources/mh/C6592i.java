package mh;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import lf.v;
import lf.w;

/* renamed from: mh.i  reason: case insensitive filesystem */
public abstract class C6592i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int f72211a;

    static {
        Object obj;
        int i10;
        try {
            v.a aVar = v.f71841b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            C6496s.g(property, "getProperty(...)");
            obj = v.b(p.m(property));
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (v.g(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 2097152;
        }
        f72211a = i10;
    }
}
