package com.amazon.a.a.i;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.amazon.a.a.i.c;
import com.amazon.a.a.o.c;

public abstract class h extends b {

    /* renamed from: b  reason: collision with root package name */
    private static final c f37245b = new c("SimplePrompt");

    /* renamed from: e  reason: collision with root package name */
    private static final String f37246e = "OK";

    /* renamed from: c  reason: collision with root package name */
    protected final c f37247c;

    /* renamed from: d  reason: collision with root package name */
    protected final a f37248d;

    public enum a {
        LEGACY,
        EXTENDED
    }

    public h(c cVar) {
        this(cVar, a.LEGACY);
    }

    private void a(AlertDialog.Builder builder) {
        String[] b10 = this.f37247c.b();
        if (b10.length < 1 || b10.length > 2) {
            f37245b.b("Unexpected button count: " + b10.length);
            return;
        }
        boolean[] a10 = a(this.f37247c.c());
        int i10 = -1;
        int i11 = 0;
        for (int i12 = 0; i12 < a10.length; i12++) {
            if (a10[i12]) {
                i11++;
                i10 = i12;
            }
        }
        if (i11 == 1) {
            f37245b.a("single button dialog");
            a(builder, b10[i10], i10);
            return;
        }
        f37245b.a("two button dialog");
        builder.setNegativeButton(b10[0], new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (h.this.k()) {
                    h.this.a(0);
                }
            }
        });
        builder.setPositiveButton(b10[1], new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (h.this.k()) {
                    h.this.a(1);
                }
            }
        });
    }

    private final Dialog e(Activity activity) {
        c cVar = f37245b;
        cVar.a("Legacy mode dialog, legacy title = " + this.f37247c.e() + ", extended title = " + this.f37247c.f());
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f37247c.f()).setMessage(this.f37247c.d()).setCancelable(false).setNeutralButton(f37246e, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (h.this.k()) {
                    h.this.i();
                }
            }
        });
        return builder.create();
    }

    private final Dialog f(Activity activity) {
        c cVar = f37245b;
        cVar.a("doCreate() called to create extended dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f37247c.f()).setMessage(this.f37247c.d()).setCancelable(false);
        a(builder);
        cVar.a("doCreate() returning");
        return builder.create();
    }

    /* access modifiers changed from: protected */
    public boolean b(Activity activity) {
        return this.f37247c.h();
    }

    public final Dialog d(Activity activity) {
        if (this.f37248d == a.LEGACY) {
            return e(activity);
        }
        return f(activity);
    }

    /* access modifiers changed from: protected */
    public abstract void i();

    public h(c cVar, a aVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "content");
        this.f37247c = cVar;
        this.f37248d = aVar;
        c cVar2 = f37245b;
        cVar2.a("created SimplePrompt with mode " + aVar);
    }

    private void a(AlertDialog.Builder builder, String str, final int i10) {
        builder.setNeutralButton(str, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (h.this.k()) {
                    h.this.a(i10);
                }
            }
        });
    }

    private boolean[] a(c.a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            boolean a10 = a(aVarArr[i10]);
            zArr[i10] = a10;
            if (!a10) {
                com.amazon.a.a.o.c cVar = f37245b;
                cVar.a("filterActions() filtering item " + i10);
            }
        }
        return zArr;
    }

    /* access modifiers changed from: protected */
    public void a(d dVar) {
        i();
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        f37245b.b("extended doAction from base class called, this should never happen.");
        i();
    }

    /* access modifiers changed from: protected */
    public boolean a(c.a aVar) {
        return aVar == c.a.DEFAULT;
    }
}
