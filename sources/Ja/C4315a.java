package Ja;

import Ka.C4317a;
import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

/* renamed from: Ja.a  reason: case insensitive filesystem */
public abstract class C4315a {

    /* renamed from: a  reason: collision with root package name */
    public static final a.g f51185a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f51186b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzaa f51187c = new zzaa();

    static {
        a.g gVar = new a.g();
        f51185a = gVar;
        f51186b = new a("Fido.U2F_ZERO_PARTY_API", new zzab(), gVar);
    }

    public static C4317a a(Activity activity) {
        return new C4317a(activity);
    }
}
