package k8;

import android.support.v4.media.session.c;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.C3367m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

/* renamed from: k8.a  reason: case insensitive filesystem */
public final class C3676a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3676a f45168a = new C3676a();

    /* renamed from: b  reason: collision with root package name */
    private static final List f45169b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static final Map f45170c = new HashMap();

    private C3676a() {
    }

    public static final View a(View view, String str) {
        C6496s.h(view, "root");
        C6496s.h(str, "nativeId");
        if (C6496s.c(f45168a.b(view), str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            C6496s.g(childAt, "getChildAt(...)");
            View a10 = a(childAt, str);
            if (a10 != null) {
                return a10;
            }
        }
        return null;
    }

    private final String b(View view) {
        Object tag = view.getTag(C3367m.f40924E);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static final void c(View view) {
        C6496s.h(view, "view");
        String b10 = f45168a.b(view);
        if (b10 != null) {
            Iterator it = f45169b.iterator();
            if (!it.hasNext()) {
                for (Map.Entry entry : f45170c.entrySet()) {
                    c.a(entry.getKey());
                    if (((Set) entry.getValue()).contains(b10)) {
                        throw null;
                    }
                }
                return;
            }
            c.a(it.next());
            throw null;
        }
    }
}
