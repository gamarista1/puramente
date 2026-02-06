package i0;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import yf.C6798l;

/* renamed from: i0.b  reason: case insensitive filesystem */
public abstract class C2048b {
    private static final void a(Appendable appendable, Object obj, C6798l lVar) {
        boolean z10;
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof CharSequence;
        }
        if (z10) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    private static final Appendable b(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        appendable.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a(appendable, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        return ((StringBuilder) b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return c(list, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final Set e(List list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            hashSet.add(list.get(i10));
        }
        return hashSet;
    }
}
