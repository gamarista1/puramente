package x2;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.C1810h;
import com.google.common.collect.C4770v;
import com.google.common.util.concurrent.h;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import f2.P;
import f2.s;
import i2.C2075C;
import i2.C2076a;
import i2.H;
import i2.L;
import java.nio.ByteBuffer;
import java.util.List;
import l2.f;
import r2.C2559F;
import r2.j;
import r2.l;
import r2.m;
import r2.t;
import r2.w;
import x2.C2900D;
import x2.C2901E;
import x2.C2906d;
import x2.p;

public class k extends t implements p.b {

    /* renamed from: H1  reason: collision with root package name */
    private static final int[] f28293H1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: I1  reason: collision with root package name */
    private static boolean f28294I1;

    /* renamed from: J1  reason: collision with root package name */
    private static boolean f28295J1;

    /* renamed from: A1  reason: collision with root package name */
    private P f28296A1;

    /* renamed from: B1  reason: collision with root package name */
    private P f28297B1;

    /* renamed from: C1  reason: collision with root package name */
    private int f28298C1;

    /* renamed from: D1  reason: collision with root package name */
    private boolean f28299D1;

    /* renamed from: E1  reason: collision with root package name */
    private int f28300E1;

    /* renamed from: F1  reason: collision with root package name */
    d f28301F1;

    /* renamed from: G1  reason: collision with root package name */
    private o f28302G1;

    /* renamed from: a1  reason: collision with root package name */
    private final Context f28303a1;

    /* renamed from: b1  reason: collision with root package name */
    private final C2902F f28304b1;

    /* renamed from: c1  reason: collision with root package name */
    private final boolean f28305c1;

    /* renamed from: d1  reason: collision with root package name */
    private final C2900D.a f28306d1;

    /* renamed from: e1  reason: collision with root package name */
    private final int f28307e1;

    /* renamed from: f1  reason: collision with root package name */
    private final boolean f28308f1;

    /* renamed from: g1  reason: collision with root package name */
    private final p f28309g1;

    /* renamed from: h1  reason: collision with root package name */
    private final p.a f28310h1;

    /* renamed from: i1  reason: collision with root package name */
    private c f28311i1;

    /* renamed from: j1  reason: collision with root package name */
    private boolean f28312j1;

    /* renamed from: k1  reason: collision with root package name */
    private boolean f28313k1;

    /* renamed from: l1  reason: collision with root package name */
    private C2901E f28314l1;

    /* renamed from: m1  reason: collision with root package name */
    private boolean f28315m1;

    /* renamed from: n1  reason: collision with root package name */
    private List f28316n1;
    /* access modifiers changed from: private */

    /* renamed from: o1  reason: collision with root package name */
    public Surface f28317o1;

    /* renamed from: p1  reason: collision with root package name */
    private m f28318p1;

    /* renamed from: q1  reason: collision with root package name */
    private C2075C f28319q1;

    /* renamed from: r1  reason: collision with root package name */
    private boolean f28320r1;

    /* renamed from: s1  reason: collision with root package name */
    private int f28321s1;

    /* renamed from: t1  reason: collision with root package name */
    private long f28322t1;

    /* renamed from: u1  reason: collision with root package name */
    private int f28323u1;

    /* renamed from: v1  reason: collision with root package name */
    private int f28324v1;

    /* renamed from: w1  reason: collision with root package name */
    private int f28325w1;

    /* renamed from: x1  reason: collision with root package name */
    private long f28326x1;

    /* renamed from: y1  reason: collision with root package name */
    private int f28327y1;

    /* renamed from: z1  reason: collision with root package name */
    private long f28328z1;

    private static final class b {
        public static boolean a(Context context) {
            Display display;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            } else {
                display = null;
            }
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    protected static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f28330a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28331b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28332c;

        public c(int i10, int i11, int i12) {
            this.f28330a = i10;
            this.f28331b = i11;
            this.f28332c = i12;
        }
    }

    private final class d implements j.d, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f28333a;

        public d(j jVar) {
            Handler A10 = L.A(this);
            this.f28333a = A10;
            jVar.o(this, A10);
        }

        private void b(long j10) {
            k kVar = k.this;
            if (this == kVar.f28301F1 && kVar.N0() != null) {
                if (j10 == Long.MAX_VALUE) {
                    k.this.E2();
                    return;
                }
                try {
                    k.this.D2(j10);
                } catch (C1810h e10) {
                    k.this.N1(e10);
                }
            }
        }

