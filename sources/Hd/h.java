package Hd;

import Md.d;
import Nd.b;
import expo.modules.av.AVManager;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AVManager f51097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Integer f51098b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f51099c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f51100d;

    public /* synthetic */ h(AVManager aVManager, Integer num, d dVar, b bVar) {
        this.f51097a = aVManager;
        this.f51098b = num;
        this.f51099c = dVar;
        this.f51100d = bVar;
    }

    public final void run() {
        this.f51097a.i0(this.f51098b, this.f51099c, this.f51100d);
    }
}
