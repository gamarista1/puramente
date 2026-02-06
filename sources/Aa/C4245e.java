package Aa;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C4494f;
import com.google.android.gms.common.api.internal.C4502n;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import com.google.android.gms.common.internal.C4543z;
import com.google.android.gms.internal.base.zaf;
import ya.C5286c;

/* renamed from: Aa.e  reason: case insensitive filesystem */
public final class C4245e extends C4526h {

    /* renamed from: a  reason: collision with root package name */
    private final C4543z f50169a;

    public C4245e(Context context, Looper looper, C4522e eVar, C4543z zVar, C4494f fVar, C4502n nVar) {
        super(context, looper, 270, eVar, fVar, nVar);
        this.f50169a = zVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C4241a) {
            return (C4241a) queryLocalInterface;
        }
        return new C4241a(iBinder);
    }

    public final C5286c[] getApiFeatures() {
        return zaf.zab;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f50169a.b();
    }

    public final int getMinApkVersion() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
