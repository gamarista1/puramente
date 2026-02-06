package J0;

import androidx.compose.ui.graphics.c;
import androidx.compose.ui.graphics.f;

/* renamed from: J0.z  reason: case insensitive filesystem */
final class C1259z {

    /* renamed from: a  reason: collision with root package name */
    private float f3945a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    private float f3946b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private float f3947c;

    /* renamed from: d  reason: collision with root package name */
    private float f3948d;

    /* renamed from: e  reason: collision with root package name */
    private float f3949e;

    /* renamed from: f  reason: collision with root package name */
    private float f3950f;

    /* renamed from: g  reason: collision with root package name */
    private float f3951g;

    /* renamed from: h  reason: collision with root package name */
    private float f3952h = 8.0f;

    /* renamed from: i  reason: collision with root package name */
    private long f3953i = f.f13431b.a();

    public final void a(C1259z zVar) {
        this.f3945a = zVar.f3945a;
        this.f3946b = zVar.f3946b;
        this.f3947c = zVar.f3947c;
        this.f3948d = zVar.f3948d;
        this.f3949e = zVar.f3949e;
        this.f3950f = zVar.f3950f;
        this.f3951g = zVar.f3951g;
        this.f3952h = zVar.f3952h;
        this.f3953i = zVar.f3953i;
    }

    public final void b(c cVar) {
        this.f3945a = cVar.A();
        this.f3946b = cVar.J();
        this.f3947c = cVar.H();
        this.f3948d = cVar.F();
        this.f3949e = cVar.I();
        this.f3950f = cVar.r();
        this.f3951g = cVar.t();
        this.f3952h = cVar.w();
        this.f3953i = cVar.B0();
    }

    public final boolean c(C1259z zVar) {
        if (this.f3945a == zVar.f3945a && this.f3946b == zVar.f3946b && this.f3947c == zVar.f3947c && this.f3948d == zVar.f3948d && this.f3949e == zVar.f3949e && this.f3950f == zVar.f3950f && this.f3951g == zVar.f3951g && this.f3952h == zVar.f3952h && f.e(this.f3953i, zVar.f3953i)) {
            return true;
        }
        return false;
    }
}