        public void a(j jVar, long j10, long j11) {
            if (L.f22072a < 30) {
                this.f28333a.sendMessageAtFrontOfQueue(Message.obtain(this.f28333a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            b(j10);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(L.f1(message.arg1, message.arg2));
            return true;
        }
    }

    public k(Context context, j.b bVar, w wVar, long j10, boolean z10, Handler handler, C2900D d10, int i10) {
        this(context, bVar, wVar, j10, z10, handler, d10, i10, 30.0f);
    }

    private void A2() {
        int i10;
        j N02;
        if (this.f28299D1 && (i10 = L.f22072a) >= 23 && (N02 = N0()) != null) {
            this.f28301F1 = new d(N02);
            if (i10 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                N02.b(bundle);
            }
        }
    }

    private void B2(long j10, long j11, s sVar) {
        o oVar = this.f28302G1;
        if (oVar != null) {
            oVar.f(j10, j11, sVar, S0());
        }
    }

    /* access modifiers changed from: private */
    public void C2() {
        this.f28306d1.A(this.f28317o1);
        this.f28320r1 = true;
    }

    /* access modifiers changed from: private */
    public void E2() {
        M1();
    }

    private void G2() {
        Surface surface = this.f28317o1;
        m mVar = this.f28318p1;
        if (surface == mVar) {
            this.f28317o1 = null;
        }
        if (mVar != null) {
            mVar.release();
            this.f28318p1 = null;
        }
    }

    private void I2(j jVar, int i10, long j10, long j11) {
        if (L.f22072a >= 21) {
            J2(jVar, i10, j10, j11);
        } else {
            H2(jVar, i10, j10);
        }
    }

    private static void K2(j jVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        jVar.b(bundle);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void L2(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof android.view.Surface
            r1 = 0
            if (r0 == 0) goto L_0x0008
            android.view.Surface r6 = (android.view.Surface) r6
            goto L_0x0009
        L_0x0008:
            r6 = r1
        L_0x0009:
            if (r6 != 0) goto L_0x0027
            x2.m r0 = r5.f28318p1
            if (r0 == 0) goto L_0x0011
            r6 = r0
            goto L_0x0027
        L_0x0011:
            r2.m r0 = r5.P0()
            if (r0 == 0) goto L_0x0027
            boolean r2 = r5.S2(r0)
            if (r2 == 0) goto L_0x0027
            android.content.Context r6 = r5.f28303a1
            boolean r0 = r0.f25660g
            x2.m r6 = x2.m.c(r6, r0)
            r5.f28318p1 = r6
        L_0x0027:
            android.view.Surface r0 = r5.f28317o1
            if (r0 == r6) goto L_0x007d
            r5.f28317o1 = r6
            x2.E r0 = r5.f28314l1
            if (r0 != 0) goto L_0x0036
            x2.p r0 = r5.f28309g1
            r0.q(r6)
        L_0x0036:
            r0 = 0
            r5.f28320r1 = r0
            int r0 = r5.getState()
            r2.j r2 = r5.N0()
            if (r2 == 0) goto L_0x005d
            x2.E r3 = r5.f28314l1
            if (r3 != 0) goto L_0x005d
            int r3 = i2.L.f22072a
            r4 = 23
            if (r3 < r4) goto L_0x0057
            if (r6 == 0) goto L_0x0057
            boolean r3 = r5.f28312j1
            if (r3 != 0) goto L_0x0057
            r5.M2(r2, r6)
            goto L_0x005d
        L_0x0057:
            r5.E1()
            r5.n1()
        L_0x005d:
            if (r6 == 0) goto L_0x0070
            x2.m r2 = r5.f28318p1
            if (r6 == r2) goto L_0x0070
            r5.y2()
            r6 = 2
            if (r0 != r6) goto L_0x0079
            x2.p r6 = r5.f28309g1
            r0 = 1
            r6.e(r0)
            goto L_0x0079
        L_0x0070:
            r5.f28297B1 = r1
            x2.E r6 = r5.f28314l1
            if (r6 == 0) goto L_0x0079
            r6.u()
        L_0x0079:
            r5.A2()
            goto L_0x0089
        L_0x007d:
            if (r6 == 0) goto L_0x0089
            x2.m r0 = r5.f28318p1
            if (r6 == r0) goto L_0x0089
            r5.y2()
            r5.x2()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.k.L2(java.lang.Object):void");
    }

    private boolean S2(m mVar) {
        if (L.f22072a < 23 || this.f28299D1 || e2(mVar.f25654a) || (mVar.f25660g && !m.b(this.f28303a1))) {
            return false;
        }
        return true;
    }

    private void U2() {
        j N02 = N0();
        if (N02 != null && L.f22072a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f28298C1));
            N02.b(bundle);
        }
    }

    private static boolean d2() {
        if (L.f22072a >= 21) {
            return true;
        }
        return false;
    }

    private static void f2(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean g2() {
        return "NVIDIA".equals(L.f22074c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x073c, code lost:
        if (r11.equals("A10-70L") == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x08a9, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean i2() {
        /*
            r0 = 26
            r1 = 8
            r2 = 27
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = -1
            r10 = 0
            int r11 = i2.L.f22072a
            r12 = 28
            r13 = 1
            if (r11 > r12) goto L_0x0080
            java.lang.String r14 = i2.L.f22073b
            r14.hashCode()
            int r15 = r14.hashCode()
            switch(r15) {
                case -1339091551: goto L_0x0071;
                case -1220081023: goto L_0x0066;
                case -1220066608: goto L_0x005b;
                case -1012436106: goto L_0x0050;
                case -760312546: goto L_0x0045;
                case -64886864: goto L_0x003a;
                case 3415681: goto L_0x002f;
                case 825323514: goto L_0x0024;
                default: goto L_0x0021;
            }
        L_0x0021:
            r14 = r9
            goto L_0x007b
        L_0x0024:
            java.lang.String r15 = "machuca"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r14 = r3
            goto L_0x007b
        L_0x002f:
            java.lang.String r15 = "once"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0038
            goto L_0x0021
        L_0x0038:
            r14 = r4
            goto L_0x007b
        L_0x003a:
            java.lang.String r15 = "magnolia"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0043
            goto L_0x0021
        L_0x0043:
            r14 = r5
            goto L_0x007b
        L_0x0045:
            java.lang.String r15 = "aquaman"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x004e
            goto L_0x0021
        L_0x004e:
            r14 = r6
            goto L_0x007b
        L_0x0050:
            java.lang.String r15 = "oneday"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0059
            goto L_0x0021
        L_0x0059:
            r14 = r7
            goto L_0x007b
        L_0x005b:
            java.lang.String r15 = "dangalUHD"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0064
            goto L_0x0021
        L_0x0064:
            r14 = r8
            goto L_0x007b
        L_0x0066:
            java.lang.String r15 = "dangalFHD"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x006f
            goto L_0x0021
        L_0x006f:
            r14 = r13
            goto L_0x007b
        L_0x0071:
            java.lang.String r15 = "dangal"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x007a
            goto L_0x0021
        L_0x007a:
            r14 = r10
        L_0x007b:
            switch(r14) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007f;
                case 2: goto L_0x007f;
                case 3: goto L_0x007f;
                case 4: goto L_0x007f;
                case 5: goto L_0x007f;
                case 6: goto L_0x007f;
                case 7: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x0080
        L_0x007f:
            return r13
        L_0x0080:
            if (r11 > r2) goto L_0x008d
            java.lang.String r14 = "HWEML"
            java.lang.String r15 = i2.L.f22073b
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x008d
            return r13
        L_0x008d:
            java.lang.String r14 = i2.L.f22075d
            r14.hashCode()
            int r15 = r14.hashCode()
            switch(r15) {
                case -349662828: goto L_0x00f5;
                case -321033677: goto L_0x00ea;
                case 2006354: goto L_0x00df;
                case 2006367: goto L_0x00d4;
                case 2006371: goto L_0x00c9;
                case 1785421873: goto L_0x00be;
                case 1785421876: goto L_0x00b3;
                case 1798172390: goto L_0x00a8;
                case 2119412532: goto L_0x009c;
                default: goto L_0x0099;
            }
        L_0x0099:
            r15 = r9
            goto L_0x00ff
        L_0x009c:
            java.lang.String r15 = "AFTEUFF014"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00a5
            goto L_0x0099
        L_0x00a5:
            r15 = r1
            goto L_0x00ff
        L_0x00a8:
            java.lang.String r15 = "AFTSO001"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00b1
            goto L_0x0099
        L_0x00b1:
            r15 = r3
            goto L_0x00ff
        L_0x00b3:
            java.lang.String r15 = "AFTEU014"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00bc
            goto L_0x0099
        L_0x00bc:
            r15 = r4
            goto L_0x00ff
        L_0x00be:
            java.lang.String r15 = "AFTEU011"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00c7
            goto L_0x0099
        L_0x00c7:
            r15 = r5
            goto L_0x00ff
        L_0x00c9:
            java.lang.String r15 = "AFTR"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00d2
            goto L_0x0099
        L_0x00d2:
            r15 = r6
            goto L_0x00ff
        L_0x00d4:
            java.lang.String r15 = "AFTN"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00dd
            goto L_0x0099
        L_0x00dd:
            r15 = r7
            goto L_0x00ff
        L_0x00df:
            java.lang.String r15 = "AFTA"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00e8
            goto L_0x0099
        L_0x00e8:
            r15 = r8
            goto L_0x00ff
        L_0x00ea:
            java.lang.String r15 = "AFTKMST12"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00f3
            goto L_0x0099
        L_0x00f3:
            r15 = r13
            goto L_0x00ff
        L_0x00f5:
            java.lang.String r15 = "AFTJMST12"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00fe
            goto L_0x0099
        L_0x00fe:
            r15 = r10
        L_0x00ff:
            switch(r15) {
                case 0: goto L_0x08ab;
                case 1: goto L_0x08ab;
                case 2: goto L_0x08ab;
                case 3: goto L_0x08ab;
                case 4: goto L_0x08ab;
                case 5: goto L_0x08ab;
                case 6: goto L_0x08ab;
                case 7: goto L_0x08ab;
                case 8: goto L_0x08ab;
                default: goto L_0x0102;
            }
        L_0x0102:
            if (r11 > r0) goto L_0x08aa
            java.lang.String r11 = i2.L.f22073b
            r11.hashCode()
            int r15 = r11.hashCode()
            switch(r15) {
                case -2144781245: goto L_0x088f;
                case -2144781185: goto L_0x0883;
                case -2144781160: goto L_0x0877;
                case -2097309513: goto L_0x086b;
                case -2022874474: goto L_0x085f;
                case -1978993182: goto L_0x0853;
                case -1978990237: goto L_0x0847;
                case -1936688988: goto L_0x083b;
                case -1936688066: goto L_0x082e;
                case -1936688065: goto L_0x0820;
                case -1931988508: goto L_0x0812;
                case -1885099851: goto L_0x0804;
                case -1696512866: goto L_0x07f6;
                case -1680025915: goto L_0x07e8;
                case -1615810839: goto L_0x07da;
                case -1600724499: goto L_0x07cc;
                case -1554255044: goto L_0x07be;
                case -1481772737: goto L_0x07b0;
                case -1481772730: goto L_0x07a2;
                case -1481772729: goto L_0x0794;
                case -1320080169: goto L_0x0786;
                case -1217592143: goto L_0x0778;
                case -1180384755: goto L_0x076a;
                case -1139198265: goto L_0x075c;
                case -1052835013: goto L_0x074e;
                case -993250464: goto L_0x0740;
                case -993250458: goto L_0x0736;
                case -965403638: goto L_0x0729;
                case -958336948: goto L_0x071c;
                case -879245230: goto L_0x070e;
                case -842500323: goto L_0x0700;
                case -821392978: goto L_0x06f2;
                case -797483286: goto L_0x06e4;
                case -794946968: goto L_0x06d6;
                case -788334647: goto L_0x06c8;
                case -782144577: goto L_0x06ba;
                case -575125681: goto L_0x06ac;
                case -521118391: goto L_0x069e;
                case -430914369: goto L_0x0690;
                case -290434366: goto L_0x0682;
                case -282781963: goto L_0x0674;
                case -277133239: goto L_0x0666;
                case -173639913: goto L_0x0658;
                case -56598463: goto L_0x064a;
                case 2126: goto L_0x063c;
                case 2564: goto L_0x062e;
                case 2715: goto L_0x0620;
                case 2719: goto L_0x0612;
                case 3091: goto L_0x0604;
                case 3483: goto L_0x05f6;
                case 73405: goto L_0x05e8;
                case 75537: goto L_0x05da;
                case 75739: goto L_0x05cc;
                case 76779: goto L_0x05be;
                case 78669: goto L_0x05b0;
                case 79305: goto L_0x05a2;
                case 80618: goto L_0x0594;
                case 88274: goto L_0x0586;
                case 98846: goto L_0x0578;
                case 98848: goto L_0x056a;
                case 99329: goto L_0x055c;
                case 101481: goto L_0x054e;
                case 1513190: goto L_0x0540;
                case 1514184: goto L_0x0532;
                case 1514185: goto L_0x0524;
                case 2133089: goto L_0x0516;
                case 2133091: goto L_0x0508;
                case 2133120: goto L_0x04fa;
                case 2133151: goto L_0x04ec;
                case 2133182: goto L_0x04de;
                case 2133184: goto L_0x04d0;
                case 2436959: goto L_0x04c2;
                case 2463773: goto L_0x04b4;
                case 2464648: goto L_0x04a6;
                case 2689555: goto L_0x0498;
                case 3154429: goto L_0x048a;
                case 3284551: goto L_0x047c;
                case 3351335: goto L_0x046e;
                case 3386211: goto L_0x0460;
                case 41325051: goto L_0x0452;
                case 51349633: goto L_0x0444;
                case 51350594: goto L_0x0436;
                case 55178625: goto L_0x0428;
                case 61542055: goto L_0x041a;
                case 65355429: goto L_0x040c;
                case 66214468: goto L_0x03fe;
                case 66214470: goto L_0x03f0;
                case 66214473: goto L_0x03e2;
                case 66215429: goto L_0x03d4;
                case 66215431: goto L_0x03c6;
                case 66215433: goto L_0x03b8;
                case 66216390: goto L_0x03aa;
                case 76402249: goto L_0x039c;
                case 76404105: goto L_0x038e;
                case 76404911: goto L_0x0380;
                case 80963634: goto L_0x0372;
                case 82882791: goto L_0x0364;
                case 98715550: goto L_0x0356;
                case 101370885: goto L_0x0348;
                case 102844228: goto L_0x033a;
                case 165221241: goto L_0x032c;
                case 182191441: goto L_0x031e;
                case 245388979: goto L_0x0310;
                case 287431619: goto L_0x0302;
                case 307593612: goto L_0x02f4;
                case 308517133: goto L_0x02e6;
                case 316215098: goto L_0x02d8;
                case 316215116: goto L_0x02ca;
                case 316246811: goto L_0x02bc;
                case 316246818: goto L_0x02ae;
                case 407160593: goto L_0x02a0;
                case 507412548: goto L_0x0292;
                case 793982701: goto L_0x0284;
                case 794038622: goto L_0x0276;
                case 794040393: goto L_0x0268;
                case 835649806: goto L_0x025a;
                case 917340916: goto L_0x024c;
                case 958008161: goto L_0x023e;
                case 1060579533: goto L_0x0230;
                case 1150207623: goto L_0x0222;
                case 1176899427: goto L_0x0214;
                case 1280332038: goto L_0x0206;
                case 1306947716: goto L_0x01f8;
                case 1349174697: goto L_0x01ea;
                case 1522194893: goto L_0x01dc;
                case 1691543273: goto L_0x01ce;
                case 1691544261: goto L_0x01c0;
                case 1709443163: goto L_0x01b2;
                case 1865889110: goto L_0x01a4;
                case 1906253259: goto L_0x0196;
                case 1977196784: goto L_0x0188;
                case 2006372676: goto L_0x017b;
                case 2019281702: goto L_0x016e;
                case 2029784656: goto L_0x0161;
                case 2030379515: goto L_0x0154;
                case 2033393791: goto L_0x0147;
                case 2047190025: goto L_0x013a;
                case 2047252157: goto L_0x012d;
                case 2048319463: goto L_0x0120;
                case 2048855701: goto L_0x0113;
                default: goto L_0x0110;
            }
        L_0x0110:
            r0 = r9
            goto L_0x089a
        L_0x0113:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x011c
            goto L_0x0110
        L_0x011c:
            r0 = 139(0x8b, float:1.95E-43)
            goto L_0x089a
        L_0x0120:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0129
            goto L_0x0110
        L_0x0129:
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x089a
        L_0x012d:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0136
            goto L_0x0110
        L_0x0136:
            r0 = 137(0x89, float:1.92E-43)
            goto L_0x089a
        L_0x013a:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0143
            goto L_0x0110
        L_0x0143:
            r0 = 136(0x88, float:1.9E-43)
            goto L_0x089a
        L_0x0147:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0150
            goto L_0x0110
        L_0x0150:
            r0 = 135(0x87, float:1.89E-43)
            goto L_0x089a
        L_0x0154:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x015d
            goto L_0x0110
        L_0x015d:
            r0 = 134(0x86, float:1.88E-43)
            goto L_0x089a
        L_0x0161:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x016a
            goto L_0x0110
        L_0x016a:
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x089a
        L_0x016e:
            java.lang.String r0 = "DM-01K"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0177
            goto L_0x0110
        L_0x0177:
            r0 = 132(0x84, float:1.85E-43)
            goto L_0x089a
        L_0x017b:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0184
            goto L_0x0110
        L_0x0184:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x089a
        L_0x0188:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0192
            goto L_0x0110
        L_0x0192:
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x089a
        L_0x0196:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01a0
            goto L_0x0110
        L_0x01a0:
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x089a
        L_0x01a4:
            java.lang.String r0 = "santoni"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01ae
            goto L_0x0110
        L_0x01ae:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x089a
        L_0x01b2:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01bc
            goto L_0x0110
        L_0x01bc:
            r0 = 127(0x7f, float:1.78E-43)
            goto L_0x089a
        L_0x01c0:
            java.lang.String r0 = "CPH1715"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01ca
            goto L_0x0110
        L_0x01ca:
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x089a
        L_0x01ce:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01d8
            goto L_0x0110
        L_0x01d8:
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x089a
        L_0x01dc:
            java.lang.String r0 = "woods_f"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01e6
            goto L_0x0110
        L_0x01e6:
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x089a
        L_0x01ea:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01f4
            goto L_0x0110
        L_0x01f4:
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x089a
        L_0x01f8:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0202
            goto L_0x0110
        L_0x0202:
            r0 = 122(0x7a, float:1.71E-43)
            goto L_0x089a
        L_0x0206:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0210
            goto L_0x0110
        L_0x0210:
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x089a
        L_0x0214:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x021e
            goto L_0x0110
        L_0x021e:
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x089a
        L_0x0222:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x022c
            goto L_0x0110
        L_0x022c:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x089a
        L_0x0230:
            java.lang.String r0 = "panell_d"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x023a
            goto L_0x0110
        L_0x023a:
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x089a
        L_0x023e:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0248
            goto L_0x0110
        L_0x0248:
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x089a
        L_0x024c:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0256
            goto L_0x0110
        L_0x0256:
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x089a
        L_0x025a:
            java.lang.String r0 = "manning"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0264
            goto L_0x0110
        L_0x0264:
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x089a
        L_0x0268:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0272
            goto L_0x0110
        L_0x0272:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x089a
        L_0x0276:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0280
            goto L_0x0110
        L_0x0280:
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x089a
        L_0x0284:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x028e
            goto L_0x0110
        L_0x028e:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x089a
        L_0x0292:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x029c
            goto L_0x0110
        L_0x029c:
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x089a
        L_0x02a0:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02aa
            goto L_0x0110
        L_0x02aa:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x089a
        L_0x02ae:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02b8
            goto L_0x0110
        L_0x02b8:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x089a
        L_0x02bc:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02c6
            goto L_0x0110
        L_0x02c6:
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x089a
        L_0x02ca:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02d4
            goto L_0x0110
        L_0x02d4:
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x089a
        L_0x02d8:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02e2
            goto L_0x0110
        L_0x02e2:
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x089a
        L_0x02e6:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02f0
            goto L_0x0110
        L_0x02f0:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x089a
        L_0x02f4:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02fe
            goto L_0x0110
        L_0x02fe:
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x089a
        L_0x0302:
            java.lang.String r0 = "griffin"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x030c
            goto L_0x0110
        L_0x030c:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x089a
        L_0x0310:
            java.lang.String r0 = "marino_f"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x031a
            goto L_0x0110
        L_0x031a:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x089a
        L_0x031e:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0328
            goto L_0x0110
        L_0x0328:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x089a
        L_0x032c:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0336
            goto L_0x0110
        L_0x0336:
            r0 = 100
            goto L_0x089a
        L_0x033a:
            java.lang.String r0 = "le_x6"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0344
            goto L_0x0110
        L_0x0344:
            r0 = 99
            goto L_0x089a
        L_0x0348:
            java.lang.String r0 = "l5460"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0352
            goto L_0x0110
        L_0x0352:
            r0 = 98
            goto L_0x089a
        L_0x0356:
            java.lang.String r0 = "i9031"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0360
            goto L_0x0110
        L_0x0360:
            r0 = 97
            goto L_0x089a
        L_0x0364:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x036e
            goto L_0x0110
        L_0x036e:
            r0 = 96
            goto L_0x089a
        L_0x0372:
            java.lang.String r0 = "V23GB"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x037c
            goto L_0x0110
        L_0x037c:
            r0 = 95
            goto L_0x089a
        L_0x0380:
            java.lang.String r0 = "Q4310"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x038a
            goto L_0x0110
        L_0x038a:
            r0 = 94
            goto L_0x089a
        L_0x038e:
            java.lang.String r0 = "Q4260"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0398
            goto L_0x0110
        L_0x0398:
            r0 = 93
            goto L_0x089a
        L_0x039c:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03a6
            goto L_0x0110
        L_0x03a6:
            r0 = 92
            goto L_0x089a
        L_0x03aa:
            java.lang.String r0 = "F3311"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03b4
            goto L_0x0110
        L_0x03b4:
            r0 = 91
            goto L_0x089a
        L_0x03b8:
            java.lang.String r0 = "F3215"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03c2
            goto L_0x0110
        L_0x03c2:
            r0 = 90
            goto L_0x089a
        L_0x03c6:
            java.lang.String r0 = "F3213"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03d0
            goto L_0x0110
        L_0x03d0:
            r0 = 89
            goto L_0x089a
        L_0x03d4:
            java.lang.String r0 = "F3211"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03de
            goto L_0x0110
        L_0x03de:
            r0 = 88
            goto L_0x089a
        L_0x03e2:
            java.lang.String r0 = "F3116"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03ec
            goto L_0x0110
        L_0x03ec:
            r0 = 87
            goto L_0x089a
        L_0x03f0:
            java.lang.String r0 = "F3113"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03fa
            goto L_0x0110
        L_0x03fa:
            r0 = 86
            goto L_0x089a
        L_0x03fe:
            java.lang.String r0 = "F3111"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0408
            goto L_0x0110
        L_0x0408:
            r0 = 85
            goto L_0x089a
        L_0x040c:
            java.lang.String r0 = "E5643"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0416
            goto L_0x0110
        L_0x0416:
            r0 = 84
            goto L_0x089a
        L_0x041a:
            java.lang.String r0 = "A1601"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0424
            goto L_0x0110
        L_0x0424:
            r0 = 83
            goto L_0x089a
        L_0x0428:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0432
            goto L_0x0110
        L_0x0432:
            r0 = 82
            goto L_0x089a
        L_0x0436:
            java.lang.String r0 = "602LV"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0440
            goto L_0x0110
        L_0x0440:
            r0 = 81
            goto L_0x089a
        L_0x0444:
            java.lang.String r0 = "601LV"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x044e
            goto L_0x0110
        L_0x044e:
            r0 = 80
            goto L_0x089a
        L_0x0452:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x045c
            goto L_0x0110
        L_0x045c:
            r0 = 79
            goto L_0x089a
        L_0x0460:
            java.lang.String r0 = "p212"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x046a
            goto L_0x0110
        L_0x046a:
            r0 = 78
            goto L_0x089a
        L_0x046e:
            java.lang.String r0 = "mido"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0478
            goto L_0x0110
        L_0x0478:
            r0 = 77
            goto L_0x089a
        L_0x047c:
            java.lang.String r0 = "kate"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0486
            goto L_0x0110
        L_0x0486:
            r0 = 76
            goto L_0x089a
        L_0x048a:
            java.lang.String r0 = "fugu"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0494
            goto L_0x0110
        L_0x0494:
            r0 = 75
            goto L_0x089a
        L_0x0498:
            java.lang.String r0 = "XE2X"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04a2
            goto L_0x0110
        L_0x04a2:
            r0 = 74
            goto L_0x089a
        L_0x04a6:
            java.lang.String r0 = "Q427"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04b0
            goto L_0x0110
        L_0x04b0:
            r0 = 73
            goto L_0x089a
        L_0x04b4:
            java.lang.String r0 = "Q350"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04be
            goto L_0x0110
        L_0x04be:
            r0 = 72
            goto L_0x089a
        L_0x04c2:
            java.lang.String r0 = "P681"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04cc
            goto L_0x0110
        L_0x04cc:
            r0 = 71
            goto L_0x089a
        L_0x04d0:
            java.lang.String r0 = "F04J"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04da
            goto L_0x0110
        L_0x04da:
            r0 = 70
            goto L_0x089a
        L_0x04de:
            java.lang.String r0 = "F04H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04e8
            goto L_0x0110
        L_0x04e8:
            r0 = 69
            goto L_0x089a
        L_0x04ec:
            java.lang.String r0 = "F03H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04f6
            goto L_0x0110
        L_0x04f6:
            r0 = 68
            goto L_0x089a
        L_0x04fa:
            java.lang.String r0 = "F02H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0504
            goto L_0x0110
        L_0x0504:
            r0 = 67
            goto L_0x089a
        L_0x0508:
            java.lang.String r0 = "F01J"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0512
            goto L_0x0110
        L_0x0512:
            r0 = 66
            goto L_0x089a
        L_0x0516:
            java.lang.String r0 = "F01H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0520
            goto L_0x0110
        L_0x0520:
            r0 = 65
            goto L_0x089a
        L_0x0524:
            java.lang.String r0 = "1714"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x052e
            goto L_0x0110
        L_0x052e:
            r0 = 64
            goto L_0x089a
        L_0x0532:
            java.lang.String r0 = "1713"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x053c
            goto L_0x0110
        L_0x053c:
            r0 = 63
            goto L_0x089a
        L_0x0540:
            java.lang.String r0 = "1601"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x054a
            goto L_0x0110
        L_0x054a:
            r0 = 62
            goto L_0x089a
        L_0x054e:
            java.lang.String r0 = "flo"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0558
            goto L_0x0110
        L_0x0558:
            r0 = 61
            goto L_0x089a
        L_0x055c:
            java.lang.String r0 = "deb"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0566
            goto L_0x0110
        L_0x0566:
            r0 = 60
            goto L_0x089a
        L_0x056a:
            java.lang.String r0 = "cv3"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0574
            goto L_0x0110
        L_0x0574:
            r0 = 59
            goto L_0x089a
        L_0x0578:
            java.lang.String r0 = "cv1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0582
            goto L_0x0110
        L_0x0582:
            r0 = 58
            goto L_0x089a
        L_0x0586:
            java.lang.String r0 = "Z80"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0590
            goto L_0x0110
        L_0x0590:
            r0 = 57
            goto L_0x089a
        L_0x0594:
            java.lang.String r0 = "QX1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x059e
            goto L_0x0110
        L_0x059e:
            r0 = 56
            goto L_0x089a
        L_0x05a2:
            java.lang.String r0 = "PLE"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05ac
            goto L_0x0110
        L_0x05ac:
            r0 = 55
            goto L_0x089a
        L_0x05b0:
            java.lang.String r0 = "P85"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05ba
            goto L_0x0110
        L_0x05ba:
            r0 = 54
            goto L_0x089a
        L_0x05be:
            java.lang.String r0 = "MX6"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05c8
            goto L_0x0110
        L_0x05c8:
            r0 = 53
            goto L_0x089a
        L_0x05cc:
            java.lang.String r0 = "M5c"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05d6
            goto L_0x0110
        L_0x05d6:
            r0 = 52
            goto L_0x089a
        L_0x05da:
            java.lang.String r0 = "M04"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05e4
            goto L_0x0110
        L_0x05e4:
            r0 = 51
            goto L_0x089a
        L_0x05e8:
            java.lang.String r0 = "JGZ"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05f2
            goto L_0x0110
        L_0x05f2:
            r0 = 50
            goto L_0x089a
        L_0x05f6:
            java.lang.String r0 = "mh"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0600
            goto L_0x0110
        L_0x0600:
            r0 = 49
            goto L_0x089a
        L_0x0604:
            java.lang.String r0 = "b5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x060e
            goto L_0x0110
        L_0x060e:
            r0 = 48
            goto L_0x089a
        L_0x0612:
            java.lang.String r0 = "V5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x061c
            goto L_0x0110
        L_0x061c:
            r0 = 47
            goto L_0x089a
        L_0x0620:
            java.lang.String r0 = "V1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x062a
            goto L_0x0110
        L_0x062a:
            r0 = 46
            goto L_0x089a
        L_0x062e:
            java.lang.String r0 = "Q5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0638
            goto L_0x0110
        L_0x0638:
            r0 = 45
            goto L_0x089a
        L_0x063c:
            java.lang.String r0 = "C1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0646
            goto L_0x0110
        L_0x0646:
            r0 = 44
            goto L_0x089a
        L_0x064a:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0654
            goto L_0x0110
        L_0x0654:
            r0 = 43
            goto L_0x089a
        L_0x0658:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0662
            goto L_0x0110
        L_0x0662:
            r0 = 42
            goto L_0x089a
        L_0x0666:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0670
            goto L_0x0110
        L_0x0670:
            r0 = 41
            goto L_0x089a
        L_0x0674:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x067e
            goto L_0x0110
        L_0x067e:
            r0 = 40
            goto L_0x089a
        L_0x0682:
            java.lang.String r0 = "taido_row"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x068c
            goto L_0x0110
        L_0x068c:
            r0 = 39
            goto L_0x089a
        L_0x0690:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x069a
            goto L_0x0110
        L_0x069a:
            r0 = 38
            goto L_0x089a
        L_0x069e:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06a8
            goto L_0x0110
        L_0x06a8:
            r0 = 37
            goto L_0x089a
        L_0x06ac:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06b6
            goto L_0x0110
        L_0x06b6:
            r0 = 36
            goto L_0x089a
        L_0x06ba:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06c4
            goto L_0x0110
        L_0x06c4:
            r0 = 35
            goto L_0x089a
        L_0x06c8:
            java.lang.String r0 = "whyred"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06d2
            goto L_0x0110
        L_0x06d2:
            r0 = 34
            goto L_0x089a
        L_0x06d6:
            java.lang.String r0 = "watson"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06e0
            goto L_0x0110
        L_0x06e0:
            r0 = 33
            goto L_0x089a
        L_0x06e4:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06ee
            goto L_0x0110
        L_0x06ee:
            r0 = 32
            goto L_0x089a
        L_0x06f2:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06fc
            goto L_0x0110
        L_0x06fc:
            r0 = 31
            goto L_0x089a
        L_0x0700:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x070a
            goto L_0x0110
        L_0x070a:
            r0 = 30
            goto L_0x089a
        L_0x070e:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0718
            goto L_0x0110
        L_0x0718:
            r0 = 29
            goto L_0x089a
        L_0x071c:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0726
            goto L_0x0110
        L_0x0726:
            r0 = r12
            goto L_0x089a
        L_0x0729:
            java.lang.String r0 = "s905x018"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0733
            goto L_0x0110
        L_0x0733:
            r0 = r2
            goto L_0x089a
        L_0x0736:
            java.lang.String r1 = "A10-70L"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x089a
            goto L_0x0110
        L_0x0740:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x074a
            goto L_0x0110
        L_0x074a:
            r0 = 25
            goto L_0x089a
        L_0x074e:
            java.lang.String r0 = "namath"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0758
            goto L_0x0110
        L_0x0758:
            r0 = 24
            goto L_0x089a
        L_0x075c:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0766
            goto L_0x0110
        L_0x0766:
            r0 = 23
            goto L_0x089a
        L_0x076a:
            java.lang.String r0 = "iris60"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0774
            goto L_0x0110
        L_0x0774:
            r0 = 22
            goto L_0x089a
        L_0x0778:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0782
            goto L_0x0110
        L_0x0782:
            r0 = 21
            goto L_0x089a
        L_0x0786:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0790
            goto L_0x0110
        L_0x0790:
            r0 = 20
            goto L_0x089a
        L_0x0794:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x079e
            goto L_0x0110
        L_0x079e:
            r0 = 19
            goto L_0x089a
        L_0x07a2:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07ac
            goto L_0x0110
        L_0x07ac:
            r0 = 18
            goto L_0x089a
        L_0x07b0:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07ba
            goto L_0x0110
        L_0x07ba:
            r0 = 17
            goto L_0x089a
        L_0x07be:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07c8
            goto L_0x0110
        L_0x07c8:
            r0 = 16
            goto L_0x089a
        L_0x07cc:
            java.lang.String r0 = "pacificrim"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07d6
            goto L_0x0110
        L_0x07d6:
            r0 = 15
            goto L_0x089a
        L_0x07da:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07e4
            goto L_0x0110
        L_0x07e4:
            r0 = 14
            goto L_0x089a
        L_0x07e8:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07f2
            goto L_0x0110
        L_0x07f2:
            r0 = 13
            goto L_0x089a
        L_0x07f6:
            java.lang.String r0 = "XT1663"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0800
            goto L_0x0110
        L_0x0800:
            r0 = 12
            goto L_0x089a
        L_0x0804:
            java.lang.String r0 = "RAIJIN"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x080e
            goto L_0x0110
        L_0x080e:
            r0 = 11
            goto L_0x089a
        L_0x0812:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x081c
            goto L_0x0110
        L_0x081c:
            r0 = 10
            goto L_0x089a
        L_0x0820:
            java.lang.String r0 = "PGN611"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x082a
            goto L_0x0110
        L_0x082a:
            r0 = 9
            goto L_0x089a
        L_0x082e:
            java.lang.String r0 = "PGN610"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0838
            goto L_0x0110
        L_0x0838:
            r0 = r1
            goto L_0x089a
        L_0x083b:
            java.lang.String r0 = "PGN528"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0845
            goto L_0x0110
        L_0x0845:
            r0 = r3
            goto L_0x089a
        L_0x0847:
            java.lang.String r0 = "NX573J"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0851
            goto L_0x0110
        L_0x0851:
            r0 = r4
            goto L_0x089a
        L_0x0853:
            java.lang.String r0 = "NX541J"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x085d
            goto L_0x0110
        L_0x085d:
            r0 = r5
            goto L_0x089a
        L_0x085f:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0869
            goto L_0x0110
        L_0x0869:
            r0 = r6
            goto L_0x089a
        L_0x086b:
            java.lang.String r0 = "K50a40"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0875
            goto L_0x0110
        L_0x0875:
            r0 = r7
            goto L_0x089a
        L_0x0877:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0881
            goto L_0x0110
        L_0x0881:
            r0 = r8
            goto L_0x089a
        L_0x0883:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x088d
            goto L_0x0110
        L_0x088d:
            r0 = r13
            goto L_0x089a
        L_0x088f:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0899
            goto L_0x0110
        L_0x0899:
            r0 = r10
        L_0x089a:
            switch(r0) {
                case 0: goto L_0x08a9;
                case 1: goto L_0x08a9;
                case 2: goto L_0x08a9;
                case 3: goto L_0x08a9;
                case 4: goto L_0x08a9;
                case 5: goto L_0x08a9;
                case 6: goto L_0x08a9;
                case 7: goto L_0x08a9;
                case 8: goto L_0x08a9;
                case 9: goto L_0x08a9;
                case 10: goto L_0x08a9;
                case 11: goto L_0x08a9;
                case 12: goto L_0x08a9;
                case 13: goto L_0x08a9;
                case 14: goto L_0x08a9;
                case 15: goto L_0x08a9;
                case 16: goto L_0x08a9;
                case 17: goto L_0x08a9;
                case 18: goto L_0x08a9;
                case 19: goto L_0x08a9;
                case 20: goto L_0x08a9;
                case 21: goto L_0x08a9;
                case 22: goto L_0x08a9;
                case 23: goto L_0x08a9;
                case 24: goto L_0x08a9;
                case 25: goto L_0x08a9;
                case 26: goto L_0x08a9;
                case 27: goto L_0x08a9;
                case 28: goto L_0x08a9;
                case 29: goto L_0x08a9;
                case 30: goto L_0x08a9;
                case 31: goto L_0x08a9;
                case 32: goto L_0x08a9;
                case 33: goto L_0x08a9;
                case 34: goto L_0x08a9;
                case 35: goto L_0x08a9;
                case 36: goto L_0x08a9;
                case 37: goto L_0x08a9;
                case 38: goto L_0x08a9;
                case 39: goto L_0x08a9;
                case 40: goto L_0x08a9;
                case 41: goto L_0x08a9;
                case 42: goto L_0x08a9;
                case 43: goto L_0x08a9;
                case 44: goto L_0x08a9;
                case 45: goto L_0x08a9;
                case 46: goto L_0x08a9;
                case 47: goto L_0x08a9;
                case 48: goto L_0x08a9;
                case 49: goto L_0x08a9;
                case 50: goto L_0x08a9;
                case 51: goto L_0x08a9;
                case 52: goto L_0x08a9;
                case 53: goto L_0x08a9;
                case 54: goto L_0x08a9;
                case 55: goto L_0x08a9;
                case 56: goto L_0x08a9;
                case 57: goto L_0x08a9;
                case 58: goto L_0x08a9;
                case 59: goto L_0x08a9;
                case 60: goto L_0x08a9;
                case 61: goto L_0x08a9;
                case 62: goto L_0x08a9;
                case 63: goto L_0x08a9;
                case 64: goto L_0x08a9;
                case 65: goto L_0x08a9;
                case 66: goto L_0x08a9;
                case 67: goto L_0x08a9;
                case 68: goto L_0x08a9;
                case 69: goto L_0x08a9;
                case 70: goto L_0x08a9;
                case 71: goto L_0x08a9;
                case 72: goto L_0x08a9;
                case 73: goto L_0x08a9;
                case 74: goto L_0x08a9;
                case 75: goto L_0x08a9;
                case 76: goto L_0x08a9;
                case 77: goto L_0x08a9;
                case 78: goto L_0x08a9;
                case 79: goto L_0x08a9;
                case 80: goto L_0x08a9;
                case 81: goto L_0x08a9;
                case 82: goto L_0x08a9;
                case 83: goto L_0x08a9;
                case 84: goto L_0x08a9;
                case 85: goto L_0x08a9;
                case 86: goto L_0x08a9;
                case 87: goto L_0x08a9;
                case 88: goto L_0x08a9;
                case 89: goto L_0x08a9;
                case 90: goto L_0x08a9;
                case 91: goto L_0x08a9;
                case 92: goto L_0x08a9;
                case 93: goto L_0x08a9;
                case 94: goto L_0x08a9;
                case 95: goto L_0x08a9;
                case 96: goto L_0x08a9;
                case 97: goto L_0x08a9;
                case 98: goto L_0x08a9;
                case 99: goto L_0x08a9;
                case 100: goto L_0x08a9;
                case 101: goto L_0x08a9;
                case 102: goto L_0x08a9;
                case 103: goto L_0x08a9;
                case 104: goto L_0x08a9;
                case 105: goto L_0x08a9;
                case 106: goto L_0x08a9;
                case 107: goto L_0x08a9;
                case 108: goto L_0x08a9;
                case 109: goto L_0x08a9;
                case 110: goto L_0x08a9;
                case 111: goto L_0x08a9;
                case 112: goto L_0x08a9;
                case 113: goto L_0x08a9;
                case 114: goto L_0x08a9;
                case 115: goto L_0x08a9;
                case 116: goto L_0x08a9;
                case 117: goto L_0x08a9;
                case 118: goto L_0x08a9;
                case 119: goto L_0x08a9;
                case 120: goto L_0x08a9;
                case 121: goto L_0x08a9;
                case 122: goto L_0x08a9;
                case 123: goto L_0x08a9;
                case 124: goto L_0x08a9;
                case 125: goto L_0x08a9;
                case 126: goto L_0x08a9;
                case 127: goto L_0x08a9;
                case 128: goto L_0x08a9;
                case 129: goto L_0x08a9;
                case 130: goto L_0x08a9;
                case 131: goto L_0x08a9;
                case 132: goto L_0x08a9;
                case 133: goto L_0x08a9;
                case 134: goto L_0x08a9;
                case 135: goto L_0x08a9;
                case 136: goto L_0x08a9;
                case 137: goto L_0x08a9;
                case 138: goto L_0x08a9;
                case 139: goto L_0x08a9;
                default: goto L_0x089d;
            }
        L_0x089d:
            r14.hashCode()
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x08a9
            goto L_0x08aa
        L_0x08a9:
            return r13
        L_0x08aa:
            return r10
        L_0x08ab:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.k.i2():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r8.equals("video/av01") == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int k2(r2.m r10, f2.s r11) {
        /*
            r0 = 4
            java.lang.String r1 = "video/hevc"
            java.lang.String r2 = "video/avc"
            r3 = 1
            r4 = 2
            int r5 = r11.f20089t
            int r6 = r11.f20090u
            r7 = -1
            if (r5 == r7) goto L_0x00e5
            if (r6 != r7) goto L_0x0012
            goto L_0x00e5
        L_0x0012:
            java.lang.String r8 = r11.f20083n
            java.lang.Object r8 = i2.C2076a.e(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "video/dolby-vision"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x003b
            android.util.Pair r11 = r2.C2559F.r(r11)
            if (r11 == 0) goto L_0x003a
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8 = 512(0x200, float:7.175E-43)
            if (r11 == r8) goto L_0x0038
            if (r11 == r3) goto L_0x0038
            if (r11 != r4) goto L_0x003a
        L_0x0038:
            r8 = r2
            goto L_0x003b
        L_0x003a:
            r8 = r1
        L_0x003b:
            r8.hashCode()
            int r11 = r8.hashCode()
            switch(r11) {
                case -1664118616: goto L_0x0083;
                case -1662735862: goto L_0x007a;
                case -1662541442: goto L_0x0071;
                case 1187890754: goto L_0x0066;
                case 1331836730: goto L_0x005d;
                case 1599127256: goto L_0x0052;
                case 1599127257: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            r3 = r7
            goto L_0x008d
        L_0x0047:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x0050
            goto L_0x0045
        L_0x0050:
            r3 = 6
            goto L_0x008d
        L_0x0052:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x005b
            goto L_0x0045
        L_0x005b:
            r3 = 5
            goto L_0x008d
        L_0x005d:
            boolean r11 = r8.equals(r2)
            if (r11 != 0) goto L_0x0064
            goto L_0x0045
        L_0x0064:
            r3 = r0
            goto L_0x008d
        L_0x0066:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x006f
            goto L_0x0045
        L_0x006f:
            r3 = 3
            goto L_0x008d
        L_0x0071:
            boolean r11 = r8.equals(r1)
            if (r11 != 0) goto L_0x0078
            goto L_0x0045
        L_0x0078:
            r3 = r4
            goto L_0x008d
        L_0x007a:
            java.lang.String r11 = "video/av01"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x008d
            goto L_0x0045
        L_0x0083:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x008c
            goto L_0x0045
        L_0x008c:
            r3 = 0
        L_0x008d:
            switch(r3) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00df;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00df;
                case 4: goto L_0x0097;
                case 5: goto L_0x00df;
                case 6: goto L_0x0091;
                default: goto L_0x0090;
            }
        L_0x0090:
            return r7
        L_0x0091:
            int r5 = r5 * r6
            int r10 = p2(r5, r0)
            return r10
        L_0x0097:
            java.lang.String r11 = i2.L.f22075d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = i2.L.f22074c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "AFTS"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x00c0
            boolean r10 = r10.f25660g
            if (r10 == 0) goto L_0x00c0
            goto L_0x00d2
        L_0x00c0:
            r10 = 16
            int r11 = i2.L.j(r5, r10)
            int r10 = i2.L.j(r6, r10)
            int r11 = r11 * r10
            int r11 = r11 * 256
            int r10 = p2(r11, r4)
            return r10
        L_0x00d2:
            return r7
        L_0x00d3:
            int r5 = r5 * r6
            int r10 = p2(r5, r4)
            r11 = 2097152(0x200000, float:2.938736E-39)
            int r10 = java.lang.Math.max(r11, r10)
            return r10
        L_0x00df:
            int r5 = r5 * r6
            int r10 = p2(r5, r4)
            return r10
        L_0x00e5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.k.k2(r2.m, f2.s):int");
    }

    private static Point l2(m mVar, s sVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13 = sVar.f20090u;
        int i14 = sVar.f20089t;
        if (i13 > i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = i13;
        } else {
            i10 = i14;
        }
        if (z10) {
            i13 = i14;
        }
        float f10 = ((float) i13) / ((float) i10);
        for (int i15 : f28293H1) {
            int i16 = (int) (((float) i15) * f10);
            if (i15 <= i10 || i16 <= i13) {
                break;
            }
            if (L.f22072a >= 21) {
                if (z10) {
                    i12 = i16;
                } else {
                    i12 = i15;
                }
                if (!z10) {
                    i15 = i16;
                }
                Point b10 = mVar.b(i12, i15);
                float f11 = sVar.f20091v;
                if (b10 != null && mVar.u(b10.x, b10.y, (double) f11)) {
                    return b10;
                }
            } else {
                try {
                    int j10 = L.j(i15, 16) * 16;
                    int j11 = L.j(i16, 16) * 16;
                    if (j10 * j11 <= C2559F.P()) {
                        if (z10) {
                            i11 = j11;
                        } else {
                            i11 = j10;
                        }
                        if (!z10) {
                            j10 = j11;
                        }
                        return new Point(i11, j10);
                    }
                } catch (C2559F.c unused) {
                }
            }
        }
        return null;
    }

    private static List n2(Context context, w wVar, s sVar, boolean z10, boolean z11) {
        String str = sVar.f20083n;
        if (str == null) {
            return C4770v.E();
        }
        if (L.f22072a >= 26 && "video/dolby-vision".equals(str) && !b.a(context)) {
            List n10 = C2559F.n(wVar, sVar, z10, z11);
            if (!n10.isEmpty()) {
                return n10;
            }
        }
        return C2559F.v(wVar, sVar, z10, z11);
    }

    protected static int o2(m mVar, s sVar) {
        if (sVar.f20084o == -1) {
            return k2(mVar, sVar);
        }
        int size = sVar.f20086q.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((byte[]) sVar.f20086q.get(i11)).length;
        }
        return sVar.f20084o + i10;
    }

    private static int p2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private void s2() {
        if (this.f28323u1 > 0) {
            long a10 = T().a();
            this.f28306d1.n(this.f28323u1, a10 - this.f28322t1);
            this.f28323u1 = 0;
            this.f28322t1 = a10;
        }
    }

    private void t2() {
        if (this.f28309g1.i() && this.f28317o1 != null) {
            C2();
        }
    }

    private void u2() {
        int i10 = this.f28327y1;
        if (i10 != 0) {
            this.f28306d1.B(this.f28326x1, i10);
            this.f28326x1 = 0;
            this.f28327y1 = 0;
        }
    }

    private void v2(P p10) {
        if (!p10.equals(P.f19906e) && !p10.equals(this.f28297B1)) {
            this.f28297B1 = p10;
            this.f28306d1.D(p10);
        }
    }

    private boolean w2(j jVar, int i10, long j10, s sVar) {
        long g10 = this.f28310h1.g();
        long f10 = this.f28310h1.f();
        if (L.f22072a >= 21) {
            if (!R2() || g10 != this.f28328z1) {
                B2(j10, g10, sVar);
                J2(jVar, i10, j10, g10);
            } else {
                T2(jVar, i10, j10);
            }
            W2(f10);
            this.f28328z1 = g10;
            return true;
        } else if (f10 >= 30000) {
            return false;
        } else {
            if (f10 > 11000) {
                try {
                    Thread.sleep((f10 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            B2(j10, g10, sVar);
            H2(jVar, i10, j10);
            W2(f10);
            return true;
        }
    }

    private void x2() {
        Surface surface = this.f28317o1;
        if (surface != null && this.f28320r1) {
            this.f28306d1.A(surface);
        }
    }

    private void y2() {
        P p10 = this.f28297B1;
        if (p10 != null) {
            this.f28306d1.D(p10);
        }
    }

    private void z2(MediaFormat mediaFormat) {
        C2901E e10 = this.f28314l1;
        if (e10 != null && !e10.n()) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
    }

    /* access modifiers changed from: protected */
    public boolean A1(long j10, long j11, j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, s sVar) {
        j jVar2 = jVar;
        int i13 = i10;
        boolean z12 = z11;
        C2076a.e(jVar);
        long X02 = j12 - X0();
        int c10 = this.f28309g1.c(j12, j10, j11, Y0(), z11, this.f28310h1);
        if (c10 == 4) {
            return false;
        }
        if (!z10 || z12) {
            long j13 = X02;
            if (this.f28317o1 != this.f28318p1 || this.f28314l1 != null) {
                C2901E e10 = this.f28314l1;
                if (e10 != null) {
                    try {
                        e10.g(j10, j11);
                        long i14 = this.f28314l1.i(j12 + j2(), z12);
                        if (i14 == -9223372036854775807L) {
                            return false;
                        }
                        I2(jVar, i10, j13, i14);
                        return true;
                    } catch (C2901E.b e11) {
                        C2901E.b bVar = e11;
                        throw R(bVar, bVar.f28226a, 7001);
                    }
                } else if (c10 == 0) {
                    long b10 = T().b();
                    B2(j13, b10, sVar);
                    I2(jVar, i10, j13, b10);
                    W2(this.f28310h1.f());
                    return true;
                } else if (c10 == 1) {
                    return w2((j) C2076a.i(jVar), i10, j13, sVar);
                } else {
                    if (c10 == 2) {
                        h2(jVar2, i13, j13);
                        W2(this.f28310h1.f());
                        return true;
                    } else if (c10 == 3) {
                        T2(jVar2, i13, j13);
                        W2(this.f28310h1.f());
                        return true;
                    } else if (c10 == 5) {
                        return false;
                    } else {
                        throw new IllegalStateException(String.valueOf(c10));
                    }
                }
            } else if (this.f28310h1.f() >= 30000) {
                return false;
            } else {
                T2(jVar2, i13, j13);
                W2(this.f28310h1.f());
                return true;
            }
        } else {
            T2(jVar2, i13, X02);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public l B0(Throwable th2, m mVar) {
        return new j(th2, mVar, this.f28317o1);
    }

    /* access modifiers changed from: protected */
    public void D2(long j10) {
        X1(j10);
        v2(this.f28296A1);
        this.f25697V0.f23707e++;
        t2();
        v1(j10);
    }

    /* access modifiers changed from: protected */
    public void G1() {
        super.G1();
        this.f28325w1 = 0;
    }

    /* access modifiers changed from: protected */
    public void H2(j jVar, int i10, long j10) {
        H.a("releaseOutputBuffer");
        jVar.l(i10, true);
        H.b();
        this.f25697V0.f23707e++;
        this.f28324v1 = 0;
        if (this.f28314l1 == null) {
            v2(this.f28296A1);
            t2();
        }
    }

    public boolean J(long j10, long j11) {
        return Q2(j10, j11);
    }

    /* access modifiers changed from: protected */
    public void J2(j jVar, int i10, long j10, long j11) {
        H.a("releaseOutputBuffer");
        jVar.i(i10, j11);
        H.b();
        this.f25697V0.f23707e++;
        this.f28324v1 = 0;
        if (this.f28314l1 == null) {
            v2(this.f28296A1);
            t2();
        }
    }

    public boolean K(long j10, long j11, long j12, boolean z10, boolean z11) {
        if (!O2(j10, j12, z10) || !r2(j11, z11)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void M2(j jVar, Surface surface) {
        jVar.f(surface);
    }

    public void N2(List list) {
        this.f28316n1 = list;
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.l(list);
        }
    }

    /* access modifiers changed from: protected */
    public int O0(f fVar) {
        if (L.f22072a < 34 || !this.f28299D1 || fVar.f23522f >= X()) {
            return 0;
        }
        return 32;
    }

    /* access modifiers changed from: protected */
    public boolean O2(long j10, long j11, boolean z10) {
        if (j10 >= -500000 || z10) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean P2(long j10, long j11, boolean z10) {
        if (j10 >= -30000 || z10) {
            return false;
        }
        return true;
    }

    public boolean Q(long j10, long j11, boolean z10) {
        return P2(j10, j11, z10);
    }

    /* access modifiers changed from: protected */
    public boolean Q0() {
        if (!this.f28299D1 || L.f22072a >= 23) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean Q1(m mVar) {
        if (this.f28317o1 != null || S2(mVar)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean Q2(long j10, long j11) {
        if (j10 >= -30000 || j11 <= 100000) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public float R0(float f10, s sVar, s[] sVarArr) {
        float f11 = -1.0f;
        for (s sVar2 : sVarArr) {
            float f12 = sVar2.f20091v;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    /* access modifiers changed from: protected */
    public boolean R2() {
        return true;
    }

    /* access modifiers changed from: protected */
    public List T0(w wVar, s sVar, boolean z10) {
        return C2559F.w(n2(this.f28303a1, wVar, sVar, z10, this.f28299D1), sVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int T1(r2.w r11, f2.s r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.f20083n
            boolean r0 = f2.C1960A.o(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r11 = androidx.media3.exoplayer.r0.o(r1)
            return r11
        L_0x000e:
            f2.n r0 = r12.f20087r
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            android.content.Context r3 = r10.f28303a1
            java.util.List r3 = n2(r3, r11, r12, r0, r1)
            if (r0 == 0) goto L_0x002a
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x002a
            android.content.Context r3 = r10.f28303a1
            java.util.List r3 = n2(r3, r11, r12, r1, r1)
        L_0x002a:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0035
            int r11 = androidx.media3.exoplayer.r0.o(r2)
            return r11
        L_0x0035:
            boolean r4 = r2.t.U1(r12)
            if (r4 != 0) goto L_0x0041
            r11 = 2
            int r11 = androidx.media3.exoplayer.r0.o(r11)
            return r11
        L_0x0041:
            java.lang.Object r4 = r3.get(r1)
            r2.m r4 = (r2.m) r4
            boolean r5 = r4.m(r12)
            if (r5 != 0) goto L_0x0067
            r6 = r2
        L_0x004e:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0067
            java.lang.Object r7 = r3.get(r6)
            r2.m r7 = (r2.m) r7
            boolean r8 = r7.m(r12)
            if (r8 == 0) goto L_0x0064
            r3 = r1
            r5 = r2
            r4 = r7
            goto L_0x0068
        L_0x0064:
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0067:
            r3 = r2
        L_0x0068:
            if (r5 == 0) goto L_0x006c
            r6 = 4
            goto L_0x006d
        L_0x006c:
            r6 = 3
        L_0x006d:
            boolean r7 = r4.p(r12)
            if (r7 == 0) goto L_0x0076
            r7 = 16
            goto L_0x0078
        L_0x0076:
            r7 = 8
        L_0x0078:
            boolean r4 = r4.f25661h
            if (r4 == 0) goto L_0x007f
            r4 = 64
            goto L_0x0080
        L_0x007f:
            r4 = r1
        L_0x0080:
            if (r3 == 0) goto L_0x0085
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0086
        L_0x0085:
            r3 = r1
        L_0x0086:
            int r8 = i2.L.f22072a
            r9 = 26
            if (r8 < r9) goto L_0x00a0
            java.lang.String r8 = "video/dolby-vision"
            java.lang.String r9 = r12.f20083n
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00a0
            android.content.Context r8 = r10.f28303a1
            boolean r8 = x2.k.b.a(r8)
            if (r8 != 0) goto L_0x00a0
            r3 = 256(0x100, float:3.59E-43)
        L_0x00a0:
            if (r5 == 0) goto L_0x00c6
            android.content.Context r5 = r10.f28303a1
            java.util.List r11 = n2(r5, r11, r12, r0, r2)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00c6
            java.util.List r11 = r2.C2559F.w(r11, r12)
            java.lang.Object r11 = r11.get(r1)
            r2.m r11 = (r2.m) r11
            boolean r0 = r11.m(r12)
            if (r0 == 0) goto L_0x00c6
            boolean r11 = r11.p(r12)
            if (r11 == 0) goto L_0x00c6
            r1 = 32
        L_0x00c6:
            int r11 = androidx.media3.exoplayer.r0.l(r6, r7, r1, r4, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.k.T1(r2.w, f2.s):int");
    }

    /* access modifiers changed from: protected */
    public void T2(j jVar, int i10, long j10) {
        H.a("skipVideoBuffer");
        jVar.l(i10, false);
        H.b();
        this.f25697V0.f23708f++;
    }

    /* access modifiers changed from: protected */
    public void V2(int i10, int i11) {
        m2.k kVar = this.f25697V0;
        kVar.f23710h += i10;
        int i12 = i10 + i11;
        kVar.f23709g += i12;
        this.f28323u1 += i12;
        int i13 = this.f28324v1 + i12;
        this.f28324v1 = i13;
        kVar.f23711i = Math.max(i13, kVar.f23711i);
        int i14 = this.f28307e1;
        if (i14 > 0 && this.f28323u1 >= i14) {
            s2();
        }
    }

    /* access modifiers changed from: protected */
    public j.a W0(m mVar, s sVar, MediaCrypto mediaCrypto, float f10) {
        int i10;
        Surface surface;
        m mVar2 = this.f28318p1;
        if (!(mVar2 == null || mVar2.f28337a == mVar.f25660g)) {
            G2();
        }
        String str = mVar.f25656c;
        c m22 = m2(mVar, sVar, Z());
        this.f28311i1 = m22;
        boolean z10 = this.f28308f1;
        if (this.f28299D1) {
            i10 = this.f28300E1;
        } else {
            i10 = 0;
        }
        MediaFormat q22 = q2(sVar, str, m22, f10, z10, i10);
        if (this.f28317o1 == null) {
            if (S2(mVar)) {
                if (this.f28318p1 == null) {
                    this.f28318p1 = m.c(this.f28303a1, mVar.f25660g);
                }
                this.f28317o1 = this.f28318p1;
            } else {
                throw new IllegalStateException();
            }
        }
        z2(q22);
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            surface = e10.p();
        } else {
            surface = this.f28317o1;
        }
        return j.a.b(mVar, q22, sVar, surface, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public void W2(long j10) {
        this.f25697V0.a(j10);
        this.f28326x1 += j10;
        this.f28327y1++;
    }

    public boolean b() {
        C2901E e10;
        if (!super.b() || ((e10 = this.f28314l1) != null && !e10.b())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void b0() {
        this.f28297B1 = null;
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.s();
        } else {
            this.f28309g1.g();
        }
        A2();
        this.f28320r1 = false;
        this.f28301F1 = null;
        try {
            super.b0();
        } finally {
            this.f28306d1.m(this.f25697V0);
            this.f28306d1.D(P.f19906e);
        }
    }

    /* access modifiers changed from: protected */
    public void b1(f fVar) {
        if (this.f28313k1) {
            ByteBuffer byteBuffer = (ByteBuffer) C2076a.e(fVar.f23523g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 != -75 || s10 != 60 || s11 != 1 || b11 != 4) {
                    return;
                }
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    K2((j) C2076a.e(N0()), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c0(boolean z10, boolean z11) {
        boolean z12;
        super.c0(z10, z11);
        boolean z13 = U().f23737b;
        if (!z13 || this.f28300E1 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        C2076a.g(z12);
        if (this.f28299D1 != z13) {
            this.f28299D1 = z13;
            E1();
        }
        this.f28306d1.o(this.f25697V0);
        if (!this.f28315m1) {
            if ((this.f28316n1 != null || !this.f28305c1) && this.f28314l1 == null) {
                C2902F f10 = this.f28304b1;
                if (f10 == null) {
                    f10 = new C2906d.b(this.f28303a1, this.f28309g1).f(T()).e();
                }
                this.f28314l1 = f10.b();
            }
            this.f28315m1 = true;
        }
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.c(new a(), h.a());
            o oVar = this.f28302G1;
            if (oVar != null) {
                this.f28314l1.t(oVar);
            }
            if (this.f28317o1 != null && !this.f28319q1.equals(C2075C.f22055c)) {
                this.f28314l1.r(this.f28317o1, this.f28319q1);
            }
            this.f28314l1.z(Z0());
            List list = this.f28316n1;
            if (list != null) {
                this.f28314l1.l(list);
            }
            this.f28314l1.o(z11);
            return;
        }
        this.f28309g1.o(T());
        this.f28309g1.h(z11);
    }

    public boolean d() {
        boolean z10;
        m mVar;
        C2901E e10;
        if (!super.d() || ((e10 = this.f28314l1) != null && !e10.d())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || (((mVar = this.f28318p1) == null || this.f28317o1 != mVar) && N0() != null && !this.f28299D1)) {
            return this.f28309g1.d(z10);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void d0() {
        super.d0();
    }

    /* access modifiers changed from: protected */
    public void e0(long j10, boolean z10) {
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.v(true);
            this.f28314l1.m(X0(), j2());
        }
        super.e0(j10, z10);
        if (this.f28314l1 == null) {
            this.f28309g1.m();
        }
        if (z10) {
            this.f28309g1.e(false);
        }
        A2();
        this.f28324v1 = 0;
    }

    /* access modifiers changed from: protected */
    public boolean e2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!f28294I1) {
                    f28295J1 = i2();
                    f28294I1 = true;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f28295J1;
    }

    /* access modifiers changed from: protected */
    public void f0() {
        super.f0();
        C2901E e10 = this.f28314l1;
        if (e10 != null && this.f28305c1) {
            e10.release();
        }
    }

    public void g(long j10, long j11) {
        super.g(j10, j11);
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            try {
                e10.g(j10, j11);
            } catch (C2901E.b e11) {
                throw R(e11, e11.f28226a, 7001);
            }
        }
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    public void h0() {
        try {
            super.h0();
        } finally {
            this.f28315m1 = false;
            if (this.f28318p1 != null) {
                G2();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void h2(j jVar, int i10, long j10) {
        H.a("dropVideoBuffer");
        jVar.l(i10, false);
        H.b();
        V2(0, 1);
    }

    /* access modifiers changed from: protected */
    public void i0() {
        super.i0();
        this.f28323u1 = 0;
        this.f28322t1 = T().a();
        this.f28326x1 = 0;
        this.f28327y1 = 0;
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.q();
        } else {
            this.f28309g1.k();
        }
    }

    public void j() {
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.j();
        } else {
            this.f28309g1.a();
        }
    }

    /* access modifiers changed from: protected */
    public void j0() {
        s2();
        u2();
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.k();
        } else {
            this.f28309g1.l();
        }
        super.j0();
    }

    /* access modifiers changed from: protected */
    public long j2() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public c m2(m mVar, s sVar, s[] sVarArr) {
        boolean z10;
        int k22;
        int i10 = sVar.f20089t;
        int i11 = sVar.f20090u;
        int o22 = o2(mVar, sVar);
        if (sVarArr.length == 1) {
            if (!(o22 == -1 || (k22 = k2(mVar, sVar)) == -1)) {
                o22 = Math.min((int) (((float) o22) * 1.5f), k22);
            }
            return new c(i10, i11, o22);
        }
        int length = sVarArr.length;
        boolean z11 = false;
        for (int i12 = 0; i12 < length; i12++) {
            s sVar2 = sVarArr[i12];
            if (sVar.f20058A != null && sVar2.f20058A == null) {
                sVar2 = sVar2.a().P(sVar.f20058A).K();
            }
            if (mVar.e(sVar, sVar2).f23718d != 0) {
                int i13 = sVar2.f20089t;
                if (i13 == -1 || sVar2.f20090u == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 |= z10;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, sVar2.f20090u);
                o22 = Math.max(o22, o2(mVar, sVar2));
            }
        }
        if (z11) {
            i2.p.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point l22 = l2(mVar, sVar);
            if (l22 != null) {
                i10 = Math.max(i10, l22.x);
                i11 = Math.max(i11, l22.y);
                o22 = Math.max(o22, k2(mVar, sVar.a().t0(i10).Y(i11).K()));
                i2.p.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new c(i10, i11, o22);
    }

    public void p(int i10, Object obj) {
        if (i10 == 1) {
            L2(obj);
        } else if (i10 == 7) {
            o oVar = (o) C2076a.e(obj);
            this.f28302G1 = oVar;
            C2901E e10 = this.f28314l1;
            if (e10 != null) {
                e10.t(oVar);
            }
        } else if (i10 == 10) {
            int intValue = ((Integer) C2076a.e(obj)).intValue();
            if (this.f28300E1 != intValue) {
                this.f28300E1 = intValue;
                if (this.f28299D1) {
                    E1();
                }
            }
        } else if (i10 == 16) {
            this.f28298C1 = ((Integer) C2076a.e(obj)).intValue();
            U2();
        } else if (i10 == 4) {
            this.f28321s1 = ((Integer) C2076a.e(obj)).intValue();
            j N02 = N0();
            if (N02 != null) {
                N02.d(this.f28321s1);
            }
        } else if (i10 == 5) {
            this.f28309g1.n(((Integer) C2076a.e(obj)).intValue());
        } else if (i10 == 13) {
            N2((List) C2076a.e(obj));
        } else if (i10 != 14) {
            super.p(i10, obj);
        } else {
            C2075C c10 = (C2075C) C2076a.e(obj);
            if (c10.b() != 0 && c10.a() != 0) {
                this.f28319q1 = c10;
                C2901E e11 = this.f28314l1;
                if (e11 != null) {
                    e11.r((Surface) C2076a.i(this.f28317o1), c10);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void p1(Exception exc) {
        i2.p.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f28306d1.C(exc);
    }

    /* access modifiers changed from: protected */
    public void q1(String str, j.a aVar, long j10, long j11) {
        this.f28306d1.k(str, j10, j11);
        this.f28312j1 = e2(str);
        this.f28313k1 = ((m) C2076a.e(P0())).n();
        A2();
    }

    /* access modifiers changed from: protected */
    public MediaFormat q2(s sVar, String str, c cVar, float f10, boolean z10, int i10) {
        Pair r10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(Snapshot.WIDTH, sVar.f20089t);
        mediaFormat.setInteger(Snapshot.HEIGHT, sVar.f20090u);
        i2.s.e(mediaFormat, sVar.f20086q);
        i2.s.c(mediaFormat, "frame-rate", sVar.f20091v);
        i2.s.d(mediaFormat, "rotation-degrees", sVar.f20092w);
        i2.s.b(mediaFormat, sVar.f20058A);
        if ("video/dolby-vision".equals(sVar.f20083n) && (r10 = C2559F.r(sVar)) != null) {
            i2.s.d(mediaFormat, "profile", ((Integer) r10.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f28330a);
        mediaFormat.setInteger("max-height", cVar.f28331b);
        i2.s.d(mediaFormat, "max-input-size", cVar.f28332c);
        int i11 = L.f22072a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            f2(mediaFormat, i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f28298C1));
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public void r1(String str) {
        this.f28306d1.l(str);
    }

    /* access modifiers changed from: protected */
    public boolean r2(long j10, boolean z10) {
        int o02 = o0(j10);
        if (o02 == 0) {
            return false;
        }
        if (z10) {
            m2.k kVar = this.f25697V0;
            kVar.f23706d += o02;
            kVar.f23708f += this.f28325w1;
        } else {
            this.f25697V0.f23712j++;
            V2(o02, this.f28325w1);
        }
        K0();
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.v(false);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public m2.l s0(m mVar, s sVar, s sVar2) {
        int i10;
        m2.l e10 = mVar.e(sVar, sVar2);
        int i11 = e10.f23719e;
        c cVar = (c) C2076a.e(this.f28311i1);
        if (sVar2.f20089t > cVar.f28330a || sVar2.f20090u > cVar.f28331b) {
            i11 |= 256;
        }
        if (o2(mVar, sVar2) > cVar.f28332c) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = mVar.f25654a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = e10.f23718d;
        }
        return new m2.l(str, sVar, sVar2, i10, i12);
    }

    /* access modifiers changed from: protected */
    public m2.l s1(m2.w wVar) {
        m2.l s12 = super.s1(wVar);
        this.f28306d1.p((s) C2076a.e(wVar.f23734b), s12);
        return s12;
    }

    /* access modifiers changed from: protected */
    public void t1(s sVar, MediaFormat mediaFormat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        j N02 = N0();
        if (N02 != null) {
            N02.d(this.f28321s1);
        }
        int i14 = 0;
        if (this.f28299D1) {
            i10 = sVar.f20089t;
            i11 = sVar.f20090u;
        } else {
            C2076a.e(mediaFormat);
            if (!mediaFormat.containsKey("crop-right") || !mediaFormat.containsKey("crop-left") || !mediaFormat.containsKey("crop-bottom") || !mediaFormat.containsKey("crop-top")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i12 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i12 = mediaFormat.getInteger(Snapshot.WIDTH);
            }
            if (z10) {
                i13 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i13 = mediaFormat.getInteger(Snapshot.HEIGHT);
            }
            int i15 = i12;
            i11 = i13;
            i10 = i15;
        }
        float f10 = sVar.f20093x;
        if (d2()) {
            int i16 = sVar.f20092w;
            if (i16 == 90 || i16 == 270) {
                f10 = 1.0f / f10;
                int i17 = i11;
                i11 = i10;
                i10 = i17;
            }
        } else if (this.f28314l1 == null) {
            i14 = sVar.f20092w;
        }
        this.f28296A1 = new P(i10, i11, i14, f10);
        if (this.f28314l1 != null) {
            F2();
            this.f28314l1.x(1, sVar.a().t0(i10).Y(i11).n0(i14).k0(f10).K());
            return;
        }
        this.f28309g1.p(sVar.f20091v);
    }

    public void v(float f10, float f11) {
        super.v(f10, f11);
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.z(f10);
        } else {
            this.f28309g1.r(f10);
        }
    }

    /* access modifiers changed from: protected */
    public void v1(long j10) {
        super.v1(j10);
        if (!this.f28299D1) {
            this.f28325w1--;
        }
    }

    /* access modifiers changed from: protected */
    public void w1() {
        super.w1();
        C2901E e10 = this.f28314l1;
        if (e10 != null) {
            e10.m(X0(), j2());
        } else {
            this.f28309g1.j();
        }
        A2();
    }

    /* access modifiers changed from: protected */
    public void x1(f fVar) {
        boolean z10 = this.f28299D1;
        if (!z10) {
            this.f28325w1++;
        }
        if (L.f22072a < 23 && z10) {
            D2(fVar.f23522f);
        }
    }

    /* access modifiers changed from: protected */
    public void y1(s sVar) {
        C2901E e10 = this.f28314l1;
        if (e10 != null && !e10.e()) {
            try {
                this.f28314l1.w(sVar);
            } catch (C2901E.b e11) {
                throw R(e11, sVar, 7000);
            }
        }
    }

    public k(Context context, j.b bVar, w wVar, long j10, boolean z10, Handler handler, C2900D d10, int i10, float f10) {
        this(context, bVar, wVar, j10, z10, handler, d10, i10, f10, (C2902F) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, j.b bVar, w wVar, long j10, boolean z10, Handler handler, C2900D d10, int i10, float f10, C2902F f11) {
        super(2, bVar, wVar, z10, f10);
        C2902F f12 = f11;
        Context applicationContext = context.getApplicationContext();
        this.f28303a1 = applicationContext;
        this.f28307e1 = i10;
        this.f28304b1 = f12;
        Handler handler2 = handler;
        this.f28306d1 = new C2900D.a(handler, d10);
        this.f28305c1 = f12 == null;
        if (f12 == null) {
            long j11 = j10;
            this.f28309g1 = new p(applicationContext, this, j10);
        } else {
            this.f28309g1 = f11.a();
        }
        this.f28310h1 = new p.a();
        this.f28308f1 = g2();
        this.f28319q1 = C2075C.f22055c;
        this.f28321s1 = 1;
        this.f28296A1 = P.f19906e;
        this.f28300E1 = 0;
        this.f28297B1 = null;
        this.f28298C1 = -1000;
    }

    /* access modifiers changed from: protected */
    public void F2() {
    }

    class a implements C2901E.a {
        a() {
        }

        public void a(C2901E e10) {
            k.this.V2(0, 1);
        }

        public void c(C2901E e10) {
            C2076a.i(k.this.f28317o1);
            k.this.C2();
        }

        public void b(C2901E e10, P p10) {
        }
    }
}
