package Sg;

import kotlin.jvm.internal.C6496s;

abstract class v extends u {
    public static StringBuilder i(StringBuilder sb2, String... strArr) {
        C6496s.h(sb2, "<this>");
        C6496s.h(strArr, "value");
        for (String append : strArr) {
            sb2.append(append);
        }
        return sb2;
    }
}
