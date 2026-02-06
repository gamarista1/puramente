package com.bugsnag.android;

import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Writer;

public class K0 extends L0 {

    /* renamed from: l  reason: collision with root package name */
    private final C3239g1 f38512l;

    /* renamed from: m  reason: collision with root package name */
    private final Writer f38513m;

    public interface a {
        void toStream(K0 k02);
    }

    public K0(Writer writer) {
        super(writer);
        U(false);
        this.f38513m = writer;
        this.f38512l = new C3239g1();
    }

    public void B0(File file) {
        BufferedReader bufferedReader;
        Throwable th2;
        if (file != null && file.length() > 0) {
            super.flush();
            b();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Constants.ENCODING));
                try {
                    E0.b(bufferedReader, this.f38513m);
                    E0.a(bufferedReader);
                    this.f38513m.flush();
                } catch (Throwable th3) {
                    th2 = th3;
                    E0.a(bufferedReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
                E0.a(bufferedReader);
                throw th2;
            }
        }
    }

    public void E0(Object obj) {
        if (obj instanceof File) {
            B0((File) obj);
        } else {
            I0(obj, false);
        }
    }

    public /* bridge */ /* synthetic */ L0 F() {
        return super.F();
    }

    public void I0(Object obj, boolean z10) {
        if (obj instanceof a) {
            ((a) obj).toStream(this);
        } else {
            this.f38512l.f(obj, this, z10);
        }
    }

    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public /* bridge */ /* synthetic */ L0 f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ L0 f0(long j10) {
        return super.f0(j10);
    }

    public /* bridge */ /* synthetic */ void flush() {
        super.flush();
    }

    public /* bridge */ /* synthetic */ L0 g0(Boolean bool) {
        return super.g0(bool);
    }

    public /* bridge */ /* synthetic */ L0 h0(Number number) {
        return super.h0(number);
    }

    public /* bridge */ /* synthetic */ L0 j0(String str) {
        return super.j0(str);
    }

    public /* bridge */ /* synthetic */ L0 n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ L0 o0(boolean z10) {
        return super.o0(z10);
    }

    public /* bridge */ /* synthetic */ L0 q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ L0 t() {
        return super.t();
    }

    /* renamed from: x0 */
    public K0 y(String str) {
        super.y(str);
        return this;
    }

    K0(K0 k02, C3239g1 g1Var) {
        super(k02.f38513m);
        U(k02.v());
        this.f38513m = k02.f38513m;
        this.f38512l = g1Var;
    }
}
