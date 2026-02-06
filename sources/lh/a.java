package Lh;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f64079a = StandardCharsets.ISO_8859_1;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f64080b = StandardCharsets.US_ASCII;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f64081c = StandardCharsets.UTF_16;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f64082d = StandardCharsets.UTF_16BE;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f64083e = StandardCharsets.UTF_16LE;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f64084f = StandardCharsets.UTF_8;

    public static Charset a(Charset charset) {
        if (charset == null) {
            return Charset.defaultCharset();
        }
        return charset;
    }
}
