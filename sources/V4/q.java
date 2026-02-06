package V4;

import T4.f;
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class q extends Exception {

    /* renamed from: g  reason: collision with root package name */
    private static final StackTraceElement[] f34618g = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private final List f34619a;

    /* renamed from: b  reason: collision with root package name */
    private f f34620b;

    /* renamed from: c  reason: collision with root package name */
    private T4.a f34621c;

    /* renamed from: d  reason: collision with root package name */
    private Class f34622d;

    /* renamed from: e  reason: collision with root package name */
    private String f34623e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f34624f;

    public q(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th2, List list) {
        if (th2 instanceof q) {
            for (Throwable a10 : ((q) th2).e()) {
                a(a10, list);
            }
            return;
        }
        list.add(th2);
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof q) {
                ((q) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List e() {
        return this.f34619a;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void g(String str) {
        List f10 = f();
        int size = f10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) f10.get(i10));
            i10 = i11;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f34623e);
        String str3 = "";
        if (this.f34622d != null) {
            str = ", " + this.f34622d;
        } else {
            str = str3;
        }
        sb2.append(str);
        if (this.f34621c != null) {
            str2 = ", " + this.f34621c;
        } else {
            str2 = str3;
        }
        sb2.append(str2);
        if (this.f34620b != null) {
            str3 = ", " + this.f34620b;
        }
        sb2.append(str3);
        List<Throwable> f10 = f();
        if (f10.isEmpty()) {
            return sb2.toString();
        }
        if (f10.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(f10.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : f10) {
            sb2.append(10);
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public void i(f fVar, T4.a aVar) {
        j(fVar, aVar, (Class) null);
    }

    /* access modifiers changed from: package-private */
    public void j(f fVar, T4.a aVar, Class cls) {
        this.f34620b = fVar;
        this.f34621c = aVar;
        this.f34622d = cls;
    }

    public void k(Exception exc) {
        this.f34624f = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public q(String str, List list) {
        this.f34623e = str;
        setStackTrace(f34618g);
        this.f34619a = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f34625a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f34626b = true;

        a(Appendable appendable) {
            this.f34625a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            if (charSequence == null) {
                return "";
            }
            return charSequence;
        }

        public Appendable append(char c10) {
            boolean z10 = false;
            if (this.f34626b) {
                this.f34626b = false;
                this.f34625a.append("  ");
            }
            if (c10 == 10) {
                z10 = true;
            }
            this.f34626b = z10;
            this.f34625a.append(c10);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        public Appendable append(CharSequence charSequence, int i10, int i11) {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.f34626b) {
                this.f34626b = false;
                this.f34625a.append("  ");
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == 10) {
                z10 = true;
            }
            this.f34626b = z10;
            this.f34625a.append(a10, i10, i11);
            return this;
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}
