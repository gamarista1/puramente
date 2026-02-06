package a7;

import c7.C3189i;
import kotlin.jvm.internal.C6496s;

/* renamed from: a7.a  reason: case insensitive filesystem */
public final class C3139a extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final C3189i f36123a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3139a(String str, C3189i iVar) {
        super(str);
        C6496s.h(iVar, "encodedImage");
        this.f36123a = iVar;
    }

    public final C3189i a() {
        return this.f36123a;
    }
}
