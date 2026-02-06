package com.facebook.react.views.text;

import M7.b;
import U5.a;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.U;
import com.facebook.react.uimanager.V;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import e8.C3500a;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n7.C3863a;
import r8.C3981a;
import s8.C3992a;
import s8.C3993b;
import s8.C3994c;
import s8.C3995d;
import s8.C3996e;
import s8.C3997f;
import s8.C3998g;
import s8.h;
import s8.j;
import s8.k;
import s8.l;
import s8.n;
import s8.o;
import s8.p;
import s8.q;
import s8.r;

public abstract class c extends C3428v {

    /* renamed from: A  reason: collision with root package name */
    protected Map f42098A;

    /* renamed from: a  reason: collision with root package name */
    protected p f42099a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f42100b;

    /* renamed from: c  reason: collision with root package name */
    protected int f42101c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f42102d;

    /* renamed from: e  reason: collision with root package name */
    protected int f42103e;

    /* renamed from: f  reason: collision with root package name */
    protected I.e f42104f;

    /* renamed from: g  reason: collision with root package name */
    protected I.f f42105g;

    /* renamed from: h  reason: collision with root package name */
    protected int f42106h;

    /* renamed from: i  reason: collision with root package name */
    protected int f42107i;

    /* renamed from: j  reason: collision with root package name */
    protected int f42108j;

    /* renamed from: k  reason: collision with root package name */
    protected int f42109k;

    /* renamed from: l  reason: collision with root package name */
    protected int f42110l;

    /* renamed from: m  reason: collision with root package name */
    protected float f42111m;

    /* renamed from: n  reason: collision with root package name */
    protected float f42112n;

    /* renamed from: o  reason: collision with root package name */
    protected float f42113o;

    /* renamed from: p  reason: collision with root package name */
    protected int f42114p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f42115q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f42116r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f42117s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f42118t;

    /* renamed from: u  reason: collision with root package name */
    protected float f42119u;

    /* renamed from: v  reason: collision with root package name */
    protected int f42120v;

    /* renamed from: w  reason: collision with root package name */
    protected int f42121w;

    /* renamed from: x  reason: collision with root package name */
    protected String f42122x;

    /* renamed from: y  reason: collision with root package name */
    protected String f42123y;

    /* renamed from: z  reason: collision with root package name */
    protected boolean f42124z;

    public c() {
        this((l) null);
    }

    private static void g(c cVar, SpannableStringBuilder spannableStringBuilder, List list, p pVar, boolean z10, Map map, int i10) {
        p pVar2;
        float f10;
        float f11;
        c cVar2 = cVar;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        List list2 = list;
        p pVar3 = pVar;
        int i11 = i10;
        if (pVar3 != null) {
            pVar2 = pVar3.a(cVar2.f42099a);
        } else {
            pVar2 = cVar2.f42099a;
        }
        p pVar4 = pVar2;
        int childCount = cVar.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            V childAt = cVar2.getChildAt(i12);
            if (childAt instanceof e) {
                spannableStringBuilder2.append(r.b(((e) childAt).f(), pVar4.l()));
            } else if (childAt instanceof c) {
                g((c) childAt, spannableStringBuilder, list, pVar4, z10, map, spannableStringBuilder.length());
            } else if (childAt instanceof C3981a) {
                spannableStringBuilder2.append("0");
                list2.add(new o(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((C3981a) childAt).g()));
            } else if (z10) {
                int reactTag = childAt.getReactTag();
                YogaValue styleWidth = childAt.getStyleWidth();
                YogaValue styleHeight = childAt.getStyleHeight();
                w wVar = styleWidth.f42612b;
                w wVar2 = w.POINT;
                if (wVar == wVar2 && styleHeight.f42612b == wVar2) {
                    f11 = styleWidth.f42611a;
                    f10 = styleHeight.f42611a;
                } else {
                    childAt.calculateLayout();
                    f11 = childAt.getLayoutWidth();
                    f10 = childAt.getLayoutHeight();
                }
                spannableStringBuilder2.append("0");
                list2.add(new o(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new r(reactTag, (int) f11, (int) f10)));
                map.put(Integer.valueOf(reactTag), childAt);
                childAt.markUpdateSeen();
            } else {
                throw new com.facebook.react.uimanager.r("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
            }
            Map map2 = map;
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i11) {
            if (cVar2.f42100b) {
                list2.add(new o(i11, length, new h(cVar2.f42101c)));
            }
            if (cVar2.f42102d) {
                list2.add(new o(i11, length, new C3997f(cVar2.f42103e)));
            }
            I.f fVar = cVar2.f42105g;
            if (fVar == null ? cVar2.f42104f == I.e.LINK : fVar == I.f.LINK) {
                list2.add(new o(i11, length, new C3998g(cVar.getReactTag())));
            }
            float d10 = pVar4.d();
            if (!Float.isNaN(d10) && (pVar3 == null || pVar.d() != d10)) {
                list2.add(new o(i11, length, new C3992a(d10)));
            }
            int c10 = pVar4.c();
            if (pVar3 == null || pVar.c() != c10) {
                list2.add(new o(i11, length, new C3996e(c10)));
            }
            if (!(cVar2.f42120v == -1 && cVar2.f42121w == -1 && cVar2.f42122x == null)) {
                list2.add(new o(i11, length, new C3994c(cVar2.f42120v, cVar2.f42121w, cVar2.f42123y, cVar2.f42122x, cVar.getThemedContext().getAssets())));
            }
            if (cVar2.f42115q) {
                list2.add(new o(i11, length, new n()));
            }
            if (cVar2.f42116r) {
                list2.add(new o(i11, length, new k()));
            }
            if (!((cVar2.f42111m == 0.0f && cVar2.f42112n == 0.0f && cVar2.f42113o == 0.0f) || Color.alpha(cVar2.f42114p) == 0)) {
                list2.add(new o(i11, length, new p(cVar2.f42111m, cVar2.f42112n, cVar2.f42113o, cVar2.f42114p)));
            }
            float e10 = pVar4.e();
            if (!Float.isNaN(e10) && (pVar3 == null || pVar.e() != e10)) {
                if (b.d()) {
                    list2.add(new o(i11, length, new C3993b(e10)));
                } else {
                    list2.add(new o(i11, length, new C3995d(e10)));
                }
            }
            list2.add(new o(i11, length, new l(cVar.getReactTag())));
        }
    }

