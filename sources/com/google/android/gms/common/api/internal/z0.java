package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C1587a;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class z0 extends C1769q implements C4498j {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakHashMap f54094d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f54095a = Collections.synchronizedMap(new C1587a());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f54096b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Bundle f54097c;

    public static z0 E(C1773v vVar) {
        z0 z0Var;
        WeakHashMap weakHashMap = f54094d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(vVar);
        if (weakReference != null && (z0Var = (z0) weakReference.get()) != null) {
            return z0Var;
        }
        try {
            z0 z0Var2 = (z0) vVar.getSupportFragmentManager().l0("SupportLifecycleFragmentImpl");
            if (z0Var2 == null || z0Var2.isRemoving()) {
                z0Var2 = new z0();
                vVar.getSupportFragmentManager().p().e(z0Var2, "SupportLifecycleFragmentImpl").i();
            }
            weakHashMap.put(vVar, new WeakReference(z0Var2));
            return z0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f54095a.containsKey(str)) {
            this.f54095a.put(str, lifecycleCallback);
            if (this.f54096b > 0) {
                new zzi(Looper.getMainLooper()).post(new y0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f54095a.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f54095a.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f54095a.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f54096b = 1;
        this.f54097c = bundle;
        for (Map.Entry entry : this.f54095a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f54096b = 5;
        for (LifecycleCallback onDestroy : this.f54095a.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f54096b = 3;
        for (LifecycleCallback onResume : this.f54095a.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f54095a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f54096b = 2;
        for (LifecycleCallback onStart : this.f54095a.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f54096b = 4;
        for (LifecycleCallback onStop : this.f54095a.values()) {
            onStop.onStop();
        }
    }

    public final /* synthetic */ Activity p() {
        return getActivity();
    }
}
