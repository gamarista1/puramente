package ge;

import Qd.a;
import ae.m;
import ae.u;
import android.os.Bundle;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import qe.M;

public final class h extends g {

    /* renamed from: c  reason: collision with root package name */
    private final m f60651c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(m mVar, a aVar, WeakReference weakReference) {
        super(aVar, weakReference);
        C6496s.h(mVar, "moduleHolder");
        C6496s.h(aVar, "legacyEventEmitter");
        C6496s.h(weakReference, "reactContextHolder");
        this.f60651c = mVar;
    }

    private final void c(String str) {
        String[] a10;
        f d10 = this.f60651c.e().d();
        if (d10 == null || (a10 = d10.a()) == null || !C6559l.W(a10, str)) {
            throw new IllegalArgumentException(("Unsupported event: " + str + ".").toString());
        }
    }

    private final void d(String str, Map map) {
        u e10 = this.f60651c.g().e();
        JavaScriptModuleObject i10 = this.f60651c.i();
        if (i10 != null) {
            try {
                JNIUtils.f60431a.a(i10, e10.f(), str, map);
            } catch (Exception e11) {
                if (i10.a()) {
                    throw e11;
                }
            }
        }
    }

    public void a(String str, Bundle bundle) {
        Map map;
        C6496s.h(str, "eventName");
        c(str);
        if (bundle != null) {
            map = M.s(bundle);
        } else {
            map = null;
        }
        d(str, map);
    }
}
