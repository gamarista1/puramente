package Lf;

import Eg.n;
import Of.H;
import Of.O;
import Qf.c;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63865a = a.f63866a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f63866a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Lazy f63867b = C6531o.a(C6534r.PUBLICATION, a.f63864a);

        private a() {
        }

        /* access modifiers changed from: private */
        public static final b a() {
            Class<b> cls = b.class;
            ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
            C6496s.e(load);
            b bVar = (b) C6565s.p0(load);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final b c() {
            return (b) f63867b.getValue();
        }
    }

    O a(n nVar, H h10, Iterable iterable, c cVar, Qf.a aVar, boolean z10);
}
