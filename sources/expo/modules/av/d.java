package expo.modules.av;

import android.os.Bundle;
import kotlin.jvm.internal.C6496s;
import yf.p;

public abstract class d {

    static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ p f60243a;

        a(p pVar) {
            C6496s.h(pVar, "function");
            this.f60243a = pVar;
        }

        public final /* synthetic */ void a(String str, Bundle bundle) {
            this.f60243a.invoke(str, bundle);
        }
    }

    public static final class b implements Md.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae.p f60244a;

        b(ae.p pVar) {
            this.f60244a = pVar;
        }

        public void reject(String str, String str2, Throwable th2) {
            ae.p pVar = this.f60244a;
            if (str == null) {
                str = "unknown";
            }
            pVar.reject(str, str2, th2);
        }

        public void resolve(Object obj) {
            this.f60244a.resolve(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final Md.d b(ae.p pVar) {
        return new b(pVar);
    }
}
