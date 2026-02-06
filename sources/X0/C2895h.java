package x0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: x0.h  reason: case insensitive filesystem */
public abstract class C2895h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f28092a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f28093b;

    /* renamed from: x0.h$a */
    public static final class a extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28094c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28095d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28096e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f28097f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f28098g;

        /* renamed from: h  reason: collision with root package name */
        private final float f28099h;

        /* renamed from: i  reason: collision with root package name */
        private final float f28100i;

        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28094c = f10;
            this.f28095d = f11;
            this.f28096e = f12;
            this.f28097f = z10;
            this.f28098g = z11;
            this.f28099h = f13;
            this.f28100i = f14;
        }

        public final float c() {
            return this.f28099h;
        }

        public final float d() {
            return this.f28100i;
        }

        public final float e() {
            return this.f28094c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.f28094c, aVar.f28094c) == 0 && Float.compare(this.f28095d, aVar.f28095d) == 0 && Float.compare(this.f28096e, aVar.f28096e) == 0 && this.f28097f == aVar.f28097f && this.f28098g == aVar.f28098g && Float.compare(this.f28099h, aVar.f28099h) == 0 && Float.compare(this.f28100i, aVar.f28100i) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f28096e;
        }

        public final float g() {
            return this.f28095d;
        }

        public final boolean h() {
            return this.f28097f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f28094c) * 31) + Float.hashCode(this.f28095d)) * 31) + Float.hashCode(this.f28096e)) * 31) + Boolean.hashCode(this.f28097f)) * 31) + Boolean.hashCode(this.f28098g)) * 31) + Float.hashCode(this.f28099h)) * 31) + Float.hashCode(this.f28100i);
        }

        public final boolean i() {
            return this.f28098g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f28094c + ", verticalEllipseRadius=" + this.f28095d + ", theta=" + this.f28096e + ", isMoreThanHalf=" + this.f28097f + ", isPositiveArc=" + this.f28098g + ", arcStartX=" + this.f28099h + ", arcStartY=" + this.f28100i + ')';
        }
    }

    /* renamed from: x0.h$b */
    public static final class b extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        public static final b f28101c = new b();

        private b() {
            super(false, false, 3, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: x0.h$c */
    public static final class c extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28102c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28103d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28104e;

        /* renamed from: f  reason: collision with root package name */
        private final float f28105f;

        /* renamed from: g  reason: collision with root package name */
        private final float f28106g;

        /* renamed from: h  reason: collision with root package name */
        private final float f28107h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f28102c = f10;
            this.f28103d = f11;
            this.f28104e = f12;
            this.f28105f = f13;
            this.f28106g = f14;
            this.f28107h = f15;
        }

        public final float c() {
            return this.f28102c;
        }

        public final float d() {
            return this.f28104e;
        }

        public final float e() {
            return this.f28106g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Float.compare(this.f28102c, cVar.f28102c) == 0 && Float.compare(this.f28103d, cVar.f28103d) == 0 && Float.compare(this.f28104e, cVar.f28104e) == 0 && Float.compare(this.f28105f, cVar.f28105f) == 0 && Float.compare(this.f28106g, cVar.f28106g) == 0 && Float.compare(this.f28107h, cVar.f28107h) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f28103d;
        }

        public final float g() {
            return this.f28105f;
        }

        public final float h() {
            return this.f28107h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f28102c) * 31) + Float.hashCode(this.f28103d)) * 31) + Float.hashCode(this.f28104e)) * 31) + Float.hashCode(this.f28105f)) * 31) + Float.hashCode(this.f28106g)) * 31) + Float.hashCode(this.f28107h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f28102c + ", y1=" + this.f28103d + ", x2=" + this.f28104e + ", y2=" + this.f28105f + ", x3=" + this.f28106g + ", y3=" + this.f28107h + ')';
        }
    }

    /* renamed from: x0.h$d */
    public static final class d extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28108c;

        public d(float f10) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28108c = f10;
        }

        public final float c() {
            return this.f28108c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && Float.compare(this.f28108c, ((d) obj).f28108c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f28108c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f28108c + ')';
        }
    }

    /* renamed from: x0.h$e */
    public static final class e extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28109c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28110d;

        public e(float f10, float f11) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28109c = f10;
            this.f28110d = f11;
        }

        public final float c() {
            return this.f28109c;
        }

        public final float d() {
            return this.f28110d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (Float.compare(this.f28109c, eVar.f28109c) == 0 && Float.compare(this.f28110d, eVar.f28110d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f28109c) * 31) + Float.hashCode(this.f28110d);
        }

        public String toString() {
            return "LineTo(x=" + this.f28109c + ", y=" + this.f28110d + ')';
        }
    }

    /* renamed from: x0.h$f */
    public static final class f extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28111c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28112d;

        public f(float f10, float f11) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28111c = f10;
            this.f28112d = f11;
        }

        public final float c() {
            return this.f28111c;
        }

        public final float d() {
            return this.f28112d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (Float.compare(this.f28111c, fVar.f28111c) == 0 && Float.compare(this.f28112d, fVar.f28112d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f28111c) * 31) + Float.hashCode(this.f28112d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f28111c + ", y=" + this.f28112d + ')';
        }
    }

    /* renamed from: x0.h$g */
    public static final class g extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28113c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28114d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28115e;

        /* renamed from: f  reason: collision with root package name */
        private final float f28116f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f28113c = f10;
            this.f28114d = f11;
            this.f28115e = f12;
            this.f28116f = f13;
        }

        public final float c() {
            return this.f28113c;
        }

        public final float d() {
            return this.f28115e;
        }

        public final float e() {
            return this.f28114d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (Float.compare(this.f28113c, gVar.f28113c) == 0 && Float.compare(this.f28114d, gVar.f28114d) == 0 && Float.compare(this.f28115e, gVar.f28115e) == 0 && Float.compare(this.f28116f, gVar.f28116f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f28116f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f28113c) * 31) + Float.hashCode(this.f28114d)) * 31) + Float.hashCode(this.f28115e)) * 31) + Float.hashCode(this.f28116f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f28113c + ", y1=" + this.f28114d + ", x2=" + this.f28115e + ", y2=" + this.f28116f + ')';
        }
    }

    /* renamed from: x0.h$h  reason: collision with other inner class name */
    public static final class C0470h extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28117c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28118d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28119e;

        /* renamed from: f  reason: collision with root package name */
        private final float f28120f;

        public C0470h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f28117c = f10;
            this.f28118d = f11;
            this.f28119e = f12;
            this.f28120f = f13;
        }

        public final float c() {
            return this.f28117c;
        }

        public final float d() {
            return this.f28119e;
        }

        public final float e() {
            return this.f28118d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0470h)) {
                return false;
            }
            C0470h hVar = (C0470h) obj;
            if (Float.compare(this.f28117c, hVar.f28117c) == 0 && Float.compare(this.f28118d, hVar.f28118d) == 0 && Float.compare(this.f28119e, hVar.f28119e) == 0 && Float.compare(this.f28120f, hVar.f28120f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f28120f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f28117c) * 31) + Float.hashCode(this.f28118d)) * 31) + Float.hashCode(this.f28119e)) * 31) + Float.hashCode(this.f28120f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f28117c + ", y1=" + this.f28118d + ", x2=" + this.f28119e + ", y2=" + this.f28120f + ')';
        }
    }

    /* renamed from: x0.h$i */
    public static final class i extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28121c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28122d;

        public i(float f10, float f11) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f28121c = f10;
            this.f28122d = f11;
        }

        public final float c() {
            return this.f28121c;
        }

        public final float d() {
            return this.f28122d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Float.compare(this.f28121c, iVar.f28121c) == 0 && Float.compare(this.f28122d, iVar.f28122d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f28121c) * 31) + Float.hashCode(this.f28122d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f28121c + ", y=" + this.f28122d + ')';
        }
    }

    /* renamed from: x0.h$j */
    public static final class j extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28123c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28124d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28125e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f28126f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f28127g;

        /* renamed from: h  reason: collision with root package name */
        private final float f28128h;

        /* renamed from: i  reason: collision with root package name */
        private final float f28129i;

        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28123c = f10;
            this.f28124d = f11;
            this.f28125e = f12;
            this.f28126f = z10;
            this.f28127g = z11;
            this.f28128h = f13;
            this.f28129i = f14;
        }

        public final float c() {
            return this.f28128h;
        }

        public final float d() {
            return this.f28129i;
        }

        public final float e() {
            return this.f28123c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (Float.compare(this.f28123c, jVar.f28123c) == 0 && Float.compare(this.f28124d, jVar.f28124d) == 0 && Float.compare(this.f28125e, jVar.f28125e) == 0 && this.f28126f == jVar.f28126f && this.f28127g == jVar.f28127g && Float.compare(this.f28128h, jVar.f28128h) == 0 && Float.compare(this.f28129i, jVar.f28129i) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f28125e;
        }

        public final float g() {
            return this.f28124d;
        }

        public final boolean h() {
            return this.f28126f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f28123c) * 31) + Float.hashCode(this.f28124d)) * 31) + Float.hashCode(this.f28125e)) * 31) + Boolean.hashCode(this.f28126f)) * 31) + Boolean.hashCode(this.f28127g)) * 31) + Float.hashCode(this.f28128h)) * 31) + Float.hashCode(this.f28129i);
        }

        public final boolean i() {
            return this.f28127g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f28123c + ", verticalEllipseRadius=" + this.f28124d + ", theta=" + this.f28125e + ", isMoreThanHalf=" + this.f28126f + ", isPositiveArc=" + this.f28127g + ", arcStartDx=" + this.f28128h + ", arcStartDy=" + this.f28129i + ')';
        }
    }

    /* renamed from: x0.h$k */
    public static final class k extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28130c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28131d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28132e;

        /* renamed from: f  reason: collision with root package name */
        private final float f28133f;

        /* renamed from: g  reason: collision with root package name */
        private final float f28134g;

        /* renamed from: h  reason: collision with root package name */
        private final float f28135h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f28130c = f10;
            this.f28131d = f11;
            this.f28132e = f12;
            this.f28133f = f13;
            this.f28134g = f14;
            this.f28135h = f15;
        }

        public final float c() {
            return this.f28130c;
        }

        public final float d() {
            return this.f28132e;
        }

        public final float e() {
            return this.f28134g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (Float.compare(this.f28130c, kVar.f28130c) == 0 && Float.compare(this.f28131d, kVar.f28131d) == 0 && Float.compare(this.f28132e, kVar.f28132e) == 0 && Float.compare(this.f28133f, kVar.f28133f) == 0 && Float.compare(this.f28134g, kVar.f28134g) == 0 && Float.compare(this.f28135h, kVar.f28135h) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f28131d;
        }

        public final float g() {
            return this.f28133f;
        }

        public final float h() {
            return this.f28135h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f28130c) * 31) + Float.hashCode(this.f28131d)) * 31) + Float.hashCode(this.f28132e)) * 31) + Float.hashCode(this.f28133f)) * 31) + Float.hashCode(this.f28134g)) * 31) + Float.hashCode(this.f28135h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f28130c + ", dy1=" + this.f28131d + ", dx2=" + this.f28132e + ", dy2=" + this.f28133f + ", dx3=" + this.f28134g + ", dy3=" + this.f28135h + ')';
        }
    }

    /* renamed from: x0.h$l */
    public static final class l extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28136c;

        public l(float f10) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28136c = f10;
        }

        public final float c() {
            return this.f28136c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l) && Float.compare(this.f28136c, ((l) obj).f28136c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f28136c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f28136c + ')';
        }
    }

    /* renamed from: x0.h$m */
    public static final class m extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28137c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28138d;

        public m(float f10, float f11) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28137c = f10;
            this.f28138d = f11;
        }

        public final float c() {
            return this.f28137c;
        }

        public final float d() {
            return this.f28138d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (Float.compare(this.f28137c, mVar.f28137c) == 0 && Float.compare(this.f28138d, mVar.f28138d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f28137c) * 31) + Float.hashCode(this.f28138d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f28137c + ", dy=" + this.f28138d + ')';
        }
    }

    /* renamed from: x0.h$n */
    public static final class n extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28139c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28140d;

        public n(float f10, float f11) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28139c = f10;
            this.f28140d = f11;
        }

        public final float c() {
            return this.f28139c;
        }

        public final float d() {
            return this.f28140d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (Float.compare(this.f28139c, nVar.f28139c) == 0 && Float.compare(this.f28140d, nVar.f28140d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f28139c) * 31) + Float.hashCode(this.f28140d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f28139c + ", dy=" + this.f28140d + ')';
        }
    }

    /* renamed from: x0.h$o */
    public static final class o extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28141c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28142d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28143e;

        /* renamed from: f  reason: collision with root package name */
        private final float f28144f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f28141c = f10;
            this.f28142d = f11;
            this.f28143e = f12;
            this.f28144f = f13;
        }

        public final float c() {
            return this.f28141c;
        }

        public final float d() {
            return this.f28143e;
        }

        public final float e() {
            return this.f28142d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            if (Float.compare(this.f28141c, oVar.f28141c) == 0 && Float.compare(this.f28142d, oVar.f28142d) == 0 && Float.compare(this.f28143e, oVar.f28143e) == 0 && Float.compare(this.f28144f, oVar.f28144f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f28144f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f28141c) * 31) + Float.hashCode(this.f28142d)) * 31) + Float.hashCode(this.f28143e)) * 31) + Float.hashCode(this.f28144f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f28141c + ", dy1=" + this.f28142d + ", dx2=" + this.f28143e + ", dy2=" + this.f28144f + ')';
        }
    }

    /* renamed from: x0.h$p */
    public static final class p extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28145c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28146d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28147e;

        /* renamed from: f  reason: collision with root package name */
        private final float f28148f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f28145c = f10;
            this.f28146d = f11;
            this.f28147e = f12;
            this.f28148f = f13;
        }

        public final float c() {
            return this.f28145c;
        }

        public final float d() {
            return this.f28147e;
        }

        public final float e() {
            return this.f28146d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (Float.compare(this.f28145c, pVar.f28145c) == 0 && Float.compare(this.f28146d, pVar.f28146d) == 0 && Float.compare(this.f28147e, pVar.f28147e) == 0 && Float.compare(this.f28148f, pVar.f28148f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f28148f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f28145c) * 31) + Float.hashCode(this.f28146d)) * 31) + Float.hashCode(this.f28147e)) * 31) + Float.hashCode(this.f28148f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f28145c + ", dy1=" + this.f28146d + ", dx2=" + this.f28147e + ", dy2=" + this.f28148f + ')';
        }
    }

    /* renamed from: x0.h$q */
    public static final class q extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28149c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28150d;

        public q(float f10, float f11) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f28149c = f10;
            this.f28150d = f11;
        }

        public final float c() {
            return this.f28149c;
        }

        public final float d() {
            return this.f28150d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (Float.compare(this.f28149c, qVar.f28149c) == 0 && Float.compare(this.f28150d, qVar.f28150d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f28149c) * 31) + Float.hashCode(this.f28150d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f28149c + ", dy=" + this.f28150d + ')';
        }
    }

    /* renamed from: x0.h$r */
    public static final class r extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28151c;

        public r(float f10) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28151c = f10;
        }

        public final float c() {
            return this.f28151c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof r) && Float.compare(this.f28151c, ((r) obj).f28151c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f28151c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f28151c + ')';
        }
    }

    /* renamed from: x0.h$s */
    public static final class s extends C2895h {

        /* renamed from: c  reason: collision with root package name */
        private final float f28152c;

        public s(float f10) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f28152c = f10;
        }

        public final float c() {
            return this.f28152c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof s) && Float.compare(this.f28152c, ((s) obj).f28152c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f28152c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f28152c + ')';
        }
    }

    public /* synthetic */ C2895h(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    public final boolean a() {
        return this.f28092a;
    }

    public final boolean b() {
        return this.f28093b;
    }

    private C2895h(boolean z10, boolean z11) {
        this.f28092a = z10;
        this.f28093b = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2895h(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (DefaultConstructorMarker) null);
    }
}
