package io.invertase.firebase.storage;

import android.util.Log;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.storage.D;
import com.google.firebase.storage.o;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;

abstract class p {

    /* renamed from: e  reason: collision with root package name */
    private static final SparseArray f71491e = new SparseArray();

    /* renamed from: a  reason: collision with root package name */
    int f71492a;

    /* renamed from: b  reason: collision with root package name */
    String f71493b;

    /* renamed from: c  reason: collision with root package name */
    o f71494c;

    /* renamed from: d  reason: collision with root package name */
    private D f71495d;

    p(int i10, o oVar, String str) {
        this.f71492a = i10;
        this.f71494c = oVar;
        this.f71493b = str;
        f71491e.put(i10, this);
    }

    static WritableMap a(WritableMap writableMap) {
        writableMap.putString("state", "cancelled");
        return writableMap;
    }

    static WritableMap b(Exception exc, WritableMap writableMap, boolean z10) {
        WritableMap createMap = Arguments.createMap();
        String[] b10 = a.b(exc);
        if (z10 && b10[0].equals("cancelled")) {
            return null;
        }
        createMap.putString("code", b10[0]);
        createMap.putString(MetricTracker.Object.MESSAGE, b10[1]);
        if (exc != null) {
            createMap.putString("nativeErrorMessage", exc.getMessage());
        }
        writableMap.putMap(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, createMap);
        writableMap.putString("state", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        return writableMap;
    }

    private boolean c() {
        Log.d("RNFBStorageTask", "cancelling task for " + this.f71494c.toString());
        if (this.f71495d.isCanceled() || !this.f71495d.K()) {
            return false;
        }
        f();
        return this.f71495d.w();
    }

    static boolean d(int i10) {
        p pVar = (p) f71491e.get(i10);
        if (pVar != null) {
            return pVar.c();
        }
        return false;
    }

    static void e() {
        int size = f71491e.size();
        for (int i10 = 0; i10 < size; i10++) {
            SparseArray sparseArray = f71491e;
            ((p) sparseArray.get(sparseArray.keyAt(i10))).c();
        }
        f71491e.clear();
    }

    private boolean g() {
        Log.d("RNFBStorageTask", "pausing task for " + this.f71494c.toString());
        if (this.f71495d.L() || !this.f71495d.K()) {
            return false;
        }
        return this.f71495d.a0();
    }

    static boolean h(int i10) {
        p pVar = (p) f71491e.get(i10);
        if (pVar != null) {
            return pVar.g();
        }
        return false;
    }

    private boolean i() {
        Log.d("RNFBStorageTask", "resuming task for " + this.f71494c.toString());
        if (this.f71495d.L()) {
            return this.f71495d.d0();
        }
        return false;
    }

    static boolean j(int i10) {
        p pVar = (p) f71491e.get(i10);
        if (pVar != null) {
            return pVar.i();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        f71491e.remove(this.f71492a);
        Log.d("RNFBStorageTask", "destroyed completed task for " + this.f71494c.toString());
    }

    /* access modifiers changed from: package-private */
    public void k(D d10) {
        this.f71495d = d10;
    }
}
