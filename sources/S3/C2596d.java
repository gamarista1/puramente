package s3;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* renamed from: s3.d  reason: case insensitive filesystem */
public final /* synthetic */ class C2596d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f25907a;

    public /* synthetic */ C2596d(Context context) {
        this.f25907a = context;
    }

    public final void run() {
        ProfileInstallerInitializer.k(this.f25907a);
    }
}
