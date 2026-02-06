package Aa;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.common.internal.C4540w;
import com.google.android.gms.common.internal.C4542y;
import com.google.android.gms.common.internal.C4543z;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;

/* renamed from: Aa.d  reason: case insensitive filesystem */
public final class C4244d extends e implements C4542y {

    /* renamed from: a  reason: collision with root package name */
    private static final a.g f50165a;

    /* renamed from: b  reason: collision with root package name */
    private static final a.C0818a f50166b;

    /* renamed from: c  reason: collision with root package name */
    private static final a f50167c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f50168d = 0;

    static {
        a.g gVar = new a.g();
        f50165a = gVar;
        C4243c cVar = new C4243c();
        f50166b = cVar;
        f50167c = new a("ClientTelemetry.API", cVar, gVar);
    }

    public C4244d(Context context, C4543z zVar) {
        super(context, f50167c, (a.d) zVar, e.a.f53922c);
    }

    public final Task a(C4540w wVar) {
        C4510w.a a10 = C4510w.a();
        a10.d(zaf.zaa);
        a10.c(false);
        a10.b(new C4242b(wVar));
        return doBestEffortWrite(a10.a());
    }
}
