package com.facebook.react.views.text;

import M7.b;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.I;
import com.facebook.yoga.p;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import s8.C3992a;
import s8.C3993b;
import s8.C3994c;
import s8.C3995d;
import s8.C3996e;
import s8.C3997f;
import s8.C3998g;
import s8.h;
import s8.i;
import s8.k;
import s8.l;
import s8.m;
import s8.n;
import s8.o;
import s8.r;
import x1.g;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f42221a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final String f42222b = q.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal f42223c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap f42224d = new ConcurrentHashMap();

    class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public TextPaint initialValue() {
            return new TextPaint(1);
        }
    }

    static {
        E7.a aVar = E7.a.f30668a;
    }

    static void a(Spannable spannable, float f10, p pVar, float f11, p pVar2, double d10, int i10, boolean z10, int i11, int i12, Layout.Alignment alignment, int i13, TextPaint textPaint) {
        double d11;
        Spannable spannable2 = spannable;
        int i14 = i10;
        TextPaint textPaint2 = textPaint;
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable2, textPaint2);
        Layout d12 = d(spannable, isBoring, f10, pVar, z10, i11, i12, alignment, i13, textPaint);
        if (Double.isNaN(d10)) {
            d11 = (double) G.h(4.0f);
        } else {
            d11 = d10;
        }
        int i15 = (int) d11;
        int i16 = 0;
        Class<C3996e> cls = C3996e.class;
        int i17 = i15;
        for (C3996e size : (C3996e[]) spannable2.getSpans(0, spannable.length(), cls)) {
            i17 = Math.max(i17, size.getSize());
        }
        int i18 = i17;
        while (i18 > i15) {
            if (i14 != -1 && i14 != 0 && d12.getLineCount() > i14) {
                p pVar3 = pVar2;
            } else if (pVar2 == p.UNDEFINED || ((float) d12.getHeight()) <= f11) {
                return;
            }
            int max = i18 - Math.max(1, (int) G.h(1.0f));
            float f12 = ((float) max) / ((float) i17);
            float f13 = (float) i15;
            textPaint2.setTextSize(Math.max(textPaint.getTextSize() * f12, f13));
            C3996e[] eVarArr = (C3996e[]) spannable2.getSpans(i16, spannable.length(), cls);
            int length = eVarArr.length;
            int i19 = i16;
            while (i19 < length) {
                C3996e eVar = eVarArr[i19];
                spannable2.setSpan(new C3996e((int) Math.max(((float) eVar.getSize()) * f12, f13)), spannable2.getSpanStart(eVar), spannable2.getSpanEnd(eVar), spannable2.getSpanFlags(eVar));
                spannable2.removeSpan(eVar);
                i19++;
                eVarArr = eVarArr;
                f12 = f12;
                f13 = f13;
            }
            d12 = d(spannable, isBoring, f10, pVar, z10, i11, i12, alignment, i13, textPaint);
            i18 = max;
            i17 = i17;
            cls = cls;
            i16 = 0;
        }
    }

    private static void b(Context context, com.facebook.react.common.mapbuffer.a aVar, SpannableStringBuilder spannableStringBuilder, List list) {
        int i10;
        I.f fVar;
        List list2 = list;
        int count = aVar.getCount();
        for (int i11 = 0; i11 < count; i11++) {
            com.facebook.react.common.mapbuffer.a F10 = aVar.F(i11);
            int length = spannableStringBuilder.length();
            o a10 = o.a(F10.F(5));
            spannableStringBuilder.append(r.b(F10.getString(0), a10.f42203p));
            int length2 = spannableStringBuilder.length();
            if (F10.p(1)) {
                i10 = F10.getInt(1);
            } else {
                i10 = -1;
            }
            if (F10.p(2) && F10.getBoolean(2)) {
                list2.add(new o(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new r(i10, (int) G.i(F10.getDouble(3)), (int) G.i(F10.getDouble(4)))));
            } else if (length2 >= length) {
                if ((fVar = a10.f42212y) == null ? a10.f42211x == I.e.LINK : fVar == I.f.LINK) {
                    list2.add(new o(length, length2, new C3998g(i10)));
                }
                if (a10.f42189b) {
                    list2.add(new o(length, length2, new h(a10.f42192e)));
                }
                if (a10.f42193f) {
                    list2.add(new o(length, length2, new C3997f(a10.f42194g)));
                }
                if (!Float.isNaN(a10.k())) {
                    list2.add(new o(length, length2, new i(a10.k())));
                }
                if (!Float.isNaN(a10.j())) {
                    list2.add(new o(length, length2, new C3992a(a10.j())));
                }
                list2.add(new o(length, length2, new C3996e(a10.f42197j)));
                if (!(a10.f42213z == -1 && a10.f42183A == -1 && a10.f42184B == null)) {
                    list2.add(new o(length, length2, new C3994c(a10.f42213z, a10.f42183A, a10.f42185C, a10.f42184B, context.getAssets())));
                }
                if (a10.f42208u) {
                    list2.add(new o(length, length2, new n()));
                }
                if (a10.f42209v) {
                    list2.add(new o(length, length2, new k()));
                }
                if (!((a10.f42204q == 0.0f && a10.f42205r == 0.0f && a10.f42206s == 0.0f) || Color.alpha(a10.f42207t) == 0)) {
                    list2.add(new o(length, length2, new s8.p(a10.f42204q, a10.f42205r, a10.f42206s, a10.f42207t)));
                }
                if (!Float.isNaN(a10.c())) {
                    if (b.d()) {
                        list2.add(new o(length, length2, new C3993b(a10.c())));
                    } else {
                        list2.add(new o(length, length2, new C3995d(a10.c())));
                    }
                }
                list2.add(new o(length, length2, new l(i10)));
            }
        }
    }

    private static Layout c(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f10, float f11, l lVar) {
        TextPaint textPaint;
        boolean z10;
        boolean z11;
        int i10;
        double d10;
        Context context2 = context;
        com.facebook.react.common.mapbuffer.a aVar3 = aVar;
        com.facebook.react.common.mapbuffer.a aVar4 = aVar2;
        Spannable g10 = g(context2, aVar3, lVar);
        if (aVar3.p(3)) {
            textPaint = ((m[]) g10.getSpans(0, 0, m.class))[0].a();
        } else {
            o a10 = o.a(aVar3.F(4));
            TextPaint textPaint2 = (TextPaint) g.f((TextPaint) f42223c.get());
            p(textPaint2, a10, context2);
            textPaint = textPaint2;
        }
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(g10, textPaint);
        int m10 = o.m(aVar4.getString(2));
        if (aVar4.p(4)) {
            z10 = aVar4.getBoolean(4);
        } else {
            z10 = true;
        }
        boolean z12 = z10;
        int g11 = o.g(aVar4.getString(5));
        if (aVar4.p(3)) {
            z11 = aVar4.getBoolean(3);
        } else {
            z11 = false;
        }
        if (aVar4.p(0)) {
            i10 = aVar4.getInt(0);
        } else {
            i10 = -1;
        }
        int i11 = i10;
        String i12 = i(aVar);
        Layout.Alignment h10 = h(aVar3, g10, i12);
        int k10 = k(i12);
        if (z11) {
            if (aVar4.p(6)) {
                d10 = aVar4.getDouble(6);
            } else {
                d10 = Double.NaN;
            }
            a(g10, f10, p.EXACTLY, f11, p.UNDEFINED, d10, i11, z12, m10, g11, h10, k10, textPaint);
        }
        return d(g10, isBoring, f10, p.EXACTLY, z12, m10, g11, h10, k10, textPaint);
    }

    private static Layout d(Spannable spannable, BoringLayout.Metrics metrics, float f10, p pVar, boolean z10, int i10, int i11, Layout.Alignment alignment, int i12, TextPaint textPaint) {
        boolean z11;
        float f11;
        TextDirectionHeuristic textDirectionHeuristic;
        int i13;
        TextDirectionHeuristic textDirectionHeuristic2;
        Spannable spannable2 = spannable;
        BoringLayout.Metrics metrics2 = metrics;
        float f12 = f10;
        p pVar2 = pVar;
        boolean z12 = z10;
        int i14 = i10;
        int i15 = i11;
        Layout.Alignment alignment2 = alignment;
        TextPaint textPaint2 = textPaint;
        int length = spannable.length();
        if (pVar2 == p.UNDEFINED || f12 < 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (metrics2 == null) {
            f11 = Layout.getDesiredWidth(spannable2, textPaint2);
        } else {
            f11 = Float.NaN;
        }
        boolean isRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable2, 0, length);
        if (metrics2 == null && (z11 || (!com.facebook.yoga.g.a(f11) && f11 <= f12))) {
            if (pVar2 == p.EXACTLY) {
                f11 = f12;
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable2, 0, length, textPaint2, (int) Math.ceil((double) f11)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(z12).setBreakStrategy(i14).setHyphenationFrequency(i15);
            if (isRtl) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            StaticLayout.Builder textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic2);
            if (Build.VERSION.SDK_INT >= 28) {
                StaticLayout.Builder unused = textDirection.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection.build();
        } else if (metrics2 == null || (!z11 && ((float) metrics2.width) > f12)) {
            StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable2, 0, length, textPaint2, (int) Math.ceil((double) f12)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(z12).setBreakStrategy(i14).setHyphenationFrequency(i15);
            if (isRtl) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            StaticLayout.Builder textDirection2 = hyphenationFrequency2.setTextDirection(textDirectionHeuristic);
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 26) {
                StaticLayout.Builder unused2 = textDirection2.setJustificationMode(i12);
            }
            if (i16 >= 28) {
                StaticLayout.Builder unused3 = textDirection2.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection2.build();
        } else {
            int i17 = metrics2.width;
            if (pVar2 == p.EXACTLY) {
                i17 = (int) Math.ceil((double) f12);
            }
            if (metrics2.width < 0) {
                ReactSoftExceptionLogger.logSoftException(f42222b, new ReactNoCrashSoftException("Text width is invalid: " + metrics2.width));
                i13 = 0;
            } else {
                i13 = i17;
            }
            return BoringLayout.make(spannable, textPaint, i13, alignment, 1.0f, 0.0f, metrics, z10);
        }
    }

    private static Spannable e(Context context, com.facebook.react.common.mapbuffer.a aVar, l lVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        b(context, aVar.F(2), spannableStringBuilder, arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((o) arrayList.get((arrayList.size() - i10) - 1)).a(spannableStringBuilder, i10);
        }
        if (lVar != null) {
            lVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static void f(int i10) {
        if (f42221a) {
            String str = f42222b;
            U5.a.m(str, "Delete cached spannable for tag[" + i10 + "]");
        }
        f42224d.remove(Integer.valueOf(i10));
    }

    public static Spannable g(Context context, com.facebook.react.common.mapbuffer.a aVar, l lVar) {
        if (!aVar.p(3)) {
            return e(context, aVar, lVar);
        }
        return (Spannable) f42224d.get(Integer.valueOf(aVar.getInt(3)));
    }

    private static Layout.Alignment h(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable, String str) {
        Layout.Alignment alignment;
        boolean z10 = false;
        if (l(aVar) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length())) {
            z10 = true;
        }
        if (z10) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        if (str == null) {
            return alignment;
        }
        if (str.equals("center")) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (!str.equals(BlockAlignment.RIGHT)) {
            return alignment;
        }
        if (z10) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static String i(com.facebook.react.common.mapbuffer.a aVar) {
        if (!aVar.p(2)) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a F10 = aVar.F(2);
        if (F10.getCount() != 0) {
            com.facebook.react.common.mapbuffer.a F11 = F10.F(0).F(5);
            if (F11.p(12)) {
                return F11.getString(12);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        if (r4 != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r4 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int j(com.facebook.react.common.mapbuffer.a r3, android.text.Spannable r4, int r5) {
        /*
            java.lang.String r0 = i(r3)
            android.text.Layout$Alignment r3 = h(r3, r4, r0)
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r1 = r4.length()
            r2 = 0
            boolean r4 = r0.isRtl(r4, r2, r1)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            r1 = 3
            r2 = 5
            if (r3 != r0) goto L_0x001f
            if (r4 == 0) goto L_0x001d
        L_0x001b:
            r5 = r2
            goto L_0x002b
        L_0x001d:
            r5 = r1
            goto L_0x002b
        L_0x001f:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r3 != r0) goto L_0x0026
            if (r4 == 0) goto L_0x001b
            goto L_0x001d
        L_0x0026:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r3 != r4) goto L_0x002b
            r5 = 1
        L_0x002b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.q.j(com.facebook.react.common.mapbuffer.a, android.text.Spannable, int):int");
    }

    private static int k(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        if (str == null || !str.equals("justified")) {
            return 0;
        }
        return 1;
    }

    public static boolean l(com.facebook.react.common.mapbuffer.a aVar) {
        if (!aVar.p(2)) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a F10 = aVar.F(2);
        if (F10.getCount() == 0) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a F11 = F10.F(0).F(5);
        if (F11.p(23) && o.i(F11.getString(23)) == 1) {
            return true;
        }
        return false;
    }

    public static WritableArray m(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f10, float f11) {
        Layout c10 = c(context, aVar, aVar2, f10, f11, (l) null);
        return b.a(c10.getText(), c10, (TextPaint) g.f((TextPaint) f42223c.get()), context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r5 > r21) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        if (r3 > r23) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long n(android.content.Context r18, com.facebook.react.common.mapbuffer.a r19, com.facebook.react.common.mapbuffer.a r20, float r21, com.facebook.yoga.p r22, float r23, com.facebook.yoga.p r24, com.facebook.react.views.text.l r25, float[] r26) {
        /*
            r6 = r20
            r7 = r22
            r8 = r24
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r25
            android.text.Layout r0 = c(r0, r1, r2, r3, r4, r5)
            java.lang.CharSequence r1 = r0.getText()
            android.text.Spannable r1 = (android.text.Spannable) r1
            if (r1 != 0) goto L_0x0021
            r0 = 0
            return r0
        L_0x0021:
            r2 = 0
            boolean r3 = r6.p(r2)
            r4 = -1
            if (r3 == 0) goto L_0x002e
            int r3 = r6.getInt(r2)
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            if (r3 == r4) goto L_0x003d
            if (r3 != 0) goto L_0x0034
            goto L_0x003d
        L_0x0034:
            int r5 = r0.getLineCount()
            int r3 = java.lang.Math.min(r3, r5)
            goto L_0x0041
        L_0x003d:
            int r3 = r0.getLineCount()
        L_0x0041:
            com.facebook.yoga.p r5 = com.facebook.yoga.p.EXACTLY
            r6 = 10
            r9 = 1
            if (r7 != r5) goto L_0x0049
            goto L_0x0089
        L_0x0049:
            r5 = 0
            r10 = r2
        L_0x004b:
            if (r10 >= r3) goto L_0x0081
            int r11 = r1.length()
            if (r11 <= 0) goto L_0x0060
            int r11 = r0.getLineEnd(r10)
            int r11 = r11 - r9
            char r11 = r1.charAt(r11)
            if (r11 != r6) goto L_0x0060
            r11 = r9
            goto L_0x0061
        L_0x0060:
            r11 = r2
        L_0x0061:
            if (r11 != 0) goto L_0x006e
            int r12 = r10 + 1
            int r13 = r0.getLineCount()
            if (r12 >= r13) goto L_0x006e
            r5 = r21
            goto L_0x0081
        L_0x006e:
            if (r11 == 0) goto L_0x0075
            float r11 = r0.getLineMax(r10)
            goto L_0x0079
        L_0x0075:
            float r11 = r0.getLineWidth(r10)
        L_0x0079:
            int r12 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x007e
            r5 = r11
        L_0x007e:
            int r10 = r10 + 1
            goto L_0x004b
        L_0x0081:
            com.facebook.yoga.p r10 = com.facebook.yoga.p.AT_MOST
            if (r7 != r10) goto L_0x008b
            int r7 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r7 <= 0) goto L_0x008b
        L_0x0089:
            r5 = r21
        L_0x008b:
            int r7 = android.os.Build.VERSION.SDK_INT
            r10 = 29
            if (r7 <= r10) goto L_0x0097
            double r10 = (double) r5
            double r10 = java.lang.Math.ceil(r10)
            float r5 = (float) r10
        L_0x0097:
            com.facebook.yoga.p r7 = com.facebook.yoga.p.EXACTLY
            if (r8 == r7) goto L_0x00a9
            int r3 = r3 - r9
            int r3 = r0.getLineBottom(r3)
            float r3 = (float) r3
            com.facebook.yoga.p r7 = com.facebook.yoga.p.AT_MOST
            if (r8 != r7) goto L_0x00ab
            int r7 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ab
        L_0x00a9:
            r3 = r23
        L_0x00ab:
            r7 = r2
            r8 = r7
        L_0x00ad:
            int r10 = r1.length()
            if (r7 >= r10) goto L_0x017e
            int r10 = r1.length()
            java.lang.Class<s8.r> r11 = s8.r.class
            int r10 = r1.nextSpanTransition(r7, r10, r11)
            java.lang.Object[] r7 = r1.getSpans(r7, r10, r11)
            s8.r[] r7 = (s8.r[]) r7
            int r11 = r7.length
            r12 = r2
        L_0x00c5:
            if (r12 >= r11) goto L_0x017b
            r13 = r7[r12]
            int r14 = r1.getSpanStart(r13)
            int r15 = r0.getLineForOffset(r14)
            int r16 = r0.getEllipsisCount(r15)
            if (r16 <= 0) goto L_0x00ee
            int r16 = r0.getLineStart(r15)
            int r17 = r0.getEllipsisStart(r15)
            int r2 = r16 + r17
            if (r14 < r2) goto L_0x00ee
            int r2 = r0.getLineEnd(r15)
            if (r14 < r2) goto L_0x00ea
            goto L_0x00ee
        L_0x00ea:
            r4 = r6
            r6 = r9
            goto L_0x0173
        L_0x00ee:
            int r2 = r13.c()
            float r2 = (float) r2
            int r13 = r13.a()
            float r13 = (float) r13
            boolean r6 = r0.isRtlCharAt(r14)
            int r9 = r0.getParagraphDirection(r15)
            if (r9 != r4) goto L_0x0104
            r9 = 1
            goto L_0x0105
        L_0x0104:
            r9 = 0
        L_0x0105:
            int r16 = r1.length()
            r17 = 1
            int r4 = r16 + -1
            if (r14 != r4) goto L_0x013b
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x0128
            int r4 = r0.getLineEnd(r15)
            int r4 = r4 + -1
            char r4 = r1.charAt(r4)
            r6 = 10
            if (r4 != r6) goto L_0x012a
            float r4 = r0.getLineMax(r15)
            goto L_0x012e
        L_0x0128:
            r6 = 10
        L_0x012a:
            float r4 = r0.getLineWidth(r15)
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            float r2 = r5 - r4
            goto L_0x0139
        L_0x0133:
            float r4 = r0.getLineRight(r15)
            float r2 = r4 - r2
        L_0x0139:
            r4 = r6
            goto L_0x015b
        L_0x013b:
            r4 = 10
            if (r9 != r6) goto L_0x0144
            float r14 = r0.getPrimaryHorizontal(r14)
            goto L_0x0148
        L_0x0144:
            float r14 = r0.getSecondaryHorizontal(r14)
        L_0x0148:
            if (r9 == 0) goto L_0x0154
            if (r6 != 0) goto L_0x0154
            float r9 = r0.getLineRight(r15)
            float r9 = r9 - r14
            float r9 = r5 - r9
            goto L_0x0155
        L_0x0154:
            r9 = r14
        L_0x0155:
            if (r6 == 0) goto L_0x015a
            float r2 = r9 - r2
            goto L_0x015b
        L_0x015a:
            r2 = r9
        L_0x015b:
            int r6 = r0.getLineBaseline(r15)
            float r6 = (float) r6
            float r6 = r6 - r13
            int r9 = r8 * 2
            float r6 = com.facebook.react.uimanager.G.f(r6)
            r26[r9] = r6
            r6 = 1
            int r9 = r9 + r6
            float r2 = com.facebook.react.uimanager.G.f(r2)
            r26[r9] = r2
            int r8 = r8 + 1
        L_0x0173:
            int r12 = r12 + 1
            r9 = r6
            r2 = 0
            r6 = r4
            r4 = -1
            goto L_0x00c5
        L_0x017b:
            r7 = r10
            goto L_0x00ad
        L_0x017e:
            float r0 = com.facebook.react.uimanager.G.f(r5)
            float r2 = com.facebook.react.uimanager.G.f(r3)
            boolean r4 = f42221a
            if (r4 == 0) goto L_0x01c5
            java.lang.String r4 = f42222b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "TextMeasure call ('"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = "'): w: "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = " px - h: "
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = " px - w : "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r1 = " sp - h: "
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = " sp"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            U5.a.m(r4, r1)
        L_0x01c5:
            long r0 = com.facebook.yoga.q.a(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.q.n(android.content.Context, com.facebook.react.common.mapbuffer.a, com.facebook.react.common.mapbuffer.a, float, com.facebook.yoga.p, float, com.facebook.yoga.p, com.facebook.react.views.text.l, float[]):long");
    }

    public static void o(int i10, Spannable spannable) {
        if (f42221a) {
            String str = f42222b;
            U5.a.m(str, "Set cached spannable for tag[" + i10 + "]: " + spannable.toString());
        }
        f42224d.put(Integer.valueOf(i10), spannable);
    }

    private static void p(TextPaint textPaint, o oVar, Context context) {
        float f10;
        textPaint.reset();
        boolean z10 = true;
        textPaint.setAntiAlias(true);
        if (oVar.b() != -1) {
            textPaint.setTextSize((float) oVar.b());
        }
        if (oVar.e() == -1 && oVar.f() == -1 && oVar.d() == null) {
            textPaint.setTypeface((Typeface) null);
            return;
        }
        Typeface a10 = m.a((Typeface) null, oVar.e(), oVar.f(), oVar.d(), context.getAssets());
        textPaint.setTypeface(a10);
        if (oVar.e() != -1 && oVar.e() != a10.getStyle()) {
            int e10 = oVar.e() & (~a10.getStyle());
            if ((e10 & 1) == 0) {
                z10 = false;
            }
            textPaint.setFakeBoldText(z10);
            if ((e10 & 2) != 0) {
                f10 = -0.25f;
            } else {
                f10 = 0.0f;
            }
            textPaint.setTextSkewX(f10);
        }
    }
}
