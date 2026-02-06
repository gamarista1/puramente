package K4;

import java.io.File;
import kotlin.Lazy;
import kotlin.Pair;
import lf.C6502A;
import mf.C6565s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f32343a = new e();

    private e() {
    }

    public static final File a(Lazy lazy) {
        File file = (File) lazy.getValue();
        File file2 = new File(file, "bugsnag");
        if (!file2.isDirectory()) {
            file2.mkdirs();
        }
        for (Pair pair : C6565s.q(C6502A.a("last-run-info", "last-run-info"), C6502A.a("bugsnag-sessions", "sessions"), C6502A.a("user-info", "user-info"), C6502A.a("bugsnag-native", "native"), C6502A.a("bugsnag-errors", "errors"))) {
            String str = (String) pair.b();
            File file3 = new File(file, (String) pair.a());
            if (file3.exists()) {
                file3.renameTo(new File(file2, str));
            }
        }
        return file2;
    }
}
