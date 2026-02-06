package expo.modules.kotlin.views;

import Od.a;
import Rd.d;
import ae.C4464a;
import ae.C4466c;
import ae.m;
import ae.u;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import ge.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import mf.O;
import yf.C6798l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private m f60497a;

    public p(m mVar) {
        C6496s.h(mVar, "moduleHolder");
        this.f60497a = mVar;
    }

    private final n b() {
        n h10 = this.f60497a.e().h();
        if (h10 != null) {
            return h10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final View a(Context context) {
        C6496s.h(context, "context");
        return b().a(context, this.f60497a.g().c());
    }

    public final Map c() {
        String[] a10;
        Map c10 = O.c();
        b c11 = b().c();
        if (!(c11 == null || (a10 = c11.a()) == null)) {
            for (String str : a10) {
                c10.put(i.a(str), O.f(C6502A.a("registrationName", str)));
            }
        }
        return O.b(c10);
    }

    public final m d() {
        return this.f60497a;
    }

    public final String e() {
        return this.f60497a.h();
    }

    public final Map f() {
        return b().f();
    }

    public final m g() {
        b().h();
        return null;
    }

    public final void h(View view) {
        CodedException codedException;
        CodedException unexpectedException;
        C6496s.h(view, "view");
        try {
            C6798l d10 = b().d();
            if (d10 != null) {
                d10.invoke(view);
            }
        } catch (Throwable th2) {
            if (!f.a(view)) {
                if (th2 instanceof CodedException) {
                    codedException = (CodedException) th2;
                } else {
                    if (th2 instanceof a) {
                        a aVar = th2;
                        String a10 = aVar.a();
                        C6496s.g(a10, "getCode(...)");
                        unexpectedException = new CodedException(a10, aVar.getMessage(), aVar.getCause());
                    } else {
                        unexpectedException = new UnexpectedException((Throwable) th2);
                    }
                    codedException = unexpectedException;
                }
                d a11 = C4466c.a();
                a11.a("❌ '" + view + "' wasn't able to destroy itself", codedException);
                b().k(view, codedException);
            }
        }
    }

    public final void i(View view) {
        CodedException codedException;
        CodedException codedException2;
        C6496s.h(view, "view");
        C6798l e10 = b().e();
        if (e10 != null) {
            try {
                e10.invoke(view);
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                if (!f.a(view)) {
                    if (th2 instanceof CodedException) {
                        codedException = (CodedException) th2;
                    } else if (th2 instanceof a) {
                        a aVar = th2;
                        String a10 = aVar.a();
                        C6496s.g(a10, "getCode(...)");
                        codedException = new CodedException(a10, aVar.getMessage(), aVar.getCause());
                    } else {
                        codedException = new UnexpectedException((Throwable) th2);
                    }
                    d a11 = C4466c.a();
                    String simpleName = view.getClass().getSimpleName();
                    a11.a("❌ Error occurred when invoking 'onViewDidUpdateProps' on '" + simpleName + "'", codedException);
                    b().k(view, codedException);
                }
            }
        }
    }

    public final void j(m mVar) {
        C6496s.h(mVar, "<set-?>");
        this.f60497a = mVar;
    }

    public final List k(View view, ReadableMap readableMap) {
        CodedException codedException;
        CodedException unexpectedException;
        C4464a aVar;
        C6496s.h(view, "view");
        C6496s.h(readableMap, "propsMap");
        Map f10 = f();
        ArrayList arrayList = new ArrayList();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            a aVar2 = (a) f10.get(nextKey);
            if (aVar2 != null) {
                try {
                    Dynamic dynamic = readableMap.getDynamic(nextKey);
                    u f11 = this.f60497a.g().f();
                    if (f11 != null) {
                        aVar = f11.b();
                    } else {
                        aVar = null;
                    }
                    aVar2.c(dynamic, view, aVar);
                } catch (Throwable th2) {
                    arrayList.add(nextKey);
                    throw th2;
                }
                arrayList.add(nextKey);
            }
        }
        return arrayList;
    }
}
