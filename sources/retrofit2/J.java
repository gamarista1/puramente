package retrofit2;

import java.lang.annotation.Annotation;

final class J implements I {

    /* renamed from: b  reason: collision with root package name */
    private static final I f72867b = new J();

    J() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (K.l(annotationArr, I.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f72867b;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class annotationType() {
        return I.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof I;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + I.class.getName() + "()";
    }
}
