package com.google.android.exoplayer2.ui;

import aa.e;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.common.collect.C4771w;
import ja.C3645a;
import ja.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f43041a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f43042a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f43043b;

        private b(String str, Map map) {
            this.f43042a = str;
            this.f43043b = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.c$c  reason: collision with other inner class name */
    private static final class C0662c {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final Comparator f43044e = new d();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final Comparator f43045f = new e();

        /* renamed from: a  reason: collision with root package name */
        public final int f43046a;

        /* renamed from: b  reason: collision with root package name */
        public final int f43047b;

        /* renamed from: c  reason: collision with root package name */
        public final String f43048c;

        /* renamed from: d  reason: collision with root package name */
        public final String f43049d;

        /* access modifiers changed from: private */
        public static /* synthetic */ int e(C0662c cVar, C0662c cVar2) {
            int compare = Integer.compare(cVar2.f43047b, cVar.f43047b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f43048c.compareTo(cVar2.f43048c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar.f43049d.compareTo(cVar2.f43049d);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int f(C0662c cVar, C0662c cVar2) {
            int compare = Integer.compare(cVar2.f43046a, cVar.f43046a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f43048c.compareTo(cVar.f43048c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar2.f43049d.compareTo(cVar.f43049d);
        }

        private C0662c(int i10, int i11, String str, String str2) {
            this.f43046a = i10;
            this.f43047b = i11;
            this.f43048c = str;
            this.f43049d = str2;
        }
    }

    private static final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List f43050a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final List f43051b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", C4771w.n());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), C4771w.n());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet<>();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColor : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColor.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer intValue : hashSet) {
            int intValue2 = intValue.intValue();
            hashMap.put(b.a("bg_" + intValue2), M.C("background-color:%s;", b.b(intValue2)));
        }
        SparseArray c10 = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < c10.size()) {
            int keyAt = c10.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, keyAt)));
            d dVar = (d) c10.get(keyAt);
            Collections.sort(dVar.f43051b, C0662c.f43045f);
            for (C0662c cVar : dVar.f43051b) {
                sb2.append(cVar.f43049d);
            }
            Collections.sort(dVar.f43050a, C0662c.f43044e);
            for (C0662c cVar2 : dVar.f43050a) {
                sb2.append(cVar2.f43048c);
            }
            i10++;
            i11 = keyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), hashMap);
    }

    private static String b(CharSequence charSequence) {
        return f43041a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray c(Spanned spanned, float f10) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e10 = e(obj, f10);
            String d10 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e10 != null) {
                C3645a.e(d10);
                C0662c cVar = new C0662c(spanStart, spanEnd, e10, d10);
                f(sparseArray, spanStart).f43050a.add(cVar);
                f(sparseArray, spanEnd).f43051b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof aa.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof e)) {
            return "</span>";
        }
        if (!(obj instanceof TypefaceSpan)) {
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "</b>";
                }
                if (style == 2) {
                    return "</i>";
                }
                if (style != 3) {
                    return null;
                }
                return "</i></b>";
            } else if (obj instanceof aa.c) {
                return "<rt>" + b(((aa.c) obj).f36180a) + "</rt></ruby>";
            } else if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
            return null;
        } else if (((TypefaceSpan) obj).getFamily() != null) {
            return "</span>";
        } else {
            return null;
        }
    }

    private static String e(Object obj, float f10) {
        float f11;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return M.C("<span style='color:%s;'>", b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return M.C("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof aa.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                f11 = (float) absoluteSizeSpan.getSize();
            } else {
                f11 = ((float) absoluteSizeSpan.getSize()) / f10;
            }
            return M.C("<span style='font-size:%.2fpx;'>", Float.valueOf(f11));
        } else if (obj instanceof RelativeSizeSpan) {
            return M.C("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family != null) {
                    return M.C("<span style='font-family:\"%s\";'>", family);
                }
                return null;
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "<b>";
                }
                if (style == 2) {
                    return "<i>";
                }
                if (style != 3) {
                    return null;
                }
                return "<b><i>";
            } else if (obj instanceof aa.c) {
                int i10 = ((aa.c) obj).f36181b;
                if (i10 == -1) {
                    return "<ruby style='ruby-position:unset;'>";
                }
                if (i10 == 1) {
                    return "<ruby style='ruby-position:over;'>";
                }
                if (i10 != 2) {
                    return null;
                }
                return "<ruby style='ruby-position:under;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof e)) {
                    return null;
                }
                e eVar = (e) obj;
                return M.C("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(eVar.f36182a, eVar.f36183b), g(eVar.f36184c));
            }
        }
    }

    private static d f(SparseArray sparseArray, int i10) {
        d dVar = (d) sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        if (i10 != 2) {
            return "over right";
        }
        return "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
