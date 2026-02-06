package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class a implements c {
    a() {
    }

    private d o(b bVar) {
        return (d) bVar.c();
    }

    public void a(b bVar, float f10) {
        o(bVar).h(f10);
    }

    public float b(b bVar) {
        return o(bVar).d();
    }

    public void c(b bVar, float f10) {
        bVar.f().setElevation(f10);
    }

    public float d(b bVar) {
        return o(bVar).c();
    }

    public ColorStateList e(b bVar) {
        return o(bVar).b();
    }

    public float f(b bVar) {
        return b(bVar) * 2.0f;
    }

    public void g(b bVar) {
        n(bVar, d(bVar));
    }

    public void h(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.a(new d(colorStateList, f10));
        View f13 = bVar.f();
        f13.setClipToOutline(true);
        f13.setElevation(f11);
        n(bVar, f12);
    }

    public float i(b bVar) {
        return bVar.f().getElevation();
    }

    public void j(b bVar) {
        n(bVar, d(bVar));
    }

    public void k() {
    }

    public float l(b bVar) {
        return b(bVar) * 2.0f;
    }

    public void m(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    public void n(b bVar, float f10) {
        o(bVar).g(f10, bVar.b(), bVar.e());
        p(bVar);
    }

    public void p(b bVar) {
        if (!bVar.b()) {
            bVar.d(0, 0, 0, 0);
            return;
        }
        float d10 = d(bVar);
        float b10 = b(bVar);
        int ceil = (int) Math.ceil((double) e.a(d10, b10, bVar.e()));
        int ceil2 = (int) Math.ceil((double) e.b(d10, b10, bVar.e()));
        bVar.d(ceil, ceil2, ceil, ceil2);
    }
}
