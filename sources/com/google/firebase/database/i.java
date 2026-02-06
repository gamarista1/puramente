package com.google.firebase.database;

import Tb.n;

public abstract class i {

    public interface b {
        c a(f fVar);

        void b(Gb.b bVar, boolean z10, a aVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private boolean f57172a;

        /* renamed from: b  reason: collision with root package name */
        private n f57173b;

        public n a() {
            return this.f57173b;
        }

        public boolean b() {
            return this.f57172a;
        }

        private c(boolean z10, n nVar) {
            this.f57172a = z10;
            this.f57173b = nVar;
        }
    }

    public static c a() {
        return new c(false, (n) null);
    }

    public static c b(f fVar) {
        return new c(true, fVar.f());
    }
}
