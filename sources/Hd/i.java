package Hd;

import Md.d;
import expo.modules.av.AVManager;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AVManager f51101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Integer f51102b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f51103c;

    public /* synthetic */ i(AVManager aVManager, Integer num, d dVar) {
        this.f51101a = aVManager;
        this.f51102b = num;
        this.f51103c = dVar;
    }

    public final void run() {
        this.f51101a.f0(this.f51102b, this.f51103c);
    }
}
