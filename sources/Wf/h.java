package wf;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class h extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private final File f73708a;

    /* renamed from: b  reason: collision with root package name */
    private final File f73709b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73710c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(File file, File file2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(File file, File file2, String str) {
        super(C6764d.b(file, file2, str));
        C6496s.h(file, "file");
        this.f73708a = file;
        this.f73709b = file2;
        this.f73710c = str;
    }
}
