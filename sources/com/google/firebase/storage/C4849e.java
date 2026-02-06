package com.google.firebase.storage;

import Cb.b;
import Db.C4253b;
import Kc.i;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import ic.C5027b;
import java.io.UnsupportedEncodingException;
import ub.C5230g;
import zb.C5300b;

/* renamed from: com.google.firebase.storage.e  reason: case insensitive filesystem */
public class C4849e {

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f58058a;

    /* renamed from: b  reason: collision with root package name */
    private final C5027b f58059b;

    /* renamed from: c  reason: collision with root package name */
    private final C5027b f58060c;

    /* renamed from: d  reason: collision with root package name */
    private final String f58061d;

    /* renamed from: e  reason: collision with root package name */
    private long f58062e = 600000;

    /* renamed from: f  reason: collision with root package name */
    private long f58063f = 60000;

    /* renamed from: g  reason: collision with root package name */
    private long f58064g = 600000;

    /* renamed from: h  reason: collision with root package name */
    private long f58065h = 120000;

    /* renamed from: i  reason: collision with root package name */
    private Yb.a f58066i;

    C4849e(String str, C5230g gVar, C5027b bVar, C5027b bVar2) {
        this.f58061d = str;
        this.f58058a = gVar;
        this.f58059b = bVar;
        this.f58060c = bVar2;
        if (bVar2 != null && bVar2.get() != null) {
            ((b) bVar2.get()).b(new a());
        }
    }

    private String d() {
        return this.f58061d;
    }

    public static C4849e f() {
        boolean z10;
        C5230g o10 = C5230g.o();
        if (o10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "You must call FirebaseApp.initialize() first.");
        return g(o10);
    }

    public static C4849e g(C5230g gVar) {
        boolean z10;
        if (gVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "Null is not a valid value for the FirebaseApp.");
        String h10 = gVar.r().h();
        if (h10 == null) {
            return i(gVar, (Uri) null);
        }
        try {
            return i(gVar, i.d(gVar, "gs://" + gVar.r().h()));
        } catch (UnsupportedEncodingException e10) {
            Log.e("FirebaseStorage", "Unable to parse bucket:" + h10, e10);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    public static C4849e h(C5230g gVar, String str) {
        boolean z10;
        boolean z11 = false;
        if (gVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "Null is not a valid value for the FirebaseApp.");
        if (str != null) {
            z11 = true;
        }
        C4536s.b(z11, "Null is not a valid value for the Firebase Storage URL.");
        if (str.toLowerCase().startsWith("gs://")) {
            try {
                return i(gVar, i.d(gVar, str));
            } catch (UnsupportedEncodingException e10) {
                Log.e("FirebaseStorage", "Unable to parse url:" + str, e10);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        } else {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
    }

    private static C4849e i(C5230g gVar, Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            C4536s.m(gVar, "Provided FirebaseApp must not be null.");
            C4850f fVar = (C4850f) gVar.k(C4850f.class);
            C4536s.m(fVar, "Firebase Storage component is not present.");
            return fVar.a(str);
        }
        throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
    }

    private o o(Uri uri) {
        boolean z10;
        C4536s.m(uri, "uri must not be null");
        String d10 = d();
        if (TextUtils.isEmpty(d10) || uri.getAuthority().equalsIgnoreCase(d10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "The supplied bucketname does not match the storage bucket of the current instance.");
        return new o(uri, this);
    }

    public C5230g a() {
        return this.f58058a;
    }

    /* access modifiers changed from: package-private */
    public b b() {
        C5027b bVar = this.f58060c;
        if (bVar != null) {
            return (b) bVar.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C4253b c() {
        C5027b bVar = this.f58059b;
        if (bVar != null) {
            return (C4253b) bVar.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Yb.a e() {
        return this.f58066i;
    }

    public long j() {
        return this.f58063f;
    }

    public long k() {
        return this.f58064g;
    }

    public long l() {
        return this.f58065h;
    }

    public long m() {
        return this.f58062e;
    }

    public o n() {
        if (!TextUtils.isEmpty(d())) {
            return o(new Uri.Builder().scheme("gs").authority(d()).path("/").build());
        }
        throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
    }

    public o p(String str) {
        C4536s.b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith("https://") && !lowerCase.startsWith("http://")) {
            return n().b(str);
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }

    public o q(String str) {
        C4536s.b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            try {
                Uri d10 = i.d(this.f58058a, str);
                if (d10 != null) {
                    return o(d10);
                }
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            } catch (UnsupportedEncodingException e10) {
                Log.e("FirebaseStorage", "Unable to parse location:" + str, e10);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        } else {
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    public void r(long j10) {
        this.f58064g = j10;
    }

    public void s(long j10) {
        this.f58065h = j10;
    }

    public void t(long j10) {
        this.f58062e = j10;
    }

    public void u(String str, int i10) {
        this.f58066i = new Yb.a(str, i10);
    }

    /* renamed from: com.google.firebase.storage.e$a */
    class a implements Cb.a {
        a() {
        }

        public void a(C5300b bVar) {
        }
    }
}
