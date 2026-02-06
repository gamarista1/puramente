package o9;

import android.media.MediaDrm;
import o9.C3912B;

public final /* synthetic */ class E implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ F f47419a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3912B.b f47420b;

    public /* synthetic */ E(F f10, C3912B.b bVar) {
        this.f47419a = f10;
        this.f47420b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.f47419a.y(this.f47420b, mediaDrm, bArr, i10, i11, bArr2);
    }
}
