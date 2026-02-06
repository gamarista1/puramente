package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C4536s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    protected final C4498j mLifecycleFragment;

    protected LifecycleCallback(C4498j jVar) {
        this.mLifecycleFragment = jVar;
    }

    @Keep
    private static C4498j getChimeraLifecycleFragmentImpl(C4497i iVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static C4498j getFragment(Activity activity) {
        return getFragment(new C4497i(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity p10 = this.mLifecycleFragment.p();
        C4536s.l(p10);
        return p10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static C4498j getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    protected static C4498j getFragment(C4497i iVar) {
        if (iVar.d()) {
            return z0.E(iVar.b());
        }
        if (iVar.c()) {
            return x0.e(iVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
