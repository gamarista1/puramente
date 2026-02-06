package Y;

import kotlin.jvm.internal.C6498u;
import yf.C6798l;

/* renamed from: Y.i0  reason: case insensitive filesystem */
public final class C1493i0 extends C6498u implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C6798l f10020a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1493i0(C6798l lVar) {
        super(1);
        this.f10020a = lVar;
    }

    public final Object a(long j10) {
        return this.f10020a.invoke(Long.valueOf(j10 / 1000000));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
