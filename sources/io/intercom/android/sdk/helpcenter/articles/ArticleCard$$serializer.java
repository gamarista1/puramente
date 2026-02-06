package io.intercom.android.sdk.helpcenter.articles;

import com.amazon.a.a.o.b;
import gh.C5978b;
import gh.C5992p;
import ih.f;
import jh.c;
import jh.d;
import jh.e;
import kh.C6458j0;
import kh.D;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/intercom/android/sdk/helpcenter/articles/ArticleCard.$serializer", "Lkh/D;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class ArticleCard$$serializer implements D {
    public static final int $stable = 8;
    public static final ArticleCard$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ArticleCard$$serializer articleCard$$serializer = new ArticleCard$$serializer();
        INSTANCE = articleCard$$serializer;
        C6458j0 j0Var = new C6458j0("io.intercom.android.sdk.helpcenter.articles.ArticleCard", articleCard$$serializer, 2);
        j0Var.l("articleId", false);
        j0Var.l(b.f37461S, false);
        descriptor = j0Var;
    }

    private ArticleCard$$serializer() {
    }

    public final C5978b[] childSerializers() {
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, x0Var};
    }

    public final ArticleCard deserialize(e eVar) {
        int i10;
        String str;
        String str2;
        C6496s.h(eVar, "decoder");
        f fVar = descriptor;
        c b10 = eVar.b(fVar);
        if (b10.p()) {
            str2 = b10.A(fVar, 0);
            str = b10.A(fVar, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            str2 = null;
            String str3 = null;
            while (z10) {
                int o10 = b10.o(fVar);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    str2 = b10.A(fVar, 0);
                    i11 |= 1;
                } else if (o10 == 1) {
                    str3 = b10.A(fVar, 1);
                    i11 |= 2;
                } else {
                    throw new C5992p(o10);
                }
            }
            str = str3;
            i10 = i11;
        }
        b10.c(fVar);
        return new ArticleCard(i10, str2, str, (t0) null);
    }

    public final f getDescriptor() {
        return descriptor;
    }

    public final void serialize(jh.f fVar, ArticleCard articleCard) {
        C6496s.h(fVar, "encoder");
        C6496s.h(articleCard, "value");
        f fVar2 = descriptor;
        d b10 = fVar.b(fVar2);
        ArticleCard.write$Self$intercom_sdk_base_release(articleCard, b10, fVar2);
        b10.c(fVar2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
