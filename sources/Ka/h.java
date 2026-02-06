package ka;

import C9.l;
import C9.m;
import C9.n;
import C9.o;
import C9.q;
import C9.v;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.common.collect.C4770v;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ja.C3645a;
import ja.J;
import ja.M;
import ja.s;
import java.nio.ByteBuffer;
import java.util.List;
import k9.C3717q0;
import k9.C3718r0;
import k9.b1;
import k9.r;
import ka.w;
import n9.C3869e;
import n9.C3871g;
import n9.C3873i;

public class h extends o {

    /* renamed from: I1  reason: collision with root package name */
    private static final int[] f45987I1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: J1  reason: collision with root package name */
    private static boolean f45988J1;

    /* renamed from: K1  reason: collision with root package name */
    private static boolean f45989K1;

    /* renamed from: A1  reason: collision with root package name */
    private int f45990A1;

    /* renamed from: B1  reason: collision with root package name */
    private int f45991B1;

    /* renamed from: C1  reason: collision with root package name */
    private float f45992C1;

    /* renamed from: D1  reason: collision with root package name */
    private y f45993D1;

    /* renamed from: E1  reason: collision with root package name */
    private boolean f45994E1;

    /* renamed from: F1  reason: collision with root package name */
    private int f45995F1;

    /* renamed from: G1  reason: collision with root package name */
    b f45996G1;

    /* renamed from: H1  reason: collision with root package name */
    private j f45997H1;

    /* renamed from: Z0  reason: collision with root package name */
    private final Context f45998Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final l f45999a1;

    /* renamed from: b1  reason: collision with root package name */
    private final w.a f46000b1;

    /* renamed from: c1  reason: collision with root package name */
    private final long f46001c1;

    /* renamed from: d1  reason: collision with root package name */
    private final int f46002d1;

    /* renamed from: e1  reason: collision with root package name */
    private final boolean f46003e1;

    /* renamed from: f1  reason: collision with root package name */
    private a f46004f1;

    /* renamed from: g1  reason: collision with root package name */
    private boolean f46005g1;

    /* renamed from: h1  reason: collision with root package name */
    private boolean f46006h1;

    /* renamed from: i1  reason: collision with root package name */
    private Surface f46007i1;

    /* renamed from: j1  reason: collision with root package name */
    private i f46008j1;

    /* renamed from: k1  reason: collision with root package name */
    private boolean f46009k1;

    /* renamed from: l1  reason: collision with root package name */
    private int f46010l1;

    /* renamed from: m1  reason: collision with root package name */
    private boolean f46011m1;

    /* renamed from: n1  reason: collision with root package name */
    private boolean f46012n1;

    /* renamed from: o1  reason: collision with root package name */
    private boolean f46013o1;

    /* renamed from: p1  reason: collision with root package name */
    private long f46014p1;

    /* renamed from: q1  reason: collision with root package name */
    private long f46015q1;

    /* renamed from: r1  reason: collision with root package name */
    private long f46016r1;

    /* renamed from: s1  reason: collision with root package name */
    private int f46017s1;

    /* renamed from: t1  reason: collision with root package name */
    private int f46018t1;

    /* renamed from: u1  reason: collision with root package name */
    private int f46019u1;

    /* renamed from: v1  reason: collision with root package name */
    private long f46020v1;

    /* renamed from: w1  reason: collision with root package name */
    private long f46021w1;

    /* renamed from: x1  reason: collision with root package name */
    private long f46022x1;

    /* renamed from: y1  reason: collision with root package name */
    private int f46023y1;

    /* renamed from: z1  reason: collision with root package name */
    private int f46024z1;

    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f46025a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46026b;

        /* renamed from: c  reason: collision with root package name */
        public final int f46027c;

