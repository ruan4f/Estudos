package com.example.ruan.exemplovimeo;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

import com.example.ruan.exemplovimeo.vimeonetworking.AndroidGsonDeserializer;
import com.example.ruan.exemplovimeo.vimeonetworking.NetworkingLogger;
import com.example.ruan.exemplovimeo.vimeonetworking.TestAccountStore;
import com.vimeo.networking.Configuration;
import com.vimeo.networking.Vimeo;
import com.vimeo.networking.VimeoClient;

/**
 * Created by Ruan on 21/03/2017.
 */

public class TestApp extends Application {

    private static final String SCOPE = "private public interact";

    private static final boolean IS_DEBUG_BUILD = false;
    // Switch to true to see how access token auth works.
    private static final boolean ACCESS_TOKEN_PROVIDED = true;

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();

        sContext = this;
        AccountPreferenceManager.initializeInstance(sContext);

        // <editor-fold desc="Vimeo API Library Initialization">
        Configuration.Builder configBuilder;
        // This check is just as for the example. In practice, you'd use one technique or the other.
        if (ACCESS_TOKEN_PROVIDED) {
            configBuilder = getAccessTokenBuilder();
        } else {
            configBuilder = getClientIdAndClientSecretBuilder();
        }
        if (IS_DEBUG_BUILD) {
            // Disable cert pinning if debugging (so we can intercept packets)
            configBuilder.enableCertPinning(false);
            configBuilder.setLogLevel(Vimeo.LogLevel.VERBOSE);
        }
        VimeoClient.initialize(configBuilder.build());
        // </editor-fold>
    }

    public Configuration.Builder getAccessTokenBuilder() {
        // The values file is left out of git, so you'll have to provide your own access token
        String accessToken = getString(R.string.access_token);
        return new Configuration.Builder(accessToken);
    }

    public Configuration.Builder getClientIdAndClientSecretBuilder() {
        // The values file is left out of git, so you'll have to provide your own id and secret
        String clientId = getString(R.string.client_id);
        String clientSecret = getString(R.string.client_secret);
        String codeGrantRedirectUri = getString(R.string.deeplink_redirect_scheme) + "://" + getString(R.string.deeplink_redirect_host);
        TestAccountStore testAccountStore = new TestAccountStore(this.getApplicationContext());
        Configuration.Builder configBuilder =
                new Configuration.Builder(clientId, clientSecret, SCOPE, testAccountStore,
                        new AndroidGsonDeserializer());
        configBuilder.setCacheDirectory(this.getCacheDir())
                .setUserAgentString(getUserAgentString(this)).setDebugLogger(new NetworkingLogger())
                // Used for oauth flow
                .setCodeGrantRedirectUri(codeGrantRedirectUri);

        return configBuilder;
    }

    public static Context getAppContext() {
        return sContext;
    }

    public static String getUserAgentString(Context context) {
        String packageName = context.getPackageName();

        String version = "unknown";
        try {
            PackageInfo pInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            version = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            System.out.println("Unable to get packageInfo: " + e.getMessage());
        }

        String deviceManufacturer = Build.MANUFACTURER;
        String deviceModel = Build.MODEL;
        String deviceBrand = Build.BRAND;

        String versionString = Build.VERSION.RELEASE;
        String versionSDKString = String.valueOf(Build.VERSION.SDK_INT);

        return packageName + " (" + deviceManufacturer + ", " + deviceModel + ", " + deviceBrand +
                ", " + "Android " + versionString + "/" + versionSDKString + " Version " + version +
                ")";
    }
}
