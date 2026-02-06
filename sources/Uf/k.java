package Uf;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import ng.c;
import xf.C6781a;

public abstract class k {
    public static final C5554g a(Annotation[] annotationArr, c cVar) {
        Annotation annotation;
        C6496s.h(annotationArr, "<this>");
        C6496s.h(cVar, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (C6496s.c(C5553f.e(C6781a.b(C6781a.a(annotation))).a(), cVar)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new C5554g(annotation);
        }
        return null;
    }

    public static final List b(Annotation[] annotationArr) {
        C6496s.h(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation gVar : annotationArr) {
            arrayList.add(new C5554g(gVar));
        }
        return arrayList;
    }
}
