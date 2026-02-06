package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.C4741d;
import com.google.android.play.integrity.internal.I;
import com.google.android.play.integrity.internal.p;
import java.util.ArrayList;

final class ax {

    /* renamed from: a  reason: collision with root package name */
    final C4741d f56502a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C f56503b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56504c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TaskCompletionSource f56505d;

    ax(Context context, C c10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f56505d = taskCompletionSource;
        this.f56504c = context.getPackageName();
        this.f56503b = c10;
        C4741d dVar = new C4741d(context, c10, "ExpressIntegrityService", ay.f56506a, ap.f56486a, (I) null);
        this.f56502a = dVar;
        dVar.c().post(new aq(this, taskCompletionSource, context));
    }

    static /* bridge */ /* synthetic */ Bundle a(ax axVar, String str, long j10, long j11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f56504c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        ArrayList arrayList = new ArrayList();
        p.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(p.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(ax axVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f56504c);
        bundle.putLong("cloud.prj", j10);
        ArrayList arrayList = new ArrayList();
        p.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(p.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean g(ax axVar) {
        if (!axVar.f56505d.getTask().isSuccessful() || ((Boolean) axVar.f56505d.getTask().getResult()).booleanValue()) {
            return false;
        }
        return true;
    }

    public final Task c(String str, long j10, long j11) {
        this.f56503b.c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f56502a.t(new as(this, taskCompletionSource, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(long j10) {
        this.f56503b.c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f56502a.t(new ar(this, taskCompletionSource, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
