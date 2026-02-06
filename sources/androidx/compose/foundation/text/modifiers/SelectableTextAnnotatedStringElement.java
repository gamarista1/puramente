package androidx.compose.foundation.text.modifiers;

import J0.V;
import O.g;
import Q0.C1321d;
import Q0.T;
import V0.h;
import b1.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2443E0;
import yf.C6798l;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00102R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00103R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00105R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00103R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "LJ0/V;", "Landroidx/compose/foundation/text/modifiers/a;", "LQ0/d;", "text", "LQ0/T;", "style", "LV0/h$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LQ0/L;", "Llf/M;", "onTextLayout", "Lb1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LQ0/d$c;", "LQ0/x;", "placeholders", "Lq0/i;", "onPlaceholderLayout", "LO/g;", "selectionController", "Lr0/E0;", "color", "<init>", "(LQ0/d;LQ0/T;LV0/h$b;Lyf/l;IZIILjava/util/List;Lyf/l;LO/g;Lr0/E0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/text/modifiers/a;", "node", "e", "(Landroidx/compose/foundation/text/modifiers/a;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "LQ0/d;", "c", "LQ0/T;", "LV0/h$b;", "Lyf/l;", "f", "I", "g", "Z", "h", "i", "j", "Ljava/util/List;", "k", "l", "LO/g;", "m", "Lr0/E0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectableTextAnnotatedStringElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C1321d f13148b;

    /* renamed from: c  reason: collision with root package name */
    private final T f13149c;

    /* renamed from: d  reason: collision with root package name */
    private final h.b f13150d;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f13151e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13152f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13153g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13154h;

    /* renamed from: i  reason: collision with root package name */
    private final int f13155i;

    /* renamed from: j  reason: collision with root package name */
    private final List f13156j;

    /* renamed from: k  reason: collision with root package name */
    private final C6798l f13157k;

    /* renamed from: l  reason: collision with root package name */
    private final g f13158l;

    /* renamed from: m  reason: collision with root package name */
    private final C2443E0 f13159m;

    public /* synthetic */ SelectableTextAnnotatedStringElement(C1321d dVar, T t10, h.b bVar, C6798l lVar, int i10, boolean z10, int i11, int i12, List list, C6798l lVar2, g gVar, C2443E0 e02, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, t10, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, e02);
    }

    /* renamed from: d */
    public a a() {
        return new a(this.f13148b, this.f13149c, this.f13150d, this.f13151e, this.f13152f, this.f13153g, this.f13154h, this.f13155i, this.f13156j, this.f13157k, this.f13158l, this.f13159m, (C6798l) null, 4096, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(a aVar) {
        aVar.r2(this.f13148b, this.f13149c, this.f13156j, this.f13155i, this.f13154h, this.f13153g, this.f13150d, this.f13152f, this.f13151e, this.f13157k, this.f13158l, this.f13159m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (C6496s.c(this.f13159m, selectableTextAnnotatedStringElement.f13159m) && C6496s.c(this.f13148b, selectableTextAnnotatedStringElement.f13148b) && C6496s.c(this.f13149c, selectableTextAnnotatedStringElement.f13149c) && C6496s.c(this.f13156j, selectableTextAnnotatedStringElement.f13156j) && C6496s.c(this.f13150d, selectableTextAnnotatedStringElement.f13150d) && this.f13151e == selectableTextAnnotatedStringElement.f13151e && t.e(this.f13152f, selectableTextAnnotatedStringElement.f13152f) && this.f13153g == selectableTextAnnotatedStringElement.f13153g && this.f13154h == selectableTextAnnotatedStringElement.f13154h && this.f13155i == selectableTextAnnotatedStringElement.f13155i && this.f13157k == selectableTextAnnotatedStringElement.f13157k && C6496s.c(this.f13158l, selectableTextAnnotatedStringElement.f13158l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = ((((this.f13148b.hashCode() * 31) + this.f13149c.hashCode()) * 31) + this.f13150d.hashCode()) * 31;
        C6798l lVar = this.f13151e;
        int i13 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = (((((((((hashCode + i10) * 31) + t.f(this.f13152f)) * 31) + Boolean.hashCode(this.f13153g)) * 31) + this.f13154h) * 31) + this.f13155i) * 31;
        List list = this.f13156j;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (f10 + i11) * 31;
        C6798l lVar2 = this.f13157k;
        if (lVar2 != null) {
            i12 = lVar2.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (((i14 + i12) * 31) + 0) * 31;
        C2443E0 e02 = this.f13159m;
        if (e02 != null) {
            i13 = e02.hashCode();
        }
        return i15 + i13;
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + this.f13148b + ", style=" + this.f13149c + ", fontFamilyResolver=" + this.f13150d + ", onTextLayout=" + this.f13151e + ", overflow=" + t.g(this.f13152f) + ", softWrap=" + this.f13153g + ", maxLines=" + this.f13154h + ", minLines=" + this.f13155i + ", placeholders=" + this.f13156j + ", onPlaceholderLayout=" + this.f13157k + ", selectionController=" + this.f13158l + ", color=" + this.f13159m + ')';
    }

    private SelectableTextAnnotatedStringElement(C1321d dVar, T t10, h.b bVar, C6798l lVar, int i10, boolean z10, int i11, int i12, List list, C6798l lVar2, g gVar, C2443E0 e02) {
        this.f13148b = dVar;
        this.f13149c = t10;
        this.f13150d = bVar;
        this.f13151e = lVar;
        this.f13152f = i10;
        this.f13153g = z10;
        this.f13154h = i11;
        this.f13155i = i12;
        this.f13156j = list;
        this.f13157k = lVar2;
        this.f13159m = e02;
    }
}
