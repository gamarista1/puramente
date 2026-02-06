package expo.modules.kotlin.views;

import Ff.d;
import Ff.e;
import Ff.p;
import ae.C4464a;
import android.view.View;
import expo.modules.kotlin.exception.i;
import expo.modules.kotlin.exception.s;
import expo.modules.kotlin.jni.ExpectedType;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import qe.Y;

public final class q extends Y {

    /* renamed from: a  reason: collision with root package name */
    private final p f60498a;

    public q(p pVar) {
        C6496s.h(pVar, "type");
        this.f60498a = pVar;
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.INT, C5052a.VIEW_TAG);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: d */
    public View a(Object obj, C4464a aVar) {
        if (aVar != null) {
            aVar.b();
            if (obj != null) {
                int intValue = ((Integer) obj).intValue();
                View d10 = aVar.d(intValue);
                if (this.f60498a.e() || d10 != null) {
                    return d10;
                }
                e b10 = this.f60498a.b();
                C6496s.f(b10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                throw new i((d) b10, intValue);
            } else if (this.f60498a.e()) {
                return null;
            } else {
                throw new s();
            }
        } else {
            throw new expo.modules.kotlin.exception.e();
        }
    }
}
