package com.google.android.gms.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzz;

/* renamed from: com.google.android.gms.location.k  reason: case insensitive filesystem */
public abstract class C4554k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f54397a;

    /* renamed from: b  reason: collision with root package name */
    public static final C4548e f54398b = new zzz();

    /* renamed from: c  reason: collision with root package name */
    public static final C4550g f54399c = new zzaf();

    /* renamed from: d  reason: collision with root package name */
    public static final C4559p f54400d = new zzbi();

    /* renamed from: e  reason: collision with root package name */
    private static final a.g f54401e;

    /* renamed from: f  reason: collision with root package name */
    private static final a.C0818a f54402f;

    static {
        a.g gVar = new a.g();
        f54401e = gVar;
        G g10 = new G();
        f54402f = g10;
        f54397a = new a("LocationServices.API", g10, gVar);
    }

    public static zzaz a(f fVar) {
        boolean z10;
        boolean z11 = false;
        if (fVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "GoogleApiClient parameter is required.");
        zzaz zzaz = (zzaz) fVar.d(f54401e);
        if (zzaz != null) {
            z11 = true;
        }
        C4536s.p(z11, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzaz;
    }
}
