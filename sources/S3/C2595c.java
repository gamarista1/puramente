package s3;

import android.content.Context;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* renamed from: s3.c  reason: case insensitive filesystem */
public final /* synthetic */ class C2595c implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f25905a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f25906b;

    public /* synthetic */ C2595c(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f25905a = profileInstallerInitializer;
        this.f25906b = context;
    }

    public final void doFrame(long j10) {
        this.f25905a.h(this.f25906b, j10);
    }
}
