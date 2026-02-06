package Xf;

import eg.C5830g;
import eg.u;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.b;
import ng.c;

/* renamed from: Xf.u  reason: case insensitive filesystem */
public interface C5687u {
    u a(c cVar, boolean z10);

    C5830g b(a aVar);

    Set c(c cVar);

    /* renamed from: Xf.u$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b f66393a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f66394b;

        /* renamed from: c  reason: collision with root package name */
        private final C5830g f66395c;

        public a(b bVar, byte[] bArr, C5830g gVar) {
            C6496s.h(bVar, "classId");
            this.f66393a = bVar;
            this.f66394b = bArr;
            this.f66395c = gVar;
        }

        public final b a() {
            return this.f66393a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f66393a, aVar.f66393a) && C6496s.c(this.f66394b, aVar.f66394b) && C6496s.c(this.f66395c, aVar.f66395c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f66393a.hashCode() * 31;
            byte[] bArr = this.f66394b;
            int i11 = 0;
            if (bArr == null) {
                i10 = 0;
            } else {
                i10 = Arrays.hashCode(bArr);
            }
            int i12 = (hashCode + i10) * 31;
            C5830g gVar = this.f66395c;
            if (gVar != null) {
                i11 = gVar.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            return "Request(classId=" + this.f66393a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f66394b) + ", outerClass=" + this.f66395c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(b bVar, byte[] bArr, C5830g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }
    }
}
