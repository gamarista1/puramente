package com.airbnb.android.react.lottie;

import A4.e;
import I4.c;
import Sg.m;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.d;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.C6496s;
import lf.v;
import lf.w;
import mf.C6565s;
import u4.C4062b;
import u4.C4070j;
import u4.T;
import u4.a0;
import u4.b0;
import u4.c0;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f37014a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37015b = "lottie-react-native";

    /* renamed from: c  reason: collision with root package name */
    private boolean f37016c;

    /* renamed from: d  reason: collision with root package name */
    private String f37017d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView.ScaleType f37018e;

    /* renamed from: f  reason: collision with root package name */
    private String f37019f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f37020g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f37021h;

    /* renamed from: i  reason: collision with root package name */
    private ReadableArray f37022i;

    /* renamed from: j  reason: collision with root package name */
    private ReadableArray f37023j;

    /* renamed from: k  reason: collision with root package name */
    private a0 f37024k;

    /* renamed from: l  reason: collision with root package name */
    private Integer f37025l;

    /* renamed from: m  reason: collision with root package name */
    private String f37026m;

    /* renamed from: n  reason: collision with root package name */
    private String f37027n;

    /* renamed from: o  reason: collision with root package name */
    private String f37028o;

    /* renamed from: p  reason: collision with root package name */
    private Float f37029p;

    /* renamed from: q  reason: collision with root package name */
    private Boolean f37030q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f37031r;

    /* renamed from: s  reason: collision with root package name */
    private Float f37032s;

    public static final class a extends C4062b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4070j f37033a;

        a(C4070j jVar) {
            this.f37033a = jVar;
        }

        public Typeface a(String str) {
            C6496s.h(str, "fontFamily");
            d a10 = d.f42125b.a();
            AssetManager assets = this.f37033a.getContext().getAssets();
            C6496s.g(assets, "getAssets(...)");
            return a10.d(str, -1, -1, assets);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            if (r5.equals("Regular") == false) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
            if (r5.equals(com.facebook.react.views.progressbar.ReactProgressBarViewManager.DEFAULT_STYLE) == false) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
            r4 = 400;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
            r5 = com.facebook.react.views.text.d.f42125b.a();
            r1 = r3.f37033a.getContext().getAssets();
            kotlin.jvm.internal.C6496s.g(r1, "getAssets(...)");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
            return r5.d(r6, -1, r4, r1);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Typeface b(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            /*
                r3 = this;
                java.lang.String r0 = "fontFamily"
                kotlin.jvm.internal.C6496s.h(r4, r0)
                java.lang.String r4 = "fontStyle"
                kotlin.jvm.internal.C6496s.h(r5, r4)
                java.lang.String r4 = "fontName"
                kotlin.jvm.internal.C6496s.h(r6, r4)
                int r4 = r5.hashCode()
                r0 = -1
                switch(r4) {
                    case -1994163307: goto L_0x005c;
                    case -1955878649: goto L_0x0050;
                    case -1543850116: goto L_0x0047;
                    case 2076325: goto L_0x003b;
                    case 2605753: goto L_0x0030;
                    case 64266207: goto L_0x0024;
                    case 73417974: goto L_0x0018;
                    default: goto L_0x0017;
                }
            L_0x0017:
                goto L_0x0064
            L_0x0018:
                java.lang.String r4 = "Light"
                boolean r4 = r5.equals(r4)
                if (r4 != 0) goto L_0x0021
                goto L_0x0064
            L_0x0021:
                r4 = 200(0xc8, float:2.8E-43)
                goto L_0x0068
            L_0x0024:
                java.lang.String r4 = "Black"
                boolean r4 = r5.equals(r4)
                if (r4 != 0) goto L_0x002d
                goto L_0x0064
            L_0x002d:
                r4 = 900(0x384, float:1.261E-42)
                goto L_0x0068
            L_0x0030:
                java.lang.String r4 = "Thin"
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L_0x0064
                r4 = 100
                goto L_0x0068
            L_0x003b:
                java.lang.String r4 = "Bold"
                boolean r4 = r5.equals(r4)
                if (r4 != 0) goto L_0x0044
                goto L_0x0064
            L_0x0044:
                r4 = 700(0x2bc, float:9.81E-43)
                goto L_0x0068
            L_0x0047:
                java.lang.String r4 = "Regular"
                boolean r4 = r5.equals(r4)
                if (r4 != 0) goto L_0x0059
                goto L_0x0064
            L_0x0050:
                java.lang.String r4 = "Normal"
                boolean r4 = r5.equals(r4)
                if (r4 != 0) goto L_0x0059
                goto L_0x0064
            L_0x0059:
                r4 = 400(0x190, float:5.6E-43)
                goto L_0x0068
            L_0x005c:
                java.lang.String r4 = "Medium"
                boolean r4 = r5.equals(r4)
                if (r4 != 0) goto L_0x0066
            L_0x0064:
                r4 = r0
                goto L_0x0068
            L_0x0066:
                r4 = 500(0x1f4, float:7.0E-43)
            L_0x0068:
                com.facebook.react.views.text.d$a r5 = com.facebook.react.views.text.d.f42125b
                com.facebook.react.views.text.d r5 = r5.a()
                u4.j r1 = r3.f37033a
                android.content.Context r1 = r1.getContext()
                android.content.res.AssetManager r1 = r1.getAssets()
                java.lang.String r2 = "getAssets(...)"
                kotlin.jvm.internal.C6496s.g(r1, r2)
                android.graphics.Typeface r4 = r5.d(r6, r0, r4, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.lottie.h.a.b(java.lang.String, java.lang.String, java.lang.String):android.graphics.Typeface");
        }
    }

    public h(C4070j jVar) {
        C6496s.h(jVar, "view");
        this.f37014a = new WeakReference(jVar);
        jVar.setFontAssetDelegate(new a(jVar));
    }

    private final void b(ReadableMap readableMap, C4070j jVar) {
        int i10;
        List list;
        if (readableMap.getType("color") == ReadableType.Map) {
            Integer color = ColorPropConverter.getColor(readableMap.getMap("color"), jVar.getContext());
            if (color != null) {
                i10 = color.intValue();
            } else {
                i10 = 0;
            }
        } else {
            i10 = readableMap.getInt("color");
        }
        String quote = Pattern.quote(".");
        C6496s.g(quote, "quote(...)");
        List g10 = new m(quote).g(readableMap.getString("keypath") + ".**", 0);
        if (!g10.isEmpty()) {
            ListIterator listIterator = g10.listIterator(g10.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = C6565s.V0(g10, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
            String[] strArr = (String[]) list.toArray(new String[0]);
            jVar.k(new e((String[]) Arrays.copyOf(strArr, strArr.length)), T.f48398K, new c(new b0(i10)));
        }
        list = C6565s.n();
        String[] strArr2 = (String[]) list.toArray(new String[0]);
        jVar.k(new e((String[]) Arrays.copyOf(strArr2, strArr2.length)), T.f48398K, new c(new b0(i10)));
    }

    public final void a() {
        int i10;
        Object obj;
        C4070j jVar = (C4070j) this.f37014a.get();
        if (jVar != null) {
            ReadableArray readableArray = this.f37023j;
            if (readableArray != null && readableArray.size() > 0) {
                c0 c0Var = new c0(jVar);
                int size = readableArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ReadableMap map = readableArray.getMap(i11);
                    if (map != null) {
                        c0Var.e(map.getString("find"), map.getString("replace"));
                    }
                }
                jVar.setTextDelegate(c0Var);
            }
            String str = this.f37026m;
            if (str != null) {
                jVar.C(str, String.valueOf(str.hashCode()));
                this.f37026m = null;
            }
            String str2 = this.f37027n;
            if (str2 != null) {
                File file = new File(str2);
                if (file.exists()) {
                    jVar.A(new FileInputStream(file), String.valueOf(str2.hashCode()));
                } else {
                    jVar.D(str2, String.valueOf(str2.hashCode()));
                }
                this.f37027n = null;
            }
            String str3 = this.f37028o;
            if (str3 != null) {
                File file2 = new File(str3);
                if (file2.exists()) {
                    jVar.B(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                    this.f37028o = null;
                    return;
                }
                try {
                    v.a aVar = v.f71841b;
                    obj = v.b(Uri.parse(str3).getScheme());
                } catch (Throwable th2) {
                    v.a aVar2 = v.f71841b;
                    obj = v.b(w.a(th2));
                }
                if (v.g(obj)) {
                    obj = null;
                }
                String str4 = (String) obj;
                if (str4 != null) {
                    if (C6496s.c(str4, "file")) {
                        String path = Uri.parse(str3).getPath();
                        if (path != null) {
                            jVar.B(new ZipInputStream(new FileInputStream(new File(path))), String.valueOf(str3.hashCode()));
                        } else {
                            Log.w(this.f37015b, "URI path is null for asset: " + str3);
                        }
                    } else {
                        jVar.setAnimationFromUrl(str3);
                    }
                    this.f37028o = null;
                    return;
                }
                int identifier = jVar.getResources().getIdentifier(str3, "raw", jVar.getContext().getPackageName());
                if (identifier == 0) {
                    l8.c.a("Animation for " + str3 + " was not found in raw resources");
                    return;
                }
                jVar.setAnimation(identifier);
                this.f37016c = false;
                this.f37028o = null;
            }
            if (this.f37016c) {
                jVar.setAnimation(this.f37017d);
                this.f37016c = false;
            }
            Float f10 = this.f37029p;
            if (f10 != null) {
                jVar.setProgress(f10.floatValue());
                this.f37029p = null;
            }
            Boolean bool = this.f37030q;
            if (bool != null) {
                if (bool.booleanValue()) {
                    i10 = -1;
                } else {
                    i10 = 0;
                }
                jVar.setRepeatCount(i10);
                this.f37030q = null;
            }
            Boolean bool2 = this.f37031r;
            if (bool2 != null && bool2.booleanValue() && !jVar.s()) {
                jVar.x();
            }
            Float f11 = this.f37032s;
            if (f11 != null) {
                jVar.setSpeed(f11.floatValue());
                this.f37032s = null;
            }
            ImageView.ScaleType scaleType = this.f37018e;
            if (scaleType != null) {
                jVar.setScaleType(scaleType);
                this.f37018e = null;
            }
            a0 a0Var = this.f37024k;
            if (a0Var != null) {
                jVar.setRenderMode(a0Var);
                this.f37024k = null;
            }
            Integer num = this.f37025l;
            if (num != null) {
                jVar.setLayerType(num.intValue(), (Paint) null);
            }
            String str5 = this.f37019f;
            if (str5 != null) {
                jVar.setImageAssetsFolder(str5);
                this.f37019f = null;
            }
            Boolean bool3 = this.f37020g;
            if (bool3 != null) {
                jVar.o(bool3.booleanValue());
                this.f37020g = null;
            }
            Boolean bool4 = this.f37021h;
            if (bool4 != null) {
                jVar.setSafeMode(bool4.booleanValue());
                this.f37021h = null;
            }
            ReadableArray readableArray2 = this.f37022i;
            if (readableArray2 != null && readableArray2.size() > 0) {
                int size2 = readableArray2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ReadableMap map2 = readableArray2.getMap(i12);
                    if (map2 != null) {
                        b(map2, jVar);
                    }
                }
            }
        }
    }

    public final void c(String str) {
        this.f37026m = str;
    }

    public final void d(String str) {
        this.f37017d = str;
        this.f37016c = true;
    }

    public final void e(String str) {
        this.f37027n = str;
    }

    public final void f(Boolean bool) {
        this.f37031r = bool;
    }

    public final void g(ReadableArray readableArray) {
        this.f37022i = readableArray;
    }

    public final void h(Boolean bool) {
        this.f37020g = bool;
    }

    public final void i(Boolean bool) {
        this.f37021h = bool;
    }

    public final void j(String str) {
        this.f37019f = str;
    }

    public final void k(Integer num) {
        this.f37025l = num;
    }

    public final void l(Boolean bool) {
        this.f37030q = bool;
    }

    public final void m(Float f10) {
        this.f37029p = f10;
    }

    public final void n(a0 a0Var) {
        this.f37024k = a0Var;
    }

    public final void o(ImageView.ScaleType scaleType) {
        this.f37018e = scaleType;
    }

    public final void p(String str) {
        this.f37028o = str;
    }

    public final void q(Float f10) {
        this.f37032s = f10;
    }

    public final void r(ReadableArray readableArray) {
        this.f37023j = readableArray;
    }
}
