package m0;

import android.util.LongSparseArray;
import m0.C2176b;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2176b f23589a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f23590b;

    public /* synthetic */ l(C2176b bVar, LongSparseArray longSparseArray) {
        this.f23589a = bVar;
        this.f23590b = longSparseArray;
    }

    public final void run() {
        C2176b.C0379b.e(this.f23589a, this.f23590b);
    }
}
