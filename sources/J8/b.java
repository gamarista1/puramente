package j8;

import android.content.Context;
import com.facebook.react.modules.i18nmanager.a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class b {
    public static Integer[] a(Integer[] numArr) {
        C6496s.h(numArr, "edgeColors");
        return numArr;
    }

    public static /* synthetic */ Integer[] b(Integer[] numArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            numArr = new Integer[m.values().length];
        }
        return a(numArr);
    }

    public static final h c(Integer[] numArr, int i10, Context context) {
        h hVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C6496s.h(context, "context");
        int i20 = -16777216;
        if (i10 == 0) {
            Integer num = numArr[m.f44923g.ordinal()];
            if (num == null && (num = numArr[m.f44919c.ordinal()]) == null && (num = numArr[m.f44925i.ordinal()]) == null && (num = numArr[m.f44918b.ordinal()]) == null) {
                i11 = -16777216;
            } else {
                i11 = num.intValue();
            }
            Integer num2 = numArr[m.f44927k.ordinal()];
            if (num2 == null && (num2 = numArr[m.f44921e.ordinal()]) == null && (num2 = numArr[m.f44929m.ordinal()]) == null && (num2 = numArr[m.f44926j.ordinal()]) == null && (num2 = numArr[m.f44918b.ordinal()]) == null) {
                i12 = -16777216;
            } else {
                i12 = num2.intValue();
            }
            Integer num3 = numArr[m.f44924h.ordinal()];
            if (num3 == null && (num3 = numArr[m.f44920d.ordinal()]) == null && (num3 = numArr[m.f44925i.ordinal()]) == null && (num3 = numArr[m.f44918b.ordinal()]) == null) {
                i13 = -16777216;
            } else {
                i13 = num3.intValue();
            }
            Integer num4 = numArr[m.f44928l.ordinal()];
            if (num4 == null && (num4 = numArr[m.f44922f.ordinal()]) == null && (num4 = numArr[m.f44929m.ordinal()]) == null && (num4 = numArr[m.f44926j.ordinal()]) == null) {
                Integer num5 = numArr[m.f44918b.ordinal()];
                if (num5 != null) {
                    i20 = num5.intValue();
                }
            } else {
                i20 = num4.intValue();
            }
            hVar = new h(i11, i12, i13, i20);
        } else if (i10 != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        } else if (a.f41056a.a().d(context)) {
            Integer num6 = numArr[m.f44924h.ordinal()];
            if (num6 == null && (num6 = numArr[m.f44920d.ordinal()]) == null && (num6 = numArr[m.f44925i.ordinal()]) == null && (num6 = numArr[m.f44918b.ordinal()]) == null) {
                i17 = -16777216;
            } else {
                i17 = num6.intValue();
            }
            Integer num7 = numArr[m.f44927k.ordinal()];
            if (num7 == null && (num7 = numArr[m.f44921e.ordinal()]) == null && (num7 = numArr[m.f44929m.ordinal()]) == null && (num7 = numArr[m.f44926j.ordinal()]) == null && (num7 = numArr[m.f44918b.ordinal()]) == null) {
                i18 = -16777216;
            } else {
                i18 = num7.intValue();
            }
            Integer num8 = numArr[m.f44923g.ordinal()];
            if (num8 == null && (num8 = numArr[m.f44919c.ordinal()]) == null && (num8 = numArr[m.f44925i.ordinal()]) == null && (num8 = numArr[m.f44918b.ordinal()]) == null) {
                i19 = -16777216;
            } else {
                i19 = num8.intValue();
            }
            Integer num9 = numArr[m.f44928l.ordinal()];
            if (num9 == null && (num9 = numArr[m.f44922f.ordinal()]) == null && (num9 = numArr[m.f44929m.ordinal()]) == null && (num9 = numArr[m.f44926j.ordinal()]) == null) {
                Integer num10 = numArr[m.f44918b.ordinal()];
                if (num10 != null) {
                    i20 = num10.intValue();
                }
            } else {
                i20 = num9.intValue();
            }
            hVar = new h(i17, i18, i19, i20);
        } else {
            Integer num11 = numArr[m.f44924h.ordinal()];
            if (num11 == null && (num11 = numArr[m.f44919c.ordinal()]) == null && (num11 = numArr[m.f44925i.ordinal()]) == null && (num11 = numArr[m.f44918b.ordinal()]) == null) {
                i14 = -16777216;
            } else {
                i14 = num11.intValue();
            }
            Integer num12 = numArr[m.f44927k.ordinal()];
            if (num12 == null && (num12 = numArr[m.f44921e.ordinal()]) == null && (num12 = numArr[m.f44929m.ordinal()]) == null && (num12 = numArr[m.f44926j.ordinal()]) == null && (num12 = numArr[m.f44918b.ordinal()]) == null) {
                i15 = -16777216;
            } else {
                i15 = num12.intValue();
            }
            Integer num13 = numArr[m.f44923g.ordinal()];
            if (num13 == null && (num13 = numArr[m.f44920d.ordinal()]) == null && (num13 = numArr[m.f44925i.ordinal()]) == null && (num13 = numArr[m.f44918b.ordinal()]) == null) {
                i16 = -16777216;
            } else {
                i16 = num13.intValue();
            }
            Integer num14 = numArr[m.f44928l.ordinal()];
            if (num14 == null && (num14 = numArr[m.f44922f.ordinal()]) == null && (num14 = numArr[m.f44929m.ordinal()]) == null && (num14 = numArr[m.f44926j.ordinal()]) == null) {
                Integer num15 = numArr[m.f44918b.ordinal()];
                if (num15 != null) {
                    i20 = num15.intValue();
                }
            } else {
                i20 = num14.intValue();
            }
            hVar = new h(i14, i15, i16, i20);
        }
        return hVar;
    }
}
