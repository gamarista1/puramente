package gg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

/* renamed from: gg.F  reason: case insensitive filesystem */
public final class C5946F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5946F f67716a = new C5946F();

    private C5946F() {
    }

    private final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* access modifiers changed from: private */
    public static final CharSequence k(String str) {
        C6496s.h(str, "it");
        return f67716a.c(str);
    }

    public final String[] b(String... strArr) {
        C6496s.h(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set d(String str, String... strArr) {
        C6496s.h(str, "internalName");
        C6496s.h(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set e(String str, String... strArr) {
        C6496s.h(str, "name");
        C6496s.h(strArr, "signatures");
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set f(String str, String... strArr) {
        C6496s.h(str, "name");
        C6496s.h(strArr, "signatures");
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String g(String str) {
        C6496s.h(str, "name");
        return "java/util/function/" + str;
    }

    public final String h(String str) {
        C6496s.h(str, "name");
        return "java/lang/" + str;
    }

    public final String i(String str) {
        C6496s.h(str, "name");
        return "java/util/" + str;
    }

    public final String j(String str, List list, String str2) {
        C6496s.h(str, "name");
        C6496s.h(list, "parameters");
        C6496s.h(str2, "ret");
        return str + '(' + C6565s.x0(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C5945E.f67715a, 30, (Object) null) + ')' + c(str2);
    }

    public final String l(String str, String str2) {
        C6496s.h(str, "internalName");
        C6496s.h(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
