package androidx.work;

import com.google.common.util.concurrent.g;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public final class q extends C6498u implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f19025a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(g gVar) {
        super(1);
        this.f19025a = gVar;
    }

    public final void a(Throwable th2) {
        this.f19025a.cancel(false);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return C6514M.f71813a;
    }
}
