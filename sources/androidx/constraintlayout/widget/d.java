package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.swmansion.reanimated.BuildConfig;
import g1.C2008c;
import i1.C2063e;
import i1.C2068j;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f14989i = {0, 4, 8};

    /* renamed from: j  reason: collision with root package name */
    private static SparseIntArray f14990j = new SparseIntArray();

    /* renamed from: k  reason: collision with root package name */
    private static SparseIntArray f14991k = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    private boolean f14992a;

    /* renamed from: b  reason: collision with root package name */
    public String f14993b;

    /* renamed from: c  reason: collision with root package name */
    public String f14994c = "";

    /* renamed from: d  reason: collision with root package name */
    private String[] f14995d = new String[0];

    /* renamed from: e  reason: collision with root package name */
    public int f14996e = 0;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f14997f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private boolean f14998g = true;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f14999h = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f15000a;

        /* renamed from: b  reason: collision with root package name */
        String f15001b;

        /* renamed from: c  reason: collision with root package name */
        public final C0278d f15002c = new C0278d();

        /* renamed from: d  reason: collision with root package name */
        public final c f15003d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f15004e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f15005f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap f15006g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        C0277a f15007h;

        /* renamed from: androidx.constraintlayout.widget.d$a$a  reason: collision with other inner class name */
        static class C0277a {

            /* renamed from: a  reason: collision with root package name */
            int[] f15008a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f15009b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f15010c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f15011d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f15012e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f15013f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f15014g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f15015h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f15016i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f15017j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f15018k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f15019l = 0;

            C0277a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i10, float f10) {
                int i11 = this.f15013f;
                int[] iArr = this.f15011d;
                if (i11 >= iArr.length) {
                    this.f15011d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f15012e;
                    this.f15012e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f15011d;
                int i12 = this.f15013f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f15012e;
                this.f15013f = i12 + 1;
                fArr2[i12] = f10;
            }

            /* access modifiers changed from: package-private */
            public void b(int i10, int i11) {
                int i12 = this.f15010c;
                int[] iArr = this.f15008a;
                if (i12 >= iArr.length) {
                    this.f15008a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f15009b;
                    this.f15009b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f15008a;
                int i13 = this.f15010c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f15009b;
                this.f15010c = i13 + 1;
                iArr4[i13] = i11;
            }

            /* access modifiers changed from: package-private */
            public void c(int i10, String str) {
                int i11 = this.f15016i;
                int[] iArr = this.f15014g;
                if (i11 >= iArr.length) {
                    this.f15014g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f15015h;
                    this.f15015h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f15014g;
                int i12 = this.f15016i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f15015h;
                this.f15016i = i12 + 1;
                strArr2[i12] = str;
            }

            /* access modifiers changed from: package-private */
            public void d(int i10, boolean z10) {
                int i11 = this.f15019l;
                int[] iArr = this.f15017j;
                if (i11 >= iArr.length) {
                    this.f15017j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f15018k;
                    this.f15018k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f15017j;
                int i12 = this.f15019l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f15018k;
                this.f15019l = i12 + 1;
                zArr2[i12] = z10;
            }

            /* access modifiers changed from: package-private */
            public void e(a aVar) {
                for (int i10 = 0; i10 < this.f15010c; i10++) {
                    d.N(aVar, this.f15008a[i10], this.f15009b[i10]);
                }
                for (int i11 = 0; i11 < this.f15013f; i11++) {
                    d.M(aVar, this.f15011d[i11], this.f15012e[i11]);
                }
                for (int i12 = 0; i12 < this.f15016i; i12++) {
                    d.O(aVar, this.f15014g[i12], this.f15015h[i12]);
                }
                for (int i13 = 0; i13 < this.f15019l; i13++) {
                    d.P(aVar, this.f15017j[i13], this.f15018k[i13]);
                }
            }
        }

        /* access modifiers changed from: private */
        public void e(int i10, ConstraintLayout.b bVar) {
            this.f15000a = i10;
            b bVar2 = this.f15004e;
            bVar2.f15065j = bVar.f14896e;
            bVar2.f15067k = bVar.f14898f;
            bVar2.f15069l = bVar.f14900g;
            bVar2.f15071m = bVar.f14902h;
            bVar2.f15073n = bVar.f14904i;
            bVar2.f15075o = bVar.f14906j;
            bVar2.f15077p = bVar.f14908k;
            bVar2.f15079q = bVar.f14910l;
            bVar2.f15081r = bVar.f14912m;
            bVar2.f15082s = bVar.f14914n;
            bVar2.f15083t = bVar.f14916o;
            bVar2.f15084u = bVar.f14924s;
            bVar2.f15085v = bVar.f14926t;
            bVar2.f15086w = bVar.f14928u;
            bVar2.f15087x = bVar.f14930v;
            bVar2.f15088y = bVar.f14868G;
            bVar2.f15089z = bVar.f14869H;
            bVar2.f15021A = bVar.f14870I;
            bVar2.f15022B = bVar.f14918p;
            bVar2.f15023C = bVar.f14920q;
            bVar2.f15024D = bVar.f14922r;
            bVar2.f15025E = bVar.f14885X;
            bVar2.f15026F = bVar.f14886Y;
            bVar2.f15027G = bVar.f14887Z;
            bVar2.f15061h = bVar.f14892c;
            bVar2.f15057f = bVar.f14888a;
            bVar2.f15059g = bVar.f14890b;
            bVar2.f15053d = bVar.width;
            bVar2.f15055e = bVar.height;
            bVar2.f15028H = bVar.leftMargin;
            bVar2.f15029I = bVar.rightMargin;
            bVar2.f15030J = bVar.topMargin;
            bVar2.f15031K = bVar.bottomMargin;
            bVar2.f15034N = bVar.f14865D;
            bVar2.f15042V = bVar.f14874M;
            bVar2.f15043W = bVar.f14873L;
            bVar2.f15045Y = bVar.f14876O;
            bVar2.f15044X = bVar.f14875N;
            bVar2.f15074n0 = bVar.f14889a0;
            bVar2.f15076o0 = bVar.f14891b0;
            bVar2.f15046Z = bVar.f14877P;
            bVar2.f15048a0 = bVar.f14878Q;
            bVar2.f15050b0 = bVar.f14881T;
            bVar2.f15052c0 = bVar.f14882U;
            bVar2.f15054d0 = bVar.f14879R;
            bVar2.f15056e0 = bVar.f14880S;
            bVar2.f15058f0 = bVar.f14883V;
            bVar2.f15060g0 = bVar.f14884W;
            bVar2.f15072m0 = bVar.f14893c0;
            bVar2.f15036P = bVar.f14934x;
            bVar2.f15038R = bVar.f14936z;
            bVar2.f15035O = bVar.f14932w;
            bVar2.f15037Q = bVar.f14935y;
            bVar2.f15040T = bVar.f14862A;
            bVar2.f15039S = bVar.f14863B;
            bVar2.f15041U = bVar.f14864C;
            bVar2.f15080q0 = bVar.f14895d0;
            bVar2.f15032L = bVar.getMarginEnd();
            this.f15004e.f15033M = bVar.getMarginStart();
        }

        public void b(a aVar) {
            C0277a aVar2 = this.f15007h;
            if (aVar2 != null) {
                aVar2.e(aVar);
            }
        }

        public void c(ConstraintLayout.b bVar) {
            b bVar2 = this.f15004e;
            bVar.f14896e = bVar2.f15065j;
            bVar.f14898f = bVar2.f15067k;
            bVar.f14900g = bVar2.f15069l;
            bVar.f14902h = bVar2.f15071m;
            bVar.f14904i = bVar2.f15073n;
            bVar.f14906j = bVar2.f15075o;
            bVar.f14908k = bVar2.f15077p;
            bVar.f14910l = bVar2.f15079q;
            bVar.f14912m = bVar2.f15081r;
            bVar.f14914n = bVar2.f15082s;
            bVar.f14916o = bVar2.f15083t;
            bVar.f14924s = bVar2.f15084u;
            bVar.f14926t = bVar2.f15085v;
            bVar.f14928u = bVar2.f15086w;
            bVar.f14930v = bVar2.f15087x;
            bVar.leftMargin = bVar2.f15028H;
            bVar.rightMargin = bVar2.f15029I;
            bVar.topMargin = bVar2.f15030J;
            bVar.bottomMargin = bVar2.f15031K;
            bVar.f14862A = bVar2.f15040T;
            bVar.f14863B = bVar2.f15039S;
            bVar.f14934x = bVar2.f15036P;
            bVar.f14936z = bVar2.f15038R;
            bVar.f14868G = bVar2.f15088y;
            bVar.f14869H = bVar2.f15089z;
            bVar.f14918p = bVar2.f15022B;
            bVar.f14920q = bVar2.f15023C;
            bVar.f14922r = bVar2.f15024D;
            bVar.f14870I = bVar2.f15021A;
            bVar.f14885X = bVar2.f15025E;
            bVar.f14886Y = bVar2.f15026F;
            bVar.f14874M = bVar2.f15042V;
            bVar.f14873L = bVar2.f15043W;
            bVar.f14876O = bVar2.f15045Y;
            bVar.f14875N = bVar2.f15044X;
            bVar.f14889a0 = bVar2.f15074n0;
            bVar.f14891b0 = bVar2.f15076o0;
            bVar.f14877P = bVar2.f15046Z;
            bVar.f14878Q = bVar2.f15048a0;
            bVar.f14881T = bVar2.f15050b0;
            bVar.f14882U = bVar2.f15052c0;
            bVar.f14879R = bVar2.f15054d0;
            bVar.f14880S = bVar2.f15056e0;
            bVar.f14883V = bVar2.f15058f0;
            bVar.f14884W = bVar2.f15060g0;
            bVar.f14887Z = bVar2.f15027G;
            bVar.f14892c = bVar2.f15061h;
            bVar.f14888a = bVar2.f15057f;
            bVar.f14890b = bVar2.f15059g;
            bVar.width = bVar2.f15053d;
            bVar.height = bVar2.f15055e;
            String str = bVar2.f15072m0;
            if (str != null) {
                bVar.f14893c0 = str;
            }
            bVar.f14895d0 = bVar2.f15080q0;
            bVar.setMarginStart(bVar2.f15033M);
            bVar.setMarginEnd(this.f15004e.f15032L);
            bVar.b();
        }

        /* renamed from: d */
        public a clone() {
            a aVar = new a();
            aVar.f15004e.a(this.f15004e);
            aVar.f15003d.a(this.f15003d);
            aVar.f15002c.a(this.f15002c);
            aVar.f15005f.a(this.f15005f);
            aVar.f15000a = this.f15000a;
            aVar.f15007h = this.f15007h;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: r0  reason: collision with root package name */
        private static SparseIntArray f15020r0;

        /* renamed from: A  reason: collision with root package name */
        public String f15021A = null;

        /* renamed from: B  reason: collision with root package name */
        public int f15022B = -1;

        /* renamed from: C  reason: collision with root package name */
        public int f15023C = 0;

        /* renamed from: D  reason: collision with root package name */
        public float f15024D = 0.0f;

        /* renamed from: E  reason: collision with root package name */
        public int f15025E = -1;

        /* renamed from: F  reason: collision with root package name */
        public int f15026F = -1;

        /* renamed from: G  reason: collision with root package name */
        public int f15027G = -1;

        /* renamed from: H  reason: collision with root package name */
        public int f15028H = 0;

        /* renamed from: I  reason: collision with root package name */
        public int f15029I = 0;

        /* renamed from: J  reason: collision with root package name */
        public int f15030J = 0;

        /* renamed from: K  reason: collision with root package name */
        public int f15031K = 0;

        /* renamed from: L  reason: collision with root package name */
        public int f15032L = 0;

        /* renamed from: M  reason: collision with root package name */
        public int f15033M = 0;

        /* renamed from: N  reason: collision with root package name */
        public int f15034N = 0;

        /* renamed from: O  reason: collision with root package name */
        public int f15035O = Integer.MIN_VALUE;

        /* renamed from: P  reason: collision with root package name */
        public int f15036P = Integer.MIN_VALUE;

        /* renamed from: Q  reason: collision with root package name */
        public int f15037Q = Integer.MIN_VALUE;

        /* renamed from: R  reason: collision with root package name */
        public int f15038R = Integer.MIN_VALUE;

        /* renamed from: S  reason: collision with root package name */
        public int f15039S = Integer.MIN_VALUE;

        /* renamed from: T  reason: collision with root package name */
        public int f15040T = Integer.MIN_VALUE;

        /* renamed from: U  reason: collision with root package name */
        public int f15041U = Integer.MIN_VALUE;

        /* renamed from: V  reason: collision with root package name */
        public float f15042V = -1.0f;

        /* renamed from: W  reason: collision with root package name */
        public float f15043W = -1.0f;

        /* renamed from: X  reason: collision with root package name */
        public int f15044X = 0;

        /* renamed from: Y  reason: collision with root package name */
        public int f15045Y = 0;

        /* renamed from: Z  reason: collision with root package name */
        public int f15046Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f15047a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f15048a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15049b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f15050b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15051c = false;

        /* renamed from: c0  reason: collision with root package name */
        public int f15052c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f15053d;

        /* renamed from: d0  reason: collision with root package name */
        public int f15054d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f15055e;

        /* renamed from: e0  reason: collision with root package name */
        public int f15056e0 = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f15057f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f15058f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public int f15059g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public float f15060g0 = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f15061h = -1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f15062h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f15063i = true;

        /* renamed from: i0  reason: collision with root package name */
        public int f15064i0 = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f15065j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f15066j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f15067k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int[] f15068k0;

        /* renamed from: l  reason: collision with root package name */
        public int f15069l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f15070l0;

        /* renamed from: m  reason: collision with root package name */
        public int f15071m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public String f15072m0;

        /* renamed from: n  reason: collision with root package name */
        public int f15073n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f15074n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f15075o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f15076o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f15077p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public boolean f15078p0 = true;

        /* renamed from: q  reason: collision with root package name */
        public int f15079q = -1;

        /* renamed from: q0  reason: collision with root package name */
        public int f15080q0 = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f15081r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f15082s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f15083t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f15084u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f15085v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f15086w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f15087x = -1;

        /* renamed from: y  reason: collision with root package name */
        public float f15088y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public float f15089z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15020r0 = sparseIntArray;
            sparseIntArray.append(h.f15207G6, 24);
            f15020r0.append(h.f15217H6, 25);
            f15020r0.append(h.f15237J6, 28);
            f15020r0.append(h.f15247K6, 29);
            f15020r0.append(h.f15297P6, 35);
            f15020r0.append(h.f15287O6, 34);
            f15020r0.append(h.f15568p6, 4);
            f15020r0.append(h.f15558o6, 3);
            f15020r0.append(h.f15538m6, 1);
            f15020r0.append(h.f15377X6, 6);
            f15020r0.append(h.f15387Y6, 7);
            f15020r0.append(h.f15638w6, 17);
            f15020r0.append(h.f15648x6, 18);
            f15020r0.append(h.f15658y6, 19);
            f15020r0.append(h.f15495i6, 90);
            f15020r0.append(h.f15346U5, 26);
            f15020r0.append(h.f15257L6, 31);
            f15020r0.append(h.f15267M6, 32);
            f15020r0.append(h.f15628v6, 10);
            f15020r0.append(h.f15618u6, 9);
            f15020r0.append(h.f15419b7, 13);
            f15020r0.append(h.f15452e7, 16);
            f15020r0.append(h.f15430c7, 14);
            f15020r0.append(h.f15397Z6, 11);
            f15020r0.append(h.f15441d7, 15);
            f15020r0.append(h.f15408a7, 12);
            f15020r0.append(h.f15327S6, 38);
            f15020r0.append(h.f15187E6, 37);
            f15020r0.append(h.f15177D6, 39);
            f15020r0.append(h.f15317R6, 40);
            f15020r0.append(h.f15167C6, 20);
            f15020r0.append(h.f15307Q6, 36);
            f15020r0.append(h.f15608t6, 5);
            f15020r0.append(h.f15197F6, 91);
            f15020r0.append(h.f15277N6, 91);
            f15020r0.append(h.f15227I6, 91);
            f15020r0.append(h.f15548n6, 91);
            f15020r0.append(h.f15528l6, 91);
            f15020r0.append(h.f15376X5, 23);
            f15020r0.append(h.f15396Z5, 27);
            f15020r0.append(h.f15418b6, 30);
            f15020r0.append(h.f15429c6, 8);
            f15020r0.append(h.f15386Y5, 33);
            f15020r0.append(h.f15407a6, 2);
            f15020r0.append(h.f15356V5, 22);
            f15020r0.append(h.f15366W5, 21);
            f15020r0.append(h.f15337T6, 41);
            f15020r0.append(h.f15668z6, 42);
            f15020r0.append(h.f15517k6, 87);
            f15020r0.append(h.f15506j6, 88);
            f15020r0.append(h.f15463f7, 76);
            f15020r0.append(h.f15578q6, 61);
            f15020r0.append(h.f15598s6, 62);
            f15020r0.append(h.f15588r6, 63);
            f15020r0.append(h.f15367W6, 69);
            f15020r0.append(h.f15157B6, 70);
            f15020r0.append(h.f15473g6, 71);
            f15020r0.append(h.f15451e6, 72);
            f15020r0.append(h.f15462f6, 73);
            f15020r0.append(h.f15484h6, 74);
            f15020r0.append(h.f15440d6, 75);
            f15020r0.append(h.f15347U6, 84);
            f15020r0.append(h.f15357V6, 86);
            f15020r0.append(h.f15347U6, 83);
            f15020r0.append(h.f15147A6, 85);
            f15020r0.append(h.f15337T6, 87);
            f15020r0.append(h.f15668z6, 88);
            f15020r0.append(h.f15312R1, 89);
            f15020r0.append(h.f15495i6, 90);
        }

        public void a(b bVar) {
            this.f15047a = bVar.f15047a;
            this.f15053d = bVar.f15053d;
            this.f15049b = bVar.f15049b;
            this.f15055e = bVar.f15055e;
            this.f15057f = bVar.f15057f;
            this.f15059g = bVar.f15059g;
            this.f15061h = bVar.f15061h;
            this.f15063i = bVar.f15063i;
            this.f15065j = bVar.f15065j;
            this.f15067k = bVar.f15067k;
            this.f15069l = bVar.f15069l;
            this.f15071m = bVar.f15071m;
            this.f15073n = bVar.f15073n;
            this.f15075o = bVar.f15075o;
            this.f15077p = bVar.f15077p;
            this.f15079q = bVar.f15079q;
            this.f15081r = bVar.f15081r;
            this.f15082s = bVar.f15082s;
            this.f15083t = bVar.f15083t;
            this.f15084u = bVar.f15084u;
            this.f15085v = bVar.f15085v;
            this.f15086w = bVar.f15086w;
            this.f15087x = bVar.f15087x;
            this.f15088y = bVar.f15088y;
            this.f15089z = bVar.f15089z;
            this.f15021A = bVar.f15021A;
            this.f15022B = bVar.f15022B;
            this.f15023C = bVar.f15023C;
            this.f15024D = bVar.f15024D;
            this.f15025E = bVar.f15025E;
            this.f15026F = bVar.f15026F;
            this.f15027G = bVar.f15027G;
            this.f15028H = bVar.f15028H;
            this.f15029I = bVar.f15029I;
            this.f15030J = bVar.f15030J;
            this.f15031K = bVar.f15031K;
            this.f15032L = bVar.f15032L;
            this.f15033M = bVar.f15033M;
            this.f15034N = bVar.f15034N;
            this.f15035O = bVar.f15035O;
            this.f15036P = bVar.f15036P;
            this.f15037Q = bVar.f15037Q;
            this.f15038R = bVar.f15038R;
            this.f15039S = bVar.f15039S;
            this.f15040T = bVar.f15040T;
            this.f15041U = bVar.f15041U;
            this.f15042V = bVar.f15042V;
            this.f15043W = bVar.f15043W;
            this.f15044X = bVar.f15044X;
            this.f15045Y = bVar.f15045Y;
            this.f15046Z = bVar.f15046Z;
            this.f15048a0 = bVar.f15048a0;
            this.f15050b0 = bVar.f15050b0;
            this.f15052c0 = bVar.f15052c0;
            this.f15054d0 = bVar.f15054d0;
            this.f15056e0 = bVar.f15056e0;
            this.f15058f0 = bVar.f15058f0;
            this.f15060g0 = bVar.f15060g0;
            this.f15062h0 = bVar.f15062h0;
            this.f15064i0 = bVar.f15064i0;
            this.f15066j0 = bVar.f15066j0;
            this.f15072m0 = bVar.f15072m0;
            int[] iArr = bVar.f15068k0;
            if (iArr == null || bVar.f15070l0 != null) {
                this.f15068k0 = null;
            } else {
                this.f15068k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f15070l0 = bVar.f15070l0;
            this.f15074n0 = bVar.f15074n0;
            this.f15076o0 = bVar.f15076o0;
            this.f15078p0 = bVar.f15078p0;
            this.f15080q0 = bVar.f15080q0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f15336T5);
            this.f15049b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f15020r0.get(index);
                switch (i11) {
                    case 1:
                        this.f15081r = d.E(obtainStyledAttributes, index, this.f15081r);
                        break;
                    case 2:
                        this.f15031K = obtainStyledAttributes.getDimensionPixelSize(index, this.f15031K);
                        break;
                    case 3:
                        this.f15079q = d.E(obtainStyledAttributes, index, this.f15079q);
                        break;
                    case 4:
                        this.f15077p = d.E(obtainStyledAttributes, index, this.f15077p);
                        break;
                    case 5:
                        this.f15021A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f15025E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f15025E);
                        break;
                    case 7:
                        this.f15026F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f15026F);
                        break;
                    case 8:
                        this.f15032L = obtainStyledAttributes.getDimensionPixelSize(index, this.f15032L);
                        break;
                    case 9:
                        this.f15087x = d.E(obtainStyledAttributes, index, this.f15087x);
                        break;
                    case 10:
                        this.f15086w = d.E(obtainStyledAttributes, index, this.f15086w);
                        break;
                    case 11:
                        this.f15038R = obtainStyledAttributes.getDimensionPixelSize(index, this.f15038R);
                        break;
                    case 12:
                        this.f15039S = obtainStyledAttributes.getDimensionPixelSize(index, this.f15039S);
                        break;
                    case 13:
                        this.f15035O = obtainStyledAttributes.getDimensionPixelSize(index, this.f15035O);
                        break;
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        this.f15037Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f15037Q);
                        break;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        this.f15040T = obtainStyledAttributes.getDimensionPixelSize(index, this.f15040T);
                        break;
                    case 16:
                        this.f15036P = obtainStyledAttributes.getDimensionPixelSize(index, this.f15036P);
                        break;
                    case 17:
                        this.f15057f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f15057f);
                        break;
                    case 18:
                        this.f15059g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f15059g);
                        break;
                    case 19:
                        this.f15061h = obtainStyledAttributes.getFloat(index, this.f15061h);
                        break;
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        this.f15088y = obtainStyledAttributes.getFloat(index, this.f15088y);
                        break;
                    case 21:
                        this.f15055e = obtainStyledAttributes.getLayoutDimension(index, this.f15055e);
                        break;
                    case 22:
                        this.f15053d = obtainStyledAttributes.getLayoutDimension(index, this.f15053d);
                        break;
                    case 23:
                        this.f15028H = obtainStyledAttributes.getDimensionPixelSize(index, this.f15028H);
                        break;
                    case 24:
                        this.f15065j = d.E(obtainStyledAttributes, index, this.f15065j);
                        break;
                    case 25:
                        this.f15067k = d.E(obtainStyledAttributes, index, this.f15067k);
                        break;
                    case 26:
                        this.f15027G = obtainStyledAttributes.getInt(index, this.f15027G);
                        break;
                    case 27:
                        this.f15029I = obtainStyledAttributes.getDimensionPixelSize(index, this.f15029I);
                        break;
                    case 28:
                        this.f15069l = d.E(obtainStyledAttributes, index, this.f15069l);
                        break;
                    case 29:
                        this.f15071m = d.E(obtainStyledAttributes, index, this.f15071m);
                        break;
                    case 30:
                        this.f15033M = obtainStyledAttributes.getDimensionPixelSize(index, this.f15033M);
                        break;
                    case 31:
                        this.f15084u = d.E(obtainStyledAttributes, index, this.f15084u);
                        break;
                    case com.amazon.c.a.a.c.f37660h /*32*/:
                        this.f15085v = d.E(obtainStyledAttributes, index, this.f15085v);
                        break;
                    case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                        this.f15030J = obtainStyledAttributes.getDimensionPixelSize(index, this.f15030J);
                        break;
                    case 34:
                        this.f15075o = d.E(obtainStyledAttributes, index, this.f15075o);
                        break;
                    case 35:
                        this.f15073n = d.E(obtainStyledAttributes, index, this.f15073n);
                        break;
                    case 36:
                        this.f15089z = obtainStyledAttributes.getFloat(index, this.f15089z);
                        break;
                    case 37:
                        this.f15043W = obtainStyledAttributes.getFloat(index, this.f15043W);
                        break;
                    case 38:
                        this.f15042V = obtainStyledAttributes.getFloat(index, this.f15042V);
                        break;
                    case 39:
                        this.f15044X = obtainStyledAttributes.getInt(index, this.f15044X);
                        break;
                    case 40:
                        this.f15045Y = obtainStyledAttributes.getInt(index, this.f15045Y);
                        break;
                    case 41:
                        d.F(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.F(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f15022B = d.E(obtainStyledAttributes, index, this.f15022B);
                                break;
                            case 62:
                                this.f15023C = obtainStyledAttributes.getDimensionPixelSize(index, this.f15023C);
                                break;
                            case 63:
                                this.f15024D = obtainStyledAttributes.getFloat(index, this.f15024D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f15058f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f15060g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f15062h0 = obtainStyledAttributes.getInt(index, this.f15062h0);
                                        break;
                                    case 73:
                                        this.f15064i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15064i0);
                                        break;
                                    case 74:
                                        this.f15070l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f15078p0 = obtainStyledAttributes.getBoolean(index, this.f15078p0);
                                        break;
                                    case 76:
                                        this.f15080q0 = obtainStyledAttributes.getInt(index, this.f15080q0);
                                        break;
                                    case BuildConfig.REACT_NATIVE_MINOR_VERSION /*77*/:
                                        this.f15082s = d.E(obtainStyledAttributes, index, this.f15082s);
                                        break;
                                    case 78:
                                        this.f15083t = d.E(obtainStyledAttributes, index, this.f15083t);
                                        break;
                                    case 79:
                                        this.f15041U = obtainStyledAttributes.getDimensionPixelSize(index, this.f15041U);
                                        break;
                                    case 80:
                                        this.f15034N = obtainStyledAttributes.getDimensionPixelSize(index, this.f15034N);
                                        break;
                                    case 81:
                                        this.f15046Z = obtainStyledAttributes.getInt(index, this.f15046Z);
                                        break;
                                    case 82:
                                        this.f15048a0 = obtainStyledAttributes.getInt(index, this.f15048a0);
                                        break;
                                    case 83:
                                        this.f15052c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15052c0);
                                        break;
                                    case 84:
                                        this.f15050b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15050b0);
                                        break;
                                    case SurveyViewModel.ENTITY_TYPE /*85*/:
                                        this.f15056e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15056e0);
                                        break;
                                    case 86:
                                        this.f15054d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15054d0);
                                        break;
                                    case 87:
                                        this.f15074n0 = obtainStyledAttributes.getBoolean(index, this.f15074n0);
                                        break;
                                    case 88:
                                        this.f15076o0 = obtainStyledAttributes.getBoolean(index, this.f15076o0);
                                        break;
                                    case 89:
                                        this.f15072m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f15063i = obtainStyledAttributes.getBoolean(index, this.f15063i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f15020r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f15020r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f15090o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f15091a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f15092b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f15093c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f15094d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f15095e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f15096f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f15097g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f15098h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f15099i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f15100j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f15101k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f15102l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f15103m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f15104n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15090o = sparseIntArray;
            sparseIntArray.append(h.f15529l7, 1);
            f15090o.append(h.f15549n7, 2);
            f15090o.append(h.f15589r7, 3);
            f15090o.append(h.f15518k7, 4);
            f15090o.append(h.f15507j7, 5);
            f15090o.append(h.f15496i7, 6);
            f15090o.append(h.f15539m7, 7);
            f15090o.append(h.f15579q7, 8);
            f15090o.append(h.f15569p7, 9);
            f15090o.append(h.f15559o7, 10);
        }

        public void a(c cVar) {
            this.f15091a = cVar.f15091a;
            this.f15092b = cVar.f15092b;
            this.f15094d = cVar.f15094d;
            this.f15095e = cVar.f15095e;
            this.f15096f = cVar.f15096f;
            this.f15099i = cVar.f15099i;
            this.f15097g = cVar.f15097g;
            this.f15098h = cVar.f15098h;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f15485h7);
            this.f15091a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f15090o.get(index)) {
                    case 1:
                        this.f15099i = obtainStyledAttributes.getFloat(index, this.f15099i);
                        break;
                    case 2:
                        this.f15095e = obtainStyledAttributes.getInt(index, this.f15095e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f15094d = C2008c.f20889c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f15094d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f15096f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f15092b = d.E(obtainStyledAttributes, index, this.f15092b);
                        break;
                    case 6:
                        this.f15093c = obtainStyledAttributes.getInteger(index, this.f15093c);
                        break;
                    case 7:
                        this.f15097g = obtainStyledAttributes.getFloat(index, this.f15097g);
                        break;
                    case 8:
                        this.f15101k = obtainStyledAttributes.getInteger(index, this.f15101k);
                        break;
                    case 9:
                        this.f15100j = obtainStyledAttributes.getFloat(index, this.f15100j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                this.f15103m = obtainStyledAttributes.getInteger(index, this.f15104n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f15102l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f15103m = -1;
                                    break;
                                } else {
                                    this.f15104n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f15103m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f15104n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f15103m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d  reason: collision with other inner class name */
    public static class C0278d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15105a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f15106b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f15107c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f15108d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f15109e = Float.NaN;

        public void a(C0278d dVar) {
            this.f15105a = dVar.f15105a;
            this.f15106b = dVar.f15106b;
            this.f15108d = dVar.f15108d;
            this.f15109e = dVar.f15109e;
            this.f15107c = dVar.f15107c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f15442d8);
            this.f15105a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == h.f15464f8) {
                    this.f15108d = obtainStyledAttributes.getFloat(index, this.f15108d);
                } else if (index == h.f15453e8) {
                    this.f15106b = obtainStyledAttributes.getInt(index, this.f15106b);
                    this.f15106b = d.f14989i[this.f15106b];
                } else if (index == h.f15486h8) {
                    this.f15107c = obtainStyledAttributes.getInt(index, this.f15107c);
                } else if (index == h.f15475g8) {
                    this.f15109e = obtainStyledAttributes.getFloat(index, this.f15109e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f15110o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f15111a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f15112b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f15113c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f15114d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f15115e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f15116f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f15117g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f15118h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f15119i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f15120j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f15121k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f15122l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f15123m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f15124n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15110o = sparseIntArray;
            sparseIntArray.append(h.f15630v8, 1);
            f15110o.append(h.f15640w8, 2);
            f15110o.append(h.f15650x8, 3);
            f15110o.append(h.f15610t8, 4);
            f15110o.append(h.f15620u8, 5);
            f15110o.append(h.f15570p8, 6);
            f15110o.append(h.f15580q8, 7);
            f15110o.append(h.f15590r8, 8);
            f15110o.append(h.f15600s8, 9);
            f15110o.append(h.f15660y8, 10);
            f15110o.append(h.f15670z8, 11);
            f15110o.append(h.f15149A8, 12);
        }

        public void a(e eVar) {
            this.f15111a = eVar.f15111a;
            this.f15112b = eVar.f15112b;
            this.f15113c = eVar.f15113c;
            this.f15114d = eVar.f15114d;
            this.f15115e = eVar.f15115e;
            this.f15116f = eVar.f15116f;
            this.f15117g = eVar.f15117g;
            this.f15118h = eVar.f15118h;
            this.f15119i = eVar.f15119i;
            this.f15120j = eVar.f15120j;
            this.f15121k = eVar.f15121k;
            this.f15122l = eVar.f15122l;
            this.f15123m = eVar.f15123m;
            this.f15124n = eVar.f15124n;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f15560o8);
            this.f15111a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f15110o.get(index)) {
                    case 1:
                        this.f15112b = obtainStyledAttributes.getFloat(index, this.f15112b);
                        break;
                    case 2:
                        this.f15113c = obtainStyledAttributes.getFloat(index, this.f15113c);
                        break;
                    case 3:
                        this.f15114d = obtainStyledAttributes.getFloat(index, this.f15114d);
                        break;
                    case 4:
                        this.f15115e = obtainStyledAttributes.getFloat(index, this.f15115e);
                        break;
                    case 5:
                        this.f15116f = obtainStyledAttributes.getFloat(index, this.f15116f);
                        break;
                    case 6:
                        this.f15117g = obtainStyledAttributes.getDimension(index, this.f15117g);
                        break;
                    case 7:
                        this.f15118h = obtainStyledAttributes.getDimension(index, this.f15118h);
                        break;
                    case 8:
                        this.f15120j = obtainStyledAttributes.getDimension(index, this.f15120j);
                        break;
                    case 9:
                        this.f15121k = obtainStyledAttributes.getDimension(index, this.f15121k);
                        break;
                    case 10:
                        this.f15122l = obtainStyledAttributes.getDimension(index, this.f15122l);
                        break;
                    case 11:
                        this.f15123m = true;
                        this.f15124n = obtainStyledAttributes.getDimension(index, this.f15124n);
                        break;
                    case 12:
                        this.f15119i = d.E(obtainStyledAttributes, index, this.f15119i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f14990j.append(h.f15489i0, 25);
        f14990j.append(h.f15500j0, 26);
        f14990j.append(h.f15522l0, 29);
        f14990j.append(h.f15532m0, 30);
        f14990j.append(h.f15592s0, 36);
        f14990j.append(h.f15582r0, 35);
        f14990j.append(h.f15290P, 4);
        f14990j.append(h.f15280O, 3);
        f14990j.append(h.f15240K, 1);
        f14990j.append(h.f15260M, 91);
        f14990j.append(h.f15250L, 92);
        f14990j.append(h.f15151B0, 6);
        f14990j.append(h.f15161C0, 7);
        f14990j.append(h.f15360W, 17);
        f14990j.append(h.f15370X, 18);
        f14990j.append(h.f15380Y, 19);
        f14990j.append(h.f15200G, 99);
        f14990j.append(h.f15422c, 27);
        f14990j.append(h.f15542n0, 32);
        f14990j.append(h.f15552o0, 33);
        f14990j.append(h.f15350V, 10);
        f14990j.append(h.f15340U, 9);
        f14990j.append(h.f15191F0, 13);
        f14990j.append(h.f15221I0, 16);
        f14990j.append(h.f15201G0, 14);
        f14990j.append(h.f15171D0, 11);
        f14990j.append(h.f15211H0, 15);
        f14990j.append(h.f15181E0, 12);
        f14990j.append(h.f15622v0, 40);
        f14990j.append(h.f15467g0, 39);
        f14990j.append(h.f15456f0, 41);
        f14990j.append(h.f15612u0, 42);
        f14990j.append(h.f15445e0, 20);
        f14990j.append(h.f15602t0, 37);
        f14990j.append(h.f15330T, 5);
        f14990j.append(h.f15478h0, 87);
        f14990j.append(h.f15572q0, 87);
        f14990j.append(h.f15511k0, 87);
        f14990j.append(h.f15270N, 87);
        f14990j.append(h.f15230J, 87);
        f14990j.append(h.f15477h, 24);
        f14990j.append(h.f15499j, 28);
        f14990j.append(h.f15621v, 31);
        f14990j.append(h.f15631w, 8);
        f14990j.append(h.f15488i, 34);
        f14990j.append(h.f15510k, 2);
        f14990j.append(h.f15455f, 23);
        f14990j.append(h.f15466g, 21);
        f14990j.append(h.f15632w0, 95);
        f14990j.append(h.f15390Z, 96);
        f14990j.append(h.f15444e, 22);
        f14990j.append(h.f15521l, 43);
        f14990j.append(h.f15651y, 44);
        f14990j.append(h.f15601t, 45);
        f14990j.append(h.f15611u, 46);
        f14990j.append(h.f15591s, 60);
        f14990j.append(h.f15571q, 47);
        f14990j.append(h.f15581r, 48);
        f14990j.append(h.f15531m, 49);
        f14990j.append(h.f15541n, 50);
        f14990j.append(h.f15551o, 51);
        f14990j.append(h.f15561p, 52);
        f14990j.append(h.f15641x, 53);
        f14990j.append(h.f15642x0, 54);
        f14990j.append(h.f15401a0, 55);
        f14990j.append(h.f15652y0, 56);
        f14990j.append(h.f15412b0, 57);
        f14990j.append(h.f15662z0, 58);
        f14990j.append(h.f15423c0, 59);
        f14990j.append(h.f15300Q, 61);
        f14990j.append(h.f15320S, 62);
        f14990j.append(h.f15310R, 63);
        f14990j.append(h.f15661z, 64);
        f14990j.append(h.f15321S0, 65);
        f14990j.append(h.f15190F, 66);
        f14990j.append(h.f15331T0, 67);
        f14990j.append(h.f15251L0, 79);
        f14990j.append(h.f15433d, 38);
        f14990j.append(h.f15241K0, 68);
        f14990j.append(h.f15141A0, 69);
        f14990j.append(h.f15434d0, 70);
        f14990j.append(h.f15231J0, 97);
        f14990j.append(h.f15170D, 71);
        f14990j.append(h.f15150B, 72);
        f14990j.append(h.f15160C, 73);
        f14990j.append(h.f15180E, 74);
        f14990j.append(h.f15140A, 75);
        f14990j.append(h.f15261M0, 76);
        f14990j.append(h.f15562p0, 77);
        f14990j.append(h.f15341U0, 78);
        f14990j.append(h.f15220I, 80);
        f14990j.append(h.f15210H, 81);
        f14990j.append(h.f15271N0, 82);
        f14990j.append(h.f15311R0, 83);
        f14990j.append(h.f15301Q0, 84);
        f14990j.append(h.f15291P0, 85);
        f14990j.append(h.f15281O0, 86);
        f14991k.append(h.f15645x3, 6);
        f14991k.append(h.f15645x3, 7);
        f14991k.append(h.f15594s2, 27);
        f14991k.append(h.f15144A3, 13);
        f14991k.append(h.f15174D3, 16);
        f14991k.append(h.f15154B3, 14);
        f14991k.append(h.f15655y3, 11);
        f14991k.append(h.f15164C3, 15);
        f14991k.append(h.f15665z3, 12);
        f14991k.append(h.f15585r3, 40);
        f14991k.append(h.f15514k3, 39);
        f14991k.append(h.f15503j3, 41);
        f14991k.append(h.f15575q3, 42);
        f14991k.append(h.f15492i3, 20);
        f14991k.append(h.f15565p3, 37);
        f14991k.append(h.f15426c3, 5);
        f14991k.append(h.f15525l3, 87);
        f14991k.append(h.f15555o3, 87);
        f14991k.append(h.f15535m3, 87);
        f14991k.append(h.f15393Z2, 87);
        f14991k.append(h.f15383Y2, 87);
        f14991k.append(h.f15644x2, 24);
        f14991k.append(h.f15664z2, 28);
        f14991k.append(h.f15253L2, 31);
        f14991k.append(h.f15263M2, 8);
        f14991k.append(h.f15654y2, 34);
        f14991k.append(h.f15143A2, 2);
        f14991k.append(h.f15624v2, 23);
        f14991k.append(h.f15634w2, 21);
        f14991k.append(h.f15595s3, 95);
        f14991k.append(h.f15437d3, 96);
        f14991k.append(h.f15614u2, 22);
        f14991k.append(h.f15153B2, 43);
        f14991k.append(h.f15283O2, 44);
        f14991k.append(h.f15233J2, 45);
        f14991k.append(h.f15243K2, 46);
        f14991k.append(h.f15223I2, 60);
        f14991k.append(h.f15203G2, 47);
        f14991k.append(h.f15213H2, 48);
        f14991k.append(h.f15163C2, 49);
        f14991k.append(h.f15173D2, 50);
        f14991k.append(h.f15183E2, 51);
        f14991k.append(h.f15193F2, 52);
        f14991k.append(h.f15273N2, 53);
        f14991k.append(h.f15605t3, 54);
        f14991k.append(h.f15448e3, 55);
        f14991k.append(h.f15615u3, 56);
        f14991k.append(h.f15459f3, 57);
        f14991k.append(h.f15625v3, 58);
        f14991k.append(h.f15470g3, 59);
        f14991k.append(h.f15415b3, 62);
        f14991k.append(h.f15404a3, 63);
        f14991k.append(h.f15293P2, 64);
        f14991k.append(h.f15284O3, 65);
        f14991k.append(h.f15353V2, 66);
        f14991k.append(h.f15294P3, 67);
        f14991k.append(h.f15204G3, 79);
        f14991k.append(h.f15604t2, 38);
        f14991k.append(h.f15214H3, 98);
        f14991k.append(h.f15194F3, 68);
        f14991k.append(h.f15635w3, 69);
        f14991k.append(h.f15481h3, 70);
        f14991k.append(h.f15333T2, 71);
        f14991k.append(h.f15313R2, 72);
        f14991k.append(h.f15323S2, 73);
        f14991k.append(h.f15343U2, 74);
        f14991k.append(h.f15303Q2, 75);
        f14991k.append(h.f15224I3, 76);
        f14991k.append(h.f15545n3, 77);
        f14991k.append(h.f15304Q3, 78);
        f14991k.append(h.f15373X2, 80);
        f14991k.append(h.f15363W2, 81);
        f14991k.append(h.f15234J3, 82);
        f14991k.append(h.f15274N3, 83);
        f14991k.append(h.f15264M3, 84);
        f14991k.append(h.f15254L3, 85);
        f14991k.append(h.f15244K3, 86);
        f14991k.append(h.f15184E3, 97);
    }

    /* access modifiers changed from: private */
    public static int E(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void F(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L_0x0071
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L_0x002a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L_0x0026
            r6 = -3
            if (r5 == r6) goto L_0x0020
            if (r5 == r0) goto L_0x0022
            r6 = -1
            if (r5 == r6) goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x002f
        L_0x0022:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L_0x002f
        L_0x0026:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L_0x002f
        L_0x002a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L_0x0022
        L_0x002f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L_0x003c
            r4.width = r2
            r4.f14889a0 = r5
            goto L_0x0070
        L_0x003c:
            r4.height = r2
            r4.f14891b0 = r5
            goto L_0x0070
        L_0x0041:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.b
            if (r6 == 0) goto L_0x0053
            androidx.constraintlayout.widget.d$b r4 = (androidx.constraintlayout.widget.d.b) r4
            if (r7 != 0) goto L_0x004e
            r4.f15053d = r2
            r4.f15074n0 = r5
            goto L_0x0070
        L_0x004e:
            r4.f15055e = r2
            r4.f15076o0 = r5
            goto L_0x0070
        L_0x0053:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.a.C0277a
            if (r6 == 0) goto L_0x0070
            androidx.constraintlayout.widget.d$a$a r4 = (androidx.constraintlayout.widget.d.a.C0277a) r4
            if (r7 != 0) goto L_0x0066
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L_0x0070
        L_0x0066:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L_0x0070:
            return
        L_0x0071:
            java.lang.String r5 = r5.getString(r6)
            G(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.F(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void G(Object obj, String str, int i10) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            H(bVar, trim2);
                        } else if (obj instanceof b) {
                            ((b) obj).f15021A = trim2;
                        } else if (obj instanceof a.C0277a) {
                            ((a.C0277a) obj).c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i10 == 0) {
                                    bVar2.width = 0;
                                    bVar2.f14873L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.f14874M = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i10 == 0) {
                                    bVar3.f15053d = 0;
                                    bVar3.f15043W = parseFloat;
                                    return;
                                }
                                bVar3.f15055e = 0;
                                bVar3.f15042V = parseFloat;
                            } else if (obj instanceof a.C0277a) {
                                a.C0277a aVar = (a.C0277a) obj;
                                if (i10 == 0) {
                                    aVar.b(23, 0);
                                    aVar.a(39, parseFloat);
                                    return;
                                }
                                aVar.b(21, 0);
                                aVar.a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar4.width = 0;
                                bVar4.f14883V = max;
                                bVar4.f14877P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.f14884W = max;
                            bVar4.f14878Q = 2;
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i10 == 0) {
                                bVar5.f15053d = 0;
                                bVar5.f15058f0 = max;
                                bVar5.f15046Z = 2;
                                return;
                            }
                            bVar5.f15055e = 0;
                            bVar5.f15060g0 = max;
                            bVar5.f15048a0 = 2;
                        } else if (obj instanceof a.C0277a) {
                            a.C0277a aVar2 = (a.C0277a) obj;
                            if (i10 == 0) {
                                aVar2.b(23, 0);
                                aVar2.b(54, 2);
                                return;
                            }
                            aVar2.b(21, 0);
                            aVar2.b(55, 2);
                        }
                    }
                }
            }
        }
    }

    static void H(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i11);
                if (substring2.length() > 0) {
                    f10 = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i11, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.f14870I = str;
        bVar.f14871J = f10;
        bVar.f14872K = i10;
    }

    private void I(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            J(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (!(index == h.f15433d || h.f15621v == index || h.f15631w == index)) {
                aVar.f15003d.f15091a = true;
                aVar.f15004e.f15049b = true;
                aVar.f15002c.f15105a = true;
                aVar.f15005f.f15111a = true;
            }
            switch (f14990j.get(index)) {
                case 1:
                    b bVar = aVar.f15004e;
                    bVar.f15081r = E(typedArray, index, bVar.f15081r);
                    break;
                case 2:
                    b bVar2 = aVar.f15004e;
                    bVar2.f15031K = typedArray.getDimensionPixelSize(index, bVar2.f15031K);
                    break;
                case 3:
                    b bVar3 = aVar.f15004e;
                    bVar3.f15079q = E(typedArray, index, bVar3.f15079q);
                    break;
                case 4:
                    b bVar4 = aVar.f15004e;
                    bVar4.f15077p = E(typedArray, index, bVar4.f15077p);
                    break;
                case 5:
                    aVar.f15004e.f15021A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f15004e;
                    bVar5.f15025E = typedArray.getDimensionPixelOffset(index, bVar5.f15025E);
                    break;
                case 7:
                    b bVar6 = aVar.f15004e;
                    bVar6.f15026F = typedArray.getDimensionPixelOffset(index, bVar6.f15026F);
                    break;
                case 8:
                    b bVar7 = aVar.f15004e;
                    bVar7.f15032L = typedArray.getDimensionPixelSize(index, bVar7.f15032L);
                    break;
                case 9:
                    b bVar8 = aVar.f15004e;
                    bVar8.f15087x = E(typedArray, index, bVar8.f15087x);
                    break;
                case 10:
                    b bVar9 = aVar.f15004e;
                    bVar9.f15086w = E(typedArray, index, bVar9.f15086w);
                    break;
                case 11:
                    b bVar10 = aVar.f15004e;
                    bVar10.f15038R = typedArray.getDimensionPixelSize(index, bVar10.f15038R);
                    break;
                case 12:
                    b bVar11 = aVar.f15004e;
                    bVar11.f15039S = typedArray.getDimensionPixelSize(index, bVar11.f15039S);
                    break;
                case 13:
                    b bVar12 = aVar.f15004e;
                    bVar12.f15035O = typedArray.getDimensionPixelSize(index, bVar12.f15035O);
                    break;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    b bVar13 = aVar.f15004e;
                    bVar13.f15037Q = typedArray.getDimensionPixelSize(index, bVar13.f15037Q);
                    break;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    b bVar14 = aVar.f15004e;
                    bVar14.f15040T = typedArray.getDimensionPixelSize(index, bVar14.f15040T);
                    break;
                case 16:
                    b bVar15 = aVar.f15004e;
                    bVar15.f15036P = typedArray.getDimensionPixelSize(index, bVar15.f15036P);
                    break;
                case 17:
                    b bVar16 = aVar.f15004e;
                    bVar16.f15057f = typedArray.getDimensionPixelOffset(index, bVar16.f15057f);
                    break;
                case 18:
                    b bVar17 = aVar.f15004e;
                    bVar17.f15059g = typedArray.getDimensionPixelOffset(index, bVar17.f15059g);
                    break;
                case 19:
                    b bVar18 = aVar.f15004e;
                    bVar18.f15061h = typedArray.getFloat(index, bVar18.f15061h);
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    b bVar19 = aVar.f15004e;
                    bVar19.f15088y = typedArray.getFloat(index, bVar19.f15088y);
                    break;
                case 21:
                    b bVar20 = aVar.f15004e;
                    bVar20.f15055e = typedArray.getLayoutDimension(index, bVar20.f15055e);
                    break;
                case 22:
                    C0278d dVar = aVar.f15002c;
                    dVar.f15106b = typedArray.getInt(index, dVar.f15106b);
                    C0278d dVar2 = aVar.f15002c;
                    dVar2.f15106b = f14989i[dVar2.f15106b];
                    break;
                case 23:
                    b bVar21 = aVar.f15004e;
                    bVar21.f15053d = typedArray.getLayoutDimension(index, bVar21.f15053d);
                    break;
                case 24:
                    b bVar22 = aVar.f15004e;
                    bVar22.f15028H = typedArray.getDimensionPixelSize(index, bVar22.f15028H);
                    break;
                case 25:
                    b bVar23 = aVar.f15004e;
                    bVar23.f15065j = E(typedArray, index, bVar23.f15065j);
                    break;
                case 26:
                    b bVar24 = aVar.f15004e;
                    bVar24.f15067k = E(typedArray, index, bVar24.f15067k);
                    break;
                case 27:
                    b bVar25 = aVar.f15004e;
                    bVar25.f15027G = typedArray.getInt(index, bVar25.f15027G);
                    break;
                case 28:
                    b bVar26 = aVar.f15004e;
                    bVar26.f15029I = typedArray.getDimensionPixelSize(index, bVar26.f15029I);
                    break;
                case 29:
                    b bVar27 = aVar.f15004e;
                    bVar27.f15069l = E(typedArray, index, bVar27.f15069l);
                    break;
                case 30:
                    b bVar28 = aVar.f15004e;
                    bVar28.f15071m = E(typedArray, index, bVar28.f15071m);
                    break;
                case 31:
                    b bVar29 = aVar.f15004e;
                    bVar29.f15033M = typedArray.getDimensionPixelSize(index, bVar29.f15033M);
                    break;
                case com.amazon.c.a.a.c.f37660h /*32*/:
                    b bVar30 = aVar.f15004e;
                    bVar30.f15084u = E(typedArray, index, bVar30.f15084u);
                    break;
                case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                    b bVar31 = aVar.f15004e;
                    bVar31.f15085v = E(typedArray, index, bVar31.f15085v);
                    break;
                case 34:
                    b bVar32 = aVar.f15004e;
                    bVar32.f15030J = typedArray.getDimensionPixelSize(index, bVar32.f15030J);
                    break;
                case 35:
                    b bVar33 = aVar.f15004e;
                    bVar33.f15075o = E(typedArray, index, bVar33.f15075o);
                    break;
                case 36:
                    b bVar34 = aVar.f15004e;
                    bVar34.f15073n = E(typedArray, index, bVar34.f15073n);
                    break;
                case 37:
                    b bVar35 = aVar.f15004e;
                    bVar35.f15089z = typedArray.getFloat(index, bVar35.f15089z);
                    break;
                case 38:
                    aVar.f15000a = typedArray.getResourceId(index, aVar.f15000a);
                    break;
                case 39:
                    b bVar36 = aVar.f15004e;
                    bVar36.f15043W = typedArray.getFloat(index, bVar36.f15043W);
                    break;
                case 40:
                    b bVar37 = aVar.f15004e;
                    bVar37.f15042V = typedArray.getFloat(index, bVar37.f15042V);
                    break;
                case 41:
                    b bVar38 = aVar.f15004e;
                    bVar38.f15044X = typedArray.getInt(index, bVar38.f15044X);
                    break;
                case 42:
                    b bVar39 = aVar.f15004e;
                    bVar39.f15045Y = typedArray.getInt(index, bVar39.f15045Y);
                    break;
                case 43:
                    C0278d dVar3 = aVar.f15002c;
                    dVar3.f15108d = typedArray.getFloat(index, dVar3.f15108d);
                    break;
                case Carousel.ENTITY_TYPE /*44*/:
                    e eVar = aVar.f15005f;
                    eVar.f15123m = true;
                    eVar.f15124n = typedArray.getDimension(index, eVar.f15124n);
                    break;
                case 45:
                    e eVar2 = aVar.f15005f;
                    eVar2.f15113c = typedArray.getFloat(index, eVar2.f15113c);
                    break;
                case 46:
                    e eVar3 = aVar.f15005f;
                    eVar3.f15114d = typedArray.getFloat(index, eVar3.f15114d);
                    break;
                case 47:
                    e eVar4 = aVar.f15005f;
                    eVar4.f15115e = typedArray.getFloat(index, eVar4.f15115e);
                    break;
                case 48:
                    e eVar5 = aVar.f15005f;
                    eVar5.f15116f = typedArray.getFloat(index, eVar5.f15116f);
                    break;
                case 49:
                    e eVar6 = aVar.f15005f;
                    eVar6.f15117g = typedArray.getDimension(index, eVar6.f15117g);
                    break;
                case 50:
                    e eVar7 = aVar.f15005f;
                    eVar7.f15118h = typedArray.getDimension(index, eVar7.f15118h);
                    break;
                case 51:
                    e eVar8 = aVar.f15005f;
                    eVar8.f15120j = typedArray.getDimension(index, eVar8.f15120j);
                    break;
                case 52:
                    e eVar9 = aVar.f15005f;
                    eVar9.f15121k = typedArray.getDimension(index, eVar9.f15121k);
                    break;
                case 53:
                    e eVar10 = aVar.f15005f;
                    eVar10.f15122l = typedArray.getDimension(index, eVar10.f15122l);
                    break;
                case 54:
                    b bVar40 = aVar.f15004e;
                    bVar40.f15046Z = typedArray.getInt(index, bVar40.f15046Z);
                    break;
                case 55:
                    b bVar41 = aVar.f15004e;
                    bVar41.f15048a0 = typedArray.getInt(index, bVar41.f15048a0);
                    break;
                case 56:
                    b bVar42 = aVar.f15004e;
                    bVar42.f15050b0 = typedArray.getDimensionPixelSize(index, bVar42.f15050b0);
                    break;
                case 57:
                    b bVar43 = aVar.f15004e;
                    bVar43.f15052c0 = typedArray.getDimensionPixelSize(index, bVar43.f15052c0);
                    break;
                case 58:
                    b bVar44 = aVar.f15004e;
                    bVar44.f15054d0 = typedArray.getDimensionPixelSize(index, bVar44.f15054d0);
                    break;
                case 59:
                    b bVar45 = aVar.f15004e;
                    bVar45.f15056e0 = typedArray.getDimensionPixelSize(index, bVar45.f15056e0);
                    break;
                case 60:
                    e eVar11 = aVar.f15005f;
                    eVar11.f15112b = typedArray.getFloat(index, eVar11.f15112b);
                    break;
                case 61:
                    b bVar46 = aVar.f15004e;
                    bVar46.f15022B = E(typedArray, index, bVar46.f15022B);
                    break;
                case 62:
                    b bVar47 = aVar.f15004e;
                    bVar47.f15023C = typedArray.getDimensionPixelSize(index, bVar47.f15023C);
                    break;
                case 63:
                    b bVar48 = aVar.f15004e;
                    bVar48.f15024D = typedArray.getFloat(index, bVar48.f15024D);
                    break;
                case 64:
                    c cVar = aVar.f15003d;
                    cVar.f15092b = E(typedArray, index, cVar.f15092b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f15003d.f15094d = C2008c.f20889c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f15003d.f15094d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f15003d.f15096f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f15003d;
                    cVar2.f15099i = typedArray.getFloat(index, cVar2.f15099i);
                    break;
                case 68:
                    C0278d dVar4 = aVar.f15002c;
                    dVar4.f15109e = typedArray.getFloat(index, dVar4.f15109e);
                    break;
                case 69:
                    aVar.f15004e.f15058f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f15004e.f15060g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f15004e;
                    bVar49.f15062h0 = typedArray.getInt(index, bVar49.f15062h0);
                    break;
                case 73:
                    b bVar50 = aVar.f15004e;
                    bVar50.f15064i0 = typedArray.getDimensionPixelSize(index, bVar50.f15064i0);
                    break;
                case 74:
                    aVar.f15004e.f15070l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f15004e;
                    bVar51.f15078p0 = typedArray.getBoolean(index, bVar51.f15078p0);
                    break;
                case 76:
                    c cVar3 = aVar.f15003d;
                    cVar3.f15095e = typedArray.getInt(index, cVar3.f15095e);
                    break;
                case BuildConfig.REACT_NATIVE_MINOR_VERSION /*77*/:
                    aVar.f15004e.f15072m0 = typedArray.getString(index);
                    break;
                case 78:
                    C0278d dVar5 = aVar.f15002c;
                    dVar5.f15107c = typedArray.getInt(index, dVar5.f15107c);
                    break;
                case 79:
                    c cVar4 = aVar.f15003d;
                    cVar4.f15097g = typedArray.getFloat(index, cVar4.f15097g);
                    break;
                case 80:
                    b bVar52 = aVar.f15004e;
                    bVar52.f15074n0 = typedArray.getBoolean(index, bVar52.f15074n0);
                    break;
                case 81:
                    b bVar53 = aVar.f15004e;
                    bVar53.f15076o0 = typedArray.getBoolean(index, bVar53.f15076o0);
                    break;
                case 82:
                    c cVar5 = aVar.f15003d;
                    cVar5.f15093c = typedArray.getInteger(index, cVar5.f15093c);
                    break;
                case 83:
                    e eVar12 = aVar.f15005f;
                    eVar12.f15119i = E(typedArray, index, eVar12.f15119i);
                    break;
                case 84:
                    c cVar6 = aVar.f15003d;
                    cVar6.f15101k = typedArray.getInteger(index, cVar6.f15101k);
                    break;
                case SurveyViewModel.ENTITY_TYPE /*85*/:
                    c cVar7 = aVar.f15003d;
                    cVar7.f15100j = typedArray.getFloat(index, cVar7.f15100j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            c cVar8 = aVar.f15003d;
                            cVar8.f15103m = typedArray.getInteger(index, cVar8.f15104n);
                            break;
                        } else {
                            aVar.f15003d.f15102l = typedArray.getString(index);
                            if (aVar.f15003d.f15102l.indexOf("/") <= 0) {
                                aVar.f15003d.f15103m = -1;
                                break;
                            } else {
                                aVar.f15003d.f15104n = typedArray.getResourceId(index, -1);
                                aVar.f15003d.f15103m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f15003d.f15104n = typedArray.getResourceId(index, -1);
                        c cVar9 = aVar.f15003d;
                        if (cVar9.f15104n == -1) {
                            break;
                        } else {
                            cVar9.f15103m = -2;
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f14990j.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f15004e;
                    bVar54.f15082s = E(typedArray, index, bVar54.f15082s);
                    break;
                case 92:
                    b bVar55 = aVar.f15004e;
                    bVar55.f15083t = E(typedArray, index, bVar55.f15083t);
                    break;
                case 93:
                    b bVar56 = aVar.f15004e;
                    bVar56.f15034N = typedArray.getDimensionPixelSize(index, bVar56.f15034N);
                    break;
                case 94:
                    b bVar57 = aVar.f15004e;
                    bVar57.f15041U = typedArray.getDimensionPixelSize(index, bVar57.f15041U);
                    break;
                case 95:
                    F(aVar.f15004e, typedArray, index, 0);
                    break;
                case 96:
                    F(aVar.f15004e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f15004e;
                    bVar58.f15080q0 = typedArray.getInt(index, bVar58.f15080q0);
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f14990j.get(index));
                    break;
            }
        }
        b bVar59 = aVar.f15004e;
        if (bVar59.f15070l0 != null) {
            bVar59.f15068k0 = null;
        }
    }

    private static void J(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0277a aVar2 = new a.C0277a();
        aVar.f15007h = aVar2;
        aVar.f15003d.f15091a = false;
        aVar.f15004e.f15049b = false;
        aVar.f15002c.f15105a = false;
        aVar.f15005f.f15111a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f14991k.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15031K));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.f15004e.f15025E));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.f15004e.f15026F));
                    break;
                case 8:
                    aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15032L));
                    break;
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15038R));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15039S));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15035O));
                    break;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15037Q));
                    break;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15040T));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15036P));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.f15004e.f15057f));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.f15004e.f15059g));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.f15004e.f15061h));
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    aVar2.a(20, typedArray.getFloat(index, aVar.f15004e.f15088y));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.f15004e.f15055e));
                    break;
                case 22:
                    aVar2.b(22, f14989i[typedArray.getInt(index, aVar.f15002c.f15106b)]);
                    break;
                case 23:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.f15004e.f15053d));
                    break;
                case 24:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15028H));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.f15004e.f15027G));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15029I));
                    break;
                case 31:
                    aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15033M));
                    break;
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15030J));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.f15004e.f15089z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f15000a);
                    aVar.f15000a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.f15004e.f15043W));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.f15004e.f15042V));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.f15004e.f15044X));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.f15004e.f15045Y));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.f15002c.f15108d));
                    break;
                case Carousel.ENTITY_TYPE /*44*/:
                    aVar2.d(44, true);
                    aVar2.a(44, typedArray.getDimension(index, aVar.f15005f.f15124n));
                    break;
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f15005f.f15113c));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f15005f.f15114d));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f15005f.f15115e));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f15005f.f15116f));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f15005f.f15117g));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f15005f.f15118h));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f15005f.f15120j));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f15005f.f15121k));
                    break;
                case 53:
                    aVar2.a(53, typedArray.getDimension(index, aVar.f15005f.f15122l));
                    break;
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.f15004e.f15046Z));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.f15004e.f15048a0));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15050b0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15052c0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15054d0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15056e0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f15005f.f15112b));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15023C));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.f15004e.f15024D));
                    break;
                case 64:
                    aVar2.b(64, E(typedArray, index, aVar.f15003d.f15092b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.c(65, C2008c.f20889c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.f15003d.f15099i));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.f15002c.f15109e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.f15004e.f15062h0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15064i0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.f15004e.f15078p0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.f15003d.f15095e));
                    break;
                case BuildConfig.REACT_NATIVE_MINOR_VERSION /*77*/:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.f15002c.f15107c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.f15003d.f15097g));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.f15004e.f15074n0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.f15004e.f15076o0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.f15003d.f15093c));
                    break;
                case 83:
                    aVar2.b(83, E(typedArray, index, aVar.f15005f.f15119i));
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.f15003d.f15101k));
                    break;
                case SurveyViewModel.ENTITY_TYPE /*85*/:
                    aVar2.a(85, typedArray.getFloat(index, aVar.f15003d.f15100j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            c cVar = aVar.f15003d;
                            cVar.f15103m = typedArray.getInteger(index, cVar.f15104n);
                            aVar2.b(88, aVar.f15003d.f15103m);
                            break;
                        } else {
                            aVar.f15003d.f15102l = typedArray.getString(index);
                            aVar2.c(90, aVar.f15003d.f15102l);
                            if (aVar.f15003d.f15102l.indexOf("/") <= 0) {
                                aVar.f15003d.f15103m = -1;
                                aVar2.b(88, -1);
                                break;
                            } else {
                                aVar.f15003d.f15104n = typedArray.getResourceId(index, -1);
                                aVar2.b(89, aVar.f15003d.f15104n);
                                aVar.f15003d.f15103m = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f15003d.f15104n = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.f15003d.f15104n);
                        c cVar2 = aVar.f15003d;
                        if (cVar2.f15104n == -1) {
                            break;
                        } else {
                            cVar2.f15103m = -2;
                            aVar2.b(88, -2);
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f14990j.get(index));
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15034N));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.f15004e.f15041U));
                    break;
                case 95:
                    F(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    F(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.f15004e.f15080q0));
                    break;
                case 98:
                    if (!MotionLayout.f14373w1) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f15000a = typedArray.getResourceId(index, aVar.f15000a);
                            break;
                        } else {
                            aVar.f15001b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f15000a);
                        aVar.f15000a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f15001b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.d(99, typedArray.getBoolean(index, aVar.f15004e.f15063i));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f14990j.get(index));
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void M(a aVar, int i10, float f10) {
        if (i10 == 19) {
            aVar.f15004e.f15061h = f10;
        } else if (i10 == 20) {
            aVar.f15004e.f15088y = f10;
        } else if (i10 == 37) {
            aVar.f15004e.f15089z = f10;
        } else if (i10 == 60) {
            aVar.f15005f.f15112b = f10;
        } else if (i10 == 63) {
            aVar.f15004e.f15024D = f10;
        } else if (i10 == 79) {
            aVar.f15003d.f15097g = f10;
        } else if (i10 == 85) {
            aVar.f15003d.f15100j = f10;
        } else if (i10 == 87) {
        } else {
            if (i10 == 39) {
                aVar.f15004e.f15043W = f10;
            } else if (i10 != 40) {
                switch (i10) {
                    case 43:
                        aVar.f15002c.f15108d = f10;
                        return;
                    case Carousel.ENTITY_TYPE /*44*/:
                        e eVar = aVar.f15005f;
                        eVar.f15124n = f10;
                        eVar.f15123m = true;
                        return;
                    case 45:
                        aVar.f15005f.f15113c = f10;
                        return;
                    case 46:
                        aVar.f15005f.f15114d = f10;
                        return;
                    case 47:
                        aVar.f15005f.f15115e = f10;
                        return;
                    case 48:
                        aVar.f15005f.f15116f = f10;
                        return;
                    case 49:
                        aVar.f15005f.f15117g = f10;
                        return;
                    case 50:
                        aVar.f15005f.f15118h = f10;
                        return;
                    case 51:
                        aVar.f15005f.f15120j = f10;
                        return;
                    case 52:
                        aVar.f15005f.f15121k = f10;
                        return;
                    case 53:
                        aVar.f15005f.f15122l = f10;
                        return;
                    default:
                        switch (i10) {
                            case 67:
                                aVar.f15003d.f15099i = f10;
                                return;
                            case 68:
                                aVar.f15002c.f15109e = f10;
                                return;
                            case 69:
                                aVar.f15004e.f15058f0 = f10;
                                return;
                            case 70:
                                aVar.f15004e.f15060g0 = f10;
                                return;
                            default:
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                        }
                }
            } else {
                aVar.f15004e.f15042V = f10;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void N(a aVar, int i10, int i11) {
        if (i10 == 6) {
            aVar.f15004e.f15025E = i11;
        } else if (i10 == 7) {
            aVar.f15004e.f15026F = i11;
        } else if (i10 == 8) {
            aVar.f15004e.f15032L = i11;
        } else if (i10 == 27) {
            aVar.f15004e.f15027G = i11;
        } else if (i10 == 28) {
            aVar.f15004e.f15029I = i11;
        } else if (i10 == 41) {
            aVar.f15004e.f15044X = i11;
        } else if (i10 == 42) {
            aVar.f15004e.f15045Y = i11;
        } else if (i10 == 61) {
            aVar.f15004e.f15022B = i11;
        } else if (i10 == 62) {
            aVar.f15004e.f15023C = i11;
        } else if (i10 == 72) {
            aVar.f15004e.f15062h0 = i11;
        } else if (i10 != 73) {
            switch (i10) {
                case 2:
                    aVar.f15004e.f15031K = i11;
                    return;
                case 11:
                    aVar.f15004e.f15038R = i11;
                    return;
                case 12:
                    aVar.f15004e.f15039S = i11;
                    return;
                case 13:
                    aVar.f15004e.f15035O = i11;
                    return;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    aVar.f15004e.f15037Q = i11;
                    return;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    aVar.f15004e.f15040T = i11;
                    return;
                case 16:
                    aVar.f15004e.f15036P = i11;
                    return;
                case 17:
                    aVar.f15004e.f15057f = i11;
                    return;
                case 18:
                    aVar.f15004e.f15059g = i11;
                    return;
                case 31:
                    aVar.f15004e.f15033M = i11;
                    return;
                case 34:
                    aVar.f15004e.f15030J = i11;
                    return;
                case 38:
                    aVar.f15000a = i11;
                    return;
                case 64:
                    aVar.f15003d.f15092b = i11;
                    return;
                case 66:
                    aVar.f15003d.f15096f = i11;
                    return;
                case 76:
                    aVar.f15003d.f15095e = i11;
                    return;
                case 78:
                    aVar.f15002c.f15107c = i11;
                    return;
                case 93:
                    aVar.f15004e.f15034N = i11;
                    return;
                case 94:
                    aVar.f15004e.f15041U = i11;
                    return;
                case 97:
                    aVar.f15004e.f15080q0 = i11;
                    return;
                default:
                    switch (i10) {
                        case 21:
                            aVar.f15004e.f15055e = i11;
                            return;
                        case 22:
                            aVar.f15002c.f15106b = i11;
                            return;
                        case 23:
                            aVar.f15004e.f15053d = i11;
                            return;
                        case 24:
                            aVar.f15004e.f15028H = i11;
                            return;
                        default:
                            switch (i10) {
                                case 54:
                                    aVar.f15004e.f15046Z = i11;
                                    return;
                                case 55:
                                    aVar.f15004e.f15048a0 = i11;
                                    return;
                                case 56:
                                    aVar.f15004e.f15050b0 = i11;
                                    return;
                                case 57:
                                    aVar.f15004e.f15052c0 = i11;
                                    return;
                                case 58:
                                    aVar.f15004e.f15054d0 = i11;
                                    return;
                                case 59:
                                    aVar.f15004e.f15056e0 = i11;
                                    return;
                                default:
                                    switch (i10) {
                                        case 82:
                                            aVar.f15003d.f15093c = i11;
                                            return;
                                        case 83:
                                            aVar.f15005f.f15119i = i11;
                                            return;
                                        case 84:
                                            aVar.f15003d.f15101k = i11;
                                            return;
                                        default:
                                            switch (i10) {
                                                case 87:
                                                    return;
                                                case 88:
                                                    aVar.f15003d.f15103m = i11;
                                                    return;
                                                case 89:
                                                    aVar.f15003d.f15104n = i11;
                                                    return;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            aVar.f15004e.f15064i0 = i11;
        }
    }

    /* access modifiers changed from: private */
    public static void O(a aVar, int i10, String str) {
        if (i10 == 5) {
            aVar.f15004e.f15021A = str;
        } else if (i10 == 65) {
            aVar.f15003d.f15094d = str;
        } else if (i10 == 74) {
            b bVar = aVar.f15004e;
            bVar.f15070l0 = str;
            bVar.f15068k0 = null;
        } else if (i10 == 77) {
            aVar.f15004e.f15072m0 = str;
        } else if (i10 == 87) {
        } else {
            if (i10 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f15003d.f15102l = str;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void P(a aVar, int i10, boolean z10) {
        if (i10 == 44) {
            aVar.f15005f.f15123m = z10;
        } else if (i10 == 75) {
            aVar.f15004e.f15078p0 = z10;
        } else if (i10 == 87) {
        } else {
            if (i10 == 80) {
                aVar.f15004e.f15074n0 = z10;
            } else if (i10 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f15004e.f15076o0 = z10;
            }
        }
    }

    public static a m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, h.f15584r2);
        J(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private int[] s(View view, String str) {
        int i10;
        Object l10;
        String[] split = str.split(f.f37529a);
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = g.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (l10 = ((ConstraintLayout) view.getParent()).l(0, trim)) != null && (l10 instanceof Integer)) {
                i10 = ((Integer) l10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    private a t(Context context, AttributeSet attributeSet, boolean z10) {
        int[] iArr;
        a aVar = new a();
        if (z10) {
            iArr = h.f15584r2;
        } else {
            iArr = h.f15411b;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        I(aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a u(int i10) {
        if (!this.f14999h.containsKey(Integer.valueOf(i10))) {
            this.f14999h.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f14999h.get(Integer.valueOf(i10));
    }

    public int A(int i10) {
        return u(i10).f15002c.f15107c;
    }

    public int B(int i10) {
        return u(i10).f15004e.f15053d;
    }

    public void C(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a t10 = t(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        t10.f15004e.f15047a = true;
                    }
                    this.f14999h.put(Integer.valueOf(t10.f15000a), t10);
                }
            }
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (IOException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d3, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ConstraintSet"
            int r2 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3 = 0
            r4 = r3
        L_0x000a:
            r5 = 1
            if (r2 == r5) goto L_0x01e0
            if (r2 == 0) goto L_0x01d0
            r6 = -1
            r7 = 3
            r8 = 2
            r9 = 0
            if (r2 == r8) goto L_0x0071
            if (r2 == r7) goto L_0x0019
            goto L_0x01d3
        L_0x0019:
            java.lang.String r2 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r2 = r2.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r10 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            switch(r10) {
                case -2075718416: goto L_0x004f;
                case -190376483: goto L_0x0045;
                case 426575017: goto L_0x003b;
                case 2146106725: goto L_0x002b;
                default: goto L_0x002a;
            }     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x002a:
            goto L_0x0058
        L_0x002b:
            java.lang.String r10 = "constraintset"
            boolean r2 = r2.equals(r10)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x0058
            r6 = r9
            goto L_0x0058
        L_0x0035:
            r12 = move-exception
            goto L_0x01d9
        L_0x0038:
            r12 = move-exception
            goto L_0x01dd
        L_0x003b:
            java.lang.String r9 = "constraintoverride"
            boolean r2 = r2.equals(r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x0058
            r6 = r8
            goto L_0x0058
        L_0x0045:
            java.lang.String r9 = "constraint"
            boolean r2 = r2.equals(r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x0058
            r6 = r5
            goto L_0x0058
        L_0x004f:
            java.lang.String r9 = "guideline"
            boolean r2 = r2.equals(r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x0058
            r6 = r7
        L_0x0058:
            if (r6 == 0) goto L_0x0070
            if (r6 == r5) goto L_0x0062
            if (r6 == r8) goto L_0x0062
            if (r6 == r7) goto L_0x0062
            goto L_0x01d3
        L_0x0062:
            java.util.HashMap r2 = r11.f14999h     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r5 = r4.f15000a     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.put(r5, r4)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r4 = r3
            goto L_0x01d3
        L_0x0070:
            return
        L_0x0071:
            java.lang.String r2 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r10 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            switch(r10) {
                case -2025855158: goto L_0x00da;
                case -1984451626: goto L_0x00d0;
                case -1962203927: goto L_0x00c6;
                case -1269513683: goto L_0x00bc;
                case -1238332596: goto L_0x00b2;
                case -71750448: goto L_0x00a8;
                case 366511058: goto L_0x009d;
                case 1331510167: goto L_0x0093;
                case 1791837707: goto L_0x0088;
                case 1803088381: goto L_0x007e;
                default: goto L_0x007c;
            }     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x007c:
            goto L_0x00e3
        L_0x007e:
            java.lang.String r7 = "Constraint"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = r9
            goto L_0x00e3
        L_0x0088:
            java.lang.String r7 = "CustomAttribute"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 8
            goto L_0x00e3
        L_0x0093:
            java.lang.String r8 = "Barrier"
            boolean r2 = r2.equals(r8)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = r7
            goto L_0x00e3
        L_0x009d:
            java.lang.String r7 = "CustomMethod"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 9
            goto L_0x00e3
        L_0x00a8:
            java.lang.String r7 = "Guideline"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = r8
            goto L_0x00e3
        L_0x00b2:
            java.lang.String r7 = "Transform"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 5
            goto L_0x00e3
        L_0x00bc:
            java.lang.String r7 = "PropertySet"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 4
            goto L_0x00e3
        L_0x00c6:
            java.lang.String r7 = "ConstraintOverride"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = r5
            goto L_0x00e3
        L_0x00d0:
            java.lang.String r7 = "Motion"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 7
            goto L_0x00e3
        L_0x00da:
            java.lang.String r7 = "Layout"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 6
        L_0x00e3:
            java.lang.String r2 = "XML parser error must be within a Constraint "
            switch(r6) {
                case 0: goto L_0x01c7;
                case 1: goto L_0x01be;
                case 2: goto L_0x01af;
                case 3: goto L_0x01a2;
                case 4: goto L_0x017d;
                case 5: goto L_0x0158;
                case 6: goto L_0x0132;
                case 7: goto L_0x010c;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00ea;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            goto L_0x01d3
        L_0x00ea:
            if (r4 == 0) goto L_0x00f3
            java.util.HashMap r2 = r4.f15006g     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.a.i(r12, r13, r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x00f3:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x010c:
            if (r4 == 0) goto L_0x0119
            androidx.constraintlayout.widget.d$c r2 = r4.f15003d     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.b(r12, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x0119:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x0132:
            if (r4 == 0) goto L_0x013f
            androidx.constraintlayout.widget.d$b r2 = r4.f15004e     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.b(r12, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x013f:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x0158:
            if (r4 == 0) goto L_0x0164
            androidx.constraintlayout.widget.d$e r2 = r4.f15005f     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.b(r12, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x0164:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x017d:
            if (r4 == 0) goto L_0x0189
            androidx.constraintlayout.widget.d$d r2 = r4.f15002c     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.b(r12, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x0189:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x01a2:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.d$a r4 = r11.t(r12, r2, r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.d$b r2 = r4.f15004e     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.f15066j0 = r5     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x01af:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.d$a r4 = r11.t(r12, r2, r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.d$b r2 = r4.f15004e     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.f15047a = r5     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.f15049b = r5     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x01be:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.d$a r4 = r11.t(r12, r2, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x01c7:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.d$a r4 = r11.t(r12, r2, r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x01d0:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x01d3:
            int r2 = r13.next()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x000a
        L_0x01d9:
            android.util.Log.e(r1, r0, r12)
            goto L_0x01e0
        L_0x01dd:
            android.util.Log.e(r1, r0, r12)
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.D(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void K(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f14998g || id2 != -1) {
                if (!this.f14999h.containsKey(Integer.valueOf(id2))) {
                    this.f14999h.put(Integer.valueOf(id2), new a());
                }
                a aVar = (a) this.f14999h.get(Integer.valueOf(id2));
                if (aVar != null) {
                    if (!aVar.f15004e.f15049b) {
                        aVar.e(id2, bVar);
                        if (childAt instanceof b) {
                            aVar.f15004e.f15068k0 = ((b) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                aVar.f15004e.f15078p0 = barrier.getAllowsGoneWidget();
                                aVar.f15004e.f15062h0 = barrier.getType();
                                aVar.f15004e.f15064i0 = barrier.getMargin();
                            }
                        }
                        aVar.f15004e.f15049b = true;
                    }
                    C0278d dVar = aVar.f15002c;
                    if (!dVar.f15105a) {
                        dVar.f15106b = childAt.getVisibility();
                        aVar.f15002c.f15108d = childAt.getAlpha();
                        aVar.f15002c.f15105a = true;
                    }
                    e eVar = aVar.f15005f;
                    if (!eVar.f15111a) {
                        eVar.f15111a = true;
                        eVar.f15112b = childAt.getRotation();
                        aVar.f15005f.f15113c = childAt.getRotationX();
                        aVar.f15005f.f15114d = childAt.getRotationY();
                        aVar.f15005f.f15115e = childAt.getScaleX();
                        aVar.f15005f.f15116f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            e eVar2 = aVar.f15005f;
                            eVar2.f15117g = pivotX;
                            eVar2.f15118h = pivotY;
                        }
                        aVar.f15005f.f15120j = childAt.getTranslationX();
                        aVar.f15005f.f15121k = childAt.getTranslationY();
                        aVar.f15005f.f15122l = childAt.getTranslationZ();
                        e eVar3 = aVar.f15005f;
                        if (eVar3.f15123m) {
                            eVar3.f15124n = childAt.getElevation();
                        }
                    }
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void L(d dVar) {
        for (Integer num : dVar.f14999h.keySet()) {
            num.intValue();
            a aVar = (a) dVar.f14999h.get(num);
            if (!this.f14999h.containsKey(num)) {
                this.f14999h.put(num, new a());
            }
            a aVar2 = (a) this.f14999h.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f15004e;
                if (!bVar.f15049b) {
                    bVar.a(aVar.f15004e);
                }
                C0278d dVar2 = aVar2.f15002c;
                if (!dVar2.f15105a) {
                    dVar2.a(aVar.f15002c);
                }
                e eVar = aVar2.f15005f;
                if (!eVar.f15111a) {
                    eVar.a(aVar.f15005f);
                }
                c cVar = aVar2.f15003d;
                if (!cVar.f15091a) {
                    cVar.a(aVar.f15003d);
                }
                for (String str : aVar.f15006g.keySet()) {
                    if (!aVar2.f15006g.containsKey(str)) {
                        aVar2.f15006g.put(str, (a) aVar.f15006g.get(str));
                    }
                }
            }
        }
    }

    public void Q(boolean z10) {
        this.f14998g = z10;
    }

    public void R(String str) {
        this.f14995d = str.split(f.f37529a);
        int i10 = 0;
        while (true) {
            String[] strArr = this.f14995d;
            if (i10 < strArr.length) {
                strArr[i10] = strArr[i10].trim();
                i10++;
            } else {
                return;
            }
        }
    }

    public void S(boolean z10) {
        this.f14992a = z10;
    }

    public void g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f14999h.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.d(childAt));
            } else if (this.f14998g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f14999h.containsKey(Integer.valueOf(id2)) && (aVar = (a) this.f14999h.get(Integer.valueOf(id2))) != null) {
                a.j(childAt, aVar.f15006g);
            }
        }
    }

    public void h(d dVar) {
        for (a aVar : dVar.f14999h.values()) {
            if (aVar.f15007h != null) {
                if (aVar.f15001b == null) {
                    aVar.f15007h.e(v(aVar.f15000a));
                } else {
                    for (Integer intValue : this.f14999h.keySet()) {
                        a v10 = v(intValue.intValue());
                        String str = v10.f15004e.f15072m0;
                        if (str != null && aVar.f15001b.matches(str)) {
                            aVar.f15007h.e(v10);
                            v10.f15006g.putAll((HashMap) aVar.f15006g.clone());
                        }
                    }
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        k(constraintLayout, true);
        constraintLayout.setConstraintSet((d) null);
        constraintLayout.requestLayout();
    }

    public void j(b bVar, C2063e eVar, ConstraintLayout.b bVar2, SparseArray sparseArray) {
        a aVar;
        int id2 = bVar.getId();
        if (this.f14999h.containsKey(Integer.valueOf(id2)) && (aVar = (a) this.f14999h.get(Integer.valueOf(id2))) != null && (eVar instanceof C2068j)) {
            bVar.k(aVar, (C2068j) eVar, bVar2, sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f14999h.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f14999h.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.d(childAt));
            } else if (this.f14998g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f14999h.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = (a) this.f14999h.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f15004e.f15066j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f15004e.f15062h0);
                            barrier.setMargin(aVar.f15004e.f15064i0);
                            barrier.setAllowsGoneWidget(aVar.f15004e.f15078p0);
                            b bVar = aVar.f15004e;
                            int[] iArr = bVar.f15068k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f15070l0;
                                if (str != null) {
                                    bVar.f15068k0 = s(barrier, str);
                                    barrier.setReferencedIds(aVar.f15004e.f15068k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.b();
                        aVar.c(bVar2);
                        if (z10) {
                            a.j(childAt, aVar.f15006g);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0278d dVar = aVar.f15002c;
                        if (dVar.f15107c == 0) {
                            childAt.setVisibility(dVar.f15106b);
                        }
                        childAt.setAlpha(aVar.f15002c.f15108d);
                        childAt.setRotation(aVar.f15005f.f15112b);
                        childAt.setRotationX(aVar.f15005f.f15113c);
                        childAt.setRotationY(aVar.f15005f.f15114d);
                        childAt.setScaleX(aVar.f15005f.f15115e);
                        childAt.setScaleY(aVar.f15005f.f15116f);
                        e eVar = aVar.f15005f;
                        if (eVar.f15119i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f15005f.f15119i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f15117g)) {
                                childAt.setPivotX(aVar.f15005f.f15117g);
                            }
                            if (!Float.isNaN(aVar.f15005f.f15118h)) {
                                childAt.setPivotY(aVar.f15005f.f15118h);
                            }
                        }
                        childAt.setTranslationX(aVar.f15005f.f15120j);
                        childAt.setTranslationY(aVar.f15005f.f15121k);
                        childAt.setTranslationZ(aVar.f15005f.f15122l);
                        e eVar2 = aVar.f15005f;
                        if (eVar2.f15123m) {
                            childAt.setElevation(eVar2.f15124n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f14999h.get(num);
            if (aVar2 != null) {
                if (aVar2.f15004e.f15066j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f15004e;
                    int[] iArr2 = bVar3.f15068k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f15070l0;
                        if (str2 != null) {
                            bVar3.f15068k0 = s(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f15004e.f15068k0);
                        }
                    }
                    barrier2.setType(aVar2.f15004e.f15062h0);
                    barrier2.setMargin(aVar2.f15004e.f15064i0);
                    ConstraintLayout.b g10 = constraintLayout.generateDefaultLayoutParams();
                    barrier2.r();
                    aVar2.c(g10);
                    constraintLayout.addView(barrier2, g10);
                }
                if (aVar2.f15004e.f15047a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b g11 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.c(g11);
                    constraintLayout.addView(guideline, g11);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof b) {
                ((b) childAt2).f(constraintLayout);
            }
        }
    }

    public void l(int i10, ConstraintLayout.b bVar) {
        a aVar;
        if (this.f14999h.containsKey(Integer.valueOf(i10)) && (aVar = (a) this.f14999h.get(Integer.valueOf(i10))) != null) {
            aVar.c(bVar);
        }
    }

    public void n(int i10, int i11) {
        a aVar;
        if (this.f14999h.containsKey(Integer.valueOf(i10)) && (aVar = (a) this.f14999h.get(Integer.valueOf(i10))) != null) {
            switch (i11) {
                case 1:
                    b bVar = aVar.f15004e;
                    bVar.f15067k = -1;
                    bVar.f15065j = -1;
                    bVar.f15028H = -1;
                    bVar.f15035O = Integer.MIN_VALUE;
                    return;
                case 2:
                    b bVar2 = aVar.f15004e;
                    bVar2.f15071m = -1;
                    bVar2.f15069l = -1;
                    bVar2.f15029I = -1;
                    bVar2.f15037Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    b bVar3 = aVar.f15004e;
                    bVar3.f15075o = -1;
                    bVar3.f15073n = -1;
                    bVar3.f15030J = 0;
                    bVar3.f15036P = Integer.MIN_VALUE;
                    return;
                case 4:
                    b bVar4 = aVar.f15004e;
                    bVar4.f15077p = -1;
                    bVar4.f15079q = -1;
                    bVar4.f15031K = 0;
                    bVar4.f15038R = Integer.MIN_VALUE;
                    return;
                case 5:
                    b bVar5 = aVar.f15004e;
                    bVar5.f15081r = -1;
                    bVar5.f15082s = -1;
                    bVar5.f15083t = -1;
                    bVar5.f15034N = 0;
                    bVar5.f15041U = Integer.MIN_VALUE;
                    return;
                case 6:
                    b bVar6 = aVar.f15004e;
                    bVar6.f15084u = -1;
                    bVar6.f15085v = -1;
                    bVar6.f15033M = 0;
                    bVar6.f15040T = Integer.MIN_VALUE;
                    return;
                case 7:
                    b bVar7 = aVar.f15004e;
                    bVar7.f15086w = -1;
                    bVar7.f15087x = -1;
                    bVar7.f15032L = 0;
                    bVar7.f15039S = Integer.MIN_VALUE;
                    return;
                case 8:
                    b bVar8 = aVar.f15004e;
                    bVar8.f15024D = -1.0f;
                    bVar8.f15023C = -1;
                    bVar8.f15022B = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void o(Context context, int i10) {
        p((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void p(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f14999h.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f14998g || id2 != -1) {
                if (!this.f14999h.containsKey(Integer.valueOf(id2))) {
                    this.f14999h.put(Integer.valueOf(id2), new a());
                }
                a aVar = (a) this.f14999h.get(Integer.valueOf(id2));
                if (aVar != null) {
                    aVar.f15006g = a.b(this.f14997f, childAt);
                    aVar.e(id2, bVar);
                    aVar.f15002c.f15106b = childAt.getVisibility();
                    aVar.f15002c.f15108d = childAt.getAlpha();
                    aVar.f15005f.f15112b = childAt.getRotation();
                    aVar.f15005f.f15113c = childAt.getRotationX();
                    aVar.f15005f.f15114d = childAt.getRotationY();
                    aVar.f15005f.f15115e = childAt.getScaleX();
                    aVar.f15005f.f15116f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar.f15005f;
                        eVar.f15117g = pivotX;
                        eVar.f15118h = pivotY;
                    }
                    aVar.f15005f.f15120j = childAt.getTranslationX();
                    aVar.f15005f.f15121k = childAt.getTranslationY();
                    aVar.f15005f.f15122l = childAt.getTranslationZ();
                    e eVar2 = aVar.f15005f;
                    if (eVar2.f15123m) {
                        eVar2.f15124n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f15004e.f15078p0 = barrier.getAllowsGoneWidget();
                        aVar.f15004e.f15068k0 = barrier.getReferencedIds();
                        aVar.f15004e.f15062h0 = barrier.getType();
                        aVar.f15004e.f15064i0 = barrier.getMargin();
                    }
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void q(d dVar) {
        this.f14999h.clear();
        for (Integer num : dVar.f14999h.keySet()) {
            a aVar = (a) dVar.f14999h.get(num);
            if (aVar != null) {
                this.f14999h.put(num, aVar.clone());
            }
        }
    }

    public void r(int i10, int i11, int i12, float f10) {
        b bVar = u(i10).f15004e;
        bVar.f15022B = i11;
        bVar.f15023C = i12;
        bVar.f15024D = f10;
    }

    public a v(int i10) {
        if (this.f14999h.containsKey(Integer.valueOf(i10))) {
            return (a) this.f14999h.get(Integer.valueOf(i10));
        }
        return null;
    }

    public int w(int i10) {
        return u(i10).f15004e.f15055e;
    }

    public int[] x() {
        Integer[] numArr = (Integer[]) this.f14999h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public a y(int i10) {
        return u(i10);
    }

    public int z(int i10) {
        return u(i10).f15002c.f15106b;
    }
}
