package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.E;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.s;
import androidx.work.v;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18902a = s.i("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            s.e().a(f18902a, "Requesting diagnostics");
            try {
                E.c(context).a(v.e(DiagnosticsWorker.class));
            } catch (IllegalStateException e10) {
                s.e().d(f18902a, "WorkManager is not initialized", e10);
            }
        }
    }
}
