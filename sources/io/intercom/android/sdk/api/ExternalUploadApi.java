package io.intercom.android.sdk.api;

import gi.l;
import gi.o;
import gi.q;
import gi.y;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import kotlin.Metadata;
import lf.C6514M;
import qf.C6658d;
import rh.z;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J|\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/api/ExternalUploadApi;", "", "", "url", "Lrh/z$c;", "key", "acl", "contentType", "accessKey", "policy", "signature", "successActionStatus", "metadata", "filePart", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Llf/M;", "uploadFileSuspended", "(Ljava/lang/String;Lrh/z$c;Lrh/z$c;Lrh/z$c;Lrh/z$c;Lrh/z$c;Lrh/z$c;Lrh/z$c;Lrh/z$c;Lrh/z$c;Lqf/d;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ExternalUploadApi {
    @l
    @o
    Object uploadFileSuspended(@y String str, @q z.c cVar, @q z.c cVar2, @q z.c cVar3, @q z.c cVar4, @q z.c cVar5, @q z.c cVar6, @q z.c cVar7, @q z.c cVar8, @q z.c cVar9, C6658d<? super NetworkResponse<C6514M>> dVar);
}
