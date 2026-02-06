package T9;

import M9.c;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k9.C3717q0;

public class h extends i {

    /* renamed from: n  reason: collision with root package name */
    public static final h f34310n = new h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C3717q0) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List f34311d;

    /* renamed from: e  reason: collision with root package name */
    public final List f34312e;

    /* renamed from: f  reason: collision with root package name */
    public final List f34313f;

    /* renamed from: g  reason: collision with root package name */
    public final List f34314g;

    /* renamed from: h  reason: collision with root package name */
    public final List f34315h;

    /* renamed from: i  reason: collision with root package name */
    public final List f34316i;

    /* renamed from: j  reason: collision with root package name */
    public final C3717q0 f34317j;

    /* renamed from: k  reason: collision with root package name */
    public final List f34318k;

    /* renamed from: l  reason: collision with root package name */
    public final Map f34319l;

    /* renamed from: m  reason: collision with root package name */
    public final List f34320m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f34321a;

        /* renamed from: b  reason: collision with root package name */
        public final C3717q0 f34322b;

        /* renamed from: c  reason: collision with root package name */
        public final String f34323c;

        /* renamed from: d  reason: collision with root package name */
        public final String f34324d;

        public a(Uri uri, C3717q0 q0Var, String str, String str2) {
            this.f34321a = uri;
            this.f34322b = q0Var;
            this.f34323c = str;
            this.f34324d = str2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f34325a;

        /* renamed from: b  reason: collision with root package name */
        public final C3717q0 f34326b;

        /* renamed from: c  reason: collision with root package name */
        public final String f34327c;

        /* renamed from: d  reason: collision with root package name */
        public final String f34328d;

        /* renamed from: e  reason: collision with root package name */
        public final String f34329e;

        /* renamed from: f  reason: collision with root package name */
        public final String f34330f;

        public b(Uri uri, C3717q0 q0Var, String str, String str2, String str3, String str4) {
            this.f34325a = uri;
            this.f34326b = q0Var;
            this.f34327c = str;
            this.f34328d = str2;
            this.f34329e = str3;
            this.f34330f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new C3717q0.b().S("0").K("application/x-mpegURL").E(), (String) null, (String) null, (String) null, (String) null);
        }

        public b a(C3717q0 q0Var) {
            return new b(this.f34325a, q0Var, this.f34327c, this.f34328d, this.f34329e, this.f34330f);
        }
    }

    public h(String str, List list, List list2, List list3, List list4, List list5, List list6, C3717q0 q0Var, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        this.f34311d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f34312e = Collections.unmodifiableList(list2);
        this.f34313f = Collections.unmodifiableList(list3);
        this.f34314g = Collections.unmodifiableList(list4);
        this.f34315h = Collections.unmodifiableList(list5);
        this.f34316i = Collections.unmodifiableList(list6);
        this.f34317j = q0Var;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f34318k = list9;
        this.f34319l = Collections.unmodifiableMap(map);
        this.f34320m = Collections.unmodifiableList(list8);
    }

    private static void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f34321a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static List d(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= list2.size()) {
                    break;
                }
                c cVar = (c) list2.get(i12);
                if (cVar.f32704b == i10 && cVar.f32705c == i11) {
                    arrayList.add(obj);
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        return new h("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C3717q0) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((b) list.get(i10)).f34325a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public h a(List list) {
        return new h(this.f34331a, this.f34332b, d(this.f34312e, 0, list), Collections.emptyList(), d(this.f34314g, 1, list), d(this.f34315h, 2, list), Collections.emptyList(), this.f34317j, this.f34318k, this.f34333c, this.f34319l, this.f34320m);
    }
}
