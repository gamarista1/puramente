package h2;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import i2.C2076a;
import i2.L;
import java.util.ArrayList;

/* renamed from: h2.c  reason: case insensitive filesystem */
abstract class C2032c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f21229a = L.y0(0);

    /* renamed from: b  reason: collision with root package name */
    private static final String f21230b = L.y0(1);

    /* renamed from: c  reason: collision with root package name */
    private static final String f21231c = L.y0(2);

    /* renamed from: d  reason: collision with root package name */
    private static final String f21232d = L.y0(3);

    /* renamed from: e  reason: collision with root package name */
    private static final String f21233e = L.y0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C2034e eVar : (C2034e[]) spanned.getSpans(0, spanned.length(), C2034e.class)) {
            arrayList.add(b(spanned, eVar, 1, eVar.b()));
        }
        for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
            arrayList.add(b(spanned, gVar, 2, gVar.b()));
        }
        for (C2033d b10 : (C2033d[]) spanned.getSpans(0, spanned.length(), C2033d.class)) {
            arrayList.add(b(spanned, b10, 3, (Bundle) null));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f21229a, spanned.getSpanStart(obj));
        bundle2.putInt(f21230b, spanned.getSpanEnd(obj));
        bundle2.putInt(f21231c, spanned.getSpanFlags(obj));
        bundle2.putInt(f21232d, i10);
        if (bundle != null) {
            bundle2.putBundle(f21233e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f21229a);
        int i11 = bundle.getInt(f21230b);
        int i12 = bundle.getInt(f21231c);
        int i13 = bundle.getInt(f21232d, -1);
        Bundle bundle2 = bundle.getBundle(f21233e);
        if (i13 == 1) {
            spannable.setSpan(C2034e.a((Bundle) C2076a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 2) {
            spannable.setSpan(g.a((Bundle) C2076a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new C2033d(), i10, i11, i12);
        }
    }
}
