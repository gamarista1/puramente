package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C1587a;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class x0 extends Fragment implements C4498j {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakHashMap f54085d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f54086a = Collections.synchronizedMap(new C1587a());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f54087b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Bundle f54088c;

    public static x0 e(Activity activity) {
        x0 x0Var;
        WeakHashMap weakHashMap = f54085d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (x0Var = (x0) weakReference.get()) != null) {
            return x0Var;
        }
        try {
            x0 x0Var2 = (x0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (x0Var2 == null || x0Var2.isRemoving()) {
                x0Var2 = new x0();
                activity.getFragmentManager().beginTransaction().add(x0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(x0Var2));
            return x0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f54086a.containsKey(str)) {
            this.f54086a.put(str, lifecycleCallback);
            if (this.f54087b > 0) {
                new zzi(Looper.getMainLooper()).post(new w0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f54086a.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f54086a.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f54086a.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f54087b = 1;
        this.f54088c = bundle;
        for (Map.Entry entry : this.f54086a.entrySet()) {
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
        this.f54087b = 5;
        for (LifecycleCallback onDestroy : this.f54086a.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f54087b = 3;
        for (LifecycleCallback onResume : this.f54086a.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f54086a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f54087b = 2;
        for (LifecycleCallback onStart : this.f54086a.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f54087b = 4;
        for (LifecycleCallback onStop : this.f54086a.values()) {
            onStop.onStop();
        }
    }

    public final Activity p() {
        return getActivity();
    }
}
