package io.intercom.android.sdk.ui.common;

import C.C1085c;
import c1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"io/intercom/android/sdk/ui/common/IntercomArrangement$itemAtBottom$1", "LC/c$m;", "Lc1/d;", "", "totalSize", "", "sizes", "outPositions", "Llf/M;", "arrange", "(Lc1/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomArrangement$itemAtBottom$1 implements C1085c.m {
    final /* synthetic */ int $itemIndex;

    IntercomArrangement$itemAtBottom$1(int i10) {
        this.$itemIndex = i10;
    }

    public void arrange(d dVar, int i10, int[] iArr, int[] iArr2) {
        C6496s.h(dVar, "<this>");
        C6496s.h(iArr, "sizes");
        C6496s.h(iArr2, "outPositions");
        int i11 = this.$itemIndex;
        int length = iArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            int i15 = iArr[i12];
            int i16 = i13 + 1;
            if (i13 == i11) {
                iArr2[i13] = i10 - i15;
            } else {
                iArr2[i13] = i14;
                i14 += i15;
            }
            i12++;
            i13 = i16;
        }
    }

    /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
    public /* bridge */ /* synthetic */ float m558getSpacingD9Ej5fM() {
        return super.m6getSpacingD9Ej5fM();
    }

    public String toString() {
        return "Arrangement#itemAtBottom(" + this.$itemIndex + ')';
    }
}
