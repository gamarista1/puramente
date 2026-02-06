package o9;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k9.C3702j;
import l9.s0;
import nb.C5110e;
import o9.C3912B;
import o9.m;
import p2.C2395F;
import y9.l;

public final class F implements C3912B {

    /* renamed from: d  reason: collision with root package name */
    public static final C3912B.c f47421d = new D();

    /* renamed from: a  reason: collision with root package name */
    private final UUID f47422a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDrm f47423b;

    /* renamed from: c  reason: collision with root package name */
    private int f47424c = 1;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, s0 s0Var) {
            LogSessionId a10 = s0Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                C2395F.a(C3645a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a10);
            }
        }
    }

    private F(UUID uuid) {
        C3645a.e(uuid);
        C3645a.b(!C3702j.f45576b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f47422a = uuid;
        MediaDrm mediaDrm = new MediaDrm(t(uuid));
        this.f47423b = mediaDrm;
        if (C3702j.f45578d.equals(uuid) && A()) {
            v(mediaDrm);
        }
    }

    private static boolean A() {
        return "ASUS_Z00AD".equals(M.f44984d);
    }

    public static F B(UUID uuid) {
        try {
            return new F(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new K(1, e10);
        } catch (Exception e11) {
            throw new K(2, e11);
        }
    }

    private static byte[] p(byte[] bArr) {
        B b10 = new B(bArr);
        int q10 = b10.q();
        short s10 = b10.s();
        short s11 = b10.s();
        if (s10 == 1 && s11 == 1) {
            short s12 = b10.s();
            Charset charset = C5110e.f61087e;
            String B10 = b10.B(s12, charset);
            if (B10.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = B10.indexOf("</DATA>");
            if (indexOf == -1) {
                s.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = B10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + B10.substring(indexOf);
            int i10 = q10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort((short) s10);
            allocate.putShort((short) s11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        s.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    private static byte[] q(UUID uuid, byte[] bArr) {
        if (C3702j.f45577c.equals(uuid)) {
            return C3914a.a(bArr);
        }
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] r(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = k9.C3702j.f45579e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = y9.l.e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = p(r4)
            byte[] r4 = y9.l.a(r0, r4)
        L_0x0018:
            int r1 = ja.M.f44981a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = k9.C3702j.f45578d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = ja.M.f44983c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = ja.M.f44984d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = y9.l.e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.F.r(java.util.UUID, byte[]):byte[]");
    }

    private static String s(UUID uuid, String str) {
        if (M.f44981a >= 26 || !C3702j.f45577c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) {
            return str;
        }
        return "cenc";
    }

    private static UUID t(UUID uuid) {
        if (M.f44981a >= 27 || !C3702j.f45577c.equals(uuid)) {
            return uuid;
        }
        return C3702j.f45576b;
    }

    private static void v(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static m.b x(UUID uuid, List list) {
        if (!C3702j.f45578d.equals(uuid)) {
            return (m.b) list.get(0);
        }
        if (M.f44981a >= 28 && list.size() > 1) {
            m.b bVar = (m.b) list.get(0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < list.size()) {
                m.b bVar2 = (m.b) list.get(i10);
                byte[] bArr = (byte[]) C3645a.e(bVar2.f47526e);
                if (M.c(bVar2.f47525d, bVar.f47525d) && M.c(bVar2.f47524c, bVar.f47524c) && l.c(bArr)) {
                    i11 += bArr.length;
                    i10++;
                }
            }
            byte[] bArr2 = new byte[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                byte[] bArr3 = (byte[]) C3645a.e(((m.b) list.get(i13)).f47526e);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i12, length);
                i12 += length;
            }
            return bVar.b(bArr2);
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            m.b bVar3 = (m.b) list.get(i14);
            int g10 = l.g((byte[]) C3645a.e(bVar3.f47526e));
            int i15 = M.f44981a;
            if (i15 < 23 && g10 == 0) {
                return bVar3;
            }
            if (i15 >= 23 && g10 == 1) {
                return bVar3;
            }
        }
        return (m.b) list.get(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(C3912B.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C3912B z(UUID uuid) {
        try {
            return B(uuid);
        } catch (K unused) {
            s.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new z();
        }
    }

    public Map a(byte[] bArr) {
        return this.f47423b.queryKeyStatus(bArr);
    }

    public C3912B.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f47423b.getProvisionRequest();
        return new C3912B.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public byte[] c() {
        return this.f47423b.openSession();
    }

    public void d(byte[] bArr, byte[] bArr2) {
        this.f47423b.restoreKeys(bArr, bArr2);
    }

    public void e(byte[] bArr) {
        this.f47423b.provideProvisionResponse(bArr);
    }

    public int f() {
        return 2;
    }

    public boolean h(byte[] bArr, String str) {
        if (M.f44981a >= 31) {
            return a.a(this.f47423b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f47422a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public void i(byte[] bArr) {
        this.f47423b.closeSession(bArr);
    }

    public byte[] j(byte[] bArr, byte[] bArr2) {
        if (C3702j.f45577c.equals(this.f47422a)) {
            bArr2 = C3914a.b(bArr2);
        }
        return this.f47423b.provideKeyResponse(bArr, bArr2);
    }

    public C3912B.a k(byte[] bArr, List list, int i10, HashMap hashMap) {
        m.b bVar;
        String str;
        byte[] bArr2;
        int i11;
        if (list != null) {
            bVar = x(this.f47422a, list);
            bArr2 = r(this.f47422a, (byte[]) C3645a.e(bVar.f47526e));
            str = s(this.f47422a, bVar.f47525d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f47423b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] q10 = q(this.f47422a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f47524c)) {
            defaultUrl = bVar.f47524c;
        }
        if (M.f44981a >= 23) {
            i11 = keyRequest.getRequestType();
        } else {
            i11 = Integer.MIN_VALUE;
        }
        return new C3912B.a(q10, defaultUrl, i11);
    }

    public void l(byte[] bArr, s0 s0Var) {
        if (M.f44981a >= 31) {
            try {
                a.b(this.f47423b, bArr, s0Var);
            } catch (UnsupportedOperationException unused) {
                s.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    public void m(C3912B.b bVar) {
        E e10;
        MediaDrm mediaDrm = this.f47423b;
        if (bVar == null) {
            e10 = null;
        } else {
            e10 = new E(this, bVar);
        }
        mediaDrm.setOnEventListener(e10);
    }

    public synchronized void release() {
        int i10 = this.f47424c - 1;
        this.f47424c = i10;
        if (i10 == 0) {
            this.f47423b.release();
        }
    }

    /* renamed from: u */
    public C3913C g(byte[] bArr) {
        boolean z10;
        if (M.f44981a >= 21 || !C3702j.f45578d.equals(this.f47422a) || !"L3".equals(w("securityLevel"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        return new C3913C(t(this.f47422a), bArr, z10);
    }

    public String w(String str) {
        return this.f47423b.getPropertyString(str);
    }
}
