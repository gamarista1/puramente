package androidx.appcompat.widget;

public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Toolbar f11916a;

    public /* synthetic */ i0(Toolbar toolbar) {
        this.f11916a = toolbar;
    }

    public final void run() {
        this.f11916a.invalidateMenu();
    }
}
