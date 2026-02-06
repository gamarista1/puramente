package D7;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final b f30562c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f30563d = {"", "_bold", "_italic", "_bold_italic"};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f30564e = {".ttf", ".otf"};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final a f30565f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map f30566a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f30567b = new LinkedHashMap();

    /* renamed from: D7.a$a  reason: collision with other inner class name */
    private static final class C0504a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray f30568a = new SparseArray(4);

        public final Typeface a(int i10) {
            return (Typeface) this.f30568a.get(i10);
        }

        public final void b(int i10, Typeface typeface) {
            this.f30568a.put(i10, typeface);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Typeface b(String str, int i10, AssetManager assetManager) {
            if (assetManager != null) {
                String str2 = a.f30563d[i10];
                String[] b10 = a.f30564e;
                int length = b10.length;
                int i11 = 0;
                while (i11 < length) {
                    String str3 = b10[i11];
                    try {
                        Typeface createFromAsset = Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
                        C6496s.g(createFromAsset, "createFromAsset(...)");
                        return createFromAsset;
                    } catch (RuntimeException unused) {
                        i11++;
                    }
                }
            }
            Typeface create = Typeface.create(str, i10);
            C6496s.g(create, "create(...)");
            return create;
        }

        public final a c() {
            return a.f30565f;
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final C0505a f30569c = new C0505a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f30570a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30571b;

        /* renamed from: D7.a$c$a  reason: collision with other inner class name */
        public static final class C0505a {
            public /* synthetic */ C0505a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0505a() {
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? -1 : i11);
        }

        public final Typeface a(Typeface typeface) {
            if (Build.VERSION.SDK_INT < 28) {
                Typeface create = Typeface.create(typeface, b());
                C6496s.e(create);
                return create;
            }
            Typeface a10 = Typeface.create(typeface, this.f30571b, this.f30570a);
            C6496s.e(a10);
            return a10;
        }

        public final int b() {
            if (this.f30571b < 700) {
                if (this.f30570a) {
                    return 2;
                }
                return 0;
            } else if (this.f30570a) {
                return 3;
            } else {
                return 1;
            }
        }

        public c(int i10, int i11) {
            boolean z10 = false;
            i10 = i10 == -1 ? 0 : i10;
            this.f30570a = (i10 & 2) != 0 ? true : z10;
            this.f30571b = i11 == -1 ? (i10 & 1) != 0 ? 700 : 400 : i11;
        }
    }

    public final Typeface d(String str, int i10, int i11, AssetManager assetManager) {
        C6496s.h(str, "fontFamilyName");
        return f(str, new c(i10, i11), assetManager);
    }

    public final Typeface e(String str, int i10, AssetManager assetManager) {
        C6496s.h(str, "fontFamilyName");
        return f(str, new c(i10, 0, 2, (DefaultConstructorMarker) null), assetManager);
    }

    public final Typeface f(String str, c cVar, AssetManager assetManager) {
        C6496s.h(str, "fontFamilyName");
        C6496s.h(cVar, "typefaceStyle");
        if (this.f30567b.containsKey(str)) {
            return cVar.a((Typeface) this.f30567b.get(str));
        }
        Map map = this.f30566a;
        Object obj = map.get(str);
        if (obj == null) {
            obj = new C0504a();
            map.put(str, obj);
        }
        C0504a aVar = (C0504a) obj;
        int b10 = cVar.b();
        Typeface a10 = aVar.a(b10);
        if (a10 != null) {
            return a10;
        }
        Typeface a11 = f30562c.b(str, b10, assetManager);
        aVar.b(b10, a11);
        return a11;
    }

    public final void g(String str, int i10, Typeface typeface) {
        C6496s.h(str, "fontFamilyName");
        if (typeface != null) {
            Map map = this.f30566a;
            Object obj = map.get(str);
            if (obj == null) {
                obj = new C0504a();
                map.put(str, obj);
            }
            ((C0504a) obj).b(i10, typeface);
        }
    }
}
