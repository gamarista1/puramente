package d6;

/* renamed from: d6.b  reason: case insensitive filesystem */
public abstract class C3476b implements e {
    public void c(C3477c cVar) {
        boolean c10 = cVar.c();
        try {
            f(cVar);
        } finally {
            if (c10) {
                cVar.close();
            }
        }
    }

    public void d(C3477c cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void e(C3477c cVar);

    /* access modifiers changed from: protected */
    public abstract void f(C3477c cVar);

    public void a(C3477c cVar) {
    }

    public void b(C3477c cVar) {
    }
}
