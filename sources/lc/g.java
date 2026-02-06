package Lc;

import Kc.h;
import android.net.Uri;
import ub.C5230g;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    private final Uri f51982m;

    /* renamed from: n  reason: collision with root package name */
    private final byte[] f51983n;

    /* renamed from: o  reason: collision with root package name */
    private final long f51984o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f51985p;

    /* renamed from: q  reason: collision with root package name */
    private final int f51986q;

    public g(h hVar, C5230g gVar, Uri uri, byte[] bArr, long j10, int i10, boolean z10) {
        super(hVar, gVar);
        if (bArr == null && i10 != -1) {
            this.f51972a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j10 < 0) {
            this.f51972a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f51986q = i10;
        this.f51982m = uri;
        this.f51983n = i10 <= 0 ? null : bArr;
        this.f51984o = j10;
        this.f51985p = z10;
        super.G("X-Goog-Upload-Protocol", "resumable");
        if (z10 && i10 > 0) {
            super.G("X-Goog-Upload-Command", "upload, finalize");
        } else if (z10) {
            super.G("X-Goog-Upload-Command", "finalize");
        } else {
            super.G("X-Goog-Upload-Command", "upload");
        }
        super.G("X-Goog-Upload-Offset", Long.toString(j10));
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "POST";
    }

    /* access modifiers changed from: protected */
    public byte[] h() {
        return this.f51983n;
    }

    /* access modifiers changed from: protected */
    public int i() {
        int i10 = this.f51986q;
        if (i10 > 0) {
            return i10;
        }
        return 0;
    }

    public Uri u() {
        return this.f51982m;
    }
}
