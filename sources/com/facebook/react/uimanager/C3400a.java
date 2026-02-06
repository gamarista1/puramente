package com.facebook.react.uimanager;

import Ef.m;
import M7.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import f8.C3519a;
import h8.C3582a;
import h8.C3583b;
import h8.d;
import h8.e;
import h8.h;
import j8.c;
import j8.f;
import j8.g;
import j8.i;
import j8.j;
import j8.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: com.facebook.react.uimanager.a  reason: case insensitive filesystem */
public final class C3400a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3400a f41563a = new C3400a();

    private C3400a() {
    }

    public static final void A(View view, float f10) {
        C6496s.h(view, "view");
        if (C3519a.c(view) == 2) {
            f41563a.g(view).i(G.f41415a.b(f10));
        }
    }

    public static final void a(View view, Canvas canvas) {
        RectF rectF;
        float f10;
        float f11;
        float f12;
        C6496s.h(view, "view");
        C6496s.h(canvas, "canvas");
        if (b.k()) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            C3400a aVar = f41563a;
            e f13 = aVar.f(view);
            RectF rectF2 = new RectF();
            c j10 = f13.j();
            if (j10 != null) {
                int layoutDirection = f13.getLayoutDirection();
                Context context = view.getContext();
                C6496s.g(context, "getContext(...)");
                rectF = j10.a(layoutDirection, context);
            } else {
                rectF = null;
            }
            float f14 = (float) f13.getBounds().left;
            float f15 = 0.0f;
            if (rectF != null) {
                f10 = G.f41415a.b(rectF.left);
            } else {
                f10 = 0.0f;
            }
            rectF2.left = f14 + f10;
            float f16 = (float) f13.getBounds().top;
            if (rectF != null) {
                f11 = G.f41415a.b(rectF.top);
            } else {
                f11 = 0.0f;
            }
            rectF2.top = f16 + f11;
            float f17 = (float) f13.getBounds().right;
            if (rectF != null) {
                f12 = G.f41415a.b(rectF.right);
            } else {
                f12 = 0.0f;
            }
            rectF2.right = f17 - f12;
            float f18 = (float) f13.getBounds().bottom;
            if (rectF != null) {
                f15 = G.f41415a.b(rectF.bottom);
            }
            rectF2.bottom = f18 - f15;
            j8.e k10 = f13.k();
            if (k10 == null || !k10.c()) {
                rectF2.offset((float) rect.left, (float) rect.top);
                canvas.clipRect(rectF2);
                return;
            }
            Path b10 = aVar.b(view, f13, rectF2, rectF);
            b10.offset((float) rect.left, (float) rect.top);
            canvas.clipPath(b10);
            return;
        }
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        d k11 = f41563a.k(view);
        if (k11 == null) {
            canvas.clipRect(rect2);
            return;
        }
        Path p10 = k11.p();
        if (p10 != null) {
            p10.offset((float) rect2.left, (float) rect2.top);
            canvas.clipPath(p10);
            return;
        }
        RectF q10 = k11.q();
        C6496s.g(q10, "getPaddingBoxRect(...)");
        q10.offset((float) rect2.left, (float) rect2.top);
        canvas.clipRect(q10);
    }

    private final Path b(View view, e eVar, RectF rectF, RectF rectF2) {
        i iVar;
        Float f10;
        Float f11;
        Float f12;
        Float f13;
        Float f14;
        Float f15;
        Float f16;
        Float f17;
        Float f18;
        Float f19;
        Float f20;
        Float f21;
        Float f22;
        Float f23;
        Float f24;
        j a10;
        j a11;
        j b10;
        j b11;
        j d10;
        j d11;
        j c10;
        j c11;
        j8.e k10 = eVar.k();
        Float f25 = null;
        if (k10 != null) {
            int layoutDirection = eVar.getLayoutDirection();
            Context context = view.getContext();
            C6496s.g(context, "getContext(...)");
            iVar = k10.d(layoutDirection, context, G.f((float) eVar.getBounds().width()), G.f((float) eVar.getBounds().height()));
        } else {
            iVar = null;
        }
        Path path = new Path();
        if (iVar == null || (c11 = iVar.c()) == null) {
            f10 = null;
        } else {
            f10 = Float.valueOf(G.f41415a.b(c11.a()));
        }
        if (rectF2 != null) {
            f11 = Float.valueOf(G.f41415a.b(rectF2.left));
        } else {
            f11 = null;
        }
        float m10 = m(f10, f11);
        if (iVar == null || (c10 = iVar.c()) == null) {
            f12 = null;
        } else {
            f12 = Float.valueOf(G.f41415a.b(c10.b()));
        }
        if (rectF2 != null) {
            f13 = Float.valueOf(G.f41415a.b(rectF2.top));
        } else {
            f13 = null;
        }
        float m11 = m(f12, f13);
        if (iVar == null || (d11 = iVar.d()) == null) {
            f14 = null;
        } else {
            f14 = Float.valueOf(G.f41415a.b(d11.a()));
        }
        if (rectF2 != null) {
            f15 = Float.valueOf(G.f41415a.b(rectF2.right));
        } else {
            f15 = null;
        }
        float m12 = m(f14, f15);
        if (iVar == null || (d10 = iVar.d()) == null) {
            f16 = null;
        } else {
            f16 = Float.valueOf(G.f41415a.b(d10.b()));
        }
        if (rectF2 != null) {
            f17 = Float.valueOf(G.f41415a.b(rectF2.top));
        } else {
            f17 = null;
        }
        float m13 = m(f16, f17);
        if (iVar == null || (b11 = iVar.b()) == null) {
            f18 = null;
        } else {
            f18 = Float.valueOf(G.f41415a.b(b11.a()));
        }
        if (rectF2 != null) {
            f19 = Float.valueOf(G.f41415a.b(rectF2.right));
        } else {
            f19 = null;
        }
        float m14 = m(f18, f19);
        if (iVar == null || (b10 = iVar.b()) == null) {
            f20 = null;
        } else {
            f20 = Float.valueOf(G.f41415a.b(b10.b()));
        }
        if (rectF2 != null) {
            f21 = Float.valueOf(G.f41415a.b(rectF2.bottom));
        } else {
            f21 = null;
        }
        float m15 = m(f20, f21);
        if (iVar == null || (a11 = iVar.a()) == null) {
            f22 = null;
        } else {
            f22 = Float.valueOf(G.f41415a.b(a11.a()));
        }
        if (rectF2 != null) {
            f23 = Float.valueOf(G.f41415a.b(rectF2.left));
        } else {
            f23 = null;
        }
        float m16 = m(f22, f23);
        if (iVar == null || (a10 = iVar.a()) == null) {
            f24 = null;
        } else {
            f24 = Float.valueOf(G.f41415a.b(a10.b()));
        }
        if (rectF2 != null) {
            f25 = Float.valueOf(G.f41415a.b(rectF2.bottom));
        }
        path.addRoundRect(rectF, new float[]{m10, m11, m12, m13, m14, m15, m16, m(f24, f25)}, Path.Direction.CW);
        return path;
    }

    private final C3582a c(View view) {
        e f10 = f(view);
        C3582a h10 = f10.h();
        if (h10 != null) {
            return h10;
        }
        Context context = view.getContext();
        C6496s.g(context, "getContext(...)");
        C3582a aVar = new C3582a(context, f10.k(), f10.j());
        view.setBackground(f10.v(aVar));
        return aVar;
    }

    private final C3583b d(View view) {
        e f10 = f(view);
        C3583b i10 = f10.i();
        if (i10 != null) {
            return i10;
        }
        Context context = view.getContext();
        C6496s.g(context, "getContext(...)");
        j8.e k10 = f10.k();
        C3583b bVar = new C3583b(context, new C3411f0(0.0f), k10, f10.j(), f.SOLID);
        view.setBackground(f10.w(bVar));
        return bVar;
    }

    private final d e(View view) {
        e f10 = f(view);
        d l10 = f10.l();
        if (l10 != null) {
            return l10;
        }
        d dVar = new d(view.getContext());
        view.setBackground(f10.x(dVar));
        return dVar;
    }

    private final e f(View view) {
        if (view.getBackground() instanceof e) {
            Drawable background = view.getBackground();
            C6496s.f(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (e) background;
        }
        Context context = view.getContext();
        C6496s.g(context, "getContext(...)");
        e eVar = new e(context, view.getBackground(), (LayerDrawable) null, (d) null, (C3582a) null, (C3583b) null, (Drawable) null, (LayerDrawable) null, (h) null, 508, (DefaultConstructorMarker) null);
        view.setBackground(eVar);
        return eVar;
    }

    private final h g(View view) {
        j8.e h10;
        e f10 = f(view);
        h q10 = f10.q();
        if (q10 != null) {
            return q10;
        }
        if (b.k()) {
            h10 = f10.k();
        } else {
            h10 = e(view).h();
        }
        j8.e eVar = h10;
        Context context = view.getContext();
        C6496s.g(context, "getContext(...)");
        h hVar = new h(context, eVar, -16777216, 0.0f, n.SOLID, 0.0f);
        view.setBackground(f10.C(hVar));
        return hVar;
    }

    private final C3582a h(View view) {
        e l10 = l(view);
        if (l10 != null) {
            return l10.h();
        }
        return null;
    }

    public static final Integer i(View view) {
        C6496s.h(view, "view");
        if (b.k()) {
            C3582a h10 = f41563a.h(view);
            if (h10 != null) {
                return Integer.valueOf(h10.b());
            }
            return null;
        }
        d k10 = f41563a.k(view);
        if (k10 != null) {
            return Integer.valueOf(k10.k());
        }
        return null;
    }

    public static final C3430x j(View view, j8.d dVar) {
        j8.e h10;
        j8.e k10;
        C6496s.h(view, "view");
        C6496s.h(dVar, "corner");
        if (b.k()) {
            e l10 = f41563a.l(view);
            if (l10 == null || (k10 = l10.k()) == null) {
                return null;
            }
            return k10.b(dVar);
        }
        d k11 = f41563a.k(view);
        if (k11 == null || (h10 = k11.h()) == null) {
            return null;
        }
        return h10.b(dVar);
    }

    private final d k(View view) {
        e l10 = l(view);
        if (l10 != null) {
            return l10.l();
        }
        return null;
    }

    private final e l(View view) {
        Drawable background = view.getBackground();
        if (background instanceof e) {
            return (e) background;
        }
        return null;
    }

    private final float m(Float f10, Float f11) {
        float f12;
        float f13;
        if (f10 != null) {
            f12 = f10.floatValue();
        } else {
            f12 = 0.0f;
        }
        if (f11 != null) {
            f13 = f11.floatValue();
        } else {
            f13 = 0.0f;
        }
        return m.c(f12 - f13, 0.0f);
    }

    public static final void n(View view) {
        C6496s.h(view, "view");
        if (view.getBackground() instanceof e) {
            Drawable background = view.getBackground();
            C6496s.f(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((e) background).o());
        }
    }

    public static final void o(View view, Integer num) {
        C6496s.h(view, "view");
        if ((num != null && num.intValue() != 0) || (view.getBackground() instanceof e)) {
            int i10 = 0;
            if (b.k()) {
                C3582a c10 = f41563a.c(view);
                if (num != null) {
                    i10 = num.intValue();
                }
                c10.e(i10);
                return;
            }
            d e10 = f41563a.e(view);
            if (num != null) {
                i10 = num.intValue();
            }
            e10.C(i10);
        }
    }

    public static final void p(View view, List list) {
        C6496s.h(view, "view");
        if (b.k()) {
            f41563a.c(view).f(list);
        } else {
            f41563a.e(view).v(list);
        }
    }

    public static final void q(View view, j8.m mVar, Integer num) {
        C6496s.h(view, "view");
        C6496s.h(mVar, "edge");
        if (b.k()) {
            f41563a.d(view).o(mVar, num);
        } else {
            f41563a.e(view).x(mVar.c(), num);
        }
    }

    public static final void r(View view, j8.d dVar, C3430x xVar) {
        LayerDrawable n10;
        LayerDrawable p10;
        View view2 = view;
        j8.d dVar2 = dVar;
        C3430x xVar2 = xVar;
        C6496s.h(view2, "view");
        C6496s.h(dVar2, "corner");
        C3400a aVar = f41563a;
        e f10 = aVar.f(view2);
        j8.e k10 = f10.k();
        if (k10 == null) {
            k10 = new j8.e((C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, 8191, (DefaultConstructorMarker) null);
        }
        f10.t(k10);
        j8.e k11 = f10.k();
        if (k11 != null) {
            k11.e(dVar2, xVar2);
        }
        if (b.k()) {
            if (view2 instanceof ImageView) {
                aVar.c(view2);
            }
            C3582a h10 = f10.h();
            if (h10 != null) {
                h10.h(f10.k());
            }
            C3583b i10 = f10.i();
            if (i10 != null) {
                i10.q(f10.k());
            }
            C3582a h11 = f10.h();
            if (h11 != null) {
                h11.invalidateSelf();
            }
            C3583b i11 = f10.i();
            if (i11 != null) {
                i11.invalidateSelf();
            }
        } else {
            aVar.e(view2).z(dVar2, xVar2);
        }
        if (Build.VERSION.SDK_INT >= 28 && (p10 = f10.p()) != null) {
            int numberOfLayers = p10.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = p10.getDrawable(i12);
                if (drawable instanceof h8.i) {
                    h8.i iVar = (h8.i) drawable;
                    j8.e c10 = iVar.c();
                    if (c10 == null) {
                        c10 = new j8.e((C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, 8191, (DefaultConstructorMarker) null);
                    }
                    iVar.d(c10);
                    j8.e c11 = iVar.c();
                    if (c11 != null) {
                        c11.e(dVar2, xVar2);
                    }
                    iVar.invalidateSelf();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && (n10 = f10.n()) != null) {
            int numberOfLayers2 = n10.getNumberOfLayers();
            for (int i13 = 0; i13 < numberOfLayers2; i13++) {
                Drawable drawable2 = n10.getDrawable(i13);
                if (drawable2 instanceof h8.f) {
                    h8.f fVar = (h8.f) drawable2;
                    j8.e c12 = fVar.c();
                    if (c12 == null) {
                        c12 = new j8.e((C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, 8191, (DefaultConstructorMarker) null);
                    }
                    fVar.f(c12);
                    j8.e c13 = fVar.c();
                    if (c13 != null) {
                        c13.e(dVar2, xVar2);
                    }
                    fVar.invalidateSelf();
                }
            }
        }
        h q10 = f10.q();
        if (q10 != null) {
            q10.e(f10.k());
        }
        f10.invalidateSelf();
    }

    public static final void s(View view, f fVar) {
        C6496s.h(view, "view");
        if (b.k()) {
            f41563a.d(view).r(fVar);
        } else {
            f41563a.e(view).A(fVar);
        }
    }

    public static final void t(View view, j8.m mVar, Float f10) {
        LayerDrawable n10;
        C6496s.h(view, "view");
        C6496s.h(mVar, "edge");
        C3400a aVar = f41563a;
        e f11 = aVar.f(view);
        c j10 = f11.j();
        if (j10 == null) {
            j10 = new c();
        }
        f11.s(j10);
        c j11 = f11.j();
        if (j11 != null) {
            j11.b(mVar, f10);
        }
        float f12 = Float.NaN;
        if (b.k()) {
            C3583b d10 = aVar.d(view);
            int c10 = mVar.c();
            if (f10 != null) {
                f12 = G.f41415a.b(f10.floatValue());
            }
            d10.s(c10, f12);
            C3582a h10 = f11.h();
            if (h10 != null) {
                h10.g(f11.j());
            }
            C3583b i10 = f11.i();
            if (i10 != null) {
                i10.p(f11.j());
            }
            C3582a h11 = f11.h();
            if (h11 != null) {
                h11.invalidateSelf();
            }
            C3583b i11 = f11.i();
            if (i11 != null) {
                i11.invalidateSelf();
            }
        } else {
            d e10 = aVar.e(view);
            int c11 = mVar.c();
            if (f10 != null) {
                f12 = G.f41415a.b(f10.floatValue());
            }
            e10.B(c11, f12);
        }
        c j12 = f11.j();
        if (j12 == null) {
            j12 = new c();
        }
        f11.s(j12);
        c j13 = f11.j();
        if (j13 != null) {
            j13.b(mVar, f10);
        }
        if (Build.VERSION.SDK_INT >= 29 && (n10 = f11.n()) != null) {
            int numberOfLayers = n10.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = n10.getDrawable(i12);
                C6496s.f(drawable, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable");
                h8.f fVar = (h8.f) drawable;
                fVar.e(f11.j());
                fVar.invalidateSelf();
            }
        }
    }

    public static final void u(View view, ReadableArray readableArray) {
        C6496s.h(view, "view");
        if (readableArray == null) {
            v(view, C6565s.n());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        int i10 = 0;
        while (i10 < size) {
            g.a aVar = g.f44881g;
            ReadableMap map = readableArray.getMap(i10);
            Context context = view.getContext();
            C6496s.g(context, "getContext(...)");
            g a10 = aVar.a(map, context);
            if (a10 != null) {
                arrayList.add(a10);
                i10++;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        v(view, arrayList);
    }

    public static final void v(View view, List list) {
        int i10;
        float f10;
        float f11;
        boolean z10;
        LayerDrawable layerDrawable;
        C6496s.h(view, "view");
        C6496s.h(list, "shadows");
        if (C3519a.c(view) == 2) {
            e f12 = f41563a.f(view);
            c j10 = f12.j();
            j8.e k10 = f12.k();
            LayerDrawable layerDrawable2 = null;
            LayerDrawable layerDrawable3 = null;
            for (g gVar : C6565s.U(list)) {
                float d10 = gVar.d();
                float e10 = gVar.e();
                Integer b10 = gVar.b();
                if (b10 != null) {
                    i10 = b10.intValue();
                } else {
                    i10 = -16777216;
                }
                int i11 = i10;
                Float a10 = gVar.a();
                if (a10 != null) {
                    f10 = a10.floatValue();
                } else {
                    f10 = 0.0f;
                }
                Float f13 = gVar.f();
                if (f13 != null) {
                    f11 = f13.floatValue();
                } else {
                    f11 = 0.0f;
                }
                Boolean c10 = gVar.c();
                if (c10 != null) {
                    z10 = c10.booleanValue();
                } else {
                    z10 = false;
                }
                if (z10 && Build.VERSION.SDK_INT >= 29) {
                    if (layerDrawable2 == null) {
                        layerDrawable = new LayerDrawable(new Drawable[0]);
                    } else {
                        layerDrawable = layerDrawable2;
                    }
                    Context context = view.getContext();
                    C6496s.g(context, "getContext(...)");
                    layerDrawable.addLayer(new h8.f(context, i11, d10, e10, f10, f11, j10, k10));
                    layerDrawable2 = layerDrawable;
                } else if (!z10 && Build.VERSION.SDK_INT >= 28) {
                    if (layerDrawable3 == null) {
                        layerDrawable3 = new LayerDrawable(new Drawable[0]);
                    }
                    Context context2 = view.getContext();
                    C6496s.g(context2, "getContext(...)");
                    layerDrawable3.addLayer(new h8.i(context2, i11, d10, e10, f10, f11, k10));
                }
            }
            C3400a aVar = f41563a;
            view.setBackground(aVar.f(view).B(layerDrawable3));
            view.setBackground(aVar.f(view).z(layerDrawable2));
        }
    }

    public static final void w(View view, Drawable drawable) {
        C6496s.h(view, "view");
        if (b.k()) {
            f41563a.f(view).y(drawable);
        } else {
            view.setBackground(f41563a.f(view).y(drawable));
        }
    }

    public static final void x(View view, Integer num) {
        C6496s.h(view, "view");
        if (C3519a.c(view) == 2) {
            h g10 = f41563a.g(view);
            if (num != null) {
                g10.f(num.intValue());
            }
        }
    }

    public static final void y(View view, float f10) {
        C6496s.h(view, "view");
        if (C3519a.c(view) == 2) {
            f41563a.g(view).g(G.f41415a.b(f10));
        }
    }

    public static final void z(View view, n nVar) {
        C6496s.h(view, "view");
        if (C3519a.c(view) == 2) {
            h g10 = f41563a.g(view);
            if (nVar != null) {
                g10.h(nVar);
            }
        }
    }
}