    /* access modifiers changed from: protected */
    public Spannable h(c cVar, String str, boolean z10, D d10) {
        boolean z11;
        HashMap hashMap;
        int i10;
        c cVar2 = cVar;
        String str2 = str;
        D d11 = d10;
        if (!z10 || d11 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3863a.b(z11, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            hashMap = new HashMap();
        } else {
            hashMap = null;
        }
        HashMap hashMap2 = hashMap;
        if (str2 != null) {
            spannableStringBuilder.append(r.b(str2, cVar2.f42099a.l()));
        }
        g(cVar, spannableStringBuilder, arrayList, (p) null, z10, hashMap2, 0);
        cVar2.f42124z = false;
        cVar2.f42098A = hashMap2;
        float f10 = Float.NaN;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o oVar = (o) arrayList.get((arrayList.size() - i11) - 1);
            j jVar = oVar.f48103c;
            boolean z12 = jVar instanceof q;
            if (z12 || (jVar instanceof r)) {
                if (z12) {
                    i10 = ((q) jVar).b();
                    cVar2.f42124z = true;
                } else {
                    r rVar = (r) jVar;
                    int a10 = rVar.a();
                    U u10 = (U) hashMap2.get(Integer.valueOf(rVar.b()));
                    d11.h(u10);
                    u10.setLayoutParent(cVar);
                    i10 = a10;
                }
                if (Float.isNaN(f10) || ((float) i10) > f10) {
                    f10 = (float) i10;
                }
            }
            oVar.a(spannableStringBuilder, i11);
        }
        cVar2.f42099a.o(f10);
        return spannableStringBuilder;
    }

    @C3500a(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (isVirtual()) {
            this.f42104f = I.e.c(str);
            markUpdated();
        }
    }

