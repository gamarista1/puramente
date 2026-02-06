package androidx.compose.foundation.text.modifiers;

import J0.V;
import O.i;
import Q0.T;
import V0.h;
import b1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2443E0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "LJ0/V;", "LO/i;", "", "text", "LQ0/T;", "style", "LV0/h$b;", "fontFamilyResolver", "Lb1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lr0/E0;", "color", "<init>", "(Ljava/lang/String;LQ0/T;LV0/h$b;IZIILr0/E0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()LO/i;", "node", "Llf/M;", "e", "(LO/i;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "Ljava/lang/String;", "c", "LQ0/T;", "LV0/h$b;", "I", "f", "Z", "g", "h", "i", "Lr0/E0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextStringSimpleElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final String f13173b;

    /* renamed from: c  reason: collision with root package name */
    private final T f13174c;

    /* renamed from: d  reason: collision with root package name */
    private final h.b f13175d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13176e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f13177f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13178g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13179h;

    /* renamed from: i  reason: collision with root package name */
    private final C2443E0 f13180i;

    public /* synthetic */ TextStringSimpleElement(String str, T t10, h.b bVar, int i10, boolean z10, int i11, int i12, C2443E0 e02, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, t10, bVar, i10, z10, i11, i12, e02);
    }

    /* renamed from: d */
    public i a() {
        return new i(this.f13173b, this.f13174c, this.f13175d, this.f13176e, this.f13177f, this.f13178g, this.f13179h, this.f13180i, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(i iVar) {
        iVar.t2(iVar.y2(this.f13180i, this.f13174c), iVar.A2(this.f13173b), iVar.z2(this.f13174c, this.f13179h, this.f13178g, this.f13177f, this.f13175d, this.f13176e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (C6496s.c(this.f13180i, textStringSimpleElement.f13180i) && C6496s.c(this.f13173b, textStringSimpleElement.f13173b) && C6496s.c(this.f13174c, textStringSimpleElement.f13174c) && C6496s.c(this.f13175d, textStringSimpleElement.f13175d) && t.e(this.f13176e, textStringSimpleElement.f13176e) && this.f13177f == textStringSimpleElement.f13177f && this.f13178g == textStringSimpleElement.f13178g && this.f13179h == textStringSimpleElement.f13179h) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((((((((((this.f13173b.hashCode() * 31) + this.f13174c.hashCode()) * 31) + this.f13175d.hashCode()) * 31) + t.f(this.f13176e)) * 31) + Boolean.hashCode(this.f13177f)) * 31) + this.f13178g) * 31) + this.f13179h) * 31;
        C2443E0 e02 = this.f13180i;
        if (e02 != null) {
            i10 = e02.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    private TextStringSimpleElement(String str, T t10, h.b bVar, int i10, boolean z10, int i11, int i12, C2443E0 e02) {
        this.f13173b = str;
        this.f13174c = t10;
        this.f13175d = bVar;
        this.f13176e = i10;
        this.f13177f = z10;
        this.f13178g = i11;
        this.f13179h = i12;
        this.f13180i = e02;
    }
}
