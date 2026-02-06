package Ug;

/* renamed from: Ug.c0  reason: case insensitive filesystem */
final class C5561c0 implements C5580m {

    /* renamed from: a  reason: collision with root package name */
    private final C5559b0 f65353a;

    public C5561c0(C5559b0 b0Var) {
        this.f65353a = b0Var;
    }

    public void b(Throwable th2) {
        this.f65353a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f65353a + ']';
    }
}
