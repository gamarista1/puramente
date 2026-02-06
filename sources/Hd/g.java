package Hd;

import Md.d;
import expo.modules.av.AVManager;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AVManager f51094a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Integer f51095b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f51096c;

    public /* synthetic */ g(AVManager aVManager, Integer num, d dVar) {
        this.f51094a = aVManager;
        this.f51095b = num;
        this.f51096c = dVar;
    }

    public final void run() {
        this.f51094a.j0(this.f51095b, this.f51096c);
    }
}
