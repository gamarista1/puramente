package androidx.compose.foundation.text.handwriting;

import K.c;
import androidx.compose.foundation.layout.n;
import c1.h;
import k0.i;
import yf.C6787a;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final float f13143a = h.j((float) 40);

    /* renamed from: b  reason: collision with root package name */
    private static final float f13144b = h.j((float) 10);

    public static final float a() {
        return f13144b;
    }

    public static final float b() {
        return f13143a;
    }

    public static final i c(i iVar, boolean z10, C6787a aVar) {
        if (!z10 || !c.a()) {
            return iVar;
        }
        return n.j(iVar.h(new StylusHandwritingElementWithNegativePadding(aVar)), f13144b, f13143a);
    }
}
