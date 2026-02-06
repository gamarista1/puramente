package u4;

import H4.l;
import java.util.zip.ZipInputStream;

/* renamed from: u4.p  reason: case insensitive filesystem */
public final /* synthetic */ class C4076p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f48554a;

    public /* synthetic */ C4076p(ZipInputStream zipInputStream) {
        this.f48554a = zipInputStream;
    }

    public final void run() {
        l.c(this.f48554a);
    }
}
