package bh;

import Ug.O;

public final class k extends C5793h {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f67309c;

    public k(Runnable runnable, long j10, C5794i iVar) {
        super(j10, iVar);
        this.f67309c = runnable;
    }

    public void run() {
        try {
            this.f67309c.run();
        } finally {
            this.f67307b.a();
        }
    }

    public String toString() {
        return "Task[" + O.a(this.f67309c) + '@' + O.b(this.f67309c) + ", " + this.f67306a + ", " + this.f67307b + ']';
    }
}
