package Kb;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class b extends Reader {

    /* renamed from: a  reason: collision with root package name */
    private List f51449a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f51450b;

    /* renamed from: c  reason: collision with root package name */
    private int f51451c;

    /* renamed from: d  reason: collision with root package name */
    private int f51452d;

    /* renamed from: e  reason: collision with root package name */
    private int f51453e;

    /* renamed from: f  reason: collision with root package name */
    private int f51454f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f51455g;

    public b() {
        this.f51449a = null;
        this.f51450b = false;
        this.f51453e = this.f51451c;
        this.f51454f = this.f51452d;
        this.f51455g = false;
        this.f51449a = new ArrayList();
    }

    private long b(long j10) {
        long j11 = 0;
        while (this.f51452d < this.f51449a.size() && j11 < j10) {
            long j12 = j10 - j11;
            long o10 = (long) o();
            if (j12 < o10) {
                this.f51451c = (int) (((long) this.f51451c) + j12);
                j11 += j12;
            } else {
                j11 += o10;
                this.f51451c = 0;
                this.f51452d++;
            }
        }
        return j11;
    }

    private void f() {
        if (this.f51450b) {
            throw new IOException("Stream already closed");
        } else if (!this.f51455g) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    private String n() {
        if (this.f51452d < this.f51449a.size()) {
            return (String) this.f51449a.get(this.f51452d);
        }
        return null;
    }

    private int o() {
        String n10 = n();
        if (n10 == null) {
            return 0;
        }
        return n10.length() - this.f51451c;
    }

    public void a(String str) {
        if (this.f51455g) {
            throw new IllegalStateException("Trying to add string after reading");
        } else if (str.length() > 0) {
            this.f51449a.add(str);
        }
    }

    public void close() {
        f();
        this.f51450b = true;
    }

    public void mark(int i10) {
        f();
        this.f51453e = this.f51451c;
        this.f51454f = this.f51452d;
    }

    public boolean markSupported() {
        return true;
    }

    public void q() {
        if (!this.f51455g) {
            this.f51455g = true;
            return;
        }
        throw new IllegalStateException("Trying to freeze frozen StringListReader");
    }

    public int read(CharBuffer charBuffer) {
        f();
        int remaining = charBuffer.remaining();
        String n10 = n();
        int i10 = 0;
        while (remaining > 0 && n10 != null) {
            int min = Math.min(n10.length() - this.f51451c, remaining);
            int i11 = this.f51451c;
            charBuffer.put((String) this.f51449a.get(this.f51452d), i11, i11 + min);
            remaining -= min;
            i10 += min;
            b((long) min);
            n10 = n();
        }
        if (i10 > 0 || n10 != null) {
            return i10;
        }
        return -1;
    }

    public boolean ready() {
        f();
        return true;
    }

    public void reset() {
        this.f51451c = this.f51453e;
        this.f51452d = this.f51454f;
    }

    public long skip(long j10) {
        f();
        return b(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String append : this.f51449a) {
            sb2.append(append);
        }
        return sb2.toString();
    }

    public int read() {
        f();
        String n10 = n();
        if (n10 == null) {
            return -1;
        }
        char charAt = n10.charAt(this.f51451c);
        b(1);
        return charAt;
    }

    public int read(char[] cArr, int i10, int i11) {
        f();
        String n10 = n();
        int i12 = 0;
        while (n10 != null && i12 < i11) {
            int min = Math.min(o(), i11 - i12);
            int i13 = this.f51451c;
            n10.getChars(i13, i13 + min, cArr, i10 + i12);
            i12 += min;
            b((long) min);
            n10 = n();
        }
        if (i12 > 0 || n10 != null) {
            return i12;
        }
        return -1;
    }
}
