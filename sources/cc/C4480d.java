package cc;

/* renamed from: cc.d  reason: case insensitive filesystem */
public @interface C4480d {

    /* renamed from: cc.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
