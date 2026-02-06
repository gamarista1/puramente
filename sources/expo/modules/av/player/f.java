package expo.modules.av.player;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerData f60282a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f60283b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ double f60284c;

    public /* synthetic */ f(PlayerData playerData, byte[] bArr, double d10) {
        this.f60282a = playerData;
        this.f60283b = bArr;
        this.f60284c = d10;
    }

    public final void run() {
        this.f60282a.I0(this.f60283b, this.f60284c);
    }
}
