package Hd;

import Md.d;
import Nd.b;
import expo.modules.av.AVManager;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AVManager f51090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Integer f51091b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f51092c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f51093d;

    public /* synthetic */ f(AVManager aVManager, Integer num, d dVar, b bVar) {
        this.f51090a = aVManager;
        this.f51091b = num;
        this.f51092c = dVar;
        this.f51093d = bVar;
    }

    public final void run() {
        this.f51090a.h0(this.f51091b, this.f51092c, this.f51093d);
    }
}
