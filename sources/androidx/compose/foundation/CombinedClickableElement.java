package androidx.compose.foundation;

import B.l;
import J0.V;
import O0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.C2845I;
import yf.C6787a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010&R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010*\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "LJ0/V;", "Landroidx/compose/foundation/f;", "LB/l;", "interactionSource", "Lx/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LO0/g;", "role", "Lkotlin/Function0;", "Llf/M;", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "<init>", "(LB/l;Lx/I;ZLjava/lang/String;LO0/g;Lyf/a;Ljava/lang/String;Lyf/a;Lyf/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/f;", "node", "e", "(Landroidx/compose/foundation/f;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LB/l;", "c", "Lx/I;", "Z", "Ljava/lang/String;", "f", "LO0/g;", "g", "Lyf/a;", "h", "i", "j", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CombinedClickableElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final l f12423b;

    /* renamed from: c  reason: collision with root package name */
    private final C2845I f12424c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12425d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12426e;

    /* renamed from: f  reason: collision with root package name */
    private final g f12427f;

    /* renamed from: g  reason: collision with root package name */
    private final C6787a f12428g;

    /* renamed from: h  reason: collision with root package name */
    private final String f12429h;

    /* renamed from: i  reason: collision with root package name */
    private final C6787a f12430i;

    /* renamed from: j  reason: collision with root package name */
    private final C6787a f12431j;

    public /* synthetic */ CombinedClickableElement(l lVar, C2845I i10, boolean z10, String str, g gVar, C6787a aVar, String str2, C6787a aVar2, C6787a aVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, i10, z10, str, gVar, aVar, str2, aVar2, aVar3);
    }

    /* renamed from: d */
    public f a() {
        return new f(this.f12428g, this.f12429h, this.f12430i, this.f12431j, this.f12423b, this.f12424c, this.f12425d, this.f12426e, this.f12427f, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(f fVar) {
        fVar.M2(this.f12428g, this.f12429h, this.f12430i, this.f12431j, this.f12423b, this.f12424c, this.f12425d, this.f12426e, this.f12427f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        if (C6496s.c(this.f12423b, combinedClickableElement.f12423b) && C6496s.c(this.f12424c, combinedClickableElement.f12424c) && this.f12425d == combinedClickableElement.f12425d && C6496s.c(this.f12426e, combinedClickableElement.f12426e) && C6496s.c(this.f12427f, combinedClickableElement.f12427f) && this.f12428g == combinedClickableElement.f12428g && C6496s.c(this.f12429h, combinedClickableElement.f12429h) && this.f12430i == combinedClickableElement.f12430i && this.f12431j == combinedClickableElement.f12431j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        l lVar = this.f12423b;
        int i16 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i17 = i10 * 31;
        C2845I i18 = this.f12424c;
        if (i18 != null) {
            i11 = i18.hashCode();
        } else {
            i11 = 0;
        }
        int hashCode = (((i17 + i11) * 31) + Boolean.hashCode(this.f12425d)) * 31;
        String str = this.f12426e;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int i19 = (hashCode + i12) * 31;
        g gVar = this.f12427f;
        if (gVar != null) {
            i13 = g.l(gVar.n());
        } else {
            i13 = 0;
        }
        int hashCode2 = (((i19 + i13) * 31) + this.f12428g.hashCode()) * 31;
        String str2 = this.f12429h;
        if (str2 != null) {
            i14 = str2.hashCode();
        } else {
            i14 = 0;
        }
        int i20 = (hashCode2 + i14) * 31;
        C6787a aVar = this.f12430i;
        if (aVar != null) {
            i15 = aVar.hashCode();
        } else {
            i15 = 0;
        }
        int i21 = (i20 + i15) * 31;
        C6787a aVar2 = this.f12431j;
        if (aVar2 != null) {
            i16 = aVar2.hashCode();
        }
        return i21 + i16;
    }

    private CombinedClickableElement(l lVar, C2845I i10, boolean z10, String str, g gVar, C6787a aVar, String str2, C6787a aVar2, C6787a aVar3) {
        this.f12423b = lVar;
        this.f12424c = i10;
        this.f12425d = z10;
        this.f12426e = str;
        this.f12427f = gVar;
        this.f12428g = aVar;
        this.f12429h = str2;
        this.f12430i = aVar2;
        this.f12431j = aVar3;
    }
}
