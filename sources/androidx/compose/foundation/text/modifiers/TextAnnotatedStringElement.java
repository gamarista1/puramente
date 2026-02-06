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

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u00101R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u00102R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00104R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u00102R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u00102\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "LJ0/V;", "Landroidx/compose/foundation/text/modifiers/b;", "LQ0/d;", "text", "LQ0/T;", "style", "LV0/h$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LQ0/L;", "Llf/M;", "onTextLayout", "Lb1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LQ0/d$c;", "LQ0/x;", "placeholders", "Lq0/i;", "onPlaceholderLayout", "LO/g;", "selectionController", "Lr0/E0;", "color", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LQ0/d;LQ0/T;LV0/h$b;Lyf/l;IZIILjava/util/List;Lyf/l;LO/g;Lr0/E0;Lyf/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/text/modifiers/b;", "node", "e", "(Landroidx/compose/foundation/text/modifiers/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "LQ0/d;", "c", "LQ0/T;", "LV0/h$b;", "Lyf/l;", "f", "I", "g", "Z", "h", "i", "j", "Ljava/util/List;", "k", "l", "LO/g;", "m", "Lr0/E0;", "n", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextAnnotatedStringElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C1321d f13160b;

    /* renamed from: c  reason: collision with root package name */
    private final T f13161c;

    /* renamed from: d  reason: collision with root package name */
    private final h.b f13162d;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f13163e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13164f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13165g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13166h;

    /* renamed from: i  reason: collision with root package name */
    private final int f13167i;

    /* renamed from: j  reason: collision with root package name */
    private final List f13168j;

    /* renamed from: k  reason: collision with root package name */
    private final C6798l f13169k;

    /* renamed from: l  reason: collision with root package name */
    private final g f13170l;

    /* renamed from: m  reason: collision with root package name */
    private final C2443E0 f13171m;

    /* renamed from: n  reason: collision with root package name */
    private final C6798l f13172n;

    public /* synthetic */ TextAnnotatedStringElement(C1321d dVar, T t10, h.b bVar, C6798l lVar, int i10, boolean z10, int i11, int i12, List list, C6798l lVar2, g gVar, C2443E0 e02, C6798l lVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, t10, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, e02, lVar3);
    }

    /* renamed from: d */
    public b a() {
        return new b(this.f13160b, this.f13161c, this.f13162d, this.f13163e, this.f13164f, this.f13165g, this.f13166h, this.f13167i, this.f13168j, this.f13169k, this.f13170l, this.f13171m, this.f13172n, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(b bVar) {
        bVar.s2(bVar.F2(this.f13171m, this.f13161c), bVar.H2(this.f13160b), bVar.G2(this.f13161c, this.f13168j, this.f13167i, this.f13166h, this.f13165g, this.f13162d, this.f13164f), bVar.E2(this.f13163e, this.f13169k, this.f13170l, this.f13172n));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (C6496s.c(this.f13171m, textAnnotatedStringElement.f13171m) && C6496s.c(this.f13160b, textAnnotatedStringElement.f13160b) && C6496s.c(this.f13161c, textAnnotatedStringElement.f13161c) && C6496s.c(this.f13168j, textAnnotatedStringElement.f13168j) && C6496s.c(this.f13162d, textAnnotatedStringElement.f13162d) && this.f13163e == textAnnotatedStringElement.f13163e && this.f13172n == textAnnotatedStringElement.f13172n && t.e(this.f13164f, textAnnotatedStringElement.f13164f) && this.f13165g == textAnnotatedStringElement.f13165g && this.f13166h == textAnnotatedStringElement.f13166h && this.f13167i == textAnnotatedStringElement.f13167i && this.f13169k == textAnnotatedStringElement.f13169k && C6496s.c(this.f13170l, textAnnotatedStringElement.f13170l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = ((((this.f13160b.hashCode() * 31) + this.f13161c.hashCode()) * 31) + this.f13162d.hashCode()) * 31;
        C6798l lVar = this.f13163e;
        int i14 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = (((((((((hashCode + i10) * 31) + t.f(this.f13164f)) * 31) + Boolean.hashCode(this.f13165g)) * 31) + this.f13166h) * 31) + this.f13167i) * 31;
        List list = this.f13168j;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (f10 + i11) * 31;
        C6798l lVar2 = this.f13169k;
        if (lVar2 != null) {
            i12 = lVar2.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (((i15 + i12) * 31) + 0) * 31;
        C2443E0 e02 = this.f13171m;
        if (e02 != null) {
            i13 = e02.hashCode();
        } else {
            i13 = 0;
        }
        int i17 = (i16 + i13) * 31;
        C6798l lVar3 = this.f13172n;
        if (lVar3 != null) {
            i14 = lVar3.hashCode();
        }
        return i17 + i14;
    }

    private TextAnnotatedStringElement(C1321d dVar, T t10, h.b bVar, C6798l lVar, int i10, boolean z10, int i11, int i12, List list, C6798l lVar2, g gVar, C2443E0 e02, C6798l lVar3) {
        this.f13160b = dVar;
        this.f13161c = t10;
        this.f13162d = bVar;
        this.f13163e = lVar;
        this.f13164f = i10;
        this.f13165g = z10;
        this.f13166h = i11;
        this.f13167i = i12;
        this.f13168j = list;
        this.f13169k = lVar2;
        this.f13171m = e02;
        this.f13172n = lVar3;
    }
}
