package ai;

import Ph.a;
import Uh.b;
import bi.d;
import bi.e;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.nio.ByteBuffer;

public abstract class c extends a implements b {

    /* renamed from: i  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f67098i;

    /* renamed from: j  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f67099j;

    /* renamed from: g  reason: collision with root package name */
    protected int f67100g;

    /* renamed from: h  reason: collision with root package name */
    protected int f67101h;

    static {
        j();
    }

    protected c(String str) {
        super(str);
    }

    private static /* synthetic */ void j() {
        Sh.b bVar = new Sh.b("AbstractFullBox.java", c.class);
        f67098i = bVar.f("method-execution", bVar.e("1", "setVersion", "org.mp4parser.support.AbstractFullBox", "int", DiagnosticsEntry.VERSION_KEY, "", "void"), 50);
        f67099j = bVar.f("method-execution", bVar.e("1", "setFlags", "org.mp4parser.support.AbstractFullBox", "int", "flags", "", "void"), 63);
    }

    public int k() {
        if (!this.f67093c) {
            i();
        }
        return this.f67101h;
    }

    public int l() {
        if (!this.f67093c) {
            i();
        }
        return this.f67100g;
    }

    /* access modifiers changed from: protected */
    public final long m(ByteBuffer byteBuffer) {
        this.f67100g = d.l(byteBuffer);
        this.f67101h = d.i(byteBuffer);
        return 4;
    }

    public void n(int i10) {
        e.b().c(Sh.b.c(f67099j, this, this, Rh.a.d(i10)));
        this.f67101h = i10;
    }

    public void o(int i10) {
        e.b().c(Sh.b.c(f67098i, this, this, Rh.a.d(i10)));
        this.f67100g = i10;
    }

    /* access modifiers changed from: protected */
    public final void p(ByteBuffer byteBuffer) {
        e.i(byteBuffer, this.f67100g);
        e.f(byteBuffer, this.f67101h);
    }
}
