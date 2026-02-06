package Zg;

import a.C1534a;
import kotlin.coroutines.jvm.internal.a;
import lf.v;
import lf.w;

public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement f66949a = new C1534a().a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f66950b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f66951c;

    static {
        Object obj;
        Object obj2;
        try {
            v.a aVar = v.f71841b;
            obj = v.b(a.class.getCanonicalName());
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (v.e(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f66950b = (String) obj;
        try {
            obj2 = v.b(F.class.getCanonicalName());
        } catch (Throwable th3) {
            v.a aVar3 = v.f71841b;
            obj2 = v.b(w.a(th3));
        }
        if (v.e(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f66951c = (String) obj2;
    }

    public static final Throwable a(Throwable th2) {
        return th2;
    }
}
