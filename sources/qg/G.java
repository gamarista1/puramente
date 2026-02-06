package qg;

import Sg.p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import ng.d;
import ng.f;

public abstract class G {
    public static final String a(d dVar) {
        C6496s.h(dVar, "<this>");
        List h10 = dVar.h();
        C6496s.g(h10, "pathSegments(...)");
        return c(h10);
    }

    public static final String b(f fVar) {
        C6496s.h(fVar, "<this>");
        if (e(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            String b10 = fVar.b();
            C6496s.g(b10, "asString(...)");
            sb2.append('`' + b10);
            sb2.append('`');
            return sb2.toString();
        }
        String b11 = fVar.b();
        C6496s.g(b11, "asString(...)");
        return b11;
    }

    public static final String c(List list) {
        C6496s.h(list, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public static final String d(String str, String str2, String str3, String str4, String str5) {
        C6496s.h(str, "lowerRendered");
        C6496s.h(str2, "lowerPrefix");
        C6496s.h(str3, "upperRendered");
        C6496s.h(str4, "upperPrefix");
        C6496s.h(str5, "foldedPrefix");
        if (p.J(str, str2, false, 2, (Object) null) && p.J(str3, str4, false, 2, (Object) null)) {
            String substring = str.substring(str2.length());
            C6496s.g(substring, "substring(...)");
            String substring2 = str3.substring(str4.length());
            C6496s.g(substring2, "substring(...)");
            String str6 = str5 + substring;
            if (C6496s.c(substring, substring2)) {
                return str6;
            }
            if (f(substring, substring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    private static final boolean e(f fVar) {
        String b10 = fVar.b();
        C6496s.g(b10, "asString(...)");
        if (!B.f72651a.contains(b10)) {
            int i10 = 0;
            while (true) {
                if (i10 < b10.length()) {
                    char charAt = b10.charAt(i10);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        break;
                    }
                    i10++;
                } else if (b10.length() != 0 && Character.isJavaIdentifierStart(b10.codePointAt(0))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        if (kotlin.jvm.internal.C6496s.c(r7 + '?', r8) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean f(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "lower"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "upper"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r5 = 4
            r6 = 0
            java.lang.String r2 = "?"
            java.lang.String r3 = ""
            r4 = 0
            r1 = r8
            java.lang.String r0 = Sg.p.D(r1, r2, r3, r4, r5, r6)
            boolean r0 = kotlin.jvm.internal.C6496s.c(r7, r0)
            if (r0 != 0) goto L_0x005a
            r0 = 2
            r1 = 0
            java.lang.String r2 = "?"
            r3 = 0
            boolean r0 = Sg.p.u(r8, r2, r3, r0, r1)
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r8)
            if (r0 != 0) goto L_0x005a
        L_0x003e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r8)
            if (r7 == 0) goto L_0x005b
        L_0x005a:
            r3 = 1
        L_0x005b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.G.f(java.lang.String, java.lang.String):boolean");
    }
}
