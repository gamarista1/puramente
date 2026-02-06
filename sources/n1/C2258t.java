package n1;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.app.u;
import androidx.core.content.e;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t1.C2612b;

/* renamed from: n1.t  reason: case insensitive filesystem */
public class C2258t {

    /* renamed from: a  reason: collision with root package name */
    Context f24413a;

    /* renamed from: b  reason: collision with root package name */
    String f24414b;

    /* renamed from: c  reason: collision with root package name */
    String f24415c;

    /* renamed from: d  reason: collision with root package name */
    Intent[] f24416d;

    /* renamed from: e  reason: collision with root package name */
    ComponentName f24417e;

    /* renamed from: f  reason: collision with root package name */
    CharSequence f24418f;

    /* renamed from: g  reason: collision with root package name */
    CharSequence f24419g;

    /* renamed from: h  reason: collision with root package name */
    CharSequence f24420h;

    /* renamed from: i  reason: collision with root package name */
    IconCompat f24421i;

    /* renamed from: j  reason: collision with root package name */
    u[] f24422j;

    /* renamed from: k  reason: collision with root package name */
    Set f24423k;

    /* renamed from: l  reason: collision with root package name */
    e f24424l;

    /* renamed from: m  reason: collision with root package name */
    boolean f24425m;

    /* renamed from: n  reason: collision with root package name */
    int f24426n;

    /* renamed from: o  reason: collision with root package name */
    PersistableBundle f24427o;

    /* renamed from: p  reason: collision with root package name */
    long f24428p;

    /* renamed from: q  reason: collision with root package name */
    UserHandle f24429q;

    /* renamed from: r  reason: collision with root package name */
    boolean f24430r;

    /* renamed from: s  reason: collision with root package name */
    boolean f24431s;

    /* renamed from: t  reason: collision with root package name */
    boolean f24432t;

    /* renamed from: u  reason: collision with root package name */
    boolean f24433u;

    /* renamed from: v  reason: collision with root package name */
    boolean f24434v;

    /* renamed from: w  reason: collision with root package name */
    boolean f24435w = true;

    /* renamed from: x  reason: collision with root package name */
    boolean f24436x;

    /* renamed from: y  reason: collision with root package name */
    int f24437y;

    /* renamed from: z  reason: collision with root package name */
    int f24438z;

    /* renamed from: n1.t$a */
    private static class a {
        static void a(ShortcutInfo.Builder builder, int i10) {
            builder.setExcludedFromSurfaces(i10);
        }
    }

    C2258t() {
    }

