package wf;

import java.io.File;
import kotlin.jvm.internal.C6496s;

/* renamed from: wf.d  reason: case insensitive filesystem */
public abstract class C6764d {
    /* access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }
}
