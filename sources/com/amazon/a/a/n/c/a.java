package com.amazon.a.a.n.c;

public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private b f37424a;

    public final void a(b bVar) {
        com.amazon.a.a.o.a.a.a((Object) bVar, "workflow");
        com.amazon.a.a.o.a.a.c(this.f37424a, "workflow instance can only be set once");
        this.f37424a = bVar;
    }

    /* access modifiers changed from: protected */
    public final boolean m() {
        if (this.f37424a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        com.amazon.a.a.o.a.a.a(m(), "task is no a workflow child");
        this.f37424a.d();
    }
}
