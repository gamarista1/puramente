package j3;

import Rg.h;
import Rg.k;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.Z;
import androidx.collection.b0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j3.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import mf.C6558k;
import mf.C6565s;
import mf.O;
import yf.C6787a;
import yf.C6798l;

public abstract class s {

    /* renamed from: k  reason: collision with root package name */
    public static final a f22957k = new a((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private static final Map f22958l = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final String f22959a;

    /* renamed from: b  reason: collision with root package name */
    private u f22960b;

    /* renamed from: c  reason: collision with root package name */
    private String f22961c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f22962d;

    /* renamed from: e  reason: collision with root package name */
    private final List f22963e;

    /* renamed from: f  reason: collision with root package name */
    private final Z f22964f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Map f22965g;

    /* renamed from: h  reason: collision with root package name */
    private int f22966h;

    /* renamed from: i  reason: collision with root package name */
    private String f22967i;

    /* renamed from: j  reason: collision with root package name */
    private Lazy f22968j;

    public static final class a {

        /* renamed from: j3.s$a$a  reason: collision with other inner class name */
        static final class C0366a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0366a f22969a = new C0366a();

            C0366a() {
                super(1);
            }

            /* renamed from: a */
            public final s invoke(s sVar) {
                C6496s.h(sVar, "it");
                return sVar.A();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String b(Context context, int i10) {
            String str;
            C6496s.h(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                str = context.getResources().getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i10);
            }
            C6496s.g(str, "try {\n                  …tring()\n                }");
            return str;
        }

        public final h c(s sVar) {
            C6496s.h(sVar, "<this>");
            return k.h(sVar, C0366a.f22969a);
        }

        private a() {
        }
    }

    public static final class b implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        private final s f22970a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f22971b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f22972c;

        /* renamed from: d  reason: collision with root package name */
        private final int f22973d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f22974e;

        /* renamed from: f  reason: collision with root package name */
        private final int f22975f;

        public b(s sVar, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            C6496s.h(sVar, "destination");
            this.f22970a = sVar;
            this.f22971b = bundle;
            this.f22972c = z10;
            this.f22973d = i10;
            this.f22974e = z11;
            this.f22975f = i11;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            C6496s.h(bVar, "other");
            boolean z10 = this.f22972c;
            if (z10 && !bVar.f22972c) {
                return 1;
            }
            if (!z10 && bVar.f22972c) {
                return -1;
            }
            int i10 = this.f22973d - bVar.f22973d;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.f22971b;
            if (bundle != null && bVar.f22971b == null) {
                return 1;
            }
            if (bundle == null && bVar.f22971b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = bVar.f22971b;
                C6496s.e(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f22974e;
            if (z11 && !bVar.f22974e) {
                return 1;
            }
            if (z11 || !bVar.f22974e) {
                return this.f22975f - bVar.f22975f;
            }
            return -1;
        }

        public final s b() {
            return this.f22970a;
        }

        public final Bundle c() {
            return this.f22971b;
        }

        public final boolean e(Bundle bundle) {
            Bundle bundle2;
            C2126C c10;
            Object obj;
            if (bundle == null || (bundle2 = this.f22971b) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            C6496s.g(keySet, "matchingArgs.keySet()");
            for (String str : keySet) {
                if (!bundle.containsKey(str)) {
                    return false;
                }
                C2137h hVar = (C2137h) this.f22970a.f22965g.get(str);
                Object obj2 = null;
                if (hVar != null) {
                    c10 = hVar.a();
                } else {
                    c10 = null;
                }
                if (c10 != null) {
                    Bundle bundle3 = this.f22971b;
                    C6496s.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
                    obj = c10.get(bundle3, str);
                } else {
                    obj = null;
                }
                if (c10 != null) {
                    C6496s.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
                    obj2 = c10.get(bundle, str);
                }
                if (c10 != null && !c10.valueEquals(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22976a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(1);
            this.f22976a = pVar;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return Boolean.valueOf(!this.f22976a.j().contains(str));
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f22977a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(1);
            this.f22977a = bundle;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return Boolean.valueOf(!this.f22977a.containsKey(str));
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f22978a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f22978a = str;
        }

        /* renamed from: a */
        public final p invoke() {
            return new p.a().b(this.f22978a).a();
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22979a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p pVar) {
            super(1);
            this.f22979a = pVar;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return Boolean.valueOf(!this.f22979a.j().contains(str));
        }
    }

    public s(String str) {
        C6496s.h(str, "navigatorName");
        this.f22959a = str;
        this.f22963e = new ArrayList();
        this.f22964f = new Z(0, 1, (DefaultConstructorMarker) null);
        this.f22965g = new LinkedHashMap();
    }

    private final boolean D(p pVar, Uri uri, Map map) {
        return j.a(map, new d(pVar.p(uri, map))).isEmpty();
    }

    public static /* synthetic */ int[] r(s sVar, s sVar2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                sVar2 = null;
            }
            return sVar.n(sVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    public final u A() {
        return this.f22960b;
    }

    public final String C() {
        return this.f22967i;
    }

    public final boolean E(String str, Bundle bundle) {
        s sVar;
        C6496s.h(str, "route");
        if (C6496s.c(this.f22967i, str)) {
            return true;
        }
        b I10 = I(str);
        if (I10 != null) {
            sVar = I10.b();
        } else {
            sVar = null;
        }
        if (!C6496s.c(this, sVar)) {
            return false;
        }
        return I10.e(bundle);
    }

    public b H(r rVar) {
        Bundle bundle;
        boolean z10;
        int i10;
        C6496s.h(rVar, "navDeepLinkRequest");
        if (this.f22963e.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (p pVar : this.f22963e) {
            Uri c10 = rVar.c();
            if (pVar.E(rVar)) {
                if (c10 != null) {
                    bundle = pVar.o(c10, this.f22965g);
                } else {
                    bundle = null;
                }
                int h10 = pVar.h(c10);
                String a10 = rVar.a();
                if (a10 == null || !C6496s.c(a10, pVar.i())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z11 = z10;
                String b10 = rVar.b();
                if (b10 != null) {
                    i10 = pVar.u(b10);
                } else {
                    i10 = -1;
                }
                if (bundle != null || ((z11 || i10 > -1) && D(pVar, c10, this.f22965g))) {
                    b bVar2 = new b(this, bundle, pVar.z(), h10, z11, i10);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        bVar = bVar2;
                    }
                }
            }
        }
        return bVar;
    }

    public final b I(String str) {
        p pVar;
        C6496s.h(str, "route");
        Lazy lazy = this.f22968j;
        if (lazy == null || (pVar = (p) lazy.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(f22957k.a(str));
        C6496s.d(parse, "Uri.parse(this)");
        Bundle o10 = pVar.o(parse, this.f22965g);
        if (o10 == null) {
            return null;
        }
        return new b(this, o10, pVar.z(), pVar.h(parse), false, -1);
    }

    public final void N(int i10, C2136g gVar) {
        C6496s.h(gVar, "action");
        if (!W()) {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        } else if (i10 != 0) {
            this.f22964f.k(i10, gVar);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }

    public final void P(int i10) {
        this.f22966h = i10;
        this.f22961c = null;
    }

    public final void Q(CharSequence charSequence) {
        this.f22962d = charSequence;
    }

    public final void R(u uVar) {
        this.f22960b = uVar;
    }

    public final void S(String str) {
        if (str == null) {
            P(0);
        } else if (!Sg.p.d0(str)) {
            String a10 = f22957k.a(str);
            List a11 = j.a(this.f22965g, new f(new p.a().b(a10).a()));
            if (a11.isEmpty()) {
                this.f22968j = C6531o.b(new e(a10));
                P(a10.hashCode());
            } else {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + a11).toString());
            }
        } else {
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        this.f22967i = str;
    }

    public boolean W() {
        return true;
    }

    public final void b(String str, C2137h hVar) {
        C6496s.h(str, "argumentName");
        C6496s.h(hVar, "argument");
        this.f22965g.put(str, hVar);
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        boolean c10 = C6496s.c(this.f22963e, sVar.f22963e);
        if (this.f22964f.o() == sVar.f22964f.o()) {
            Iterator it = k.c(b0.a(this.f22964f)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                int intValue = ((Number) it.next()).intValue();
                if (!C6496s.c(this.f22964f.g(intValue), sVar.f22964f.g(intValue))) {
                    break;
                }
            }
        } else {
            z10 = false;
        }
        if (this.f22965g.size() == sVar.f22965g.size()) {
            Iterator it2 = O.C(this.f22965g).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (sVar.f22965g.containsKey(entry.getKey())) {
                    if (!C6496s.c(sVar.f22965g.get(entry.getKey()), entry.getValue())) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z11 = false;
        if (this.f22966h != sVar.f22966h || !C6496s.c(this.f22967i, sVar.f22967i) || !c10 || !z10 || !z11) {
            return false;
        }
        return true;
    }

    public final void g(p pVar) {
        C6496s.h(pVar, "navDeepLink");
        List a10 = j.a(this.f22965g, new c(pVar));
        if (a10.isEmpty()) {
            this.f22963e.add(pVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + pVar.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + a10).toString());
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f22966h * 31;
        String str = this.f22967i;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = i15 + i10;
        for (p pVar : this.f22963e) {
            int i17 = i16 * 31;
            String y10 = pVar.y();
            if (y10 != null) {
                i12 = y10.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 31;
            String i19 = pVar.i();
            if (i19 != null) {
                i13 = i19.hashCode();
            } else {
                i13 = 0;
            }
            int i20 = (i18 + i13) * 31;
            String t10 = pVar.t();
            if (t10 != null) {
                i14 = t10.hashCode();
            } else {
                i14 = 0;
            }
            i16 = i20 + i14;
        }
        Iterator b10 = b0.b(this.f22964f);
        if (!b10.hasNext()) {
            for (String str2 : this.f22965g.keySet()) {
                int hashCode = ((i16 * 31) + str2.hashCode()) * 31;
                Object obj = this.f22965g.get(str2);
                if (obj != null) {
                    i11 = obj.hashCode();
                } else {
                    i11 = 0;
                }
                i16 = hashCode + i11;
            }
            return i16;
        }
        android.support.v4.media.session.c.a(b10.next());
        throw null;
    }

    public final Bundle k(Bundle bundle) {
        if (bundle == null && this.f22965g.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f22965g.entrySet()) {
            ((C2137h) entry.getValue()).e((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.f22965g.entrySet()) {
                String str = (String) entry2.getKey();
                C2137h hVar = (C2137h) entry2.getValue();
                if (!hVar.c() && !hVar.f(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + hVar.a().getName() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public final int[] n(s sVar) {
        u uVar;
        C6558k kVar = new C6558k();
        u uVar2 = this;
        while (true) {
            C6496s.e(uVar2);
            u uVar3 = uVar2.f22960b;
            if (sVar != null) {
                uVar = sVar.f22960b;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                u uVar4 = sVar.f22960b;
                C6496s.e(uVar4);
                if (uVar4.c0(uVar2.f22966h) == uVar2) {
                    kVar.addFirst(uVar2);
                    break;
                }
            }
            if (uVar3 == null || uVar3.o0() != uVar2.f22966h) {
                kVar.addFirst(uVar2);
            }
            if (C6496s.c(uVar3, sVar) || uVar3 == null) {
                break;
            }
            uVar2 = uVar3;
        }
        Iterable<s> e12 = C6565s.e1(kVar);
        ArrayList arrayList = new ArrayList(C6565s.y(e12, 10));
        for (s sVar2 : e12) {
            arrayList.add(Integer.valueOf(sVar2.f22966h));
        }
        return C6565s.d1(arrayList);
    }

    public final Map t() {
        return O.y(this.f22965g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f22961c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f22966h));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f22967i;
        if (str2 != null && !Sg.p.d0(str2)) {
            sb2.append(" route=");
            sb2.append(this.f22967i);
        }
        if (this.f22962d != null) {
            sb2.append(" label=");
            sb2.append(this.f22962d);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "sb.toString()");
        return sb3;
    }

    public String v() {
        String str = this.f22961c;
        if (str == null) {
            return String.valueOf(this.f22966h);
        }
        return str;
    }

    public final int x() {
        return this.f22966h;
    }

    public final String z() {
        return this.f22959a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(C2128E e10) {
        this(C2129F.f22772b.a(e10.getClass()));
        C6496s.h(e10, "navigator");
    }
}
