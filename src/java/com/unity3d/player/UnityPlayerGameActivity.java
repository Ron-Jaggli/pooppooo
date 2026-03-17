package com.unity3d.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.androidgamesdk.GameActivity;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class UnityPlayerGameActivity extends GameActivity implements IUnityPlayerLifecycleEvents, IUnityPermissionRequestSupport, IUnityPlayerSupport {
    protected UnityPlayerForGameActivity mUnityPlayer;

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    protected String updateUnityCommandLineArguments(String str) {
        return str;
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
     */
    class GameActivitySurfaceView extends GameActivity.InputEnabledSurfaceView {
        GameActivity mGameActivity;

        public GameActivitySurfaceView(GameActivity gameActivity) {
            super(UnityPlayerGameActivity.this, gameActivity);
            this.mGameActivity = gameActivity;
        }

        public boolean onCapturedPointerEvent(MotionEvent motionEvent) {
            return this.mGameActivity.onTouchEvent(motionEvent);
        }
    }

    static {
        System.loadLibrary("game");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.unity3d.player.IUnityPlayerSupport
    public UnityPlayerForGameActivity getUnityPlayerConnection() {
        return this.mUnityPlayer;
    }

    private void applyInsetListener(final SurfaceView surfaceView) {
        surfaceView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.unity3d.player.UnityPlayerGameActivity$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f$0.m367lambda$applyInsetListener$0$comunity3dplayerUnityPlayerGameActivity(surfaceView);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$applyInsetListener$0$com-unity3d-player-UnityPlayerGameActivity, reason: not valid java name */
    /* synthetic */ void m367lambda$applyInsetListener$0$comunity3dplayerUnityPlayerGameActivity(SurfaceView surfaceView) {
        onApplyWindowInsets(surfaceView, ViewCompat.getRootWindowInsets(getWindow().getDecorView()));
    }

    protected GameActivity.InputEnabledSurfaceView createSurfaceView() {
        return new GameActivitySurfaceView(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreateSurfaceView() {
        super.onCreateSurfaceView();
        FrameLayout frameLayout = (FrameLayout) findViewById(this.contentViewId);
        applyInsetListener(this.mSurfaceView);
        this.mSurfaceView.setId(UnityPlayerForGameActivity.getUnityViewIdentifier(this));
        getIntent().putExtra("unity", updateUnityCommandLineArguments(getIntent().getStringExtra("unity")));
        this.mUnityPlayer = new UnityPlayerForGameActivity(this, frameLayout, this.mSurfaceView, this);
    }

    protected void onDestroy() {
        this.mUnityPlayer.destroy();
        super.onDestroy();
    }

    protected void onStop() {
        this.mUnityPlayer.onStop();
        super.onStop();
    }

    protected void onStart() {
        this.mUnityPlayer.onStart();
        super.onStart();
    }

    protected void onPause() {
        this.mUnityPlayer.onPause();
        super.onPause();
    }

    protected void onResume() {
        this.mUnityPlayer.onResume();
        super.onResume();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mUnityPlayer.configurationChanged(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onWindowFocusChanged(boolean z) {
        this.mUnityPlayer.windowFocusChanged(z);
        super.onWindowFocusChanged(z);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.mUnityPlayer.newIntent(intent);
    }

    @Override // com.unity3d.player.IUnityPermissionRequestSupport
    public void requestPermissions(PermissionRequest permissionRequest) {
        this.mUnityPlayer.addPermissionRequest(permissionRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.mUnityPlayer.permissionResponse(this, i, strArr, iArr);
    }
}
