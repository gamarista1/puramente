package Mh;

import java.io.Serializable;
import java.io.Writer;

public class a extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f64249a;

    public a() {
        this.f64249a = new StringBuilder();
    }

    public String toString() {
        return this.f64249a.toString();
    }

    public void write(String str) {
        if (str != null) {
            this.f64249a.append(str);
        }
    }

    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f64249a.append(cArr, i10, i11);
        }
    }

    public a(int i10) {
        this.f64249a = new StringBuilder(i10);
    }

    public Writer append(char c10) {
        this.f64249a.append(c10);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.f64249a.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f64249a.append(charSequence, i10, i11);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }
}
