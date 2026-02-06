package wf;

import java.io.File;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wf.a  reason: case insensitive filesystem */
public final class C6761a extends h {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6761a(File file, File file2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6761a(File file, File file2, String str) {
        super(file, file2, str);
        C6496s.h(file, "file");
    }
}
