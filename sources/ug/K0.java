package Ug;

import Rg.h;
import Rg.k;
import java.util.concurrent.CancellationException;
import qf.C6655a;
import qf.C6658d;
import yf.C6798l;

public final class K0 extends C6655a implements C5600w0 {

    /* renamed from: b  reason: collision with root package name */
    public static final K0 f65319b = new K0();

    private K0() {
        super(C5600w0.f65416O);
    }

    public Object B0(C6658d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public h E() {
        return k.e();
    }

    public CancellationException M() {
        throw new IllegalStateException("This job is always active");
    }

    public C5559b0 P0(C6798l lVar) {
        return L0.f65320a;
    }

    public boolean a() {
        return true;
    }

    public C5600w0 getParent() {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public C5593t q(C5597v vVar) {
        return L0.f65320a;
    }

    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    public C5559b0 x0(boolean z10, boolean z11, C6798l lVar) {
        return L0.f65320a;
    }

    public void n(CancellationException cancellationException) {
    }
}
