package Ug;

import Ug.C5569g0;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Ug.h0  reason: case insensitive filesystem */
public abstract class C5571h0 extends C5567f0 {
    /* access modifiers changed from: protected */
    public abstract Thread P1();

    /* access modifiers changed from: protected */
    public void Q1(long j10, C5569g0.c cVar) {
        P.f65329i.d2(j10, cVar);
    }

    /* access modifiers changed from: protected */
    public final void R1() {
        Thread P12 = P1();
        if (Thread.currentThread() != P12) {
            C5560c.a();
            LockSupport.unpark(P12);
        }
    }
}
