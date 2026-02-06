package Xg;

import Yg.d;
import qf.C6658d;

public final class E extends d {

    /* renamed from: a  reason: collision with root package name */
    public long f66432a = -1;

    /* renamed from: b  reason: collision with root package name */
    public C6658d f66433b;

    /* renamed from: c */
    public boolean a(C c10) {
        if (this.f66432a >= 0) {
            return false;
        }
        this.f66432a = c10.Y();
        return true;
    }

    /* renamed from: d */
    public C6658d[] b(C c10) {
        long j10 = this.f66432a;
        this.f66432a = -1;
        this.f66433b = null;
        return c10.X(j10);
    }
}
