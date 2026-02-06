package kh;

import gh.C5978b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

/* renamed from: kh.z  reason: case insensitive filesystem */
public abstract class C6478z {
    public static final C5978b a(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        C6496s.h(str, "serialName");
        C6496s.h(enumArr, "values");
        C6496s.h(strArr, "names");
        C6496s.h(annotationArr, "entryAnnotations");
        C6476x xVar = new C6476x(str, enumArr.length);
        if (annotationArr2 != null) {
            for (Annotation s10 : annotationArr2) {
                xVar.s(s10);
            }
        }
        int length = enumArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Enum enumR = enumArr[i10];
            int i12 = i11 + 1;
            String str2 = (String) C6559l.m0(strArr, i11);
            if (str2 == null) {
                str2 = enumR.name();
            }
            C6458j0.m(xVar, str2, false, 2, (Object) null);
            Annotation[] annotationArr3 = (Annotation[]) C6559l.m0(annotationArr, i11);
            if (annotationArr3 != null) {
                for (Annotation r10 : annotationArr3) {
                    xVar.r(r10);
                }
            }
            i10++;
            i11 = i12;
        }
        return new C6477y(str, enumArr, xVar);
    }

    public static final C5978b b(String str, Enum[] enumArr) {
        C6496s.h(str, "serialName");
        C6496s.h(enumArr, "values");
        return new C6477y(str, enumArr);
    }
}
