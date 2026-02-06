package androidx.compose.ui.platform;

import Y.p1;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import h0.C2023g;
import h0.C2025i;
import i0.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6525i;
import x3.C2912d;
import x3.C2914f;
import yf.C6787a;
import yf.C6798l;

/* renamed from: androidx.compose.ui.platform.q0  reason: case insensitive filesystem */
public abstract class C1659q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class[] f13820a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: androidx.compose.ui.platform.q0$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f13821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2912d f13822b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f13823c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, C2912d dVar, String str) {
            super(0);
            this.f13821a = z10;
            this.f13822b = dVar;
            this.f13823c = str;
        }

        public final void invoke() {
            if (this.f13821a) {
                this.f13822b.j(this.f13823c);
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.q0$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13824a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(C1659q0.f(obj));
        }
    }

    public static final C1655o0 b(View view, C2914f fVar) {
        String str;
        ViewParent parent = view.getParent();
        C6496s.f(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(m.f23099H);
        if (tag instanceof String) {
            str = (String) tag;
        } else {
            str = null;
        }
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return c(str, fVar);
    }

    public static final C1655o0 c(String str, C2914f fVar) {
        Map map;
        boolean z10;
        String str2 = C2023g.class.getSimpleName() + ':' + str;
        C2912d savedStateRegistry = fVar.getSavedStateRegistry();
        Bundle b10 = savedStateRegistry.b(str2);
        if (b10 != null) {
            map = h(b10);
        } else {
            map = null;
        }
        C2023g a10 = C2025i.a(map, b.f13824a);
        try {
            savedStateRegistry.h(str2, new C1657p0(a10));
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new C1655o0(a10, new a(z10, savedStateRegistry, str2));
    }

    /* access modifiers changed from: private */
    public static final Bundle d(C2023g gVar) {
        return g(gVar.e());
    }

    /* access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (qVar.d() != p1.j() && qVar.d() != p1.q() && qVar.d() != p1.n()) {
                return false;
            }
            Object value = qVar.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        } else if ((obj instanceof C6525i) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class isInstance : f13820a) {
                if (isInstance.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final Bundle g(Map map) {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        return bundle;
    }

    private static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            C6496s.f(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
