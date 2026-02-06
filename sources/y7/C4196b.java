package y7;

import android.os.Bundle;
import y7.C4214u;

/* renamed from: y7.b  reason: case insensitive filesystem */
public final /* synthetic */ class C4196b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4197c f49717a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C4214u.e f49718b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f49719c;

    public /* synthetic */ C4196b(C4197c cVar, C4214u.e eVar, Bundle bundle) {
        this.f49717a = cVar;
        this.f49718b = eVar;
        this.f49719c = bundle;
    }

    public final void run() {
        C4197c.L(this.f49717a, this.f49718b, this.f49719c);
    }
}
