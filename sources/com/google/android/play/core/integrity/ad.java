package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.C4741d;
import com.google.android.play.integrity.internal.C4745h;
import com.google.android.play.integrity.internal.I;
import com.google.android.play.integrity.internal.p;
import java.util.ArrayList;

final class ad {

    /* renamed from: a  reason: collision with root package name */
    final C4741d f56470a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C f56471b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56472c;

    ad(Context context, C c10) {
        this.f56472c = context.getPackageName();
        this.f56471b = c10;
        if (!C4745h.a(context)) {
            c10.a("Phonesky is not installed.", new Object[0]);
            this.f56470a = null;
            return;
        }
        this.f56470a = new C4741d(context, c10, "IntegrityService", ae.f56473a, aa.f56461a, (I) null);
    }

    static /* bridge */ /* synthetic */ Bundle a(ad adVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", adVar.f56472c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 2);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        p.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(p.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f56470a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            integrityTokenRequest.a();
            this.f56471b.c("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f56470a.t(new ab(this, taskCompletionSource, decode, cloudProjectNumber, (Parcelable) null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
