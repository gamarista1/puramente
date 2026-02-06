package Hd;

import Nd.b;
import expo.modules.av.AVManager;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AVManager f51085a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f51086b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f51087c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Md.d f51088d;

    public /* synthetic */ d(AVManager aVManager, b bVar, b bVar2, Md.d dVar) {
        this.f51085a = aVManager;
        this.f51086b = bVar;
        this.f51087c = bVar2;
        this.f51088d = dVar;
    }

    public final void run() {
        this.f51085a.g0(this.f51086b, this.f51087c, this.f51088d);
    }
}
