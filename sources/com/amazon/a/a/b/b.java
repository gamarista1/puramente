package com.amazon.a.a.b;

import android.app.Application;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.a;
import com.amazon.a.a.k.d;
import com.amazon.a.a.o.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class b implements a, d, Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37098a = new c("CrashManagerImpl");

    /* renamed from: b  reason: collision with root package name */
    private static final String f37099b = "s-";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37100c = ".amzst";

    /* renamed from: d  reason: collision with root package name */
    private static final int f37101d = 99999;

    /* renamed from: e  reason: collision with root package name */
    private static final int f37102e = 5;
    @a

    /* renamed from: f  reason: collision with root package name */
    private f f37103f;
    @a

    /* renamed from: g  reason: collision with root package name */
    private Application f37104g;

    /* renamed from: h  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f37105h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Map<c, String> f37106i = new HashMap();

    private void b() {
        if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof a)) {
            if (c.f37534a) {
                f37098a.a("Registering Crash Handler");
            }
            this.f37105h = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private boolean c() {
        return this.f37106i.size() >= 5;
    }

    private String[] d() {
        return new File(this.f37104g.getFilesDir().getAbsolutePath() + "/").list(new FilenameFilter() {
            public boolean accept(File file, String str) {
                if (!str.endsWith(b.f37100c) || b.this.f37106i.containsValue(str)) {
                    return false;
                }
                return true;
            }
        });
    }

    public void e() {
        com.amazon.a.a.o.a.a.a();
        b();
    }

    public void uncaughtException(Thread thread, Throwable th2) {
        if (c.f37534a) {
            f37098a.a("Crash detected", th2);
        }
        try {
            a(th2);
            this.f37103f.a((com.amazon.a.a.c.a) new com.amazon.a.a.b.a.a());
        } catch (Throwable th3) {
            if (c.f37534a) {
                f37098a.a("Error occured while handling exception", th3);
            }
        }
        if (c.f37534a) {
            f37098a.a("Calling previous handler");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f37105h;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    private void a(Throwable th2) {
        try {
            a(a(new c(this.f37104g, th2)));
        } catch (Throwable th3) {
            if (c.f37535b) {
                f37098a.b("Could not handle uncaught exception", th3);
            }
        }
    }

    private String c(String str) {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (bufferedReader2.ready()) {
                try {
                    sb2.append(bufferedReader2.readLine());
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    com.amazon.a.a.o.a.a((Reader) bufferedReader);
                    throw th;
                }
            }
            com.amazon.a.a.o.a.a((Reader) bufferedReader2);
            return sb2.toString();
        } catch (Throwable th3) {
            th = th3;
            com.amazon.a.a.o.a.a((Reader) bufferedReader);
            throw th;
        }
    }

    private String e(String str) {
        return this.f37104g.getFilesDir().getAbsolutePath() + "/" + str;
    }

    private void d(String str) {
        try {
            new File(str).delete();
        } catch (Exception e10) {
            if (c.f37535b) {
                c cVar = f37098a;
                cVar.b("Cannot delete file: " + str, e10);
            }
        }
    }

    private c b(String str) {
        try {
            return (c) com.amazon.a.a.o.c.a.a(c(str));
        } catch (Exception unused) {
            if (!c.f37535b) {
                return null;
            }
            c cVar = f37098a;
            cVar.b("Failed to load crash report: " + str);
            return null;
        }
    }

    private String a(c cVar) {
        return com.amazon.a.a.o.c.a.a((Serializable) cVar);
    }

    private synchronized void a(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.f37104g.openFileOutput(f37099b + new Random().nextInt(f37101d) + f37100c, 0);
            fileOutputStream.write(str.getBytes());
        } catch (Exception e10) {
            try {
                if (c.f37535b) {
                    f37098a.b("Coud not save crash report to file", e10);
                }
            } catch (Throwable th2) {
                com.amazon.a.a.o.a.a((OutputStream) fileOutputStream);
                throw th2;
            }
        }
        com.amazon.a.a.o.a.a((OutputStream) fileOutputStream);
    }

    public List<c> a() {
        if (c()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] d10 = d();
        for (int i10 = 0; i10 < d10.length && !c(); i10++) {
            String e10 = e(d10[i10]);
            c b10 = b(e10);
            if (b10 != null) {
                this.f37106i.put(b10, e10);
                arrayList.add(b10);
            } else {
                d(e10);
            }
        }
        return arrayList;
    }

    public void a(List<c> list) {
        for (c next : list) {
            d(this.f37106i.get(next));
            this.f37106i.remove(next);
        }
    }
}
