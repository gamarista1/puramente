package androidx.compose.ui.platform;

import Q0.C;
import Q0.C1321d;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

/* renamed from: androidx.compose.ui.platform.l  reason: case insensitive filesystem */
public abstract class C1646l {
    public static final C1321d a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C1321d(charSequence.toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int j02 = C6559l.j0(annotationArr);
        if (j02 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (C6496s.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new C1321d.c(new C1647l0(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i10 == j02) {
                    break;
                }
                i10++;
            }
        }
        return new C1321d(charSequence.toString(), arrayList, (List) null, 4, (DefaultConstructorMarker) null);
    }

    public static final CharSequence b(C1321d dVar) {
        if (dVar.g().isEmpty()) {
            return dVar.j();
        }
        SpannableString spannableString = new SpannableString(dVar.j());
        C1662s0 s0Var = new C1662s0();
        List g10 = dVar.g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1321d.c cVar = (C1321d.c) g10.get(i10);
            int b10 = cVar.b();
            int c10 = cVar.c();
            s0Var.q();
            s0Var.d((C) cVar.a());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", s0Var.p()), b10, c10, 33);
        }
        return spannableString;
    }
}
