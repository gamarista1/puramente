package f4;

import j4.C3627n;
import java.io.File;

/* renamed from: f4.a  reason: case insensitive filesystem */
public final class C3504a implements C3505b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f43384a;

    public C3504a(boolean z10) {
        this.f43384a = z10;
    }

    /* renamed from: b */
    public String a(File file, C3627n nVar) {
        if (!this.f43384a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