    @C3500a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z10) {
        if (z10 != this.f42118t) {
            this.f42118t = z10;
            markUpdated();
        }
    }

    @C3500a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z10) {
        if (z10 != this.f42099a.b()) {
            this.f42099a.m(z10);
            markUpdated();
        }
    }

    @C3500a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        boolean z10;
        if (isVirtual()) {
            if (num != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f42102d = z10;
            if (z10) {
                this.f42103e = num.intValue();
            }
            markUpdated();
        }
    }

    @C3500a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z10;
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42100b = z10;
        if (z10) {
            this.f42101c = num.intValue();
        }
        markUpdated();
    }

    @C3500a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f42122x = str;
        markUpdated();
    }

    @C3500a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f10) {
        this.f42099a.n(f10);
        markUpdated();
    }

    @C3500a(name = "fontStyle")
    public void setFontStyle(String str) {
        int b10 = m.b(str);
        if (b10 != this.f42120v) {
            this.f42120v = b10;
            markUpdated();
        }
    }

    @C3500a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String c10 = m.c(readableArray);
        if (!TextUtils.equals(c10, this.f42123y)) {
            this.f42123y = c10;
            markUpdated();
        }
    }

    @C3500a(name = "fontWeight")
    public void setFontWeight(String str) {
        int d10 = m.d(str);
        if (d10 != this.f42121w) {
            this.f42121w = d10;
            markUpdated();
        }
    }

    @C3500a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z10) {
        this.f42117s = z10;
    }

    @C3500a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f10) {
        this.f42099a.p(f10);
        markUpdated();
    }

    @C3500a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f10) {
        this.f42099a.q(f10);
        markUpdated();
    }

    @C3500a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.f42099a.k()) {
            this.f42099a.r(f10);
            markUpdated();
        }
    }

    @C3500a(name = "minimumFontScale")
    public void setMinimumFontScale(float f10) {
        if (f10 != this.f42119u) {
            this.f42119u = f10;
            markUpdated();
        }
    }

    @C3500a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        this.f42106h = i10;
        markUpdated();
    }

    @C3500a(name = "role")
    public void setRole(String str) {
        if (isVirtual()) {
            this.f42105g = I.f.b(str);
            markUpdated();
        }
    }

    @C3500a(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f42110l = 1;
            }
            this.f42107i = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f42110l = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f42107i = 0;
            } else if (BlockAlignment.LEFT.equals(str)) {
                this.f42107i = 3;
            } else if (BlockAlignment.RIGHT.equals(str)) {
                this.f42107i = 5;
            } else if ("center".equals(str)) {
                this.f42107i = 1;
            } else {
                a.I("ReactNative", "Invalid textAlign: " + str);
                this.f42107i = 0;
            }
        }
        markUpdated();
    }

    @C3500a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.f42108j = 1;
        } else if ("simple".equals(str)) {
            this.f42108j = 0;
        } else if ("balanced".equals(str)) {
            this.f42108j = 2;
        } else {
            a.I("ReactNative", "Invalid textBreakStrategy: " + str);
            this.f42108j = 1;
        }
        markUpdated();
    }

    @C3500a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f42115q = false;
        this.f42116r = false;
        if (str != null) {
            for (String str2 : str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
                if ("underline".equals(str2)) {
                    this.f42115q = true;
                } else if ("line-through".equals(str2)) {
                    this.f42116r = true;
                }
            }
        }
        markUpdated();
    }

    @C3500a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i10) {
        if (i10 != this.f42114p) {
            this.f42114p = i10;
            markUpdated();
        }
    }

    @C3500a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f42111m = 0.0f;
        this.f42112n = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey(Snapshot.WIDTH) && !readableMap.isNull(Snapshot.WIDTH)) {
                this.f42111m = G.g(readableMap.getDouble(Snapshot.WIDTH));
            }
            if (readableMap.hasKey(Snapshot.HEIGHT) && !readableMap.isNull(Snapshot.HEIGHT)) {
                this.f42112n = G.g(readableMap.getDouble(Snapshot.HEIGHT));
            }
        }
        markUpdated();
    }

    @C3500a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f10) {
        if (f10 != this.f42113o) {
            this.f42113o = f10;
            markUpdated();
        }
    }

    @C3500a(name = "textTransform")
    public void setTextTransform(String str) {
        if (str == null) {
            this.f42099a.s(r.UNSET);
        } else if ("none".equals(str)) {
            this.f42099a.s(r.NONE);
        } else if ("uppercase".equals(str)) {
            this.f42099a.s(r.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.f42099a.s(r.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.f42099a.s(r.CAPITALIZE);
        } else {
            a.I("ReactNative", "Invalid textTransform: " + str);
            this.f42099a.s(r.UNSET);
        }
        markUpdated();
    }

    public c(l lVar) {
        this.f42100b = false;
        this.f42102d = false;
        this.f42104f = null;
        this.f42105g = null;
        this.f42106h = -1;
        this.f42107i = 0;
        this.f42108j = 1;
        this.f42109k = 0;
        this.f42110l = 0;
        this.f42111m = 0.0f;
        this.f42112n = 0.0f;
        this.f42113o = 0.0f;
        this.f42114p = 1426063360;
        this.f42115q = false;
        this.f42116r = false;
        this.f42117s = true;
        this.f42118t = false;
        this.f42119u = 0.0f;
        this.f42120v = -1;
        this.f42121w = -1;
        this.f42122x = null;
        this.f42123y = null;
        this.f42124z = false;
        this.f42099a = new p();
    }
}
