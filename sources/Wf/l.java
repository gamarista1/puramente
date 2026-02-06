package wf;

import Sg.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

abstract class l {
    private static final int a(String str) {
        int a02;
        char c10 = File.separatorChar;
        int a03 = p.a0(str, c10, 0, false, 4, (Object) null);
        if (a03 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (a02 = p.a0(str, c10, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int a04 = p.a0(str, c10, a02 + 1, false, 4, (Object) null);
            if (a04 >= 0) {
                return a04 + 1;
            }
            return str.length();
        } else if (a03 > 0 && str.charAt(a03 - 1) == ':') {
            return a03 + 1;
        } else {
            if (a03 != -1 || !p.R(str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    public static final boolean b(File file) {
        C6496s.h(file, "<this>");
        String path = file.getPath();
        C6496s.g(path, "getPath(...)");
        if (a(path) > 0) {
            return true;
        }
        return false;
    }

    public static final g c(File file) {
        List list;
        C6496s.h(file, "<this>");
        String path = file.getPath();
        C6496s.e(path);
        int a10 = a(path);
        String substring = path.substring(0, a10);
        C6496s.g(substring, "substring(...)");
        String substring2 = path.substring(a10);
        C6496s.g(substring2, "substring(...)");
        if (substring2.length() == 0) {
            list = C6565s.n();
        } else {
            Iterable<String> E02 = p.E0(substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(C6565s.y(E02, 10));
            for (String file2 : E02) {
                arrayList.add(new File(file2));
            }
            list = arrayList;
        }
        return new g(new File(substring), list);
    }
}
