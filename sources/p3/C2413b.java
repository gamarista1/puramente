package p3;

import Ug.S;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

/* renamed from: p3.b  reason: case insensitive filesystem */
public abstract class C2413b {

    /* renamed from: p3.b$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f25312a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ S f25313b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c.a aVar, S s10) {
            super(1);
            this.f25312a = aVar;
            this.f25313b = s10;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                this.f25312a.b(this.f25313b.v());
            } else if (th2 instanceof CancellationException) {
                this.f25312a.c();
            } else {
                this.f25312a.e(th2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public static final g b(S s10, Object obj) {
        C6496s.h(s10, "<this>");
        g a10 = c.a(new C2412a(s10, obj));
        C6496s.g(a10, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a10;
    }

    public static /* synthetic */ g c(S s10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(s10, obj);
    }

    /* access modifiers changed from: private */
    public static final Object d(S s10, Object obj, c.a aVar) {
        C6496s.h(s10, "$this_asListenableFuture");
        C6496s.h(aVar, "completer");
        s10.P0(new a(aVar, s10));
        return obj;
    }
}
