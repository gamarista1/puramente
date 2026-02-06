package y0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import c1.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.d;
import o1.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r0.C2490f0;
import r0.C2514n0;
import r0.C2517o0;
import r0.C2544x0;
import r0.C2550z0;
import r0.U1;
import r0.h2;
import r0.i2;
import r0.j2;
import x0.C2891d;
import x0.j;
import x0.o;

/* renamed from: y0.c  reason: case insensitive filesystem */
public abstract class C2929c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f28571a = 0;

    public static final C2891d.a a(C2927a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long h10;
        int z10;
        C2927a aVar2 = aVar;
        Resources.Theme theme2 = theme;
        C2928b bVar = C2928b.f28545a;
        TypedArray k10 = aVar2.k(resources, theme2, attributeSet, bVar.F());
        boolean d10 = aVar2.d(k10, "autoMirrored", bVar.a(), false);
        float g10 = aVar2.g(k10, "viewportWidth", bVar.H(), 0.0f);
        float g11 = aVar2.g(k10, "viewportHeight", bVar.G(), 0.0f);
        if (g10 <= 0.0f) {
            throw new XmlPullParserException(k10.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        } else if (g11 > 0.0f) {
            float a10 = aVar2.a(k10, bVar.I(), 0.0f);
            float a11 = aVar2.a(k10, bVar.n(), 0.0f);
            if (k10.hasValue(bVar.D())) {
                TypedValue typedValue = new TypedValue();
                k10.getValue(bVar.D(), typedValue);
                if (typedValue.type == 2) {
                    h10 = C2544x0.f25560b.h();
                } else {
                    ColorStateList e10 = aVar2.e(k10, theme2, "tint", bVar.D());
                    if (e10 != null) {
                        h10 = C2550z0.b(e10.getDefaultColor());
                    } else {
                        h10 = C2544x0.f25560b.h();
                    }
                }
            } else {
                h10 = C2544x0.f25560b.h();
            }
            long j10 = h10;
            int c10 = aVar2.c(k10, bVar.E(), -1);
            if (c10 == -1) {
                z10 = C2490f0.f25500a.z();
            } else if (c10 == 3) {
                z10 = C2490f0.f25500a.B();
            } else if (c10 == 5) {
                z10 = C2490f0.f25500a.z();
            } else if (c10 != 9) {
                switch (c10) {
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        z10 = C2490f0.f25500a.q();
                        break;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        z10 = C2490f0.f25500a.v();
                        break;
                    case 16:
                        z10 = C2490f0.f25500a.t();
                        break;
                    default:
                        z10 = C2490f0.f25500a.z();
                        break;
                }
            } else {
                z10 = C2490f0.f25500a.y();
            }
            int i10 = z10;
            float j11 = h.j(a10 / resources.getDisplayMetrics().density);
            float j12 = h.j(a11 / resources.getDisplayMetrics().density);
            k10.recycle();
            return new C2891d.a((String) null, j11, j12, g10, g11, j10, i10, d10, 1, (DefaultConstructorMarker) null);
        } else {
            throw new XmlPullParserException(k10.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
    }

    private static final int b(int i10, int i11) {
        if (i10 == 0) {
            return i2.f25529a.a();
        }
        if (i10 == 1) {
            return i2.f25529a.b();
        }
        if (i10 != 2) {
            return i11;
        }
        return i2.f25529a.c();
    }

    private static final int c(int i10, int i11) {
        if (i10 == 0) {
            return j2.f25533a.b();
        }
        if (i10 == 1) {
            return j2.f25533a.c();
        }
        if (i10 != 2) {
            return i11;
        }
        return j2.f25533a.a();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() >= 1 || xmlPullParser.getEventType() != 3) {
            return false;
        }
        return true;
    }

    private static final C2514n0 e(d dVar) {
        if (!dVar.i()) {
            return null;
        }
        Shader f10 = dVar.f();
        if (f10 != null) {
            return C2517o0.a(f10);
        }
        return new h2(C2550z0.b(dVar.e()), (DefaultConstructorMarker) null);
    }

    public static final void f(C2927a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C2891d.a aVar2) {
        List b10;
        C2927a aVar3 = aVar;
        C2928b bVar = C2928b.f28545a;
        TypedArray k10 = aVar3.k(resources, theme, attributeSet, bVar.b());
        String i10 = aVar3.i(k10, bVar.c());
        if (i10 == null) {
            i10 = "";
        }
        String str = i10;
        String i11 = aVar3.i(k10, bVar.d());
        if (i11 == null) {
            b10 = o.d();
        } else {
            b10 = j.b(aVar3.f28532c, i11, (ArrayList) null, 2, (Object) null);
        }
        List list = b10;
        k10.recycle();
        C2891d.a.b(aVar2, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, list, 254, (Object) null);
    }

    public static final int g(C2927a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, C2891d.a aVar2, int i10) {
        int eventType = aVar.j().getEventType();
        if (eventType == 2) {
            String name = aVar.j().getName();
            if (name == null) {
                return i10;
            }
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode != 98629247 || !name.equals("group")) {
                        return i10;
                    }
                    h(aVar, resources, theme, attributeSet, aVar2);
                    return i10;
                } else if (!name.equals("path")) {
                    return i10;
                } else {
                    i(aVar, resources, theme, attributeSet, aVar2);
                    return i10;
                }
            } else if (!name.equals("clip-path")) {
                return i10;
            } else {
                f(aVar, resources, theme, attributeSet, aVar2);
                return i10 + 1;
            }
        } else if (eventType != 3 || !C6496s.c("group", aVar.j().getName())) {
            return i10;
        } else {
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar2.g();
            }
            return 0;
        }
    }

    public static final void h(C2927a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C2891d.a aVar2) {
        C2927a aVar3 = aVar;
        C2928b bVar = C2928b.f28545a;
        TypedArray k10 = aVar3.k(resources, theme, attributeSet, bVar.e());
        float g10 = aVar3.g(k10, "rotation", bVar.i(), 0.0f);
        float b10 = aVar3.b(k10, bVar.g(), 0.0f);
        float b11 = aVar3.b(k10, bVar.h(), 0.0f);
        float g11 = aVar3.g(k10, "scaleX", bVar.j(), 1.0f);
        float g12 = aVar3.g(k10, "scaleY", bVar.k(), 1.0f);
        float g13 = aVar3.g(k10, "translateX", bVar.l(), 0.0f);
        float g14 = aVar3.g(k10, "translateY", bVar.m(), 0.0f);
        String i10 = aVar3.i(k10, bVar.f());
        if (i10 == null) {
            i10 = "";
        }
        k10.recycle();
        aVar2.a(i10, g10, b10, b11, g11, g12, g13, g14, o.d());
    }

    public static final void i(C2927a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C2891d.a aVar2) {
        List b10;
        int a10;
        C2927a aVar3 = aVar;
        C2928b bVar = C2928b.f28545a;
        TypedArray k10 = aVar3.k(resources, theme, attributeSet, bVar.o());
        if (k.h(aVar.j(), "pathData")) {
            String i10 = aVar3.i(k10, bVar.r());
            if (i10 == null) {
                i10 = "";
            }
            String str = i10;
            String i11 = aVar3.i(k10, bVar.s());
            if (i11 == null) {
                b10 = o.d();
            } else {
                b10 = j.b(aVar3.f28532c, i11, (ArrayList) null, 2, (Object) null);
            }
            List list = b10;
            d f10 = aVar.f(k10, theme, "fillColor", bVar.q(), 0);
            float g10 = aVar3.g(k10, "fillAlpha", bVar.p(), 1.0f);
            int b11 = b(aVar3.h(k10, "strokeLineCap", bVar.v(), -1), i2.f25529a.a());
            int c10 = c(aVar3.h(k10, "strokeLineJoin", bVar.w(), -1), j2.f25533a.a());
            float g11 = aVar3.g(k10, "strokeMiterLimit", bVar.x(), 1.0f);
            d f11 = aVar.f(k10, theme, "strokeColor", bVar.u(), 0);
            float g12 = aVar3.g(k10, "strokeAlpha", bVar.t(), 1.0f);
            float g13 = aVar3.g(k10, "strokeWidth", bVar.y(), 1.0f);
            float g14 = aVar3.g(k10, "trimPathEnd", bVar.z(), 1.0f);
            float g15 = aVar3.g(k10, "trimPathOffset", bVar.B(), 0.0f);
            float g16 = aVar3.g(k10, "trimPathStart", bVar.C(), 0.0f);
            int h10 = aVar3.h(k10, "fillType", bVar.A(), f28571a);
            k10.recycle();
            C2514n0 e10 = e(f10);
            C2514n0 e11 = e(f11);
            U1.a aVar4 = U1.f25466a;
            if (h10 == 0) {
                a10 = aVar4.b();
            } else {
                a10 = aVar4.a();
            }
            aVar2.c(list, a10, str, e10, g10, e11, g12, g13, b11, c10, g11, g16, g14, g15);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
