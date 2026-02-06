package Vd;

import Ff.p;
import Sg.k;
import Sg.m;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import expo.modules.kotlin.exception.h;
import ie.C5036f;
import ie.C5039i;
import ie.C5040j;
import ie.l;
import ie.n;
import ie.r;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import lf.C6514M;
import mf.C6565s;
import qe.C5155b;
import qe.C5157d;
import qe.V;
import qe.W;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LVd/b;", "Lke/b;", "<init>", "()V", "", "", "m", "()Ljava/util/List;", "Lke/d;", "b", "()Lke/d;", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "context", "expo-font_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b extends ke.b {

    public static final class a implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f53455a = new a();

        /* renamed from: a */
        public final p invoke() {
            return O.m(String.class);
        }
    }

    /* renamed from: Vd.b$b  reason: collision with other inner class name */
    public static final class C0813b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0813b f53456a = new C0813b();

        /* renamed from: a */
        public final p invoke() {
            return O.m(String.class);
        }
    }

    public static final class c implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f53457a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f53458b;

        public c(b bVar, N n10) {
            this.f53457a = bVar;
            this.f53458b = n10;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            Typeface typeface;
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            String str2 = objArr[1];
            String str3 = str;
            Context u10 = this.f53457a.c().u();
            if (u10 != null) {
                if (Sg.p.J(str2, "asset://", false, 2, (Object) null)) {
                    AssetManager assets = u10.getAssets();
                    String substring = str2.substring(9);
                    C6496s.g(substring, "substring(...)");
                    typeface = Typeface.createFromAsset(assets, substring);
                    C6496s.e(typeface);
                } else {
                    String path = Uri.parse(str2).getPath();
                    if (path != null) {
                        typeface = Typeface.createFromFile(new File(path));
                        C6496s.e(typeface);
                    } else {
                        throw new a(str2);
                    }
                }
                D7.a.f30562c.c().g(str3, 0, typeface);
                N n10 = this.f53458b;
                Set i12 = C6565s.i1((Iterable) n10.f71759a);
                i12.add(str3);
                n10.f71759a = C6565s.e1(i12);
                return C6514M.f71813a;
            }
            throw new h();
        }
    }

    public static final class d implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f53459a;

        public d(N n10) {
            this.f53459a = n10;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return this.f53459a.f71759a;
        }
    }

    private final Context l() {
        Context u10 = c().u();
        if (u10 != null) {
            return u10;
        }
        throw new h();
    }

    /* access modifiers changed from: private */
    public final List m() {
        String str;
        List b10;
        AssetManager assets = l().getAssets();
        m mVar = new m("^(.+?)(_bold|_italic|_bold_italic)?\\.(ttf|otf)$");
        String[] list = assets.list("fonts/");
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list) {
                C6496s.e(str2);
                k b11 = m.b(mVar, str2, 0, 2, (Object) null);
                if (b11 == null || (b10 = b11.b()) == null) {
                    str = null;
                } else {
                    str = (String) b10.get(1);
                }
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            arrayList = new ArrayList();
            for (Object next : arrayList2) {
                if (!Sg.p.d0((String) next)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList == null) {
            return C6565s.n();
        }
        return arrayList;
    }

    public ke.d b() {
        Object obj;
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        D3.a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            ke.c cVar = new ke.c(this);
            N n10 = new N();
            n10.f71759a = m();
            cVar.o("ExpoFontLoader");
            C5155b[] bVarArr = new C5155b[0];
            W w10 = W.f61408a;
            V v10 = (V) w10.a().get(O.b(cls));
            if (v10 == null) {
                v10 = new V(O.b(cls));
                w10.a().put(O.b(cls), v10);
            }
            cVar.n().put("getLoadedFonts", new r("getLoadedFonts", bVarArr, v10, new d(n10)));
            C5157d dVar = C5157d.f61437a;
            Ff.d b10 = O.b(cls2);
            Boolean bool = Boolean.FALSE;
            C5155b bVar = (C5155b) dVar.a().get(new Pair(b10, bool));
            if (bVar == null) {
                bVar = new C5155b(new qe.O(O.b(cls2), false, a.f53455a));
            }
            C5155b bVar2 = (C5155b) dVar.a().get(new Pair(O.b(cls2), bool));
            if (bVar2 == null) {
                bVar2 = new C5155b(new qe.O(O.b(cls2), false, C0813b.f53456a));
            }
            C5155b[] bVarArr2 = {bVar, bVar2};
            c cVar2 = new c(this, n10);
            Class<C6514M> cls3 = C6514M.class;
            if (C6496s.c(cls3, Integer.TYPE)) {
                obj = new l("loadAsync", bVarArr2, cVar2);
            } else if (C6496s.c(cls3, Boolean.TYPE)) {
                obj = new C5039i("loadAsync", bVarArr2, cVar2);
            } else if (C6496s.c(cls3, Double.TYPE)) {
                obj = new C5040j("loadAsync", bVarArr2, cVar2);
            } else if (C6496s.c(cls3, Float.TYPE)) {
                obj = new ie.k("loadAsync", bVarArr2, cVar2);
            } else if (C6496s.c(cls3, cls2)) {
                obj = new n("loadAsync", bVarArr2, cVar2);
            } else {
                obj = new C5036f("loadAsync", bVarArr2, cVar2);
            }
            cVar.k().put("loadAsync", obj);
            ke.d p10 = cVar.p();
            D3.a.f();
            return p10;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
