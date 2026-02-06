package Pa;

import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.C4681q2;
import com.google.android.gms.measurement.internal.C4692s2;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4681q2 f52134a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f52135b;

    public /* synthetic */ l(C4681q2 q2Var, String str) {
        this.f52134a = q2Var;
        this.f52135b = str;
    }

    public final Object call() {
        return new zzx("internal.appMetadata", new C4692s2(this.f52134a, this.f52135b));
    }
}
