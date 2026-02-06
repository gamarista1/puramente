package com.google.android.gms.measurement.internal;

import Pa.C4381d;
import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public abstract class F {

    /* renamed from: A  reason: collision with root package name */
    public static final M1 f54583A = F("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new C4577b0());

    /* renamed from: A0  reason: collision with root package name */
    public static final M1 f54584A0;

    /* renamed from: B  reason: collision with root package name */
    public static final M1 f54585B = F("measurement.upload.initial_upload_delay_time", 15000L, new C4598e0());

    /* renamed from: B0  reason: collision with root package name */
    public static final M1 f54586B0;

    /* renamed from: C  reason: collision with root package name */
    public static final M1 f54587C = F("measurement.upload.retry_time", 1800000L, new C4591d0());

    /* renamed from: C0  reason: collision with root package name */
    public static final M1 f54588C0;

    /* renamed from: D  reason: collision with root package name */
    public static final M1 f54589D = F("measurement.upload.retry_count", 6, new C4612g0());

    /* renamed from: D0  reason: collision with root package name */
    public static final M1 f54590D0;

    /* renamed from: E  reason: collision with root package name */
    public static final M1 f54591E = F("measurement.upload.max_queue_time", 2419200000L, new C4626i0());

    /* renamed from: E0  reason: collision with root package name */
    public static final M1 f54592E0;

    /* renamed from: F  reason: collision with root package name */
    public static final M1 f54593F = F("measurement.lifetimevalue.max_currency_tracked", 4, new C4619h0());

    /* renamed from: F0  reason: collision with root package name */
    public static final M1 f54594F0;

    /* renamed from: G  reason: collision with root package name */
    public static final M1 f54595G = F("measurement.audience.filter_result_max_count", 200, new C4633j0());

    /* renamed from: G0  reason: collision with root package name */
    public static final M1 f54596G0;

    /* renamed from: H  reason: collision with root package name */
    public static final M1 f54597H = a("measurement.upload.max_public_user_properties", 25);

    /* renamed from: H0  reason: collision with root package name */
    public static final M1 f54598H0;

    /* renamed from: I  reason: collision with root package name */
    public static final M1 f54599I = a("measurement.upload.max_event_name_cardinality", 500);

    /* renamed from: I0  reason: collision with root package name */
    public static final M1 f54600I0;

    /* renamed from: J  reason: collision with root package name */
    public static final M1 f54601J = a("measurement.upload.max_public_event_params", 25);

    /* renamed from: J0  reason: collision with root package name */
    public static final M1 f54602J0;

    /* renamed from: K  reason: collision with root package name */
    public static final M1 f54603K = F("measurement.service_client.idle_disconnect_millis", 5000L, new C4654m0());

    /* renamed from: K0  reason: collision with root package name */
    public static final M1 f54604K0;

    /* renamed from: L  reason: collision with root package name */
    public static final M1 f54605L;

    /* renamed from: L0  reason: collision with root package name */
    public static final M1 f54606L0;

    /* renamed from: M  reason: collision with root package name */
    public static final M1 f54607M = F("measurement.test.string_flag", "---", new C4667o0());

    /* renamed from: M0  reason: collision with root package name */
    public static final M1 f54608M0;

    /* renamed from: N  reason: collision with root package name */
    public static final M1 f54609N = F("measurement.test.long_flag", -1L, new C4661n0());

    /* renamed from: N0  reason: collision with root package name */
    public static final M1 f54610N0;

    /* renamed from: O  reason: collision with root package name */
    public static final M1 f54611O = F("measurement.test.int_flag", -2, new C4673p0());

    /* renamed from: O0  reason: collision with root package name */
    public static final M1 f54612O0;

    /* renamed from: P  reason: collision with root package name */
    public static final M1 f54613P = F("measurement.test.double_flag", Double.valueOf(-3.0d), new C4690s0());

    /* renamed from: P0  reason: collision with root package name */
    public static final M1 f54614P0;

    /* renamed from: Q  reason: collision with root package name */
    public static final M1 f54615Q = F("measurement.experiment.max_ids", 50, new C4702u0());

    /* renamed from: Q0  reason: collision with root package name */
    public static final M1 f54616Q0;

    /* renamed from: R  reason: collision with root package name */
    public static final M1 f54617R = F("measurement.upload.max_item_scoped_custom_parameters", 27, new C4714w0());

    /* renamed from: R0  reason: collision with root package name */
    public static final M1 f54618R0;

    /* renamed from: S  reason: collision with root package name */
    public static final M1 f54619S = b("measurement.upload.max_event_parameter_value_length", 100, new C4708v0());

    /* renamed from: S0  reason: collision with root package name */
    public static final M1 f54620S0;

    /* renamed from: T  reason: collision with root package name */
    public static final M1 f54621T = F("measurement.max_bundles_per_iteration", 100, new C4726y0());

    /* renamed from: T0  reason: collision with root package name */
    public static final M1 f54622T0;

    /* renamed from: U  reason: collision with root package name */
    public static final M1 f54623U = F("measurement.sdk.attribution.cache.ttl", 604800000L, new C4720x0());

    /* renamed from: U0  reason: collision with root package name */
    public static final M1 f54624U0;

    /* renamed from: V  reason: collision with root package name */
    public static final M1 f54625V = F("measurement.redaction.app_instance_id.ttl", 7200000L, new B0());

    /* renamed from: V0  reason: collision with root package name */
    public static final M1 f54626V0;

    /* renamed from: W  reason: collision with root package name */
    public static final M1 f54627W = F("measurement.rb.attribution.client.min_ad_services_version", 7, new C4732z0());

    /* renamed from: W0  reason: collision with root package name */
    public static final M1 f54628W0;

    /* renamed from: X  reason: collision with root package name */
    public static final M1 f54629X = F("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new D0());

    /* renamed from: X0  reason: collision with root package name */
    public static final M1 f54630X0;

    /* renamed from: Y  reason: collision with root package name */
    public static final M1 f54631Y = F("measurement.rb.attribution.uri_scheme", Constants.SCHEME, new C0());

    /* renamed from: Y0  reason: collision with root package name */
    public static final M1 f54632Y0;

    /* renamed from: Z  reason: collision with root package name */
    public static final M1 f54633Z = F("measurement.rb.attribution.uri_authority", "google-analytics.com", new F0());

    /* renamed from: Z0  reason: collision with root package name */
    public static final M1 f54634Z0;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List f54635a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final M1 f54636a0 = F("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new G0());

    /* renamed from: b  reason: collision with root package name */
    public static final M1 f54637b = F("measurement.ad_id_cache_time", 10000L, new G());

    /* renamed from: b0  reason: collision with root package name */
    public static final M1 f54638b0 = F("measurement.session.engagement_interval", 3600000L, new J0());

    /* renamed from: c  reason: collision with root package name */
    public static final M1 f54639c = F("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new S());

    /* renamed from: c0  reason: collision with root package name */
    public static final M1 f54640c0 = F("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new I0());

    /* renamed from: d  reason: collision with root package name */
    public static final M1 f54641d = F("measurement.monitoring.sample_period_millis", 86400000L, new C4605f0());

    /* renamed from: d0  reason: collision with root package name */
    public static final M1 f54642d0 = F("measurement.rb.attribution.user_properties", "_npa,npa", new L0());

    /* renamed from: e  reason: collision with root package name */
    public static final M1 f54643e = c("measurement.config.cache_time", 86400000L, 3600000L, new C4684r0(), false);

    /* renamed from: e0  reason: collision with root package name */
    public static final M1 f54644e0 = F("measurement.rb.attribution.event_params", "value|currency", new K0());

    /* renamed from: f  reason: collision with root package name */
    public static final M1 f54645f = F("measurement.config.url_scheme", Constants.SCHEME, new E0());

    /* renamed from: f0  reason: collision with root package name */
    public static final M1 f54646f0 = F("measurement.rb.attribution.query_parameters_to_remove", "", new N0());

    /* renamed from: g  reason: collision with root package name */
    public static final M1 f54647g = F("measurement.config.url_authority", "app-measurement.com", new T0());

    /* renamed from: g0  reason: collision with root package name */
    public static final M1 f54648g0 = F("measurement.rb.attribution.max_queue_time", 1209600000L, new M0());

    /* renamed from: h  reason: collision with root package name */
    public static final M1 f54649h = F("measurement.upload.max_bundles", 100, new C4613g1());

    /* renamed from: h0  reason: collision with root package name */
    public static final M1 f54650h0;

    /* renamed from: i  reason: collision with root package name */
    public static final M1 f54651i = F("measurement.upload.max_batch_size", 65536, new C4691s1());

    /* renamed from: i0  reason: collision with root package name */
    public static final M1 f54652i0;

    /* renamed from: j  reason: collision with root package name */
    public static final M1 f54653j = F("measurement.upload.max_bundle_size", 65536, new F1());

    /* renamed from: j0  reason: collision with root package name */
    public static final M1 f54654j0;

    /* renamed from: k  reason: collision with root package name */
    public static final M1 f54655k = F("measurement.upload.max_events_per_bundle", 1000, new L());

    /* renamed from: k0  reason: collision with root package name */
    public static final M1 f54656k0;

    /* renamed from: l  reason: collision with root package name */
    public static final M1 f54657l = F("measurement.upload.max_events_per_day", 100000, new Q0());

    /* renamed from: l0  reason: collision with root package name */
    public static final M1 f54658l0;

    /* renamed from: m  reason: collision with root package name */
    public static final M1 f54659m = F("measurement.upload.max_error_events_per_day", 1000, new C4599e1());

    /* renamed from: m0  reason: collision with root package name */
    public static final M1 f54660m0;

    /* renamed from: n  reason: collision with root package name */
    public static final M1 f54661n = F("measurement.upload.max_public_events_per_day", 50000, new C4662n1());

    /* renamed from: n0  reason: collision with root package name */
    public static final M1 f54662n0;

    /* renamed from: o  reason: collision with root package name */
    public static final M1 f54663o = F("measurement.upload.max_conversions_per_day", 10000, new A1());

    /* renamed from: o0  reason: collision with root package name */
    public static final M1 f54664o0;

    /* renamed from: p  reason: collision with root package name */
    public static final M1 f54665p = F("measurement.upload.max_realtime_events_per_day", 10, new I());

    /* renamed from: p0  reason: collision with root package name */
    public static final M1 f54666p0 = F("measurement.service.storage_consent_support_version", 203600, new W0());

    /* renamed from: q  reason: collision with root package name */
    public static final M1 f54667q = F("measurement.store.max_stored_events_per_app", 100000, new O());

    /* renamed from: q0  reason: collision with root package name */
    public static final M1 f54668q0;

    /* renamed from: r  reason: collision with root package name */
    public static final M1 f54669r = F("measurement.upload.url", "https://app-measurement.com/a", new N());

    /* renamed from: r0  reason: collision with root package name */
    public static final M1 f54670r0;

    /* renamed from: s  reason: collision with root package name */
    public static final M1 f54671s = F("measurement.upload.backoff_period", 43200000L, new P());

    /* renamed from: s0  reason: collision with root package name */
    public static final M1 f54672s0;

    /* renamed from: t  reason: collision with root package name */
    public static final M1 f54673t = F("measurement.upload.window_interval", 3600000L, new T());

    /* renamed from: t0  reason: collision with root package name */
    public static final M1 f54674t0;

    /* renamed from: u  reason: collision with root package name */
    public static final M1 f54675u = F("measurement.upload.interval", 3600000L, new V());

    /* renamed from: u0  reason: collision with root package name */
    public static final M1 f54676u0;

    /* renamed from: v  reason: collision with root package name */
    public static final M1 f54677v = F("measurement.upload.realtime_upload_interval", 10000L, new U());

    /* renamed from: v0  reason: collision with root package name */
    public static final M1 f54678v0 = b("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda", new C4606f1());

    /* renamed from: w  reason: collision with root package name */
    public static final M1 f54679w = F("measurement.upload.debug_upload_interval", 1000L, new X());

    /* renamed from: w0  reason: collision with root package name */
    public static final M1 f54680w0;

    /* renamed from: x  reason: collision with root package name */
    public static final M1 f54681x = F("measurement.upload.minimum_delay", 500L, new C4570a0());

    /* renamed from: x0  reason: collision with root package name */
    public static final M1 f54682x0;

    /* renamed from: y  reason: collision with root package name */
    public static final M1 f54683y = F("measurement.alarm_manager.minimum_interval", 60000L, new Y());

    /* renamed from: y0  reason: collision with root package name */
    public static final M1 f54684y0;

    /* renamed from: z  reason: collision with root package name */
    public static final M1 f54685z = F("measurement.upload.stale_data_deletion_interval", 86400000L, new C4584c0());

    /* renamed from: z0  reason: collision with root package name */
    public static final M1 f54686z0;

    static {
        Collections.synchronizedSet(new HashSet());
        F("measurement.sgtm.google_signal.url", "https://app-measurement.com/s", new Q());
        Boolean bool = Boolean.FALSE;
        f54605L = F("measurement.test.boolean_flag", bool, new C4647l0());
        b("measurement.test.cached_long_flag", -1L, new C4679q0());
        Boolean bool2 = Boolean.TRUE;
        f54650h0 = F("measurement.collection.log_event_and_bundle_v2", bool2, new P0());
        f54652i0 = a("measurement.quality.checksum", bool);
        f54654j0 = F("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new O0());
        f54656k0 = F("measurement.audience.refresh_event_count_filters_timestamp", bool, new R0());
        f54658l0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new S0());
        f54660m0 = F("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new V0());
        f54662n0 = F("measurement.integration.disable_firebase_instance_id", bool, new U0());
        f54664o0 = F("measurement.collection.service.update_with_analytics_fix", bool, new X0());
        f54668q0 = F("measurement.service.store_null_safelist", bool2, new Z0());
        f54670r0 = F("measurement.service.store_safelist", bool2, new Y0());
        f54672s0 = F("measurement.session_stitching_token_enabled", bool, new C4585c1());
        f54674t0 = b("measurement.sgtm.service", bool2, new C4571a1());
        f54676u0 = b("measurement.sgtm.preview_mode_enabled", bool2, new C4592d1());
        F("measurement.sgtm.upload_queue", bool, new C4627i1());
        F("measurement.sgtm.google_signal.enable", bool, new C4620h1());
        f54680w0 = F("measurement.gmscore_feature_tracking", bool2, new C4641k1());
        f54682x0 = b("measurement.fix_health_monitor_stack_trace", bool2, new C4634j1());
        f54684y0 = b("measurement.item_scoped_custom_parameters.client", bool2, new C4655m1());
        f54686z0 = F("measurement.item_scoped_custom_parameters.service", bool2, new C4648l1());
        f54584A0 = b("measurement.rb.attribution.service", bool2, new C4668o1());
        f54586B0 = b("measurement.rb.attribution.client2", bool2, new C4680q1());
        f54588C0 = F("measurement.rb.attribution.uuid_generation", bool2, new C4674p1());
        f54590D0 = F("measurement.rb.attribution.enable_trigger_redaction", bool2, new C4685r1());
        F("measurement.rb.attribution.followup1.service", bool, new C4703u1());
        f54592E0 = F("measurement.rb.attribution.registration_regardless_consent", bool, new C4697t1());
        f54594F0 = F("measurement.rb.attribution.ad_campaign_info", bool, new C4715w1());
        f54596G0 = b("measurement.rb.attribution.improved_retry", bool2, new C4709v1());
        f54598H0 = F("measurement.client.sessions.enable_fix_background_engagement", bool, new C4727y1());
        f54600I0 = F("measurement.client.sessions.enable_pause_engagement_in_background", bool2, new C4721x1());
        f54602J0 = F("measurement.dma_consent.service_dcu_event2", bool2, new C4733z1());
        f54604K0 = F("measurement.dma_consent.services_database_update_fix", bool2, new D1());
        f54606L0 = b("measurement.service.deferred_first_open", bool2, new B1());
        f54608M0 = b("measurement.gbraid_campaign.gbraid.client.dev", bool, new E1());
        f54610N0 = b("measurement.gbraid_campaign.gbraid.service", bool, new H1());
        f54612O0 = b("measurement.increase_param_lengths", bool2, new G1());
        f54614P0 = F("measurement.disable_npa_for_dasher_and_unicorn", bool2, new J1());
        f54616Q0 = b("measurement.consent_regional_defaults.service", bool, new I1());
        f54618R0 = b("measurement.consent_regional_defaults.client2", bool, new L1());
        f54620S0 = F("measurement.service.consent.pfo_on_fx", bool2, new H());
        f54622T0 = F("measurement.service.consent.params_on_fx", bool2, new K());
        f54624U0 = F("measurement.service.consent.app_start_fix", bool2, new J());
        f54626V0 = b("measurement.consent.stop_reset_on_storage_denied.client", bool2, new M());
        f54628W0 = b("measurement.consent.stop_reset_on_storage_denied.service", bool2, new W());
        f54630X0 = F("measurement.consent.scrub_audience_data_analytics_consent", bool2, new C4640k0());
        f54632Y0 = F("measurement.consent.fix_first_open_count_from_snapshot", bool2, new C4696t0());
        f54634Z0 = F("measurement.fix_engagement_on_reset_analytics_data", bool2, new H0());
    }

    private static M1 F(String str, Object obj, K1 k12) {
        return c(str, obj, obj, k12, false);
    }

    private static M1 a(String str, Object obj) {
        return c(str, obj, obj, (K1) null, false);
    }

    private static M1 b(String str, Object obj, K1 k12) {
        return c(str, obj, obj, k12, true);
    }

    private static M1 c(String str, Object obj, Object obj2, K1 k12, boolean z10) {
        M1 m12 = new M1(str, obj, obj2, k12, z10);
        if (z10) {
            f54635a.add(m12);
        }
        return m12;
    }

    public static Map e(Context context) {
        zzgk zza = zzgk.zza(context.getContentResolver(), zzgw.zza("com.google.android.gms.measurement"), new C4381d());
        if (zza == null) {
            return Collections.emptyMap();
        }
        return zza.zza();
    }
}
