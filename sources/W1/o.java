package w1;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.Locale;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final n f27695a = new e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final n f27696b = new e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final n f27697c;

    /* renamed from: d  reason: collision with root package name */
    public static final n f27698d;

    /* renamed from: e  reason: collision with root package name */
    public static final n f27699e = new e(a.f27701b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final n f27700f = f.f27706b;

    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f27701b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f27702a;

        private a(boolean z10) {
            this.f27702a = z10;
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = o.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                    } else if (!this.f27702a) {
                        return 1;
                    }
                } else if (this.f27702a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f27702a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f27703a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = o.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements n {

        /* renamed from: a  reason: collision with root package name */
        private final c f27704a;

        d(c cVar) {
            this.f27704a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f27704a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            } else if (this.f27704a == null) {
                return b();
            } else {
                return c(charSequence, i10, i11);
            }
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    private static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f27705b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f27705b = z10;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.f27705b;
        }
    }

    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f27706b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            if (p.a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.f27703a;
        f27697c = new e(bVar, false);
        f27698d = new e(bVar, true);
    }

    static int a(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1 || i10 == 2) {
            return 0;
        }
        return 2;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case StdKeyDeserializer.TYPE_URL /*14*/:
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
