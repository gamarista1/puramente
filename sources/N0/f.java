package N0;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import qf.g;
import yf.C6798l;
import yf.p;

public abstract class f {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CancellationSignal f4365a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f4365a = cancellationSignal;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f4365a.cancel();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final C5600w0 c(K k10, CancellationSignal cancellationSignal, p pVar) {
        C5600w0 d10 = C5576k.d(k10, (g) null, (M) null, pVar, 3, (Object) null);
        d10.P0(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new e(d10));
        return d10;
    }

    /* access modifiers changed from: private */
    public static final void d(C5600w0 w0Var) {
        C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
    }
}
