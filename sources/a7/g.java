package a7;

import T5.b;
import T5.k;
import T5.p;
import W5.a;
import b6.d;
import c7.C3189i;
import java.io.IOException;
import java.io.InputStream;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private int f36135a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f36136b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f36137c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f36138d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f36139e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f36140f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f36141g;

    /* renamed from: h  reason: collision with root package name */
    private final a f36142h;

    public g(a aVar) {
        this.f36142h = (a) k.g(aVar);
    }

    private boolean a(InputStream inputStream) {
        int read;
        int i10 = this.f36139e;
        while (this.f36135a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i11 = this.f36137c;
                this.f36137c = i11 + 1;
                if (this.f36141g) {
                    this.f36135a = 6;
                    this.f36141g = false;
                    return false;
                }
                int i12 = this.f36135a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    this.f36135a = 5;
                                } else if (i12 != 5) {
                                    k.i(false);
                                } else {
                                    int i13 = ((this.f36136b << 8) + read) - 2;
                                    d.a(inputStream, (long) i13);
                                    this.f36137c += i13;
                                    this.f36135a = 2;
                                }
                            } else if (read == 255) {
                                this.f36135a = 3;
                            } else if (read == 0) {
                                this.f36135a = 2;
                            } else if (read == 217) {
                                this.f36141g = true;
                                f(i11 - 1);
                                this.f36135a = 2;
                            } else {
                                if (read == 218) {
                                    f(i11 - 1);
                                }
                                if (b(read)) {
                                    this.f36135a = 4;
                                } else {
                                    this.f36135a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f36135a = 3;
                        }
                    } else if (read == 216) {
                        this.f36135a = 2;
                    } else {
                        this.f36135a = 6;
                    }
                } else if (read == 255) {
                    this.f36135a = 1;
                } else {
                    this.f36135a = 6;
                }
                this.f36136b = read;
            } catch (IOException e10) {
                p.a(e10);
            }
        }
        if (this.f36135a == 6 || this.f36139e == i10) {
            return false;
        }
        return true;
    }

    private static boolean b(int i10) {
        if (i10 == 1) {
            return false;
        }
        if ((i10 >= 208 && i10 <= 215) || i10 == 217 || i10 == 216) {
            return false;
        }
        return true;
    }

    private void f(int i10) {
        int i11 = this.f36138d;
        if (i11 > 0) {
            this.f36140f = i10;
        }
        this.f36138d = i11 + 1;
        this.f36139e = i11;
    }

    public int c() {
        return this.f36140f;
    }

    public int d() {
        return this.f36139e;
    }

    public boolean e() {
        return this.f36141g;
    }

    public boolean g(C3189i iVar) {
        if (this.f36135a == 6 || iVar.M() <= this.f36137c) {
            return false;
        }
        W5.g gVar = new W5.g(iVar.F(), (byte[]) this.f36142h.get(16384), this.f36142h);
        try {
            d.a(gVar, (long) this.f36137c);
            return a(gVar);
        } catch (IOException e10) {
            p.a(e10);
            return false;
        } finally {
            b.b(gVar);
        }
    }
}
