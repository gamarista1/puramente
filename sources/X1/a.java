package X1;

import Y.I0;
import androidx.lifecycle.C1798v;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f9573a;

    /* renamed from: X1.a$a  reason: collision with other inner class name */
    static final class C0179a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0179a f9574a = new C0179a();

        C0179a() {
            super(0);
        }

        /* renamed from: a */
        public final C1798v invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r1 = null;
     */
    static {
        /*
            r0 = 0
            lf.v$a r1 = lf.v.f71841b     // Catch:{ all -> 0x002b }
            java.lang.Class<androidx.lifecycle.v> r1 = androidx.lifecycle.C1798v.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C6496s.e(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ all -> 0x002b }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch:{ all -> 0x002b }
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch:{ all -> 0x002b }
            int r3 = r2.length     // Catch:{ all -> 0x002b }
            r4 = 0
        L_0x001e:
            if (r4 >= r3) goto L_0x002d
            r5 = r2[r4]     // Catch:{ all -> 0x002b }
            boolean r5 = r5 instanceof lf.C6521e     // Catch:{ all -> 0x002b }
            if (r5 == 0) goto L_0x0028
        L_0x0026:
            r1 = r0
            goto L_0x0037
        L_0x0028:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x002b:
            r1 = move-exception
            goto L_0x003c
        L_0x002d:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch:{ all -> 0x002b }
            boolean r2 = r1 instanceof Y.I0     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0026
            Y.I0 r1 = (Y.I0) r1     // Catch:{ all -> 0x002b }
        L_0x0037:
            java.lang.Object r1 = lf.v.b(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0046
        L_0x003c:
            lf.v$a r2 = lf.v.f71841b
            java.lang.Object r1 = lf.w.a(r1)
            java.lang.Object r1 = lf.v.b(r1)
        L_0x0046:
            boolean r2 = lf.v.g(r1)
            if (r2 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            Y.I0 r0 = (Y.I0) r0
            if (r0 != 0) goto L_0x0058
            X1.a$a r0 = X1.a.C0179a.f9574a
            Y.I0 r0 = Y.C1521x.f(r0)
        L_0x0058:
            f9573a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.a.<clinit>():void");
    }

    public static final I0 a() {
        return f9573a;
    }
}
