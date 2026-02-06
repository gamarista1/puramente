package wf;

import java.io.File;
import kotlin.jvm.internal.C6496s;

abstract class n extends m {
    public static final i m(File file, j jVar) {
        C6496s.h(file, "<this>");
        C6496s.h(jVar, "direction");
        return new i(file, jVar);
    }

    public static final i n(File file) {
        C6496s.h(file, "<this>");
        return m(file, j.BOTTOM_UP);
    }

    public static final i o(File file) {
        C6496s.h(file, "<this>");
        return m(file, j.TOP_DOWN);
    }
}
