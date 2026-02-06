package a1;

import Y.A1;
import Y.C1510r0;
import Y.o1;
import Y.p1;
import Y0.h;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.C6498u;
import q0.C2427m;
import r0.c2;
import yf.C6787a;

/* renamed from: a1.b  reason: case insensitive filesystem */
public final class C1541b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    private final c2 f10577a;

    /* renamed from: b  reason: collision with root package name */
    private final float f10578b;

    /* renamed from: c  reason: collision with root package name */
    private final C1510r0 f10579c = u1.d(C2427m.c(C2427m.f25341b.a()), (o1) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final A1 f10580d = p1.e(new a(this));

    /* renamed from: a1.b$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1541b f10581a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1541b bVar) {
            super(0);
            this.f10581a = bVar;
        }

        /* renamed from: a */
        public final Shader invoke() {
            if (this.f10581a.b() != 9205357640488583168L && !C2427m.m(this.f10581a.b())) {
                return this.f10581a.a().b(this.f10581a.b());
            }
            return null;
        }
    }

    public C1541b(c2 c2Var, float f10) {
        this.f10577a = c2Var;
        this.f10578b = f10;
    }

    public final c2 a() {
        return this.f10577a;
    }

    public final long b() {
        return ((C2427m) this.f10579c.getValue()).o();
    }

    public final void c(long j10) {
        this.f10579c.setValue(C2427m.c(j10));
    }

    public void updateDrawState(TextPaint textPaint) {
        h.a(textPaint, this.f10578b);
        textPaint.setShader((Shader) this.f10580d.getValue());
    }
}