        public a(int i10, int i11, int i12) {
            this.f46025a = i10;
            this.f46026b = i11;
            this.f46027c = i12;
        }
    }

    private final class b implements l.c, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f46028a;

        public b(l lVar) {
            Handler x10 = M.x(this);
            this.f46028a = x10;
            lVar.n(this, x10);
        }

        private void b(long j10) {
            h hVar = h.this;
            if (this == hVar.f45996G1) {
                if (j10 == Long.MAX_VALUE) {
                    hVar.V1();
                    return;
                }
                try {
                    hVar.U1(j10);
                } catch (r e10) {
                    h.this.k1(e10);
                }
            }
        }

        public void a(l lVar, long j10, long j11) {
            if (M.f44981a < 30) {
                this.f46028a.sendMessageAtFrontOfQueue(Message.obtain(this.f46028a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            b(j10);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(M.W0(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, l.b bVar, q qVar, long j10, boolean z10, Handler handler, w wVar, int i10) {
        this(context, bVar, qVar, j10, z10, handler, wVar, i10, 30.0f);
    }

    private static void A1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean B1() {
        return "NVIDIA".equals(M.f44983c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06c5, code lost:
        if (r10.equals("A10-70L") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x083b, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0833;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0857, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean D1() {
        /*
            r0 = 26
            r1 = 27
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = -1
            r9 = 0
            int r10 = ja.M.f44981a
            r11 = 28
            r12 = 1
            if (r10 > r11) goto L_0x007e
            java.lang.String r13 = ja.M.f44982b
            r13.hashCode()
            int r14 = r13.hashCode()
            switch(r14) {
                case -1339091551: goto L_0x006f;
                case -1220081023: goto L_0x0064;
                case -1220066608: goto L_0x0059;
                case -1012436106: goto L_0x004e;
                case -760312546: goto L_0x0043;
                case -64886864: goto L_0x0038;
                case 3415681: goto L_0x002d;
                case 825323514: goto L_0x0022;
                default: goto L_0x001f;
            }
        L_0x001f:
            r13 = r8
            goto L_0x0079
        L_0x0022:
            java.lang.String r14 = "machuca"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x002b
            goto L_0x001f
        L_0x002b:
            r13 = r2
            goto L_0x0079
        L_0x002d:
            java.lang.String r14 = "once"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0036
            goto L_0x001f
        L_0x0036:
            r13 = r3
            goto L_0x0079
        L_0x0038:
            java.lang.String r14 = "magnolia"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0041
            goto L_0x001f
        L_0x0041:
            r13 = r4
            goto L_0x0079
        L_0x0043:
            java.lang.String r14 = "aquaman"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x004c
            goto L_0x001f
        L_0x004c:
            r13 = r5
            goto L_0x0079
        L_0x004e:
            java.lang.String r14 = "oneday"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0057
            goto L_0x001f
        L_0x0057:
            r13 = r6
            goto L_0x0079
        L_0x0059:
            java.lang.String r14 = "dangalUHD"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0062
            goto L_0x001f
        L_0x0062:
            r13 = r7
            goto L_0x0079
        L_0x0064:
            java.lang.String r14 = "dangalFHD"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x006d
            goto L_0x001f
        L_0x006d:
            r13 = r12
            goto L_0x0079
        L_0x006f:
            java.lang.String r14 = "dangal"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0078
            goto L_0x001f
        L_0x0078:
            r13 = r9
        L_0x0079:
            switch(r13) {
                case 0: goto L_0x007d;
                case 1: goto L_0x007d;
                case 2: goto L_0x007d;
                case 3: goto L_0x007d;
                case 4: goto L_0x007d;
                case 5: goto L_0x007d;
                case 6: goto L_0x007d;
                case 7: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x007e
        L_0x007d:
            return r12
        L_0x007e:
            if (r10 > r1) goto L_0x008b
            java.lang.String r13 = "HWEML"
            java.lang.String r14 = ja.M.f44982b
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x008b
            return r12
        L_0x008b:
            if (r10 > r0) goto L_0x0858
            java.lang.String r10 = ja.M.f44982b
            r10.hashCode()
            int r13 = r10.hashCode()
            switch(r13) {
                case -2144781245: goto L_0x0819;
                case -2144781185: goto L_0x080d;
                case -2144781160: goto L_0x0801;
                case -2097309513: goto L_0x07f5;
                case -2022874474: goto L_0x07e9;
                case -1978993182: goto L_0x07dd;
                case -1978990237: goto L_0x07d1;
                case -1936688988: goto L_0x07c5;
                case -1936688066: goto L_0x07b7;
                case -1936688065: goto L_0x07a9;
                case -1931988508: goto L_0x079b;
                case -1885099851: goto L_0x078d;
                case -1696512866: goto L_0x077f;
                case -1680025915: goto L_0x0771;
                case -1615810839: goto L_0x0763;
                case -1600724499: goto L_0x0755;
                case -1554255044: goto L_0x0747;
                case -1481772737: goto L_0x0739;
                case -1481772730: goto L_0x072b;
                case -1481772729: goto L_0x071d;
                case -1320080169: goto L_0x070f;
                case -1217592143: goto L_0x0701;
                case -1180384755: goto L_0x06f3;
                case -1139198265: goto L_0x06e5;
                case -1052835013: goto L_0x06d7;
                case -993250464: goto L_0x06c9;
                case -993250458: goto L_0x06bf;
                case -965403638: goto L_0x06b2;
                case -958336948: goto L_0x06a5;
                case -879245230: goto L_0x0697;
                case -842500323: goto L_0x0689;
                case -821392978: goto L_0x067b;
                case -797483286: goto L_0x066d;
                case -794946968: goto L_0x065f;
                case -788334647: goto L_0x0651;
                case -782144577: goto L_0x0643;
                case -575125681: goto L_0x0635;
                case -521118391: goto L_0x0627;
                case -430914369: goto L_0x0619;
                case -290434366: goto L_0x060b;
                case -282781963: goto L_0x05fd;
                case -277133239: goto L_0x05ef;
                case -173639913: goto L_0x05e1;
                case -56598463: goto L_0x05d3;
                case 2126: goto L_0x05c5;
                case 2564: goto L_0x05b7;
                case 2715: goto L_0x05a9;
                case 2719: goto L_0x059b;
                case 3091: goto L_0x058d;
                case 3483: goto L_0x057f;
                case 73405: goto L_0x0571;
                case 75537: goto L_0x0563;
                case 75739: goto L_0x0555;
                case 76779: goto L_0x0547;
                case 78669: goto L_0x0539;
                case 79305: goto L_0x052b;
                case 80618: goto L_0x051d;
                case 88274: goto L_0x050f;
                case 98846: goto L_0x0501;
                case 98848: goto L_0x04f3;
                case 99329: goto L_0x04e5;
                case 101481: goto L_0x04d7;
                case 1513190: goto L_0x04c9;
                case 1514184: goto L_0x04bb;
                case 1514185: goto L_0x04ad;
                case 2133089: goto L_0x049f;
                case 2133091: goto L_0x0491;
                case 2133120: goto L_0x0483;
                case 2133151: goto L_0x0475;
                case 2133182: goto L_0x0467;
                case 2133184: goto L_0x0459;
                case 2436959: goto L_0x044b;
                case 2463773: goto L_0x043d;
                case 2464648: goto L_0x042f;
                case 2689555: goto L_0x0421;
                case 3154429: goto L_0x0413;
                case 3284551: goto L_0x0405;
                case 3351335: goto L_0x03f7;
                case 3386211: goto L_0x03e9;
                case 41325051: goto L_0x03db;
                case 51349633: goto L_0x03cd;
                case 51350594: goto L_0x03bf;
                case 55178625: goto L_0x03b1;
                case 61542055: goto L_0x03a3;
                case 65355429: goto L_0x0395;
                case 66214468: goto L_0x0387;
                case 66214470: goto L_0x0379;
                case 66214473: goto L_0x036b;
                case 66215429: goto L_0x035d;
                case 66215431: goto L_0x034f;
                case 66215433: goto L_0x0341;
                case 66216390: goto L_0x0333;
                case 76402249: goto L_0x0325;
                case 76404105: goto L_0x0317;
                case 76404911: goto L_0x0309;
                case 80963634: goto L_0x02fb;
                case 82882791: goto L_0x02ed;
                case 98715550: goto L_0x02df;
                case 101370885: goto L_0x02d1;
                case 102844228: goto L_0x02c3;
                case 165221241: goto L_0x02b5;
                case 182191441: goto L_0x02a7;
                case 245388979: goto L_0x0299;
                case 287431619: goto L_0x028b;
                case 307593612: goto L_0x027d;
                case 308517133: goto L_0x026f;
                case 316215098: goto L_0x0261;
                case 316215116: goto L_0x0253;
                case 316246811: goto L_0x0245;
                case 316246818: goto L_0x0237;
                case 407160593: goto L_0x0229;
                case 507412548: goto L_0x021b;
                case 793982701: goto L_0x020d;
                case 794038622: goto L_0x01ff;
                case 794040393: goto L_0x01f1;
                case 835649806: goto L_0x01e3;
                case 917340916: goto L_0x01d5;
                case 958008161: goto L_0x01c7;
                case 1060579533: goto L_0x01b9;
                case 1150207623: goto L_0x01ab;
                case 1176899427: goto L_0x019d;
                case 1280332038: goto L_0x018f;
                case 1306947716: goto L_0x0181;
                case 1349174697: goto L_0x0173;
                case 1522194893: goto L_0x0165;
                case 1691543273: goto L_0x0157;
                case 1691544261: goto L_0x0149;
                case 1709443163: goto L_0x013b;
                case 1865889110: goto L_0x012d;
                case 1906253259: goto L_0x011f;
                case 1977196784: goto L_0x0111;
                case 2006372676: goto L_0x0104;
                case 2019281702: goto L_0x00f7;
                case 2029784656: goto L_0x00ea;
                case 2030379515: goto L_0x00dd;
                case 2033393791: goto L_0x00d0;
                case 2047190025: goto L_0x00c3;
                case 2047252157: goto L_0x00b6;
                case 2048319463: goto L_0x00a9;
                case 2048855701: goto L_0x009c;
                default: goto L_0x0099;
            }
        L_0x0099:
            r0 = r8
            goto L_0x0824
        L_0x009c:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00a5
            goto L_0x0099
        L_0x00a5:
            r0 = 139(0x8b, float:1.95E-43)
            goto L_0x0824
        L_0x00a9:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0099
        L_0x00b2:
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x0824
        L_0x00b6:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00bf
            goto L_0x0099
        L_0x00bf:
            r0 = 137(0x89, float:1.92E-43)
            goto L_0x0824
        L_0x00c3:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00cc
            goto L_0x0099
        L_0x00cc:
            r0 = 136(0x88, float:1.9E-43)
            goto L_0x0824
        L_0x00d0:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00d9
            goto L_0x0099
        L_0x00d9:
            r0 = 135(0x87, float:1.89E-43)
            goto L_0x0824
        L_0x00dd:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00e6
            goto L_0x0099
        L_0x00e6:
            r0 = 134(0x86, float:1.88E-43)
            goto L_0x0824
        L_0x00ea:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00f3
            goto L_0x0099
        L_0x00f3:
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x0824
        L_0x00f7:
            java.lang.String r0 = "DM-01K"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0100
            goto L_0x0099
        L_0x0100:
            r0 = 132(0x84, float:1.85E-43)
            goto L_0x0824
        L_0x0104:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x010d
            goto L_0x0099
        L_0x010d:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x0824
        L_0x0111:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x011b
            goto L_0x0099
        L_0x011b:
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x0824
        L_0x011f:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0129
            goto L_0x0099
        L_0x0129:
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x0824
        L_0x012d:
            java.lang.String r0 = "santoni"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0137
            goto L_0x0099
        L_0x0137:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0824
        L_0x013b:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0145
            goto L_0x0099
        L_0x0145:
            r0 = 127(0x7f, float:1.78E-43)
            goto L_0x0824
        L_0x0149:
            java.lang.String r0 = "CPH1715"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0153
            goto L_0x0099
        L_0x0153:
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x0824
        L_0x0157:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0161
            goto L_0x0099
        L_0x0161:
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x0824
        L_0x0165:
            java.lang.String r0 = "woods_f"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x016f
            goto L_0x0099
        L_0x016f:
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x0824
        L_0x0173:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x017d
            goto L_0x0099
        L_0x017d:
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x0824
        L_0x0181:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x018b
            goto L_0x0099
        L_0x018b:
            r0 = 122(0x7a, float:1.71E-43)
            goto L_0x0824
        L_0x018f:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0199
            goto L_0x0099
        L_0x0199:
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x0824
        L_0x019d:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x01a7
            goto L_0x0099
        L_0x01a7:
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x0824
        L_0x01ab:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x01b5
            goto L_0x0099
        L_0x01b5:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x0824
        L_0x01b9:
            java.lang.String r0 = "panell_d"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x01c3
            goto L_0x0099
        L_0x01c3:
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x0824
        L_0x01c7:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x01d1
            goto L_0x0099
        L_0x01d1:
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x0824
        L_0x01d5:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x01df
            goto L_0x0099
        L_0x01df:
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x0824
        L_0x01e3:
            java.lang.String r0 = "manning"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x01ed
            goto L_0x0099
        L_0x01ed:
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x0824
        L_0x01f1:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x01fb
            goto L_0x0099
        L_0x01fb:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x0824
        L_0x01ff:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0209
            goto L_0x0099
        L_0x0209:
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x0824
        L_0x020d:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0217
            goto L_0x0099
        L_0x0217:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x0824
        L_0x021b:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0225
            goto L_0x0099
        L_0x0225:
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x0824
        L_0x0229:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0233
            goto L_0x0099
        L_0x0233:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x0824
        L_0x0237:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0241
            goto L_0x0099
        L_0x0241:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x0824
        L_0x0245:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x024f
            goto L_0x0099
        L_0x024f:
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x0824
        L_0x0253:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x025d
            goto L_0x0099
        L_0x025d:
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x0824
        L_0x0261:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x026b
            goto L_0x0099
        L_0x026b:
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x0824
        L_0x026f:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0279
            goto L_0x0099
        L_0x0279:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x0824
        L_0x027d:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0287
            goto L_0x0099
        L_0x0287:
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x0824
        L_0x028b:
            java.lang.String r0 = "griffin"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0295
            goto L_0x0099
        L_0x0295:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0824
        L_0x0299:
            java.lang.String r0 = "marino_f"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02a3
            goto L_0x0099
        L_0x02a3:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x0824
        L_0x02a7:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02b1
            goto L_0x0099
        L_0x02b1:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0824
        L_0x02b5:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02bf
            goto L_0x0099
        L_0x02bf:
            r0 = 100
            goto L_0x0824
        L_0x02c3:
            java.lang.String r0 = "le_x6"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02cd
            goto L_0x0099
        L_0x02cd:
            r0 = 99
            goto L_0x0824
        L_0x02d1:
            java.lang.String r0 = "l5460"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02db
            goto L_0x0099
        L_0x02db:
            r0 = 98
            goto L_0x0824
        L_0x02df:
            java.lang.String r0 = "i9031"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02e9
            goto L_0x0099
        L_0x02e9:
            r0 = 97
            goto L_0x0824
        L_0x02ed:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02f7
            goto L_0x0099
        L_0x02f7:
            r0 = 96
            goto L_0x0824
        L_0x02fb:
            java.lang.String r0 = "V23GB"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0305
            goto L_0x0099
        L_0x0305:
            r0 = 95
            goto L_0x0824
        L_0x0309:
            java.lang.String r0 = "Q4310"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0313
            goto L_0x0099
        L_0x0313:
            r0 = 94
            goto L_0x0824
        L_0x0317:
            java.lang.String r0 = "Q4260"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0321
            goto L_0x0099
        L_0x0321:
            r0 = 93
            goto L_0x0824
        L_0x0325:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x032f
            goto L_0x0099
        L_0x032f:
            r0 = 92
            goto L_0x0824
        L_0x0333:
            java.lang.String r0 = "F3311"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x033d
            goto L_0x0099
        L_0x033d:
            r0 = 91
            goto L_0x0824
        L_0x0341:
            java.lang.String r0 = "F3215"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x034b
            goto L_0x0099
        L_0x034b:
            r0 = 90
            goto L_0x0824
        L_0x034f:
            java.lang.String r0 = "F3213"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0359
            goto L_0x0099
        L_0x0359:
            r0 = 89
            goto L_0x0824
        L_0x035d:
            java.lang.String r0 = "F3211"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0367
            goto L_0x0099
        L_0x0367:
            r0 = 88
            goto L_0x0824
        L_0x036b:
            java.lang.String r0 = "F3116"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0375
            goto L_0x0099
        L_0x0375:
            r0 = 87
            goto L_0x0824
        L_0x0379:
            java.lang.String r0 = "F3113"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0383
            goto L_0x0099
        L_0x0383:
            r0 = 86
            goto L_0x0824
        L_0x0387:
            java.lang.String r0 = "F3111"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0391
            goto L_0x0099
        L_0x0391:
            r0 = 85
            goto L_0x0824
        L_0x0395:
            java.lang.String r0 = "E5643"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x039f
            goto L_0x0099
        L_0x039f:
            r0 = 84
            goto L_0x0824
        L_0x03a3:
            java.lang.String r0 = "A1601"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x03ad
            goto L_0x0099
        L_0x03ad:
            r0 = 83
            goto L_0x0824
        L_0x03b1:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x03bb
            goto L_0x0099
        L_0x03bb:
            r0 = 82
            goto L_0x0824
        L_0x03bf:
            java.lang.String r0 = "602LV"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x03c9
            goto L_0x0099
        L_0x03c9:
            r0 = 81
            goto L_0x0824
        L_0x03cd:
            java.lang.String r0 = "601LV"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x03d7
            goto L_0x0099
        L_0x03d7:
            r0 = 80
            goto L_0x0824
        L_0x03db:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x03e5
            goto L_0x0099
        L_0x03e5:
            r0 = 79
            goto L_0x0824
        L_0x03e9:
            java.lang.String r0 = "p212"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x03f3
            goto L_0x0099
        L_0x03f3:
            r0 = 78
            goto L_0x0824
        L_0x03f7:
            java.lang.String r0 = "mido"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0401
            goto L_0x0099
        L_0x0401:
            r0 = 77
            goto L_0x0824
        L_0x0405:
            java.lang.String r0 = "kate"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x040f
            goto L_0x0099
        L_0x040f:
            r0 = 76
            goto L_0x0824
        L_0x0413:
            java.lang.String r0 = "fugu"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x041d
            goto L_0x0099
        L_0x041d:
            r0 = 75
            goto L_0x0824
        L_0x0421:
            java.lang.String r0 = "XE2X"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x042b
            goto L_0x0099
        L_0x042b:
            r0 = 74
            goto L_0x0824
        L_0x042f:
            java.lang.String r0 = "Q427"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0439
            goto L_0x0099
        L_0x0439:
            r0 = 73
            goto L_0x0824
        L_0x043d:
            java.lang.String r0 = "Q350"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0447
            goto L_0x0099
        L_0x0447:
            r0 = 72
            goto L_0x0824
        L_0x044b:
            java.lang.String r0 = "P681"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0455
            goto L_0x0099
        L_0x0455:
            r0 = 71
            goto L_0x0824
        L_0x0459:
            java.lang.String r0 = "F04J"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0463
            goto L_0x0099
        L_0x0463:
            r0 = 70
            goto L_0x0824
        L_0x0467:
            java.lang.String r0 = "F04H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0471
            goto L_0x0099
        L_0x0471:
            r0 = 69
            goto L_0x0824
        L_0x0475:
            java.lang.String r0 = "F03H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x047f
            goto L_0x0099
        L_0x047f:
            r0 = 68
            goto L_0x0824
        L_0x0483:
            java.lang.String r0 = "F02H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x048d
            goto L_0x0099
        L_0x048d:
            r0 = 67
            goto L_0x0824
        L_0x0491:
            java.lang.String r0 = "F01J"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x049b
            goto L_0x0099
        L_0x049b:
            r0 = 66
            goto L_0x0824
        L_0x049f:
            java.lang.String r0 = "F01H"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04a9
            goto L_0x0099
        L_0x04a9:
            r0 = 65
            goto L_0x0824
        L_0x04ad:
            java.lang.String r0 = "1714"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04b7
            goto L_0x0099
        L_0x04b7:
            r0 = 64
            goto L_0x0824
        L_0x04bb:
            java.lang.String r0 = "1713"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04c5
            goto L_0x0099
        L_0x04c5:
            r0 = 63
            goto L_0x0824
        L_0x04c9:
            java.lang.String r0 = "1601"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04d3
            goto L_0x0099
        L_0x04d3:
            r0 = 62
            goto L_0x0824
        L_0x04d7:
            java.lang.String r0 = "flo"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04e1
            goto L_0x0099
        L_0x04e1:
            r0 = 61
            goto L_0x0824
        L_0x04e5:
            java.lang.String r0 = "deb"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04ef
            goto L_0x0099
        L_0x04ef:
            r0 = 60
            goto L_0x0824
        L_0x04f3:
            java.lang.String r0 = "cv3"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04fd
            goto L_0x0099
        L_0x04fd:
            r0 = 59
            goto L_0x0824
        L_0x0501:
            java.lang.String r0 = "cv1"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x050b
            goto L_0x0099
        L_0x050b:
            r0 = 58
            goto L_0x0824
        L_0x050f:
            java.lang.String r0 = "Z80"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0519
            goto L_0x0099
        L_0x0519:
            r0 = 57
            goto L_0x0824
        L_0x051d:
            java.lang.String r0 = "QX1"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0527
            goto L_0x0099
        L_0x0527:
            r0 = 56
            goto L_0x0824
        L_0x052b:
            java.lang.String r0 = "PLE"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0535
            goto L_0x0099
        L_0x0535:
            r0 = 55
            goto L_0x0824
        L_0x0539:
            java.lang.String r0 = "P85"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0543
            goto L_0x0099
        L_0x0543:
            r0 = 54
            goto L_0x0824
        L_0x0547:
            java.lang.String r0 = "MX6"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0551
            goto L_0x0099
        L_0x0551:
            r0 = 53
            goto L_0x0824
        L_0x0555:
            java.lang.String r0 = "M5c"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x055f
            goto L_0x0099
        L_0x055f:
            r0 = 52
            goto L_0x0824
        L_0x0563:
            java.lang.String r0 = "M04"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x056d
            goto L_0x0099
        L_0x056d:
            r0 = 51
            goto L_0x0824
        L_0x0571:
            java.lang.String r0 = "JGZ"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x057b
            goto L_0x0099
        L_0x057b:
            r0 = 50
            goto L_0x0824
        L_0x057f:
            java.lang.String r0 = "mh"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0589
            goto L_0x0099
        L_0x0589:
            r0 = 49
            goto L_0x0824
        L_0x058d:
            java.lang.String r0 = "b5"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0597
            goto L_0x0099
        L_0x0597:
            r0 = 48
            goto L_0x0824
        L_0x059b:
            java.lang.String r0 = "V5"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x05a5
            goto L_0x0099
        L_0x05a5:
            r0 = 47
            goto L_0x0824
        L_0x05a9:
            java.lang.String r0 = "V1"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x05b3
            goto L_0x0099
        L_0x05b3:
            r0 = 46
            goto L_0x0824
        L_0x05b7:
            java.lang.String r0 = "Q5"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x05c1
            goto L_0x0099
        L_0x05c1:
            r0 = 45
            goto L_0x0824
        L_0x05c5:
            java.lang.String r0 = "C1"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x05cf
            goto L_0x0099
        L_0x05cf:
            r0 = 44
            goto L_0x0824
        L_0x05d3:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x05dd
            goto L_0x0099
        L_0x05dd:
            r0 = 43
            goto L_0x0824
        L_0x05e1:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x05eb
            goto L_0x0099
        L_0x05eb:
            r0 = 42
            goto L_0x0824
        L_0x05ef:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x05f9
            goto L_0x0099
        L_0x05f9:
            r0 = 41
            goto L_0x0824
        L_0x05fd:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0607
            goto L_0x0099
        L_0x0607:
            r0 = 40
            goto L_0x0824
        L_0x060b:
            java.lang.String r0 = "taido_row"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0615
            goto L_0x0099
        L_0x0615:
            r0 = 39
            goto L_0x0824
        L_0x0619:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0623
            goto L_0x0099
        L_0x0623:
            r0 = 38
            goto L_0x0824
        L_0x0627:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0631
            goto L_0x0099
        L_0x0631:
            r0 = 37
            goto L_0x0824
        L_0x0635:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x063f
            goto L_0x0099
        L_0x063f:
            r0 = 36
            goto L_0x0824
        L_0x0643:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x064d
            goto L_0x0099
        L_0x064d:
            r0 = 35
            goto L_0x0824
        L_0x0651:
            java.lang.String r0 = "whyred"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x065b
            goto L_0x0099
        L_0x065b:
            r0 = 34
            goto L_0x0824
        L_0x065f:
            java.lang.String r0 = "watson"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0669
            goto L_0x0099
        L_0x0669:
            r0 = 33
            goto L_0x0824
        L_0x066d:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0677
            goto L_0x0099
        L_0x0677:
            r0 = 32
            goto L_0x0824
        L_0x067b:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0685
            goto L_0x0099
        L_0x0685:
            r0 = 31
            goto L_0x0824
        L_0x0689:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0693
            goto L_0x0099
        L_0x0693:
            r0 = 30
            goto L_0x0824
        L_0x0697:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x06a1
            goto L_0x0099
        L_0x06a1:
            r0 = 29
            goto L_0x0824
        L_0x06a5:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x06af
            goto L_0x0099
        L_0x06af:
            r0 = r11
            goto L_0x0824
        L_0x06b2:
            java.lang.String r0 = "s905x018"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x06bc
            goto L_0x0099
        L_0x06bc:
            r0 = r1
            goto L_0x0824
        L_0x06bf:
            java.lang.String r1 = "A10-70L"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0824
            goto L_0x0099
        L_0x06c9:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x06d3
            goto L_0x0099
        L_0x06d3:
            r0 = 25
            goto L_0x0824
        L_0x06d7:
            java.lang.String r0 = "namath"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x06e1
            goto L_0x0099
        L_0x06e1:
            r0 = 24
            goto L_0x0824
        L_0x06e5:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x06ef
            goto L_0x0099
        L_0x06ef:
            r0 = 23
            goto L_0x0824
        L_0x06f3:
            java.lang.String r0 = "iris60"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x06fd
            goto L_0x0099
        L_0x06fd:
            r0 = 22
            goto L_0x0824
        L_0x0701:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x070b
            goto L_0x0099
        L_0x070b:
            r0 = 21
            goto L_0x0824
        L_0x070f:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0719
            goto L_0x0099
        L_0x0719:
            r0 = 20
            goto L_0x0824
        L_0x071d:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0727
            goto L_0x0099
        L_0x0727:
            r0 = 19
            goto L_0x0824
        L_0x072b:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0735
            goto L_0x0099
        L_0x0735:
            r0 = 18
            goto L_0x0824
        L_0x0739:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0743
            goto L_0x0099
        L_0x0743:
            r0 = 17
            goto L_0x0824
        L_0x0747:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0751
            goto L_0x0099
        L_0x0751:
            r0 = 16
            goto L_0x0824
        L_0x0755:
            java.lang.String r0 = "pacificrim"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x075f
            goto L_0x0099
        L_0x075f:
            r0 = 15
            goto L_0x0824
        L_0x0763:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x076d
            goto L_0x0099
        L_0x076d:
            r0 = 14
            goto L_0x0824
        L_0x0771:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x077b
            goto L_0x0099
        L_0x077b:
            r0 = 13
            goto L_0x0824
        L_0x077f:
            java.lang.String r0 = "XT1663"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0789
            goto L_0x0099
        L_0x0789:
            r0 = 12
            goto L_0x0824
        L_0x078d:
            java.lang.String r0 = "RAIJIN"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0797
            goto L_0x0099
        L_0x0797:
            r0 = 11
            goto L_0x0824
        L_0x079b:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x07a5
            goto L_0x0099
        L_0x07a5:
            r0 = 10
            goto L_0x0824
        L_0x07a9:
            java.lang.String r0 = "PGN611"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x07b3
            goto L_0x0099
        L_0x07b3:
            r0 = 9
            goto L_0x0824
        L_0x07b7:
            java.lang.String r0 = "PGN610"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x07c1
            goto L_0x0099
        L_0x07c1:
            r0 = 8
            goto L_0x0824
        L_0x07c5:
            java.lang.String r0 = "PGN528"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x07cf
            goto L_0x0099
        L_0x07cf:
            r0 = r2
            goto L_0x0824
        L_0x07d1:
            java.lang.String r0 = "NX573J"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x07db
            goto L_0x0099
        L_0x07db:
            r0 = r3
            goto L_0x0824
        L_0x07dd:
            java.lang.String r0 = "NX541J"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x07e7
            goto L_0x0099
        L_0x07e7:
            r0 = r4
            goto L_0x0824
        L_0x07e9:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x07f3
            goto L_0x0099
        L_0x07f3:
            r0 = r5
            goto L_0x0824
        L_0x07f5:
            java.lang.String r0 = "K50a40"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x07ff
            goto L_0x0099
        L_0x07ff:
            r0 = r6
            goto L_0x0824
        L_0x0801:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x080b
            goto L_0x0099
        L_0x080b:
            r0 = r7
            goto L_0x0824
        L_0x080d:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0817
            goto L_0x0099
        L_0x0817:
            r0 = r12
            goto L_0x0824
        L_0x0819:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0823
            goto L_0x0099
        L_0x0823:
            r0 = r9
        L_0x0824:
            switch(r0) {
                case 0: goto L_0x0857;
                case 1: goto L_0x0857;
                case 2: goto L_0x0857;
                case 3: goto L_0x0857;
                case 4: goto L_0x0857;
                case 5: goto L_0x0857;
                case 6: goto L_0x0857;
                case 7: goto L_0x0857;
                case 8: goto L_0x0857;
                case 9: goto L_0x0857;
                case 10: goto L_0x0857;
                case 11: goto L_0x0857;
                case 12: goto L_0x0857;
                case 13: goto L_0x0857;
                case 14: goto L_0x0857;
                case 15: goto L_0x0857;
                case 16: goto L_0x0857;
                case 17: goto L_0x0857;
                case 18: goto L_0x0857;
                case 19: goto L_0x0857;
                case 20: goto L_0x0857;
                case 21: goto L_0x0857;
                case 22: goto L_0x0857;
                case 23: goto L_0x0857;
                case 24: goto L_0x0857;
                case 25: goto L_0x0857;
                case 26: goto L_0x0857;
                case 27: goto L_0x0857;
                case 28: goto L_0x0857;
                case 29: goto L_0x0857;
                case 30: goto L_0x0857;
                case 31: goto L_0x0857;
                case 32: goto L_0x0857;
                case 33: goto L_0x0857;
                case 34: goto L_0x0857;
                case 35: goto L_0x0857;
                case 36: goto L_0x0857;
                case 37: goto L_0x0857;
                case 38: goto L_0x0857;
                case 39: goto L_0x0857;
                case 40: goto L_0x0857;
                case 41: goto L_0x0857;
                case 42: goto L_0x0857;
                case 43: goto L_0x0857;
                case 44: goto L_0x0857;
                case 45: goto L_0x0857;
                case 46: goto L_0x0857;
                case 47: goto L_0x0857;
                case 48: goto L_0x0857;
                case 49: goto L_0x0857;
                case 50: goto L_0x0857;
                case 51: goto L_0x0857;
                case 52: goto L_0x0857;
                case 53: goto L_0x0857;
                case 54: goto L_0x0857;
                case 55: goto L_0x0857;
                case 56: goto L_0x0857;
                case 57: goto L_0x0857;
                case 58: goto L_0x0857;
                case 59: goto L_0x0857;
                case 60: goto L_0x0857;
                case 61: goto L_0x0857;
                case 62: goto L_0x0857;
                case 63: goto L_0x0857;
                case 64: goto L_0x0857;
                case 65: goto L_0x0857;
                case 66: goto L_0x0857;
                case 67: goto L_0x0857;
                case 68: goto L_0x0857;
                case 69: goto L_0x0857;
                case 70: goto L_0x0857;
                case 71: goto L_0x0857;
                case 72: goto L_0x0857;
                case 73: goto L_0x0857;
                case 74: goto L_0x0857;
                case 75: goto L_0x0857;
                case 76: goto L_0x0857;
                case 77: goto L_0x0857;
                case 78: goto L_0x0857;
                case 79: goto L_0x0857;
                case 80: goto L_0x0857;
                case 81: goto L_0x0857;
                case 82: goto L_0x0857;
                case 83: goto L_0x0857;
                case 84: goto L_0x0857;
                case 85: goto L_0x0857;
                case 86: goto L_0x0857;
                case 87: goto L_0x0857;
                case 88: goto L_0x0857;
                case 89: goto L_0x0857;
                case 90: goto L_0x0857;
                case 91: goto L_0x0857;
                case 92: goto L_0x0857;
                case 93: goto L_0x0857;
                case 94: goto L_0x0857;
                case 95: goto L_0x0857;
                case 96: goto L_0x0857;
                case 97: goto L_0x0857;
                case 98: goto L_0x0857;
                case 99: goto L_0x0857;
                case 100: goto L_0x0857;
                case 101: goto L_0x0857;
                case 102: goto L_0x0857;
                case 103: goto L_0x0857;
                case 104: goto L_0x0857;
                case 105: goto L_0x0857;
                case 106: goto L_0x0857;
                case 107: goto L_0x0857;
                case 108: goto L_0x0857;
                case 109: goto L_0x0857;
                case 110: goto L_0x0857;
                case 111: goto L_0x0857;
                case 112: goto L_0x0857;
                case 113: goto L_0x0857;
                case 114: goto L_0x0857;
                case 115: goto L_0x0857;
                case 116: goto L_0x0857;
                case 117: goto L_0x0857;
                case 118: goto L_0x0857;
                case 119: goto L_0x0857;
                case 120: goto L_0x0857;
                case 121: goto L_0x0857;
                case 122: goto L_0x0857;
                case 123: goto L_0x0857;
                case 124: goto L_0x0857;
                case 125: goto L_0x0857;
                case 126: goto L_0x0857;
                case 127: goto L_0x0857;
                case 128: goto L_0x0857;
                case 129: goto L_0x0857;
                case 130: goto L_0x0857;
                case 131: goto L_0x0857;
                case 132: goto L_0x0857;
                case 133: goto L_0x0857;
                case 134: goto L_0x0857;
                case 135: goto L_0x0857;
                case 136: goto L_0x0857;
                case 137: goto L_0x0857;
                case 138: goto L_0x0857;
                case 139: goto L_0x0857;
                default: goto L_0x0827;
            }
        L_0x0827:
            java.lang.String r0 = ja.M.f44984d
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x0849;
                case 2006354: goto L_0x083e;
                case 2006367: goto L_0x0835;
                default: goto L_0x0833;
            }
        L_0x0833:
            r7 = r8
            goto L_0x0853
        L_0x0835:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0853
            goto L_0x0833
        L_0x083e:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0847
            goto L_0x0833
        L_0x0847:
            r7 = r12
            goto L_0x0853
        L_0x0849:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0852
            goto L_0x0833
        L_0x0852:
            r7 = r9
        L_0x0853:
            switch(r7) {
                case 0: goto L_0x0857;
                case 1: goto L_0x0857;
                case 2: goto L_0x0857;
                default: goto L_0x0856;
            }
        L_0x0856:
            goto L_0x0858
        L_0x0857:
            return r12
        L_0x0858:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.h.D1():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r9.equals("video/av01") == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int E1(C9.n r11, k9.C3717q0 r12) {
        /*
            r0 = 4
            r1 = 3
            java.lang.String r2 = "video/hevc"
            java.lang.String r3 = "video/avc"
            r4 = 1
            r5 = 2
            int r6 = r12.f45775q
            int r7 = r12.f45776r
            r8 = -1
            if (r6 == r8) goto L_0x00cf
            if (r7 != r8) goto L_0x0013
            goto L_0x00cf
        L_0x0013:
            java.lang.String r9 = r12.f45770l
            java.lang.String r10 = "video/dolby-vision"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x0036
            android.util.Pair r12 = C9.v.q(r12)
            if (r12 == 0) goto L_0x0035
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9 = 512(0x200, float:7.175E-43)
            if (r12 == r9) goto L_0x0033
            if (r12 == r4) goto L_0x0033
            if (r12 != r5) goto L_0x0035
        L_0x0033:
            r9 = r3
            goto L_0x0036
        L_0x0035:
            r9 = r2
        L_0x0036:
            r9.hashCode()
            int r12 = r9.hashCode()
            switch(r12) {
                case -1664118616: goto L_0x007e;
                case -1662735862: goto L_0x0075;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0061;
                case 1331836730: goto L_0x0058;
                case 1599127256: goto L_0x004d;
                case 1599127257: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r4 = r8
            goto L_0x0088
        L_0x0042:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r4 = 6
            goto L_0x0088
        L_0x004d:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r4 = 5
            goto L_0x0088
        L_0x0058:
            boolean r12 = r9.equals(r3)
            if (r12 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r4 = r0
            goto L_0x0088
        L_0x0061:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            r4 = r1
            goto L_0x0088
        L_0x006c:
            boolean r12 = r9.equals(r2)
            if (r12 != 0) goto L_0x0073
            goto L_0x0040
        L_0x0073:
            r4 = r5
            goto L_0x0088
        L_0x0075:
            java.lang.String r12 = "video/av01"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0088
            goto L_0x0040
        L_0x007e:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0087
            goto L_0x0040
        L_0x0087:
            r4 = 0
        L_0x0088:
            switch(r4) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00c8;
                case 4: goto L_0x008c;
                case 5: goto L_0x00c8;
                case 6: goto L_0x00c5;
                default: goto L_0x008b;
            }
        L_0x008b:
            return r8
        L_0x008c:
            java.lang.String r12 = ja.M.f44984d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "Amazon"
            java.lang.String r2 = ja.M.f44983c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "AFTS"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x00b5
            boolean r11 = r11.f30172g
            if (r11 == 0) goto L_0x00b5
            goto L_0x00c4
        L_0x00b5:
            r11 = 16
            int r12 = ja.M.l(r6, r11)
            int r11 = ja.M.l(r7, r11)
            int r12 = r12 * r11
            int r12 = r12 * 256
        L_0x00c2:
            r0 = r5
            goto L_0x00cb
        L_0x00c4:
            return r8
        L_0x00c5:
            int r12 = r6 * r7
            goto L_0x00cb
        L_0x00c8:
            int r12 = r6 * r7
            goto L_0x00c2
        L_0x00cb:
            int r12 = r12 * r1
            int r0 = r0 * r5
            int r12 = r12 / r0
            return r12
        L_0x00cf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.h.E1(C9.n, k9.q0):int");
    }

    private static Point F1(n nVar, C3717q0 q0Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13 = q0Var.f45776r;
        int i14 = q0Var.f45775q;
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
        for (int i15 : f45987I1) {
            int i16 = (int) (((float) i15) * f10);
            if (i15 <= i10 || i16 <= i13) {
                break;
            }
            if (M.f44981a >= 21) {
                if (z10) {
                    i12 = i16;
                } else {
                    i12 = i15;
                }
                if (!z10) {
                    i15 = i16;
                }
                Point b10 = nVar.b(i12, i15);
                if (nVar.u(b10.x, b10.y, (double) q0Var.f45777s)) {
                    return b10;
                }
            } else {
                try {
                    int l10 = M.l(i15, 16) * 16;
                    int l11 = M.l(i16, 16) * 16;
                    if (l10 * l11 <= v.N()) {
                        if (z10) {
                            i11 = l11;
                        } else {
                            i11 = l10;
                        }
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i11, l10);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    private static List H1(q qVar, C3717q0 q0Var, boolean z10, boolean z11) {
        String str = q0Var.f45770l;
        if (str == null) {
            return C4770v.E();
        }
        List a10 = qVar.a(str, z10, z11);
        String m10 = v.m(q0Var);
        if (m10 == null) {
            return C4770v.z(a10);
        }
        return C4770v.t().j(a10).j(qVar.a(m10, z10, z11)).k();
    }

    protected static int I1(n nVar, C3717q0 q0Var) {
        if (q0Var.f45771m == -1) {
            return E1(nVar, q0Var);
        }
        int size = q0Var.f45772n.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((byte[]) q0Var.f45772n.get(i11)).length;
        }
        return q0Var.f45771m + i10;
    }

    private static boolean K1(long j10) {
        if (j10 < -30000) {
            return true;
        }
        return false;
    }

    private static boolean L1(long j10) {
        if (j10 < -500000) {
            return true;
        }
        return false;
    }

    private void N1() {
        if (this.f46017s1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f46000b1.n(this.f46017s1, elapsedRealtime - this.f46016r1);
            this.f46017s1 = 0;
            this.f46016r1 = elapsedRealtime;
        }
    }

    private void P1() {
        int i10 = this.f46023y1;
        if (i10 != 0) {
            this.f46000b1.B(this.f46022x1, i10);
            this.f46022x1 = 0;
            this.f46023y1 = 0;
        }
    }

    private void Q1() {
        int i10 = this.f46024z1;
        if (i10 != -1 || this.f45990A1 != -1) {
            y yVar = this.f45993D1;
            if (yVar == null || yVar.f46097a != i10 || yVar.f46098b != this.f45990A1 || yVar.f46099c != this.f45991B1 || yVar.f46100d != this.f45992C1) {
                y yVar2 = new y(this.f46024z1, this.f45990A1, this.f45991B1, this.f45992C1);
                this.f45993D1 = yVar2;
                this.f46000b1.D(yVar2);
            }
        }
    }

    private void R1() {
        if (this.f46009k1) {
            this.f46000b1.A(this.f46007i1);
        }
    }

    private void S1() {
        y yVar = this.f45993D1;
        if (yVar != null) {
            this.f46000b1.D(yVar);
        }
    }

    private void T1(long j10, long j11, C3717q0 q0Var) {
        j jVar = this.f45997H1;
        if (jVar != null) {
            jVar.f(j10, j11, q0Var, z0());
        }
    }

    /* access modifiers changed from: private */
    public void V1() {
        j1();
    }

    private void W1() {
        Surface surface = this.f46007i1;
        i iVar = this.f46008j1;
        if (surface == iVar) {
            this.f46007i1 = null;
        }
        iVar.release();
        this.f46008j1 = null;
    }

    private static void Z1(l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.b(bundle);
    }

    private void a2() {
        long j10;
        if (this.f46001c1 > 0) {
            j10 = SystemClock.elapsedRealtime() + this.f46001c1;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f46015q1 = j10;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b2(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L_0x0007
            android.view.Surface r5 = (android.view.Surface) r5
            goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r5 != 0) goto L_0x0026
            ka.i r0 = r4.f46008j1
            if (r0 == 0) goto L_0x0010
            r5 = r0
            goto L_0x0026
        L_0x0010:
            C9.n r0 = r4.w0()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r4.g2(r0)
            if (r1 == 0) goto L_0x0026
            android.content.Context r5 = r4.f45998Z0
            boolean r0 = r0.f30172g
            ka.i r5 = ka.i.c(r5, r0)
            r4.f46008j1 = r5
        L_0x0026:
            android.view.Surface r0 = r4.f46007i1
            if (r0 == r5) goto L_0x006e
            r4.f46007i1 = r5
            ka.l r0 = r4.f45999a1
            r0.m(r5)
            r0 = 0
            r4.f46009k1 = r0
            int r0 = r4.getState()
            C9.l r1 = r4.v0()
            if (r1 == 0) goto L_0x0054
            int r2 = ja.M.f44981a
            r3 = 23
            if (r2 < r3) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            boolean r2 = r4.f46005g1
            if (r2 != 0) goto L_0x004e
            r4.c2(r1, r5)
            goto L_0x0054
        L_0x004e:
            r4.c1()
            r4.N0()
        L_0x0054:
            if (r5 == 0) goto L_0x0067
            ka.i r1 = r4.f46008j1
            if (r5 == r1) goto L_0x0067
            r4.S1()
            r4.x1()
            r5 = 2
            if (r0 != r5) goto L_0x007a
            r4.a2()
            goto L_0x007a
        L_0x0067:
            r4.y1()
            r4.x1()
            goto L_0x007a
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            ka.i r0 = r4.f46008j1
            if (r5 == r0) goto L_0x007a
            r4.S1()
            r4.R1()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.h.b2(java.lang.Object):void");
    }

    private boolean g2(n nVar) {
        if (M.f44981a < 23 || this.f45994E1 || z1(nVar.f30166a) || (nVar.f30172g && !i.b(this.f45998Z0))) {
            return false;
        }
        return true;
    }

    private void x1() {
        l v02;
        this.f46011m1 = false;
        if (M.f44981a >= 23 && this.f45994E1 && (v02 = v0()) != null) {
            this.f45996G1 = new b(v02);
        }
    }

    private void y1() {
        this.f45993D1 = null;
    }

    /* access modifiers changed from: protected */
    public List A0(q qVar, C3717q0 q0Var, boolean z10) {
        return v.u(H1(qVar, q0Var, z10, this.f45994E1), q0Var);
    }

    /* access modifiers changed from: protected */
    public l.a C0(n nVar, C3717q0 q0Var, MediaCrypto mediaCrypto, float f10) {
        int i10;
        i iVar = this.f46008j1;
        if (!(iVar == null || iVar.f46032a == nVar.f30172g)) {
            W1();
        }
        String str = nVar.f30168c;
        a G12 = G1(nVar, q0Var, L());
        this.f46004f1 = G12;
        boolean z10 = this.f46003e1;
        if (this.f45994E1) {
            i10 = this.f45995F1;
        } else {
            i10 = 0;
        }
        MediaFormat J12 = J1(q0Var, str, G12, f10, z10, i10);
        if (this.f46007i1 == null) {
            if (g2(nVar)) {
                if (this.f46008j1 == null) {
                    this.f46008j1 = i.c(this.f45998Z0, nVar.f30172g);
                }
                this.f46007i1 = this.f46008j1;
            } else {
                throw new IllegalStateException();
            }
        }
        return l.a.b(nVar, J12, q0Var, this.f46007i1, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public void C1(l lVar, int i10, long j10) {
        J.a("dropVideoBuffer");
        lVar.l(i10, false);
        J.c();
        i2(0, 1);
    }

    /* access modifiers changed from: protected */
    public void F0(C3871g gVar) {
        if (this.f46006h1) {
            ByteBuffer byteBuffer = (ByteBuffer) C3645a.e(gVar.f46953f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    Z1(v0(), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public a G1(n nVar, C3717q0 q0Var, C3717q0[] q0VarArr) {
        boolean z10;
        int E12;
        int i10 = q0Var.f45775q;
        int i11 = q0Var.f45776r;
        int I12 = I1(nVar, q0Var);
        if (q0VarArr.length == 1) {
            if (!(I12 == -1 || (E12 = E1(nVar, q0Var)) == -1)) {
                I12 = Math.min((int) (((float) I12) * 1.5f), E12);
            }
            return new a(i10, i11, I12);
        }
        int length = q0VarArr.length;
        boolean z11 = false;
        for (int i12 = 0; i12 < length; i12++) {
            C3717q0 q0Var2 = q0VarArr[i12];
            if (q0Var.f45782x != null && q0Var2.f45782x == null) {
                q0Var2 = q0Var2.b().J(q0Var.f45782x).E();
            }
            if (nVar.e(q0Var, q0Var2).f46963d != 0) {
                int i13 = q0Var2.f45775q;
                if (i13 == -1 || q0Var2.f45776r == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 |= z10;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, q0Var2.f45776r);
                I12 = Math.max(I12, I1(nVar, q0Var2));
            }
        }
        if (z11) {
            s.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point F12 = F1(nVar, q0Var);
            if (F12 != null) {
                i10 = Math.max(i10, F12.x);
                i11 = Math.max(i11, F12.y);
                I12 = Math.max(I12, E1(nVar, q0Var.b().j0(i10).Q(i11).E()));
                s.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new a(i10, i11, I12);
    }

    /* access modifiers changed from: protected */
    public MediaFormat J1(C3717q0 q0Var, String str, a aVar, float f10, boolean z10, int i10) {
        Pair q10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(Snapshot.WIDTH, q0Var.f45775q);
        mediaFormat.setInteger(Snapshot.HEIGHT, q0Var.f45776r);
        ja.v.e(mediaFormat, q0Var.f45772n);
        ja.v.c(mediaFormat, "frame-rate", q0Var.f45777s);
        ja.v.d(mediaFormat, "rotation-degrees", q0Var.f45778t);
        ja.v.b(mediaFormat, q0Var.f45782x);
        if ("video/dolby-vision".equals(q0Var.f45770l) && (q10 = v.q(q0Var)) != null) {
            ja.v.d(mediaFormat, "profile", ((Integer) q10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f46025a);
        mediaFormat.setInteger("max-height", aVar.f46026b);
        ja.v.d(mediaFormat, "max-input-size", aVar.f46027c);
        if (M.f44981a >= 23) {
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
            A1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public boolean M1(long j10, boolean z10) {
        int W10 = W(j10);
        if (W10 == 0) {
            return false;
        }
        if (z10) {
            C3869e eVar = this.f30207U0;
            eVar.f46940d += W10;
            eVar.f46942f += this.f46019u1;
        } else {
            this.f30207U0.f46946j++;
            i2(W10, this.f46019u1);
        }
        s0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void N() {
        y1();
        x1();
        this.f46009k1 = false;
        this.f45996G1 = null;
        try {
            super.N();
        } finally {
            this.f46000b1.m(this.f30207U0);
        }
    }

    /* access modifiers changed from: protected */
    public void O(boolean z10, boolean z11) {
        boolean z12;
        super.O(z10, z11);
        boolean z13 = H().f45520a;
        if (!z13 || this.f45995F1 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        C3645a.f(z12);
        if (this.f45994E1 != z13) {
            this.f45994E1 = z13;
            c1();
        }
        this.f46000b1.o(this.f30207U0);
        this.f46012n1 = z11;
        this.f46013o1 = false;
    }

    /* access modifiers changed from: package-private */
    public void O1() {
        this.f46013o1 = true;
        if (!this.f46011m1) {
            this.f46011m1 = true;
            this.f46000b1.A(this.f46007i1);
            this.f46009k1 = true;
        }
    }

    /* access modifiers changed from: protected */
    public void P(long j10, boolean z10) {
        super.P(j10, z10);
        x1();
        this.f45999a1.j();
        this.f46020v1 = -9223372036854775807L;
        this.f46014p1 = -9223372036854775807L;
        this.f46018t1 = 0;
        if (z10) {
            a2();
        } else {
            this.f46015q1 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    public void P0(Exception exc) {
        s.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f46000b1.C(exc);
    }

    /* access modifiers changed from: protected */
    public void Q() {
        try {
            super.Q();
        } finally {
            if (this.f46008j1 != null) {
                W1();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void Q0(String str, l.a aVar, long j10, long j11) {
        this.f46000b1.k(str, j10, j11);
        this.f46005g1 = z1(str);
        this.f46006h1 = ((n) C3645a.e(w0())).n();
        if (M.f44981a >= 23 && this.f45994E1) {
            this.f45996G1 = new b((l) C3645a.e(v0()));
        }
    }

    /* access modifiers changed from: protected */
    public void R() {
        super.R();
        this.f46017s1 = 0;
        this.f46016r1 = SystemClock.elapsedRealtime();
        this.f46021w1 = SystemClock.elapsedRealtime() * 1000;
        this.f46022x1 = 0;
        this.f46023y1 = 0;
        this.f45999a1.k();
    }

    /* access modifiers changed from: protected */
    public void R0(String str) {
        this.f46000b1.l(str);
    }

    /* access modifiers changed from: protected */
    public void S() {
        this.f46015q1 = -9223372036854775807L;
        N1();
        P1();
        this.f45999a1.l();
        super.S();
    }

    /* access modifiers changed from: protected */
    public C3873i S0(C3718r0 r0Var) {
        C3873i S02 = super.S0(r0Var);
        this.f46000b1.p(r0Var.f45824b, S02);
        return S02;
    }

    /* access modifiers changed from: protected */
    public void T0(C3717q0 q0Var, MediaFormat mediaFormat) {
        boolean z10;
        int i10;
        int i11;
        l v02 = v0();
        if (v02 != null) {
            v02.d(this.f46010l1);
        }
        if (this.f45994E1) {
            this.f46024z1 = q0Var.f45775q;
            this.f45990A1 = q0Var.f45776r;
        } else {
            C3645a.e(mediaFormat);
            if (!mediaFormat.containsKey("crop-right") || !mediaFormat.containsKey("crop-left") || !mediaFormat.containsKey("crop-bottom") || !mediaFormat.containsKey("crop-top")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i10 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i10 = mediaFormat.getInteger(Snapshot.WIDTH);
            }
            this.f46024z1 = i10;
            if (z10) {
                i11 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i11 = mediaFormat.getInteger(Snapshot.HEIGHT);
            }
            this.f45990A1 = i11;
        }
        float f10 = q0Var.f45779u;
        this.f45992C1 = f10;
        if (M.f44981a >= 21) {
            int i12 = q0Var.f45778t;
            if (i12 == 90 || i12 == 270) {
                int i13 = this.f46024z1;
                this.f46024z1 = this.f45990A1;
                this.f45990A1 = i13;
                this.f45992C1 = 1.0f / f10;
            }
        } else {
            this.f45991B1 = q0Var.f45778t;
        }
        this.f45999a1.g(q0Var.f45777s);
    }

    /* access modifiers changed from: protected */
    public void U0(long j10) {
        super.U0(j10);
        if (!this.f45994E1) {
            this.f46019u1--;
        }
    }

    /* access modifiers changed from: protected */
    public void U1(long j10) {
        u1(j10);
        Q1();
        this.f30207U0.f46941e++;
        O1();
        U0(j10);
    }

    /* access modifiers changed from: protected */
    public void V0() {
        super.V0();
        x1();
    }

    /* access modifiers changed from: protected */
    public void W0(C3871g gVar) {
        boolean z10 = this.f45994E1;
        if (!z10) {
            this.f46019u1++;
        }
        if (M.f44981a < 23 && z10) {
            U1(gVar.f46952e);
        }
    }

    /* access modifiers changed from: protected */
    public void X1(l lVar, int i10, long j10) {
        Q1();
        J.a("releaseOutputBuffer");
        lVar.l(i10, true);
        J.c();
        this.f46021w1 = SystemClock.elapsedRealtime() * 1000;
        this.f30207U0.f46941e++;
        this.f46018t1 = 0;
        O1();
    }

    /* access modifiers changed from: protected */
    public boolean Y0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C3717q0 q0Var) {
        boolean z12;
        long j13;
        boolean z13;
        boolean z14;
        long j14 = j10;
        l lVar2 = lVar;
        int i13 = i10;
        long j15 = j12;
        C3645a.e(lVar);
        if (this.f46014p1 == -9223372036854775807L) {
            this.f46014p1 = j14;
        }
        if (j15 != this.f46020v1) {
            this.f45999a1.h(j15);
            this.f46020v1 = j15;
        }
        long D02 = D0();
        long j16 = j15 - D02;
        if (!z10 || z11) {
            double E02 = (double) E0();
            if (getState() == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j17 = (long) (((double) (j15 - j14)) / E02);
            if (z12) {
                j17 -= elapsedRealtime - j11;
            }
            if (this.f46007i1 != this.f46008j1) {
                long j18 = elapsedRealtime - this.f46021w1;
                if (this.f46013o1 ? this.f46011m1 : !z12 && !this.f46012n1) {
                    j13 = j18;
                    z13 = false;
                } else {
                    z13 = true;
                    j13 = j18;
                }
                if (this.f46015q1 != -9223372036854775807L || j14 < D02 || (!z13 && (!z12 || !f2(j17, j13)))) {
                    if (z12 && j14 != this.f46014p1) {
                        long nanoTime = System.nanoTime();
                        long b10 = this.f45999a1.b((j17 * 1000) + nanoTime);
                        long j19 = (b10 - nanoTime) / 1000;
                        if (this.f46015q1 != -9223372036854775807L) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        long j20 = j19;
                        if (d2(j19, j11, z11) && M1(j14, z14)) {
                            return false;
                        }
                        if (e2(j20, j11, z11)) {
                            if (z14) {
                                h2(lVar2, i13, j16);
                            } else {
                                C1(lVar2, i13, j16);
                            }
                            j2(j20);
                            return true;
                        }
                        long j21 = j20;
                        if (M.f44981a >= 21) {
                            if (j21 < 50000) {
                                T1(j16, b10, q0Var);
                                Y1(lVar, i10, j16, b10);
                                j2(j21);
                                return true;
                            }
                        } else if (j21 < 30000) {
                            if (j21 > 11000) {
                                try {
                                    Thread.sleep((j21 - 10000) / 1000);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    return false;
                                }
                            }
                            T1(j16, b10, q0Var);
                            X1(lVar2, i13, j16);
                            j2(j21);
                            return true;
                        }
                    }
                    return false;
                }
                long nanoTime2 = System.nanoTime();
                T1(j16, nanoTime2, q0Var);
                if (M.f44981a >= 21) {
                    Y1(lVar, i10, j16, nanoTime2);
                } else {
                    X1(lVar2, i13, j16);
                }
                j2(j17);
                return true;
            } else if (!K1(j17)) {
                return false;
            } else {
                h2(lVar2, i13, j16);
                j2(j17);
                return true;
            }
        } else {
            h2(lVar2, i13, j16);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void Y1(l lVar, int i10, long j10, long j11) {
        Q1();
        J.a("releaseOutputBuffer");
        lVar.i(i10, j11);
        J.c();
        this.f46021w1 = SystemClock.elapsedRealtime() * 1000;
        this.f30207U0.f46941e++;
        this.f46018t1 = 0;
        O1();
    }

    /* access modifiers changed from: protected */
    public C3873i Z(n nVar, C3717q0 q0Var, C3717q0 q0Var2) {
        int i10;
        C3873i e10 = nVar.e(q0Var, q0Var2);
        int i11 = e10.f46964e;
        int i12 = q0Var2.f45775q;
        a aVar = this.f46004f1;
        if (i12 > aVar.f46025a || q0Var2.f45776r > aVar.f46026b) {
            i11 |= 256;
        }
        if (I1(nVar, q0Var2) > this.f46004f1.f46027c) {
            i11 |= 64;
        }
        int i13 = i11;
        String str = nVar.f30166a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = e10.f46963d;
        }
        return new C3873i(str, q0Var, q0Var2, i10, i13);
    }

    /* access modifiers changed from: protected */
    public void c2(l lVar, Surface surface) {
        lVar.f(surface);
    }

    public boolean d() {
        i iVar;
        if (super.d() && (this.f46011m1 || (((iVar = this.f46008j1) != null && this.f46007i1 == iVar) || v0() == null || this.f45994E1))) {
            this.f46015q1 = -9223372036854775807L;
            return true;
        } else if (this.f46015q1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f46015q1) {
                return true;
            }
            this.f46015q1 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean d2(long j10, long j11, boolean z10) {
        if (!L1(j10) || z10) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void e1() {
        super.e1();
        this.f46019u1 = 0;
    }

    /* access modifiers changed from: protected */
    public boolean e2(long j10, long j11, boolean z10) {
        if (!K1(j10) || z10) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean f2(long j10, long j11) {
        if (!K1(j10) || j11 <= 100000) {
            return false;
        }
        return true;
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    public void h2(l lVar, int i10, long j10) {
        J.a("skipVideoBuffer");
        lVar.l(i10, false);
        J.c();
        this.f30207U0.f46942f++;
    }

    /* access modifiers changed from: protected */
    public void i2(int i10, int i11) {
        C3869e eVar = this.f30207U0;
        eVar.f46944h += i10;
        int i12 = i10 + i11;
        eVar.f46943g += i12;
        this.f46017s1 += i12;
        int i13 = this.f46018t1 + i12;
        this.f46018t1 = i13;
        eVar.f46945i = Math.max(i13, eVar.f46945i);
        int i14 = this.f46002d1;
        if (i14 > 0 && this.f46017s1 >= i14) {
            N1();
        }
    }

    /* access modifiers changed from: protected */
    public m j0(Throwable th2, n nVar) {
        return new g(th2, nVar, this.f46007i1);
    }

    /* access modifiers changed from: protected */
    public void j2(long j10) {
        this.f30207U0.a(j10);
        this.f46022x1 += j10;
        this.f46023y1++;
    }

    /* access modifiers changed from: protected */
    public boolean n1(n nVar) {
        if (this.f46007i1 != null || g2(nVar)) {
            return true;
        }
        return false;
    }

    public void p(int i10, Object obj) {
        if (i10 == 1) {
            b2(obj);
        } else if (i10 == 7) {
            this.f45997H1 = (j) obj;
        } else if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f45995F1 != intValue) {
                this.f45995F1 = intValue;
                if (this.f45994E1) {
                    c1();
                }
            }
        } else if (i10 == 4) {
            this.f46010l1 = ((Integer) obj).intValue();
            l v02 = v0();
            if (v02 != null) {
                v02.d(this.f46010l1);
            }
        } else if (i10 != 5) {
            super.p(i10, obj);
        } else {
            this.f45999a1.o(((Integer) obj).intValue());
        }
    }

    /* access modifiers changed from: protected */
    public int q1(q qVar, C3717q0 q0Var) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!ja.w.s(q0Var.f45770l)) {
            return b1.o(0);
        }
        if (q0Var.f45773o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        List H12 = H1(qVar, q0Var, z10, false);
        if (z10 && H12.isEmpty()) {
            H12 = H1(qVar, q0Var, false, false);
        }
        if (H12.isEmpty()) {
            return b1.o(1);
        }
        if (!o.r1(q0Var)) {
            return b1.o(2);
        }
        n nVar = (n) H12.get(0);
        boolean m10 = nVar.m(q0Var);
        if (!m10) {
            int i15 = 1;
            while (true) {
                if (i15 >= H12.size()) {
                    break;
                }
                n nVar2 = (n) H12.get(i15);
                if (nVar2.m(q0Var)) {
                    z11 = false;
                    m10 = true;
                    nVar = nVar2;
                    break;
                }
                i15++;
            }
        }
        z11 = true;
        if (m10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (nVar.p(q0Var)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (nVar.f30173h) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (m10) {
            List H13 = H1(qVar, q0Var, z10, true);
            if (!H13.isEmpty()) {
                n nVar3 = (n) v.u(H13, q0Var).get(0);
                if (nVar3.m(q0Var) && nVar3.p(q0Var)) {
                    i14 = 32;
                }
            }
        }
        return b1.l(i10, i11, i14, i12, i13);
    }

    public void v(float f10, float f11) {
        super.v(f10, f11);
        this.f45999a1.i(f10);
    }

    /* access modifiers changed from: protected */
    public boolean x0() {
        if (!this.f45994E1 || M.f44981a >= 23) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public float y0(float f10, C3717q0 q0Var, C3717q0[] q0VarArr) {
        float f11 = -1.0f;
        for (C3717q0 q0Var2 : q0VarArr) {
            float f12 = q0Var2.f45777s;
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
    public boolean z1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            try {
                if (!f45988J1) {
                    f45989K1 = D1();
                    f45988J1 = true;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f45989K1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, l.b bVar, q qVar, long j10, boolean z10, Handler handler, w wVar, int i10, float f10) {
        super(2, bVar, qVar, z10, f10);
        this.f46001c1 = j10;
        this.f46002d1 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f45998Z0 = applicationContext;
        this.f45999a1 = new l(applicationContext);
        Handler handler2 = handler;
        w wVar2 = wVar;
        this.f46000b1 = new w.a(handler, wVar);
        this.f46003e1 = B1();
        this.f46015q1 = -9223372036854775807L;
        this.f46024z1 = -1;
        this.f45990A1 = -1;
        this.f45992C1 = -1.0f;
        this.f46010l1 = 1;
        this.f45995F1 = 0;
        y1();
    }
}
