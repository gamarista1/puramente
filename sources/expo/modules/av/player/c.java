package expo.modules.av.player;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerData f60278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f60279b;

    public /* synthetic */ c(PlayerData playerData, boolean z10) {
        this.f60278a = playerData;
        this.f60279b = z10;
    }

    public final void run() {
        this.f60278a.J0(this.f60279b);
    }
}
