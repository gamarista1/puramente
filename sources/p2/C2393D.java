package p2;

import android.media.MediaDrm;
import p2.C2390A;

/* renamed from: p2.D  reason: case insensitive filesystem */
public final /* synthetic */ class C2393D implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ I f25185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2390A.b f25186b;

    public /* synthetic */ C2393D(I i10, C2390A.b bVar) {
        this.f25185a = i10;
        this.f25186b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.f25185a.A(this.f25186b, mediaDrm, bArr, i10, i11, bArr2);
    }
}
