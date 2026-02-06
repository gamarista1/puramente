package Ka;

import La.C4361u;
import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C4489a;
import com.google.android.gms.common.api.internal.C4508u;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.internal.fido.zzo;
import com.google.android.gms.tasks.Task;

/* renamed from: Ka.a  reason: case insensitive filesystem */
public class C4317a extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final a.g f51426a;

    /* renamed from: b  reason: collision with root package name */
    private static final a f51427b;

    static {
        a.g gVar = new a.g();
        f51426a = gVar;
        f51427b = new a("Fido.FIDO2_API", new zzo(), gVar);
    }

    public C4317a(Activity activity) {
        super(activity, f51427b, (a.d) a.d.f53921V, (C4508u) new C4489a());
    }

    public Task d(C4361u uVar) {
        return doRead(C4510w.a().b(new C4318b(this, uVar)).e(5407).a());
    }
}
