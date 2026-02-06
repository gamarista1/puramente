package O0;

import java.util.List;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.y;
import lf.C6514M;
import mf.C6565s;
import yf.p;

public final class q {

    /* renamed from: A  reason: collision with root package name */
    private static final u f4602A = t.a("EditableText");

    /* renamed from: B  reason: collision with root package name */
    private static final u f4603B = t.a("TextSelectionRange");

    /* renamed from: C  reason: collision with root package name */
    private static final u f4604C = t.a("ImeAction");

    /* renamed from: D  reason: collision with root package name */
    private static final u f4605D = t.a("Selected");

    /* renamed from: E  reason: collision with root package name */
    private static final u f4606E = t.a("ToggleableState");

    /* renamed from: F  reason: collision with root package name */
    private static final u f4607F = t.a("Password");

    /* renamed from: G  reason: collision with root package name */
    private static final u f4608G = t.a("Error");

    /* renamed from: H  reason: collision with root package name */
    private static final u f4609H = new u("IndexForKey", (p) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: I  reason: collision with root package name */
    private static final u f4610I = new u("IsEditable", (p) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: J  reason: collision with root package name */
    private static final u f4611J = new u("MaxTextLength", (p) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: K  reason: collision with root package name */
    public static final int f4612K = 8;

    /* renamed from: a  reason: collision with root package name */
    public static final q f4613a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final u f4614b = t.b("ContentDescription", b.f4640a);

    /* renamed from: c  reason: collision with root package name */
    private static final u f4615c = t.a("StateDescription");

    /* renamed from: d  reason: collision with root package name */
    private static final u f4616d = t.a("ProgressBarRangeInfo");

    /* renamed from: e  reason: collision with root package name */
    private static final u f4617e = t.b("PaneTitle", g.f4645a);

    /* renamed from: f  reason: collision with root package name */
    private static final u f4618f = t.a("SelectableGroup");

    /* renamed from: g  reason: collision with root package name */
    private static final u f4619g = t.a("CollectionInfo");

    /* renamed from: h  reason: collision with root package name */
    private static final u f4620h = t.a("CollectionItemInfo");

    /* renamed from: i  reason: collision with root package name */
    private static final u f4621i = t.a("Heading");

    /* renamed from: j  reason: collision with root package name */
    private static final u f4622j = t.a("Disabled");

    /* renamed from: k  reason: collision with root package name */
    private static final u f4623k = t.a("LiveRegion");

    /* renamed from: l  reason: collision with root package name */
    private static final u f4624l = t.a("Focused");

    /* renamed from: m  reason: collision with root package name */
    private static final u f4625m = t.a("IsTraversalGroup");

    /* renamed from: n  reason: collision with root package name */
    private static final u f4626n = new u("InvisibleToUser", (p) d.f4642a);

    /* renamed from: o  reason: collision with root package name */
    private static final u f4627o = new u("ContentType", (p) c.f4641a);

    /* renamed from: p  reason: collision with root package name */
    private static final u f4628p = new u("ContentDataType", (p) a.f4639a);

    /* renamed from: q  reason: collision with root package name */
    private static final u f4629q = t.b("TraversalIndex", k.f4649a);

    /* renamed from: r  reason: collision with root package name */
    private static final u f4630r = t.a("HorizontalScrollAxisRange");

    /* renamed from: s  reason: collision with root package name */
    private static final u f4631s = t.a("VerticalScrollAxisRange");

    /* renamed from: t  reason: collision with root package name */
    private static final u f4632t = t.b("IsPopup", f.f4644a);

    /* renamed from: u  reason: collision with root package name */
    private static final u f4633u = t.b("IsDialog", e.f4643a);

    /* renamed from: v  reason: collision with root package name */
    private static final u f4634v = t.b("Role", h.f4646a);

    /* renamed from: w  reason: collision with root package name */
    private static final u f4635w = new u("TestTag", false, i.f4647a);

    /* renamed from: x  reason: collision with root package name */
    private static final u f4636x = t.b("Text", j.f4648a);

    /* renamed from: y  reason: collision with root package name */
    private static final u f4637y = new u("TextSubstitution", (p) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    private static final u f4638z = new u("IsShowingTextSubstitution", (p) null, 2, (DefaultConstructorMarker) null);

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4639a = new a();

        a() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            android.support.v4.media.session.c.a(obj);
            android.support.v4.media.session.c.a(obj2);
            throw null;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f4640a = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final List invoke(List list, List list2) {
            List h12;
            if (list == null || (h12 = C6565s.h1(list)) == null) {
                return list2;
            }
            h12.addAll(list2);
            return h12;
        }
    }

    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final e f4643a = new e();

        e() {
            super(2);
        }

        /* renamed from: a */
        public final C6514M invoke(C6514M m10, C6514M m11) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    static final class f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final f f4644a = new f();

        f() {
            super(2);
        }

        /* renamed from: a */
        public final C6514M invoke(C6514M m10, C6514M m11) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final g f4645a = new g();

        g() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    static final class j extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final j f4648a = new j();

        j() {
            super(2);
        }

        /* renamed from: a */
        public final List invoke(List list, List list2) {
            List h12;
            if (list == null || (h12 = C6565s.h1(list)) == null) {
                return list2;
            }
            h12.addAll(list2);
            return h12;
        }
    }

    private q() {
    }

    public final u A() {
        return f4605D;
    }

    public final u B() {
        return f4615c;
    }

    public final u C() {
        return f4635w;
    }

    public final u D() {
        return f4636x;
    }

    public final u E() {
        return f4603B;
    }

    public final u F() {
        return f4637y;
    }

    public final u G() {
        return f4606E;
    }

    public final u H() {
        return f4629q;
    }

    public final u I() {
        return f4631s;
    }

    public final u a() {
        return f4619g;
    }

    public final u b() {
        return f4620h;
    }

    public final u c() {
        return f4628p;
    }

    public final u d() {
        return f4614b;
    }

    public final u e() {
        return f4627o;
    }

    public final u f() {
        return f4622j;
    }

    public final u g() {
        return f4602A;
    }

    public final u h() {
        return f4608G;
    }

    public final u i() {
        return f4624l;
    }

    public final u j() {
        return f4621i;
    }

    public final u k() {
        return f4630r;
    }

    public final u l() {
        return f4604C;
    }

    public final u m() {
        return f4609H;
    }

    public final u n() {
        return f4626n;
    }

    public final u o() {
        return f4633u;
    }

    public final u p() {
        return f4610I;
    }

    public final u q() {
        return f4632t;
    }

    public final u r() {
        return f4638z;
    }

    public final u s() {
        return f4625m;
    }

    public final u t() {
        return f4623k;
    }

    public final u u() {
        return f4611J;
    }

    public final u v() {
        return f4617e;
    }

    public final u w() {
        return f4607F;
    }

    public final u x() {
        return f4616d;
    }

    public final u y() {
        return f4634v;
    }

    public final u z() {
        return f4618f;
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final c f4641a = new c();

        c() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            android.support.v4.media.session.c.a(obj);
            android.support.v4.media.session.c.a(obj2);
            a((y) null, (y) null);
            return null;
        }

        public final y a(y yVar, y yVar2) {
            return yVar;
        }
    }

    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final d f4642a = new d();

        d() {
            super(2);
        }

        /* renamed from: a */
        public final C6514M invoke(C6514M m10, C6514M m11) {
            return m10;
        }
    }

    static final class h extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final h f4646a = new h();

        h() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((g) obj, ((g) obj2).n());
        }

        public final g a(g gVar, int i10) {
            return gVar;
        }
    }

    static final class i extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final i f4647a = new i();

        i() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    static final class k extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final k f4649a = new k();

        k() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Float) obj, ((Number) obj2).floatValue());
        }

        public final Float a(Float f10, float f11) {
            return f10;
        }
    }
}