    private PersistableBundle a() {
        if (this.f24427o == null) {
            this.f24427o = new PersistableBundle();
        }
        u[] uVarArr = this.f24422j;
        if (uVarArr != null && uVarArr.length > 0) {
            this.f24427o.putInt("extraPersonCount", uVarArr.length);
            int i10 = 0;
            while (i10 < this.f24422j.length) {
                PersistableBundle persistableBundle = this.f24427o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f24422j[i10].k());
                i10 = i11;
            }
        }
        e eVar = this.f24424l;
        if (eVar != null) {
            this.f24427o.putString("extraLocusId", eVar.a());
        }
        this.f24427o.putBoolean("extraLongLived", this.f24425m);
        return this.f24427o;
    }

    static List b(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object a10 : list) {
            arrayList.add(new b(context, C2247h.a(a10)).a());
        }
        return arrayList;
    }

    static e e(ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return f(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return e.d(shortcutInfo.getLocusId());
    }

    private static e f(PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new e(string);
    }

    static u[] g(PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i10 = persistableBundle.getInt("extraPersonCount");
        u[] uVarArr = new u[i10];
        int i11 = 0;
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("extraPerson_");
            int i12 = i11 + 1;
            sb2.append(i12);
            uVarArr[i11] = u.a(persistableBundle.getPersistableBundle(sb2.toString()));
            i11 = i12;
        }
        return uVarArr;
    }

    public String c() {
        return this.f24414b;
    }

    public e d() {
        return this.f24424l;
    }

    public int h() {
        return this.f24426n;
    }

    public CharSequence i() {
        return this.f24418f;
    }

    public boolean j(int i10) {
        if ((i10 & this.f24438z) != 0) {
            return true;
        }
        return false;
    }

    public ShortcutInfo k() {
        C2250k.a();
        ShortcutInfo.Builder a10 = C2241b.a(this.f24413a, this.f24414b).setShortLabel(this.f24418f).setIntents(this.f24416d);
        IconCompat iconCompat = this.f24421i;
        if (iconCompat != null) {
            ShortcutInfo.Builder unused = a10.setIcon(iconCompat.p(this.f24413a));
        }
        if (!TextUtils.isEmpty(this.f24419g)) {
            ShortcutInfo.Builder unused2 = a10.setLongLabel(this.f24419g);
        }
        if (!TextUtils.isEmpty(this.f24420h)) {
            ShortcutInfo.Builder unused3 = a10.setDisabledMessage(this.f24420h);
        }
        ComponentName componentName = this.f24417e;
        if (componentName != null) {
            ShortcutInfo.Builder unused4 = a10.setActivity(componentName);
        }
        Set set = this.f24423k;
        if (set != null) {
            ShortcutInfo.Builder unused5 = a10.setCategories(set);
        }
        ShortcutInfo.Builder unused6 = a10.setRank(this.f24426n);
        PersistableBundle persistableBundle = this.f24427o;
        if (persistableBundle != null) {
            ShortcutInfo.Builder unused7 = a10.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            u[] uVarArr = this.f24422j;
            if (uVarArr != null && uVarArr.length > 0) {
                int length = uVarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f24422j[i10].i();
                }
                ShortcutInfo.Builder unused8 = a10.setPersons(personArr);
            }
            e eVar = this.f24424l;
            if (eVar != null) {
                ShortcutInfo.Builder unused9 = a10.setLocusId(eVar.c());
            }
            ShortcutInfo.Builder unused10 = a10.setLongLived(this.f24425m);
        } else {
            ShortcutInfo.Builder unused11 = a10.setExtras(a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(a10, this.f24438z);
        }
        return a10.build();
    }

    /* renamed from: n1.t$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C2258t f24439a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f24440b;

        /* renamed from: c  reason: collision with root package name */
        private Set f24441c;

        /* renamed from: d  reason: collision with root package name */
        private Map f24442d;

        /* renamed from: e  reason: collision with root package name */
        private Uri f24443e;

        public b(Context context, String str) {
            C2258t tVar = new C2258t();
            this.f24439a = tVar;
            tVar.f24413a = context;
            tVar.f24414b = str;
        }

        public C2258t a() {
            String[] strArr;
            if (!TextUtils.isEmpty(this.f24439a.f24418f)) {
                C2258t tVar = this.f24439a;
                Intent[] intentArr = tVar.f24416d;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f24440b) {
                    if (tVar.f24424l == null) {
                        tVar.f24424l = new e(tVar.f24414b);
                    }
                    this.f24439a.f24425m = true;
                }
                if (this.f24441c != null) {
                    C2258t tVar2 = this.f24439a;
                    if (tVar2.f24423k == null) {
                        tVar2.f24423k = new HashSet();
                    }
                    this.f24439a.f24423k.addAll(this.f24441c);
                }
                if (this.f24442d != null) {
                    C2258t tVar3 = this.f24439a;
                    if (tVar3.f24427o == null) {
                        tVar3.f24427o = new PersistableBundle();
                    }
                    for (String str : this.f24442d.keySet()) {
                        Map map = (Map) this.f24442d.get(str);
                        this.f24439a.f24427o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                        for (String str2 : map.keySet()) {
                            List list = (List) map.get(str2);
                            PersistableBundle persistableBundle = this.f24439a.f24427o;
                            String str3 = str + "/" + str2;
                            if (list == null) {
                                strArr = new String[0];
                            } else {
                                strArr = (String[]) list.toArray(new String[0]);
                            }
                            persistableBundle.putStringArray(str3, strArr);
                        }
                    }
                }
                if (this.f24443e != null) {
                    C2258t tVar4 = this.f24439a;
                    if (tVar4.f24427o == null) {
                        tVar4.f24427o = new PersistableBundle();
                    }
                    this.f24439a.f24427o.putString("extraSliceUri", C2612b.a(this.f24443e));
                }
                return this.f24439a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public b b(IconCompat iconCompat) {
            this.f24439a.f24421i = iconCompat;
            return this;
        }

        public b c(Intent intent) {
            return d(new Intent[]{intent});
        }

        public b d(Intent[] intentArr) {
            this.f24439a.f24416d = intentArr;
            return this;
        }

        public b e() {
            this.f24440b = true;
            return this;
        }

        public b f(boolean z10) {
            this.f24439a.f24425m = z10;
            return this;
        }

        public b g(CharSequence charSequence) {
            this.f24439a.f24418f = charSequence;
            return this;
        }

        public b(Context context, ShortcutInfo shortcutInfo) {
            C2258t tVar = new C2258t();
            this.f24439a = tVar;
            tVar.f24413a = context;
            tVar.f24414b = shortcutInfo.getId();
            tVar.f24415c = shortcutInfo.getPackage();
            Intent[] a10 = shortcutInfo.getIntents();
            tVar.f24416d = (Intent[]) Arrays.copyOf(a10, a10.length);
            tVar.f24417e = shortcutInfo.getActivity();
            tVar.f24418f = shortcutInfo.getShortLabel();
            tVar.f24419g = shortcutInfo.getLongLabel();
            tVar.f24420h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                tVar.f24437y = shortcutInfo.getDisabledReason();
            } else {
                tVar.f24437y = shortcutInfo.isEnabled() ? 0 : 3;
            }
            tVar.f24423k = shortcutInfo.getCategories();
            tVar.f24422j = C2258t.g(shortcutInfo.getExtras());
            tVar.f24429q = shortcutInfo.getUserHandle();
            tVar.f24428p = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                tVar.f24430r = shortcutInfo.isCached();
            }
            tVar.f24431s = shortcutInfo.isDynamic();
            tVar.f24432t = shortcutInfo.isPinned();
            tVar.f24433u = shortcutInfo.isDeclaredInManifest();
            tVar.f24434v = shortcutInfo.isImmutable();
            tVar.f24435w = shortcutInfo.isEnabled();
            tVar.f24436x = shortcutInfo.hasKeyFieldsOnly();
            tVar.f24424l = C2258t.e(shortcutInfo);
            tVar.f24426n = shortcutInfo.getRank();
            tVar.f24427o = shortcutInfo.getExtras();
        }
    }
}
