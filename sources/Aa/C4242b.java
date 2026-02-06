package Aa;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C4540w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Aa.b  reason: case insensitive filesystem */
public final /* synthetic */ class C4242b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4540w f50164a;

    public /* synthetic */ C4242b(C4540w wVar) {
        this.f50164a = wVar;
    }

    public final void accept(Object obj, Object obj2) {
        int i10 = C4244d.f50168d;
        ((C4241a) ((C4245e) obj).getService()).a(this.f50164a);
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
