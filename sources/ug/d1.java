package Ug;

import Zg.C;
import qf.C6658d;

final class d1 extends C implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final long f65357e;

    public d1(long j10, C6658d dVar) {
        super(dVar.getContext(), dVar);
        this.f65357e = j10;
    }

    public String D0() {
        return super.D0() + "(timeMillis=" + this.f65357e + ')';
    }

    public void run() {
        J(e1.a(this.f65357e, V.b(getContext()), this));
    }
}
