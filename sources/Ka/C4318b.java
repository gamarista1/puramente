package Ka;

import La.C4361u;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Ka.b  reason: case insensitive filesystem */
public final /* synthetic */ class C4318b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4317a f51428a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C4361u f51429b;

    public /* synthetic */ C4318b(C4317a aVar, C4361u uVar) {
        this.f51428a = aVar;
        this.f51429b = uVar;
    }

    public final void accept(Object obj, Object obj2) {
        C4317a aVar = this.f51428a;
        C4361u uVar = this.f51429b;
        ((zzs) ((zzp) obj).getService()).zzc(new C4319c(aVar, (TaskCompletionSource) obj2), uVar);
    }
}
