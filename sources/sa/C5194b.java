package sa;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.tasks.Task;

/* renamed from: sa.b  reason: case insensitive filesystem */
public abstract class C5194b extends e {
    private static final a.g zza;
    private static final a.C0818a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        C5195c cVar = new C5195c();
        zzb = cVar;
        zzc = new a("SmsRetriever.API", cVar, gVar);
    }

    public C5194b(Activity activity) {
        super(activity, zzc, (a.d) a.d.f53921V, e.a.f53922c);
    }

    public abstract Task startSmsRetriever();

    public C5194b(Context context) {
        super(context, zzc, (a.d) a.d.f53921V, e.a.f53922c);
    }
}
